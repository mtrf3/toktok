package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IWY extends C46742IWc {
    public final LinkedHashMap<String, String> LJLJI;

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new IWX(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IWY(InterfaceC46804IYm info) {
        super(info);
        o.LJIIIZ(info, "info");
        this.LJLJI = new LinkedHashMap<>();
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        this.LJLJI.clear();
    }
}
