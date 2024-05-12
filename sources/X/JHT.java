package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* loaded from: classes9.dex */
public final class JHT implements JIB {
    public final /* synthetic */ JHN LIZ;
    public final /* synthetic */ Context LIZIZ;

    @Override // X.JIB
    public final /* synthetic */ Fragment LIZ() {
        return null;
    }

    @Override // X.JIB
    public final /* synthetic */ InterfaceC47667InH LIZJ() {
        return null;
    }

    @Override // X.JIB
    public final boolean LIZIZ() {
        return this.LIZ.isAttachedToWindow();
    }

    @Override // X.JIB
    public final boolean isActive() {
        if (this.LIZ.isAttachedToWindow() && C27740Aue.LJI(this.LIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.JIB
    public final String getIdentifier() {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchVideoForLynx_");
        Activity LJIJJ = C45804HyK.LJIJJ(this.LIZIZ);
        if (LJIJJ != null) {
            i = LJIJJ.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.JIB
    public final Context getContext() {
        return this.LIZIZ;
    }

    public JHT(JHN jhn, Context context) {
        this.LIZ = jhn;
        this.LIZIZ = context;
    }
}
