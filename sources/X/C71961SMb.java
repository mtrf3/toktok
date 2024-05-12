package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.groupchat.GroupChatViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SMb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71961SMb extends AbstractC71980SMu {
    public final GroupChatViewModel LJLLILLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "group_chat";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=group_chat_sheet").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71961SMb(GroupChatViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        sk9.LJIILIIL = new C71960SMa(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.gyz);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 46));
    }
}
