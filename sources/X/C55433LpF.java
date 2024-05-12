package X;

import Y.IDCListenerS51S0200000_9;
import android.app.Activity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.zhiliaoapp.musically.R;

/* renamed from: X.LpF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55433LpF extends AbstractC38780FJw<Boolean> {
    @Override // X.AbstractC38780FJw
    public final Boolean LIZIZ() {
        return Boolean.FALSE;
    }

    public static final void LIZJ(String str) {
        MobClick obtain = MobClick.obtain();
        obtain.setLabelName(str);
        obtain.setEventName("recall_popup");
        FMX.onEvent(obtain);
    }

    @Override // X.AbstractC38780FJw
    public final boolean LIZ(Boolean bool) {
        Activity LJIIIIZZ;
        Boolean bool2 = bool;
        if (((RBX) HG3.LJIILL()).isLogin()) {
            return false;
        }
        C54293LSn c54293LSn = C235779Nd.LIZ;
        if (c54293LSn.LJIIJJI == null) {
            c54293LSn.LJIIJJI = new C36821Ecj<>("attract_user_without_login", Boolean.FALSE);
        }
        if (c54293LSn.LJIIJJI.LIZ().booleanValue() || !bool2.booleanValue() || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
            return false;
        }
        C62905OmT c62905OmT = new C62905OmT(LJIIIIZZ);
        c62905OmT.LIZIZ = LJIIIIZZ.getString(R.string.but);
        c62905OmT.LJIIIZ(new IDCListenerS51S0200000_9(LJIIIIZZ, this, 1), LJIIIIZZ.getString(R.string.hqu), false);
        c62905OmT.LJIIL(new IDCListenerS51S0200000_9(LJIIIIZZ, this, 0), LJIIIIZZ.getString(R.string.hwh), false);
        new C62906OmU(c62905OmT).LIZLLL();
        LIZJ("show");
        if (c54293LSn.LJIIJJI == null) {
            c54293LSn.LJIIJJI = new C36821Ecj<>("attract_user_without_login", Boolean.FALSE);
        }
        c54293LSn.LJIIJJI.LIZLLL(Boolean.TRUE);
        return true;
    }
}
