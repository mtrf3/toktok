package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EE6 extends AbstractC36078EDy implements Handler.Callback {
    public boolean LJLIL = true;
    public boolean LJLILLLLZI = true;
    public final EFV LJLJI = new EFV(this);
    public final ARunnableS42S0100000_6 LJLJJI;
    public final ARunnableS42S0100000_6 LJLJJL;

    @Override // X.InterfaceC36091EEl
    public final void LIZ() {
    }

    @Override // X.InterfaceC36091EEl
    public final void LIZIZ() {
    }

    public final void LJII() {
        long j;
        C36093EEn.LIZ.getClass();
        EE1 LIZLLL = C36093EEn.LIZIZ.LIZLLL(EFK.IDLE);
        if (LIZLLL != null) {
            if (C34195DbT.LIZIZ()) {
                this.LJLIL = false;
                Handler LIZ = C37179EiV.LIZ();
                ARunnableS42S0100000_6 aRunnableS42S0100000_6 = this.LJLJJI;
                if ((((Number) C34317DdR.LIZ.getValue()).intValue() & 1) == 1) {
                    j = 50000;
                } else {
                    j = 500;
                }
                LIZ.postDelayed(aRunnableS42S0100000_6, j);
            }
            C37179EiV.LIZJ(LIZLLL.serialExecute()).execute(new ARunnableS25S0200000_6(this, LIZLLL, 41));
        }
    }

    public EE6() {
        C16880lQ.LJLI(Looper.myQueue(), new EE7(this));
        this.LJLJJI = new ARunnableS42S0100000_6(this, 96);
        this.LJLJJL = new ARunnableS42S0100000_6(this, 95);
    }

    @Override // X.AbstractC36078EDy
    public final EFK LJFF() {
        return EFK.IDLE;
    }

    @Override // X.AbstractC36078EDy, X.InterfaceC36091EEl
    public final void LIZJ(List<? extends EEY> components) {
        long j;
        o.LJIIIZ(components, "components");
        super.LIZJ(components);
        if (!C34195DbT.LIZIZ()) {
            C36093EEn.LIZ.getClass();
            if (C36093EEn.LIZIZ.LIZIZ(EFK.IDLE)) {
                this.LJLJI.LIZ(LinkMicRtcMixBitrateSetting.DEFAULT);
            }
        }
        if (C33778DNm.LIZ() != 0) {
            C36093EEn.LIZ.getClass();
            if (C36093EEn.LIZIZ.LIZJ()) {
                if (EEZ.LIZIZ()) {
                    j = 400;
                } else {
                    j = 200;
                }
                this.LJLJI.LIZIZ(1209, j);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        long j;
        o.LJIIIZ(msg, "msg");
        if (!C34195DbT.LIZIZ()) {
            LJII();
        }
        int i = 0;
        if (C33778DNm.LIZ() != 0 && msg.what == 1209) {
            if (EEZ.LIZIZ()) {
                j = 400;
            } else {
                j = 200;
            }
            C36093EEn.LIZ.getClass();
            EE9 ee9 = C36093EEn.LIZIZ;
            ee9.getClass();
            ArrayList arrayList = new ArrayList();
            synchronized (ee9.LIZIZ) {
                java.util.Map<EFK, List<EEY>> map = ee9.LIZIZ;
                EFK efk = EFK.IDLE;
                Object obj = ((ConcurrentHashMap) map).get(efk);
                o.LJI(obj);
                if (!((List) obj).isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    Object obj2 = ((ConcurrentHashMap) ee9.LIZIZ).get(efk);
                    o.LJI(obj2);
                    int i2 = 0;
                    for (EEY eey : (Iterable) obj2) {
                        if ((eey instanceof EE8) && ((EE8) eey).LJ()) {
                            ((EE8) eey).LIZLLL(Long.valueOf(((EE8) eey).LJII() - j));
                            if (((EE8) eey).LJII() <= 0) {
                                arrayList2.add(Integer.valueOf(i2));
                            }
                        }
                        i2++;
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        Object obj3 = ((ConcurrentHashMap) ee9.LIZIZ).get(EFK.IDLE);
                        o.LJI(obj3);
                        EEY eey2 = (EEY) ((List) obj3).remove(intValue - i);
                        o.LJII(eey2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.lego.LegoTask");
                        arrayList.add((EE1) eey2);
                        synchronized (ee9.LIZJ) {
                            Object obj4 = ((ConcurrentHashMap) ee9.LIZJ).get(EE9.LIZ((EE1) eey2));
                            if (obj4 != null) {
                                ((List) obj4).add(eey2);
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                        i++;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LJI((EE1) it2.next(), true);
            }
            C36093EEn.LIZ.getClass();
            if (C36093EEn.LIZIZ.LIZJ()) {
                this.LJLJI.LIZIZ(1209, j);
            }
        }
        return true;
    }

    public final void LJI(EE1 ee12, boolean z) {
        ExecutorService LIZLLL;
        boolean z2;
        long j;
        if (ee12 != null) {
            if (!z) {
                this.LJLILLLLZI = false;
                C62822Ol8 c62822Ol8 = C34317DdR.LIZ;
                if ((((Number) c62822Ol8.getValue()).intValue() & 2) == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j2 = 50000;
                if (z2) {
                    j = 50000;
                } else {
                    j = 100;
                }
                if (EEZ.LIZIZ()) {
                    if ((((Number) c62822Ol8.getValue()).intValue() & 2) != 2) {
                        j2 = 200;
                    }
                    j = j2;
                }
                C37179EiV.LIZ().postDelayed(this.LJLJJL, j);
            }
            EE4 threadType = ((EE8) ee12).threadType();
            if (threadType != null) {
                int i = EE5.LIZ[threadType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        LIZLLL = C37179EiV.LIZJ(ee12.serialExecute());
                    }
                } else {
                    LIZLLL = C38995FSd.LIZLLL();
                    o.LJIIIIZZ(LIZLLL, "getIOExecutor()");
                }
                LIZLLL.execute(new ARunnableS42S0100000_6(ee12, 94));
                return;
            }
            throw new C162476Zf();
        }
    }
}
