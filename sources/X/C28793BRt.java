package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BRt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28793BRt extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public /* synthetic */ C28793BRt() {
        this("more", "", "");
    }

    public C28793BRt(String str, String guideReason, String guideFrom) {
        o.LJIIIZ(guideReason, "guideReason");
        o.LJIIIZ(guideFrom, "guideFrom");
        this.LJLIL = true;
        this.LJLILLLLZI = str;
        this.LJLJI = guideReason;
        this.LJLJJI = guideFrom;
    }
}
