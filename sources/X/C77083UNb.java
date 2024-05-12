package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveFixPublicScreenShakeSetting;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.UNb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77083UNb extends C42701ly {
    public final boolean LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77083UNb(C1O4 layeredElementContext) {
        super(layeredElementContext);
        o.LJIIIZ(layeredElementContext, "layeredElementContext");
        this.LJLJJL = 1;
        this.LJLJJLL = 2;
        this.LJLJL = 4;
        this.LJLJI = LiveFixPublicScreenShakeSetting.INSTANCE.getValue();
        addSceneObserver(new C77084UNc(this));
        addSceneObserver(new C77085UNd(this));
        addSceneObserver(new C77086UNe(this));
    }

    public final void LIZJ(int i) {
        ConstraintProperty constraintPropertyById;
        ConstraintProperty constraintPropertyById2;
        int i2 = (~i) & this.LJLJJI;
        this.LJLJJI = i2;
        if ((i2 == 0 || !this.LJLJI) && (constraintPropertyById = this.LJLIL.getConstraintPropertyById(R.id.eqe)) != null && (constraintPropertyById2 = this.LJLIL.getConstraintPropertyById(R.id.apg)) != null && constraintPropertyById.getView().getBottom() > 0) {
            LIZ(constraintPropertyById, constraintPropertyById2.getView().getBottom() - constraintPropertyById.getView().getBottom());
        }
    }
}
