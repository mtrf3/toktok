package X;

import android.app.Activity;

/* loaded from: classes12.dex */
public final class Q99 extends AbstractC65781Prl implements InterfaceC65784Pro<C66531Q9f<C76800UCe>> {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ int LJLJJI = 12306;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q99(android.net.Uri uri, String str, Activity activity) {
        super(0);
        this.LJLIL = uri;
        this.LJLILLLLZI = str;
        this.LJLJI = activity;
    }

    @Override // X.InterfaceC65784Pro
    public final C66531Q9f<C76800UCe> invoke() {
        Q96 q96 = new Q96();
        q96.LIZ = "Facebook";
        q96.LIZIZ = "shareToMessenger";
        q96.LIZJ = C113554cx.LJJL(new OSZ("localUri", this.LJLIL), new OSZ("mimeType", this.LJLILLLLZI));
        q96.LIZLLL = E2C.LIZJ("x-tt-dataflow-id", "939524613");
        return C85999Xp5.LJ(new Q9D(q96), C66607QCd.LJLIL, new C40702FyE(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI));
    }
}
