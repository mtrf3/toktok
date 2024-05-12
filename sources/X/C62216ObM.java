package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.ObM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62216ObM extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, C76800UCe> {
    public final /* synthetic */ C62217ObN LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62216ObM(C62217ObN c62217ObN, String str, Context context) {
        super(2);
        this.LJLIL = c62217ObN;
        this.LJLILLLLZI = str;
        this.LJLJI = context;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String downloadPath, String str) {
        String shareUrl = str;
        o.LJIIIZ(downloadPath, "downloadPath");
        o.LJIIIZ(shareUrl, "shareUrl");
        this.LJLIL.LIZ.LJIIJ(new C62314Ocw(OYF.LJFF(this.LJLILLLLZI), null, null, shareUrl, 28), this.LJLJI, null);
        return C76800UCe.LIZ;
    }
}
