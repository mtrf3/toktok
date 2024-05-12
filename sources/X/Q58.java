package X;

import Y.IDHandlerS23S0100000_11;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.login.GetTokenLoginMethodHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class Q58 implements ServiceConnection {
    public final Context LJLIL;
    public final IDHandlerS23S0100000_11 LJLILLLLZI;
    public Q57 LJLJI;
    public boolean LJLJJI;
    public Messenger LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;
    public final int LJLJLLL;
    public final String LJLL;

    public final void LIZ(Bundle bundle) {
        if (!this.LJLJJI) {
            return;
        }
        this.LJLJJI = false;
        Q57 q57 = this.LJLJI;
        if (q57 == null) {
            return;
        }
        GetTokenLoginMethodHandler.LJIILIIL(bundle, q57.LIZ, q57.LIZIZ);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        o.LJIIIZ(name, "name");
        this.LJLJJL = null;
        try {
            this.LJLIL.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        LIZ(null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(service, "service");
        this.LJLJJL = new Messenger(service);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.LJLJLJ);
        String str = this.LJLL;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message obtain = Message.obtain((Handler) null, this.LJLJJLL);
        obtain.arg1 = this.LJLJLLL;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.LJLILLLLZI);
        try {
            Messenger messenger = this.LJLJJL;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            LIZ(null);
        }
    }

    public Q58(Context context, String applicationId, String str) {
        o.LJIIIZ(applicationId, "applicationId");
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LJLIL = LLLLL != null ? LLLLL : context;
        this.LJLJJLL = 65536;
        this.LJLJL = 65537;
        this.LJLJLJ = applicationId;
        this.LJLJLLL = 20121101;
        this.LJLL = str;
        this.LJLILLLLZI = new IDHandlerS23S0100000_11(this, 0);
    }
}
