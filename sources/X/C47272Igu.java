package X;

import android.util.SparseIntArray;
import kotlin.jvm.internal.o;

/* renamed from: X.Igu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47272Igu extends C46742IWc {
    public final C47273Igv LJLJI;
    public InterfaceC46663ITb LJLJJI;

    @Override // X.C46742IWc, X.IZT
    public final void LJIIIIZZ() {
        this.LJLJI.LJJIJIIJI = false;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIFFI() {
        C47273Igv c47273Igv = this.LJLJI;
        c47273Igv.LJJIJ = true;
        c47273Igv.LJJIJIIJI = true;
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIJ() {
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        SparseIntArray s7 = this.LJLILLLLZI.s7();
        player.LJLLLL(118, s7.get(3, 1000));
        player.LJLLLL(202, s7.get(4, 5000));
        player.LJLLLL(11, 0);
        player.LJLLLL(551, s7.get(57));
        C47282Ih4 q7 = this.LJLILLLLZI.q7();
        Object value = IZ8.LLLLLZL.getValue();
        o.LJIIIIZZ(value, "<get-disablePreBlock>(...)");
        if (!((Boolean) value).booleanValue()) {
            player.LLJL(new C46807IYp(this, q7));
            player.LLJILLL(new C47276Igy(this, q7));
        } else {
            player.LLJL(new C46806IYo(this, q7));
        }
    }

    public C47272Igu(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
        this.LJLJI = new C47273Igv();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    @Override // X.C46742IWc, X.IZT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47272Igu.LJIIZILJ(java.util.Map):void");
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIII(boolean z) {
        this.LJLJI.LIZJ();
    }
}
