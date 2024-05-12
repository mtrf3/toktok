package X;

import Y.ARunnableS50S0100000_14;
import Y.IDCListenerS165S0100000_14;
import com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity;
import com.zhiliaoapp.musically.R;

/* renamed from: X.WTr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82351WTr implements InterfaceC61107NyZ {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ HeaderDetailActivity LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        C164906da c164906da;
        if (c164906daArr.length <= 0 || (c164906da = c164906daArr[0]) == null) {
            return;
        }
        EnumC61598OFm enumC61598OFm = c164906da.LIZIZ;
        if (enumC61598OFm != EnumC61598OFm.GRANTED) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("saveBitmap permission failure: ");
            LIZ.append(enumC61598OFm);
            C221018lt.LJFF("HeaderDetailActivity", X1D.LIZIZ(LIZ));
            C26335AVf.LJJIIJZLJL(this.LIZ);
            if (!C1AR.LJI(this.LIZIZ, c164906da.LIZ)) {
                C62905OmT c62905OmT = new C62905OmT(this.LIZIZ);
                c62905OmT.LIZ(R.string.bse);
                c62905OmT.LJI(R.string.cg_);
                c62905OmT.LJIIJ(R.string.dsi, new IDCListenerS165S0100000_14(this, 3));
                C279017q.LIZLLL(c62905OmT);
            }
            this.LIZIZ.LJLJL.clearAnimation();
            this.LIZIZ.LJLJL.setVisibility(8);
            this.LIZIZ.LJLJLJ.setVisibility(8);
            this.LIZIZ.LJLJJLL.setVisibility(0);
            return;
        }
        C38816FLg.LJ(new ARunnableS50S0100000_14(this, 80));
    }

    public C82351WTr(HeaderDetailActivity headerDetailActivity, String str) {
        this.LIZIZ = headerDetailActivity;
        this.LIZ = str;
    }
}
