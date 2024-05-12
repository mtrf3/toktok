package X;

import com.bytedance.ies.nle.editor_jni.KeyframeType;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5JZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5JZ extends NLEMediaMessageListener {
    public final List<InterfaceC132785Ja> LIZ = new ArrayList();
    public final boolean LIZIZ;

    public C5JZ(boolean z) {
        this.LIZIZ = z;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onKeyFrameProcess(String parentId, long j, String str) {
        C76800UCe c76800UCe;
        o.LJIIIZ(parentId, "parentId");
        try {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC132785Ja) it.next()).LIZ(parentId, j, str, null);
            }
        } catch (Throwable th) {
            try {
                String LJIJJLI = C1DF.LJIJJLI(th);
                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("NLEVEPublic2: onKeyFrameProcess exception! errorMsg: ");
                    LIZ.append(th.getMessage());
                    LIZ.append(" stack: ");
                    LIZ.append(LJIJJLI);
                    logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onError(int i, int i2, float f, String str) {
        C76800UCe c76800UCe;
        String str2;
        String str3;
        if (this.LIZIZ) {
            try {
                Iterator it = ((ArrayList) this.LIZ).iterator();
                while (it.hasNext()) {
                    InterfaceC132785Ja interfaceC132785Ja = (InterfaceC132785Ja) it.next();
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    interfaceC132785Ja.LIZIZ(i, i2, f, str2);
                }
                return;
            } catch (Throwable th) {
                try {
                    String LJIJJLI = C1DF.LJIJJLI(th);
                    NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_ERROR;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("NLEVEPublic2: onError exception! errorMsg: ");
                        LIZ.append(th.getMessage());
                        LIZ.append(" stack: ");
                        LIZ.append(LJIJJLI);
                        logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                        c76800UCe = C76800UCe.LIZ;
                    } else {
                        c76800UCe = null;
                    }
                    C3C5.m7constructorimpl(c76800UCe);
                    return;
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                    return;
                }
            }
        }
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            InterfaceC132785Ja interfaceC132785Ja2 = (InterfaceC132785Ja) it2.next();
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            interfaceC132785Ja2.LIZIZ(i, i2, f, str3);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onInfo(int i, int i2, float f, String str) {
        C76800UCe c76800UCe;
        if (this.LIZIZ) {
            try {
                Iterator it = ((ArrayList) this.LIZ).iterator();
                while (it.hasNext()) {
                    ((InterfaceC132785Ja) it.next()).LIZJ(i, i2, f, str);
                }
                return;
            } catch (Throwable th) {
                try {
                    String LJIJJLI = C1DF.LJIJJLI(th);
                    NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                    if (logger != null) {
                        LogLevel logLevel = LogLevel.LEVEL_ERROR;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("NLEVEPublic2: onInfo exception! errorMsg: ");
                        LIZ.append(th.getMessage());
                        LIZ.append(" stack: ");
                        LIZ.append(LJIJJLI);
                        logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                        c76800UCe = C76800UCe.LIZ;
                    } else {
                        c76800UCe = null;
                    }
                    C3C5.m7constructorimpl(c76800UCe);
                    return;
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                    return;
                }
            }
        }
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC132785Ja) it2.next()).LIZJ(i, i2, f, str);
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEMediaMessageListener
    public final void onKeyFrameProcessWithType(String str, long j, String str2, KeyframeType keyframeType) {
        C76800UCe c76800UCe;
        try {
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC132785Ja) it.next()).LIZ(str, j, str2, keyframeType);
            }
        } catch (Throwable th) {
            try {
                String LJIJJLI = C1DF.LJIJJLI(th);
                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("NLEVEPublic2: onKeyFrameProcessWithType exception! errorMsg: ");
                    LIZ.append(th.getMessage());
                    LIZ.append(" stack: ");
                    LIZ.append(LJIJJLI);
                    logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
        }
    }
}
