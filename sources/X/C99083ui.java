package X;

/* renamed from: X.3ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C99083ui extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C99083ui(C99253uz c99253uz) {
        super(0, c99253uz, C99253uz.class, "onClickItem", "onClickItem()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C99253uz c99253uz = (C99253uz) this.receiver;
        InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = c99253uz.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke("click_question");
        }
        c99253uz.LIZ();
        return C76800UCe.LIZ;
    }
}
