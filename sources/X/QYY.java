package X;

import android.os.Bundle;

/* loaded from: classes12.dex */
public abstract class QYY<T> {
    public final int LIZ;
    public final C67649Qgn<T> LIZIZ = new C67649Qgn<>();
    public final int LIZJ;
    public final Bundle LIZLLL;

    public abstract void LIZ(Bundle bundle);

    public abstract boolean LIZIZ();

    public final String toString() {
        int i = this.LIZJ;
        int i2 = this.LIZ;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(LIZIZ());
        sb.append("}");
        return sb.toString();
    }

    public final void LIZJ(C67180QYe c67180QYe) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(c67180QYe);
            new StringBuilder(valueOf.length() + 14 + valueOf2.length());
        }
        this.LIZIZ.LIZ(c67180QYe);
    }

    public final void LIZLLL(T t) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            new StringBuilder(valueOf.length() + 16 + valueOf2.length());
        }
        this.LIZIZ.LIZIZ(t);
    }

    public QYY(int i, int i2, Bundle bundle) {
        this.LIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = bundle;
    }
}
