package X;

import android.os.Bundle;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.AbsSlotWidget;
import java.lang.Enum;

/* renamed from: X.CiE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32066CiE<W, VM extends ViewModel, T extends Enum<T>> extends AbsSlotWidget<W, VM, T> {
    public final /* synthetic */ C32067CiF LJLJI = new C32067CiF();
    public String LJLJJI = "-1";

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onDestroy() {
        C32067CiF c32067CiF = this.LJLJI;
        c32067CiF.LIZ = 0L;
        c32067CiF.LIZIZ = true;
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public void onCreate(Bundle bundle) {
        C32067CiF c32067CiF = this.LJLJI;
        c32067CiF.getClass();
        c32067CiF.LIZ = System.currentTimeMillis();
    }
}
