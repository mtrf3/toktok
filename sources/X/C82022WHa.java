package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.WHa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82022WHa extends WI1 {
    public WI0 LJIIIZ;
    public final C6MP LJIIJ;

    @Override // X.WI1
    public final int LJ() {
        return R.raw.icon_qa_fill_ltr;
    }

    public C82022WHa() {
        VLL vll = VLL.SLIDE;
        WJV.LIZ().LJI();
        this.LJIIIZ = new WI0(vll, 100, false);
        this.LJIIJ = C6MP.COMMENT_STICKER;
    }

    @Override // X.WI1
    public final int LJII() {
        if (I1U.LIZ() != 0) {
            return R.string.pr2;
        }
        return R.string.gfu;
    }

    @Override // X.WI1
    public final WI0 LIZJ() {
        return this.LJIIIZ;
    }

    @Override // X.WI1
    public final C6MP LJIIIIZZ() {
        return this.LJIIJ;
    }

    @Override // X.WI1
    public final void LIZ(WI0 wi0) {
        this.LJIIIZ = wi0;
    }
}
