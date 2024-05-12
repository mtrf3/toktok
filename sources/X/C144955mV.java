package X;

import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* renamed from: X.5mV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144955mV {
    public final String LIZ;
    public final OSZ<Rect, Boolean> LIZIZ;
    public final Rect LIZJ;
    public final OSZ<Boolean, Float> LIZLLL;
    public OSZ<Boolean, Boolean> LJ;

    public C144955mV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C144955mV)) {
            return false;
        }
        C144955mV c144955mV = (C144955mV) obj;
        return o.LJ(this.LIZ, c144955mV.LIZ) && o.LJ(this.LIZIZ, c144955mV.LIZIZ) && o.LJ(this.LIZJ, c144955mV.LIZJ) && o.LJ(this.LIZLLL, c144955mV.LIZLLL) && o.LJ(this.LJ, c144955mV.LJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        OSZ<Rect, Boolean> osz = this.LIZIZ;
        int hashCode2 = (hashCode + (osz == null ? 0 : osz.hashCode())) * 31;
        Rect rect = this.LIZJ;
        int hashCode3 = (hashCode2 + (rect == null ? 0 : rect.hashCode())) * 31;
        OSZ<Boolean, Float> osz2 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (osz2 == null ? 0 : osz2.hashCode())) * 31;
        OSZ<Boolean, Boolean> osz3 = this.LJ;
        return hashCode4 + (osz3 != null ? osz3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Video2StickerPreviewMaskState(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", editRect=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cropRect=");
        LIZ.append(this.LIZJ);
        LIZ.append(", onCropAnimValue=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showOrHide=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C144955mV(int i) {
        this("", null, null, null, null);
    }

    public C144955mV(String text, OSZ<Rect, Boolean> osz, Rect rect, OSZ<Boolean, Float> osz2, OSZ<Boolean, Boolean> osz3) {
        o.LJIIIZ(text, "text");
        this.LIZ = text;
        this.LIZIZ = osz;
        this.LIZJ = rect;
        this.LIZLLL = osz2;
        this.LJ = osz3;
    }

    public static C144955mV LIZ(C144955mV c144955mV, OSZ osz, Rect rect, OSZ osz2, OSZ osz3, int i) {
        String text;
        OSZ osz4 = osz3;
        OSZ osz5 = osz2;
        OSZ osz6 = osz;
        Rect rect2 = rect;
        if ((i & 1) != 0) {
            text = c144955mV.LIZ;
        } else {
            text = null;
        }
        if ((i & 2) != 0) {
            osz6 = c144955mV.LIZIZ;
        }
        if ((i & 4) != 0) {
            rect2 = c144955mV.LIZJ;
        }
        if ((i & 8) != 0) {
            osz5 = c144955mV.LIZLLL;
        }
        if ((i & 16) != 0) {
            osz4 = c144955mV.LJ;
        }
        c144955mV.getClass();
        o.LJIIIZ(text, "text");
        return new C144955mV(text, osz6, rect2, osz5, osz4);
    }
}
