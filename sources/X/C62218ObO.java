package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ObO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62218ObO extends AbstractC65781Prl implements InterfaceC88471Ynr<String, String, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<AbstractC62625Ohx, C76800UCe> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62218ObO(String str, InterfaceC88472Yns interfaceC88472Yns) {
        super(2);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String downloadPath, String str) {
        String shareUrl = str;
        o.LJIIIZ(downloadPath, "downloadPath");
        o.LJIIIZ(shareUrl, "shareUrl");
        this.LJLIL.invoke(new C62314Ocw(OYF.LJFF(this.LJLILLLLZI), null, null, shareUrl, 28));
        return C76800UCe.LIZ;
    }
}
