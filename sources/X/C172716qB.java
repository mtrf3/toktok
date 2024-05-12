package X;

import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;

/* renamed from: X.6qB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172716qB extends AbstractC65781Prl implements InterfaceC65784Pro<C172726qC> {
    public static final C172716qB LJLIL = new C172716qB();

    public C172716qB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6qC] */
    @Override // X.InterfaceC65784Pro
    public final C172726qC invoke() {
        return new DAVLoggerListener() { // from class: X.6qC
            @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerListener
            public final void onLog(DAVLogLevel dAVLogLevel, String str) {
                if (dAVLogLevel == null) {
                    return;
                }
                dAVLogLevel.ordinal();
            }
        };
    }
}
