package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.ZfH, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class CallableC90487ZfH implements Callable<Integer> {
    public final /* synthetic */ SharedPreferences LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;

    public CallableC90487ZfH(SharedPreferences sharedPreferences, String str, Integer num) {
        this.LJLIL = sharedPreferences;
        this.LJLILLLLZI = str;
        this.LJLJI = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() {
        return Integer.valueOf(this.LJLIL.getInt(this.LJLILLLLZI, this.LJLJI.intValue()));
    }
}
