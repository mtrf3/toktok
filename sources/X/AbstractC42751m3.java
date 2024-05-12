package X;

import android.animation.ValueAnimator;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS420S0100000;

/* renamed from: X.1m3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42751m3 extends ElementSpecImpl implements Observer<C006900z> {
    public final C62822Ol8 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;

    public final ValueAnimator LIZ() {
        return (ValueAnimator) this.LJLJI.getValue();
    }

    public final ConstraintProperty LIZIZ() {
        return (ConstraintProperty) this.LJLILLLLZI.getValue();
    }

    public AbstractC42751m3(int i, C1O4 c1o4) {
        super(i);
        this.LJLIL = C221108m2.LIZIZ(new IDqS420S0100000(c1o4, 118));
        this.LJLILLLLZI = C78996UzQ.LJJIJIIJI(new IDqS176S0200000(c1o4, this, 40));
        this.LJLJI = C78996UzQ.LJJIJIIJI(new IDqS420S0100000(c1o4, 117));
        ElementSpecImplKt.onAttach(this, new IDqS172S0200000(c1o4, this, 46));
    }
}
