package X;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qjp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67837Qjp {
    public final int LIZ;

    public AbstractC67837Qjp(int i) {
        this.LIZ = i;
    }

    public abstract void LIZ(Status status);

    public abstract void LIZIZ(Exception exc);

    public abstract void LIZJ(C67825Qjd<?> c67825Qjd);

    public abstract void LIZLLL(C67834Qjm c67834Qjm, boolean z);

    public static Status LJ(RemoteException remoteException) {
        return new Status(19, null, C16880lQ.LJLLJ(remoteException.getClass()) + ": " + remoteException.getLocalizedMessage());
    }
}
