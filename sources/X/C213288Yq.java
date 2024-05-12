package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.favorites.business.FavoritesPagerAdapter;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8Yq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C213288Yq extends AbstractC186377Td implements InterfaceC72822Si2 {
    public final C213218Yj LJLILLLLZI;

    @Override // X.AbstractC186377Td
    public final C213218Yj LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC186377Td
    public final void LIZJ(Lifecycle.Event event) {
        o.LJIIIZ(event, "event");
        int i = C213278Yp.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C72818Shy.LJII("pdp_save_product", this);
            return;
        }
        C72818Shy.LIZLLL("pdp_save_product", this);
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        boolean z;
        if (o.LJ(c199097rd.LJLIL, "pdp_save_product")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            boolean z2 = false;
            if (interfaceC78280Uns != null && u.LJJIJIIJI(interfaceC78280Uns, "saved", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 != null && u.LJJIIZI(interfaceC78280Uns2, "saved", false)) {
                z2 = true;
            }
            if (z || z2) {
                LJFF(this.LJLIL);
            } else {
                LIZIZ(this.LJLIL);
            }
        }
    }

    public C213288Yq(Fragment fragment, FavoritesPagerAdapter favoritesPagerAdapter) {
        this.LJLILLLLZI = new C213218Yj(fragment, favoritesPagerAdapter.LJJIJIIJIL(R.string.txm, "wishlist_products_tab_name"), "product", "products", favoritesPagerAdapter.LJLJJLL.getString(R.string.txl));
    }
}
