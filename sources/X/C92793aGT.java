package X;

import androidx.navigation.NavBackStackEntry;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutUiState;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.aGT, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92793aGT extends AbstractC65781Prl implements InterfaceC88474Ynu<InterfaceC06520Nk, NavBackStackEntry, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ CheckoutUiState LJLIL;
    public final /* synthetic */ CheckoutViewModel LJLILLLLZI;
    public final /* synthetic */ C92145a61 LJLJI;
    public final /* synthetic */ C31431Lf LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92793aGT(CheckoutUiState checkoutUiState, CheckoutViewModel checkoutViewModel, C92145a61 c92145a61, C31431Lf c31431Lf, int i) {
        super(4);
        this.LJLIL = checkoutUiState;
        this.LJLILLLLZI = checkoutViewModel;
        this.LJLJI = c92145a61;
        this.LJLJJI = c31431Lf;
        this.LJLJJL = i;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(InterfaceC06520Nk checkoutRoutePage, NavBackStackEntry it, InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        o.LJIIIZ(checkoutRoutePage, "$this$checkoutRoutePage");
        o.LJIIIZ(it, "it");
        boolean isLoading = this.LJLIL.isLoading();
        boolean isContentError = this.LJLIL.isContentError();
        boolean isPayLoading = this.LJLIL.isPayLoading();
        String formattedAmount = this.LJLILLLLZI.formattedAmount();
        C92204a6y bizData = this.LJLIL.getBizData();
        InterfaceC91961a33 selectedMethod = this.LJLIL.getSelectedMethod();
        boolean isImeOpen = this.LJLIL.isImeOpen();
        int imeHeight = this.LJLIL.getImeHeight();
        C93179aMh c93179aMh = new C93179aMh(this.LJLILLLLZI);
        C93165aMT c93165aMT = new C93165aMT(this.LJLILLLLZI);
        C93166aMU c93166aMU = new C93166aMU(this.LJLILLLLZI);
        C92283a8F eventSender = this.LJLILLLLZI.getEventSender();
        String str = this.LJLILLLLZI.getOrderInfo().LJLJJLL;
        String str2 = this.LJLILLLLZI.getOrderInfo().LJLJJL;
        C92083a51 apiService = this.LJLILLLLZI.getApiService();
        Boolean bool = this.LJLILLLLZI.getConfiguration().LJIIJ;
        C91901a25.LIZ(isLoading, isContentError, isPayLoading, formattedAmount, bizData, selectedMethod, isImeOpen, imeHeight, this.LJLJI, c93179aMh, c93165aMT, c93166aMU, eventSender, str, bool, str2, apiService, this.LJLJJI, interfaceC24520xk, 134512640, ((this.LJLJJL << 12) & 29360128) | 2097664, 0);
        return C76800UCe.LIZ;
    }
}
