package X;

import android.widget.EditText;

/* renamed from: X.ak2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94626ak2 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C93695aV1 LJLIL;
    public final /* synthetic */ EditText LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94626ak2(C93695aV1 c93695aV1, EditText editText, int i) {
        super(0);
        this.LJLIL = c93695aV1;
        this.LJLILLLLZI = editText;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C93695aV1 c93695aV1 = this.LJLIL;
        EditText editText = this.LJLILLLLZI;
        int i = this.LJLJI - 1;
        if (i <= 0) {
            if (c93695aV1.isSelected()) {
                editText.requestFocus();
                return C76800UCe.LIZ;
            }
        } else {
            c93695aV1.getClass();
        }
        C93729aVZ.LJ(editText, new C94626ak2(c93695aV1, editText, i));
        return C76800UCe.LIZ;
    }
}
