package X;

import Y.ARunnableS38S0100000_2;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.VecLongLong;

/* renamed from: X.5Jb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132795Jb extends NLEListenerGetImageWrapper {
    public final /* synthetic */ C133775Mv LIZ;
    public final /* synthetic */ C5JY LIZIZ;
    public final /* synthetic */ VecLongLong LIZJ;

    public C132795Jb(C133775Mv c133775Mv, C5NJ c5nj, VecLongLong vecLongLong) {
        this.LIZ = c133775Mv;
        this.LIZIZ = c5nj;
        this.LIZJ = vecLongLong;
    }

    public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
        if (bArr != null) {
            C5JY c5jy = this.LIZIZ;
            if (c5jy == null) {
                return 0;
            }
            return c5jy.LIZ(bArr, i, i2, i3, f);
        }
        this.LIZ.LIZ().post(new ARunnableS38S0100000_2(this, 148));
        return 0;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEListenerGetImageWrapper
    public final int onGetImageDataCalled(byte[] bArr, int i, int i2, int i3, float f) {
        NLEMediaConfig nLEMediaConfig = this.LIZ.LJIIIIZZ;
        if (NLEMediaJniJNI.NLEMediaConfig_enableCatchExceptionInCallback_get(nLEMediaConfig.LIZ, nLEMediaConfig)) {
            try {
                return LIZ(bArr, i, i2, i3, f);
            } catch (Throwable th) {
                String LJIJJLI = C1DF.LJIJJLI(th);
                NLELoggerListener logger = com.bytedance.ies.nleeditor.NLE.INSTANCE.getLogger();
                if (logger != null) {
                    LogLevel logLevel = LogLevel.LEVEL_ERROR;
                    StringBuilder LIZ = X1D.LIZ();
                    C132805Jc.LJ(LIZ, "NLEVEPublic2: getImages onGetImageDataCalled exception! errorMsg: ", th, " stack: ", LJIJJLI);
                    logger.onLog(logLevel, X1D.LIZIZ(LIZ));
                }
                return 0;
            }
        }
        return LIZ(bArr, i, i2, i3, f);
    }
}
