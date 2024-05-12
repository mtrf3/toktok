package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspAsyncInflateSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Avl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27809Avl<T> implements InterfaceC64592gB {
    public final /* synthetic */ OrderSubmitViewModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C27809Avl(OrderSubmitViewModel orderSubmitViewModel, int i) {
        this.LJLIL = orderSubmitViewModel;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        BillInfoData billInfoData;
        Response response = (Response) obj;
        OrderSubmitViewModel orderSubmitViewModel = this.LJLIL;
        T t = null;
        if (response != null) {
            str = Integer.valueOf(response.code).toString();
        } else {
            str = null;
        }
        orderSubmitViewModel.LJZL = str;
        if (response != null) {
            t = response.data;
        }
        if (t == null) {
            String string = EF7.LIZIZ().getResources().getString(R.string.r_z);
            o.LJIIIIZZ(string, "getApplicationContext().…ase_verify_login_failure)");
            C5S1 c5s1 = new C5S1(EF7.LIZIZ());
            c5s1.LIZLLL(string);
            c5s1.LJ();
            if (OspAsyncInflateSettings.LIZIZ()) {
                this.LJLIL.setState(C27780AvI.LJLIL);
            }
            this.LJLIL.Pw0(false);
            return;
        }
        T t2 = response.data;
        if ((t2 instanceof BillInfoData) && (billInfoData = (BillInfoData) t2) != null && o.LJ(billInfoData.getLastChunk(), Boolean.TRUE)) {
            if (OspAsyncInflateSettings.LIZIZ()) {
                this.LJLIL.setState(C27781AvJ.LJLIL);
            }
            this.LJLIL.Pw0(false);
            OrderSubmitViewModel orderSubmitViewModel2 = this.LJLIL;
            if (orderSubmitViewModel2.LLJLIL) {
                orderSubmitViewModel2.LLJLIL = false;
                BillInfoData billInfoData2 = orderSubmitViewModel2.LJZ;
                if (billInfoData2 != null) {
                    orderSubmitViewModel2.ww0(billInfoData2);
                }
            }
        }
        OrderSubmitViewModel orderSubmitViewModel3 = this.LJLIL;
        orderSubmitViewModel3.Lv0((BillInfoData) response.data, new BillInfoRequest(null, 0, null, false, false, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.LJLILLLLZI, orderSubmitViewModel3.LLJZ, null, null, 436207615, null), false, false);
    }
}
