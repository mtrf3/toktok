package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SdD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72523SdD implements InterfaceC57784Mm4 {
    public int LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public C72523SdD(int i) {
        this.LJLIL = i;
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
