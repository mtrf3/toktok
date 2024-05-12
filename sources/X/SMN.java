package X;

import Y.AObserverS75S0200000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SMN extends AbstractC71980SMu {
    public final ChatViewModel LJLLILLLL;

    @Override // X.AbstractC71980SMu
    public final String LLII() {
        return "chatsets";
    }

    @Override // X.AbstractC71980SMu
    public final void LLIIII() {
        SmartRouter.buildRoute(this.LJLIL, "aweme://privacy/setting/page?target=chat_sheet").open();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SMN(ChatViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs configs, SKL toastHolder) {
        super(context, toastHolder);
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(configs, "configs");
        o.LJIIIZ(toastHolder, "toastHolder");
        this.LJLLILLLL = viewModel;
        Bundle bundle = configs.extraData;
        boolean z = bundle != null ? bundle.getBoolean("show_icon", false) : false;
        SK9 sk9 = new SK9();
        AbstractC71980SMu.LLFZ(this, sk9);
        if (z) {
            sk9.LIZIZ(R.raw.icon_paperplane_fill);
        }
        sk9.LJIILIIL = new SMM(this);
        AbstractC71913SKf.LIZJ(sk9, R.string.b4q);
        SKZ LIZ = sk9.LIZ();
        LJLLLLLL(LIZ);
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS75S0200000_12(this, LIZ, 44));
    }
}
