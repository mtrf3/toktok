package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7r2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198727r2 extends F9E implements InterfaceC57784Mm4 {
    public final List<Object> LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C198727r2() {
        C61878OQg avatarList = C61878OQg.INSTANCE;
        o.LJIIIZ(avatarList, "avatarList");
        this.LJLIL = avatarList;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C198727r2) {
            return o.LJ(this.LJLIL, ((C198727r2) interfaceC57784Mm4).LJLIL);
        }
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
