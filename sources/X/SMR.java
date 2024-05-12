package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.story.StoryViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMR extends AbstractC71980SMu {
    public final StoryViewModel LJLLILLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "share_to_story";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        Integer num;
        C72041SPd.LIZ.getClass();
        PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
        String str = null;
        if (LJI != null) {
            num = LJI.M("share_to_story");
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 1) {
                str = "Everyone";
            } else if (num.intValue() == 4) {
                str = "Friends";
            } else if (num.intValue() == 5) {
                str = "No_one";
            }
        }
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        c71969SMj.LIZIZ("share_to_story_status", str);
        java.util.Map<String, String> map = c71969SMj.LIZ;
        C07250Qf.LIZLLL(map, "EventMapBuilder()\n      …               .builder()", LIZ, "enter_share_to_story_permission", map);
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=story_sheet").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMR(StoryViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new SMQ(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.r6_);
        sk9.LIZIZ(R.raw.icon_twinkle_star_fill);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 36));
    }
}
