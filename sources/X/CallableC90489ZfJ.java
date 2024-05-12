package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.ZfJ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class CallableC90489ZfJ implements Callable<String> {
    public final /* synthetic */ SharedPreferences LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public CallableC90489ZfJ(SharedPreferences sharedPreferences, String str, String str2) {
        this.LJLIL = sharedPreferences;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() {
        return this.LJLIL.getString(this.LJLILLLLZI, this.LJLJI);
    }
}
