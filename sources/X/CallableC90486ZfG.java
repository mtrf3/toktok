package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.ZfG, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class CallableC90486ZfG implements Callable<Boolean> {
    public final /* synthetic */ SharedPreferences LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Boolean LJLJI;

    public CallableC90486ZfG(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.LJLIL = sharedPreferences;
        this.LJLILLLLZI = str;
        this.LJLJI = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() {
        return Boolean.valueOf(this.LJLIL.getBoolean(this.LJLILLLLZI, this.LJLJI.booleanValue()));
    }
}
