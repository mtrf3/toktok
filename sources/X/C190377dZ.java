package X;

/* renamed from: X.7dZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190377dZ extends AbstractC65781Prl implements InterfaceC88471Ynr<Boolean, Boolean, C76800UCe> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<String, Boolean, C76800UCe> LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C190377dZ(String str, InterfaceC88471Ynr interfaceC88471Ynr, C34K c34k, C34K c34k2, C34K c34k3) {
        super(2);
        this.LJLIL = c34k;
        this.LJLILLLLZI = c34k2;
        this.LJLJI = c34k3;
        this.LJLJJI = interfaceC88471Ynr;
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Boolean bool, Boolean bool2) {
        bool.booleanValue();
        boolean booleanValue = bool2.booleanValue();
        boolean z = true;
        this.LJLIL.element = true;
        C34K c34k = this.LJLILLLLZI;
        if (!booleanValue) {
            z = false;
        }
        c34k.element = z;
        if (this.LJLJI.element) {
            this.LJLJJI.invoke(this.LJLJJL, Boolean.valueOf(z));
        }
        return C76800UCe.LIZ;
    }
}
