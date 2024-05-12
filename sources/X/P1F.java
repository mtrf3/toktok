package X;

import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.AuthMaFPowerCell;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class P1F implements InterfaceC19530ph {
    public final /* synthetic */ AuthMaFPowerCell<T> LIZ;

    public P1F(AuthMaFPowerCell<T> authMaFPowerCell) {
        this.LIZ = authMaFPowerCell;
    }

    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        P1J p1j;
        P1K p1k;
        User LIZIZ;
        int i;
        o.LJIIIZ(itemID, "itemID");
        PowerCell powerCell = this.LIZ;
        P1K p1k2 = (P1K) powerCell.getItem();
        if (p1k2 == null || (p1j = p1k2.LJLJI) == null || (p1k = (P1K) powerCell.getItem()) == null || (LIZIZ = p1k.LIZIZ()) == null) {
            return;
        }
        String str = p1j.LJLIL;
        String str2 = p1j.LJLJI;
        String str3 = p1j.LJLILLLLZI;
        String str4 = p1j.LJLJJI;
        P1K p1k3 = (P1K) powerCell.getItem();
        if (p1k3 != null) {
            i = p1k3.LIZ();
        } else {
            i = 0;
        }
        new C227368w8(str, LIZIZ, str2, str3, str4, Integer.valueOf(i), 64).LIZLLL(null);
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(p1j.LJLIL);
        c57362MfG.LJJIJ(p1j.LJLJI);
        c57362MfG.LJJJI(p1j.LJLILLLLZI);
        String str5 = p1j.LJLJJI;
        if (str5 == null) {
            str5 = "";
        }
        c57362MfG.LJJLIIIJLJLI = str5;
        c57362MfG.LJJLI = EnumC57366MfK.CARD;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
        c57362MfG.LJJJJIZL(LIZIZ);
        c57362MfG.LJIILIIL();
    }
}
