package X;

import android.app.Activity;
import java.util.concurrent.Callable;

/* renamed from: X.SSg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class CallableC72122SSg<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ C72120SSe LJLJI;

    public CallableC72122SSg(String str, Activity activity, C72120SSe c72120SSe) {
        this.LJLIL = str;
        this.LJLILLLLZI = activity;
        this.LJLJI = c72120SSe;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C78250UnO c78250UnO = C78250UnO.LIZ;
        String str = this.LJLIL;
        Activity activity = this.LJLILLLLZI;
        C72120SSe c72120SSe = this.LJLJI;
        c78250UnO.getClass();
        C78250UnO.LIZIZ(str, activity, c72120SSe);
        return C76800UCe.LIZ;
    }
}
