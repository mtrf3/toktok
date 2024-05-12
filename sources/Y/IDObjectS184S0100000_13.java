package Y;

import X.C2A7;
import X.C47121t6;
import X.C87277YNd;
import X.UHL;
import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.android.livesdk.settings.customtab.KevaDebugFragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.AbsTimeLockFragment;

/* loaded from: classes14.dex */
public class IDObjectS184S0100000_13 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$0(IDObjectS184S0100000_13 iDObjectS184S0100000_13, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS184S0100000_13 iDObjectS184S0100000_13, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(IDObjectS184S0100000_13 iDObjectS184S0100000_13, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS184S0100000_13 iDObjectS184S0100000_13, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(IDObjectS184S0100000_13 iDObjectS184S0100000_13, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(IDObjectS184S0100000_13 iDObjectS184S0100000_13, CharSequence charSequence, int i, int i2, int i3) {
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

    public IDObjectS184S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(IDObjectS184S0100000_13 iDObjectS184S0100000_13, Editable editable) {
        ((KevaDebugFragment) iDObjectS184S0100000_13.l0).vl(editable);
    }

    public static final void afterTextChanged$1(IDObjectS184S0100000_13 iDObjectS184S0100000_13, Editable editable) {
        if (editable.length() == 4) {
            ((AbsTimeLockFragment) iDObjectS184S0100000_13.l0).LJLILLLLZI.setAlpha(1.0f);
        } else {
            ((AbsTimeLockFragment) iDObjectS184S0100000_13.l0).LJLILLLLZI.setAlpha(0.5f);
        }
    }

    public static final void afterTextChanged$2(IDObjectS184S0100000_13 iDObjectS184S0100000_13, Editable editable) {
        String obj;
        if (editable == null || (obj = editable.toString()) == null) {
            return;
        }
        if (obj.length() == 0) {
            UHL uhl = (UHL) iDObjectS184S0100000_13.l0;
            C47121t6 c47121t6 = uhl.LJLLI;
            if (c47121t6 != null) {
                C87277YNd.LJJIIZ(c47121t6);
            }
            C2A7 c2a7 = uhl.LJLLJ;
            if (c2a7 == null) {
                return;
            }
            c2a7.setEnabled(true);
            return;
        }
        try {
            long parseLong = CastLongProtector.parseLong(obj);
            if (parseLong < ((UHL) iDObjectS184S0100000_13.l0).LJLJL.getFirst().intValue()) {
                ((UHL) iDObjectS184S0100000_13.l0).LJJIJIIJI();
                return;
            }
            if (parseLong > ((UHL) iDObjectS184S0100000_13.l0).LJLJL.getSecond().intValue()) {
                ((UHL) iDObjectS184S0100000_13.l0).LJJIJ();
                return;
            }
            UHL uhl2 = (UHL) iDObjectS184S0100000_13.l0;
            C47121t6 c47121t62 = uhl2.LJLLI;
            if (c47121t62 != null) {
                C87277YNd.LJJIIZ(c47121t62);
            }
            C2A7 c2a72 = uhl2.LJLLJ;
            if (c2a72 == null) {
                return;
            }
            c2a72.setEnabled(true);
        } catch (Exception unused) {
            ((UHL) iDObjectS184S0100000_13.l0).LJJIJ();
        }
    }
}
