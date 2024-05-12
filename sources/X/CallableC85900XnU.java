package X;

import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import java.util.concurrent.Callable;

/* renamed from: X.XnU, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class CallableC85900XnU implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return PushSettingsApiManager.LJIIJJI(this.LJLILLLLZI, this.LJLIL);
    }

    public CallableC85900XnU(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }
}
