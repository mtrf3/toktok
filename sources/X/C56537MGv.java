package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MGv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56537MGv extends C56536MGu {
    public final String LJLJJI;

    @Override // X.C56536MGu, X.MGV
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C220408ku.LIZ(this, str);
    }

    @Override // X.C56536MGu, X.MGV
    public C51031K1b<MIP> getPresenter(int i, ActivityC45651qj activityC45651qj) {
        C56538MGw c56538MGw = new C56538MGw(this.LJLJJI);
        c56538MGw.LJJ(new MIP(this.LJLIL, i));
        c56538MGw.LJIILL(1, this.LJLJJI, Integer.valueOf(i));
        return c56538MGw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56537MGv(int i, String previousPage, String stickerId) {
        super(previousPage, i);
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(stickerId, "stickerId");
        this.LJLJJI = stickerId;
    }
}
