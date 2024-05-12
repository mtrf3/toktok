package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* renamed from: X.UFj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76883UFj {
    public final FragmentManager LIZ;
    public final EnumC76880UFg LIZIZ;
    public final UG0 LIZJ;
    public final int LIZLLL;
    public final java.util.Map<String, Object> LJ;
    public final C76878UFe LJFF;
    public final boolean LJI;
    public final Bitmap LJII;
    public final android.net.Uri LJIIIIZZ;
    public final String LJIIIZ;
    public final C76881UFh LJIIJ;
    public final AbstractC38911fr LJIIJJI;

    public C76883UFj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76883UFj)) {
            return false;
        }
        C76883UFj c76883UFj = (C76883UFj) obj;
        return o.LJ(this.LIZ, c76883UFj.LIZ) && this.LIZIZ == c76883UFj.LIZIZ && this.LIZJ == c76883UFj.LIZJ && this.LIZLLL == c76883UFj.LIZLLL && o.LJ(this.LJ, c76883UFj.LJ) && o.LJ(this.LJFF, c76883UFj.LJFF) && this.LJI == c76883UFj.LJI && o.LJ(this.LJII, c76883UFj.LJII) && o.LJ(this.LJIIIIZZ, c76883UFj.LJIIIIZZ) && o.LJ(this.LJIIIZ, c76883UFj.LJIIIZ) && o.LJ(this.LJIIJ, c76883UFj.LJIIJ) && o.LJ(this.LJIIJJI, c76883UFj.LJIIJJI);
    }

    public final String toString() {
        return "EmoteEditParams(fragmentManager=" + this.LIZ + ", imageCropType=" + this.LIZIZ + ", emoteEditType=" + this.LIZJ + ", emotesShowStyle=" + this.LIZLLL + ", logInfo=" + this.LJ + ", imageParams=" + this.LJFF + ", canDelete=" + this.LJI + ", imageBitmap=" + this.LJII + ", imageUri=" + this.LJIIIIZZ + ", imageUrl=" + this.LJIIIZ + ", lastFinishParams=" + this.LJIIJ + ", listener=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.LJFF.hashCode() + C12400eC.LIZ(this.LJ, (((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31) + this.LIZLLL) * 31, 31)) * 31;
        boolean z = this.LJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        Bitmap bitmap = this.LJII;
        int i3 = 0;
        if (bitmap == null) {
            hashCode = 0;
        } else {
            hashCode = bitmap.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        android.net.Uri uri = this.LJIIIIZZ;
        if (uri == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uri.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        String str = this.LJIIIZ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        C76881UFh c76881UFh = this.LJIIJ;
        if (c76881UFh == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c76881UFh.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        AbstractC38911fr abstractC38911fr = this.LJIIJJI;
        if (abstractC38911fr != null) {
            i3 = abstractC38911fr.hashCode();
        }
        return i7 + i3;
    }

    public C76883UFj(FragmentManager fragmentManager, EnumC76880UFg imageCropType, UG0 emoteEditType, int i, java.util.Map map, C76878UFe imageParams, boolean z, Bitmap bitmap, android.net.Uri uri, C76881UFh c76881UFh, AbstractC38911fr abstractC38911fr, int i2) {
        z = (i2 & 64) != 0 ? false : z;
        bitmap = (i2 & 128) != 0 ? null : bitmap;
        uri = (i2 & 256) != 0 ? null : uri;
        c76881UFh = (i2 & 1024) != 0 ? null : c76881UFh;
        abstractC38911fr = (i2 & 2048) != 0 ? null : abstractC38911fr;
        o.LJIIIZ(imageCropType, "imageCropType");
        o.LJIIIZ(emoteEditType, "emoteEditType");
        o.LJIIIZ(imageParams, "imageParams");
        this.LIZ = fragmentManager;
        this.LIZIZ = imageCropType;
        this.LIZJ = emoteEditType;
        this.LIZLLL = i;
        this.LJ = map;
        this.LJFF = imageParams;
        this.LJI = z;
        this.LJII = bitmap;
        this.LJIIIIZZ = uri;
        this.LJIIIZ = null;
        this.LJIIJ = c76881UFh;
        this.LJIIJJI = abstractC38911fr;
    }
}
