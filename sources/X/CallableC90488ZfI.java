package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.ZfI, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class CallableC90488ZfI implements Callable<Long> {
    public final /* synthetic */ SharedPreferences LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;

    public CallableC90488ZfI(SharedPreferences sharedPreferences, String str, Long l) {
        this.LJLIL = sharedPreferences;
        this.LJLILLLLZI = str;
        this.LJLJI = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Long call() {
        return Long.valueOf(this.LJLIL.getLong(this.LJLILLLLZI, this.LJLJI.longValue()));
    }
}
