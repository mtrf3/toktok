package X;

import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerListener;

/* renamed from: X.6q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172636q3 extends AbstractC65781Prl implements InterfaceC65784Pro<C172646q4> {
    public static final C172636q3 LJLIL = new C172636q3();

    public C172636q3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.6q4] */
    @Override // X.InterfaceC65784Pro
    public final C172646q4 invoke() {
        return new DAVLoggerListener() { // from class: X.6q4
            @Override // com.ss.ugc.android.davinciresource.jni.DAVLoggerListener
            public final void onLog(DAVLogLevel dAVLogLevel, String str) {
                int i;
                if (dAVLogLevel == null) {
                    i = -1;
                } else {
                    i = C83475WpT.LIZ[dAVLogLevel.ordinal()];
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    C172586py.LIZ("DAVResource", str);
                                    return;
                                } else {
                                    C172586py.LIZIZ("DAVResource", str, null);
                                    return;
                                }
                            }
                            C172586py.LJFF("DAVResource", str);
                            return;
                        }
                        C172586py.LIZJ("DAVResource", str);
                        return;
                    }
                    C172586py.LIZ("DAVResource", str);
                    return;
                }
                C172586py.LJ("DAVResource", str);
            }
        };
    }
}
