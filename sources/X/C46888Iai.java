package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Iai, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46888Iai extends C46742IWc {
    public java.util.Map<String, ? extends Object> LJLJI;
    public final HashMap<String, String> LJLJJI;

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new C46899Iat(this));
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILIIL() {
        return this.LJLJJI;
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJJIIJ() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46888Iai(InterfaceC46804IYm info) {
        super(info);
        o.LJIIIZ(info, "info");
        this.LJLJI = new HashMap();
        this.LJLJJI = new HashMap<>();
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        this.LJLJI = map;
        this.LJLJJI.clear();
    }
}
