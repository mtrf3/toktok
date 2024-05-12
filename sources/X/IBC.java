package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBC extends EO7 {
    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        if (sticker.getTags() != null) {
            List<String> tags = sticker.getTags();
            if (tags != null) {
                if (tags.contains("now_camera_disable")) {
                    return true;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return false;
    }
}
