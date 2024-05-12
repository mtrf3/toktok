package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4gg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115864gg extends ConstraintLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setBiggerTextSize(int i) {
        ((AppCompatTextView) _$_findCachedViewById(R.id.mq0)).setTextSize(1, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C115864gg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C115864gg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.apd, this, true);
    }

    public final void LJJLJLI(Context context, CharSequence charSequence, CharSequence charSequence2) {
        boolean z;
        if (context != null) {
            ((TextView) _$_findCachedViewById(R.id.mq0)).setText(charSequence);
            if (((SpannableStringBuilder) charSequence2).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                _$_findCachedViewById(R.id.mgx).setVisibility(0);
                ((TextView) _$_findCachedViewById(R.id.mgx)).setText(charSequence2);
            } else {
                ((TextView) _$_findCachedViewById(R.id.mgx)).setText("");
                _$_findCachedViewById(R.id.mgx).setVisibility(8);
            }
        }
    }
}
