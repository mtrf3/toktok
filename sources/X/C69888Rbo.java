package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rbo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69888Rbo extends RuntimeException {
    public final int LJLIL;
    public final RYH LJLILLLLZI;

    public final int getCode() {
        return this.LJLIL;
    }

    public final RYH getResp() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69888Rbo(int i, String str, RYH resp) {
        super(str);
        o.LJIIIZ(resp, "resp");
        this.LJLIL = i;
        this.LJLILLLLZI = resp;
    }
}
