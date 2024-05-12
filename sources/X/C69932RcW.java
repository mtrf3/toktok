package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel$openSku$1$1", f = "PdpViewModel.kt", l = {2781}, m = "invokeSuspend")
/* renamed from: X.RcW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69932RcW extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public SkuPanelState LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ PdpViewModel LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ View LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ InterfaceC88473Ynt<Boolean, String, Object, C76800UCe> LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C69932RcW(PdpViewModel pdpViewModel, boolean z, long j, View view, int i, String str, String str2, InterfaceC88473Ynt<? super Boolean, ? super String, Object, C76800UCe> interfaceC88473Ynt, InterfaceC67352kd<? super C69932RcW> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLJJI = pdpViewModel;
        this.LJLJJL = z;
        this.LJLJJLL = j;
        this.LJLJL = view;
        this.LJLJLJ = i;
        this.LJLJLLL = str;
        this.LJLL = str2;
        this.LJLLI = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69932RcW(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x018f, code lost:
    
        if (r2 == null) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69932RcW.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
