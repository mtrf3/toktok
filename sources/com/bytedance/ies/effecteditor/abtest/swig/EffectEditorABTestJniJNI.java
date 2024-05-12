package com.bytedance.ies.effecteditor.abtest.swig;

/* loaded from: classes17.dex */
public class EffectEditorABTestJniJNI {
    public static final native void EEABTestGetter_change_ownership(EEABTestGetter eEABTestGetter, long j, boolean z);

    public static final native void EEABTestGetter_director_connect(EEABTestGetter eEABTestGetter, long j, boolean z, boolean z2);

    public static final native boolean EEABTestGetter_enableExportStickerUseEffectForMET(long j, EEABTestGetter eEABTestGetter);

    public static final native void EEABTestManagerCore_registerABTestGetterPtr(long j, EEABTestGetter eEABTestGetter);

    public static final native void delete_EEABTestGetter(long j);

    public static final native void delete_EEABTestManagerCore(long j);

    public static final native long new_EEABTestGetter();

    public static final native void swig_module_init();

    static {
        swig_module_init();
    }

    public static boolean SwigDirector_EEABTestGetter_enableExportStickerUseEffectForMET(EEABTestGetter eEABTestGetter) {
        return eEABTestGetter.enableExportStickerUseEffectForMET();
    }
}
