package X;

import android.widget.CompoundButton;
import java.util.concurrent.CancellationException;

/* renamed from: X.A7o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25720A7o implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ C68322mC<InterfaceC79150V4o> LJLIL;
    public final /* synthetic */ CancellationException LJLILLLLZI;
    public final /* synthetic */ C25710A7e LJLJI;
    public final /* synthetic */ AI2 LJLJJI;

    public C25720A7o(C68322mC<InterfaceC79150V4o> c68322mC, CancellationException cancellationException, C25710A7e c25710A7e, AI2 ai2) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = cancellationException;
        this.LJLJI = c25710A7e;
        this.LJLJJI = ai2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.XKQ] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        InterfaceC79150V4o interfaceC79150V4o = this.LJLIL.element;
        if (interfaceC79150V4o != null) {
            interfaceC79150V4o.LIZIZ(this.LJLILLLLZI);
        }
        C68322mC<InterfaceC79150V4o> c68322mC = this.LJLIL;
        C25710A7e c25710A7e = this.LJLJI;
        c68322mC.element = XKX.LIZLLL(c25710A7e.LJFF, C78613UtF.LIZJ, null, new C25718A7m(c25710A7e, z, this.LJLILLLLZI, this.LJLJJI, null), 2);
    }
}
