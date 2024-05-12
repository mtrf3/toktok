package X;

import com.ss.android.ugc.aweme.relation.mutual.MutualRelationViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.3mT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93973mT extends F9E implements InterfaceC57784Mm4 {
    public final MutualRelationViewModel LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return true;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C93973mT(MutualRelationViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
