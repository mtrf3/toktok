package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.wallet.view.recharge.singlerecharge.SingleRechargeFragment;
import com.bytedance.android.live.wallet.viewmodel.recharge.singlepage.SingleRechargeVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Uct, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77599Uct implements ViewModelProvider.Factory {
    public final InterfaceC77611Ud5 LIZ;
    public final InterfaceC77676Ue8 LIZIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new SingleRechargeVM(this.LIZ.q4(), this.LIZ.Zj(), this.LIZ.Tk(), this.LIZIZ);
    }

    public C77599Uct(InterfaceC77611Ud5 interfaceC77611Ud5, SingleRechargeFragment singleRechargeFragment) {
        this.LIZ = interfaceC77611Ud5;
        this.LIZIZ = singleRechargeFragment;
    }
}
