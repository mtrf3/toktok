package X;

import X.C0M9;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.consumer.AnchorExtra;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS142S0200000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.PxV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66137PxV {
    public static final List<Integer> LIZ = C47261Igj.LJJIJIIJI(2002, 2006, 2003);
    public static final CopyOnWriteArrayList<C66155Pxn> LIZIZ = new CopyOnWriteArrayList<>();

    public static void LIZ(C66155Pxn c66155Pxn) {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        List<AnchorInfoModel> list = heliosEnvImpl.LJIIJ.anchorConfigs;
        ArrayList arrayList = new ArrayList();
        for (AnchorInfoModel anchorInfoModel : list) {
            if (anchorInfoModel.skipAnchorActions.contains("floating_window_view")) {
                arrayList.add(anchorInfoModel);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((AnchorInfoModel) it.next()).resourcePages, arrayList2);
        }
        PQ0 pq0 = PQ0.LJFF;
        o.LJIIIIZZ(pq0, "LifecycleMonitor.get()");
        C68292m9 c68292m9 = pq0.LIZ;
        o.LJIIIIZZ(c68292m9, "LifecycleMonitor.get().activityStack");
        ArrayList arrayList3 = new ArrayList();
        Iterator<C68262m6> it2 = c68292m9.iterator();
        while (it2.hasNext()) {
            C68262m6 next = it2.next();
            if (arrayList2.contains(next.LIZJ)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C68262m6) it3.next()).LIZJ);
        }
        if (!arrayList4.isEmpty()) {
            c66155Pxn.LJLJI.addAll(arrayList4);
        }
    }

    public static void LIZIZ(String str, C66155Pxn c66155Pxn) {
        java.util.Set<Object> historyFloatingViewEvents;
        java.util.Set<Object> floatingViewEvents;
        AnchorExtra anchorExtra;
        java.util.Set<Object> floatingViewEvents2;
        C34K c34k = new C34K();
        c34k.element = false;
        Iterator it = ((C0M9.b) C66138PxW.LIZ.entrySet()).iterator();
        while (it.hasNext()) {
            for (C66120PxE c66120PxE : ((InterfaceC66176Py8) ((Map.Entry) it.next()).getValue()).LIZ()) {
                if (o.LJ(str, "onWindowViewAdd")) {
                    c34k.element = true;
                    AnchorExtra anchorExtra2 = c66120PxE.LLII;
                    if (anchorExtra2 != null && (floatingViewEvents = anchorExtra2.getFloatingViewEvents()) != null) {
                        floatingViewEvents.add(c66155Pxn);
                    }
                    AnchorExtra anchorExtra3 = c66120PxE.LLII;
                    if (anchorExtra3 != null && (historyFloatingViewEvents = anchorExtra3.getHistoryFloatingViewEvents()) != null) {
                        historyFloatingViewEvents.add(c66155Pxn);
                    }
                } else if (o.LJ(str, "onWindowViewRemove") && (anchorExtra = c66120PxE.LLII) != null && (floatingViewEvents2 = anchorExtra.getFloatingViewEvents()) != null) {
                    ORS.LJJLIIJ(floatingViewEvents2, new AqS142S0200000_11(c34k, c66155Pxn, 10));
                }
            }
        }
        if ((!c66155Pxn.LJLJI.isEmpty()) || c34k.element) {
            C66138PxW.LIZLLL(c66155Pxn, str);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("FloatingViewMonitor.");
            LIZ2.append(str);
            LIZ2.append(" event=");
            LIZ2.append(c66155Pxn);
            C66063PwJ.LIZIZ("Helios-Detection-Task", X1D.LIZIZ(LIZ2));
        }
    }
}
