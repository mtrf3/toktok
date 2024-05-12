package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SIU implements InterfaceC57784Mm4 {
    public final View LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public SIU(View view, int i) {
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        this.LJLILLLLZI = i;
    }
}
