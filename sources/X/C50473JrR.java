package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JrR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50473JrR extends F9E implements KK7 {
    public final java.util.Map<String, String> LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;

    public C50473JrR() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().Bw().LIZIZ(C65352Pkq.LIZ(C50473JrR.class), C50479JrX.LJLIL);
    }

    public /* synthetic */ C50473JrR(int i) {
        this("", "", false, C113554cx.LJJJLIIL());
    }

    public C50473JrR(String enterCommentId, String isFromPhoto, boolean z, java.util.Map extraLogParams) {
        o.LJIIIZ(extraLogParams, "extraLogParams");
        o.LJIIIZ(enterCommentId, "enterCommentId");
        o.LJIIIZ(isFromPhoto, "isFromPhoto");
        this.LJLIL = extraLogParams;
        this.LJLILLLLZI = enterCommentId;
        this.LJLJI = z;
        this.LJLJJI = isFromPhoto;
    }
}
