package X;

import kotlin.jvm.internal.o;

/* renamed from: X.IZt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46837IZt extends C46742IWc {
    public String LJLJI;
    public String LJLJJI;

    public C46837IZt(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        if (map.get("sub_tag") instanceof String) {
            this.LJLJI = (String) map.get("sub_tag");
        }
        ((Boolean) map.get("prepare_only")).booleanValue();
        this.LJLILLLLZI.getSourceId();
        C46734IVu.LIZLLL();
        Object value = IZ8.LLJJIJIIJIL.getValue();
        o.LJIIIIZZ(value, "<get-EnablePlayCustomCacheDir>(...)");
        if (((Boolean) value).booleanValue()) {
            player.LIZ.LLZZ = new C46838IZu(this);
        }
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIII(boolean z) {
        C46882Iac player;
        InterfaceC46804IYm interfaceC46804IYm = this.LJLILLLLZI;
        if (interfaceC46804IYm == null || (player = interfaceC46804IYm.getPlayer()) == null) {
            return;
        }
        player.LIZ.LLZZ = null;
    }
}
