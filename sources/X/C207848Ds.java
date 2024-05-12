package X;

import android.content.Intent;

/* renamed from: X.8Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207848Ds extends AbstractC65781Prl implements InterfaceC88472Yns<C207858Dt, C207858Dt> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ Intent LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207848Ds(int i, int i2, Intent intent) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = intent;
    }

    @Override // X.InterfaceC88472Yns
    public final C207858Dt invoke(C207858Dt c207858Dt) {
        if (c207858Dt != null) {
            return new C207858Dt(new C43I(new C207868Du(this.LJLIL, this.LJLILLLLZI, this.LJLJI)));
        }
        return null;
    }
}
