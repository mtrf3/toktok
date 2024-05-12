package X;

import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: X.Xnc, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class CallableC85908Xnc<V> implements Callable {
    public static final CallableC85908Xnc<V> LJLIL = new CallableC85908Xnc<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return PushSettingsApiManager.LIZLLL();
    }
}
