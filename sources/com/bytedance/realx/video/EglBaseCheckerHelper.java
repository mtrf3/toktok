package com.bytedance.realx.video;

import com.bytedance.realx.video.EglBase;
import java.lang.ref.WeakReference;

/* loaded from: classes33.dex */
public class EglBaseCheckerHelper {
    public static WeakReference<EglBase.EglContextChecker> eglContextChecker;

    public static void EglContextDestoryEnd() {
        WeakReference<EglBase.EglContextChecker> weakReference = eglContextChecker;
        if (weakReference != null && weakReference.get() != null) {
            eglContextChecker.get().EglContextDestoryEnd();
        }
    }

    public static void EglContextDestoryStart() {
        WeakReference<EglBase.EglContextChecker> weakReference = eglContextChecker;
        if (weakReference != null && weakReference.get() != null) {
            eglContextChecker.get().EglContextDestoryStart();
        }
    }

    public static void setEglContextChecker(EglBase.EglContextChecker eglContextChecker2) {
        eglContextChecker = new WeakReference<>(eglContextChecker2);
    }
}
