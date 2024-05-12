package X;

import kotlin.jvm.internal.o;

/* renamed from: X.251, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass251 extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC23370vt, C23450w1> {
    public final /* synthetic */ C1ZD LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass251(C1ZD c1zd, float f) {
        super(1);
        this.LJLIL = c1zd;
        this.LJLILLLLZI = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88472Yns
    public final C23450w1 invoke(InterfaceC23370vt offset) {
        int LJJIIZ;
        o.LJIIIZ(offset, "$this$offset");
        if (this.LJLIL.LIZJ().isEmpty()) {
            LJJIIZ = O6R.LJJIIZ(this.LJLILLLLZI);
        } else {
            LJJIIZ = O6R.LJJIIZ(((Number) this.LJLIL.LJ.getValue()).floatValue());
        }
        return new C23450w1(C78939UyV.LIZ(0, LJJIIZ));
    }
}
