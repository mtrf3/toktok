package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.watermark.ViralEffectInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H49 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(H4A.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(H4C.LJLIL);

    public static TimeSpeedModelExtension LIZIZ(VideoPublishEditModel model) {
        TimeSpeedModelExtension timeSpeedModelExtension;
        String stickerId;
        o.LJIIIZ(model, "model");
        ArrayList<TimeSpeedModelExtension> finalVideoList = model.getFinalVideoList();
        o.LJIIIIZZ(finalVideoList, "model.finalVideoList");
        String LLD = ORZ.LLD(finalVideoList, null, null, null, H4B.LJLIL, 31);
        C41859Gbn LIZIZ2 = C1I0.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Sticker IDs in shoot page: ");
        LIZ2.append(LLD);
        LIZIZ2.LJ("effect-watermark", X1D.LIZIZ(LIZ2));
        ArrayList<TimeSpeedModelExtension> finalVideoList2 = model.getFinalVideoList();
        o.LJIIIIZZ(finalVideoList2, "model.finalVideoList");
        Iterator<TimeSpeedModelExtension> it = finalVideoList2.iterator();
        while (true) {
            timeSpeedModelExtension = null;
            if (!it.hasNext()) {
                break;
            }
            timeSpeedModelExtension = it.next();
            TimeSpeedModelExtension timeSpeedModelExtension2 = timeSpeedModelExtension;
            if (timeSpeedModelExtension2 != null && (stickerId = timeSpeedModelExtension2.getStickerId()) != null && ((HashSet) LIZ.getValue()).contains(stickerId)) {
                break;
            }
        }
        return timeSpeedModelExtension;
    }

    public static boolean LIZLLL(VideoPublishEditModel model) {
        String str;
        o.LJIIIZ(model, "model");
        boolean z = true;
        boolean z2 = false;
        if (!e1.LIZ(31744, "studio_viral_effect_watermark", true, false)) {
            I9A.LIZJ("effect-watermark", "ab experiment not enabled, will not add effect watermark");
            return false;
        }
        TimeSpeedModelExtension LIZIZ2 = LIZIZ(model);
        if (LIZIZ2 != null) {
            CreativeInfo creativeInfo = model.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
            String stickerId = LIZIZ2.getStickerId();
            if (stickerId != null) {
                z2 = ((Keva) LIZIZ.getValue()).getBoolean(LIZ(creativeInfo, stickerId), false);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (H7R.LJJJJL(model) || !model.isSaveLocalWithWaterMark() || LIZIZ2 == null || !z2) {
            z = false;
        }
        C41859Gbn LIZIZ3 = C1I0.LIZIZ();
        StringBuilder LJI = JBR.LJI("Result: ", z, ". imageMode: ");
        LJI.append(H7R.LJJJJL(model));
        LJI.append(", saveLocal: ");
        LJI.append(model.isSaveLocalWithWaterMark());
        LJI.append(", viralEffect: ");
        if (LIZIZ2 != null) {
            str = LIZIZ2.getStickerId();
        } else {
            str = null;
        }
        LJI.append(str);
        LJI.append(", resourceReady: ");
        LJI.append(z2);
        LIZIZ3.LIZJ("effect-watermark", X1D.LIZIZ(LJI));
        return z;
    }

    public static String LIZ(CreativeInfo creativeInfo, String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key_watermark_resource_ready");
        LIZ2.append(creativeInfo.getCreationId());
        LIZ2.append(str);
        String LJI = C173376rF.LJI(X1D.LIZIZ(LIZ2));
        o.LJIIIIZZ(LJI, "getMD5String(KEY_WATERMA…eationId + viralEffectId)");
        return LJI;
    }

    public static H4O LIZJ(CreativeInfo creativeInfo, int[] videoSize, ViralEffectInfo effectInfo) {
        o.LJIIIZ(videoSize, "videoSize");
        o.LJIIIZ(effectInfo, "effectInfo");
        String effectId = effectInfo.getEffectId();
        int i = videoSize[0];
        int i2 = videoSize[1];
        String effectName = effectInfo.getEffectName();
        String string = C60903NvH.LJ.getResources().getString(R.string.fr1);
        o.LJIIIIZZ(string, "getApplication().resourc…etString(R.string.effect)");
        return new H4O(creativeInfo, i, i2, effectId, effectName, string, effectInfo.getEffectIcon());
    }
}
