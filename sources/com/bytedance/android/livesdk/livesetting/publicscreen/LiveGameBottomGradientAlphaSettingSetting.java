package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C221108m2;
import X.C47261Igj;
import X.C5H3;
import X.CTJ;
import X.CTK;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.List;

@SettingsKey(preciseExperiment = false, value = "live_game_bottom_gradient_alpha_setting")
/* loaded from: classes6.dex */
public final class LiveGameBottomGradientAlphaSettingSetting {

    @Group(isDefault = true, value = "default group")
    public static final double DEFAULT = 0.0d;
    public static final LiveGameBottomGradientAlphaSettingSetting INSTANCE = new LiveGameBottomGradientAlphaSettingSetting();
    public static final C5H3 alphaLimit$delegate;
    public static final C5H3 gradientAlphaList$delegate;
    public static final float[] gradientPosArray;
    public static final List<Float> gradientRatioArray;

    public static /* synthetic */ void getGradientAlphaList$annotations() {
    }

    public static /* synthetic */ void getGradientPosArray$annotations() {
    }

    static {
        Float valueOf = Float.valueOf(0.525f);
        Float valueOf2 = Float.valueOf(0.6125f);
        Float valueOf3 = Float.valueOf(0.6475f);
        gradientRatioArray = C47261Igj.LJJIJIIJI(Float.valueOf(0.0f), Float.valueOf(0.315f), valueOf, valueOf2, valueOf3, Float.valueOf(0.7f), valueOf3, valueOf2, valueOf);
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        alphaLimit$delegate = C221108m2.LIZ(enumC221088m0, CTJ.LJLIL);
        gradientPosArray = new float[]{0.0f, 0.18f, 0.313f, 0.39f, 0.45f, 0.58f, 0.72f, 0.81f, 1.0f};
        gradientAlphaList$delegate = C221108m2.LIZ(enumC221088m0, CTK.LJLIL);
    }

    public static final int[] getGradientAlphaList() {
        return (int[]) gradientAlphaList$delegate.getValue();
    }

    public final float getAlphaLimit() {
        return ((Number) alphaLimit$delegate.getValue()).floatValue();
    }

    public static final float[] getGradientPosArray() {
        return gradientPosArray;
    }
}
