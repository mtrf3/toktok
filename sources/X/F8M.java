package X;

import android.app.Application;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class F8M extends F8Y {
    public List<F8Y> LIZ;

    public abstract List<F8Y> LJFF();

    @Override // X.F8Y
    public final void LIZLLL() {
        Iterator<F8Y> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
    }

    @Override // X.F8Y
    public final void LIZJ(Application application) {
        List<F8Y> LJFF = LJFF();
        this.LIZ = LJFF;
        Iterator<F8Y> it = LJFF.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(application);
        }
    }
}
