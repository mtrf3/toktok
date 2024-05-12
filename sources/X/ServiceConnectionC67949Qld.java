package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.Qld, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class ServiceConnectionC67949Qld implements ServiceConnection, InterfaceC67926QlG, InterfaceC67948Qlc {
    public volatile boolean LJLIL;
    public volatile C67877QkT LJLILLLLZI;
    public final /* synthetic */ C68022Qmo LJLJI;

    public ServiceConnectionC67949Qld(C68022Qmo c68022Qmo) {
        this.LJLJI = c68022Qmo;
    }

    @Override // X.InterfaceC67926QlG
    public final void H0(Bundle bundle) {
        QH7.LJ("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                QH7.LJIIIIZZ(this.LJLILLLLZI);
                this.LJLJI.LIZ.LIZIZ().LJIILIIL(new RunnableC67954Qli(this, (InterfaceC68041Qn7) this.LJLILLLLZI.LJJIIJ()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.LJLILLLLZI = null;
                this.LJLIL = false;
            }
        }
    }

    public final void LIZ(Intent intent) {
        this.LJLJI.LJFF();
        Context context = this.LJLJI.LIZ.LIZ;
        QCV LIZIZ = QCV.LIZIZ();
        synchronized (this) {
            if (this.LJLIL) {
                this.LJLJI.LIZ.LIZJ().LJIILIIL.LIZ("Connection attempt already in progress");
                return;
            }
            this.LJLJI.LIZ.LIZJ().LJIILIIL.LIZ("Using local app measurement service");
            this.LJLIL = true;
            LIZIZ.LIZ(context, intent, this.LJLJI.LIZJ, 129);
        }
    }

    @Override // X.InterfaceC67948Qlc
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        QH7.LJ("MeasurementServiceConnection.onConnectionFailed");
        C67280Qaq c67280Qaq = this.LJLJI.LIZ.LJIIIIZZ;
        if (c67280Qaq != null && c67280Qaq.LIZIZ) {
            c67280Qaq.LJIIIIZZ.LIZIZ(connectionResult, "Service connection failed");
        }
        synchronized (this) {
            this.LJLIL = false;
            this.LJLILLLLZI = null;
        }
        this.LJLJI.LIZ.LIZIZ().LJIILIIL(new RunnableC67952Qlg(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        QH7.LJ("MeasurementServiceConnection.onServiceDisconnected");
        this.LJLJI.LIZ.LIZJ().LJIIL.LIZ("Service disconnected");
        this.LJLJI.LIZ.LIZIZ().LJIILIIL(new RunnableC67951Qlf(this, componentName));
    }

    @Override // X.InterfaceC67926QlG
    public final void v7(int i) {
        QH7.LJ("MeasurementServiceConnection.onConnectionSuspended");
        this.LJLJI.LIZ.LIZJ().LJIIL.LIZ("Service connection suspended");
        this.LJLJI.LIZ.LIZIZ().LJIILIIL(new RunnableC67950Qle(this));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:14|(1:16)(1:27)|17|(3:26|22|23)|19|20|21|22|23) */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MeasurementServiceConnection.onServiceConnected"
            X.QH7.LJ(r0)
            monitor-enter(r5)
            r3 = 0
            if (r7 != 0) goto L1c
            r5.LJLIL = r3     // Catch: java.lang.Throwable -> L91
            X.Qmo r0 = r5.LJLJI     // Catch: java.lang.Throwable -> L91
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.Throwable -> L91
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L91
            X.Qar r1 = r0.LJFF     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "Service connected with null binder"
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            return
        L1c:
            r2 = 0
            java.lang.String r4 = r7.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r0 = r0.equals(r4)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            if (r0 == 0) goto L4c
            java.lang.String r0 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r7.queryLocalInterface(r0)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            boolean r0 = r1 instanceof X.InterfaceC68041Qn7     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            if (r0 == 0) goto L46
            X.Qn7 r1 = (X.InterfaceC68041Qn7) r1     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
        L35:
            r2 = r1
            X.Qmo r0 = r5.LJLJI     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            X.Qmz r0 = r0.LIZ     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            X.Qaq r0 = r0.LIZJ()     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            X.Qar r1 = r0.LJIILIIL     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            java.lang.String r0 = "Bound to IMeasurementService interface"
            r1.LIZ(r0)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            goto L6b
        L46:
            X.Qpq r1 = new X.Qpq     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            r1.<init>(r7)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            goto L35
        L4c:
            X.Qmo r0 = r5.LJLJI     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            X.Qmz r0 = r0.LIZ     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            X.Qaq r0 = r0.LIZJ()     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            X.Qar r1 = r0.LJFF     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            java.lang.String r0 = "Got binder with a wrong descriptor"
            r1.LIZIZ(r4, r0)     // Catch: android.os.RemoteException -> L5c java.lang.Throwable -> L91
            goto L6d
        L5c:
            X.Qmo r0 = r5.LJLJI     // Catch: java.lang.Throwable -> L91
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.Throwable -> L91
            X.Qaq r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L91
            X.Qar r1 = r0.LJFF     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "Service connect failed to get IMeasurementService"
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> L91
        L6b:
            if (r2 != 0) goto L7f
        L6d:
            r5.LJLIL = r3     // Catch: java.lang.Throwable -> L91
            X.QCV r3 = X.QCV.LIZIZ()     // Catch: java.lang.IllegalArgumentException -> L8f java.lang.Throwable -> L91
            X.Qmo r2 = r5.LJLJI     // Catch: java.lang.IllegalArgumentException -> L8f java.lang.Throwable -> L91
            X.Qmz r0 = r2.LIZ     // Catch: java.lang.IllegalArgumentException -> L8f java.lang.Throwable -> L91
            android.content.Context r1 = r0.LIZ     // Catch: java.lang.IllegalArgumentException -> L8f java.lang.Throwable -> L91
            X.Qld r0 = r2.LIZJ     // Catch: java.lang.IllegalArgumentException -> L8f java.lang.Throwable -> L91
            r3.LIZJ(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L8f java.lang.Throwable -> L91
            goto L8f
        L7f:
            X.Qmo r0 = r5.LJLJI     // Catch: java.lang.Throwable -> L91
            X.Qmz r0 = r0.LIZ     // Catch: java.lang.Throwable -> L91
            X.Qau r1 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L91
            X.Qlh r0 = new X.Qlh     // Catch: java.lang.Throwable -> L91
            r0.<init>(r5, r2)     // Catch: java.lang.Throwable -> L91
            r1.LJIILIIL(r0)     // Catch: java.lang.Throwable -> L91
        L8f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            return
        L91:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L91
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC67949Qld.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }
}
