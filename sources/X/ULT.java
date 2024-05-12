package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class ULT extends ElementSpecImpl {
    public final UL8 LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public int LJLJJI;

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        this.LJLJI = false;
        this.LJLILLLLZI = false;
        ConstraintProperty constraintPropertyById = this.LJLIL.getConstraintPropertyById(getId());
        if (constraintPropertyById != null) {
            LIZ(constraintPropertyById);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ULT(UL8 landscapeLayeredElementContext) {
        super(R.id.gi_);
        o.LJIIIZ(landscapeLayeredElementContext, "landscapeLayeredElementContext");
        this.LJLIL = landscapeLayeredElementContext;
        addSceneObserver(new C77031ULb(this));
        addSceneObserver(new ULU(this));
    }

    public final void LIZ(ConstraintProperty constraintProperty) {
        if (this.LJLJI) {
            int LJIIJJI = C15380j0.LJIIJJI() - (C15380j0.LJFF(R.dimen.adg) + this.LJLJJI);
            constraintProperty.removeConstraints(4);
            constraintProperty.constrainHeight(LJIIJJI - C15380j0.LIZ(24.0f));
            constraintProperty.apply();
            return;
        }
        constraintProperty.constrainHeight(0);
        if (this.LJLILLLLZI) {
            constraintProperty.connect(4, R.id.aq0, 3, 0);
            constraintProperty.apply();
        } else {
            constraintProperty.connect(4, R.id.bkq, 3, this.LJLIL.LIZLLL);
            constraintProperty.apply();
        }
    }
}
