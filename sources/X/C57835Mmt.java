package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.TitleAreaCell;
import kotlin.jvm.internal.o;

/* renamed from: X.Mmt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57835Mmt implements InterfaceC57841Mmz {
    public final C57859MnH LIZ;
    public final Class<? extends PowerCell<?>>[] LIZIZ;

    @Override // X.InterfaceC57841Mmz
    public final Class<? extends PowerCell<?>>[] LIZIZ() {
        return this.LIZIZ;
    }

    public C57835Mmt(C57859MnH config) {
        o.LJIIIZ(config, "config");
        this.LIZ = config;
        this.LIZIZ = new Class[]{TitleAreaCell.class};
    }

    @Override // X.InterfaceC57841Mmz
    public final AbstractC57829Mmn<? extends InterfaceC57927MoN> LIZ(InterfaceC57927MoN element) {
        AbstractC57844Mn2 abstractC57844Mn2;
        o.LJIIIZ(element, "element");
        if (!(element instanceof AbstractC57844Mn2) || (abstractC57844Mn2 = (AbstractC57844Mn2) element) == null) {
            return null;
        }
        return new C57842Mn0(abstractC57844Mn2, this.LIZ.getUiConfig());
    }
}
