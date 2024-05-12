package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULZ extends ElementSpecImpl {
    public final UL8 LJLIL;
    public ValueAnimator LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULZ(UL8 landscapeLayeredElementContext) {
        super(R.id.eqj);
        o.LJIIIZ(landscapeLayeredElementContext, "landscapeLayeredElementContext");
        this.LJLIL = landscapeLayeredElementContext;
        ElementSpecImplKt.onAttach(this, C77032ULc.LJLIL);
        addSceneObserver(new ULW(this));
        addSceneObserver(new ULV(this));
        addSceneObserver(new ULX(this));
    }
}
