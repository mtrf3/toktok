package X;

import android.content.ComponentName;
import android.content.Intent;

/* renamed from: X.06L, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C06L {
    public final ComponentName LIZ;
    public boolean LIZIZ;
    public int LIZJ;

    public abstract void LIZ(Intent intent);

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public C06L(ComponentName componentName) {
        this.LIZ = componentName;
    }

    public final void LIZIZ(int i) {
        if (!this.LIZIZ) {
            this.LIZIZ = true;
            this.LIZJ = i;
        } else {
            if (this.LIZJ == i) {
                return;
            }
            StringBuilder LJ = C7MY.LJ("Given job ID ", i, " is different than previous ");
            LJ.append(this.LIZJ);
            throw new IllegalArgumentException(X1D.LIZIZ(LJ));
        }
    }
}
