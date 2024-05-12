package X;

import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import com.byted.cast.common.api.IResultListener;
import kotlin.jvm.internal.o;

/* renamed from: X.2qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71142qk implements IResultListener {
    public InterfaceC88472Yns<? super IResultListener, C76800UCe> LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> LJLJI;
    public int LJLJJI;

    @Override // com.byted.cast.common.api.IResultListener
    public final void onSuccess() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLILLLLZI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("success");
            throw null;
        }
    }

    @Override // com.byted.cast.common.api.IResultListener
    public final void onFail(int i, String str) {
        synchronized (this) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changePlayMode errCode: ");
            LIZ.append(i);
            LIZ.append(", errMsg: ");
            LIZ.append(str);
            C70922qO.LIZ("RetryExecutor", X1D.LIZIZ(LIZ));
            int i2 = this.LJLJJI + 1;
            this.LJLJJI = i2;
            if (i2 < 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("changePlayMode Retrying: retryCount: ");
                LIZ2.append(this.LJLJJI);
                C70922qO.LIZ("RetryExecutor", X1D.LIZIZ(LIZ2));
                new Handler().postDelayed(new ARunnableS37S0100000_1(this, 19), 200L);
            } else {
                InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> interfaceC88471Ynr = this.LJLJI;
                if (interfaceC88471Ynr != null) {
                    interfaceC88471Ynr.invoke(Integer.valueOf(i), str);
                } else {
                    o.LJIJI("failure");
                    throw null;
                }
            }
        }
    }
}
