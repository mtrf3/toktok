package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;

/* loaded from: classes14.dex */
public final class UNN extends ElementSpecImpl {
    public long LJLIL;
    public final C5H3 LJLILLLLZI;

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LJLILLLLZI.getValue();
    }

    public UNN(int i) {
        super(i);
        this.LJLIL = 800L;
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(UNW.LJLIL);
        addSceneObserver(new UNS(this));
        addSceneObserver(new UNM());
        addSceneObserver(new UNE(this));
    }
}
