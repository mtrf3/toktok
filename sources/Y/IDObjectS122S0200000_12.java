package Y;

import X.AbstractC38911fr;
import X.C38350F3i;
import X.C53318KwE;
import X.C70404Rk8;
import X.C71739SDn;
import X.C71740SDo;
import X.C71742SDq;
import X.C71746SDu;
import X.InterfaceC71722SCw;
import X.SEP;
import X.T8G;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelCounterWidget;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDObjectS122S0200000_12 implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void afterTextChanged$1(IDObjectS122S0200000_12 iDObjectS122S0200000_12, Editable editable) {
    }

    public static final void beforeTextChanged$0(IDObjectS122S0200000_12 iDObjectS122S0200000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS122S0200000_12 iDObjectS122S0200000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS122S0200000_12 iDObjectS122S0200000_12, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                return;
            case 1:
                afterTextChanged$1(this, editable);
                return;
            case 2:
                afterTextChanged$2(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            default:
                return;
        }
    }

    public static final void afterTextChanged$0(IDObjectS122S0200000_12 iDObjectS122S0200000_12, Editable editable) {
        String str;
        int i;
        SkuPanelCounterWidget skuPanelCounterWidget = (SkuPanelCounterWidget) iDObjectS122S0200000_12.l0;
        skuPanelCounterWidget.LJLJL++;
        skuPanelCounterWidget.getMViewModel().LLFII = ((SkuPanelCounterWidget) iDObjectS122S0200000_12.l0).getMViewModel().lv0().getCurrentQuantity().getFirst().intValue();
        if (editable != null) {
            str = editable.toString();
        } else {
            str = null;
        }
        int i2 = 0;
        if (str == null || str.length() == 0) {
            ((SkuPanelCounterWidget) iDObjectS122S0200000_12.l0).getMViewModel().hw0(0, new C70404Rk8(true, false));
            return;
        }
        Integer LJJIL = C38350F3i.LJJIL(str);
        if (LJJIL != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        SkuPanelCounterWidget skuPanelCounterWidget2 = (SkuPanelCounterWidget) iDObjectS122S0200000_12.l0;
        skuPanelCounterWidget2.withState(skuPanelCounterWidget2.getMViewModel(), new AqS99S0101000_12(i, (SkuPanelCounterWidget) iDObjectS122S0200000_12.l0, 14));
        EditText editText = (EditText) iDObjectS122S0200000_12.l1;
        Editable text = editText.getText();
        if (text != null) {
            i2 = text.length();
        }
        editText.setSelection(i2);
    }

    public static final void afterTextChanged$2(IDObjectS122S0200000_12 iDObjectS122S0200000_12, Editable s) {
        o.LJIIIZ(s, "s");
        SEP sep = (SEP) iDObjectS122S0200000_12.l0;
        if (sep != null) {
            int selectionEnd = ((EditText) iDObjectS122S0200000_12.l1).getSelectionEnd();
            boolean hasFocus = ((EditText) iDObjectS122S0200000_12.l1).hasFocus();
            C71742SDq c71742SDq = (C71742SDq) sep;
            C71739SDn c71739SDn = (C71739SDn) c71742SDq;
            String obj = s.toString();
            AbstractC38911fr abstractC38911fr = c71739SDn.LJLJLLL;
            InterfaceC71722SCw LJIIL = abstractC38911fr.LJIIL(obj);
            CharSequence LIZIZ = LJIIL.LIZIZ();
            if (!o.LJ(LJIIL.LIZIZ(), obj)) {
                LJIIL.LIZJ(abstractC38911fr.LJIL(selectionEnd, obj, LIZIZ));
            }
            c71739SDn.LJ(LJIIL);
            c71739SDn.LJLIL.setValue(0);
            if (o.LJ(obj, LJIIL.LIZIZ()) && ((Number) C53318KwE.LIZ.getValue()).intValue() == 2) {
                C71746SDu<C71740SDo> stateOwner = c71739SDn.LJLJJI;
                AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(c71739SDn, 472);
                o.LJIIIZ(stateOwner, "stateOwner");
                aqS178S0100000_12.invoke(stateOwner.LIZ);
            }
            c71742SDq.LIZIZ(c71742SDq.LJLJJI, new AqS16S0010000_12(hasFocus, 6));
        }
    }

    public IDObjectS122S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onTextChanged$1(IDObjectS122S0200000_12 iDObjectS122S0200000_12, CharSequence charSequence, int i, int i2, int i3) {
        View view;
        if (charSequence != null && charSequence.length() > 0 && (view = (View) iDObjectS122S0200000_12.l0) != null) {
            view.setAlpha(0.5f);
        }
        T8G t8g = (T8G) iDObjectS122S0200000_12.l1;
        if (t8g != null) {
            t8g.LLIIIL(String.valueOf(charSequence));
        }
    }
}
