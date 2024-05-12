package X;

import com.bytedance.creativex.editor.preview.IAudioEffectParam;

/* renamed from: X.5Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC133095Kf {
    String[] getAudioPaths();

    int getCanvasHeight();

    int getCanvasWidth();

    double getDbRange();

    long getEditorHandler();

    boolean getEnableAutoStart();

    boolean getEnableMusicSync();

    int getFps();

    boolean getInterceptAutoPlay();

    boolean getLoadImageOptimizeByVEUserConfig();

    boolean getLoadMixImageOptimizeByVEUserConfig();

    boolean getNeedTemplateExtra();

    boolean getNeedVEUserConfig();

    int getPageMode();

    int getPreviewHeight();

    int getPreviewWidth();

    int[] getRotateArray();

    float[] getSpeedArray();

    boolean getUseVEPublic();

    int[] getVTrimIn();

    int[] getVTrimOut();

    IAudioEffectParam getVeAudioEffectParam();

    String[] getVideoPaths();

    String getWorkspace();

    boolean isCanvasVEEditorType();

    void setLoadImageOptimizeByVEUserConfig(boolean z);

    void setLoadMixImageOptimizeByVEUserConfig(boolean z);
}
