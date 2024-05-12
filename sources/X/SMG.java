package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.comment.CommentViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMG extends AbstractC71980SMu {
    public final CommentViewModel LJLLILLLL;
    public final boolean LJLLJ;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "comment";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        if (this.LJLLJ) {
            C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
            C71969SMj c71969SMj = new C71969SMj();
            c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
            c71969SMj.LIZ(C78966Uyw.LJJIJL() ? 1 : 0);
            java.util.Map<String, String> map = c71969SMj.LIZ;
            o.LJIIIIZZ(map, "EventMapBuilder()\n      …               .builder()");
            LIZ.getClass();
            FMX.LJIIL("enter_comment_permission", map);
            C71909SKb.LIZJ().LIZ();
            C72028SOq.LJIILL();
            SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=comment").open();
            return;
        }
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=comment_sheet").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMG(CommentViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        Bundle bundle = configs.extraData;
        boolean z = bundle != null ? bundle.getBoolean("show_icon", true) : true;
        Bundle bundle2 = configs.extraData;
        boolean z2 = bundle2 != null ? bundle2.getBoolean("contain_comment_filter", false) : false;
        this.LJLLJ = z2;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new SMF(this);
        AbstractC71913SKf.LIZJ(sk9, SMI.LIZ());
        if (z) {
            sk9.LIZIZ(R.raw.icon_bubble_ellipsis_right_fill);
        }
        if (z2) {
            sk9.LJII = new SMH(this);
        }
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 3));
    }
}
