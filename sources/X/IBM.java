package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBM extends EO7 {
    public static final IBM LIZ = new IBM();

    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        if (sticker.getTags() != null) {
            List<String> tags = sticker.getTags();
            o.LJI(tags);
            if (tags.contains("forbid_for_all_duet")) {
                return true;
            }
        }
        return false;
    }
}
