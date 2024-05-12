package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Pc8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64812Pc8 {
    public final C35979EAd<String, C64813Pc9> LIZ = new C35979EAd<>(100);
    public final ConcurrentMap<String, C64813Pc9> LIZIZ = new ConcurrentHashMap();
    public final ConcurrentMap<String, Future<Void>> LIZJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, Future<Void>> LIZLLL = new ConcurrentHashMap();
    public final ConcurrentMap<String, ConcurrentSkipListSet<C64816PcC>> LJ = new ConcurrentHashMap();
    public final ConcurrentMap<String, ConcurrentSkipListSet<C64816PcC>> LJFF = new ConcurrentHashMap();
    public final ConcurrentSkipListSet<String> LJI = new ConcurrentSkipListSet<>();
    public final AtomicInteger LJII = new AtomicInteger(0);
    public final AtomicInteger LJIIIIZZ = new AtomicInteger(0);
    public EnumC48190Ivi LJIIIZ = EnumC48190Ivi.NONE;
    public final Handler LJIIJ;

    static {
        C16880lQ.LJLLJ(C64812Pc8.class);
    }

    public C64812Pc8(WeakHandler weakHandler) {
        this.LJIIJ = weakHandler;
    }

    public final C64813Pc9 LIZJ(String str) {
        C64813Pc9 LIZIZ;
        synchronized (this.LIZ.LIZJ()) {
            LIZIZ = this.LIZ.LIZIZ(str);
        }
        return LIZIZ;
    }

    public final Future<Void> LIZLLL(String str) {
        if (((ConcurrentHashMap) this.LIZJ).containsKey(str)) {
            return (Future) ((ConcurrentHashMap) this.LIZJ).get(str);
        }
        return null;
    }

    public final C64813Pc9 LJ(String str) {
        if (((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            return (C64813Pc9) ((ConcurrentHashMap) this.LIZIZ).get(str);
        }
        return null;
    }

    public final boolean LJFF(String str) {
        return ((ConcurrentHashMap) this.LIZJ).containsKey(str);
    }

    public final void LJI(Context context) {
        EnumC48190Ivi LJ = C48189Ivh.LJ(context);
        if (LJ != this.LJIIIZ) {
            Logger.debug();
            synchronized (this.LIZ.LIZJ()) {
                for (Map.Entry<String, C64813Pc9> entry : this.LIZ.LIZJ().entrySet()) {
                    if (entry != null) {
                        if (C64811Pc7.LJ().LJLILLLLZI.get()) {
                            C64813Pc9 value = entry.getValue();
                            value.LJFF.removeMessages(10);
                            value.LJFF.removeMessages(12);
                        } else {
                            entry.getValue().LJFF.removeMessages(13);
                        }
                    }
                }
                this.LIZ.LIZ();
            }
            for (Map.Entry entry2 : ((ConcurrentHashMap) this.LIZIZ).entrySet()) {
                if (entry2 != null) {
                    ((C64813Pc9) entry2.getValue()).LJFF.removeMessages(11);
                }
            }
            ((ConcurrentHashMap) this.LIZIZ).clear();
            if (LJ != EnumC48190Ivi.NONE) {
                C64811Pc7.LJ().LIZIZ(EnumC64814PcA.CACHE_STALE_NETCHANGED);
                C64811Pc7.LJ().getClass();
                try {
                    C64811Pc7.LJZ.submit(new CallableC64617PXp());
                } catch (RejectedExecutionException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        this.LJIIIZ = LJ;
    }

    public final void LJII(String str) {
        C64813Pc9 LIZJ = LIZJ(str);
        if (LIZJ != null) {
            if (C64811Pc7.LJ().LJLILLLLZI.get()) {
                LIZJ.LJFF.removeMessages(10);
                LIZJ.LJFF.removeMessages(12);
            } else {
                LIZJ.LJFF.removeMessages(13);
            }
            synchronized (this.LIZ.LIZJ()) {
                this.LIZ.LJ(str);
            }
        }
    }

    public final void LJIIIIZZ(C64816PcC c64816PcC) {
        String host = c64816PcC.getHost();
        if (((ConcurrentHashMap) this.LJ).containsKey(host)) {
            ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(host)).remove(c64816PcC);
            if (((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(host)).isEmpty()) {
                ((ConcurrentHashMap) this.LJ).remove(host);
            }
        }
    }

    public final void LJIIIZ(C64816PcC c64816PcC) {
        String host = c64816PcC.getHost();
        if (((ConcurrentHashMap) this.LJFF).containsKey(host)) {
            ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJFF).get(host)).remove(c64816PcC);
            if (((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJFF).get(host)).isEmpty()) {
                ((ConcurrentHashMap) this.LJFF).remove(host);
            }
        }
    }

    public final boolean LJIIJ(C64816PcC c64816PcC) {
        if (((ConcurrentHashMap) this.LJ).containsKey(c64816PcC.getHost())) {
            if (((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(c64816PcC.getHost())).contains(c64816PcC)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void LIZ(String str, C64816PcC c64816PcC) {
        if (((ConcurrentHashMap) this.LJ).containsKey(str)) {
            ((ConcurrentSkipListSet) ((ConcurrentHashMap) this.LJ).get(str)).add(c64816PcC);
        } else {
            ConcurrentSkipListSet concurrentSkipListSet = new ConcurrentSkipListSet();
            concurrentSkipListSet.add(c64816PcC);
            ((ConcurrentHashMap) this.LJ).put(str, concurrentSkipListSet);
        }
    }

    public final void LIZIZ(String str, C64813Pc9 c64813Pc9) {
        C64813Pc9 LJ = LJ(str);
        if (LJ != null) {
            LJ.LJFF.removeMessages(11);
        }
        Message obtain = Message.obtain();
        obtain.obj = c64813Pc9;
        obtain.what = 11;
        c64813Pc9.LIZ(obtain);
        c64813Pc9.LJFF.sendMessageDelayed(obtain, C64811Pc7.LJ().LJLJL.get() * 1000);
        ((ConcurrentHashMap) this.LIZIZ).put(str, c64813Pc9);
    }
}
