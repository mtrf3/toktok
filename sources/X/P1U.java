package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P1U {
    public final ActivityC45651qj LIZ;
    public final EnumC58085Mqv LIZIZ;
    public final P1J LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Integer LJIIJ;
    public final Integer LJIIJJI;
    public final boolean LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final C73306Spq LJIILL;
    public final C73306Spq LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P1U)) {
            return false;
        }
        P1U p1u = (P1U) obj;
        return o.LJ(this.LIZ, p1u.LIZ) && this.LIZIZ == p1u.LIZIZ && o.LJ(this.LIZJ, p1u.LIZJ) && this.LIZLLL == p1u.LIZLLL && this.LJ == p1u.LJ && this.LJFF == p1u.LJFF && this.LJI == p1u.LJI && this.LJII == p1u.LJII && this.LJIIIIZZ == p1u.LJIIIIZZ && this.LJIIIZ == p1u.LJIIIZ && o.LJ(this.LJIIJ, p1u.LJIIJ) && o.LJ(this.LJIIJJI, p1u.LJIIJJI) && this.LJIIL == p1u.LJIIL && o.LJ(this.LJIILIIL, p1u.LJIILIIL) && o.LJ(this.LJIILJJIL, p1u.LJIILJJIL) && o.LJ(this.LJIILL, p1u.LJIILL) && o.LJ(this.LJIILLIIL, p1u.LJIILLIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31;
        boolean z = this.LIZLLL;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJFF;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJI;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.LJII;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.LJIIIIZZ;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.LJIIIZ;
        int i13 = z7;
        if (z7 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        Integer num = this.LJIIJ;
        int hashCode2 = (i14 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIIJJI;
        int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + (this.LJIIL ? 1 : 0)) * 31;
        String str = this.LJIILIIL;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIILJJIL;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C73306Spq c73306Spq = this.LJIILL;
        int hashCode6 = (hashCode5 + (c73306Spq == null ? 0 : c73306Spq.hashCode())) * 31;
        C73306Spq c73306Spq2 = this.LJIILLIIL;
        return hashCode6 + (c73306Spq2 != null ? c73306Spq2.hashCode() : 0);
    }

    public final String toString() {
        return "Config(context=" + this.LIZ + ", authApiScene=" + this.LIZIZ + ", trackInfo=" + this.LIZJ + ", useCache=" + this.LIZLLL + ", enableRefresh=" + this.LJ + ", sortRegisterUser=" + this.LJFF + ", shouldToppingIndexSection=" + this.LJI + ", shouldShowIndexView=" + this.LJII + ", shouldShowRegisterChunk=" + this.LJIIIIZZ + ", shouldShowUnregisterChunk=" + this.LJIIIZ + ", registerChunkTitle=" + this.LJIIJ + ", unregisterChunkTitle=" + this.LJIIJJI + ", isShowStatus=" + this.LJIIL + ", inviteUrl=" + this.LJIILIIL + ", inviteDesc=" + this.LJIILJJIL + ", emptyStatus=" + this.LJIILL + ", errorStatus=" + this.LJIILLIIL + ')';
    }

    public P1U(ActivityC45651qj activityC45651qj, EnumC58085Mqv enumC58085Mqv, P1J p1j, boolean z, boolean z2, boolean z3, Integer num, boolean z4, String str, String str2, int i) {
        boolean z5;
        boolean z6;
        boolean z7;
        Integer num2;
        P1J p1j2 = p1j;
        EnumC58085Mqv authApiScene = enumC58085Mqv;
        boolean z8 = z2;
        boolean z9 = z;
        Integer num3 = num;
        boolean z10 = z3;
        String str3 = str;
        authApiScene = (i & 2) != 0 ? EnumC58085Mqv.UNKNOWN : authApiScene;
        p1j2 = (i & 4) != 0 ? new P1J(null, 15) : p1j2;
        if ((i & 8) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i & 16) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        z9 = (i & 64) != 0 ? true : z9;
        z8 = (i & 128) != 0 ? true : z8;
        boolean z11 = (i & 256) != 0;
        z10 = (i & 512) != 0 ? true : z10;
        if ((i & 1024) != 0) {
            num2 = Integer.valueOf(R.string.ggq);
        } else {
            num2 = null;
        }
        num3 = (i & 2048) != 0 ? Integer.valueOf(R.string.ggo) : num3;
        boolean z12 = (i & 4096) == 0 ? z4 : true;
        str3 = (i & FileUtils.BUFFER_SIZE) != 0 ? null : str3;
        String str4 = (i & 16384) == 0 ? str2 : null;
        o.LJIIIZ(authApiScene, "authApiScene");
        this.LIZ = activityC45651qj;
        this.LIZIZ = authApiScene;
        this.LIZJ = p1j2;
        this.LIZLLL = z5;
        this.LJ = z6;
        this.LJFF = z7;
        this.LJI = z9;
        this.LJII = z8;
        this.LJIIIIZZ = z11;
        this.LJIIIZ = z10;
        this.LJIIJ = num2;
        this.LJIIJJI = num3;
        this.LJIIL = z12;
        this.LJIILIIL = str3;
        this.LJIILJJIL = str4;
        this.LJIILL = null;
        this.LJIILLIIL = null;
    }
}
