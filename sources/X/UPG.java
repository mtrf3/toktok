package X;

import Y.IDuS323S0100000_13;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UPG extends UPC {
    public static boolean LJLLLL;
    public String LJLJLJ = "";
    public long LJLJLLL = -1;
    public final Boolean LJLL;
    public final Integer LJLLI;
    public C73411SrX LJLLILLLL;
    public C73411SrX LJLLJ;
    public final C62822Ol8 LJLLL;

    @Override // X.UPC
    public final C73565Su1 LIZ() {
        return AbstractC73672Svk.LJJIJIL(new C77150UPq(C77134UPa.LIZ.LJ(), 0, 0, null, 30));
    }

    @Override // X.UPC
    public final C73565Su1 LIZIZ() {
        return AbstractC73672Svk.LJJIJIL(new C77150UPq(C77134UPa.LIZ.LIZIZ(), 0, 0, null, 30));
    }

    @Override // X.UPC
    public final C73390SrC LJII() {
        if (this.LJLJJLL && o.LJ("version_update", LIZLLL())) {
            return AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(this, 4));
        }
        return AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(this, 5));
    }

    @Override // X.UPC
    public final C73390SrC LJIIIIZZ() {
        return AbstractC73672Svk.LJIIJ(new IDuS323S0100000_13(this, 6));
    }

    @Override // X.UPC
    public final AbstractC73672Svk<C77150UPq> LJIIJ() {
        return AbstractC73672Svk.LJIIJ(new UPH(this, C77134UPa.LIZ.LJIIJJI())).LJJL(T16.LIZ());
    }

    public final void LJIILJJIL() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", LIZLLL());
        FMX.LJIIL("authorize_facebook_failure", c188727au.LIZ);
    }

    public final void LJIILL() {
        java.util.Map<String, String> map = this.LJLJJL;
        if (map != null && map.containsKey("is_passive") && o.LJ(map.get("is_passive"), "on")) {
            UQ2.LIZ().LIZ.storeLong("last_click_cancel_time", System.currentTimeMillis());
        }
    }

    public UPG() {
        C77134UPa c77134UPa = C77134UPa.LIZ;
        this.LJLL = c77134UPa.LJIIL(((RBX) HG3.LJIILL()).getCurUserId());
        this.LJLLI = c77134UPa.LIZLLL();
        c77134UPa.LIZIZ();
        this.LJLLL = C221108m2.LIZIZ(UPD.LJLIL);
    }

    public static boolean LJIIL(AuthResult authResult) {
        Bundle bundle = authResult.mBundle;
        o.LJIIIIZZ(bundle, "facebookAuthResult.bundle");
        String[] stringArray = bundle.getStringArray("fb_granted_permissions");
        if (stringArray == null || stringArray.length == 0) {
            return false;
        }
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(stringArray);
        while (LJJIIJZLJL.hasNext()) {
            if (o.LJ("email", LJJIIJZLJL.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIILIIL(AuthResult authResult) {
        Bundle bundle = authResult.mBundle;
        o.LJIIIIZZ(bundle, "facebookAuthResult.bundle");
        String[] stringArray = bundle.getStringArray("fb_granted_permissions");
        if (stringArray == null || stringArray.length == 0) {
            return false;
        }
        C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(stringArray);
        while (LJJIIJZLJL.hasNext()) {
            if (o.LJ("user_friends", LJJIIJZLJL.next())) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIJJI(int i) {
        int i2;
        String LIZLLL = LIZLLL();
        String LJ = LJ();
        Integer num = this.LJLLI;
        if (C77134UPa.LIZ.LJI(LJFF()).length() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        UQ4.LIZ(LIZLLL, "user", "facebook", "both", LJ, "process", 0, 0, num, this.LJLJJL, Integer.valueOf(i2 ^ 1), Integer.valueOf(i));
    }

    @Override // X.UPC
    public final C73390SrC LJIIIZ(int i, boolean z) {
        boolean z2;
        boolean LJ = o.LJ(LIZLLL(), "privacy_setting");
        C77134UPa c77134UPa = C77134UPa.LIZ;
        if ((!c77134UPa.LIZIZ() && z) || i == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !TextUtils.equals(this.LJLJLJ, "")) {
            c77134UPa.LJII(this.LJLJLLL, LJFF(), this.LJLJLJ);
        }
        if (z2) {
            c77134UPa.LJFF(z);
            return AbstractC73672Svk.LJIIJ(new UPE(this, z, LJ, i));
        }
        return AbstractC73672Svk.LJIIJ(new UPF(this, z));
    }

    public final void LJIILLIIL(boolean z, boolean z2) {
        new C243529h6(LIZLLL(), LJ(), z, z2, "facebook").LIZLLL(null);
    }
}
