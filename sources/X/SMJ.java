package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMJ extends AbstractC71980SMu {
    public final ChatViewModel LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "chatsets";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        C72028SOq LIZ = C0N3.LIZ(C71909SKb.LIZ);
        C71969SMj c71969SMj = new C71969SMj();
        c71969SMj.LIZIZ("enter_from", "privacy_and_safety_settings");
        java.util.Map<String, String> map = c71969SMj.LIZ;
        o.LJIIIIZZ(map, "EventMapBuilder()\n      …               .builder()");
        LIZ.getClass();
        FMX.LJIIL("enter_message_permission", map);
        C72028SOq LIZ2 = C71909SKb.LIZJ().LIZ();
        C71969SMj c71969SMj2 = new C71969SMj();
        c71969SMj2.LIZIZ("enter_from", "privacy_and_safety_settings");
        c71969SMj2.LIZ(C78966Uyw.LJJIJL() ? 1 : 0);
        java.util.Map<String, String> map2 = c71969SMj2.LIZ;
        C07250Qf.LIZLLL(map2, "EventMapBuilder()\n      …               .builder()", LIZ2, "enter_group_chat_permission", map2);
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=chat").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMJ(ChatViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        this.LJLLJ = C221108m2.LIZIZ(C71978SMs.LJLIL);
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new SMK(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.b4q);
        sk9.LIZIZ(R.raw.icon_paperplane_fill);
        sk9.LJII = new C71982SMw(this);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 43));
    }
}
