package X;

import android.graphics.Paint;
import android.text.Layout;
import kotlin.jvm.internal.o;

/* renamed from: X.0XR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XR {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Layout LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Paint.FontMetricsInt LJIIJ;
    public final int LJIIJJI;
    public final C10510b9[] LJIIL;
    public final C0XQ LJIILIIL;
    public final C5H3 LJIILJJIL;

    public final int LIZ() {
        int height;
        if (this.LIZJ) {
            height = this.LIZLLL.getLineBottom(this.LJ - 1);
        } else {
            height = this.LIZLLL.getHeight();
        }
        return height + this.LJFF + this.LJI + this.LJIIJJI;
    }

    public final CharSequence LJII() {
        CharSequence text = this.LIZLLL.getText();
        o.LJIIIIZZ(text, "layout.text");
        return text;
    }

    public final float LIZIZ(int i) {
        float lineBaseline;
        float f = this.LJFF;
        if (i == this.LJ - 1 && this.LJIIJ != null) {
            lineBaseline = LJ(i) - this.LJIIJ.ascent;
        } else {
            lineBaseline = this.LIZLLL.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float LIZJ(int i) {
        int i2;
        if (i == this.LJ - 1 && this.LJIIJ != null) {
            return this.LIZLLL.getLineBottom(i - 1) + this.LJIIJ.bottom;
        }
        float lineBottom = this.LJFF + this.LIZLLL.getLineBottom(i);
        if (i == this.LJ - 1) {
            i2 = this.LJI;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int LIZLLL(int i) {
        return this.LIZLLL.getLineForOffset(i);
    }

    public final float LJ(int i) {
        int i2;
        float lineTop = this.LIZLLL.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.LJFF;
        }
        return lineTop + i2;
    }

    public final float LJFF(int i, boolean z) {
        float f;
        float LIZ = ((C0XH) this.LJIILJJIL.getValue()).LIZ(i, true, z);
        if (LIZLLL(i) == this.LJ - 1) {
            f = this.LJII + this.LJIIIIZZ;
        } else {
            f = 0.0f;
        }
        return f + LIZ;
    }

    public final float LJI(int i, boolean z) {
        float f;
        float LIZ = ((C0XH) this.LJIILJJIL.getValue()).LIZ(i, false, z);
        if (LIZLLL(i) == this.LJ - 1) {
            f = this.LJII + this.LJIIIIZZ;
        } else {
            f = 0.0f;
        }
        return f + LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ba, code lost:
    
        if (X.C0XL.LIZ.LIZ((android.text.StaticLayout) r7, true) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0XR(java.lang.CharSequence r36, float r37, X.C17650mf r38, int r39, android.text.TextUtils.TruncateAt r40, int r41, boolean r42, int r43, int r44, int r45, int r46, int r47, int r48, X.C0XI r49) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XR.<init>(java.lang.CharSequence, float, X.0mf, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, X.0XI):void");
    }
}
