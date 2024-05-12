package X;

import com.ss.android.ugc.gamora.editorpro.dynamic.VideoEffectStrategyApi;

/* renamed from: X.5hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142125hw {
    public static int LIZ() {
        VideoEffectStrategyApi videoEffectStrategyApi = (VideoEffectStrategyApi) C44514HdW.LIZ().LJIILJJIL(VideoEffectStrategyApi.class);
        if (videoEffectStrategyApi != null) {
            int trackLimit = videoEffectStrategyApi.trackLimit();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("effectTrackLimitCount = ");
            LIZ.append(trackLimit);
            H7C.LJI(3, "VideoEffect", null, X1D.LIZIZ(LIZ));
            return trackLimit;
        }
        return 5;
    }
}
