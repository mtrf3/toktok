package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.PHb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class ServiceConnectionC64187PHb implements ServiceConnection {
    public final /* synthetic */ PHT LJLIL;

    public ServiceConnectionC64187PHb(PHT pht) {
        this.LJLIL = pht;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.LJLIL = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        PHW c64188PHc;
        PHT pht = this.LJLIL;
        if (iBinder == null) {
            c64188PHc = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.apm6.traffic.ITrafficTransportInterface");
            if (queryLocalInterface != null && (queryLocalInterface instanceof PHW)) {
                c64188PHc = (PHW) queryLocalInterface;
            } else {
                c64188PHc = new C64188PHc(iBinder);
            }
        }
        pht.LJLIL = c64188PHc;
    }
}
