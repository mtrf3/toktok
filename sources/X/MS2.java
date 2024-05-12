package X;

import com.ss.android.ugc.aweme.setting.serverpush.service.PushSettingServiceImpl;
import java.io.IOException;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class MS2<V> implements Callable {
    public static final MS2<V> LJLIL = new MS2<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return PushSettingServiceImpl.LIZLLL().LIZJ();
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
