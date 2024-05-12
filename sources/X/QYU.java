package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class QYU implements ServiceConnection {
    public int LJLIL;
    public QYZ LJLJI;
    public final /* synthetic */ QYT LJLJJLL;
    public final Messenger LJLILLLLZI = new Messenger(new QYM(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.QYV
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            QYU qyu = QYU.this;
            int i = message.arg1;
            android.util.Log.isLoggable("MessengerIpcClient", 3);
            synchronized (qyu) {
                QYY<?> qyy = qyu.LJLJJL.get(i);
                if (qyy != null) {
                    qyu.LJLJJL.remove(i);
                    qyu.LIZJ();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        qyy.LIZJ(new C67180QYe("Not supported by GmsCore", null));
                        return true;
                    }
                    qyy.LIZ(data);
                    return true;
                }
                return true;
            }
        }
    }));
    public final Queue<QYY<?>> LJLJJI = new ArrayDeque();
    public final SparseArray<QYY<?>> LJLJJL = new SparseArray<>();

    public final synchronized void LIZJ() {
        if (this.LJLIL == 2 && ((ArrayDeque) this.LJLJJI).isEmpty() && this.LJLJJL.size() == 0) {
            this.LJLIL = 3;
            QCV.LIZIZ().LIZJ(this.LJLJJLL.LIZ, this);
        }
    }

    public final synchronized boolean LIZLLL(QYY<?> qyy) {
        boolean z;
        int i = this.LJLIL;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                ((ArrayDeque) this.LJLJJI).add(qyy);
                this.LJLJJLL.LIZIZ.execute(new RunnableC67185QYj(i2, this));
                return true;
            }
            ((ArrayDeque) this.LJLJJI).add(qyy);
            return true;
        }
        ((ArrayDeque) this.LJLJJI).add(qyy);
        if (this.LJLIL == 0) {
            z = true;
        } else {
            z = false;
        }
        QH7.LJIIJJI(z);
        this.LJLIL = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!QCV.LIZIZ().LIZ(this.LJLJJLL.LIZ, intent, this, 1)) {
                LIZ(0, "Unable to bind to service");
            } else {
                this.LJLJJLL.LIZIZ.schedule(new RunnableC67190QYo(i2, this), 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            LIZIZ(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LJLJJLL.LIZIZ.execute(new RunnableC64270PKg(1, this));
    }

    public final synchronized void LIZ(int i, String str) {
        LIZIZ(i, str, null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.LJLJJLL.LIZIZ.execute(new Runnable() { // from class: X.QYW
            public final void LIZ() {
                QYU qyu = QYU.this;
                IBinder iBinder2 = iBinder;
                synchronized (qyu) {
                    int i = 0;
                    if (iBinder2 == null) {
                        qyu.LIZ(0, "Null service connection");
                        return;
                    }
                    try {
                        qyu.LJLJI = new QYZ(iBinder2);
                        qyu.LJLIL = 2;
                        qyu.LJLJJLL.LIZIZ.execute(new RunnableC67185QYj(i, qyu));
                    } catch (RemoteException e) {
                        qyu.LIZ(0, e.getMessage());
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    LIZ();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public final synchronized void LIZIZ(int i, String str, Throwable th) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.LJLIL = 4;
                return;
            }
            this.LJLIL = 4;
            QCV.LIZIZ().LIZJ(this.LJLJJLL.LIZ, this);
            C67180QYe c67180QYe = new C67180QYe(str, th);
            Iterator it = ((ArrayDeque) this.LJLJJI).iterator();
            while (it.hasNext()) {
                ((QYY) it.next()).LIZJ(c67180QYe);
            }
            ((ArrayDeque) this.LJLJJI).clear();
            for (int i3 = 0; i3 < this.LJLJJL.size(); i3++) {
                this.LJLJJL.valueAt(i3).LIZJ(c67180QYe);
            }
            this.LJLJJL.clear();
            return;
        }
        throw new IllegalStateException();
    }
}
