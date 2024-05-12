package X;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.0XO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XO {
    public final CharSequence LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final TextPaint LIZLLL;
    public final int LJ;
    public final TextDirectionHeuristic LJFF;
    public final Layout.Alignment LJI;
    public final int LJII;
    public final TextUtils.TruncateAt LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final int LJIIL;
    public final boolean LJIILIIL;
    public final int LJIILJJIL;
    public final int[] LJIILL;
    public final int[] LJIILLIIL;

    public C0XO(CharSequence text, int i, int i2, C17650mf paint, int i3, TextDirectionHeuristic textDir, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int[] iArr, int[] iArr2) {
        boolean z3;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(paint, "paint");
        o.LJIIIZ(textDir, "textDir");
        o.LJIIIZ(alignment, "alignment");
        this.LIZ = text;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = paint;
        this.LJ = i3;
        this.LJFF = textDir;
        this.LJI = alignment;
        this.LJII = i4;
        this.LJIIIIZZ = truncateAt;
        this.LJIIIZ = i5;
        this.LJIIJ = f;
        this.LJIIJJI = f2;
        this.LJIIL = i6;
        this.LJIILIIL = z;
        this.LJIILJJIL = i7;
        this.LJIILL = iArr;
        this.LJIILLIIL = iArr2;
        if (i >= 0 && i <= i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            int length = text.length();
            if (i2 >= 0 && i2 <= length) {
                if (i4 >= 0) {
                    if (i3 >= 0) {
                        if (i5 >= 0) {
                            if (f >= 0.0f) {
                                return;
                            }
                            "Failed requirement.".toString();
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        "Failed requirement.".toString();
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }
}
