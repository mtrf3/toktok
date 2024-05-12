package X;

import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import kotlin.jvm.internal.o;

/* renamed from: X.5Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133035Jz {
    public static C133785Mw LIZ(NLEMediaConfig mediaConfig, SurfaceView surfaceView, NLEEditor nLEEditor) {
        o.LJIIIZ(mediaConfig, "mediaConfig");
        C5N8.LIZJ.LIZ();
        return new C133785Mw(mediaConfig, surfaceView, nLEEditor);
    }

    public static C133785Mw LIZIZ(C133035Jz c133035Jz, String str, SurfaceView surfaceView) {
        c133035Jz.getClass();
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        NLEMediaJniJNI.NLEMediaConfig_workSpace_set(nLEMediaConfig.LIZ, nLEMediaConfig, str);
        C133785Mw.LJFF.getClass();
        return LIZ(nLEMediaConfig, surfaceView, null);
    }
}
