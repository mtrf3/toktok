package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import kotlin.jvm.internal.o;

/* renamed from: X.59j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1302759j {
    public final String LIZ;
    public final int LIZIZ;
    public final Drawable LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final RectF LJIIJ;
    public final TextPaint LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1302759j)) {
            return false;
        }
        C1302759j c1302759j = (C1302759j) obj;
        return o.LJ(this.LIZ, c1302759j.LIZ) && this.LIZIZ == c1302759j.LIZIZ && o.LJ(this.LIZJ, c1302759j.LIZJ) && Float.compare(this.LIZLLL, c1302759j.LIZLLL) == 0 && Float.compare(this.LJ, c1302759j.LJ) == 0 && this.LJFF == c1302759j.LJFF && Float.compare(this.LJI, c1302759j.LJI) == 0 && Float.compare(this.LJII, c1302759j.LJII) == 0 && Float.compare(this.LJIIIIZZ, c1302759j.LJIIIIZZ) == 0 && Float.compare(this.LJIIIZ, c1302759j.LJIIIZ) == 0 && o.LJ(this.LJIIJ, c1302759j.LJIIJ) && o.LJ(this.LJIIJJI, c1302759j.LJIIJJI);
    }

    public final String toString() {
        return "RecordLabelData(name=" + this.LIZ + ", nameColor=" + this.LIZIZ + ", icon=" + this.LIZJ + ", iconPadding=" + this.LIZLLL + ", iconWidth=" + this.LJ + ", background=" + this.LJFF + ", width=" + this.LJI + ", height=" + this.LJII + ", padding=" + this.LJIIIIZZ + ", radius=" + this.LJIIIZ + ", rectF=" + this.LJIIJ + ", textPaint=" + this.LJIIJJI + ')';
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        Drawable drawable = this.LIZJ;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return this.LJIIJJI.hashCode() + ((this.LJIIJ.hashCode() + C47959Irz.LIZIZ(this.LJIIIZ, C47959Irz.LIZIZ(this.LJIIIIZZ, C47959Irz.LIZIZ(this.LJII, C47959Irz.LIZIZ(this.LJI, (C47959Irz.LIZIZ(this.LJ, C47959Irz.LIZIZ(this.LIZLLL, (hashCode2 + hashCode) * 31, 31), 31) + this.LJFF) * 31, 31), 31), 31), 31)) * 31);
    }

    public C1302759j(String str, int i, Drawable drawable, float f, float f2, int i2, float f3, float f4, float f5, float f6, RectF rectF, TextPaint textPaint) {
        o.LJIIIZ(textPaint, "textPaint");
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = drawable;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = i2;
        this.LJI = f3;
        this.LJII = f4;
        this.LJIIIIZZ = f5;
        this.LJIIIZ = f6;
        this.LJIIJ = rectF;
        this.LJIIJJI = textPaint;
    }
}
