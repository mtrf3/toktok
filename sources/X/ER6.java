package X;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AqS17S0102000_6;

/* loaded from: classes7.dex */
public final class ER6 implements InterfaceC81397Vx3 {
    public final MutableLiveData<Boolean> LJLIL = new MutableLiveData<>(Boolean.FALSE);

    @Override // X.InterfaceC81397Vx3
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 32785) {
            C6QQ.LIZ(new AqS17S0102000_6(i2, i3, this, 2));
        }
    }
}
