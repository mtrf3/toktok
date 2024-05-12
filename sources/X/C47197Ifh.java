package X;

import Y.ARunnableS27S0200000_8;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ifh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47197Ifh extends AbstractC47210Ifu {
    public static final ExecutorService LJIILLIIL = C16880lQ.LLLLZLLIL();
    public final InterfaceC46732IVs LJ;
    public final InterfaceC47225Ig9 LJI;
    public final boolean LJII;
    public C46539IOh LJIIIIZZ;
    public IWH LJIIIZ;
    public final HandlerThread LJIIJ;
    public volatile Handler LJIIJJI;
    public String LJIIL;
    public C47231IgF LJIILIIL;
    public final C47199Ifj LJFF = new C47199Ifj();
    public final C47208Ifs LJIILJJIL = new C47208Ifs(this);
    public final C47212Ifw LJIILL = new C47212Ifw(this);

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZIZ(IZ2 iz2) {
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJ(InterfaceC197787pW interfaceC197787pW) {
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void pause() {
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void resume() {
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void stop() {
    }

    public C47197Ifh() {
        this.LJI = null;
        HandlerThread handlerThread = new HandlerThread("preload-strategy");
        this.LJIIJ = handlerThread;
        handlerThread.start();
        this.LJ = C47242IgQ.LIZ();
        this.LJI = C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().getPreloadStrategy();
        boolean canPreload = C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload();
        this.LJII = canPreload;
        C07670Rv.LIZLLL("preload enable:", canPreload);
    }

    @Override // X.AbstractC47210Ifu
    public final boolean LJIIJJI() {
        return C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().canPreload();
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void release() {
        super.release();
        this.LJIIJ.quit();
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LIZ(InterfaceC46811IYt interfaceC46811IYt) {
        if (!this.LJII) {
            return;
        }
        C47199Ifj c47199Ifj = this.LJFF;
        c47199Ifj.LIZIZ = c47199Ifj.LIZJ;
        c47199Ifj.LIZJ = interfaceC46811IYt;
        System.currentTimeMillis();
        int LIZ = c47199Ifj.LIZ(c47199Ifj.LIZJ, c47199Ifj.LIZJ());
        c47199Ifj.LJ = LIZ;
        if (LIZ == -1) {
            ListIterator listIterator = new ArrayList(c47199Ifj.LIZ.entrySet()).listIterator(c47199Ifj.LIZ.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) listIterator.previous();
                int LIZ2 = c47199Ifj.LIZ(c47199Ifj.LIZJ, (List) entry.getValue());
                if (LIZ2 > -1) {
                    c47199Ifj.LIZLLL = (String) entry.getKey();
                    c47199Ifj.LJ = LIZ2;
                    break;
                }
            }
        }
        System.currentTimeMillis();
        this.LJIIIIZZ.LIZ(this.LJIILJJIL);
    }

    @Override // X.AbstractC47210Ifu
    public final void LIZLLL(C46539IOh c46539IOh) {
        this.LJIIIIZZ = c46539IOh;
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJFF(String str) {
        this.LJFF.LIZ.remove(str);
        this.LJ.removeDownloadProgressListener(this.LJIILL);
    }

    @Override // X.AbstractC47210Ifu
    public final void LJIIIIZZ(IWH iwh) {
        this.LJIIIZ = iwh;
    }

    public final void LJIILIIL(List<C47227IgB> list) {
        Object value = IZ8.M.getValue();
        o.LJIIIIZZ(value, "<get-isPreloadStrategyUseSameThread>(...)");
        if (((Boolean) value).booleanValue()) {
            LJIILLIIL.execute(new ARunnableS27S0200000_8(this, list, 63));
            return;
        }
        synchronized (this) {
            if (this.LJIIJJI == null) {
                Looper looper = this.LJIIJ.getLooper();
                if (looper != null) {
                    this.LJIIJJI = new Handler(looper);
                }
            }
            Handler handler = this.LJIIJJI;
            if (handler != null) {
                handler.post(new ARunnableS27S0200000_8(this, list, 64));
                return;
            }
        }
        LJIILJJIL(list);
    }

    public final void LJIILJJIL(List<C47227IgB> list) {
        for (C47227IgB c47227IgB : list) {
            int i = c47227IgB.LIZIZ;
            if (i > 0) {
                C47199Ifj c47199Ifj = this.LJFF;
                c47199Ifj.getClass();
                ArrayList arrayList = new ArrayList();
                if (c47199Ifj.LJ != -1) {
                    try {
                        List<InterfaceC46811IYt> LIZJ = c47199Ifj.LIZJ();
                        int i2 = c47199Ifj.LJ;
                        if (i2 > c47199Ifj.LIZIZ(c47199Ifj.LIZIZ, c47199Ifj.LIZJ()) && i2 > -1) {
                            int i3 = 0;
                            do {
                                int LIZIZ = AnonymousClass036.LIZIZ(c47199Ifj.LJ, 1, i3, 0);
                                if (LIZIZ < LIZJ.size()) {
                                    arrayList.add(ListProtector.get(LIZJ, LIZIZ));
                                }
                                i3++;
                            } while (i3 < i);
                        } else {
                            int i4 = 0;
                            do {
                                int i5 = (c47199Ifj.LJ - 1) - i4;
                                if (i5 >= 0 && i5 < LIZJ.size()) {
                                    arrayList.add(ListProtector.get(LIZJ, i5));
                                }
                                i4++;
                            } while (i4 < i);
                        }
                    } catch (Exception unused) {
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start preload aweme list, size : ");
                LIZ.append(arrayList.size());
                X1D.LIZIZ(LIZ);
                if (C1DG.LIZ().getConfig().getPlayerGlobalConfig().isPrepareAhead() && arrayList.size() != 0) {
                    InterfaceC46811IYt interfaceC46811IYt = (InterfaceC46811IYt) ListProtector.get(arrayList, 0);
                    SimVideoUrlModel LJFF = IXM.LJFF(C46810IYs.LIZIZ(interfaceC46811IYt));
                    if (LJFF != null && C47242IgQ.LIZ().cacheSize(LJFF) > 204800) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("prepareNext, key:");
                        LIZ2.append(interfaceC46811IYt.getKey());
                        X1D.LIZIZ(LIZ2);
                        C46745IWf LIZ3 = C46810IYs.LIZ(interfaceC46811IYt, null);
                        LIZ3.LJIIZILJ = "preload_strategy_handler";
                        this.LJIIIZ.LJIIIIZZ(LIZ3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    SimVideoUrlModel LJFF2 = IXM.LJFF(C46810IYs.LIZIZ((InterfaceC46811IYt) it.next()));
                    if (LJFF2 != null && LJFF2.getUrlList() != null && LJFF2.getUrlList().size() != 0) {
                        if (TextUtils.equals(LJFF2.getUri(), this.LJIIL) || TextUtils.equals(LJFF2.getSourceId(), this.LJIIL)) {
                            C16880lQ.LLLZ("preload same video, skip!!! --> currentKey:%s, url:%s", new Object[]{this.LJIIL, ListProtector.get(LJFF2.getUrlList(), 0)});
                        } else {
                            int i6 = c47227IgB.LIZJ;
                            C16880lQ.LLLZ("start preload --> URI:%s, url:%s", new Object[]{LJFF2.getUri(), ListProtector.get(LJFF2.getUrlList(), 0)});
                            C16880lQ.LLLZ("trigger preload: URI:%s, url:%s", new Object[]{LJFF2.getUri(), ListProtector.get(LJFF2.getUrlList(), 0)});
                            this.LJ.preload(LJFF2, i6);
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC47210Ifu, X.IZ0
    public final void LJI(String str, List<InterfaceC46811IYt> list) {
        C47199Ifj c47199Ifj;
        InterfaceC46811IYt interfaceC46811IYt;
        List<InterfaceC46813IYv> LJIIJ;
        SimVideoUrlModel LIZJ;
        if (!this.LJII || list.size() == 0) {
            return;
        }
        boolean z = false;
        if (C1DG.LIZ().getConfig().getVideoPreloaderManagerConfig().enableLoadMorePreload() && (interfaceC46811IYt = (c47199Ifj = this.LJFF).LIZJ) != null && (LJIIJ = interfaceC46811IYt.LJIIJ()) != null && LJIIJ.size() != 0 && (LIZJ = C46810IYs.LIZJ(c47199Ifj.LIZJ, (InterfaceC46813IYv) ListProtector.get(LJIIJ, 0))) != null && this.LJ.isCacheCompleted(LIZJ)) {
            List<InterfaceC46811IYt> LIZJ2 = this.LJFF.LIZJ();
            if (list.size() != 0 && LIZJ2.size() != 0 && list.size() > LIZJ2.size() && TextUtils.equals(((InterfaceC46811IYt) ListProtector.get(list, 0)).getKey(), ((InterfaceC46811IYt) ListProtector.get(LIZJ2, 0)).getKey())) {
                z = true;
            }
        }
        C47199Ifj c47199Ifj2 = this.LJFF;
        c47199Ifj2.getClass();
        if (!TextUtils.isEmpty(str) && list.size() != 0) {
            if (c47199Ifj2.LIZ.get(str) == null) {
                c47199Ifj2.LIZ.put(str, new ArrayList());
            }
            c47199Ifj2.LIZLLL = str;
            c47199Ifj2.LIZJ().clear();
            c47199Ifj2.LIZJ().addAll(list);
        }
        this.LJ.addDownloadProgressListener(this.LJIILL);
        if (!z) {
            return;
        }
        LJIIL(0L, 0L);
    }

    public final void LJIIL(long j, long j2) {
        List<C47227IgB> LIZ;
        ArrayList arrayList = new ArrayList();
        InterfaceC47225Ig9 interfaceC47225Ig9 = this.LJI;
        if (interfaceC47225Ig9 != null && (LIZ = interfaceC47225Ig9.LIZ()) != null && LIZ.size() > 0) {
            arrayList.addAll(LIZ);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C47227IgB c47227IgB = (C47227IgB) it.next();
            if (100 * j2 >= c47227IgB.LIZ * j) {
                arrayList2.add(c47227IgB);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        LJIILIIL(arrayList2);
    }
}
