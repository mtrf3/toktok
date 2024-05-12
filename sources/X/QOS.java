package X;

import Y.ARunnableS15S0101000_11;
import Y.ARunnableS47S0100000_11;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes12.dex */
public final class QOS implements QOO {
    public long LIZ;
    public long LIZIZ;
    public WeakReference<Context> LIZJ;
    public Messenger LIZLLL;
    public final LinkedBlockingDeque<QOP> LJ;

    public QOS() {
        new ARunnableS47S0100000_11(this, 0);
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LJ = new LinkedBlockingDeque<>();
    }

    public final synchronized void LJ(ComponentName componentName) {
        if (this.LIZLLL == null) {
            LJFF(componentName);
        } else {
            LJI(componentName);
        }
    }

    public final void LJFF(ComponentName componentName) {
        WeakReference<Context> weakReference = this.LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Context context = weakReference.get();
        Logger.debug();
        if (componentName == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(componentName);
            C16880lQ.LLLL(context, intent);
        } catch (Throwable unused) {
        }
        try {
            Intent intent2 = new Intent();
            intent2.setComponent(componentName);
            QOT qot = new QOT(this);
            this.LIZ = SystemClock.uptimeMillis();
            WsConstants.getBindWsChannelServiceListener();
            C16880lQ.LLLJL(context, intent2, qot, 1);
        } catch (Throwable unused2) {
        }
    }

    public final void LJI(ComponentName componentName) {
        QOP poll;
        if (componentName == null) {
            return;
        }
        while (this.LJ.peek() != null && (poll = this.LJ.poll()) != null) {
            try {
                Message message = new Message();
                message.what = poll.LIZJ;
                message.getData().putParcelable(poll.LIZ, poll.LIZIZ);
                try {
                    Logger.debug();
                    Messenger messenger = this.LIZLLL;
                    if (messenger != null) {
                        messenger.send(message);
                    }
                } catch (DeadObjectException unused) {
                    this.LIZLLL = null;
                    this.LJ.offerFirst(poll);
                    SystemClock.uptimeMillis();
                    WsConstants.getBindWsChannelServiceListener();
                    return;
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                return;
            }
        }
    }

    @Override // X.QOO
    public final void LIZ(Context context, SsWsApp ssWsApp) {
        if (context == null) {
            return;
        }
        WeakReference<Context> weakReference = this.LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZJ = new WeakReference<>(C16880lQ.LLLLL(context));
        }
        if (C66455Q6h.LIZIZ(context).LIZJ() && ssWsApp != null) {
            WeakReference<Context> weakReference2 = this.LIZJ;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.LIZJ = new WeakReference<>(C16880lQ.LLLLL(context));
            }
            Logger.debug();
            if (!C66455Q6h.LIZIZ(context).LIZJ()) {
                return;
            }
            try {
                ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
                QOP qop = new QOP();
                qop.LIZ = "ws_app";
                qop.LIZIZ = ssWsApp;
                qop.LIZJ = 0;
                this.LJ.offer(qop);
                LJ(componentName);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.QOO
    public final void LIZIZ(Context context, SsWsApp ssWsApp) {
        if (context != null) {
            WeakReference<Context> weakReference = this.LIZJ;
            if (weakReference == null || weakReference.get() == null) {
                this.LIZJ = new WeakReference<>(C16880lQ.LLLLL(context));
            }
            Logger.debug();
            if (!C66455Q6h.LIZIZ(context).LIZJ()) {
                return;
            }
            WeakReference<Context> weakReference2 = this.LIZJ;
            if (weakReference2 == null || weakReference2.get() == null) {
                this.LIZJ = new WeakReference<>(C16880lQ.LLLLL(context));
            }
            Logger.debug();
            if (!C66455Q6h.LIZIZ(context).LIZJ()) {
                return;
            }
            try {
                ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
                QOP qop = new QOP();
                qop.LIZ = "ws_app";
                qop.LIZIZ = ssWsApp;
                qop.LIZJ = 4;
                this.LJ.offer(qop);
                LJ(componentName);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.QOO
    public final void LIZJ(int i, Context context) {
        if (context == null) {
            return;
        }
        Logger.debug();
        WeakReference<Context> weakReference = this.LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZJ = new WeakReference<>(C16880lQ.LLLLL(context));
        }
        Logger.debug();
        try {
            ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
            QOP qop = new QOP();
            qop.LIZ = "ws_app";
            qop.LIZIZ = new IntegerParcelable(i);
            qop.LIZJ = 1;
            this.LJ.offer(qop);
            LJ(componentName);
        } catch (Throwable unused) {
        }
    }

    @Override // X.QOO
    public final void LIZLLL(Context context, WsChannelMsg wsChannelMsg) {
        if (context == null || wsChannelMsg == null) {
            return;
        }
        WeakReference<Context> weakReference = this.LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZJ = new WeakReference<>(C16880lQ.LLLLL(context));
        }
        Logger.debug();
        if (!C66455Q6h.LIZIZ(context).LIZJ()) {
            return;
        }
        try {
            ComponentName componentName = new ComponentName(context, (Class<?>) WsChannelService.class);
            QOP qop = new QOP();
            qop.LIZ = "payload";
            qop.LIZIZ = wsChannelMsg;
            qop.LIZJ = 5;
            this.LJ.offer(qop);
            LJ(componentName);
        } catch (Throwable unused) {
        }
    }

    public final void LJII(int i, Context context) {
        if (context == null || i <= 0 || i > 3) {
            return;
        }
        WeakReference<Context> weakReference = this.LIZJ;
        if (weakReference == null || weakReference.get() == null) {
            this.LIZJ = new WeakReference<>(C16880lQ.LLLLL(context));
        }
        Logger.debug();
        if (!C66455Q6h.LIZIZ(context).LIZJ()) {
            return;
        }
        RunnableC39007FSp.LIZIZ(new ARunnableS15S0101000_11(context, i, 0));
    }
}
