package X;

import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class STY extends F9E implements InterfaceC57784Mm4 {
    public final AIGCStyle LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public STY(AIGCStyle data) {
        o.LJIIIZ(data, "data");
        this.LJLIL = data;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (!(interfaceC57784Mm4 instanceof STY)) {
            return false;
        }
        return o.LJ(((STY) interfaceC57784Mm4).LJLIL.name, this.LJLIL.name);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
