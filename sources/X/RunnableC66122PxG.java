package X;

import androidx.fragment.app.Fragment;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.consumer.AnchorExtra;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.signal.ClosureSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PxG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66122PxG implements Runnable {
    public final AnchorInfoModel LJLIL;
    public final Object LJLILLLLZI;
    public final List<String> LJLJI;
    public final /* synthetic */ AbstractC66136PxU LJLJJI;

    public final void LIZ() {
        List<C66120PxE> LIZ;
        boolean z;
        java.util.Set<Object> historyFloatingViewEvents;
        java.util.Set<Object> set;
        int i;
        boolean z2;
        long j;
        boolean z3;
        InterfaceC66065PwL interfaceC66065PwL = C66063PwJ.LIZ;
        InterfaceC66176Py8 interfaceC66176Py8 = null;
        if (interfaceC66065PwL != null) {
            interfaceC66065PwL.LIZ(null);
        }
        C66036Pvs LIZIZ = C66036Pvs.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "HeliosEnv.get()");
        LIZIZ.LJFF();
        if (this.LJLJJI.LJFF(this.LJLIL, this.LJLILLLLZI, "Run")) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C1HQ<String, InterfaceC66176Py8> c1hq = C66138PxW.LIZ;
        Iterator<String> it = this.LJLJI.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            InterfaceC66176Py8 orDefault = c1hq.getOrDefault(it.next(), interfaceC66176Py8);
            if (orDefault != null && (LIZ = orDefault.LIZ()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<C66120PxE> it2 = LIZ.iterator();
                while (true) {
                    z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C66120PxE next = it2.next();
                    C66120PxE c66120PxE = next;
                    AnchorExtra anchorExtra = c66120PxE.LLII;
                    if (anchorExtra != null) {
                        i = anchorExtra.getAnchorCheckCount();
                    } else {
                        i = 0;
                    }
                    if (i < this.LJLIL.maxAnchorCheckCount) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    AnchorExtra anchorExtra2 = c66120PxE.LLII;
                    if (anchorExtra2 != null) {
                        j = anchorExtra2.getLastAnchorCheckTime();
                    } else {
                        j = 0;
                    }
                    if (currentTimeMillis - j >= this.LJLIL.anchorTimeDelay) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && z3) {
                        arrayList.add(next);
                    }
                }
                for (C66120PxE c66120PxE2 : this.LJLJJI.LIZLLL(arrayList, this.LJLIL, this.LJLILLLLZI)) {
                    Object obj = this.LJLILLLLZI;
                    AnchorExtra anchorExtra3 = c66120PxE2.LLII;
                    if (anchorExtra3 != null) {
                        anchorExtra3.setAnchorCheckCount(anchorExtra3.getAnchorCheckCount() + 1);
                        anchorExtra3.setLastAnchorCheckTime(currentTimeMillis);
                        java.util.Set LIZLLL = C65777Prh.LIZLLL(c66120PxE2.LJLLLL.get("anchor_types"));
                        if (LIZLLL == null) {
                            LIZLLL = new LinkedHashSet();
                        }
                        LIZLLL.add(this.LJLJJI.LIZIZ());
                        c66120PxE2.LJLLLL.put("anchor_types", LIZLLL);
                        c66120PxE2.LLFII = z;
                        c66120PxE2.LLFZ = z;
                        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
                        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
                        if (heliosEnvImpl.LJIIJ.signalConfig.enable) {
                            String str = c66120PxE2.LJLILLLLZI;
                            int hashCode = str.hashCode();
                            if (hashCode != 3121) {
                                if (hashCode == 3183 && str.equals("cr")) {
                                    EnumC66029Pvl enumC66029Pvl = EnumC66029Pvl.GUARD;
                                    EnumC65997PvF enumC65997PvF = EnumC65997PvF.CAMERA;
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("anchor type=");
                                    LIZ2.append(this.LJLJJI.LIZIZ());
                                    LIZ2.append(" count=");
                                    LIZ2.append(anchorExtra3.getAnchorCheckCount());
                                    C65985Pv3.LIZIZ(enumC66029Pvl, enumC65997PvF, new ClosureSignal(X1D.LIZIZ(LIZ2), c66120PxE2.LJZ));
                                }
                            } else if (str.equals("ar")) {
                                EnumC66029Pvl enumC66029Pvl2 = EnumC66029Pvl.GUARD;
                                EnumC65997PvF enumC65997PvF2 = EnumC65997PvF.AUDIO;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("anchor type=");
                                LIZ3.append(this.LJLJJI.LIZIZ());
                                LIZ3.append(" count=");
                                LIZ3.append(anchorExtra3.getAnchorCheckCount());
                                C65985Pv3.LIZIZ(enumC66029Pvl2, enumC65997PvF2, new ClosureSignal(X1D.LIZIZ(LIZ3), c66120PxE2.LJZ));
                            }
                        }
                        C66063PwJ.LIZIZ("Helios-Detection-Task", "anchorType=" + this.LJLJJI.LIZIZ() + " handleResidueResourceEvent eventId=" + c66120PxE2.LJLJI + " eventName=" + c66120PxE2.LJLJJI + " eventStartTime=" + c66120PxE2.LJLLJ + " eventAnchorReportCount=" + anchorExtra3.getAnchorCheckCount());
                        if (anchorExtra3.getAnchorCheckCount() == this.LJLIL.maxAnchorCheckCount) {
                            c66120PxE2.LLD = 4;
                            c66120PxE2.LLF.add("pair_not_close");
                            c66120PxE2.LLF.remove("pair_delay_close");
                            AnchorExtra anchorExtra4 = c66120PxE2.LLII;
                            if (anchorExtra4 != null && (historyFloatingViewEvents = anchorExtra4.getHistoryFloatingViewEvents()) != null && !historyFloatingViewEvents.isEmpty()) {
                                ConcurrentHashMap<String, Object> concurrentHashMap = c66120PxE2.LJLLLL;
                                AnchorExtra anchorExtra5 = c66120PxE2.LLII;
                                if (anchorExtra5 != null) {
                                    set = anchorExtra5.getHistoryFloatingViewEvents();
                                } else {
                                    set = null;
                                }
                                concurrentHashMap.put("floating_views", set);
                            }
                            if (obj != null && (obj instanceof Fragment)) {
                                c66120PxE2.LJLLLL.put("fragment", obj.getClass().getName());
                            }
                            c66120PxE2.LLI.getCheckModes().remove(EnumC66158Pxq.SYNC);
                            C66059PwF.LIZIZ(c66120PxE2);
                        } else if (anchorExtra3.getAnchorCheckCount() < this.LJLIL.maxAnchorCheckCount) {
                            c66120PxE2.LLF.add("pair_delay_close");
                        }
                    }
                    z4 = true;
                    z = true;
                }
            }
            interfaceC66176Py8 = null;
        }
        if (z4) {
            HandlerThreadC64418PPy.LIZ();
            HandlerThreadC64418PPy.LJLJJI.postDelayed(this, this.LJLIL.anchorTimeDelay);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("anchorType=");
            LIZ4.append(this.LJLJJI.LIZIZ());
            LIZ4.append(" continueAnchorCheck runnable=");
            LIZ4.append(hashCode());
            LIZ4.append(" model=");
            LIZ4.append(this.LJLIL);
            C66063PwJ.LIZIZ("Helios-Detection-Task", X1D.LIZIZ(LIZ4));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66122PxG(AbstractC66136PxU abstractC66136PxU, AnchorInfoModel model, Object obj, List<String> checkResourceIds) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(checkResourceIds, "checkResourceIds");
        this.LJLJJI = abstractC66136PxU;
        this.LJLIL = model;
        this.LJLILLLLZI = obj;
        this.LJLJI = checkResourceIds;
    }
}
