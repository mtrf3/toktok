package X;

import com.ss.android.ugc.aweme.trending.ui.billboardpage.list.TrendingBillboardModel;
import kotlin.jvm.internal.o;

/* renamed from: X.4kG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118084kG extends F9E implements InterfaceC57784Mm4 {
    public final TrendingBillboardModel LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C118084kG(TrendingBillboardModel data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
