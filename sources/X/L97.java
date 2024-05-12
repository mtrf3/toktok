package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L97 extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final float LJLJI;
    public final List<L7U> LJLJJI;

    public L97() {
        this(0, 0.0f, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), this.LJLJJI};
    }

    public static L97 L(L97 l97, List buttonListState) {
        int i = l97.LJLIL;
        int i2 = l97.LJLILLLLZI;
        float f = l97.LJLJI;
        l97.getClass();
        o.LJIIIZ(buttonListState, "buttonListState");
        return new L97(f, i, i2, buttonListState);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public L97(int r3, float r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 1
            if (r0 == 0) goto L23
            r1 = 2131827831(0x7f111c77, float:1.9288586E38)
        L7:
            r0 = r5 & 2
            if (r0 == 0) goto L11
            r0 = 18
            int r3 = X.C7MY.LIZIZ(r0)
        L11:
            r0 = r5 & 4
            if (r0 == 0) goto L17
            r4 = 1104150528(0x41d00000, float:26.0)
        L17:
            r0 = r5 & 8
            if (r0 == 0) goto L21
            X.OQg r0 = X.C61878OQg.INSTANCE
        L1d:
            r2.<init>(r4, r1, r3, r0)
            return
        L21:
            r0 = 0
            goto L1d
        L23:
            r1 = 0
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L97.<init>(int, float, int):void");
    }

    public L97(float f, int i, int i2, List buttonListState) {
        o.LJIIIZ(buttonListState, "buttonListState");
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = f;
        this.LJLJJI = buttonListState;
    }
}
