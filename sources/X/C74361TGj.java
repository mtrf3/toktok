package X;

import androidx.lifecycle.LifecycleOwner;

/* renamed from: X.TGj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74361TGj implements W4C, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;

    @Override // X.W4C
    public final C74365TGn create() {
        C82622Wbi c82622Wbi = this.LJLIL;
        return new C74365TGn(c82622Wbi, new TGE(c82622Wbi), new C74363TGl((LifecycleOwner) this.LJLIL.LJ(LifecycleOwner.class, null)), new C46000I3o(this.LJLIL), new C74364TGm());
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C74361TGj(C82622Wbi c82622Wbi) {
        this.LJLIL = c82622Wbi;
    }
}
