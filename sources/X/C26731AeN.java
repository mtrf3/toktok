package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.USLogisticSelectByZipcodeVH;
import com.zhiliaoapp.musically.R;
import ujb.s;

/* renamed from: X.AeN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26731AeN implements TextWatcher {
    public final /* synthetic */ USLogisticSelectByZipcodeVH LJLIL;
    public final /* synthetic */ C26018AJa LJLILLLLZI;
    public final /* synthetic */ C26735AeR LJLJI;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    public C26731AeN(USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH, C26018AJa c26018AJa, C26735AeR c26735AeR) {
        this.LJLIL = uSLogisticSelectByZipcodeVH;
        this.LJLILLLLZI = c26018AJa;
        this.LJLJI = c26735AeR;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.LJLIL.P();
        USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH = this.LJLIL;
        TuxTextView tuxTextView = uSLogisticSelectByZipcodeVH.LJLJI;
        if (tuxTextView != null) {
            C26018AJa c26018AJa = this.LJLILLLLZI;
            if (uSLogisticSelectByZipcodeVH.LJLJJL) {
                uSLogisticSelectByZipcodeVH.LJLJJL = false;
                c26018AJa.LIZLLL(tuxTextView);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH = this.LJLIL;
        if (uSLogisticSelectByZipcodeVH.LJLJLJ || i2 > 0 || i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        uSLogisticSelectByZipcodeVH.LJLJLJ = z;
        this.LJLILLLLZI.LJFF(false);
        if (charSequence != null) {
            C26735AeR c26735AeR = this.LJLJI;
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH2 = this.LJLIL;
            c26735AeR.LIZ = s.LJZI(charSequence.toString()).toString();
            if (!TextUtils.isEmpty(charSequence)) {
                Integer LIZIZ = C19N.LIZIZ(uSLogisticSelectByZipcodeVH2.itemView, "itemView.context", R.attr.bx);
                if (LIZIZ != null) {
                    int intValue = LIZIZ.intValue();
                    TuxTextView tuxTextView = uSLogisticSelectByZipcodeVH2.LJLJI;
                    if (tuxTextView != null) {
                        tuxTextView.setTextColor(intValue);
                    }
                }
                TuxTextView tuxTextView2 = uSLogisticSelectByZipcodeVH2.LJLJI;
                if (tuxTextView2 == null) {
                    return;
                }
                tuxTextView2.setClickable(true);
                return;
            }
            Integer LIZIZ2 = C19N.LIZIZ(uSLogisticSelectByZipcodeVH2.itemView, "itemView.context", R.attr.gp);
            if (LIZIZ2 != null) {
                int intValue2 = LIZIZ2.intValue();
                TuxTextView tuxTextView3 = uSLogisticSelectByZipcodeVH2.LJLJI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColor(intValue2);
                }
            }
            TuxTextView tuxTextView4 = uSLogisticSelectByZipcodeVH2.LJLJI;
            if (tuxTextView4 == null) {
                return;
            }
            tuxTextView4.setClickable(false);
        }
    }
}
