package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172416ph extends AbstractC65781Prl implements InterfaceC88471Ynr<Integer, String, C76800UCe> {
    public final /* synthetic */ XJL<C172456pl> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172416ph(XKS xks, String str, String str2) {
        super(2);
        this.LJLIL = xks;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Integer num, String str) {
        num.intValue();
        String msg = str;
        o.LJIIIZ(msg, "msg");
        XJL<C172456pl> xjl = this.LJLIL;
        C172456pl c172456pl = new C172456pl(false, 2, msg, this.LJLILLLLZI, this.LJLJI);
        C3C5.m7constructorimpl(c172456pl);
        xjl.resumeWith(c172456pl);
        return C76800UCe.LIZ;
    }
}
