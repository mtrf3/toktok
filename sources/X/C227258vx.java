package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227258vx extends F9E implements InterfaceC57784Mm4 {
    public final EnumC227268vy LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C227258vx(EnumC227268vy enumC227268vy) {
        this.LJLIL = enumC227268vy;
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
