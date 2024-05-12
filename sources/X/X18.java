package X;

import android.os.RemoteException;
import java.util.List;

/* loaded from: classes16.dex */
public final class X18 implements X15 {
    public final /* synthetic */ X17 LIZ;

    @Override // X.X15
    public final boolean LJJLIIIJL() {
        try {
            return this.LIZ.LJJLIIIJL();
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public X18(X17 x17) {
        this.LIZ = x17;
    }

    @Override // X.X15
    public final void LJJJJZI(List<String> list) {
        try {
            this.LIZ.LJJJJZI(list);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
