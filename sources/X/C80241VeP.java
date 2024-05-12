package X;

import android.graphics.Typeface;

/* renamed from: X.VeP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80241VeP extends QXX {
    public final /* synthetic */ C80240VeO LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80241VeP(C80240VeO c80240VeO) {
        super((Object) null);
        this.LJLIL = c80240VeO;
    }

    @Override // X.QXX
    public final void LLLF(int i) {
        C80240VeO c80240VeO = this.LJLIL;
        c80240VeO.LIZLLL = true;
        InterfaceC80242VeQ interfaceC80242VeQ = c80240VeO.LJ.get();
        if (interfaceC80242VeQ != null) {
            interfaceC80242VeQ.LIZ();
        }
    }

    @Override // X.QXX
    public final void LLLFF(Typeface typeface, boolean z) {
        if (z) {
            return;
        }
        C80240VeO c80240VeO = this.LJLIL;
        c80240VeO.LIZLLL = true;
        InterfaceC80242VeQ interfaceC80242VeQ = c80240VeO.LJ.get();
        if (interfaceC80242VeQ != null) {
            interfaceC80242VeQ.LIZ();
        }
    }
}
