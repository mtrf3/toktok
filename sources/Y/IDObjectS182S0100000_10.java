package Y;

import X.AnonymousClass636;
import X.C63104Opg;
import X.C72972SkS;
import X.NHW;
import X.OOH;
import X.SY4;
import X.XLM;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public class IDObjectS182S0100000_10 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$1(IDObjectS182S0100000_10 iDObjectS182S0100000_10, Editable editable) {
    }

    public static final void afterTextChanged$2(IDObjectS182S0100000_10 iDObjectS182S0100000_10, Editable editable) {
    }

    public static final void beforeTextChanged$0(IDObjectS182S0100000_10 iDObjectS182S0100000_10, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS182S0100000_10 iDObjectS182S0100000_10, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(IDObjectS182S0100000_10 iDObjectS182S0100000_10, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS182S0100000_10 iDObjectS182S0100000_10, CharSequence charSequence, int i, int i2, int i3) {
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
                beforeTextChanged$2(this, charSequence, i, i2, i3);
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
                onTextChanged$2(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public IDObjectS182S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(IDObjectS182S0100000_10 iDObjectS182S0100000_10, Editable editable) {
        String str;
        String obj;
        XLM xlm = ((NHW) iDObjectS182S0100000_10.l0).LJLLILLLL;
        if (editable != null && (obj = editable.toString()) != null) {
            str = s.LJZI(obj).toString();
        } else {
            str = null;
        }
        xlm.setValue(str);
    }

    public static final void onTextChanged$1(IDObjectS182S0100000_10 iDObjectS182S0100000_10, CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        TuxIconView tuxIconView = ((C63104Opg) iDObjectS182S0100000_10.l0).LJIILJJIL;
        boolean z = false;
        if (tuxIconView != null) {
            if (charSequence != null && charSequence.length() > 0) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            tuxIconView.setVisibility(i4);
        }
        TuxIconView tuxIconView2 = ((C63104Opg) iDObjectS182S0100000_10.l0).LJIILJJIL;
        if (tuxIconView2 == null) {
            return;
        }
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        }
        tuxIconView2.setEnabled(z);
    }

    public static final void onTextChanged$2(IDObjectS182S0100000_10 iDObjectS182S0100000_10, CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        ((OOH) iDObjectS182S0100000_10.l0).LLD = String.valueOf(charSequence);
        if (charSequence != null) {
            i4 = charSequence.length();
        } else {
            i4 = 0;
        }
        String LIZLLL = C72972SkS.LIZLLL(i4, "/200");
        if (i4 > 200) {
            OOH ooh = (OOH) iDObjectS182S0100000_10.l0;
            if (ooh.LJLJLLL) {
                TuxTextView tuxTextView = ooh.LJZI;
                if (tuxTextView == null) {
                    return;
                }
                tuxTextView.setText("200/200");
                return;
            }
            int length = String.valueOf(i4).length();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZLLL);
            Context context = ((OOH) iDObjectS182S0100000_10.l0).getContext();
            o.LJIIIIZZ(context, "context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.e7, context)), 0, length, 33);
            TuxTextView tuxTextView2 = ((OOH) iDObjectS182S0100000_10.l0).LJZI;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(spannableStringBuilder);
            }
            SY4 sy4 = ((OOH) iDObjectS182S0100000_10.l0).LJZL;
            if (sy4 == null) {
                return;
            }
            sy4.setEnabled(false);
            sy4.setClickable(false);
            return;
        }
        TuxTextView tuxTextView3 = ((OOH) iDObjectS182S0100000_10.l0).LJZI;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(LIZLLL);
        }
        if (i4 > 0) {
            SY4 sy42 = ((OOH) iDObjectS182S0100000_10.l0).LJZL;
            if (sy42 == null) {
                return;
            }
            sy42.setEnabled(true);
            sy42.setClickable(true);
            return;
        }
        SY4 sy43 = ((OOH) iDObjectS182S0100000_10.l0).LJZL;
        if (sy43 == null) {
            return;
        }
        sy43.setEnabled(false);
        sy43.setClickable(false);
    }
}
