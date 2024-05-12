package X;

import Y.ARunnableS2S1110000_8;
import Y.ARunnableS44S0100000_8;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.Iju, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47458Iju extends PthreadThread {
    public final Queue<C47461Ijx> LJLIL;
    public boolean LJLILLLLZI;
    public final Queue<C47461Ijx> LJLJI;
    public final Queue<C47461Ijx> LJLJJI;
    public final C47457Ijt LJLJJL;
    public final /* synthetic */ VideoCachePreloader LJLJJLL;

    public final void LJFF() {
        while (this.LJLILLLLZI) {
            synchronized (this) {
                if (!this.LJLJJI.isEmpty() && this.LJLJJLL.config.canPreload()) {
                    LJI();
                }
                while (!this.LJLIL.isEmpty()) {
                    C47461Ijx c47461Ijx = (C47461Ijx) ((LinkedBlockingQueue) this.LJLIL).poll();
                    if (c47461Ijx != null) {
                        int i = c47461Ijx.LIZ;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            C48059Itb LIZIZ = C48059Itb.LIZIZ();
                                            LIZIZ.getClass();
                                            C48100IuG.LJII(new ARunnableS44S0100000_8(LIZIZ, 124));
                                            this.LJLILLLLZI = false;
                                        }
                                    } else {
                                        C48059Itb LIZIZ2 = C48059Itb.LIZIZ();
                                        LIZIZ2.getClass();
                                        C48100IuG.LJII(new ARunnableS44S0100000_8(LIZIZ2, 124));
                                        if (C47455Ijr.LIZ != null) {
                                            C47455Ijr.LIZ.LJI();
                                        }
                                    }
                                } else {
                                    C48059Itb LIZIZ3 = C48059Itb.LIZIZ();
                                    LIZIZ3.getClass();
                                    C48100IuG.LJII(new ARunnableS44S0100000_8(LIZIZ3, 124));
                                }
                            } else {
                                C48059Itb LIZIZ4 = C48059Itb.LIZIZ();
                                String str = c47461Ijx.LIZIZ;
                                LIZIZ4.getClass();
                                if (!TextUtils.isEmpty(str)) {
                                    C48100IuG.LJII(new ARunnableS2S1110000_8(LIZIZ4, str, 2));
                                }
                            }
                        } else if (c47461Ijx.LJI == null) {
                            String[] strArr = c47461Ijx.LIZJ;
                            if (strArr != null && strArr.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String str2 : c47461Ijx.LIZJ) {
                                    if (C48100IuG.LJIIIZ(str2)) {
                                        arrayList.add(str2);
                                    }
                                }
                                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                if (c47461Ijx.LIZLLL <= 0) {
                                    C48059Itb LIZIZ5 = C48059Itb.LIZIZ();
                                    String str3 = c47461Ijx.LIZIZ;
                                    LIZIZ5.getClass();
                                    LIZIZ5.LJ(C48059Itb.LJIIJJI.LIZ, str3, strArr2);
                                } else {
                                    int PlayerAbPreloadSizeOffsetThresholdExp = this.LJLJJLL.config.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                                    int i2 = c47461Ijx.LJ;
                                    int i3 = c47461Ijx.LIZLLL;
                                    if (i2 > i3 && i2 - i3 <= PlayerAbPreloadSizeOffsetThresholdExp) {
                                        c47461Ijx.LIZLLL = i2;
                                    }
                                    C48059Itb LIZIZ6 = C48059Itb.LIZIZ();
                                    LIZIZ6.getClass();
                                    C47460Ijw c47460Ijw = new C47460Ijw(LIZIZ6);
                                    c47460Ijw.LIZIZ = c47461Ijx.LIZIZ;
                                    c47460Ijw.LIZ = c47461Ijx.LIZLLL;
                                    c47460Ijw.LIZJ = strArr2;
                                    c47460Ijw.LIZ();
                                }
                            }
                        } else if (c47461Ijx.LIZLLL <= 0) {
                            C48059Itb LIZIZ7 = C48059Itb.LIZIZ();
                            String str4 = c47461Ijx.LIZIZ;
                            C47453Ijp c47453Ijp = c47461Ijx.LJI;
                            LIZIZ7.getClass();
                            LIZIZ7.LIZLLL(C48059Itb.LJIIJJI.LIZ, str4, c47453Ijp, null);
                        } else {
                            C48059Itb LIZIZ8 = C48059Itb.LIZIZ();
                            LIZIZ8.getClass();
                            C47460Ijw c47460Ijw2 = new C47460Ijw(LIZIZ8);
                            c47460Ijw2.LIZ = c47461Ijx.LIZLLL;
                            c47460Ijw2.LIZLLL = c47461Ijx.LJI;
                            c47460Ijw2.LIZ();
                        }
                        LIZLLL();
                        c47461Ijx.LIZJ = null;
                        c47461Ijx.LIZIZ = null;
                        c47461Ijx.LIZ = -1;
                        c47461Ijx.LJII = null;
                        c47461Ijx.LIZLLL = -1;
                        c47461Ijx.LJFF = false;
                        ((ArrayBlockingQueue) this.LJLJI).offer(c47461Ijx);
                    }
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public static void LIZLLL() {
        if (!C46982IcE.LIZIZ().isDebug() || C16880lQ.LLLLIIIILLL() != C16880lQ.LLJJJJ().getThread()) {
        } else {
            throw new IllegalStateException("cannot run on the main thread!");
        }
    }

    public final void LJI() {
        LIZLLL();
        while (true) {
            C47461Ijx c47461Ijx = (C47461Ijx) ((LinkedBlockingQueue) this.LJLJJI).poll();
            if (c47461Ijx != null) {
                VideoCachePreloader videoCachePreloader = this.LJLJJLL;
                if (videoCachePreloader.mLazyGetUrlsMode) {
                    SimVideoUrlModel simVideoUrlModel = c47461Ijx.LJII;
                    int i = c47461Ijx.LIZLLL;
                    String str = VideoCachePreloader.TAG;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("flushUnresolvedTasks: model:");
                    LIZ.append(simVideoUrlModel);
                    LIZ.append(", preloadSize:");
                    LIZ.append(i);
                    X1D.LIZIZ(LIZ);
                    if (C46986IcI.LIZ != null) {
                        C1JX.LJIIIIZZ("<PreloadModule>", str);
                    }
                    c47461Ijx.LJI = new C47453Ijp(this, simVideoUrlModel, i);
                    LIZLLL();
                    ((LinkedBlockingQueue) this.LJLIL).offer(c47461Ijx);
                    notify();
                } else {
                    IY1 LIZ2 = videoCachePreloader.config.createVideoUrlProcessor().LIZ(c47461Ijx.LJII, IXN.LIZJ.getPlayerType());
                    if (LIZ2 != null) {
                        c47461Ijx.LIZJ = LIZ2.LIZ;
                        c47461Ijx.LIZIZ = LIZ2.LIZJ;
                        c47461Ijx.LJII = null;
                        LIZLLL();
                        ((LinkedBlockingQueue) this.LJLIL).offer(c47461Ijx);
                        notify();
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJFF();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47458Iju(VideoCachePreloader videoCachePreloader) {
        super("VideoCachePreloader$PreLoadThread");
        this.LJLJJLL = videoCachePreloader;
        this.LJLJI = new ArrayBlockingQueue(10);
        this.LJLIL = new LinkedBlockingQueue();
        this.LJLILLLLZI = true;
        this.LJLJJI = new LinkedBlockingQueue();
        this.LJLJJL = new C47457Ijt(this);
    }

    public final void LJ(int i) {
        String str = VideoCachePreloader.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pool: ");
        LIZ.append(((ArrayBlockingQueue) this.LJLJI).size());
        C46474ILu.LIZ(str, X1D.LIZIZ(LIZ));
        C47461Ijx c47461Ijx = (C47461Ijx) ((ArrayBlockingQueue) this.LJLJI).poll();
        if (c47461Ijx == null) {
            c47461Ijx = new C47461Ijx();
        }
        c47461Ijx.LIZIZ = null;
        c47461Ijx.LIZ = i;
        c47461Ijx.LIZJ = null;
        c47461Ijx.LJFF = true;
        C47457Ijt c47457Ijt = this.LJLJJL;
        c47457Ijt.LIZ.post(new RunnableC47459Ijv(c47457Ijt.LIZIZ, c47461Ijx));
    }

    public final C47461Ijx LJII(int i, SimVideoUrlModel simVideoUrlModel, int i2) {
        String str = VideoCachePreloader.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pool: ");
        LIZ.append(((ArrayBlockingQueue) this.LJLJI).size());
        C46474ILu.LIZ(str, X1D.LIZIZ(LIZ));
        C47461Ijx c47461Ijx = (C47461Ijx) ((ArrayBlockingQueue) this.LJLJI).poll();
        if (c47461Ijx == null) {
            c47461Ijx = new C47461Ijx();
        }
        c47461Ijx.LIZ = i;
        c47461Ijx.LJII = simVideoUrlModel;
        c47461Ijx.LIZLLL = i2;
        if (simVideoUrlModel != null) {
            c47461Ijx.LJ = (int) simVideoUrlModel.getSize();
        }
        return c47461Ijx;
    }
}
