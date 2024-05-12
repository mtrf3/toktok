package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;

/* renamed from: X.21K, reason: invalid class name */
/* loaded from: classes.dex */
public final class C21K extends AbstractC65781Prl implements InterfaceC65784Pro<Handler> {
    public static final C21K LJLIL = new C21K();

    public C21K() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Handler invoke() {
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            return new Handler(C39202Fa2.LIZ.LIZIZ(), C14270hD.LJLIL);
        }
        return new Handler(((HandlerThread) C14270hD.LJLJJLL.getValue()).getLooper(), C14270hD.LJLIL);
    }
}
