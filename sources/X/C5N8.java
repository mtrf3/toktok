package X;

import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaResourceManager;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* renamed from: X.5N8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5N8 {
    public static boolean LIZ;
    public static NLEResourceManager LIZIZ;
    public static final C5N8 LIZJ = new C5N8();

    public final synchronized void LIZ() {
        NLEMediaResourceManager nLEMediaResourceManager;
        if (!LIZ) {
            TENativeLibsLoader.loadLibrary();
            if (com.bytedance.ies.nleeditor.NLE.INSTANCE.getLibraryLoader().LIZ(C47261Igj.LJII("NLEMediaPublicJni", "NLEMediaJni"))) {
                if (!LIZ && LIZIZ != null) {
                    long NLEMediaResourceManager_obtain = NLEMediaPublicJniJNI.NLEMediaResourceManager_obtain();
                    if (NLEMediaResourceManager_obtain == 0) {
                        nLEMediaResourceManager = null;
                    } else {
                        nLEMediaResourceManager = new NLEMediaResourceManager(NLEMediaResourceManager_obtain, false);
                    }
                    NLEResourceManager nLEResourceManager = LIZIZ;
                    NLEMediaPublicJniJNI.NLEMediaResourceManager_setDelegate(nLEMediaResourceManager.LIZ, nLEMediaResourceManager, NLEResourceManager.getCPtr(nLEResourceManager), nLEResourceManager);
                }
                LIZ = true;
            }
        }
    }
}
