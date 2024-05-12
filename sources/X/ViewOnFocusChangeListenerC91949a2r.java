package X;

import Y.IDRunnableS89S0100000_31;
import android.view.View;
import com.ss.android.ugc.aweme.bnpl.biz.bill.repayment.RepaymentAssem;
import com.zhiliaoapp.musically.R;

/* renamed from: X.a2r, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class ViewOnFocusChangeListenerC91949a2r implements View.OnFocusChangeListener {
    public final /* synthetic */ RepaymentAssem LJLIL;
    public final /* synthetic */ C26018AJa LJLILLLLZI;

    public ViewOnFocusChangeListenerC91949a2r(C26018AJa c26018AJa, RepaymentAssem repaymentAssem) {
        this.LJLIL = repaymentAssem;
        this.LJLILLLLZI = c26018AJa;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.LJLIL.v3().LJLL = System.currentTimeMillis();
            this.LJLILLLLZI.LJ(true);
            RepaymentAssem repaymentAssem = this.LJLIL;
            View _$_findCachedViewById = repaymentAssem._$_findCachedViewById(R.id.d9);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.postOnAnimationDelayed(new IDRunnableS89S0100000_31(repaymentAssem, 4), 200L);
                return;
            }
            return;
        }
        this.LJLILLLLZI.LJ(false);
    }
}
