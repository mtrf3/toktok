package X;

import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class MOI<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public MOI(String str, int i, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return NotificationApi.LIZ().fetchSystemNotice(this.LJLIL, this.LJLILLLLZI, this.LJLJI).LIZLLL();
    }
}
