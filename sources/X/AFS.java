package X;

import Y.IDCListenerS158S0100000_4;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AFS implements InterfaceC25921AFh {
    public final Activity LIZ;
    public C62906OmU LIZIZ;

    @Override // X.InterfaceC25921AFh
    public final void LIZ() {
    }

    @Override // X.InterfaceC25921AFh
    public final String LIZLLL() {
        return "logout";
    }

    @Override // X.InterfaceC25921AFh
    public final CharSequence LJ() {
        return null;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJI() {
    }

    @Override // X.InterfaceC25921AFh
    public final boolean LJII() {
        return false;
    }

    @Override // X.InterfaceC25921AFh
    public final void LIZIZ() {
        if (C2NU.LIZ.LIZIZ()) {
            Activity activity = this.LIZ;
            o.LJII(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.setting.KidsSettingActivity");
            if (((ActivityC86117Xqz) activity).isActive()) {
                TeenageModeSetting teenageModeSetting = XSJ.LIZIZ;
                if (teenageModeSetting != null && teenageModeSetting.getTimeLockSelfInMin() > 0) {
                    XSK.LIZIZ(new AFV(this), "logout");
                    return;
                } else {
                    LJIIIIZZ();
                    return;
                }
            }
            return;
        }
        C5S1 c5s1 = new C5S1(this.LIZ);
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public final void LJIIIZ() {
        if (this.LIZIZ == null) {
            C62905OmT c62905OmT = new C62905OmT(this.LIZ);
            c62905OmT.LJ(R.string.dso);
            c62905OmT.LJII(R.string.cg_, AFU.LJLIL);
            c62905OmT.LJIIJ(R.string.hw8, new IDCListenerS158S0100000_4(this, 11));
            this.LIZIZ = new C62906OmU(c62905OmT);
        }
        C62906OmU c62906OmU = this.LIZIZ;
        if (c62906OmU != null) {
            c62906OmU.LIZLLL();
        }
    }

    @Override // X.InterfaceC25921AFh
    public final int getVisibility() {
        if (AFR.LIZ.isLogin()) {
            return 0;
        }
        return 8;
    }

    public final void LJIIIIZZ() {
        UrlModel urlModel;
        IKidsAccountService LJIIIIZZ = KidsAccountServiceImpl.LJIIIIZZ();
        if (LJIIIIZZ.LIZJ() && !LJIIIIZZ.LJI() && LJIIIIZZ.LIZ()) {
            SmartAvatarImageView smartAvatarImageView = new SmartAvatarImageView(this.LIZ);
            AFQ LJFF = KidsAccountServiceImpl.LJIIIIZZ().LJFF();
            if (LJFF != null) {
                urlModel = LJFF.getUserThumb();
            } else {
                urlModel = null;
            }
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LJJIIJ = smartAvatarImageView;
            C16880lQ.LLJJJ(LJII);
            C26227ARb c26227ARb = new C26227ARb(this.LIZ);
            c26227ARb.LJIIIZ = new C244689iy(this.LIZ, smartAvatarImageView);
            c26227ARb.LJII = false;
            c26227ARb.LJ(R.string.o4);
            c26227ARb.LIZ(R.string.o1);
            UC0.LIZJ(c26227ARb, new AqS135S0200000_4(LJIIIIZZ, this, 179));
            c26227ARb.LJI().LIZLLL();
            return;
        }
        LJIIIZ();
    }

    @Override // X.InterfaceC25921AFh
    public final Activity getActivity() {
        return this.LIZ;
    }

    public AFS(Activity activity) {
        this.LIZ = activity;
        activity.getApplication().registerActivityLifecycleCallbacks(new AFT());
    }

    @Override // X.InterfaceC25921AFh
    public final AI8 LIZJ(View view) {
        AI8 ai8 = (AI8) view.findViewById(R.id.g_g);
        o.LJIIIIZZ(ai8, "view.logout_view");
        return ai8;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJFF(String str, String str2, Boolean bool, Boolean bool2) {
        C25914AFa.LIZ(this, str, str2, bool, bool2);
    }
}
