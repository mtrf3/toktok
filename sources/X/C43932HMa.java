package X;

import android.content.Context;

/* renamed from: X.HMa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43932HMa extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<String, Long, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC88474Ynu<String, Long, Integer, String, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C43932HMa(Context context, String str, boolean z, int i, int i2, InterfaceC88471Ynr<? super String, ? super Long, C76800UCe> interfaceC88471Ynr, InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe> interfaceC88474Ynu) {
        super(0);
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = interfaceC88471Ynr;
        this.LJLJL = interfaceC88474Ynu;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        new HMY(this.LJLIL).isVideoLengthOrTypeSupportedAndShowErrToast(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        return C76800UCe.LIZ;
    }
}
