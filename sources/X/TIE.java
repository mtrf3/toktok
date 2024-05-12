package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIE implements TIJ {
    public final LifecycleOwner LIZ;

    public TIE(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = lifecycleOwner;
    }

    @Override // X.TIJ
    public final TIG LIZ(TEZ stickerDataManager, Effect effect) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        if (ID0.LJJII(effect) && !this.LIZ.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            return new TIG(false, "voice_sticker_in_inactive_state");
        }
        return TIC.LIZ.LIZ(stickerDataManager, effect);
    }
}
