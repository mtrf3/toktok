package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.likedlist.LikedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SMn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71973SMn extends AbstractC71980SMu {
    public final LikedListViewModel LJLLILLLL;
    public final boolean LJLLJ;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "favorite";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ, "enter_liked_permission", map);
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=liked_list_sheet").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71973SMn(LikedListViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        Bundle bundle = configs.extraData;
        this.LJLLJ = bundle != null ? bundle.getBoolean("hideWhoCanSeeMyLikeListItem", true) : true;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new C71974SMo(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.b4t);
        sk9.LIZIZ(R.raw.icon_heart_fill);
        sk9.LJII = new C71975SMp(this);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 24));
    }
}
