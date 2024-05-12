package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113544cw extends ConstraintLayout {
    public String LJLIL;
    public String LJLILLLLZI;
    public final C41071jL LJLJI;
    public final java.util.Map<Integer, View> LJLJJI;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJJI;
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

    public final String getName() {
        return this.LJLIL;
    }

    public final C41071jL getSwitch() {
        return this.LJLJI;
    }

    public final String getTip() {
        return this.LJLILLLLZI;
    }

    public final void setName(String str) {
        this.LJLIL = str;
        ((TextView) _$_findCachedViewById(R.id.gak)).setText(str);
    }

    public final void setTip(String str) {
        this.LJLILLLLZI = str;
        ((TextView) _$_findCachedViewById(R.id.gal)).setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C113544cw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C113544cw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJJI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.d81, this, true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b1q, R.attr.bjc});
            setName(C16880lQ.LLLZLZ(obtainStyledAttributes, 0));
            setTip(C16880lQ.LLLZLZ(obtainStyledAttributes, 1));
            obtainStyledAttributes.recycle();
        }
        C41071jL ls_switch = (C41071jL) _$_findCachedViewById(R.id.gaj);
        o.LJIIIIZZ(ls_switch, "ls_switch");
        this.LJLJI = ls_switch;
    }
}
