package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.ElementSpecImpl;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UJM extends ElementSpecImpl {
    public final UJH LJLIL;

    public final void LIZ(ConstraintProperty constraintProperty) {
        constraintProperty.removeConstraints(4);
        constraintProperty.removeConstraints(3);
        UJH ujh = this.LJLIL;
        if (ujh.LIZLLL) {
            constraintProperty.connect(3, 0, 3, ujh.LJII);
        } else {
            constraintProperty.connect(4, 0, 4, 0);
        }
        constraintProperty.apply();
    }

    public UJM(C1O4 c1o4, UJZ ujz) {
        super(R.id.n4l);
        this.LJLIL = new UJH(c1o4);
        addSceneObserver(new UJN(this));
        addSceneObserver(new UJK(this, ujz));
        addSceneObserver(new UJL(this, ujz));
        addSceneObserver(new UJG(this));
    }
}
