package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.wallet.view.recharge.RechargeDialog;
import com.bytedance.android.live.wallet.viewmodel.recharge.RechargeDialogVM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ud3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77609Ud3 implements ViewModelProvider.Factory {
    public final InterfaceC77611Ud5 LIZ;
    public final C77591Ucl LIZIZ;
    public final DataChannel LIZJ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new RechargeDialogVM(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public C77609Ud3(RechargeDialog rechargeDialog, C77591Ucl rechargeDialogConfig, DataChannel dataChannel) {
        o.LJIIIZ(rechargeDialogConfig, "rechargeDialogConfig");
        this.LIZ = rechargeDialog;
        this.LIZIZ = rechargeDialogConfig;
        this.LIZJ = dataChannel;
    }
}
