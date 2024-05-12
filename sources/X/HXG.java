package X;

import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class HXG implements OnUnlockShareFinishListener {
    public final /* synthetic */ HXI LIZ;

    @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
    public final void onVKShareSucceed(Effect effect) {
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
    public final void onShareAppFailed() {
        HF7 hf7 = C44172HVg.LJJIFFI;
        ActivityC45651qj activity = this.LIZ.LIZIZ;
        hf7.getClass();
        o.LJIIIZ(activity, "activity");
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJIIIIZZ(R.string.rjt);
        c26045AKb.LJIIJ();
    }

    public HXG(HXI hxi) {
        this.LIZ = hxi;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
    public final void onShareAppSucceed(Effect effect) {
        HXF hxf = new HXF();
        hxf.LJLIL = UnLockSticker.STICKER_UNLOCKED;
        hxf.LJLILLLLZI = effect;
        hxf.LJLJI = true;
        C2U8.LIZIZ(hxf);
    }
}
