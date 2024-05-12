package X;

import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import kotlin.jvm.internal.o;

/* renamed from: X.Lxe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55954Lxe extends F9E implements InterfaceC57784Mm4 {
    public final ToolEntryVO LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C55954Lxe(ToolEntryVO toolEntry) {
        o.LJIIIZ(toolEntry, "toolEntry");
        this.LJLIL = toolEntry;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C55954Lxe) {
            if (this.LJLIL.getCardType() == ((C55954Lxe) interfaceC57784Mm4).LJLIL.getCardType()) {
                return true;
            }
            return false;
        }
        return o.LJ(interfaceC57784Mm4, this);
    }
}
