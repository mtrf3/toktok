package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;

/* renamed from: X.5uC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149725uC extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C149705uA LJLIL;
    public final /* synthetic */ C158886Lk LJLILLLLZI;
    public final /* synthetic */ NLEEditor LJLJI;
    public final /* synthetic */ C166866gk LJLJJI;
    public final /* synthetic */ InterfaceC149745uE LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149725uC(C149705uA c149705uA, C158886Lk c158886Lk, NLEEditor nLEEditor, C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str, String str2, int i) {
        super(0);
        this.LJLIL = c149705uA;
        this.LJLILLLLZI = c158886Lk;
        this.LJLJI = nLEEditor;
        this.LJLJJI = c166866gk;
        this.LJLJJL = interfaceC149745uE;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.LJJLJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ);
        return C76800UCe.LIZ;
    }
}
