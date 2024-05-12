package X;

import kotlin.jvm.internal.o;

/* renamed from: X.JsK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50528JsK extends F9E implements KK7 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final boolean LJLL;

    public C50528JsK() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), this.LJLJJL, this.LJLJJLL, this.LJLJL, Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL)};
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    static {
        C17N.LJJJJLI().cs().LIZIZ(C65352Pkq.LIZ(C50528JsK.class), C50529JsL.LJLIL);
    }

    public /* synthetic */ C50528JsK(int i) {
        this(0, 0, "discovery", "", "", "", "", true, true, false);
    }

    public C50528JsK(int i, int i2, String searchEntrance, String previousPage, String isFromComment, String isFromVideo, String isFromVideoOld, boolean z, boolean z2, boolean z3) {
        o.LJIIIZ(searchEntrance, "searchEntrance");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(isFromComment, "isFromComment");
        o.LJIIIZ(isFromVideo, "isFromVideo");
        o.LJIIIZ(isFromVideoOld, "isFromVideoOld");
        this.LJLIL = searchEntrance;
        this.LJLILLLLZI = previousPage;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = isFromComment;
        this.LJLJJLL = isFromVideo;
        this.LJLJL = isFromVideoOld;
        this.LJLJLJ = i;
        this.LJLJLLL = i2;
        this.LJLL = z3;
    }
}
