package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.expriements.DigitalWellbeingEntranceSettings;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Mg3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57411Mg3 implements InterfaceC53832LAu {
    public final /* synthetic */ DialogC254019y1 LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // X.InterfaceC53832LAu
    public final void onSuccess() {
        String str;
        this.LJLIL.dismiss();
        if (C52254Kf4.LIZ()) {
            str = "fe_tns_screen_time_homepage";
        } else {
            str = "fe_privacy_and_safety_lynx";
        }
        String LJ = a1.LJ("aweme://lynxview/?channel=", str, "&bundle=digital-wellbeing-react/template.js&hide_nav_bar=1&use_spark=1&enable_canvas=1&wait_gecko_update=1&use_forest=1");
        DigitalWellbeingEntranceSettings.LIZ.getClass();
        C38281F0r c38281F0r = new C38281F0r(DigitalWellbeingEntranceSettings.LIZ(LJ));
        String str2 = this.LJLJI;
        c38281F0r.LIZLLL("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c38281F0r.LIZLLL("enter_from", str2);
        c38281F0r.LIZIZ(C57408Mg0.LJ(), "used_time");
        c38281F0r.LIZLLL("group", "digital_wellbeing");
        SmartRouter.buildRoute(this.LJLILLLLZI, c38281F0r.LJ()).open();
    }

    @Override // X.InterfaceC53832LAu
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.dismiss();
        C1A7.LJIJJ(this.LJLILLLLZI, e);
    }

    public C57411Mg3(DialogC254019y1 dialogC254019y1, Activity activity, String str) {
        this.LJLIL = dialogC254019y1;
        this.LJLILLLLZI = activity;
        this.LJLJI = str;
    }
}
