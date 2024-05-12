package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.Qg1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67601Qg1 implements ServiceConnection {
    public final String LJLIL;
    public final /* synthetic */ C67604Qg4 LJLILLLLZI;

    public ServiceConnectionC67601Qg1(C67604Qg4 c67604Qg4, String str) {
        this.LJLILLLLZI = c67604Qg4;
        this.LJLIL = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLILLLLZI.LIZ.LIZJ().LJIILIIL.LIZ("Install Referrer Service disconnected");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC67602Qg2 c68214Qpu;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof InterfaceC67602Qg2) {
                    c68214Qpu = (InterfaceC67602Qg2) queryLocalInterface;
                    if (c68214Qpu == null) {
                        this.LJLILLLLZI.LIZ.LIZJ().LJIIIIZZ.LIZ("Install Referrer Service implementation was not found");
                        return;
                    }
                } else {
                    c68214Qpu = new C68214Qpu(iBinder);
                }
                this.LJLILLLLZI.LIZ.LIZJ().LJIILIIL.LIZ("Install Referrer Service connected");
                this.LJLILLLLZI.LIZ.LIZIZ().LJIILIIL(new RunnableC67600Qg0(this, c68214Qpu, this));
                return;
            } catch (RuntimeException e) {
                this.LJLILLLLZI.LIZ.LIZJ().LJIIIIZZ.LIZIZ(e, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        this.LJLILLLLZI.LIZ.LIZJ().LJIIIIZZ.LIZ("Install Referrer connection returned with null binder");
    }
}
