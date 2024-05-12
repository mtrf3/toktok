package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W3V {
    public final List<W3N> LIZ;
    public final UrlModel LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C08630Vn<C76800UCe> LJFF;
    public final C08630Vn<Integer> LJI;
    public final C08630Vn<C76800UCe> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W3V)) {
            return false;
        }
        W3V w3v = (W3V) obj;
        return o.LJ(this.LIZ, w3v.LIZ) && o.LJ(this.LIZIZ, w3v.LIZIZ) && this.LIZJ == w3v.LIZJ && this.LIZLLL == w3v.LIZLLL && this.LJ == w3v.LJ && o.LJ(this.LJFF, w3v.LJFF) && o.LJ(this.LJI, w3v.LJI) && o.LJ(this.LJII, w3v.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        UrlModel urlModel = this.LIZIZ;
        int hashCode2 = (hashCode + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LIZLLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LJ ? 1 : 0)) * 31;
        C08630Vn<C76800UCe> c08630Vn = this.LJFF;
        int hashCode3 = (i4 + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31;
        C08630Vn<Integer> c08630Vn2 = this.LJI;
        int hashCode4 = (hashCode3 + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31;
        C08630Vn<C76800UCe> c08630Vn3 = this.LJII;
        return hashCode4 + (c08630Vn3 != null ? c08630Vn3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowSimpleToolbarStatus(list=");
        LIZ.append(this.LIZ);
        LIZ.append(", changeMusicCover=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", flashOn=");
        LIZ.append(this.LIZJ);
        LIZ.append(", beautyOn=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", aiCaptionOn=");
        LIZ.append(this.LJ);
        LIZ.append(", modifyDisplayView=");
        LIZ.append(this.LJFF);
        LIZ.append(", removeItem=");
        LIZ.append(this.LJI);
        LIZ.append(", onAICaptionPromote=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public W3V(List<W3N> list, UrlModel urlModel, boolean z, boolean z2, boolean z3, C08630Vn<C76800UCe> c08630Vn, C08630Vn<Integer> c08630Vn2, C08630Vn<C76800UCe> c08630Vn3) {
        o.LJIIIZ(list, "list");
        this.LIZ = list;
        this.LIZIZ = urlModel;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = c08630Vn;
        this.LJI = c08630Vn2;
        this.LJII = c08630Vn3;
    }

    public static W3V LIZ(W3V w3v, UrlModel urlModel, boolean z, boolean z2, boolean z3, C08630Vn c08630Vn, C08630Vn c08630Vn2, C08630Vn c08630Vn3, int i) {
        List<W3N> list;
        C08630Vn c08630Vn4 = c08630Vn3;
        boolean z4 = z;
        UrlModel urlModel2 = urlModel;
        boolean z5 = z2;
        boolean z6 = z3;
        C08630Vn c08630Vn5 = c08630Vn;
        C08630Vn c08630Vn6 = c08630Vn2;
        if ((i & 1) != 0) {
            list = w3v.LIZ;
        } else {
            list = null;
        }
        if ((i & 2) != 0) {
            urlModel2 = w3v.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = w3v.LIZJ;
        }
        if ((i & 8) != 0) {
            z5 = w3v.LIZLLL;
        }
        if ((i & 16) != 0) {
            z6 = w3v.LJ;
        }
        if ((i & 32) != 0) {
            c08630Vn5 = w3v.LJFF;
        }
        if ((i & 64) != 0) {
            c08630Vn6 = w3v.LJI;
        }
        if ((i & 128) != 0) {
            c08630Vn4 = w3v.LJII;
        }
        w3v.getClass();
        o.LJIIIZ(list, "list");
        return new W3V(list, urlModel2, z4, z5, z6, c08630Vn5, c08630Vn6, c08630Vn4);
    }
}
