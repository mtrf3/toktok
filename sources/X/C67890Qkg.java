package X;

import android.os.Looper;

/* renamed from: X.Qkg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67890Qkg<L> {
    public volatile L LIZ;
    public volatile C67891Qkh<L> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C67890Qkg(Looper looper, Object obj) {
        new ExecutorC67914Ql4(looper);
        QH7.LJIIIZ(obj, "Listener must not be null");
        this.LIZ = obj;
        QH7.LJI("castDeviceControllerListenerKey");
        this.LIZIZ = new C67891Qkh<>(obj);
    }
}
