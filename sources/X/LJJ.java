package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LJJ {
    public final OSZ<Integer, Integer> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final Float LJIIL;

    public LJJ() {
        this(null, 0, false, 0, 0, null, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LJJ)) {
            return false;
        }
        LJJ ljj = (LJJ) obj;
        return o.LJ(this.LIZ, ljj.LIZ) && this.LIZIZ == ljj.LIZIZ && this.LIZJ == ljj.LIZJ && this.LIZLLL == ljj.LIZLLL && this.LJ == ljj.LJ && this.LJFF == ljj.LJFF && this.LJI == ljj.LJI && this.LJII == ljj.LJII && this.LJIIIIZZ == ljj.LJIIIIZZ && this.LJIIIZ == ljj.LJIIIZ && this.LJIIJ == ljj.LJIIJ && this.LJIIJJI == ljj.LJIIJJI && o.LJ(this.LJIIL, ljj.LJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((((((((((((((((((hashCode + i) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + this.LJIIJJI) * 31;
        Float f = this.LJIIL;
        return i2 + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "SharedInviteDialogStyle(coverViewParams=" + this.LIZ + ", playIconViewSize=" + this.LIZIZ + ", messageTextCenter=" + this.LIZJ + ", forceCloseWhite=" + this.LIZLLL + ", messageNotFollowTemplateRes=" + this.LJ + ", messageFollowBackTemplateRes=" + this.LJFF + ", invitaionPrimaryActionNotFollowRes=" + this.LJI + ", normalPrimaryActionNotFollowRes=" + this.LJII + ", invitationPrimaryActionFollowBackRes=" + this.LJIIIIZZ + ", normalPrimaryActionFollowBackRes=" + this.LJIIIZ + ", bottomPadding=" + this.LJIIJ + ", coverTopPadding=" + this.LJIIJJI + ", coverRadius=" + this.LJIIL + ')';
    }

    public LJJ(OSZ osz, int i, boolean z, int i2, int i3, Float f, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        PrivacyUserSettingsV2 privacyUserSettings;
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings2;
        Integer M2;
        OSZ coverViewParams = osz;
        int i9 = i;
        boolean z3 = z;
        int i10 = i2;
        Float f2 = f;
        coverViewParams = (i4 & 1) != 0 ? new OSZ(-1, AnonymousClass391.LIZJ(240)) : coverViewParams;
        i9 = (i4 & 2) != 0 ? C7MY.LIZIZ(48) : i9;
        z3 = (i4 & 4) != 0 ? false : z3;
        if ((i4 & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i4 & 16) != 0) {
            i5 = R.string.hj5;
        } else {
            i5 = 0;
        }
        if ((i4 & 32) != 0) {
            i6 = R.string.hj8;
        } else {
            i6 = 0;
        }
        int i11 = i4 & 64;
        int i12 = R.string.hj4;
        if (i11 != 0) {
            if (!C78966Uyw.LJJIJ().LIZIZ() && ((privacyUserSettings2 = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings()) == null || (M2 = privacyUserSettings2.M("direct_message")) == null || M2.intValue() != 3)) {
                i7 = R.string.gzh;
            } else {
                i7 = R.string.hj4;
            }
        } else {
            i7 = 0;
        }
        i12 = (i4 & 128) == 0 ? 0 : i12;
        int i13 = i4 & 256;
        int i14 = R.string.hj7;
        if (i13 != 0) {
            if (!C78966Uyw.LJJIJ().LIZIZ() && ((privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings()) == null || (M = privacyUserSettings.M("direct_message")) == null || M.intValue() != 3)) {
                i8 = R.string.r54;
            } else {
                i8 = R.string.hj7;
            }
        } else {
            i8 = 0;
        }
        i14 = (i4 & 512) == 0 ? 0 : i14;
        i10 = (i4 & 1024) != 0 ? C7MY.LIZIZ(24) : i10;
        int i15 = (i4 & 2048) == 0 ? i3 : 0;
        f2 = (i4 & 4096) != 0 ? null : f2;
        o.LJIIIZ(coverViewParams, "coverViewParams");
        this.LIZ = coverViewParams;
        this.LIZIZ = i9;
        this.LIZJ = z3;
        this.LIZLLL = z2;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = i7;
        this.LJII = i12;
        this.LJIIIIZZ = i8;
        this.LJIIIZ = i14;
        this.LJIIJ = i10;
        this.LJIIJJI = i15;
        this.LJIIL = f2;
    }
}
