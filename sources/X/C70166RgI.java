package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RgI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70166RgI extends C0A6 {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    public C70166RgI(AqS162S0100000_12 aqS162S0100000_12) {
        this.LJLIL = aqS162S0100000_12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r3 == 0) goto L8;
     */
    @Override // X.C0A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(int r3, androidx.recyclerview.widget.RecyclerView r4) {
        /*
            r2 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            int r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L1c
            if (r3 != 0) goto L19
            int r1 = r2.LJLJI
            r0 = 8
            if (r1 <= r0) goto L16
            X.Pro<X.UCe> r0 = r2.LJLIL
            r0.invoke()
        L16:
            r0 = 0
            r2.LJLJI = r0
        L19:
            r2.LJLILLLLZI = r3
            return
        L1c:
            if (r3 != 0) goto L19
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70166RgI.LJIILJJIL(int, androidx.recyclerview.widget.RecyclerView):void");
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJI = Math.abs(i) + this.LJLJI;
    }
}
