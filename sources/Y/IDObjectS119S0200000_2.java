package Y;

import X.C145085mi;
import X.C1551967f;
import X.C69P;
import X.C69T;
import X.C69V;
import X.C6AA;
import X.C78841Uwv;
import X.X1D;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDObjectS119S0200000_2 implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(IDObjectS119S0200000_2 iDObjectS119S0200000_2, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS119S0200000_2 iDObjectS119S0200000_2, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(IDObjectS119S0200000_2 iDObjectS119S0200000_2, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS119S0200000_2 iDObjectS119S0200000_2, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(IDObjectS119S0200000_2 iDObjectS119S0200000_2, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(IDObjectS119S0200000_2 iDObjectS119S0200000_2, CharSequence charSequence, int i, int i2, int i3) {
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

    public static final void afterTextChanged$0(IDObjectS119S0200000_2 iDObjectS119S0200000_2, Editable editable) {
        Integer num;
        String charSequence;
        int i = 1000;
        try {
            SettingsManager.LIZLLL().getClass();
            int LJ = SettingsManager.LJ("textmode_sticker_max_input_length", 1000);
            if (LJ > 0) {
                i = LJ;
            }
        } catch (Throwable unused) {
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("afterTextChanged length： ");
        String str = null;
        if (editable != null) {
            num = Integer.valueOf(editable.length());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (editable != null) {
            if (editable.length() > i) {
                if (editable != null && (charSequence = editable.subSequence(0, i).toString()) != null) {
                    ((C1551967f) iDObjectS119S0200000_2.l0).getEditText().setText(charSequence);
                }
                Selection.setSelection(((C1551967f) iDObjectS119S0200000_2.l0).getEditText().getText(), i);
                C1551967f c1551967f = (C1551967f) iDObjectS119S0200000_2.l0;
                AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(c1551967f, 313);
                ARunnableS38S0100000_2 aRunnableS38S0100000_2 = c1551967f.LLJJJ;
                if (aRunnableS38S0100000_2 != null) {
                    c1551967f.LLJJIJIL.removeCallbacks(aRunnableS38S0100000_2);
                }
                ARunnableS38S0100000_2 aRunnableS38S0100000_22 = new ARunnableS38S0100000_2(aqS152S0100000_2, 86);
                c1551967f.LLJJJ = aRunnableS38S0100000_22;
                c1551967f.LLJJIJIL.postDelayed(aRunnableS38S0100000_22, 500L);
            }
            if (editable != null) {
                str = editable.toString();
            }
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView = (TextView) iDObjectS119S0200000_2.l1;
            if (textView != null) {
                textView.setTextColor(((C1551967f) iDObjectS119S0200000_2.l0).getContext().getResources().getColor(R.color.wm));
            }
            View view = ((C1551967f) iDObjectS119S0200000_2.l0).LJZL;
            if (view == null) {
                return;
            }
            view.setEnabled(false);
            return;
        }
        TextView textView2 = (TextView) iDObjectS119S0200000_2.l1;
        if (textView2 != null) {
            textView2.setTextColor(((C1551967f) iDObjectS119S0200000_2.l0).getContext().getResources().getColor(R.color.wi));
        }
        View view2 = ((C1551967f) iDObjectS119S0200000_2.l0).LJZL;
        if (view2 == null) {
            return;
        }
        view2.setEnabled(true);
    }

    public static final void afterTextChanged$1(IDObjectS119S0200000_2 iDObjectS119S0200000_2, Editable editable) {
        if (editable == null || ((C6AA) iDObjectS119S0200000_2.l0).LJLL != -1 || ((C69V) iDObjectS119S0200000_2.l1).getAdapterPosition() < 0 || ((C69V) iDObjectS119S0200000_2.l1).getAdapterPosition() >= ((C6AA) iDObjectS119S0200000_2.l0).getItemCount()) {
            return;
        }
        ((CaptionUtterance) ListProtector.get(((C6AA) iDObjectS119S0200000_2.l0).LJLJLJ, ((C69V) iDObjectS119S0200000_2.l1).getAdapterPosition())).LJ(((C6AA) iDObjectS119S0200000_2.l0).LJLJJL, String.valueOf(((C69V) iDObjectS119S0200000_2.l1).LJLIL.getText()));
    }

    public static final void afterTextChanged$2(IDObjectS119S0200000_2 iDObjectS119S0200000_2, Editable editable) {
        if (editable != null) {
            C69P c69p = (C69P) iDObjectS119S0200000_2.l0;
            if (c69p.LJLLI != -1) {
                return;
            }
            int itemCount = c69p.getItemCount();
            int adapterPosition = ((C145085mi) iDObjectS119S0200000_2.l1).getAdapterPosition();
            if (adapterPosition < 0 || adapterPosition >= itemCount) {
                return;
            }
            Object obj = ListProtector.get(((C69P) iDObjectS119S0200000_2.l0).LJLJL, ((C145085mi) iDObjectS119S0200000_2.l1).getAdapterPosition());
            o.LJIIIIZZ(obj, "list[holder.adapterPosition]");
            TextStickerData textStickerData = (TextStickerData) obj;
            String valueOf = String.valueOf(((C145085mi) iDObjectS119S0200000_2.l1).LJLIL.getText());
            Context context = ((C69P) iDObjectS119S0200000_2.l0).LJLLLL;
            if (context != null) {
                C78841Uwv.LJJJJJL(textStickerData, valueOf, context);
                C69P c69p2 = (C69P) iDObjectS119S0200000_2.l0;
                C69T c69t = c69p2.LJLJJL;
                Object obj2 = ListProtector.get(c69p2.LJLJL, ((C145085mi) iDObjectS119S0200000_2.l1).getAdapterPosition());
                o.LJIIIIZZ(obj2, "list[holder.adapterPosition]");
                c69t.Mc((TextStickerData) obj2);
                return;
            }
            o.LJIJI("context");
            throw null;
        }
    }

    public IDObjectS119S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
