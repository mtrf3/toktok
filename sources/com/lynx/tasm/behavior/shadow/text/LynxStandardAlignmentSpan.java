package com.lynx.tasm.behavior.shadow.text;

import android.text.Layout;
import android.text.style.AlignmentSpan;

/* loaded from: classes11.dex */
public class LynxStandardAlignmentSpan extends AlignmentSpan.Standard {
    public final int hashCode() {
        int hashCode;
        int spanTypeId = getSpanTypeId() * 31;
        if (getAlignment() == null) {
            hashCode = 0;
        } else {
            hashCode = getAlignment().hashCode();
        }
        return spanTypeId + hashCode;
    }

    public LynxStandardAlignmentSpan(Layout.Alignment alignment) {
        super(alignment);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlignmentSpan.Standard standard = (AlignmentSpan.Standard) obj;
        if (getAlignment() == standard.getAlignment() && getSpanTypeId() == standard.getSpanTypeId()) {
            return true;
        }
        return false;
    }
}
