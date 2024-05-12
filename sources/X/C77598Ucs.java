package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77598Ucs implements ViewModelProvider.Factory {
    public final Bundle LIZ;
    public final C77591Ucl LIZIZ;
    public final InterfaceC77611Ud5 LIZJ;
    public final InterfaceC77595Ucp LIZLLL;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, C0VK c0vk) {
        return C09L.LIZIZ(this, cls, c0vk);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        return new RechargeViewModel(this.LIZ, this.LIZIZ, this.LIZLLL, this.LIZJ.Zj(), this.LIZJ);
    }

    public C77598Ucs(Bundle bundle, C77591Ucl c77591Ucl, InterfaceC77611Ud5 interfaceC77611Ud5, RechargeDialogNew rechargeDialogNew) {
        this.LIZ = bundle;
        this.LIZIZ = c77591Ucl;
        this.LIZJ = interfaceC77611Ud5;
        this.LIZLLL = rechargeDialogNew;
    }
}
