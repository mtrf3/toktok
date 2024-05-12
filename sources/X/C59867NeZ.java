package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NeZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59867NeZ extends F9E {
    public final InterfaceC65350Pko<F1B> LJLIL;
    public final InterfaceC88473Ynt<android.net.Uri, C59869Neb, java.util.Map<String, String>, F1B> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C59867NeZ(C65776Prg c65776Prg, InterfaceC88473Ynt provider) {
        o.LJIIIZ(provider, "provider");
        this.LJLIL = c65776Prg;
        this.LJLILLLLZI = provider;
    }
}
