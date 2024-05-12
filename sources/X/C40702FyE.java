package X;

import android.app.Activity;
import java.util.HashSet;

/* renamed from: X.FyE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40702FyE extends AbstractC65781Prl implements InterfaceC65784Pro<C66531Q9f<C76800UCe>> {
    public final /* synthetic */ android.net.Uri LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Activity LJLJI;
    public final /* synthetic */ int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40702FyE(android.net.Uri uri, String str, Activity activity, int i) {
        super(0);
        this.LJLIL = uri;
        this.LJLILLLLZI = str;
        this.LJLJI = activity;
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final C66531Q9f<C76800UCe> invoke() {
        C40704FyG c40704FyG = new C40704FyG(new C40703FyF(this.LJLIL, this.LJLILLLLZI));
        Activity activity = this.LJLJI;
        int i = this.LJLJJI;
        if (!C40700FyC.LIZ(C40701FyD.class)) {
            try {
                if (!C39242Fag.LIZ(activity, "com.facebook.orca")) {
                    C40701FyD.LIZIZ(activity);
                } else if (((HashSet) C40701FyD.LIZ(activity)).contains(20150314)) {
                    C40701FyD.LIZJ(activity, i, c40704FyG);
                } else {
                    C40701FyD.LIZIZ(activity);
                }
            } catch (Throwable unused) {
            }
        }
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }
}
