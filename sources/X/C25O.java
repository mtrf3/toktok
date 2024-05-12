package X;

import kotlin.jvm.internal.o;

/* renamed from: X.25O, reason: invalid class name */
/* loaded from: classes.dex */
public final class C25O extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC07280Qi, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25O(boolean z, String str) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC07280Qi interfaceC07280Qi) {
        InterfaceC07280Qi semantics = interfaceC07280Qi;
        o.LJIIIZ(semantics, "$this$semantics");
        if (this.LJLIL) {
            String description = this.LJLILLLLZI;
            o.LJIIIZ(description, "description");
            semantics.LIZJ(C07230Qd.LJJIFFI, description);
        }
        return C76800UCe.LIZ;
    }
}
