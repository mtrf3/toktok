package com.ss.android.ugc.aweme;

import X.ActivityC86117Xqz;
import X.C0RN;
import X.C71426S1m;
import X.C76800UCe;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.G26;
import X.G28;
import X.G2A;
import X.InterfaceC88472Yns;
import Y.AObjectS11S0001000_6;
import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.activity.TikTokActivityViewModel;
import com.ss.android.ugc.aweme.fragment.TikTokFragmentViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class InitFoundationTask implements EE1 {
    public final InterfaceC88472Yns<Activity, C76800UCe> LJLIL;
    public final InterfaceC88472Yns<Context, Context> LJLILLLLZI;

    @Override // X.EEY
    public final String key() {
        return "InitFoundationTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        ActivityC86117Xqz.Companion.getClass();
        ActivityC86117Xqz.viewModelClass = TikTokActivityViewModel.class;
        BaseFragment.Companion.getClass();
        BaseFragment.viewModelClass = TikTokFragmentViewModel.class;
        G28 g28 = G28.LIZ;
        InterfaceC88472Yns<Activity, C76800UCe> listener = this.LJLIL;
        o.LJIIIZ(listener, "listener");
        G28.LIZIZ = listener;
        InterfaceC88472Yns<Context, Context> listener2 = this.LJLILLLLZI;
        o.LJIIIZ(listener2, "listener");
        G28.LIZJ = listener2;
        C71426S1m.LIZ(g28);
        C71426S1m.LIZ(G2A.LIZJ);
        C71426S1m.LIZ(G26.LIZ);
    }

    public InitFoundationTask(AObjectS11S0001000_6 aObjectS11S0001000_6, AObjectS11S0001000_6 aObjectS11S0001000_62) {
        this.LJLIL = aObjectS11S0001000_6;
        this.LJLILLLLZI = aObjectS11S0001000_62;
    }
}
