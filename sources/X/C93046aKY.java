package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.checkout.element.component.business.PhoneNumberKt$onCountryCodeTap$3", f = "PhoneNumber.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.aKY, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C93046aKY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ C1ZD LJLJJI;
    public final /* synthetic */ List<String> LJLJJL;
    public final /* synthetic */ InterfaceC24760y8<Integer> LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJL;
    public final /* synthetic */ InterfaceC70422pa LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C93046aKY(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, C1ZD c1zd, List<String> list, InterfaceC24760y8<Integer> interfaceC24760y8, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C93046aKY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = view;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC65784Pro2;
        this.LJLJJI = c1zd;
        this.LJLJJL = list;
        this.LJLJJLL = interfaceC24760y8;
        this.LJLJL = interfaceC88472Yns;
        this.LJLJLJ = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C93046aKY(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        View view = this.LJLIL;
        InterfaceC65784Pro<C76800UCe> onClose = this.LJLILLLLZI;
        InterfaceC65784Pro<C76800UCe> onOpen = this.LJLJI;
        C1ZD modalBottomSheetState = this.LJLJJI;
        C40431iJ LJFF = C1DJ.LJFF(new C92477aBN(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, modalBottomSheetState, onClose), -985536576, true);
        C43401n6 LJ = C91992a3Y.LJ();
        o.LJIIIZ(view, "<this>");
        o.LJIIIZ(onClose, "onClose");
        o.LJIIIZ(onOpen, "onOpen");
        o.LJIIIZ(modalBottomSheetState, "modalBottomSheetState");
        ViewGroup LIZ = C92116a5Y.LIZ(view);
        Context context = LIZ.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(C1DJ.LJFF(new C92388a9w(LIZ, composeView, onClose, onOpen, modalBottomSheetState, LJ, LJFF), -985532884, true));
        LIZ.addView(composeView);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
