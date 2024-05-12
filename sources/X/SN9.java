package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.tiktok.tpsc.settings.account.PrivacySettingsAdapterConfigs;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.chat.ChatViewModel;
import com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.nudefilter.NudgeFilterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SN9 extends SN1<NudgeFilterViewModel> {
    public final boolean LJLLJ;
    public boolean LJLLL;

    @Override // X.SN1
    public final String LLIIII() {
        return "dm_filter_nude";
    }

    @Override // X.SN1, X.SLJ
    public final boolean LL() {
        if (this.LJLLJ && super.LL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SN9(ChatViewModel chatViewModel, NudgeFilterViewModel viewModel, Context context, LifecycleOwner lifecycleOwner, PrivacySettingsAdapterConfigs privacySettingsAdapterConfigs, SKL skl) {
        super(viewModel, context, skl);
        boolean z;
        o.LJIIIZ(chatViewModel, "chatViewModel");
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        Bundle bundle = privacySettingsAdapterConfigs.extraData;
        if (bundle != null) {
            z = bundle.getBoolean("showNudeFilter", false);
        } else {
            z = false;
        }
        this.LJLLJ = z;
        SL3 sl3 = new SL3();
        sl3.LJIILL = new AqS143S0200000_12(this, viewModel, 154);
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 2;
        LLIFFJFJJ(sl3, 2, false);
        sl3.LJII = new SNA(this);
        AbstractC71913SKf.LIZJ(sl3, R.string.eqq);
        sl3.LJ = Integer.valueOf(R.string.eqp);
        LJLLLLLL(sl3.LIZ());
        viewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 146));
        viewModel.LJLJJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 147));
        C71909SKb.LIZ.getClass();
        C71909SKb.LIZJ().LIZ();
        if (C72028SOq.LJII()) {
            chatViewModel.LJLJI.observe(lifecycleOwner, new AObserverS80S0100000_12(this, 148));
        }
    }
}
