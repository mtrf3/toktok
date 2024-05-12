package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.bnpl.biz.bill.statements.BillStatementsListFragment;

/* renamed from: X.a9J, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92349a9J extends C1BC {
    public final Context LJLJJLL;
    public final String LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:? A[RETURN, SYNTHETIC] */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence LJIILIIL(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L12
            android.content.Context r1 = r2.LJLJJLL
            if (r1 == 0) goto Lf
            r0 = 2131834763(0x7f11378b, float:1.9302645E38)
            java.lang.String r0 = r1.getString(r0)
        Ld:
            if (r0 != 0) goto L11
        Lf:
            java.lang.String r0 = ""
        L11:
            return r0
        L12:
            android.content.Context r1 = r2.LJLJJLL
            if (r1 == 0) goto Lf
            r0 = 2131834759(0x7f113787, float:1.9302637E38)
            java.lang.String r0 = r1.getString(r0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92349a9J.LJIILIIL(int):java.lang.CharSequence");
    }

    @Override // X.C1BC
    public final Fragment LJJIII(int i) {
        BillStatementsListFragment billStatementsListFragment = new BillStatementsListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("trans_category", i);
        bundle.putString("previous_page_id", this.LJLJL);
        billStatementsListFragment.setArguments(bundle);
        return billStatementsListFragment;
    }

    public C92349a9J(Context context, FragmentManager fragmentManager, String str) {
        super(fragmentManager, 1);
        this.LJLJJLL = context;
        this.LJLJL = str;
    }
}
