package X;

import Y.IDObjectS179S0100000_7;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gs9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC42873Gs9 extends LinearLayout implements View.OnClickListener {
    public InterfaceC42874GsA LJLIL;
    public final Handler LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        Object LJ = C04330Ez.LJ(getContext(), InputMethodManager.class);
        o.LJII(LJ, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) LJ).hideSoftInputFromWindow(LIZ(R.id.czx).getWindowToken(), 0);
    }

    private final void setSearchBarOnFocusChangeListener(boolean z) {
        LIZ(R.id.czx).setOnFocusChangeListener(new ViewOnFocusChangeListenerC42872Gs8(this, z));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        o.LJIIIZ(v, "v");
        if (v.getId() == R.id.aej) {
            InterfaceC42874GsA interfaceC42874GsA = this.LJLIL;
            if (interfaceC42874GsA != null) {
                interfaceC42874GsA.LLIZLLLIL(v);
                return;
            }
            return;
        }
        if (v.getId() == R.id.avg) {
            ((TextView) LIZ(R.id.czx)).setText("");
            ImageView imageView = (ImageView) LIZ(R.id.avg);
            o.LJI(imageView);
            imageView.setVisibility(8);
            InterfaceC42874GsA interfaceC42874GsA2 = this.LJLIL;
            if (interfaceC42874GsA2 == null) {
                return;
            }
            interfaceC42874GsA2.LLILLL();
            return;
        }
        if (v.getId() == R.id.jeg) {
            InterfaceC42874GsA interfaceC42874GsA3 = this.LJLIL;
            if (interfaceC42874GsA3 == null) {
                return;
            }
            interfaceC42874GsA3.LJJIL();
            return;
        }
        if (!o.LJ(v, LIZ(R.id.b3r))) {
            return;
        }
        ((TextView) LIZ(R.id.czx)).setText("");
        LIZ(R.id.czx).clearFocus();
        InterfaceC42874GsA interfaceC42874GsA4 = this.LJLIL;
        if (interfaceC42874GsA4 == null) {
            return;
        }
        interfaceC42874GsA4.LJZ();
    }

    @Override // android.view.View
    public void setOnKeyListener(View.OnKeyListener listener) {
        o.LJIIIZ(listener, "listener");
        LIZ(R.id.czx).setOnKeyListener(listener);
    }

    public final void setSearchBarEventHandler(InterfaceC42874GsA searchBarEventHandler) {
        o.LJIIIZ(searchBarEventHandler, "searchBarEventHandler");
        this.LJLIL = searchBarEventHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC42873Gs9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        this.LJLJI = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = new Handler();
        View.inflate(context, R.layout.dtg, this);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.b_c, R.attr.bb0, R.attr.bb1, R.attr.bb2, R.attr.bb9, R.attr.bfb}, 0, 0);
        try {
            String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            if (LLLZLZ != null && LLLZLZ.length() > 0) {
                ((T5T) LIZ(R.id.czx)).setHint(LLLZLZ);
            }
            ((T5T) LIZ(R.id.czx)).addTextChangedListener(new IDObjectS179S0100000_7(this, 3));
            setSearchBarOnFocusChangeListener(z);
            boolean z2 = obtainStyledAttributes.getBoolean(1, false);
            C16880lQ.LJJIJIIJIL((C116474hf) LIZ(R.id.aej), this);
            C116474hf c116474hf = (C116474hf) LIZ(R.id.aej);
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            c116474hf.setVisibility(i);
            boolean z3 = obtainStyledAttributes.getBoolean(4, false);
            ((DmtTextView) LIZ(R.id.jeg)).setOnClickListener(new ViewOnClickListenerC13880ga(this));
            DmtTextView dmtTextView = (DmtTextView) LIZ(R.id.jeg);
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            dmtTextView.setVisibility(i2);
            if (obtainStyledAttributes.getBoolean(3, true)) {
                ((TuxIconView) LIZ(R.id.avg)).setVisibility(0);
                C16880lQ.LJJJ((TuxIconView) LIZ(R.id.avg), this);
            } else {
                ((TuxIconView) LIZ(R.id.avg)).setVisibility(8);
            }
            ((DmtTextView) LIZ(R.id.b3r)).setOnClickListener(new ViewOnClickListenerC13880ga(this));
            obtainStyledAttributes.recycle();
            setOrientation(0);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
