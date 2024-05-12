package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0bX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10750bX {
    public final IntentFilter LIZ;
    public final BroadcastReceiver LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.LIZIZ);
        sb.append(" filter=");
        sb.append(this.LIZ);
        if (this.LIZLLL) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }

    public C10750bX(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.LIZ = intentFilter;
        this.LIZIZ = broadcastReceiver;
    }
}
