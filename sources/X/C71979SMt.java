package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SMt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71979SMt extends AbstractC71980SMu {
    public final C62822Ol8 LJLLILLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "tag";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ, "enter_tag_mention_permission", map);
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=tag_mention").open();
    }

    public C71979SMt(Context context, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        super(context, skl);
        int i;
        this.LJLLILLLL = C221108m2.LIZIZ(C71981SMv.LJLIL);
        Bundle bundle = privacySettingsAdapterConfigs.extraData;
        boolean z = bundle != null ? bundle.getBoolean("hasVideoTag", false) : false;
        PrivacySettingsRestrictionItem LLIFFJFJJ = LLIFFJFJJ();
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        if (SN3.LIZJ(LLIFFJFJJ).LIZIZ && z) {
            i = R.string.i2n;
        } else {
            i = R.string.i2m;
        }
        AbstractC71913SKf.LIZJ(sk9, i);
        sk9.LIZIZ(R.raw.icon_at_fill);
        sk9.LJII = new C71983SMx(this);
        LJLLLLLL(sk9.LIZ());
    }
}
