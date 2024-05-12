package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes12.dex */
public final class PHZ implements ServiceConnection {
    public final /* synthetic */ PHU LJLIL;

    public PHZ(PHU phu) {
        this.LJLIL = phu;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLIL.LIZIZ = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        PHW c64188PHc;
        PHU phu = this.LJLIL;
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
        phu.LIZIZ = c64188PHc;
    }
}
