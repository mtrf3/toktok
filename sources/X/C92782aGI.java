package X;

/* renamed from: X.aGI, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92782aGI extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92782aGI(float f, int i, boolean z) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = f;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        num.intValue();
        C91901a25.LIZIZ(this.LJLIL, this.LJLILLLLZI, interfaceC24520xk, this.LJLJI | 1);
        return C76800UCe.LIZ;
    }
}
