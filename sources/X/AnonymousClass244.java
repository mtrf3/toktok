package X;

import kotlin.jvm.internal.o;

/* renamed from: X.244, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass244 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC07280Qi, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass244(boolean z, long j) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC07280Qi interfaceC07280Qi) {
        EnumC18560o8 enumC18560o8;
        InterfaceC07280Qi semantics = interfaceC07280Qi;
        o.LJIIIZ(semantics, "$this$semantics");
        C07270Qh<C20280qu> c07270Qh = C20290qv.LIZJ;
        if (this.LJLIL) {
            enumC18560o8 = EnumC18560o8.SelectionStart;
        } else {
            enumC18560o8 = EnumC18560o8.SelectionEnd;
        }
        semantics.LIZJ(c07270Qh, new C20280qu(enumC18560o8, this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
