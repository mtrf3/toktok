package X;

import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: X.XnM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class CallableC85892XnM<V> implements Callable {
    public static final CallableC85892XnM<V> LJLIL = new CallableC85892XnM<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return PushSettingsApiManager.LJ();
    }
}
