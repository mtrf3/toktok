package X;

import kotlin.jvm.internal.o;

/* renamed from: X.We3, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82767We3 extends AbstractC65781Prl implements InterfaceC88472Yns<C82750Wdm, C82750Wdm> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82767We3(boolean z, boolean z2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final C82750Wdm invoke(C82750Wdm c82750Wdm) {
        boolean z;
        C82750Wdm setState = c82750Wdm;
        o.LJIIIZ(setState, "$this$setState");
        if (!this.LJLIL && !this.LJLILLLLZI) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !this.LJLILLLLZI;
        return C82750Wdm.LIZ(setState, null, false, false, new C08630Vn(Boolean.valueOf(z2)), z, z2, false, null, 395);
    }
}
