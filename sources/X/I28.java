package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class I28 {
    public static boolean LIZ(Effect effect) {
        if (effect != null) {
            if (GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), V3N.LJII(effect.getSdkExtra(), "audio_graph"), AudioGraph.class) != null) {
                return true;
            }
        }
        return false;
    }
}
