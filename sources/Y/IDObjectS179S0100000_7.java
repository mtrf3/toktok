package Y;

import X.C41085GAn;
import X.C46183IAp;
import X.C8ID;
import X.GQ8;
import X.GS5;
import X.ViewOnClickListenerC42873Gs9;
import X.Z9N;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.AnchorSearchFragment;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDObjectS179S0100000_7 implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void beforeTextChanged$1(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence charSequence, int i, int i2, int i3) {
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
            case 3:
                afterTextChanged$3(this, editable);
                return;
            case 4:
                afterTextChanged$4(this, editable);
                return;
            case 5:
                afterTextChanged$5(this, editable);
                return;
            case 6:
                afterTextChanged$6(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(charSequence, "s");
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                return;
            case 3:
                o.LJIIIZ(charSequence, "s");
                return;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                return;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                return;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(charSequence, "s");
                return;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                o.LJIIIZ(charSequence, "s");
                return;
            case 3:
                o.LJIIIZ(charSequence, "s");
                return;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                return;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                return;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public IDObjectS179S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(IDObjectS179S0100000_7 iDObjectS179S0100000_7, Editable s) {
        o.LJIIIZ(s, "s");
        ((C46183IAp) iDObjectS179S0100000_7.l0).LJLLILLLL.onNext(s.toString());
        Z9N.LIZIZ.LJFF().LJJ(s.toString());
    }

    public static final void afterTextChanged$1(IDObjectS179S0100000_7 iDObjectS179S0100000_7, Editable editable) {
        int length;
        int i = 0;
        if (editable != null && (length = editable.length()) > 0 && editable != null && editable.charAt(length - 1) == '\n') {
            editable.delete(length - 1, length);
        }
        GS5 gs5 = (GS5) iDObjectS179S0100000_7.l0;
        int i2 = gs5.LJIJJLI;
        if (editable != null) {
            i = editable.length();
        }
        gs5.LJIIIIZZ(i2 - i);
    }

    public static final void afterTextChanged$2(IDObjectS179S0100000_7 iDObjectS179S0100000_7, Editable s) {
        boolean z;
        o.LJIIIZ(s, "s");
        if (s.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((ImageView) ((AnchorSearchFragment) iDObjectS179S0100000_7.l0)._$_findCachedViewById(R.id.jez)).setVisibility(4);
        } else {
            ((ImageView) ((AnchorSearchFragment) iDObjectS179S0100000_7.l0)._$_findCachedViewById(R.id.jez)).setVisibility(0);
        }
    }

    public static final void afterTextChanged$3(IDObjectS179S0100000_7 iDObjectS179S0100000_7, Editable s) {
        o.LJIIIZ(s, "s");
        ViewOnClickListenerC42873Gs9 viewOnClickListenerC42873Gs9 = (ViewOnClickListenerC42873Gs9) iDObjectS179S0100000_7.l0;
        String obj = s.toString();
        viewOnClickListenerC42873Gs9.getClass();
        if (!TextUtils.isEmpty(obj)) {
            ((ImageView) viewOnClickListenerC42873Gs9.LIZ(R.id.avg)).setVisibility(0);
        } else {
            ((ImageView) viewOnClickListenerC42873Gs9.LIZ(R.id.avg)).setVisibility(8);
        }
        ARunnableS8S1100000_7 aRunnableS8S1100000_7 = new ARunnableS8S1100000_7(viewOnClickListenerC42873Gs9, obj, 8);
        viewOnClickListenerC42873Gs9.LJLILLLLZI.removeCallbacksAndMessages(null);
        viewOnClickListenerC42873Gs9.LJLILLLLZI.postDelayed(aRunnableS8S1100000_7, 500L);
    }

    public static final void afterTextChanged$4(IDObjectS179S0100000_7 iDObjectS179S0100000_7, Editable editable) {
        GQ8 gq8 = (GQ8) iDObjectS179S0100000_7.l0;
        String obj = editable.toString();
        gq8.getClass();
        if (TextUtils.isEmpty(obj)) {
            gq8.LIZLLL = true;
            return;
        }
        if (!gq8.LIZLLL) {
            return;
        }
        if (TextUtils.isEmpty(gq8.LIZIZ)) {
            ((ArrayList) gq8.LIZ).add(obj);
            gq8.LIZIZ = obj;
            return;
        }
        int length = gq8.LIZIZ.length();
        int length2 = obj.length();
        if (length == length2) {
            return;
        }
        if (length > length2) {
            gq8.LIZLLL = false;
            gq8.LIZIZ = null;
            ((ArrayList) gq8.LIZ).clear();
        } else if (!obj.startsWith(gq8.LIZIZ)) {
            gq8.LIZLLL = false;
            gq8.LIZIZ = null;
            ((ArrayList) gq8.LIZ).clear();
        } else {
            ((ArrayList) gq8.LIZ).add(obj.substring(length));
            gq8.LIZIZ = obj;
        }
    }

    public static final void afterTextChanged$5(IDObjectS179S0100000_7 iDObjectS179S0100000_7, Editable s) {
        boolean z;
        o.LJIIIZ(s, "s");
        if (s.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((GeoFencingSelectionActivity) iDObjectS179S0100000_7.l0)._$_findCachedViewById(R.id.drd).setVisibility(8);
            C41085GAn c41085GAn = ((GeoFencingSelectionActivity) iDObjectS179S0100000_7.l0).LJLJI;
            if (c41085GAn != null) {
                c41085GAn.LJZ("");
                return;
            } else {
                o.LJIJI("regionAdapter");
                throw null;
            }
        }
        ((GeoFencingSelectionActivity) iDObjectS179S0100000_7.l0)._$_findCachedViewById(R.id.drd).setVisibility(0);
        C41085GAn c41085GAn2 = ((GeoFencingSelectionActivity) iDObjectS179S0100000_7.l0).LJLJI;
        if (c41085GAn2 != null) {
            c41085GAn2.LJZ(s.toString());
        } else {
            o.LJIJI("regionAdapter");
            throw null;
        }
    }

    public static final void afterTextChanged$6(IDObjectS179S0100000_7 iDObjectS179S0100000_7, Editable s) {
        boolean z;
        o.LJIIIZ(s, "s");
        if (s.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((GeoFencingSelectionFragment) iDObjectS179S0100000_7.l0)._$_findCachedViewById(R.id.drd).setVisibility(8);
            C41085GAn c41085GAn = ((GeoFencingSelectionFragment) iDObjectS179S0100000_7.l0).LJLIL;
            if (c41085GAn != null) {
                c41085GAn.LJZ("");
                return;
            } else {
                o.LJIJI("regionAdapter");
                throw null;
            }
        }
        ((GeoFencingSelectionFragment) iDObjectS179S0100000_7.l0)._$_findCachedViewById(R.id.drd).setVisibility(0);
        C41085GAn c41085GAn2 = ((GeoFencingSelectionFragment) iDObjectS179S0100000_7.l0).LJLIL;
        if (c41085GAn2 != null) {
            c41085GAn2.LJZ(s.toString());
        } else {
            o.LJIJI("regionAdapter");
            throw null;
        }
    }

    public static final void beforeTextChanged$2(IDObjectS179S0100000_7 iDObjectS179S0100000_7, CharSequence s, int i, int i2, int i3) {
        o.LJIIIZ(s, "s");
        ((AnchorSearchFragment) iDObjectS179S0100000_7.l0)._$_findCachedViewById(R.id.isj).setVisibility(0);
        AnchorSearchFragment anchorSearchFragment = (AnchorSearchFragment) iDObjectS179S0100000_7.l0;
        anchorSearchFragment._$_findCachedViewById(R.id.msb).setVisibility(8);
        anchorSearchFragment._$_findCachedViewById(R.id.msa).setVisibility(8);
        anchorSearchFragment._$_findCachedViewById(R.id.isk).setVisibility(8);
        ((C8ID) anchorSearchFragment._$_findCachedViewById(R.id.g8q)).setVisibility(8);
        ((AnchorSearchFragment) iDObjectS179S0100000_7.l0).vl();
    }
}
