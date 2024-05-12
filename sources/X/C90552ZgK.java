package X;

import Y.IDRunnableS2S0400000_24;
import Y.IDRunnableS86S0100000_24;
import android.content.Context;
import android.text.TextUtils;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Dispatcher;
import com.byted.cast.common.LogDumper;
import com.byted.cast.common.Logger;
import com.byted.cast.common.TeaEventTrack;
import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.api.ISendResultListener;
import com.byted.cast.common.config.Config;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.IMessageListener;
import com.byted.cast.common.sink.IMirrorListener;
import com.byted.cast.common.sink.IServerListener;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ZgK, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90552ZgK {
    public static volatile C90552ZgK LIZIZ;
    public final C90547ZgF LIZ;

    public static C90552ZgK LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C90552ZgK.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C90552ZgK();
                }
            }
        }
        return LIZIZ;
    }

    public C90552ZgK() {
        TeaEventTrack.getInstance().isSource = Boolean.FALSE;
        Dispatcher.enableCompatibleConfig("sink");
        LogDumper.enableCompatibleConfig("sink");
        String uuid = UUID.randomUUID().toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sink_");
        LIZ.append(uuid);
        this.LIZ = new C90547ZgF(new ContextManager.CastContext(X1D.LIZIZ(LIZ)));
    }

    public final void LIZ() {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS86S0100000_24(this, 43));
    }

    public final void LJIIIIZZ() {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS86S0100000_24(this, 44));
    }

    public final void LJIIIZ() {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS86S0100000_24(this, 45));
    }

    public final void LJ(IMessageListener iMessageListener) {
        C90547ZgF c90547ZgF = this.LIZ;
        ICastSink iCastSink = c90547ZgF.LIZ;
        if (iCastSink != null) {
            iCastSink.setMessageListener(iMessageListener);
        }
        ICastSink iCastSink2 = c90547ZgF.LIZLLL;
        if (iCastSink2 != null) {
            iCastSink2.setMessageListener(iMessageListener);
        }
        ICastSink iCastSink3 = c90547ZgF.LIZIZ;
        if (iCastSink3 != null) {
            iCastSink3.setMessageListener(iMessageListener);
        }
    }

    public final void LJFF(IMirrorListener iMirrorListener) {
        C90547ZgF c90547ZgF = this.LIZ;
        c90547ZgF.getClass();
        C90851Zl9 c90851Zl9 = new C90851Zl9(iMirrorListener);
        c90547ZgF.LJIL = c90851Zl9;
        ICastSink iCastSink = c90547ZgF.LIZLLL;
        if (iCastSink != null) {
            iCastSink.setMirrorListener(c90851Zl9);
        }
        ICastSink iCastSink2 = c90547ZgF.LIZJ;
        if (iCastSink2 != null) {
            iCastSink2.setMirrorListener(c90851Zl9);
        }
    }

    public final void LJII(IServerListener iServerListener) {
        C90547ZgF c90547ZgF = this.LIZ;
        c90547ZgF.LJIJJLI = iServerListener;
        C90854ZlC c90854ZlC = new C90854ZlC(c90547ZgF);
        ZYI zyi = c90547ZgF.LJII;
        ZWQ zwq = zyi.LIZ;
        if (zwq != null) {
            zwq.LJFF = c90854ZlC;
        }
        zyi.LIZJ.getClass();
        Iterator it = ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).keySet().iterator();
        while (it.hasNext()) {
            ((ICastSink) ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).get(it.next())).setServerListener(c90854ZlC);
        }
        Iterator it2 = ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).keySet().iterator();
        while (it2.hasNext()) {
            ((ICastSink) ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).get(it2.next())).setServerListener(iServerListener);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[LOOP:0: B:36:0x0092->B:38:0x0098, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r8, java.lang.Object... r9) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90552ZgK.LJI(int, java.lang.Object[]):void");
    }

    public final void LIZJ(Context context, Config config, IInitListener iInitListener) {
        Dispatcher.getInstance().runOnByteCastThread(new IDRunnableS2S0400000_24(iInitListener, this, context, config, 3));
    }

    public final void LIZLLL(CastInfo castInfo, String str, ISendResultListener iSendResultListener) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C90547ZgF c90547ZgF = this.LIZ;
        c90547ZgF.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send CastInfo:");
        LIZ.append(castInfo);
        LIZ.append(", message:");
        LIZ.append(str);
        Logger.d("ByteCastSinkImpl", X1D.LIZIZ(LIZ));
        Iterator it = ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).keySet().iterator();
        while (it.hasNext()) {
            ((ICastSink) ((ConcurrentHashMap) c90547ZgF.LJIIIIZZ).get(it.next())).send(castInfo, str, iSendResultListener);
        }
    }
}
