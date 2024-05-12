package X;

import Y.IDCallableS415S0100000_17;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes19.dex */
public class ZTU implements ServiceConnection {
    public String LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public final /* synthetic */ ZTV LJLJJI;

    public ZTU(ZTV ztv) {
        this.LJLJJI = ztv;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLJJI.LIZ = null;
        C47261Igj.LJIILJJIL("ByteBenchServiceManager");
        ZU6 zu6 = this.LJLJJI.LJ;
        if (zu6 != null) {
            ((ZUR) zu6).LIZ(104, -1, "onServiceDisconnected");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ZU2 zuj;
        ZTV ztv = this.LJLJJI;
        if (iBinder == null) {
            zuj = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IBXManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof ZU2)) {
                zuj = (ZU2) queryLocalInterface;
            } else {
                zuj = new ZUJ(iBinder);
            }
        }
        ztv.LIZ = zuj;
        C47261Igj.LJIILJJIL("ByteBenchServiceManager");
        ZTV ztv2 = this.LJLJJI;
        if (ztv2.LIZ == null) {
            ZU6 zu6 = ztv2.LJ;
            if (zu6 != null) {
                ((ZUR) zu6).LIZ(101, -1, "init start failed");
                return;
            }
            return;
        }
        C89999ZTv.LIZ(new IDCallableS415S0100000_17(this, 0), C89999ZTv.LJ);
    }
}
