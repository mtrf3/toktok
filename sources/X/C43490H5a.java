package X;

import com.bytedance.ies.nle.editor_jni.INLEHTTPClientDelegateWrapper;
import com.bytedance.ies.nle.editor_jni.NLEMediaRemoteJniJNI;

/* renamed from: X.H5a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43490H5a {
    public static boolean LIZ;
    public static INLEHTTPClientDelegateWrapper LIZIZ;
    public static final C43490H5a LIZJ = new C43490H5a();

    public final void LIZ(C36627EZb c36627EZb) {
        synchronized (this) {
            LIZIZ = c36627EZb;
            if (LIZ) {
                NLEMediaRemoteJniJNI.NLENetworkClientDelegateWrapper_setHttpClientWrapper(INLEHTTPClientDelegateWrapper.getCPtr(c36627EZb), c36627EZb);
            }
        }
    }
}
