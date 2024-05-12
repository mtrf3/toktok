package X;

import Y.ARunnableS44S0100000_8;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Itb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48059Itb {
    public static volatile C48059Itb LJIIJ;
    public static final C47463Ijz LJIIJJI = new C47463Ijz();
    public final SparseArray<java.util.Map<String, C48071Itn>> LIZ;
    public final BlockingQueue<Runnable> LIZIZ;
    public final PThreadPoolExecutor LIZJ;
    public volatile C47961Is1 LIZLLL;
    public volatile C47935Irb LJ;
    public final List<InterfaceC48063Itf> LJFF;
    public final C48060Itc LJI;
    public volatile long LJII;
    public volatile long LJIIIIZZ;
    public volatile long LJIIIZ;

    public static C48059Itb LIZIZ() {
        if (LJIIJ == null) {
            synchronized (C48059Itb.class) {
                if (LJIIJ == null) {
                    LJIIJ = new C48059Itb();
                }
            }
        }
        return LJIIJ;
    }

    public final boolean LIZJ() {
        synchronized (this.LIZ) {
            for (int i = 0; i < this.LIZ.size(); i++) {
                SparseArray<java.util.Map<String, C48071Itn>> sparseArray = this.LIZ;
                java.util.Map<String, C48071Itn> map = sparseArray.get(sparseArray.keyAt(i));
                if (map != null && map.size() > 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public C48059Itb() {
        SparseArray<java.util.Map<String, C48071Itn>> sparseArray = new SparseArray<>(2);
        this.LIZ = sparseArray;
        this.LJI = new C48060Itc(this);
        this.LJII = 10000L;
        this.LJIIIIZZ = 10000L;
        this.LJIIIZ = 10000L;
        C47463Ijz c47463Ijz = LJIIJJI;
        if (c47463Ijz.LIZIZ == null) {
            c47463Ijz.LIZIZ = new C48058Ita();
        }
        BlockingQueue<Runnable> blockingQueue = c47463Ijz.LIZIZ;
        this.LIZIZ = blockingQueue;
        int max = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        if (max < 1) {
            max = 1;
        } else if (max > 4) {
            max = 4;
        }
        max = C47463Ijz.LIZJ == 1 ? 1 : max;
        PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(max, max, 60L, TimeUnit.SECONDS, blockingQueue, new ThreadFactoryC48064Itg(), new RejectedExecutionHandlerC48062Ite(blockingQueue));
        this.LIZJ = pThreadPoolExecutor;
        if (blockingQueue instanceof C48058Ita) {
            C48058Ita c48058Ita = (C48058Ita) blockingQueue;
            synchronized (c48058Ita) {
                if (c48058Ita.LJLIL == null) {
                    c48058Ita.LJLIL = pThreadPoolExecutor;
                } else {
                    throw new IllegalStateException("You can only call setExecutor() once!");
                }
            }
        }
        this.LJFF = new ArrayList();
        sparseArray.put(0, new HashMap());
        sparseArray.put(1, new HashMap());
    }

    public final void LIZ(int i, String str) {
        C48071Itn c48071Itn;
        synchronized (this.LIZ) {
            java.util.Map<String, C48071Itn> map = this.LIZ.get(i);
            if (map != null) {
                c48071Itn = map.remove(str);
            } else {
                c48071Itn = null;
            }
        }
        if (c48071Itn != null) {
            c48071Itn.LJIIIIZZ();
        }
        if (LIZJ()) {
            C48100IuG.LJIIIIZZ(new ARunnableS44S0100000_8(this, 126));
        }
    }

    public final void LJ(int i, String str, String... strArr) {
        if (TextUtils.isEmpty(str) || strArr == null || strArr.length <= 0) {
            return;
        }
        LIZLLL(i, str, null, new C48091Iu7(C48100IuG.LJFF(strArr)));
    }

    public final void LIZLLL(int i, String str, InterfaceC47454Ijq interfaceC47454Ijq, C48091Iu7 c48091Iu7) {
        C48071Itn LIZ;
        C47935Irb c47935Irb = this.LJ;
        C47961Is1 c47961Is1 = this.LIZLLL;
        if (c47935Irb == null || c47961Is1 == null) {
            C48841JEv.LJIIIZ("TAG_PROXY_Preloader", "cache or videoProxyDB null in Preloader!!!", null);
            return;
        }
        if (i <= 0) {
            i = LJIIJJI.LIZ;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Preload urlsLazyProvider:");
        LIZ2.append(interfaceC47454Ijq);
        C48841JEv.LJIJI("TAG_PROXY_Preloader", X1D.LIZIZ(LIZ2), null);
        if (interfaceC47454Ijq == null) {
            if (TextUtils.isEmpty(str) || c48091Iu7 == null) {
                return;
            }
            String LIZ3 = C48082Ity.LIZ(str);
            C47480IkG.LIZ.LIZJ(str, LIZ3);
            File LJ = c47935Irb.LJ(LIZ3);
            if (LJ != null && LJ.length() >= i) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("no need preload, file size: ");
                LIZ4.append(LJ.length());
                LIZ4.append(", need preload size: ");
                LIZ4.append(i);
                C48841JEv.LJIILIIL("TAG_PROXY_Preloader", X1D.LIZIZ(LIZ4), null);
                return;
            }
            if (C48066Iti.LIZJ().LIZLLL(0, LIZ3)) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("has pending proxy task, skip preload for key: ");
                LIZ5.append(str);
                C48841JEv.LJIJI("TAG_PROXY_Preloader", X1D.LIZIZ(LIZ5), null);
                return;
            }
            synchronized (this.LIZ) {
                java.util.Map<String, C48071Itn> map = this.LIZ.get(0);
                C48061Itd c48061Itd = new C48061Itd();
                c48061Itd.LJ = c47935Irb;
                c48061Itd.LJFF = c47961Is1;
                if (!TextUtils.isEmpty(str)) {
                    c48061Itd.LIZ = str;
                    if (!TextUtils.isEmpty(LIZ3)) {
                        c48061Itd.LIZIZ = LIZ3;
                        c48061Itd.LIZJ = c48091Iu7;
                        c48061Itd.LJI = null;
                        c48061Itd.LJII = i;
                        c48061Itd.LJIIIZ = this.LJI;
                        c48061Itd.LJIIJ = true;
                        LIZ = c48061Itd.LIZ();
                        map.put(LIZ3, LIZ);
                    } else {
                        throw new IllegalArgumentException("key == null");
                    }
                } else {
                    throw new IllegalArgumentException("rawKey == null");
                }
            }
        } else {
            C48061Itd c48061Itd2 = new C48061Itd();
            c48061Itd2.LJ = c47935Irb;
            c48061Itd2.LJFF = c47961Is1;
            c48061Itd2.LJI = null;
            c48061Itd2.LIZLLL = interfaceC47454Ijq;
            c48061Itd2.LJII = i;
            c48061Itd2.LJIIIZ = this.LJI;
            c48061Itd2.LJIIJ = true;
            LIZ = c48061Itd2.LIZ();
        }
        this.LIZJ.execute(LIZ);
    }
}
