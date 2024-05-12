package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.FixedCell;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57836Mmu implements InterfaceC57841Mmz {
    @Override // X.InterfaceC57841Mmz
    public final Class<? extends PowerCell<?>>[] LIZIZ() {
        return new Class[]{FixedCell.class};
    }

    @Override // X.InterfaceC57841Mmz
    public final AbstractC57829Mmn<? extends InterfaceC57927MoN> LIZ(InterfaceC57927MoN element) {
        AbstractC27771Av9 abstractC27771Av9;
        o.LJIIIZ(element, "element");
        if (!(element instanceof AbstractC27771Av9) || (abstractC27771Av9 = (AbstractC27771Av9) element) == null) {
            return null;
        }
        return new C57837Mmv(abstractC27771Av9);
    }
}
