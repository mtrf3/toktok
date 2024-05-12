package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IBU extends EO7 {
    @Override // X.EO7
    public final boolean LIZ(Effect sticker, String category) {
        o.LJIIIZ(category, "category");
        o.LJIIIZ(sticker, "sticker");
        return ID0.LJIJJLI(sticker, "voice_recognization");
    }
}
