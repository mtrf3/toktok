package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KP9 extends AbstractC65781Prl implements InterfaceC88472Yns<C252449vU, C252449vU> {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KP9(float f, float f2) {
        super(1);
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }

    @Override // X.InterfaceC88472Yns
    public final C252449vU invoke(C252449vU c252449vU) {
        KPB kpb;
        C252449vU setStateImmediate = c252449vU;
        o.LJIIIZ(setStateImmediate, "$this$setStateImmediate");
        float f = this.LJLIL;
        float f2 = this.LJLILLLLZI;
        if (f2 == 0.0f) {
            kpb = KPB.CLOSED;
        } else if (f2 == 1.0f) {
            kpb = KPB.OPENED;
        } else {
            kpb = KPB.OPENING;
        }
        return C252449vU.LIZ(setStateImmediate, null, false, null, null, f, kpb, null, null, null, null, null, null, null, 8143);
    }
}
