package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;

/* renamed from: X.5O1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5O1 extends AbstractC65781Prl implements InterfaceC65784Pro<C5O0> {
    public static final C5O1 LJLIL = new C5O1();

    public C5O1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5O0] */
    @Override // X.InterfaceC65784Pro
    public final C5O0 invoke() {
        return new NLELoggerListener() { // from class: X.5O0
            @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
            public final void onLog(LogLevel logLevel, String str) {
                int i;
                if (logLevel == null) {
                    i = -1;
                } else {
                    i = C134075Nz.LIZ[logLevel.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    C172586py.LIZ("NLE_Native", str);
                                    return;
                                } else {
                                    C172586py.LIZIZ("NLE_Native", str, null);
                                    return;
                                }
                            }
                            C172586py.LJFF("NLE_Native", str);
                            return;
                        }
                        C172586py.LIZJ("NLE_Native", str);
                        return;
                    }
                    C172586py.LIZ("NLE_Native", str);
                    return;
                }
                C172586py.LJ("NLE_Native", str);
            }
        };
    }
}
