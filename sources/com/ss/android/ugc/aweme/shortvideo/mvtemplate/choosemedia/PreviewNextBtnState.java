package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C48339Iy7;
import X.InterfaceC61312at;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PreviewNextBtnState implements InterfaceC61312at {
    public final boolean isClickable;
    public final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewNextBtnState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PreviewNextBtnState copy$default(PreviewNextBtnState previewNextBtnState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previewNextBtnState.text;
        }
        if ((i & 2) != 0) {
            z = previewNextBtnState.isClickable;
        }
        return previewNextBtnState.copy(str, z);
    }

    public final PreviewNextBtnState copy(String str, boolean z) {
        return new PreviewNextBtnState(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewNextBtnState)) {
            return false;
        }
        PreviewNextBtnState previewNextBtnState = (PreviewNextBtnState) obj;
        return o.LJ(this.text, previewNextBtnState.text) && this.isClickable == previewNextBtnState.isClickable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isClickable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewNextBtnState(text=");
        LIZ.append(this.text);
        LIZ.append(", isClickable=");
        return C48339Iy7.LIZJ(LIZ, this.isClickable, ')', LIZ);
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isClickable() {
        return this.isClickable;
    }

    public PreviewNextBtnState(String str, boolean z) {
        this.text = str;
        this.isClickable = z;
    }

    public /* synthetic */ PreviewNextBtnState(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}
