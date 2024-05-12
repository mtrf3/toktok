package X;

import Y.ACListenerS21S0100000_1;
import Y.IDObjectS174S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3qC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96283qC extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLIL;
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

    public final View getCancelBtn$im_base_release() {
        View cancel_btn = _$_findCachedViewById(R.id.b3r);
        o.LJIIIIZZ(cancel_btn, "cancel_btn");
        return cancel_btn;
    }

    public final EditText getEditText$im_base_release() {
        EditText search_et = (EditText) _$_findCachedViewById(R.id.jf9);
        o.LJIIIIZZ(search_et, "search_et");
        return search_et;
    }

    public final View getSearchBar$im_base_release() {
        View search_bar = _$_findCachedViewById(R.id.je_);
        o.LJIIIIZZ(search_bar, "search_bar");
        return search_bar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C96283qC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        ViewGroup.inflate(context, R.layout.b_n, this);
        TextView search_et = (TextView) _$_findCachedViewById(R.id.jf9);
        o.LJIIIIZZ(search_et, "search_et");
        search_et.addTextChangedListener(new IDObjectS174S0100000_1(this, 5));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.bee), new ACListenerS21S0100000_1(this, 103));
        if (AnonymousClass636.LJIILJJIL(context)) {
            _$_findCachedViewById(R.id.je_).setBackground(C04270Et.LIZIZ(context, R.drawable.bhg));
        } else {
            _$_findCachedViewById(R.id.je_).setBackground(C04270Et.LIZIZ(context, R.drawable.bhf));
        }
    }
}
