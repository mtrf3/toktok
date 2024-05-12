package Y;

import X.C19K;
import X.C253009wO;
import X.C27593AsH;
import X.C36746EbW;
import X.C61878OQg;
import X.C68322mC;
import X.C70929Rsb;
import X.C70930Rsc;
import X.C71038RuM;
import X.C71041RuP;
import X.C71723SCx;
import X.C71731SDf;
import X.C74090T5y;
import X.C76542zS;
import X.C78946Uyc;
import X.S4V;
import X.SD1;
import X.SD5;
import X.SD6;
import X.X1D;
import android.text.Editable;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* loaded from: classes13.dex */
public class IDCListenerS376S0100000_12 implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;

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
            case 4:
                onFocusChange$4(this, view, z);
                return;
            case 5:
                onFocusChange$5(this, view, z);
                return;
            case 6:
                onFocusChange$6(this, view, z);
                return;
            case 7:
                onFocusChange$7(this, view, z);
                return;
            case 8:
                onFocusChange$8(this, view, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS376S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFocusChange$0(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        ((SD6) iDCListenerS376S0100000_12.l0).getOnFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((SD6) iDCListenerS376S0100000_12.l0).LIZJ();
            ((SD6) iDCListenerS376S0100000_12.l0).getOnErrorClear().invoke();
        } else {
            String invoke = ((SD6) iDCListenerS376S0100000_12.l0).getOnVerify().invoke(((SD6) iDCListenerS376S0100000_12.l0).getValue());
            if (invoke == null) {
                return;
            }
            ((SD6) iDCListenerS376S0100000_12.l0).LJ(new C253009wO(invoke, null, false, 6));
        }
    }

    public static final void onFocusChange$1(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        ((SD1) iDCListenerS376S0100000_12.l0).setTextHasFocus(z);
        ((SD1) iDCListenerS376S0100000_12.l0).getFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((SD1) iDCListenerS376S0100000_12.l0).LIZJ();
            ((SD1) iDCListenerS376S0100000_12.l0).getOnErrorClear().invoke();
        } else {
            Editable text = ((C19K) ((SD1) iDCListenerS376S0100000_12.l0).LIZIZ(R.id.eof)).getText();
            if (text == null || text.length() == 0) {
                SD1.LJI((SD1) iDCListenerS376S0100000_12.l0, SD1.getAllCardIcons());
            }
            String invoke = ((SD1) iDCListenerS376S0100000_12.l0).getOnVerify().invoke(((SD1) iDCListenerS376S0100000_12.l0).getValue());
            if (invoke != null) {
                ((SD1) iDCListenerS376S0100000_12.l0).LJ(new C253009wO(invoke, null, false, 6));
            }
        }
        String currentPaymentId = ((SD1) iDCListenerS376S0100000_12.l0).getCurrentPaymentId();
        if (currentPaymentId == null || currentPaymentId.length() == 0) {
            SD1.LJI((SD1) iDCListenerS376S0100000_12.l0, C61878OQg.INSTANCE);
        }
    }

    public static final void onFocusChange$2(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        Editable text;
        View.OnFocusChangeListener onEditTextFocusChangeListener = ((C71731SDf) iDCListenerS376S0100000_12.l0).getOnEditTextFocusChangeListener();
        if (onEditTextFocusChangeListener != null) {
            onEditTextFocusChangeListener.onFocusChange(view, z);
        }
        C71731SDf c71731SDf = (C71731SDf) iDCListenerS376S0100000_12.l0;
        boolean z2 = false;
        if (z && (text = ((C19K) c71731SDf.LIZ(R.id.eof)).getText()) != null && text.length() > 0) {
            z2 = true;
        }
        c71731SDf.setIndicatorVisible(z2);
    }

    public static final void onFocusChange$3(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        Editable text;
        C74090T5y c74090T5y = (C74090T5y) iDCListenerS376S0100000_12.l0;
        boolean z2 = false;
        if (z && (text = ((C19K) c74090T5y.LIZ(R.id.eof)).getText()) != null && text.length() > 0) {
            z2 = true;
        }
        c74090T5y.setIndicatorVisible(z2);
    }

    public static final void onFocusChange$4(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        if (!z && ((S4V) iDCListenerS376S0100000_12.l0).getLogInputAction() != null) {
            ((S4V) iDCListenerS376S0100000_12.l0).getLogInputAction().invoke();
        }
    }

    public static final void onFocusChange$5(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        ((C71723SCx) iDCListenerS376S0100000_12.l0).setTextHasFocus(z);
        ((C71723SCx) iDCListenerS376S0100000_12.l0).getFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((C71723SCx) iDCListenerS376S0100000_12.l0).LIZJ();
            ((C71723SCx) iDCListenerS376S0100000_12.l0).getOnErrorClear().invoke();
        } else {
            String invoke = ((C71723SCx) iDCListenerS376S0100000_12.l0).getOnVerify().invoke(((C71723SCx) iDCListenerS376S0100000_12.l0).getValue());
            if (invoke != null) {
                ((C71723SCx) iDCListenerS376S0100000_12.l0).LJ(new C253009wO(invoke, null, false, 6));
            }
        }
        String currentPaymentId = ((C71723SCx) iDCListenerS376S0100000_12.l0).getCurrentPaymentId();
        if (currentPaymentId == null || currentPaymentId.length() == 0) {
            ((C71723SCx) iDCListenerS376S0100000_12.l0).LJI(C61878OQg.INSTANCE);
        }
    }

    public static final void onFocusChange$6(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        ((SD5) iDCListenerS376S0100000_12.l0).getFocusChange().invoke(Boolean.valueOf(z));
        ((SD5) iDCListenerS376S0100000_12.l0).getOnFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((SD5) iDCListenerS376S0100000_12.l0).LIZJ();
            ((SD5) iDCListenerS376S0100000_12.l0).getOnErrorClear().invoke();
        } else {
            String invoke = ((SD5) iDCListenerS376S0100000_12.l0).getOnVerify().invoke(((SD5) iDCListenerS376S0100000_12.l0).getValue());
            if (invoke == null) {
                return;
            }
            ((SD5) iDCListenerS376S0100000_12.l0).LJ(new C253009wO(invoke, null, false, 6));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onFocusChange$7(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        int i;
        T t;
        ((CpfVH) iDCListenerS376S0100000_12.l0).M(z);
        int i2 = 0;
        if (z) {
            ((CpfVH) iDCListenerS376S0100000_12.l0).LJLJL = System.currentTimeMillis();
            CpfVH cpfVH = (CpfVH) iDCListenerS376S0100000_12.l0;
            Editable text = ((C19K) cpfVH._$_findCachedViewById(R.id.cz9)).getText();
            if (text != null) {
                i2 = text.length();
            }
            cpfVH.LJLLILLLL = i2;
            C78946Uyc.LJJIIJ(((CpfVH) iDCListenerS376S0100000_12.l0).LJLIL, new C70929Rsb(), C71041RuP.LJLIL);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        CpfVH cpfVH2 = (CpfVH) iDCListenerS376S0100000_12.l0;
        long j = currentTimeMillis - cpfVH2.LJLJL;
        Editable text2 = ((C19K) cpfVH2._$_findCachedViewById(R.id.cz9)).getText();
        if (text2 != null) {
            i = text2.length();
        } else {
            i = 0;
        }
        int i3 = i - ((CpfVH) iDCListenerS376S0100000_12.l0).LJLLILLLL;
        C68322mC c68322mC = new C68322mC();
        if (i3 > 0) {
            t = "add";
        } else if (i3 < 0) {
            t = "del";
        } else {
            t = "";
        }
        c68322mC.element = t;
        CpfVH cpfVH3 = (CpfVH) iDCListenerS376S0100000_12.l0;
        if (cpfVH3.LJLLJ) {
            c68322mC.element = "sug";
        }
        C78946Uyc.LJJIIJ(cpfVH3.LJLIL, new C70930Rsc(), new C71038RuM(j, c68322mC, (CpfVH) iDCListenerS376S0100000_12.l0));
        ((CpfVH) iDCListenerS376S0100000_12.l0).LJLLJ = false;
    }

    public static final void onFocusChange$8(IDCListenerS376S0100000_12 iDCListenerS376S0100000_12, View view, boolean z) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hasFocus: ");
        LIZ.append(z);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (z) {
            SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) iDCListenerS376S0100000_12.l0;
            subPaymentListAssem.LJLJJI = String.valueOf(((C19K) subPaymentListAssem._$_findCachedViewById(R.id.cza)).getText());
            ((SubPaymentListAssem) iDCListenerS376S0100000_12.l0).LJLJI = System.currentTimeMillis();
            C27593AsH c27593AsH = ((SubPaymentListAssem) iDCListenerS376S0100000_12.l0).v3().LJLJJL;
            c27593AsH.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(c27593AsH.LIZ);
            C76542zS.LIZ("tiktokec_input_click", linkedHashMap);
            return;
        }
        String valueOf = String.valueOf(((C19K) ((SubPaymentListAssem) iDCListenerS376S0100000_12.l0)._$_findCachedViewById(R.id.cza)).getText());
        long currentTimeMillis = System.currentTimeMillis() - ((SubPaymentListAssem) iDCListenerS376S0100000_12.l0).LJLJI;
        int length = valueOf.length() - ((SubPaymentListAssem) iDCListenerS376S0100000_12.l0).LJLJJI.length();
        if (length > 0) {
            str = "add";
        } else if (length < 0) {
            str = "del";
        } else {
            str = "";
        }
        C27593AsH c27593AsH2 = ((SubPaymentListAssem) iDCListenerS376S0100000_12.l0).v3().LJLJJL;
        c27593AsH2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(c27593AsH2.LIZ);
        linkedHashMap2.put("stay_time", String.valueOf(currentTimeMillis));
        linkedHashMap2.put("input_method", str);
        C76542zS.LIZ("tiktokec_input_staytime", linkedHashMap2);
    }
}
