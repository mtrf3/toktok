package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.safemode.SafeModeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SN5 extends SN1<SafeModeViewModel> {
    public boolean LJLLJ;

    @Override // X.SN1
    public final String LLIIII() {
        return "dm_safe_mode";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SN5(ChatViewModel chatViewModel, SafeModeViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, SKL skl) {
        super(viewModel, context, skl);
        o.LJIIIZ(chatViewModel, "chatViewModel");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        SL3 sl3 = new SL3();
        sl3.LJIILL = new AqS143S0200000_12(this, viewModel, 166);
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 2;
        LLIFFJFJJ(sl3, 1, false);
        sl3.LJII = new SN6(this);
        AbstractC71913SKf.LIZJ(sl3, R.string.etr);
        sl3.LJ = Integer.valueOf(R.string.etq);
        sl3.LJIIL = viewModel.LJLJL;
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 158));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 159));
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            chatViewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 160));
        }
    }
}
