package X;

import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.sticker.types.lock.LockStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ICs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46238ICs implements OnUnlockShareFinishListener {
    public final /* synthetic */ LockStickerHandler LIZ;

    @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
    public final void onShareAppFailed() {
        HF7 unlockStickerService = C60903NvH.LJIIJJI().unlockStickerService();
        C29S activity = this.LIZ.LJLIL;
        unlockStickerService.getClass();
        o.LJIIIZ(activity, "activity");
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIIZZ(R.string.rjt);
        c26045AKb.LJIIJ();
    }

    public C46238ICs(LockStickerHandler lockStickerHandler) {
        this.LIZ = lockStickerHandler;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
    public final void onShareAppSucceed(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ.LJLJL = true;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
    public final void onVKShareSucceed(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ.LJFF();
    }
}
