package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.stitch.StitchViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SMg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71966SMg extends AbstractC71980SMu {
    public final StitchViewModel LJLLILLLL;
    public final boolean LJLLJ;
    public final boolean LJLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "stitch";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        c71969SMj.LIZ(C78966Uyw.LJJIJL() ? 1 : 0);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ, "enter_stitch_permission", map);
        if (this.LJLLL) {
            SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=stitch").open();
        } else {
            SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=stitch_sheet").open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71966SMg(StitchViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        boolean z;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        Bundle bundle = configs.extraData;
        if (bundle != null) {
            z = bundle.getBoolean("show_icon", true);
        } else {
            z = true;
        }
        Bundle bundle2 = configs.extraData;
        this.LJLLJ = bundle2 != null ? bundle2.getBoolean("enableStitch", true) : true;
        Bundle bundle3 = configs.extraData;
        this.LJLLL = bundle3 != null ? bundle3.getBoolean("delete_associated_duet_stitch_experiment", false) : false;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new C71967SMh(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.b4u);
        if (z) {
            sk9.LIZIZ(R.raw.icon_stitch_fill);
        }
        sk9.LJII = new C71968SMi(this);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 33));
    }
}
