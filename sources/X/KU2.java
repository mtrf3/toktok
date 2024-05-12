package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KU2 extends KU9 {
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8W0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.8W0, java.lang.Object] */
    @Override // X.KU9
    public final void LIZ() {
        if (KR8.LJIIIZ(this.LJLILLLLZI)) {
            return;
        }
        C51781KTx.LIZIZ(this.LJLILLLLZI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("asyncOnParentSet success >>> component:");
        LIZ.append(this.LJLJI);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    public KU2(Object obj, Object obj2) {
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
