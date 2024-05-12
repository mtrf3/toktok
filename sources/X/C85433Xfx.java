package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xfx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C85433Xfx implements InterfaceC57784Mm4 {
    public boolean LJLIL;
    public String LJLILLLLZI;

    public C85433Xfx() {
        this(0);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public boolean LIZ() {
        return this.LJLIL;
    }

    public C85433Xfx(int i) {
        this.LJLIL = false;
        this.LJLILLLLZI = null;
    }

    public void LIZIZ(boolean z) {
        this.LJLIL = z;
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
