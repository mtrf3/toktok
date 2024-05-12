package X;

import android.app.Activity;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: X.0uI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22380uI {
    boolean isAvailableOnDevice();

    void onCreateCredential(AbstractC22230u3 abstractC22230u3, Activity activity, CancellationSignal cancellationSignal, Executor executor, InterfaceC22350uF<AbstractC22250u5, AbstractC23600wG> interfaceC22350uF);

    void onGetCredential(C22410uL c22410uL, Activity activity, CancellationSignal cancellationSignal, Executor executor, InterfaceC22350uF<C22420uM, AbstractC23670wN> interfaceC22350uF);
}
