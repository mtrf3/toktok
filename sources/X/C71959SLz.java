package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SLz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71959SLz extends AbstractC71980SMu {
    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "hide_search";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=sug_to_others").open();
    }

    public C71959SLz(Context context, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        super(context, skl);
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        AbstractC71913SKf.LIZJ(sk9, R.string.p9e);
        LJLLLLLL(sk9.LIZ());
    }
}
