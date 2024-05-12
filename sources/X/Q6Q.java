package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* loaded from: classes12.dex */
public final class Q6Q implements ServiceConnection {
    public final Intent LJLIL;
    public final Context LJLILLLLZI;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.LJLILLLLZI.unbindService(this);
        } catch (Throwable unused) {
        }
    }

    public Q6Q(Intent intent, Context context) {
        this.LJLIL = intent;
        this.LJLILLLLZI = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger = new Messenger(iBinder);
        Message message = new Message();
        try {
            try {
                message.what = 101;
                message.getData().putParcelable("intent", this.LJLIL);
                messenger.send(message);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            try {
                this.LJLILLLLZI.unbindService(this);
            } catch (Throwable unused) {
            }
        }
    }
}
