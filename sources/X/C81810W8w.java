package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;

/* renamed from: X.W8w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81810W8w {
    public static final C81810W8w LJIILIIL = new C81810W8w(new ImageDecodeOptionsBuilder());
    public final int LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public Bitmap.Config LJII;
    public final InterfaceC81842WAc LJIIIIZZ;
    public final Object LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final Rect LJIIL;

    public final int hashCode() {
        int i;
        int i2;
        int ordinal = (this.LJII.ordinal() + (((((((((((this.LIZ * 31) + (this.LIZIZ ? 1 : 0)) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.LJ ? 1 : 0)) * 31) + (this.LJFF ? 1 : 0)) * 31) + (this.LJI ? 1 : 0)) * 31)) * 31;
        InterfaceC81842WAc interfaceC81842WAc = this.LJIIIIZZ;
        int i3 = 0;
        if (interfaceC81842WAc != null) {
            i = interfaceC81842WAc.hashCode();
        } else {
            i = 0;
        }
        int i4 = (ordinal + i) * 31 * 31;
        Object obj = this.LJIIIZ;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (((((i4 + i2) * 31) + (this.LJIIJ ? 1 : 0)) * 31) + (this.LJIIJJI ? 1 : 0)) * 31;
        Rect rect = this.LJIIL;
        if (rect != null) {
            i3 = rect.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return C16880lQ.LLLZI(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s-%s-%b-%b-%s", new Object[]{Integer.valueOf(this.LIZ), Boolean.valueOf(this.LIZIZ), Boolean.valueOf(this.LIZLLL), Boolean.valueOf(this.LJ), Boolean.valueOf(this.LJFF), Boolean.valueOf(this.LJI), this.LJII.name(), this.LJIIIIZZ, null, this.LJIIIZ, Boolean.valueOf(this.LJIIJ), Boolean.valueOf(this.LJIIJJI), this.LJIIL});
    }

    public C81810W8w(ImageDecodeOptionsBuilder imageDecodeOptionsBuilder) {
        this.LIZ = imageDecodeOptionsBuilder.LIZ;
        this.LIZIZ = imageDecodeOptionsBuilder.LIZIZ;
        this.LIZJ = imageDecodeOptionsBuilder.LIZJ;
        this.LIZLLL = imageDecodeOptionsBuilder.LIZLLL;
        this.LJ = imageDecodeOptionsBuilder.LJ;
        this.LJFF = imageDecodeOptionsBuilder.LJFF;
        this.LJII = imageDecodeOptionsBuilder.LJII;
        this.LJIIIIZZ = imageDecodeOptionsBuilder.LJIIIIZZ;
        this.LJI = imageDecodeOptionsBuilder.LJI;
        this.LJIIIZ = imageDecodeOptionsBuilder.LJIIIZ;
        this.LJIIJ = imageDecodeOptionsBuilder.LJIIJ;
        this.LJIIJJI = imageDecodeOptionsBuilder.LJIIJJI;
        this.LJIIL = imageDecodeOptionsBuilder.LJIIL;
    }

    public final boolean equals(Object obj) {
        Rect rect;
        if (this == obj) {
            return true;
        }
        if (obj == null || C81810W8w.class != obj.getClass()) {
            return false;
        }
        C81810W8w c81810W8w = (C81810W8w) obj;
        if (this.LIZIZ != c81810W8w.LIZIZ || this.LIZLLL != c81810W8w.LIZLLL || this.LJ != c81810W8w.LJ || this.LJFF != c81810W8w.LJFF || this.LJI != c81810W8w.LJI || this.LJII != c81810W8w.LJII || this.LJIIIIZZ != c81810W8w.LJIIIIZZ || this.LJIIIZ != c81810W8w.LJIIIZ || this.LJIIJ != c81810W8w.LJIIJ || this.LJIIJJI != c81810W8w.LJIIJJI) {
            return false;
        }
        Rect rect2 = this.LJIIL;
        if ((rect2 == null || rect2.equals(c81810W8w.LJIIL)) && ((rect = c81810W8w.LJIIL) == null || rect.equals(this.LJIIL))) {
            return true;
        }
        return false;
    }
}
