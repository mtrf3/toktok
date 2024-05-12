package X;

import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* renamed from: X.ajk, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94608ajk extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94608ajk(int i, int i2, int i3, String str) {
        super(0);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (CKEffectEditorContext.LIZJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("message: type:");
            LIZ.append(this.LJLIL);
            LIZ.append(", arg1: ");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(", arg2: ");
            LIZ.append(this.LJLJI);
            LIZ.append(", arg3: ");
            LIZ.append(this.LJLJJI);
            C94034aaU.LIZ("CKEffectEditorContext", X1D.LIZIZ(LIZ));
            if (this.LJLIL == 17 && this.LJLILLLLZI == 3) {
                C94034aaU.LIZ("CKEffectEditorContext", "resource load success");
                CKEffectEditorContext.LJIIJ.LIZ.postValue(Boolean.TRUE);
            }
        }
        return C76800UCe.LIZ;
    }
}
