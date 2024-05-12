package X;

import kotlin.jvm.internal.o;

/* renamed from: X.20h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C514720h extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ C514920j LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C514720h(C514920j c514920j, boolean z) {
        super(1);
        this.LJLIL = c514920j;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String targetKey = str;
        o.LJIIIZ(targetKey, "targetKey");
        super/*X.1mf*/.LJI(targetKey, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
