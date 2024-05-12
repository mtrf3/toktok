package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* renamed from: X.8as, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214188as implements C5H3<InterfaceC214228aw<Object>> {
    public InterfaceC214228aw<Object> LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<InterfaceC214228aw<Object>> LJLILLLLZI;
    public final /* synthetic */ AssemViewModel<Object> LJLJI;

    @Override // X.C5H3
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.C5H3
    public final InterfaceC214228aw<Object> getValue() {
        InterfaceC214228aw<Object> interfaceC214228aw = this.LJLIL;
        if (interfaceC214228aw == null) {
            InterfaceC214228aw<Object> invoke = this.LJLILLLLZI.invoke();
            AssemViewModel<Object> assemViewModel = this.LJLJI;
            InterfaceC214228aw<Object> interfaceC214228aw2 = invoke;
            this.LJLIL = interfaceC214228aw2;
            assemViewModel.putCreatedRepository(interfaceC214228aw2);
            return interfaceC214228aw2;
        }
        return interfaceC214228aw;
    }

    public C214188as(AssemViewModel assemViewModel, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = assemViewModel;
    }
}
