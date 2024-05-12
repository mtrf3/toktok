package X;

import kotlin.jvm.internal.o;

/* renamed from: X.20i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514820i extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ C514920j LJLIL;
    public final /* synthetic */ double LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514820i(double d, C514920j c514920j) {
        super(1);
        this.LJLIL = c514920j;
        this.LJLILLLLZI = d;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String targetKey = str;
        o.LJIIIZ(targetKey, "targetKey");
        super/*X.1mf*/.LJ(targetKey, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
