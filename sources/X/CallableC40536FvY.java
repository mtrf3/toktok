package X;

import android.os.Bundle;
import com.ss.android.common.applog.AppLog;
import java.util.concurrent.Callable;

/* renamed from: X.FvY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC40536FvY<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;

    public CallableC40536FvY(boolean z) {
        this.LJLIL = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("is_non_personalized", this.LJLIL ? 1 : 0);
        AppLog.setCustomerHeader(bundle);
        return C76800UCe.LIZ;
    }
}
