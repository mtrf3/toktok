package X;

import Y.ARunnableS22S0300000_11;
import android.media.AudioRecord;
import com.bytedance.helios.api.consumer.AnchorExtra;
import com.bytedance.helios.api.consumer.ClosureExtra;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PxF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66121PxF extends AbstractC66131PxP implements InterfaceC66176Py8 {
    public static final String[] LIZLLL = {"FORE_START_FORE_END", "FORE_START_BACK_END", "BACK_START_FORE_END", "BACK_START_BACK_END"};
    public final CopyOnWriteArrayList<C66120PxE> LIZIZ = new CopyOnWriteArrayList<>();
    public InterfaceC66171Py3 LIZJ;

    public abstract List<Integer> LJIIIIZZ(int i);

    public abstract String LJIIIZ();

    @Override // X.InterfaceC66176Py8
    public final void LIZIZ() {
        this.LIZIZ.clear();
        InterfaceC66171Py3 interfaceC66171Py3 = this.LIZJ;
        if (interfaceC66171Py3 != null) {
            interfaceC66171Py3.LIZIZ();
        }
    }

    public AbstractC66121PxF() {
        C66138PxW.LIZIZ(LJIIIZ(), this);
    }

    @Override // X.InterfaceC66176Py8
    public final List<C66120PxE> LIZ() {
        return this.LIZIZ;
    }

    public final void LJI(InterfaceC66183PyF interfaceC66183PyF) {
        String resourceId = interfaceC66183PyF.getResourceId();
        String LIZIZ = interfaceC66183PyF.LIZIZ();
        int[] LIZJ = interfaceC66183PyF.LIZJ();
        int[] LIZ = interfaceC66183PyF.LIZ();
        int length = LIZJ.length;
        for (int i = 0; i < length; i++) {
            int i2 = LIZJ[i];
            this.LIZ.put(i2, new C66152Pxk(resourceId, LIZIZ, i2, LIZ[i]));
        }
    }

    public final void LJII(C66120PxE c66120PxE) {
        String str;
        java.util.Set<Object> historyFloatingViewEvents;
        CopyOnWriteArrayList<C66155Pxn> copyOnWriteArrayList = C66137PxV.LIZIZ;
        long LJIIJ = LJIIJ(c66120PxE);
        String LJIIIZ = LJIIIZ();
        c66120PxE.getClass();
        o.LJIIIZ(LJIIIZ, "<set-?>");
        c66120PxE.LJLILLLLZI = LJIIIZ;
        if (!c66120PxE.LJLJLLL) {
            str = "FORE_START";
        } else {
            str = "BACK_START";
        }
        c66120PxE.LJLL = str;
        c66120PxE.LJZ = LJIIJ;
        c66120PxE.LLD = 0;
        c66120PxE.LJLLLL.put("runtimeObjHashCode", Long.valueOf(LJIIJ));
        AnchorExtra anchorExtra = new AnchorExtra(0, 0L, null, null, 15, null);
        c66120PxE.LLII = anchorExtra;
        java.util.Set<Object> floatingViewEvents = anchorExtra.getFloatingViewEvents();
        if (floatingViewEvents != null) {
            floatingViewEvents.addAll(copyOnWriteArrayList);
        }
        AnchorExtra anchorExtra2 = c66120PxE.LLII;
        if (anchorExtra2 != null && (historyFloatingViewEvents = anchorExtra2.getHistoryFloatingViewEvents()) != null) {
            historyFloatingViewEvents.addAll(copyOnWriteArrayList);
        }
        if (c66120PxE.LLI.getThisOrClass() instanceof AudioRecord) {
            ConcurrentHashMap<String, Object> concurrentHashMap = c66120PxE.LJLLLL;
            Object thisOrClass = c66120PxE.LLI.getThisOrClass();
            if (thisOrClass != null) {
                concurrentHashMap.put("audioSessionId", Integer.valueOf(((AudioRecord) thisOrClass).getAudioSessionId()));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioRecord");
            }
        }
        C66059PwF.LIZIZ.postDelayed(new RunnableC66062PwI(c66120PxE), 50L);
    }

    public long LJIIJ(C66120PxE event) {
        int i;
        o.LJIIIZ(event, "event");
        Object thisOrClass = event.LLI.getThisOrClass();
        if (thisOrClass != null) {
            i = thisOrClass.hashCode();
        } else {
            i = 0;
        }
        return i;
    }

    public final void LJIILJJIL(C66120PxE event) {
        o.LJIIIZ(event, "event");
        Iterator<C66120PxE> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            C66120PxE next = it.next();
            if (next.LLIIII == null && next.LJZ == LJIIJ(event)) {
                next.LLIIII = new ClosureExtra(event.LJLLJ, 0L, 2, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r15 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C66152Pxk r73, X.C66120PxE r74) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66121PxF.LJIIL(X.Pxk, X.PxE):void");
    }

    public final void LJIIJJI(long j, List list, C66120PxE c66120PxE) {
        LJII(c66120PxE);
        for (int size = this.LIZIZ.size() - 1; size >= 0; size--) {
            C66120PxE c66120PxE2 = this.LIZIZ.get(size);
            if (c66120PxE2.LJZ == j && list.contains(Integer.valueOf(c66120PxE2.LJLJI))) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("removeEndApiCallTrace eventId=");
                LIZ.append(c66120PxE.LJLJI);
                LIZ.append(" eventName=");
                Q89.LIZIZ(LIZ, c66120PxE2.LJLJJI, ' ', "calledTime=");
                LIZ.append(c66120PxE.LJLLJ);
                LIZ.append(" eventStartTime=");
                LIZ.append(c66120PxE2.LJLLJ);
                C66063PwJ.LIZIZ("Helios-Log-Api-Call", X1D.LIZIZ(LIZ));
                int i = !c66120PxE2.LJLJLLL ? 1 : 0;
                o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
                int i2 = ((i ^ 1) << 1) | ((!PQ0.LJ() ? 1 : 0) ^ 1);
                ClosureExtra closureExtra = c66120PxE2.LLIIII;
                if (closureExtra != null) {
                    closureExtra.setRealCloseTime(c66120PxE.LJLLJ);
                }
                String str = LIZLLL[i2];
                o.LJIIIZ(str, "<set-?>");
                c66120PxE2.LJLL = str;
                String str2 = c66120PxE2.LJLJL;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(c66120PxE.LJLJL);
                String LIZIZ = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(LIZIZ, "<set-?>");
                c66120PxE2.LJLJL = LIZIZ;
                c66120PxE2.LJZI = c66120PxE.LJZI;
                c66120PxE2.LLD = 1;
                AnchorExtra anchorExtra = c66120PxE2.LLII;
                if (anchorExtra != null && anchorExtra.getAnchorCheckCount() > 0) {
                    c66120PxE2.LLF.add("pair_delay_close");
                    c66120PxE2.LLF.remove("pair_not_close");
                    c66120PxE2.LLI.getCheckModes().remove(EnumC66158Pxq.SYNC);
                    C66059PwF.LIZIZ(c66120PxE2);
                }
                this.LIZIZ.remove(size);
            }
        }
        if (!c66120PxE.LIZIZ() && !c66120PxE.LIZJ()) {
            C66059PwF.LIZIZ(c66120PxE);
        }
    }

    public final void LJIILIIL(C66152Pxk c66152Pxk, C66120PxE removeEvent, List<Integer> actions) {
        o.LJIIIZ(removeEvent, "removeEvent");
        o.LJIIIZ(actions, "actions");
        HandlerThreadC64418PPy.LIZ();
        HandlerThreadC64418PPy.LJLJJI.post(new ARunnableS22S0300000_11(this, actions, removeEvent, c66152Pxk, 10));
    }
}
