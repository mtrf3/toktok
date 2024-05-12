package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.ss.ugc.android.davinciresource.jni.DAVLogLevel;
import com.ss.ugc.android.davinciresource.jni.DAVLogger;
import com.ss.ugc.android.davinciresource.jni.DAVLoggerFunc;
import kotlin.jvm.internal.o;

/* renamed from: X.6py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172586py {
    public static InterfaceC172606q0 LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;

    static {
        C172976qb.LIZ.LIZ();
        com.bytedance.ies.nleeditor.NLE.loadNLELibrary$default(com.bytedance.ies.nleeditor.NLE.INSTANCE, false, 1, null);
        LIZ = new InterfaceC172606q0() { // from class: X.6q1
            @Override // X.InterfaceC172606q0
            public final void LIZ(String msg) {
                o.LJIIIZ(msg, "msg");
            }

            @Override // X.InterfaceC172606q0
            public final void LIZIZ(String msg) {
                o.LJIIIZ(msg, "msg");
            }

            @Override // X.InterfaceC172606q0
            public final void d(String msg) {
                o.LJIIIZ(msg, "msg");
            }

            @Override // X.InterfaceC172606q0
            public final void i(String msg) {
                o.LJIIIZ(msg, "msg");
            }

            @Override // X.InterfaceC172606q0
            public final void w(String msg) {
                o.LJIIIZ(msg, "msg");
            }
        };
        LIZIZ = C221108m2.LIZIZ(C5O1.LJLIL);
        LIZJ = C221108m2.LIZIZ(C172636q3.LJLIL);
    }

    public static void LIZLLL() {
        LIZJ("[CutSameLog]", "initLibraryLog: ");
        LIZJ("[CutSameLog]", "initNLELog: ");
        com.bytedance.ies.nleeditor.NLE nle = com.bytedance.ies.nleeditor.NLE.INSTANCE;
        nle.setLogger((NLELoggerListener) LIZIZ.getValue());
        nle.setLogLevel(LogLevel.LEVEL_DEBUG);
        LIZJ("[CutSameLog]", "initDAVLog: ");
        DAVLogger.obtain().setDelegate((DAVLoggerFunc) LIZJ.getValue());
        DAVLogger.obtain().setLogLevel(DAVLogLevel.LEVEL_DEBUG);
    }

    public static void LIZ(String str, String str2) {
        InterfaceC172606q0 interfaceC172606q0 = LIZ;
        if (interfaceC172606q0 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(", ");
        LIZ2.append((Object) str2);
        interfaceC172606q0.d(X1D.LIZIZ(LIZ2));
    }

    public static void LIZJ(String str, String str2) {
        InterfaceC172606q0 interfaceC172606q0 = LIZ;
        if (interfaceC172606q0 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(", ");
        LIZ2.append((Object) str2);
        interfaceC172606q0.i(X1D.LIZIZ(LIZ2));
    }

    public static void LJ(String str, String str2) {
        InterfaceC172606q0 interfaceC172606q0 = LIZ;
        if (interfaceC172606q0 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(", ");
        LIZ2.append((Object) str2);
        interfaceC172606q0.LIZIZ(X1D.LIZIZ(LIZ2));
    }

    public static void LJFF(String str, String str2) {
        InterfaceC172606q0 interfaceC172606q0 = LIZ;
        if (interfaceC172606q0 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(", ");
        LIZ2.append((Object) str2);
        interfaceC172606q0.w(X1D.LIZIZ(LIZ2));
    }

    public static void LIZIZ(String str, String str2, Throwable th) {
        InterfaceC172606q0 interfaceC172606q0 = LIZ;
        if (interfaceC172606q0 == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(", ");
        LIZ2.append((Object) str2);
        interfaceC172606q0.LIZ(X1D.LIZIZ(LIZ2));
    }
}
