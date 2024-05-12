package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5LV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LV extends AbstractC65781Prl implements InterfaceC88472Yns<C5M1, C5M1> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5LV(String str, String str2) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C5M1 invoke(C5M1 c5m1) {
        C08630Vn c08630Vn;
        C5M1 setState = c5m1;
        o.LJIIIZ(setState, "$this$setState");
        String str = this.LJLIL;
        if (str == null) {
            c08630Vn = new C08630Vn(new OSZ(null, null));
        } else {
            c08630Vn = new C08630Vn(new OSZ(str, this.LJLILLLLZI));
        }
        return C5M1.LIZ(setState, null, false, null, null, false, null, false, null, 0, null, null, null, null, c08630Vn, null, null, null, null, null, false, null, 2088959);
    }
}
