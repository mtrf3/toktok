package Y;

import X.ActivityC45651qj;
import X.B1K;
import X.C186997Vn;
import X.C253009wO;
import X.C26018AJa;
import X.C26735AeR;
import X.C27111AkV;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C70897Rs5;
import X.C71731SDf;
import X.C78946Uyc;
import X.InterfaceC88471Ynr;
import X.SD4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.DateElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.USLogisticSelectByZipcodeVH;
import com.ss.android.ugc.aweme.tag.assem.VideoTagHeaderAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDCListenerS157S0200000_4 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                return;
            case 1:
                onFocusChange$1(this, view, z);
                return;
            case 2:
                onFocusChange$2(this, view, z);
                return;
            case 3:
                onFocusChange$3(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS157S0200000_4(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onFocusChange$0(IDCListenerS157S0200000_4 iDCListenerS157S0200000_4, View view, boolean z) {
        int i;
        if (z) {
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH = (USLogisticSelectByZipcodeVH) iDCListenerS157S0200000_4.l0;
            View itemView = uSLogisticSelectByZipcodeVH.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70897Rs5(), new AqS170S0100000_4(uSLogisticSelectByZipcodeVH, 13));
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH2 = (USLogisticSelectByZipcodeVH) iDCListenerS157S0200000_4.l0;
            String str = ((C26735AeR) iDCListenerS157S0200000_4.l1).LIZ;
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            uSLogisticSelectByZipcodeVH2.LJLJL = i;
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH3 = (USLogisticSelectByZipcodeVH) iDCListenerS157S0200000_4.l0;
            uSLogisticSelectByZipcodeVH3.getClass();
            uSLogisticSelectByZipcodeVH3.P();
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH4 = (USLogisticSelectByZipcodeVH) iDCListenerS157S0200000_4.l0;
            TuxTextView tuxTextView = uSLogisticSelectByZipcodeVH4.LJLJI;
            if (tuxTextView != null && uSLogisticSelectByZipcodeVH4.LJLJJL) {
                uSLogisticSelectByZipcodeVH4.LJLJJL = false;
                C26018AJa c26018AJa = uSLogisticSelectByZipcodeVH4.LJLILLLLZI;
                if (c26018AJa != null) {
                    c26018AJa.LIZLLL(tuxTextView);
                }
            }
        }
    }

    public static final void onFocusChange$1(IDCListenerS157S0200000_4 iDCListenerS157S0200000_4, View view, boolean z) {
        ((SD4) iDCListenerS157S0200000_4.l0).setTextHasFocus(z);
        ((SD4) iDCListenerS157S0200000_4.l0).getFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((SD4) iDCListenerS157S0200000_4.l0).LIZJ();
            ((SD4) iDCListenerS157S0200000_4.l0).getOnErrorClear().invoke();
            B1K paymentLogger = ((SD4) iDCListenerS157S0200000_4.l0).getPaymentLogger();
            if (paymentLogger != null) {
                paymentLogger.LIZIZ(B1K.LJIJ(((ElementDTO) iDCListenerS157S0200000_4.l1).paramName));
                paymentLogger.LJIJI(C65352Pkq.LIZ(DateElementViewHolder.class).LJFF());
                return;
            }
            return;
        }
        String invoke = ((SD4) iDCListenerS157S0200000_4.l0).getOnVerify().invoke(((SD4) iDCListenerS157S0200000_4.l0).getValue());
        if (invoke == null) {
            return;
        }
        ((SD4) iDCListenerS157S0200000_4.l0).LJ(new C253009wO(invoke, null, false, 6));
    }

    public static final void onFocusChange$2(IDCListenerS157S0200000_4 iDCListenerS157S0200000_4, View view, boolean z) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (!z) {
            C27111AkV c27111AkV = (C27111AkV) iDCListenerS157S0200000_4.l0;
            PhoneCredit phoneCredit = c27111AkV.LJLIL;
            if (phoneCredit != null) {
                str = phoneCredit.getCountryCode();
            } else {
                str = null;
            }
            String text = ((C71731SDf) c27111AkV.LIZ(R.id.hnv)).getText();
            if (phoneCredit != null) {
                str2 = phoneCredit.getHint();
                str3 = phoneCredit.getSampleNum();
            } else {
                str2 = null;
                str3 = null;
            }
            c27111AkV.LJLIL = new PhoneCredit(str, text, str2, str3);
            C71731SDf c71731SDf = (C71731SDf) ((C27111AkV) iDCListenerS157S0200000_4.l0).LIZ(R.id.hnv);
            PhoneCredit phoneCredit2 = ((C27111AkV) iDCListenerS157S0200000_4.l0).LJLIL;
            if (phoneCredit2 != null) {
                str4 = phoneCredit2.getHint();
            }
            c71731SDf.setHint(str4);
        } else {
            C71731SDf c71731SDf2 = (C71731SDf) ((C27111AkV) iDCListenerS157S0200000_4.l0).LIZ(R.id.hnv);
            PhoneCredit phoneCredit3 = ((C27111AkV) iDCListenerS157S0200000_4.l0).LJLIL;
            if (phoneCredit3 != null) {
                str4 = phoneCredit3.getSampleNum();
            }
            c71731SDf2.setHint(str4);
        }
        ((InterfaceC88471Ynr) iDCListenerS157S0200000_4.l1).invoke(((C27111AkV) iDCListenerS157S0200000_4.l0).LJLIL, Boolean.valueOf(z));
    }

    public static final void onFocusChange$3(IDCListenerS157S0200000_4 iDCListenerS157S0200000_4, View view, boolean z) {
        if (!((VideoTagHeaderAssem) iDCListenerS157S0200000_4.l0).LJLJJLL && C186997Vn.LIZJ() && z) {
            VideoTagHeaderAssem videoTagHeaderAssem = (VideoTagHeaderAssem) iDCListenerS157S0200000_4.l0;
            videoTagHeaderAssem.LJLJJLL = true;
            ViewGroup.LayoutParams layoutParams = videoTagHeaderAssem.getContainerView().getLayoutParams();
            layoutParams.height = (int) (C63081OpJ.LJJJJJL((ActivityC45651qj) iDCListenerS157S0200000_4.l1) * 0.95d);
            ((VideoTagHeaderAssem) iDCListenerS157S0200000_4.l0).getContainerView().setLayoutParams(layoutParams);
        }
    }
}
