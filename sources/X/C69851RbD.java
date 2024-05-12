package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PDPComposedFacade;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpModuleDSLBody;
import com.ss.android.ugc.aweme.ecommerce.core.engine.module.ModuleId;
import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.RbD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69851RbD extends C70083Rex<PdpViewModel> implements InterfaceC69806RaU {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC69806RaU
    public final void Th() {
        EnumC28000Ayq enumC28000Ayq;
        AbstractC69707RXj abstractC69707RXj;
        PdpViewModel LIZ = LIZ();
        C69853RbF.LIZ.getClass();
        ArrayList<PDPComposedFacade> arrayList = ((PdpModuleDSLBody) C69853RbF.LIZJ.getValue()).moduleFacadeList;
        if (arrayList != null) {
            Iterator<PDPComposedFacade> it = arrayList.iterator();
            while (it.hasNext()) {
                PDPComposedFacade next = it.next();
                String str = next.id;
                if (str != null && (abstractC69707RXj = (AbstractC69707RXj) C78685UuP.LJIILL(AbstractC69707RXj.class, new BizIdentity(str, LIZ.LLILIL), true)) != null) {
                    abstractC69707RXj.LIZ = next.style;
                    LIZ.LLILL.add(abstractC69707RXj);
                }
            }
            return;
        }
        if (o.LJ(LIZ.LLILIL.LIZ, "ttf")) {
            enumC28000Ayq = EnumC28000Ayq.TTF;
        } else {
            enumC28000Ayq = EnumC28000Ayq.TTS;
        }
        C69850RbC LJIIZILJ = C73340SqO.LJIIZILJ(LIZ, enumC28000Ayq);
        if (LJIIZILJ != null) {
            LIZ.LLILL.clear();
            Iterator<ModuleId> it2 = LJIIZILJ.LIZIZ.iterator();
            while (it2.hasNext()) {
                String str2 = it2.next().id;
                C26550AbS c26550AbS = EnumC26549AbR.Companion;
                C69852RbE c69852RbE = LJIIZILJ.LIZ;
                String page = c69852RbE.LIZIZ;
                int i = c69852RbE.LIZ;
                c26550AbS.getClass();
                o.LJIIIZ(page, "page");
                Object LJIILL = C78685UuP.LJIILL(AbstractC69707RXj.class, new BizIdentity(str2, C26550AbS.LIZ(i, page).getBizEnv()), true);
                if (LJIILL != null) {
                    LIZ.LLILL.add(LJIILL);
                }
            }
        }
    }
}
