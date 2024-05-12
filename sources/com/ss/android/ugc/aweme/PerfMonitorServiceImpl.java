package com.ss.android.ugc.aweme;

import X.AbstractC55114Lk6;
import X.C40443Fu3;
import X.C54502LaE;
import X.C55352Lnw;
import X.C55353Lnx;
import X.C55364Lo8;
import X.C58096Mr6;
import X.EnumC55365Lo9;
import X.InterfaceC55057LjB;
import X.InterfaceC65784Pro;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PerfMonitorServiceImpl implements PerfMonitorService {
    public static PerfMonitorService LIZ() {
        Object LIZ = C58096Mr6.LIZ(PerfMonitorService.class, false);
        if (LIZ != null) {
            return (PerfMonitorService) LIZ;
        }
        if (C58096Mr6.LJJLIIIJL == null) {
            synchronized (PerfMonitorService.class) {
                if (C58096Mr6.LJJLIIIJL == null) {
                    C58096Mr6.LJJLIIIJL = new PerfMonitorServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJLIIIJL;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LIZJ() {
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("share_panel");
        if (LIZIZ != null) {
            LIZIZ.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LIZLLL(String str) {
        C54502LaE.LIZLLL(str, null, 6);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LJFF(String str) {
        C54502LaE.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LIZIZ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        InterfaceC55057LjB LIZ = C40443Fu3.LIZ("share_panel");
        LIZ.LJI(new C55352Lnw(interfaceC65784Pro, interfaceC65784Pro2));
        LIZ.start();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LJ(RecyclerView recyclerView, String scene) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(recyclerView, "recyclerView");
        C40443Fu3.LIZ(scene).LJIIIIZZ(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService
    public final void LJI(String str, EnumC55365Lo9 type, RecyclerView view, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        ViewPager viewPager;
        AbstractC55114Lk6 abstractC55114Lk6;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(view, "view");
        InterfaceC55057LjB LIZ = C40443Fu3.LIZ(str);
        LIZ.LJI(new C55353Lnx(interfaceC65784Pro, interfaceC65784Pro2));
        int i = C55364Lo8.LIZ[type.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4 || !(view instanceof AbstractC55114Lk6) || (abstractC55114Lk6 = (AbstractC55114Lk6) view) == null) {
                    return;
                }
                LIZ.LIZLLL(abstractC55114Lk6);
                return;
            }
            if (!(view instanceof ViewPager) || (viewPager = (ViewPager) view) == null) {
                return;
            }
            LIZ.LJFF(viewPager);
            return;
        }
        LIZ.LJIIIIZZ(view);
    }
}
