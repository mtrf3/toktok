package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.ChannelReRankAndFlipConfig;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.OXm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62066OXm {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(OVY.LJLIL);
    public static final ArrayList<String> LIZIZ = C47261Igj.LJII("instagram", "instagram_story", "facebook", "facebook_lite");

    public static final boolean LIZIZ() {
        java.util.Map<String, ?> all = ((Keva) LIZ.getValue()).getAll();
        o.LJII(all, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Long>");
        boolean z = false;
        boolean z2 = false;
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (System.currentTimeMillis() - ((Number) entry.getValue()).longValue() <= 604800000) {
                if (o.LJ(entry.getKey(), "whatsapp") || o.LJ(entry.getKey(), "whatsapp_status")) {
                    z = true;
                }
                if (LIZIZ.contains(entry.getKey())) {
                    z2 = true;
                }
            }
        }
        if (!z && z2) {
            return false;
        }
        return true;
    }

    public static final boolean LIZ(Context context) {
        if (C4LD.LIZIZ.LJJJJLL() || ((ChannelReRankAndFlipConfig) C62068OXo.LIZIZ.getValue()).getBrFlipLogic() != 0 || C00F.LIZ(31744, 0, "interction_share_button_whatsapp_style", true) == 0 || context == null || !C224878s7.LIZ(context, "com.whatsapp")) {
            return false;
        }
        return true;
    }
}
