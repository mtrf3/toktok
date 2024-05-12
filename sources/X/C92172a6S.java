package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.StatementsTabFragment;

/* renamed from: X.a6S, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92172a6S implements C0C3 {
    public final /* synthetic */ StatementsTabFragment LJLIL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C92172a6S(StatementsTabFragment statementsTabFragment) {
        this.LJLIL = statementsTabFragment;
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        String str;
        EnumC92259a7r.Companion.getClass();
        if (C92001a3h.LIZ(i) == EnumC92259a7r.PAID) {
            str = "paid";
        } else {
            str = "unpaid";
        }
        C91834a10.LIZLLL(str, (String) this.LJLIL.LJLJJI.getValue());
    }
}
