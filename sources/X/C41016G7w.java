package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;

/* renamed from: X.G7w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41016G7w implements InterfaceC30795C6t {
    public final /* synthetic */ C41017G7x LJLIL;
    public final /* synthetic */ G84 LJLILLLLZI;
    public final /* synthetic */ C68322mC<TuxSheet> LJLJI;

    @Override // X.InterfaceC30795C6t
    public final void LIZJ(int i) {
        TuxSheet tuxSheet;
        InterfaceC30795C6t interfaceC30795C6t = this.LJLIL.LIZ;
        if (interfaceC30795C6t != null) {
            interfaceC30795C6t.LIZJ(i);
        }
        if (this.LJLILLLLZI == null) {
            try {
                if (!G9P.LIZ() && (tuxSheet = this.LJLJI.element) != null) {
                    tuxSheet.xl();
                }
            } catch (Exception unused) {
            }
        }
    }

    public C41016G7w(C41017G7x c41017G7x, G84 g84, C68322mC<TuxSheet> c68322mC) {
        this.LJLIL = c41017G7x;
        this.LJLILLLLZI = g84;
        this.LJLJI = c68322mC;
    }
}
