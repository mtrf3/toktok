package com.lynx.tasm;

import X.C40053Fnl;
import android.text.TextUtils;
import com.lynx.tasm.base.TraceEvent;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class TemplateBundle {
    public long LIZ;
    public Map<String, Object> LIZIZ;
    public final String LIZJ;

    public static native Object nativeGetExtraInfo(long j);

    public static native long nativeParseTemplate(byte[] bArr, String[] strArr);

    public static native void nativePostJsCacheGenerationTask(long j, String str, boolean z);

    public static native void nativeReleaseBundle(long j);

    public final Map<String, Object> LIZIZ() {
        if (this.LIZIZ == null) {
            LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
            LJIIIZ.LJIIL();
            if (LJIIIZ.LJIILIIL && this.LIZ != 0) {
                this.LIZIZ = new HashMap();
                Object nativeGetExtraInfo = nativeGetExtraInfo(this.LIZ);
                if (nativeGetExtraInfo instanceof Map) {
                    ((HashMap) this.LIZIZ).putAll((Map) nativeGetExtraInfo);
                }
            }
        }
        return this.LIZIZ;
    }

    public final void finalize() {
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        if (LJIIIZ.LJIILIIL) {
            long j = this.LIZ;
            if (j != 0) {
                nativeReleaseBundle(j);
                this.LIZ = 0L;
            }
        }
    }

    public static TemplateBundle LIZ(byte[] bArr) {
        TemplateBundle templateBundle;
        TraceEvent.LIZIZ("TemplateBundle.fromTemplate");
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        if (LJIIIZ.LJIILIIL) {
            String[] strArr = new String[1];
            templateBundle = new TemplateBundle(nativeParseTemplate(bArr, strArr), strArr[0]);
        } else {
            templateBundle = new TemplateBundle(0L, "Lynx Env is not prepared");
        }
        TraceEvent.LJ("TemplateBundle.fromTemplate");
        return templateBundle;
    }

    public static Object decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C40053Fnl.LIZ.getClass();
            return C40053Fnl.LIZ(byteBuffer);
        }
        return null;
    }

    public final void LIZJ(String str) {
        if (this.LIZ == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        nativePostJsCacheGenerationTask(this.LIZ, str, false);
    }

    public TemplateBundle(long j, String str) {
        this.LIZ = j;
        this.LIZJ = str;
    }
}
