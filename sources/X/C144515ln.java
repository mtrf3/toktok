package X;

import android.graphics.Rect;
import kotlin.jvm.internal.o;

/* renamed from: X.5ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144515ln {
    public final String LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public Rect LIZLLL;
    public final Rect LJ;
    public final int LJFF;
    public final C08630Vn<Boolean> LJI;

    public C144515ln() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C144515ln)) {
            return false;
        }
        C144515ln c144515ln = (C144515ln) obj;
        return o.LJ(this.LIZ, c144515ln.LIZ) && Float.compare(this.LIZIZ, c144515ln.LIZIZ) == 0 && Float.compare(this.LIZJ, c144515ln.LIZJ) == 0 && o.LJ(this.LIZLLL, c144515ln.LIZLLL) && o.LJ(this.LJ, c144515ln.LJ) && this.LJFF == c144515ln.LJFF && o.LJ(this.LJI, c144515ln.LJI);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoCropViewStates(text=");
        LIZ.append(this.LIZ);
        LIZ.append(", initializeInCropPage=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", initializeTransformY=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cropArea=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", editRect=");
        LIZ.append(this.LJ);
        LIZ.append(", currentRatioMode=");
        LIZ.append(this.LJFF);
        LIZ.append(", refreshView=");
        LIZ.append(this.LJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int LIZIZ = C47959Irz.LIZIZ(this.LIZJ, C47959Irz.LIZIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31), 31);
        Rect rect = this.LIZLLL;
        int i = 0;
        if (rect == null) {
            hashCode = 0;
        } else {
            hashCode = rect.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        Rect rect2 = this.LJ;
        if (rect2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rect2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.LJFF) * 31;
        C08630Vn<Boolean> c08630Vn = this.LJI;
        if (c08630Vn != null) {
            i = c08630Vn.hashCode();
        }
        return i3 + i;
    }

    public /* synthetic */ C144515ln(int i) {
        this("", 1.0f, 0.0f, null, null, 1, null);
    }

    public static C144515ln LIZ(C144515ln c144515ln, float f, float f2, int i, C08630Vn c08630Vn, int i2) {
        String text;
        Rect rect;
        C08630Vn c08630Vn2 = c08630Vn;
        int i3 = i;
        float f3 = f;
        float f4 = f2;
        Rect rect2 = null;
        if ((i2 & 1) != 0) {
            text = c144515ln.LIZ;
        } else {
            text = null;
        }
        if ((i2 & 2) != 0) {
            f3 = c144515ln.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            f4 = c144515ln.LIZJ;
        }
        if ((i2 & 8) != 0) {
            rect = c144515ln.LIZLLL;
        } else {
            rect = null;
        }
        if ((i2 & 16) != 0) {
            rect2 = c144515ln.LJ;
        }
        if ((i2 & 32) != 0) {
            i3 = c144515ln.LJFF;
        }
        if ((i2 & 64) != 0) {
            c08630Vn2 = c144515ln.LJI;
        }
        c144515ln.getClass();
        o.LJIIIZ(text, "text");
        return new C144515ln(text, f3, f4, rect, rect2, i3, c08630Vn2);
    }

    public C144515ln(String text, float f, float f2, Rect rect, Rect rect2, int i, C08630Vn<Boolean> c08630Vn) {
        o.LJIIIZ(text, "text");
        this.LIZ = text;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = rect;
        this.LJ = rect2;
        this.LJFF = i;
        this.LJI = c08630Vn;
    }
}
