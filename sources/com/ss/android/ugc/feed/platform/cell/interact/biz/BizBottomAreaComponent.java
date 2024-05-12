package com.ss.android.ugc.feed.platform.cell.interact.biz;

import X.C209998Lz;
import X.C212428Vi;
import X.C214348b8;
import X.C221108m2;
import X.C241249dQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8MQ;
import X.C8VR;
import X.C8W0;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BizBottomAreaComponent extends BaseCellContentComponent<BizBottomAreaComponent> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LL;

    static {
        TBT tbt = new TBT(BizBottomAreaComponent.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C65352Pkq.LIZ.getClass();
        LL = new InterfaceC74236TBo[]{tbt};
    }

    public BizBottomAreaComponent() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ConstraintSizeVM.class);
        C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1249), null, C209998Lz.INSTANCE, null, null);
        C221108m2.LIZIZ(new AqS153S0100000_3(this, 1248));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJJJ();
            }
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3(this, 555));
    }
}
