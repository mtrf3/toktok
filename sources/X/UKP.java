package X;

import android.view.View;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKP extends AbstractC65781Prl implements InterfaceC88472Yns<ConstraintProperty, C76800UCe> {
    public static final UKP LJLIL = new UKP();

    public UKP() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ConstraintProperty constraintProperty) {
        C54232Ax c54232Ax;
        ConstraintProperty it = constraintProperty;
        o.LJIIIZ(it, "it");
        View view = it.getView();
        if ((view instanceof C54232Ax) && (c54232Ax = (C54232Ax) view) != null) {
            c54232Ax.LJLJJLL.reset();
            c54232Ax.invalidate();
        }
        return C76800UCe.LIZ;
    }
}
