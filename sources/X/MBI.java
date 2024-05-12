package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class MBI implements Serializable {
    public static final long serialVersionUID = 0;
    public final MBA[] LJLIL;

    private final Object readResolve() {
        MBA[] mbaArr = this.LJLIL;
        MBA mba = MBB.INSTANCE;
        for (MBA mba2 : mbaArr) {
            mba = mba.plus(mba2);
        }
        return mba;
    }

    public MBI(MBA[] mbaArr) {
        this.LJLIL = mbaArr;
    }
}
