package X;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: X.aJb, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92987aJb extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC88471Ynr<String, JSONObject, C76800UCe> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        try {
            C92054a4Y.LJII = this.LJLIL;
            C92054a4Y.LIZIZ = this.LJLILLLLZI;
            C92054a4Y.LIZJ(this.LJLJI);
            C92054a4Y.LIZLLL(this.LJLJI, this.LJLILLLLZI);
            C92054a4Y.LIZIZ(this.LJLJI, this.LJLILLLLZI);
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92987aJb(InterfaceC88471Ynr interfaceC88471Ynr, String str, Context context) {
        super(0);
        this.LJLIL = interfaceC88471Ynr;
        this.LJLILLLLZI = str;
        this.LJLJI = context;
    }
}
