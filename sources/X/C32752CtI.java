package X;

/* renamed from: X.CtI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32752CtI extends AbstractC65781Prl implements InterfaceC88471Ynr<Long, Integer, C76800UCe> {
    public final /* synthetic */ C32676Cs4 LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32752CtI(long j, C32676Cs4 c32676Cs4) {
        super(2);
        this.LJLIL = c32676Cs4;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Long l, Integer num) {
        l.longValue();
        num.intValue();
        this.LJLIL.LJIJ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
