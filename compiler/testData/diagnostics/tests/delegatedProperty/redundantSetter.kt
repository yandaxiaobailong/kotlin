// !DIAGNOSTICS: -UNUSED_PARAMETER

var a: Int by Delegate()
  <!ACCESSOR_FOR_DELEGATED_PROPERTY!>get() = 1<!>
  <!ACCESSOR_FOR_DELEGATED_PROPERTY!>set(i) {}<!>

class Delegate {
  operator fun getValue(t: Any?, p: PropertyMetadata): Int {
    return 1
  }

  operator fun setValue(t: Any?, p: PropertyMetadata, i: Int) {}
}
