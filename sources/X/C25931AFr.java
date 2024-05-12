package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.common.response.AgeAppealMenu;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsSettingsServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.AFr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25931AFr implements InterfaceC25921AFh {
    public final Activity LIZ;
    public final AgeAppealMenu LIZIZ = KidsSettingsServiceImpl.LJIIJJI().LJIIJ();

    @Override // X.InterfaceC25921AFh
    public final void LIZ() {
    }

    @Override // X.InterfaceC25921AFh
    public final String LIZLLL() {
        return "age_appeal";
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
        C38281F0r c38281F0r = new C38281F0r("aweme://lynxview/?channel=fe_kids_mode_lynx&bundle=kids-age-appeal/template.js");
        c38281F0r.LIZLLL("date", this.LIZIZ.getAppealDate());
        String appealURL = this.LIZIZ.getAppealURL();
        if (appealURL == null) {
            appealURL = "";
        }
        c38281F0r.LIZLLL("urlAgeAppeal", appealURL);
        c38281F0r.LIZ(EnumC25932AFs.TRUE.getValue(), "hide_nav_bar");
        c38281F0r.LIZ(EnumC25933AFt.TRUE.getValue(), "use_spark");
        c38281F0r.LIZ(1, "dynamic");
        Activity activity = this.LIZ;
        String LJ = c38281F0r.LJ();
        LJ.toString();
        SmartRouter.buildRoute(activity, LJ).open();
        C39398FdC c39398FdC = C39398FdC.LIZ;
        JSONObject jSONObject = new JSONObject();
        c39398FdC.getClass();
        C39398FdC.LIZIZ("enter_age_appeal_settings", jSONObject);
    }

    @Override // X.InterfaceC25921AFh
    public final int getVisibility() {
        if (this.LIZIZ.getShowAgeAppealMenu()) {
            return 0;
        }
        return 8;
    }

    @Override // X.InterfaceC25921AFh
    public final Activity getActivity() {
        return this.LIZ;
    }

    public C25931AFr(Activity activity) {
        this.LIZ = activity;
    }

    @Override // X.InterfaceC25921AFh
    public final AI8 LIZJ(View view) {
        AI8 ai8 = (AI8) view.findViewById(R.id.yw);
        o.LJIIIIZZ(ai8, "view.age_appeal");
        return ai8;
    }

    @Override // X.InterfaceC25921AFh
    public final void LJFF(String str, String str2, Boolean bool, Boolean bool2) {
        C25914AFa.LIZ(this, str, str2, bool, bool2);
    }
}
