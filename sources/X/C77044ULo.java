package X;

import android.animation.ValueAnimator;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.ULo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77044ULo extends ElementSpecImpl {
    public final C1O4 LJLIL;
    public ConstraintProperty LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;
    public final C62822Ol8 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77044ULo(C1O4 baseElementContext) {
        super(R.id.dvk);
        o.LJIIIZ(baseElementContext, "baseElementContext");
        this.LJLIL = baseElementContext;
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 548));
        addSceneObserver(new C77043ULn(this));
        addSceneObserver(new UK9(this));
        ElementSpecImplKt.onAttach(this, new AqS179S0100000_13(this, 582));
    }

    public final void LIZ(ConstraintProperty constraintProperty) {
        int margin = constraintProperty.margin(3);
        ((ValueAnimator) this.LJLJJL.getValue()).cancel();
        ValueAnimator valueAnimator = (ValueAnimator) this.LJLJJL.getValue();
        valueAnimator.setIntValues(margin, this.LJLJJI);
        valueAnimator.start();
    }
}
