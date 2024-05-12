package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudioSamiFilter;
import com.ss.android.ugc.gamora.editor.audioservice.service.audioenhance.AudioEnhanceSnrModelConfig;

/* renamed from: X.4oV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120714oV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(NLEFilter nLEFilter) {
        C124424uU.LIZ.getClass();
        AudioEnhanceSnrModelConfig LIZ2 = C124424uU.LIZ();
        NLEResourceNode LJ = nLEFilter.LIZIZ().LJ();
        String extra = nLEFilter.getExtra("snr_model_path");
        NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
        nLESegmentAudioSamiFilter.LJI(LJ);
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiType(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_CE_DENOISE_get());
        String str = "";
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiParam(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, "");
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setEnableSNR(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, false);
        String str2 = LIZ2.samiDenoiseLevel;
        if (str2 == null) {
            str2 = "";
        }
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiDenoiseLevel(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, str2);
        String str3 = LIZ2.samiConfigInfo;
        if (str3 == null) {
            str3 = "";
        }
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiCreateConfigInfo(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, str3);
        String str4 = LIZ2.samiSnr;
        if (str4 != null) {
            str = str4;
        }
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrThreshold(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, str);
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrFilePath(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, extra);
        nLEFilter.LIZJ(nLESegmentAudioSamiFilter);
    }

    public static void LIZIZ(NLEFilter nLEFilter) {
        C124424uU.LIZ.getClass();
        AudioEnhanceSnrModelConfig LIZ2 = C124424uU.LIZ();
        boolean z = true;
        if (LIZ2.enableSNR != 1) {
            z = false;
        }
        NLEResourceNode LJ = nLEFilter.LIZIZ().LJ();
        String extra = nLEFilter.getExtra("snr_model_path");
        NLESegmentAudioSamiFilter nLESegmentAudioSamiFilter = new NLESegmentAudioSamiFilter();
        nLESegmentAudioSamiFilter.LJI(LJ);
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiType(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, NLEEditorJniJNI.NLESegmentAudioSamiFilter_TYPE_CE_DENOISE_get());
        String str = "";
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiParam(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, "");
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setEnableSNR(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, z);
        String str2 = LIZ2.samiDenoiseLevel;
        if (str2 == null) {
            str2 = "";
        }
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiDenoiseLevel(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, str2);
        String str3 = LIZ2.samiConfigInfo;
        if (str3 == null) {
            str3 = "";
        }
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiCreateConfigInfo(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, str3);
        String str4 = LIZ2.samiSnr;
        if (str4 != null) {
            str = str4;
        }
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrThreshold(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, str);
        NLEEditorJniJNI.NLESegmentAudioSamiFilter_setSamiSnrFilePath(nLESegmentAudioSamiFilter.LJ, nLESegmentAudioSamiFilter, extra);
        nLEFilter.LIZJ(nLESegmentAudioSamiFilter);
    }
}
