package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.texturerender.VideoSurface;
import com.ss.videoarch.liveplayer.AdaptiveGradingConfig;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VE6 {
    public String LIZ;
    public AdaptiveGradingConfig LIZIZ;
    public long LIZJ = 2000;

    public static void LIZIZ(AdaptiveGradingConfig adaptiveGradingConfig, VideoSurface videoSurface) {
        Bundle LIZLLL = C1DG.LIZLLL("action", UserLevelGeckoUpdateSetting.DEFAULT, "effect_type", 14);
        LIZLLL.putFloat("src_saturation", adaptiveGradingConfig.mSaturation);
        LIZLLL.putFloat("src_contrast", adaptiveGradingConfig.mContrast);
        LIZLLL.putFloat("src_brightness", adaptiveGradingConfig.mBrightness);
        videoSurface.LJIJI(LIZLLL);
    }

    public final void LIZ(Object obj, int i, int i2, String str) {
        VideoSurface videoSurface;
        VideoSurface videoSurface2;
        switch (i) {
            case 100:
                if ((obj instanceof VE7) || !(obj instanceof AdaptiveGradingConfig)) {
                    return;
                }
                this.LIZIZ = (AdaptiveGradingConfig) obj;
                return;
            case 101:
                if (!(obj instanceof VideoSurface) || (videoSurface2 = (VideoSurface) obj) == null) {
                    return;
                }
                Bundle LIZLLL = C1DG.LIZLLL("action", 21, "effect_type", 14);
                LIZLLL.putInt("max_height", 1920);
                LIZLLL.putInt("max_width", 1920);
                LIZLLL.putString("cache_file", this.LIZ);
                LIZLLL.putLong("gop_time_ms", this.LIZJ);
                AdaptiveGradingConfig adaptiveGradingConfig = this.LIZIZ;
                if (adaptiveGradingConfig != null) {
                    float[] fArr = adaptiveGradingConfig.mBrightnessThreshold;
                    if (fArr != null) {
                        LIZLLL.putFloatArray("brightness_threshold", fArr);
                    }
                    float[] fArr2 = this.LIZIZ.mContrastThreshold;
                    if (fArr2 != null) {
                        LIZLLL.putFloatArray("contrast_threshold", fArr2);
                    }
                    float[] fArr3 = this.LIZIZ.mSaturationThreshold;
                    if (fArr3 != null) {
                        LIZLLL.putFloatArray("saturation_threshold", fArr3);
                    }
                }
                LIZLLL.putInt("int_value", 1);
                videoSurface2.LJIJI(LIZLLL);
                return;
            case 102:
                if (!(obj instanceof VideoSurface) || (videoSurface = (VideoSurface) obj) == null) {
                    return;
                }
                Bundle LIZLLL2 = C1DG.LIZLLL("action", 19, "effect_type", 14);
                LIZLLL2.putInt("int_value", 1);
                videoSurface.LJIJI(LIZLLL2);
                Bundle bundle = new Bundle();
                bundle.putInt("action", UserLevelGeckoUpdateSetting.DEFAULT);
                bundle.putInt("effect_type", 14);
                bundle.putBoolean("is_new_frame", true);
                bundle.putInt("int_value", 1);
                AdaptiveGradingConfig adaptiveGradingConfig2 = this.LIZIZ;
                if (adaptiveGradingConfig2 != null) {
                    bundle.putFloat("dst_brightness", adaptiveGradingConfig2.mBrightness);
                    bundle.putFloat("dst_contrast", this.LIZIZ.mContrast);
                    bundle.putFloat("dst_saturation", this.LIZIZ.mSaturation);
                }
                videoSurface.LJIJI(bundle);
                return;
            case 103:
                this.LIZJ = i2;
                return;
            case 104:
                this.LIZ = str;
                return;
            case 105:
                if (!(obj instanceof VideoSurface)) {
                    return;
                }
                VideoSurface videoSurface3 = (VideoSurface) obj;
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.has("video_color_hist")) {
                        return;
                    }
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "video_color_hist");
                    if (jSONObject2.optInt("valid") != 1) {
                        return;
                    }
                    AdaptiveGradingConfig adaptiveGradingConfig3 = new AdaptiveGradingConfig();
                    adaptiveGradingConfig3.mBrightness = (float) jSONObject2.optDouble("constract");
                    adaptiveGradingConfig3.mContrast = (float) jSONObject2.optDouble("brightness");
                    adaptiveGradingConfig3.mSaturation = (float) jSONObject2.optDouble("saturation");
                    LIZIZ(adaptiveGradingConfig3, videoSurface3);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                return;
        }
    }
}
