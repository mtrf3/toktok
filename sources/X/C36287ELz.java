package X;

/* renamed from: X.ELz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36287ELz extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C36286ELy LJLIL;
    public final /* synthetic */ byte[] LJLILLLLZI;
    public final /* synthetic */ byte[] LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36287ELz(long j, long j2, C36286ELy c36286ELy, byte[] bArr, byte[] bArr2) {
        super(0);
        this.LJLIL = c36286ELy;
        this.LJLILLLLZI = bArr;
        this.LJLJI = bArr2;
        this.LJLJJI = j;
        this.LJLJJL = j2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C36283ELv.LIZIZ(this.LJLJJI, this.LJLJJL, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
