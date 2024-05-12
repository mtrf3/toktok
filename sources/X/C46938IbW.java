package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.IbW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46938IbW extends C46742IWc {
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // X.C46742IWc, X.IZT
    public final void LJIIIIZZ() {
        this.LJLJJLL = false;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJI() {
        this.LJLJI = 0;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = false;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIFFI() {
        this.LJLJJLL = true;
    }

    @Override // X.C46742IWc, X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILIIL() {
        int i = (this.LJLJI - this.LJLJJL) - this.LJLJJI;
        if (i < 0) {
            i = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("block_cnt_exclude_render_seeking", String.valueOf(i));
        return hashMap;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJL(new C46941IbZ(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46938IbW(InterfaceC46804IYm info) {
        super(info);
        o.LJIIIZ(info, "info");
    }
}
