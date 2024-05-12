package X;

import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel$onLoadSuccess$1", f = "SharePanelViewModel.kt", l = {252}, m = "invokeSuspend")
/* renamed from: X.3W9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3W9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<IMContact> LJLILLLLZI;
    public final /* synthetic */ SharePanelViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3W9(List<IMContact> list, SharePanelViewModel sharePanelViewModel, InterfaceC67352kd<? super C3W9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = sharePanelViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3W9(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r3.LJLLILLLL != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0421 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02f5  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 1091
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3W9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
