package X;

import kotlin.jvm.internal.AqS10S0111000_9;

/* loaded from: classes10.dex */
public final class LNG extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ UPK LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LNG(UPK upk, boolean z, int i, boolean z2) {
        super(0);
        this.LJLIL = upk;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = z2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        String str;
        UPK upk = this.LJLIL;
        if (this.LJLILLLLZI) {
            str = "fb_sign_up";
        } else {
            str = "fb_login";
        }
        upk.LJIILIIL(1, str, new AqS10S0111000_9(upk, this.LJLJI, this.LJLJJI, 0), new AqS10S0111000_9(this.LJLIL, this.LJLJI, this.LJLJJI, 1), new AqS10S0111000_9(this.LJLIL, this.LJLJI, this.LJLJJI, 2));
        return C76800UCe.LIZ;
    }
}
