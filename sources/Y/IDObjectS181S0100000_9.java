package Y;

import X.C54116LLs;
import X.C78685UuP;
import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.roaming.RegionSearchHeaderAssem;
import kotlin.jvm.internal.AqS32S1000000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDObjectS181S0100000_9 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$1(IDObjectS181S0100000_9 iDObjectS181S0100000_9, Editable editable) {
    }

    public static final void beforeTextChanged$0(IDObjectS181S0100000_9 iDObjectS181S0100000_9, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS181S0100000_9 iDObjectS181S0100000_9, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS181S0100000_9 iDObjectS181S0100000_9, CharSequence charSequence, int i, int i2, int i3) {
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
            default:
                return;
        }
    }

    public IDObjectS181S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(IDObjectS181S0100000_9 iDObjectS181S0100000_9, Editable editable) {
        String str;
        if (editable == null || (str = editable.toString()) == null || str.length() == 0) {
            str = null;
        }
        ((AssemViewModel) ((RegionSearchHeaderAssem) iDObjectS181S0100000_9.l0).LJLJJI.getValue()).setState(new AqS32S1000000_9(str, 15));
        if (C78685UuP.LJJJZ(str)) {
            TuxIconView tuxIconView = ((RegionSearchHeaderAssem) iDObjectS181S0100000_9.l0).LJLILLLLZI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                return;
            } else {
                o.LJIJI("btnClear");
                throw null;
            }
        }
        TuxIconView tuxIconView2 = ((RegionSearchHeaderAssem) iDObjectS181S0100000_9.l0).LJLILLLLZI;
        if (tuxIconView2 != null) {
            tuxIconView2.setVisibility(8);
        } else {
            o.LJIJI("btnClear");
            throw null;
        }
    }

    public static final void onTextChanged$1(IDObjectS181S0100000_9 iDObjectS181S0100000_9, CharSequence charSequence, int i, int i2, int i3) {
        C54116LLs.LJJIIZ(((C54116LLs) iDObjectS181S0100000_9.l0).LIZ);
    }
}
