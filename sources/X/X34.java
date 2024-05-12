package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class X34 extends X36 implements ServiceConnection {
    public static final String LJLLILLLL = C16880lQ.LJLLJ(X34.class);
    public InterfaceC84202X2w LJLJLLL;
    public InterfaceC84203X2x LJLL;
    public int LJLLI = -1;

    @Override // X.X36, X.InterfaceC84204X2y
    public final void LIZ() {
        if (this.LJLJLLL == null) {
            LJII(C84212X3g.LJ(), this);
        }
    }

    public final void LJIIIIZZ() {
        SparseArray<List<DownloadTask>> clone;
        X2Q x2q;
        try {
            synchronized (this.LJLILLLLZI) {
                clone = this.LJLILLLLZI.clone();
                this.LJLILLLLZI.clear();
            }
            if (clone != null && clone.size() > 0 && C84212X3g.LJIIL() != null) {
                for (int i = 0; i < clone.size(); i++) {
                    List<DownloadTask> list = clone.get(clone.keyAt(i));
                    if (list != null) {
                        for (DownloadTask downloadTask : list) {
                            try {
                                InterfaceC84202X2w interfaceC84202X2w = this.LJLJLLL;
                                if (downloadTask == null) {
                                    x2q = null;
                                } else {
                                    x2q = new X2Q(downloadTask);
                                }
                                interfaceC84202X2w.LLLJ(x2q);
                            } catch (RemoteException e) {
                                C16880lQ.LLLLIIL(e);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            String str = LJLLILLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception:");
            LIZ.append(th);
            C65210PiY.LIZJ(str, "resumePendingTaskForIndependent", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.X36, X.InterfaceC84204X2y
    public final IBinder LIZIZ(Intent intent) {
        if (intent != null && intent.getBooleanExtra("fix_downloader_db_sigbus", false)) {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LJLLILLLL, "onBind", "Downloader process sync database on main process");
            }
            try {
                if (X4H.LJII == null) {
                    X4H.LJII = new JSONObject();
                }
                X4H.LJII.put("fix_sigbus_downloader_db", 1);
            } catch (JSONException unused) {
            }
        }
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLLILLLL, "onBind", "IndependentDownloadBinder");
        }
        return new BinderC84200X2u();
    }

    @Override // X.X36, X.InterfaceC84204X2y
    public final void LIZLLL(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        X3K.LJ().LJIIIIZZ(downloadTask.getDownloadId(), true);
        X3D LJIIL = C84212X3g.LJIIL();
        if (LJIIL != null) {
            LJIIL.LJIL(downloadTask);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.LJLJLLL = null;
        InterfaceC84203X2x interfaceC84203X2x = this.LJLL;
        if (interfaceC84203X2x != null) {
            ((C84201X2v) interfaceC84203X2x).LIZ = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLLILLLL, "onServiceDisconnected", "Run");
        }
        this.LJLJLLL = null;
        this.LJLJI = false;
        InterfaceC84203X2x interfaceC84203X2x = this.LJLL;
        if (interfaceC84203X2x != null) {
            ((C84201X2v) interfaceC84203X2x).LIZ = null;
        }
    }

    @Override // X.X36, X.InterfaceC84204X2y
    public final void setLogLevel(int i) {
        InterfaceC84202X2w interfaceC84202X2w = this.LJLJLLL;
        if (interfaceC84202X2w == null) {
            this.LJLLI = i;
            return;
        }
        try {
            interfaceC84202X2w.setLogLevel(i);
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X36, X.InterfaceC84204X2y
    public final void tryDownload(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask == null) {
            return;
        }
        if (C65210PiY.LIZ()) {
            String str = LJLLILLLL;
            int downloadId = downloadTask.getDownloadId();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AidlService == null:");
            if (this.LJLJLLL == null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            C65210PiY.LIZLLL(downloadId, str, "tryDownload", X1D.LIZIZ(LIZ));
        }
        if (this.LJLJLLL == null) {
            LJFF(downloadTask);
            LJII(C84212X3g.LJ(), this);
            return;
        }
        LJIIIIZZ();
        try {
            this.LJLJLLL.LLLJ(new X2Q(downloadTask));
        } catch (RemoteException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.X36
    public final void LJII(Context context, ServiceConnection serviceConnection) {
        try {
            if (C65210PiY.LIZ()) {
                C65210PiY.LIZIZ(LJLLILLLL, "startService", "BindService");
            }
            Intent intent = new Intent(context, (Class<?>) IndependentProcessDownloadService.class);
            if (X4P.LJIILJJIL()) {
                intent.putExtra("fix_downloader_db_sigbus", X4H.LJFF.LJI("fix_sigbus_downloader_db", false));
            }
            if (serviceConnection != null) {
                C16880lQ.LLLJL(context, intent, serviceConnection, 1);
            }
            C16880lQ.LLLL(context, intent);
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC84202X2w x2i;
        boolean z;
        if (C65210PiY.LIZ()) {
            C65210PiY.LIZIZ(LJLLILLLL, "onServiceConnected", "Run");
        }
        InterfaceC84202X2w interfaceC84202X2w = null;
        if (iBinder == null) {
            x2i = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC84202X2w)) {
                x2i = (InterfaceC84202X2w) queryLocalInterface;
            } else {
                x2i = new X2I(iBinder);
            }
        }
        this.LJLJLLL = x2i;
        InterfaceC84203X2x interfaceC84203X2x = this.LJLL;
        if (interfaceC84203X2x != null) {
            C84201X2v c84201X2v = (C84201X2v) interfaceC84203X2x;
            if (iBinder != null) {
                IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.ss.android.socialbase.downloader.downloader.IDownloadAidlService");
                if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof InterfaceC84202X2w)) {
                    interfaceC84202X2w = (InterfaceC84202X2w) queryLocalInterface2;
                } else {
                    interfaceC84202X2w = new X2I(iBinder);
                }
            }
            c84201X2v.LIZ = interfaceC84202X2w;
            if (X4P.LJIILJJIL()) {
                X39 x39 = new X39();
                if (c84201X2v.LIZ != null) {
                    try {
                        c84201X2v.LIZ.LLILLL(new BinderC84161X1h(x39));
                    } catch (RemoteException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        }
        if (C65210PiY.LIZ()) {
            String str = LJLLILLLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AidlService!=null");
            if (this.LJLJLLL != null) {
                z = true;
            } else {
                z = false;
            }
            LIZ.append(z);
            LIZ.append(" pendingTasks.size:");
            LIZ.append(this.LJLILLLLZI.size());
            C65210PiY.LIZIZ(str, "onServiceConnected", X1D.LIZIZ(LIZ));
        }
        if (this.LJLJLLL != null) {
            X3K LJ = X3K.LJ();
            synchronized (LJ.LIZIZ) {
                Iterator it = ((ArrayList) LJ.LIZIZ).iterator();
                while (it.hasNext()) {
                    X35 x35 = (X35) it.next();
                    if (x35 != null) {
                        x35.LIZ();
                    }
                }
            }
            this.LJLJI = true;
            this.LJLJJL = false;
            int i = this.LJLLI;
            if (i != -1) {
                try {
                    this.LJLJLLL.setLogLevel(i);
                } catch (RemoteException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            if (this.LJLJLLL != null) {
                LJIIIIZZ();
            }
        }
    }
}
