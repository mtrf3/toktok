package X;

import Y.IDRunnableS29S0200000;
import Y.IDRunnableS85S0100000;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.pitaya.api.IPitayaCore;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.IDqS7S1000000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29921Fk implements InterfaceC22790ux {
    public final C5H3 LIZ = C78996UzQ.LJJIJIIJI(C46681sO.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C46671sN.INSTANCE);
    public ScheduledExecutorService LIZJ;
    public final PriorityBlockingQueue<C22810uz> LIZLLL;
    public final ConcurrentHashMap<String, C22810uz> LJ;
    public final AtomicBoolean LJFF;
    public boolean LJI;

    @Override // X.InterfaceC22790ux
    public final void LIZ() {
        if (!this.LJFF.get()) {
            return;
        }
        this.LJI = false;
        this.LJFF.set(false);
        this.LIZLLL.clear();
        ScheduledExecutorService newSingleThreadScheduledExecutor = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(C0IY.LJLIL);
        o.LJIIIIZZ(newSingleThreadScheduledExecutor, "newSingleThreadScheduled…ad(it, THREAD_NAME)\n    }");
        this.LIZJ = newSingleThreadScheduledExecutor;
    }

    @Override // X.InterfaceC22790ux
    public final void LIZLLL() {
        if (!C0IT.LIZ) {
            return;
        }
        LJI().requestUpdateAll();
    }

    public final IPitayaCore LJI() {
        return (IPitayaCore) this.LIZ.getValue();
    }

    @Override // X.InterfaceC22790ux
    public final void releaseAll() {
        if (this.LJFF.compareAndSet(false, true)) {
            this.LIZJ.shutdown();
            this.LIZLLL.clear();
            this.LJ.clear();
            if (!C0IT.LIZ) {
                return;
            }
            LJI().releaseAllEngines();
        }
    }

    public C29921Fk() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = PThreadExecutorsUtils.newSingleThreadScheduledExecutor(C0IY.LJLIL);
        o.LJIIIIZZ(newSingleThreadScheduledExecutor, "newSingleThreadScheduled…ad(it, THREAD_NAME)\n    }");
        this.LIZJ = newSingleThreadScheduledExecutor;
        this.LIZLLL = new PriorityBlockingQueue<>(10, new Comparator() { // from class: X.0IX
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C22810uz) obj2).LIZLLL - ((C22810uz) obj).LIZLLL;
            }
        });
        this.LJ = new ConcurrentHashMap<>();
        this.LJFF = new AtomicBoolean(false);
    }

    @Override // X.InterfaceC22790ux
    public final void LIZJ(C22810uz c22810uz) {
        long j = c22810uz.LJ.LJLJJL;
        if (j == 0) {
            LJIIIIZZ(c22810uz);
        } else {
            LJIIIZ(j, new IDRunnableS29S0200000(c22810uz, this, 19));
        }
    }

    public final void LJFF(C22810uz c22810uz) {
        int i;
        C35201Zs c35201Zs = c22810uz.LJ;
        if (c35201Zs.LJLILLLLZI && c35201Zs.LJLJJI >= 1000 && ((i = c35201Zs.LJLJL) == -1 || i > 0)) {
            C22810uz c22810uz2 = new C22810uz(c22810uz.LIZ, c22810uz.LIZIZ, c22810uz.LIZJ, c22810uz.LIZLLL, c35201Zs);
            ConcurrentHashMap<String, C22810uz> concurrentHashMap = this.LJ;
            String str = c22810uz.LIZ;
            concurrentHashMap.put(str, new C22810uz(str, c22810uz.LIZIZ, c22810uz.LIZJ, c22810uz.LIZLLL, c22810uz.LJ));
            LJIIIZ(c22810uz2.LJ.LJLJJI, new IDRunnableS29S0200000(c22810uz, this, 17));
            C35201Zs c35201Zs2 = c22810uz2.LJ;
            int i2 = c35201Zs2.LJLJL;
            if (i2 > 0) {
                c35201Zs2.LJLJL = i2 - 1;
            }
        }
        if (this.LIZLLL.isEmpty()) {
            this.LJI = false;
        } else {
            LJIIJ(false);
        }
    }

    public final void LJII(Runnable runnable) {
        if (o.LJ(C16880lQ.LLLLIIIILLL(), ((Handler) this.LIZIZ.getValue()).getLooper().getThread())) {
            runnable.run();
        } else {
            ((Handler) this.LIZIZ.getValue()).postAtFrontOfQueue(runnable);
        }
    }

    public final void LJIIIIZZ(C22810uz c22810uz) {
        if (this.LJFF.get()) {
            LJII(new IDRunnableS85S0100000(c22810uz, 41));
            return;
        }
        this.LIZLLL.offer(c22810uz);
        if (!this.LJI) {
            LJIIJ(true);
        }
        LJIIIZ(c22810uz.LJ.LJLJJLL, new IDRunnableS29S0200000(c22810uz, this, 18));
    }

    public final void LJIIJ(boolean z) {
        this.LJI = true;
        IDRunnableS85S0100000 iDRunnableS85S0100000 = new IDRunnableS85S0100000(this, 43);
        LiveClientAISettings liveClientAISettings = LiveClientAISettings.INSTANCE;
        if (liveClientAISettings.getTaskSettings().period <= 0 || z) {
            iDRunnableS85S0100000.run();
        } else {
            LJIIIZ(liveClientAISettings.getTaskSettings().period, iDRunnableS85S0100000);
        }
    }

    @Override // X.InterfaceC22790ux
    public final void LIZIZ(AqS155S0100000_5 aqS155S0100000_5, AqS155S0100000_5 aqS155S0100000_52) {
        C0IT.LIZIZ(new C46711sR(this, aqS155S0100000_5, aqS155S0100000_52), new IDqS443S0100000(aqS155S0100000_52, 5));
    }

    @Override // X.InterfaceC22790ux
    public final void LJ(String businessName, boolean z) {
        o.LJIIIZ(businessName, "businessName");
        ORS.LJJLIIJ(this.LIZLLL, new IDqS7S1000000(businessName, 0));
        this.LJ.remove(businessName);
        if (z) {
            LJI().releaseEngine(businessName);
        }
    }

    public final void LJIIIZ(long j, Runnable runnable) {
        if (this.LIZJ.isShutdown()) {
            return;
        }
        try {
            C3C5.m7constructorimpl(this.LIZJ.schedule(runnable, j, TimeUnit.MILLISECONDS));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
