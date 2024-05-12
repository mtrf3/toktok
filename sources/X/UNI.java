package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;

/* loaded from: classes14.dex */
public final class UNI extends ElementSpecImpl {
    public long LJLIL;
    public final C5H3 LJLILLLLZI;

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LJLILLLLZI.getValue();
    }

    public UNI(int i) {
        super(i);
        this.LJLIL = 800L;
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(UNU.LJLIL);
        addSceneObserver(new UNQ(this));
        addSceneObserver(new UNJ());
        addSceneObserver(new UNG(this));
    }
}
