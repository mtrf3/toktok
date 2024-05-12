package X;

import Y.IDRunnableS6S0101000;
import Y.IDfS124S0200000;
import android.os.SystemClock;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC51301zq<DataKey, V, CacheKey> extends AbstractC43481nE<DataKey, V> implements InterfaceC18990op {
    public final CacheKey LJFF;
    public final InterfaceC006200s<CacheKey, V> LJI;
    public final InterfaceC006000q<CacheKey, FeedExtra> LJII;
    public final MutableLiveData<C06900Ow> LJIIIIZZ;
    public final MutableLiveData<C06900Ow> LJIIIZ;
    public final MutableLiveData<Boolean> LJIIJ;
    public final MutableLiveData<Boolean> LJIIJJI;
    public final C0YD<CacheKey, V> LJIIL;
    public final long LJIILIIL;
    public Runnable LJIILJJIL;
    public final C73318Sq2 LJIILL;

    public abstract C73422Sri LJIILIIL(Object obj, boolean z);

    public abstract DataKey LJIILLIIL(FeedExtra feedExtra);

    @Override // X.InterfaceC18990op
    public final void LIZ() {
        this.LJIILL.LIZLLL();
        LJFF(this);
    }

    public final boolean LJIILL() {
        boolean z;
        synchronized (this.LJIIL) {
            if (this.LJIILIIL == this.LJIIL.LJIIJ.get()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public AbstractC51301zq(C0YD<CacheKey, V> c0yd) {
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJIILL = c73318Sq2;
        this.LJFF = c0yd.LJIIJJI;
        this.LJI = c0yd.LJIIL;
        this.LJII = c0yd.LJIILIIL;
        this.LJIIIZ = c0yd.LIZIZ;
        this.LJIIIIZZ = c0yd.LIZ;
        this.LJIIJ = c0yd.LIZJ;
        this.LJIIJJI = c0yd.LIZLLL;
        this.LJIIL = c0yd;
        this.LJIILIIL = c0yd.LJIIJ.incrementAndGet();
        c73318Sq2.LIZ(c0yd.LJFF.LJJJLIIL(new C1PK(0, this), new C1PL(0)));
        c73318Sq2.LIZ(c0yd.LJ.LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS124S0200000((C54842Dg) this, c0yd, 4), new C1PM(0)));
        c73318Sq2.LIZ(c0yd.LJI.LJJJJZI(new C1PN(0, this)));
        LIZIZ(this);
    }

    @Override // X.AbstractC43481nE
    public final void LJIIJ(final C19090oz<DataKey> c19090oz, final AbstractC19060ow<DataKey, V> abstractC19060ow) {
        if (this.LJIIL.LJII) {
            return;
        }
        this.LJIIIIZZ.postValue(C06900Ow.LIZIZ);
        this.LJIILJJIL = null;
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJIILL.LIZ(LJIILIIL(c19090oz.LIZ, false).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1PO
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, Key] */
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                boolean z;
                AbstractC51301zq abstractC51301zq = AbstractC51301zq.this;
                long j = currentTimeMillis;
                AbstractC19060ow abstractC19060ow2 = abstractC19060ow;
                BLU blu = (BLU) obj;
                abstractC51301zq.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (blu != null) {
                    BLV blv = new BLV();
                    blv.LIZ = blu.LJ;
                    blv.LIZLLL = blu.LIZLLL;
                    blv.LJ = "/webcast/feed/";
                    blv.LJFF = blu.LJFF;
                    BLX.LIZ(j, currentTimeMillis2, uptimeMillis, blv.LIZ(), blu.LIZIZ, blu.LIZJ);
                }
                Pair pair = (Pair) blu.LIZ;
                ?? LJIILLIIL = abstractC51301zq.LJIILLIIL((FeedExtra) pair.second);
                MutableLiveData<Boolean> mutableLiveData = abstractC51301zq.LJIIJ;
                if (LJIILLIIL != 0) {
                    z = true;
                } else {
                    z = false;
                }
                mutableLiveData.postValue(Boolean.valueOf(z));
                List LJIIZILJ = abstractC51301zq.LJIIZILJ((List) pair.first, (FeedExtra) pair.second);
                C34601Xk c34601Xk = (C34601Xk) abstractC19060ow2;
                if (!c34601Xk.LIZ.LIZ()) {
                    if (c34601Xk.LIZ.LIZ == 1) {
                        c34601Xk.LIZIZ.LJIIL(LJIILLIIL);
                    } else {
                        AbstractC43481nE<Key, Value> abstractC43481nE = c34601Xk.LIZIZ;
                        synchronized (abstractC43481nE.LIZJ) {
                            abstractC43481nE.LJ = LJIILLIIL;
                        }
                    }
                    c34601Xk.LIZ.LIZIZ(new C19110p1(LJIIZILJ, 0, 0));
                }
                abstractC51301zq.LJIIIIZZ.postValue(C06900Ow.LIZJ);
                if (abstractC51301zq.LJI.get(abstractC51301zq.LJFF).size() == 1) {
                    Object obj2 = ListProtector.get(abstractC51301zq.LJI.get(abstractC51301zq.LJFF), 0);
                    if ((obj2 instanceof FeedItem) && ((FeedItem) obj2).type == 1005) {
                        abstractC51301zq.LJIIJJI.postValue(Boolean.TRUE);
                    }
                }
            }
        }, new InterfaceC64592gB() { // from class: X.1PP
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                AbstractC51301zq abstractC51301zq = AbstractC51301zq.this;
                C19090oz c19090oz2 = c19090oz;
                AbstractC19060ow abstractC19060ow2 = abstractC19060ow;
                abstractC51301zq.LJIIIIZZ.postValue(C06900Ow.LIZ());
                abstractC51301zq.LJIILJJIL = new RunnableC09750Zv(0, abstractC51301zq, c19090oz2, abstractC19060ow2);
            }
        }));
    }

    @Override // X.AbstractC43481nE
    public final void LJIIJJI(C19080oy<DataKey> c19080oy, AbstractC19070ox<DataKey, V> abstractC19070ox) {
        if (!LJIILL()) {
            C0NB.LIZIZ("RxCacheDataSource", "load initial not my generation ");
            return;
        }
        boolean z = true;
        if (this.LJIIL.LJIIIIZZ) {
            this.LJIIL.LJIIIIZZ = false;
            this.LJIIL.LJII = true;
        }
        MutableLiveData<C06900Ow> mutableLiveData = this.LJIIIZ;
        C06900Ow c06900Ow = C06900Ow.LIZIZ;
        mutableLiveData.postValue(c06900Ow);
        this.LJIIIIZZ.postValue(c06900Ow);
        this.LJIILJJIL = null;
        List<V> list = this.LJI.get(this.LJFF);
        if (!C32151Nz.LJJIIJZLJL(list)) {
            FeedExtra feedExtra = this.LJII.get(this.LJFF);
            abstractC19070ox.LIZ(LJIILLIIL(feedExtra), new ArrayList(list));
            if (this.LJIIL.LJII) {
                LJIILJJIL(LJIILIIL(null, true), c19080oy, abstractC19070ox);
                return;
            }
            this.LJIIJJI.postValue(Boolean.FALSE);
            MutableLiveData<Boolean> mutableLiveData2 = this.LJIIJ;
            if (LJIILLIIL(feedExtra) == null) {
                z = false;
            }
            mutableLiveData2.postValue(Boolean.valueOf(z));
            MutableLiveData<C06900Ow> mutableLiveData3 = this.LJIIIZ;
            C06900Ow c06900Ow2 = C06900Ow.LIZJ;
            mutableLiveData3.postValue(c06900Ow2);
            this.LJIIIIZZ.postValue(c06900Ow2);
            return;
        }
        LJIILJJIL(LJIILIIL(null, true), c19080oy, abstractC19070ox);
    }

    public final List<V> LJIIZILJ(List<V> list, FeedExtra feedExtra) {
        this.LJII.put(this.LJFF, feedExtra);
        return this.LJI.LIZIZ(this.LJFF, new ArrayList(list));
    }

    public final void LJIILJJIL(C73422Sri c73422Sri, final C19080oy c19080oy, final AbstractC19070ox abstractC19070ox) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJIILL.LIZ(c73422Sri.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1PQ
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                boolean z;
                AbstractC51301zq abstractC51301zq = AbstractC51301zq.this;
                long j = currentTimeMillis;
                long j2 = elapsedRealtime;
                AbstractC19070ox abstractC19070ox2 = abstractC19070ox;
                BLU blu = (BLU) obj;
                abstractC51301zq.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                long uptimeMillis = SystemClock.uptimeMillis();
                if (blu != null) {
                    BLV blv = new BLV();
                    blv.LIZ = blu.LJ;
                    blv.LIZLLL = blu.LIZLLL;
                    blv.LJ = "/webcast/feed/";
                    blv.LJFF = blu.LJFF;
                    BLX.LIZ(j, currentTimeMillis2, uptimeMillis, blv.LIZ(), blu.LIZIZ, blu.LIZJ);
                }
                Pair pair = (Pair) blu.LIZ;
                if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_request_response", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                    BZI LIZ = C28787BRn.LIZ("livesdk_live_request_response");
                    LIZ.LIZJ("click");
                    LIZ.LJIJJ("live_merge", "enter_from_merge");
                    LIZ.LJIJJ("live_cover", "enter_method");
                    LIZ.LJIJJ(Long.valueOf(SystemClock.elapsedRealtime() - j2), "duration");
                    LIZ.LJIJJ("webcast/feed", "request_api");
                    LIZ.LJIJJ(Integer.valueOf(((List) pair.first).size()), "room_num");
                    LIZ.LJJIIJZLJL();
                }
                MutableLiveData<C06900Ow> mutableLiveData = abstractC51301zq.LJIIIZ;
                C06900Ow c06900Ow = C06900Ow.LIZJ;
                mutableLiveData.postValue(c06900Ow);
                abstractC51301zq.LJIIIIZZ.postValue(c06900Ow);
                if (!abstractC51301zq.LJIILL()) {
                    C0NB.LIZIZ("RxCacheDataSource", "on data not my generation ");
                    if (abstractC51301zq.LJIIL.LJII) {
                        abstractC51301zq.LJIIL.LJII = false;
                        return;
                    }
                    return;
                }
                Object LJIILLIIL = abstractC51301zq.LJIILLIIL((FeedExtra) pair.second);
                MutableLiveData<Boolean> mutableLiveData2 = abstractC51301zq.LJIIJ;
                boolean z2 = true;
                if (LJIILLIIL != null) {
                    z = true;
                } else {
                    z = false;
                }
                mutableLiveData2.postValue(Boolean.valueOf(z));
                if (!C32151Nz.LJJIIJZLJL(abstractC51301zq.LJI.get(abstractC51301zq.LJFF)) || !C32151Nz.LJJIIJZLJL((List) pair.first)) {
                    z2 = false;
                }
                if (abstractC51301zq.LJIIL.LJII && !z2) {
                    if (abstractC51301zq.LJIIL.LJII) {
                        abstractC51301zq.LJI.LIZJ(abstractC51301zq.LJFF);
                        abstractC51301zq.LJII.LIZ(abstractC51301zq.LJFF);
                        abstractC51301zq.LJIIL.LJII = false;
                    }
                    abstractC51301zq.LJIIZILJ((List) pair.first, (FeedExtra) pair.second);
                    abstractC51301zq.LIZJ();
                    abstractC51301zq.LJIIJJI.postValue(Boolean.FALSE);
                    return;
                }
                if (!C32151Nz.LJJIIJZLJL((List) pair.first)) {
                    abstractC51301zq.LJI.LIZJ(abstractC51301zq.LJFF);
                    abstractC51301zq.LJII.LIZ(abstractC51301zq.LJFF);
                }
                List LJIIZILJ = abstractC51301zq.LJIIZILJ((List) pair.first, (FeedExtra) pair.second);
                abstractC51301zq.LJIIJJI.postValue(Boolean.valueOf(C32151Nz.LJJIIJZLJL(LJIIZILJ)));
                abstractC19070ox2.LIZ(LJIILLIIL, LJIIZILJ);
                abstractC51301zq.LJIIL.LJII = false;
            }
        }, new InterfaceC64592gB() { // from class: X.1PR
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                AbstractC51301zq abstractC51301zq = AbstractC51301zq.this;
                C19080oy c19080oy2 = c19080oy;
                AbstractC19070ox abstractC19070ox2 = abstractC19070ox;
                Throwable th = (Throwable) obj;
                abstractC51301zq.LJIIL.LJII = false;
                abstractC51301zq.LJIIIZ.postValue(C06900Ow.LIZ());
                abstractC51301zq.LJIIIIZZ.postValue(C06900Ow.LIZ());
                if (!abstractC51301zq.LJIILL()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("exception not my generation ");
                    LIZ.append(th.getMessage());
                    C0NB.LIZIZ("RxCacheDataSource", X1D.LIZIZ(LIZ));
                    return;
                }
                if (abstractC51301zq.LJIIL.LJII) {
                    if (abstractC51301zq.LJIIL.LJII) {
                        abstractC51301zq.LJI.LIZJ(abstractC51301zq.LJFF);
                        abstractC51301zq.LJII.LIZ(abstractC51301zq.LJFF);
                        abstractC51301zq.LJIIL.LJII = false;
                    }
                    abstractC51301zq.LJIILJJIL = new IDRunnableS6S0101000(0, abstractC51301zq, 23);
                    return;
                }
                abstractC51301zq.LJIILJJIL = new RunnableC09760Zw(0, abstractC51301zq, c19080oy2, abstractC19070ox2);
            }
        }));
    }
}
