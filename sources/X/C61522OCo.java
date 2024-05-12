package X;

import Y.IDHandlerS22S0100000_10;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.geckox.model.DeploymentModelLoop;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OCo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61522OCo {
    public final IDHandlerS22S0100000_10 LIZ;
    public final String LIZIZ;
    public int LIZLLL;
    public C61527OCt LJFF;
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final java.util.Map<String, C61526OCs> LJ = new ConcurrentHashMap();

    public final void LIZJ() {
        int i = this.LIZLLL;
        if (i == 0 || this.LIZ.hasMessages(i) || this.LIZJ.get()) {
            return;
        }
        OC6.LIZ("gecko-debug-tag", "[loop]start loop,interval level:", this.LIZIZ, ",combine deployments:", this.LJ);
        this.LIZJ.set(true);
        Message obtainMessage = this.LIZ.obtainMessage();
        obtainMessage.what = this.LIZLLL;
        obtainMessage.arg1 = 3;
        this.LIZ.sendMessageDelayed(obtainMessage, r0 * 1000);
    }

    public final C61526OCs LIZ(String str) {
        C61526OCs c61526OCs = (C61526OCs) ((ConcurrentHashMap) this.LJ).get(str);
        if (c61526OCs == null) {
            c61526OCs = new C61526OCs(new HashMap(), new DeploymentModelLoop());
        }
        if (c61526OCs.LIZIZ == null) {
            c61526OCs.LIZIZ = new DeploymentModelLoop();
        }
        return c61526OCs;
    }

    public final void LIZIZ(int i) {
        if (this.LIZLLL == i) {
            return;
        }
        if (this.LIZJ.get()) {
            this.LIZ.removeMessages(this.LIZLLL);
            this.LIZJ.set(false);
        }
        this.LIZLLL = i;
        LIZJ();
    }

    public C61522OCo(String str, int i) {
        this.LIZIZ = str;
        this.LIZLLL = i;
        HandlerThread handlerThread = new HandlerThread("combine", 3);
        handlerThread.start();
        this.LIZ = new IDHandlerS22S0100000_10(this, handlerThread.getLooper(), 1);
    }
}
