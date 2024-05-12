package X;

import Y.IDHandlerS25S0100000_15;
import android.os.HandlerThread;
import android.os.Message;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XSy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84880XSy extends C84859XSd {
    public IDHandlerS25S0100000_15 LJIIJ;
    public HandlerThread LJIIJJI;
    public XTE LJIIL;
    public XT6 LJIILIIL;
    public XTA LJIILJJIL;

    @Override // X.C84859XSd
    public final void LIZJ() {
        XT0 xt0 = this.LJIIIIZZ;
        if (xt0 != null) {
            xt0.cancel();
        }
        if (this.LJIIJ == null) {
            C0R4 c0r4 = this.LIZLLL;
            if (c0r4 != null) {
                c0r4.LIZJ();
                return;
            }
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        this.LJIIJ.sendMessage(obtain);
    }

    public final void LJFF() {
        XT2 xt2;
        XT2 xt22;
        XT2 xt23;
        C0R4 c0r4 = this.LIZLLL;
        XTB xtb = new XTB(this);
        Object obj = c0r4.LIZ;
        XT8 xt8 = (XT8) obj;
        if (xt8 != null && (xt23 = xt8.LIZ) != null) {
            xt23.LJLJJI = xtb;
        }
        XT1 xt1 = new XT1(this);
        XT8 xt82 = (XT8) obj;
        if (xt82 != null && (xt22 = xt82.LIZ) != null) {
            xt22.LJLJJLL = xt1;
        }
        XT5 xt5 = new XT5(this);
        XT8 xt83 = (XT8) obj;
        if (xt83 != null && (xt2 = xt83.LIZ) != null) {
            xt2.LJLJJL = xt5;
        }
    }

    public final void LJI() {
        XT2 xt2;
        XT2 xt22;
        XT2 xt23;
        XT2 xt24;
        XT2 xt25;
        this.LJIIIZ.clear();
        XT0 xt0 = this.LJIIIIZZ;
        if (xt0 != null) {
            xt0.cancel();
        }
        if (this.LIZ != null) {
            this.LIZ = null;
        }
        if (this.LJFF != null) {
            this.LJFF = null;
        }
        C84864XSi c84864XSi = this.LJ;
        C84276X5s c84276X5s = c84864XSi.LJI;
        for (Map.Entry entry : ((ConcurrentHashMap) c84276X5s.LIZ).entrySet()) {
            entry.getKey();
            ((InterfaceC84877XSv) entry.getValue()).release();
        }
        for (Map.Entry entry2 : ((ConcurrentHashMap) c84276X5s.LIZIZ).entrySet()) {
            entry2.getKey();
            ((InterfaceC84877XSv) entry2.getValue()).release();
        }
        ((ConcurrentHashMap) c84276X5s.LIZ).clear();
        ((ConcurrentHashMap) c84276X5s.LIZIZ).clear();
        XSU xsu = c84864XSi.LJII;
        if (xsu != null) {
            xsu.destroy();
        }
        XT8 xt8 = (XT8) this.LIZLLL.LIZ;
        if (xt8 != null && (xt25 = xt8.LIZ) != null) {
            xt25.LJFF();
        }
        HandlerThread handlerThread = this.LJIIJJI;
        if (handlerThread != null) {
            handlerThread.quit();
            this.LJIIJJI = null;
        }
        IDHandlerS25S0100000_15 iDHandlerS25S0100000_15 = this.LJIIJ;
        if (iDHandlerS25S0100000_15 != null) {
            iDHandlerS25S0100000_15.removeCallbacksAndMessages(null);
            this.LJIIJ = null;
        }
        C0R4 c0r4 = this.LIZLLL;
        if (c0r4 != null) {
            Object obj = c0r4.LIZ;
            XT8 xt82 = (XT8) obj;
            if (xt82 != null && (xt24 = xt82.LIZ) != null) {
                xt24.LJLJJLL = null;
            }
            XT8 xt83 = (XT8) obj;
            if (xt83 != null && (xt23 = xt83.LIZ) != null) {
                xt23.LJLJJL = null;
            }
            XT8 xt84 = (XT8) obj;
            if (xt84 != null && (xt22 = xt84.LIZ) != null) {
                xt22.LJLJJI = null;
            }
            XT8 xt85 = (XT8) obj;
            if (xt85 != null && (xt2 = xt85.LIZ) != null) {
                xt2.LJFF();
            }
        }
        this.LJIILIIL = null;
    }

    public final void LJII() {
        LIZJ();
        MusicModel musicModel = this.LJII;
        if (musicModel != null && this.LJIIL != null) {
            String musicId = musicModel.getMusicId();
            XTF xtf = SFS.LJLJL;
            if (xtf == null || !o.LJ(xtf.LIZ, musicId)) {
                return;
            }
            System.currentTimeMillis();
        }
    }

    public C84880XSy(InterfaceC84871XSp interfaceC84871XSp, XT6 xt6) {
        super(interfaceC84871XSp);
        this.LJIILIIL = xt6;
    }

    public final void LJIIIIZZ(MusicModel musicModel, int i) {
        C84879XSx c84879XSx = new C84879XSx(musicModel, i);
        if (musicModel != null) {
            this.LJIILJJIL = new XTA(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.LJIIJJI == null) {
            HandlerThread handlerThread = new HandlerThread("play_music");
            this.LJIIJJI = handlerThread;
            handlerThread.start();
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = new IDHandlerS25S0100000_15(this, this.LJIIJJI.getLooper(), 5);
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = c84879XSx;
        this.LJIIJ.sendMessage(obtain);
    }
}
