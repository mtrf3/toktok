package X;

import com.ss.android.vesdk.VERecorder;

/* loaded from: classes8.dex */
public final class IAQ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ IAP LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ VERecorder LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAQ(IAP iap, int i, int i2, String str, VERecorder vERecorder) {
        super(0);
        this.LJLIL = iap;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
        this.LJLJJL = vERecorder;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LJLJI.invoke(Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, this.LJLJJL);
        return C76800UCe.LIZ;
    }
}
