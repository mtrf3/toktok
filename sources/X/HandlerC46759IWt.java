package X;

import Y.ARunnableS44S0100000_8;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.IWt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class HandlerC46759IWt extends Handler {
    public final InterfaceC46747IWh LIZ;
    public volatile int LIZIZ;
    public final InterfaceC46764IWy LIZJ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC46747IWh interfaceC46747IWh = this.LIZ;
        if (interfaceC46747IWh == null) {
            return;
        }
        switch (message.what) {
            case 1:
                interfaceC46747IWh.LJLIIIL((IX4) message.obj);
                return;
            case 2:
            case 15:
            default:
                return;
            case 3:
                interfaceC46747IWh.start();
                return;
            case 4:
                Object obj = message.obj;
                if (obj == null) {
                    interfaceC46747IWh.resume();
                    return;
                } else {
                    interfaceC46747IWh.LJLILLLLZI((String) obj);
                    return;
                }
            case 5:
                interfaceC46747IWh.pause();
                return;
            case 6:
                interfaceC46747IWh.stop();
                return;
            case 7:
                interfaceC46747IWh.release();
                return;
            case 8:
                interfaceC46747IWh.LJJLIL();
                return;
            case 9:
                Pair pair = (Pair) message.obj;
                if (pair == null) {
                    return;
                }
                interfaceC46747IWh.setVolume(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
                return;
            case 10:
                removeMessages(12);
                Looper looper = getLooper();
                if (looper != null && looper != C16880lQ.LLJJJJ()) {
                    looper.quit();
                }
                InterfaceC46764IWy interfaceC46764IWy = this.LIZJ;
                if (interfaceC46764IWy == null) {
                    return;
                }
                C46760IWu c46760IWu = (C46760IWu) interfaceC46764IWy;
                c46760IWu.LIZ.LJ.post(new ARunnableS44S0100000_8(c46760IWu, 74));
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                interfaceC46747IWh.LJJIIJ(((Float) message.obj).floatValue());
                return;
            case 12:
                interfaceC46747IWh.LJLJJL();
                Object value = IZ8.LLLZLL.getValue();
                o.LJIIIIZZ(value, "<get-PROGRESS_CLEAR_OLD_MSG_BEFORE_NEW_MSG>(...)");
                if (((Boolean) value).booleanValue()) {
                    removeMessages(12);
                }
                sendEmptyMessageDelayed(12, this.LIZIZ);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                Pair pair2 = (Pair) message.obj;
                if (pair2 == null) {
                    return;
                }
                interfaceC46747IWh.LJLJLLL(((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
                return;
            case 14:
                interfaceC46747IWh.setDisplay((SurfaceHolder) message.obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                interfaceC46747IWh.init();
                return;
            case 17:
                C74152vb c74152vb = (C74152vb) message.obj;
                if (c74152vb == null) {
                    return;
                }
                interfaceC46747IWh.LJI(c74152vb);
                return;
        }
    }

    public HandlerC46759IWt(C46760IWu c46760IWu, Looper looper, InterfaceC46747IWh interfaceC46747IWh) {
        super(looper);
        this.LIZIZ = 300;
        this.LIZ = interfaceC46747IWh;
        this.LIZJ = c46760IWu;
    }
}
