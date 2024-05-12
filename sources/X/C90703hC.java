package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3hC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90703hC extends F9E implements InterfaceC57784Mm4 {
    public final C81243Gu LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C90703hC(C81243Gu member) {
        o.LJIIIZ(member, "member");
        this.LJLIL = member;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        C90703hC c90703hC;
        C81243Gu c81243Gu;
        String uid = this.LJLIL.getUid();
        String str = null;
        if ((interfaceC57784Mm4 instanceof C90703hC) && (c90703hC = (C90703hC) interfaceC57784Mm4) != null && (c81243Gu = c90703hC.LJLIL) != null) {
            str = c81243Gu.getUid();
        }
        return o.LJ(uid, str);
    }
}
