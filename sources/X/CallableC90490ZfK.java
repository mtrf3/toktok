package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.ZfK, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class CallableC90490ZfK implements Callable<SharedPreferences> {
    public final /* synthetic */ Context LJLIL;

    public CallableC90490ZfK(Context context) {
        this.LJLIL = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ SharedPreferences call() {
        return F9J.LIZIZ(this.LJLIL, 0, "google_sdk_flags");
    }
}
