package X;

/* renamed from: X.TdA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75068TdA implements InterfaceC30837C8j {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.InterfaceC30837C8j
    public final void onSuccess() {
        this.LIZ.invoke(Integer.valueOf(this.LIZIZ));
    }

    public C75068TdA(int i, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65784Pro;
    }
}
