package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;

/* loaded from: classes14.dex */
public final class UNL extends ElementSpecImpl {
    public long LJLIL;
    public final C5H3 LJLILLLLZI;

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LJLILLLLZI.getValue();
    }

    public UNL(int i) {
        super(i);
        this.LJLIL = 800L;
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(UNV.LJLIL);
        addSceneObserver(new UNR(this));
        addSceneObserver(new UNK());
        addSceneObserver(new UNH(this));
    }
}
