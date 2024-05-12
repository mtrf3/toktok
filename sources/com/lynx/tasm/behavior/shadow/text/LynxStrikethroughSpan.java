package com.lynx.tasm.behavior.shadow.text;

import android.text.style.StrikethroughSpan;

/* loaded from: classes13.dex */
public class LynxStrikethroughSpan extends StrikethroughSpan {
    public final int hashCode() {
        return getSpanTypeId() * 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getSpanTypeId() == ((StrikethroughSpan) obj).getSpanTypeId()) {
            return true;
        }
        return false;
    }
}
