package Y;

import X.C3CK;
import X.C68W;
import X.C93566aSw;
import X.C94441ah3;
import X.C94624ak0;
import X.OSZ;
import X.X1D;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes34.dex */
public class IDObjectS187S0100000_42 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$0(IDObjectS187S0100000_42 iDObjectS187S0100000_42, Editable editable) {
    }

    public static final void beforeTextChanged$0(IDObjectS187S0100000_42 iDObjectS187S0100000_42, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(IDObjectS187S0100000_42 iDObjectS187S0100000_42, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(IDObjectS187S0100000_42 iDObjectS187S0100000_42, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(IDObjectS187S0100000_42 iDObjectS187S0100000_42, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(IDObjectS187S0100000_42 iDObjectS187S0100000_42, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                return;
            case 1:
                o.LJIIIZ(editable, "s");
                return;
            case 2:
                afterTextChanged$2(this, editable);
                return;
            case 3:
                afterTextChanged$3(this, editable);
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
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
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
                o.LJIIIZ(charSequence, "s");
                return;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDObjectS187S0100000_42(Object obj, C3CK<? super String> c3ck) {
        this.$t = c3ck;
        this.l0 = obj;
    }

    public static final void afterTextChanged$2(IDObjectS187S0100000_42 iDObjectS187S0100000_42, Editable editable) {
        int i;
        C93566aSw c93566aSw = (C93566aSw) iDObjectS187S0100000_42.l0;
        C94441ah3 c94441ah3 = c93566aSw.LJLILLLLZI;
        if (c94441ah3 != null) {
            Editable text = c94441ah3.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            if (i > 0) {
                View view = c93566aSw.LJLLILLLL;
                if (view != null) {
                    view.setAlpha(1.0f);
                    View view2 = c93566aSw.LJLLILLLL;
                    if (view2 != null) {
                        view2.setClickable(true);
                        return;
                    } else {
                        o.LJIJI("sureView");
                        throw null;
                    }
                }
                o.LJIJI("sureView");
                throw null;
            }
            View view3 = ((C93566aSw) iDObjectS187S0100000_42.l0).LJLLILLLL;
            if (view3 != null) {
                view3.setAlpha(0.5f);
                View view4 = ((C93566aSw) iDObjectS187S0100000_42.l0).LJLLILLLL;
                if (view4 != null) {
                    view4.setClickable(false);
                    return;
                } else {
                    o.LJIJI("sureView");
                    throw null;
                }
            }
            o.LJIJI("sureView");
            throw null;
        }
        o.LJIJI("simpleEditText");
        throw null;
    }

    public static final void afterTextChanged$3(IDObjectS187S0100000_42 iDObjectS187S0100000_42, Editable editable) {
        String obj;
        if (editable != null && (obj = editable.toString()) != null) {
            ((C3CK) iDObjectS187S0100000_42.l0).LJIILLIIL(obj);
        }
    }

    public static final void beforeTextChanged$1(IDObjectS187S0100000_42 iDObjectS187S0100000_42, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        C94441ah3 c94441ah3 = (C94441ah3) iDObjectS187S0100000_42.l0;
        if (c94441ah3.LJZ) {
            c94441ah3.LJZ = false;
            return;
        }
        int i4 = i3 - i2;
        if (i4 < 0) {
            OSZ LJIILL = C68W.LJIILL(i, s.toString(), c94441ah3.getTextStructWrapList());
            String str = (String) LJIILL.getFirst();
            int intValue = ((Number) LJIILL.getSecond()).intValue();
            if (str != null) {
                ((C94441ah3) iDObjectS187S0100000_42.l0).LJII(intValue, str);
                return;
            } else {
                C68W.LJIILLIIL(i, i4, ((C94441ah3) iDObjectS187S0100000_42.l0).getTextStructWrapList());
                return;
            }
        }
        C68W.LJIILLIIL(i, i4, c94441ah3.getTextStructWrapList());
    }

    public static final void onTextChanged$0(IDObjectS187S0100000_42 iDObjectS187S0100000_42, CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence == null || charSequence.length() == 0 || s.LJJLI(charSequence, ((C94624ak0) iDObjectS187S0100000_42.l0).LJLJLJ)) {
            return;
        }
        C94624ak0 c94624ak0 = (C94624ak0) iDObjectS187S0100000_42.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(charSequence);
        LIZ.append(((C94624ak0) iDObjectS187S0100000_42.l0).LJLJLJ);
        c94624ak0.setText(X1D.LIZIZ(LIZ));
    }
}
