package com.lynx.tasm.behavior.shadow.text;

/* loaded from: classes14.dex */
public class AbsoluteSizeSpan extends android.text.style.AbsoluteSizeSpan {
    public AbsoluteSizeSpan() {
        super(15, true);
    }

    public final int hashCode() {
        return getSize() + ((getDip() ? 1 : 0) * 31);
    }

    public AbsoluteSizeSpan(int i) {
        super(i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbsoluteSizeSpan)) {
            return false;
        }
        android.text.style.AbsoluteSizeSpan absoluteSizeSpan = (android.text.style.AbsoluteSizeSpan) obj;
        if (absoluteSizeSpan.getDip() != getDip() || absoluteSizeSpan.getSize() != getSize()) {
            return false;
        }
        return true;
    }
}
