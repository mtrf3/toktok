package X;

import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;

/* renamed from: X.HdR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44509HdR extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC44507HdP LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ VECutVideoPresenter LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44509HdR(InterfaceC44507HdP interfaceC44507HdP, int i, int i2, float f, String str, VECutVideoPresenter vECutVideoPresenter) {
        super(0);
        this.LJLIL = interfaceC44507HdP;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = f;
        this.LJLJJL = str;
        this.LJLJJLL = vECutVideoPresenter;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.onCompileError(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        InterfaceC153045zY interfaceC153045zY = this.LJLJJLL.LJLLLL;
        if (interfaceC153045zY != null) {
            interfaceC153045zY.prepare();
        }
        return C76800UCe.LIZ;
    }
}
