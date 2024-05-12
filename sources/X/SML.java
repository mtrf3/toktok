package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.filterkeyword.FilterKeywordViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SML extends AbstractC71980SMu {
    public boolean LJLLILLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "dm_filter_keyword";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLIL, "aweme://chatcontrol/setting/keywords");
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            C71909SKb.LIZJ().LIZ();
            C72028SOq.LIZIZ();
            buildRoute.withParam("is_disabled", this.LJLLILLLL);
        }
        buildRoute.open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SML(ChatViewModel chatViewModel, FilterKeywordViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, SKL skl) {
        super(context, skl);
        o.LJIIIZ(chatViewModel, "chatViewModel");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        AbstractC71913SKf.LIZJ(sk9, R.string.eu4);
        sk9.LJIIL = viewModel.LJLIL;
        LJLLLLLL(sk9.LIZ());
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            chatViewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 139));
        }
    }
}
