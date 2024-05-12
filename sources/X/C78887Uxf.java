package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Uxf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78887Uxf extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78887Uxf(String str, int i) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf it) {
        o.LJIIIZ(it, "it");
        String enterFrom = this.LJLIL;
        int i = this.LJLILLLLZI;
        o.LJIIIZ(enterFrom, "enterFrom");
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", enterFrom);
        c35936E8m.LIZLLL("enter_method", "popup");
        c35936E8m.LIZ(i, "show_index");
        FMX.LJIIL("save_login_info_show", c35936E8m.LIZ);
        return C76800UCe.LIZ;
    }
}
