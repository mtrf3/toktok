package Y;

import X.APZ;
import X.AUA;
import X.C55723Ltv;
import X.C9X4;
import X.InterfaceC65784Pro;
import android.view.View;
import com.ss.android.ugc.aweme.profile.widgets.header.avatar.MyProfileAvatarAssem;
import com.ss.android.ugc.aweme.profile.widgets.signature.MineProfileSignatureAssem;
import com.ss.android.ugc.aweme.profile.widgets.signature.UserProfileSignatureAssem;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;

/* loaded from: classes5.dex */
public class IDCListenerS297S0100000_4 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS297S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS297S0100000_4 iDCListenerS297S0100000_4, View view) {
        if (C55723Ltv.LIZIZ.LJIIJ()) {
            APZ.LIZ.getClass();
            if (((Boolean) APZ.LIZIZ.getValue()).booleanValue()) {
                ((MyProfileAvatarAssem) iDCListenerS297S0100000_4.l0).L3("long_press");
                MyProfileAvatarAssem myProfileAvatarAssem = (MyProfileAvatarAssem) iDCListenerS297S0100000_4.l0;
                myProfileAvatarAssem.LJLJJI = myProfileAvatarAssem.A3();
                AUA aua = ((MyProfileAvatarAssem) iDCListenerS297S0100000_4.l0).LJLJJI;
                if (aua != null) {
                    aua.LIZ();
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS297S0100000_4 iDCListenerS297S0100000_4, View view) {
        ((MineProfileSignatureAssem) iDCListenerS297S0100000_4.l0).Z3(C9X4.LONG_PRESS);
        return true;
    }

    public static final boolean onLongClick$2(IDCListenerS297S0100000_4 iDCListenerS297S0100000_4, View view) {
        ((UserProfileSignatureAssem) iDCListenerS297S0100000_4.l0).O3(C9X4.LONG_PRESS);
        return true;
    }

    public static final boolean onLongClick$3(IDCListenerS297S0100000_4 iDCListenerS297S0100000_4, View view) {
        ((InterfaceC65784Pro) iDCListenerS297S0100000_4.l0).invoke();
        return true;
    }

    public static final boolean onLongClick$4(IDCListenerS297S0100000_4 iDCListenerS297S0100000_4, View view) {
        ((ProfileHeaderSignatureTranslationComponent) iDCListenerS297S0100000_4.l0).C3(C9X4.LONG_PRESS);
        return true;
    }

    public static final boolean onLongClick$5(IDCListenerS297S0100000_4 iDCListenerS297S0100000_4, View view) {
        ((InterfaceC65784Pro) iDCListenerS297S0100000_4.l0).invoke();
        return true;
    }
}
