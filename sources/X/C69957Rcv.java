package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSaleReminderButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Rcv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69957Rcv<T> implements InterfaceC64592gB {
    public final /* synthetic */ PdpViewModel LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ RV8 LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    public C69957Rcv(PdpViewModel pdpViewModel, View view, RV8 rv8, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = pdpViewModel;
        this.LJLILLLLZI = view;
        this.LJLJI = rv8;
        this.LJLJJI = interfaceC65784Pro;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        if (!((Response) obj).isCodeOK()) {
            C70414RkI c70414RkI = this.LJLIL.LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIJLIJ("app_registration", false);
            }
            C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
            c26045AKb.LJIIIIZZ(R.string.t4k);
            c26045AKb.LIZLLL(1000L);
            c26045AKb.LJIIJ();
            return;
        }
        C70414RkI c70414RkI2 = this.LJLIL.LLFII;
        if (c70414RkI2 != null) {
            c70414RkI2.LJJIJLIJ("app_registration", true);
        }
        FlashSaleReminderButton flashSaleReminderButton = this.LJLJI.LJ;
        if (flashSaleReminderButton != null) {
            flashSaleReminderButton.status = 2;
        }
        this.LJLIL.setState(RWL.LJLIL);
        this.LJLJJI.invoke();
    }
}
