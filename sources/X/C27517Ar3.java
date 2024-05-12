package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ar3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27517Ar3 extends ConstraintLayout {
    public static final float LJLILLLLZI = C27162AlK.LIZ - C45804HyK.LJJ(32);
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

    public final TuxTextView getDesc() {
        return (TuxTextView) _$_findCachedViewById(R.id.jle);
    }

    public final TuxTextView getTitle() {
        return (TuxTextView) _$_findCachedViewById(R.id.jlm);
    }

    public final void setBackIconVisibility(boolean z) {
        int i;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.aes);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void setDesc(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.jle).setVisibility(4);
        } else {
            ((TextView) _$_findCachedViewById(R.id.jle)).setText(str);
            _$_findCachedViewById(R.id.jle).setVisibility(0);
        }
    }

    public final void setDescColor(int i) {
        ((TextView) _$_findCachedViewById(R.id.jle)).setTextColor(i);
    }

    public final void setDescColorRes(int i) {
        ((TuxTextView) _$_findCachedViewById(R.id.jle)).setTextColorRes(i);
    }

    public final void setDescLineThru(boolean z) {
        if (z) {
            ((TextView) _$_findCachedViewById(R.id.jle)).getPaint().setFlags(((TextView) _$_findCachedViewById(R.id.jle)).getPaint().getFlags() | 16);
        } else {
            ((TextView) _$_findCachedViewById(R.id.jle)).getPaint().setFlags(((TextView) _$_findCachedViewById(R.id.jle)).getPaint().getFlags() & (-17));
        }
    }

    public final void setSecondLineDescExtra(SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        if (spannableStringBuilder == null || spannableStringBuilder.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.jlk).setVisibility(8);
        } else {
            _$_findCachedViewById(R.id.jlk).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.jlk)).setText(spannableStringBuilder);
        }
    }

    public final void setSecondLineDescL1(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.jll).setVisibility(8);
        } else {
            _$_findCachedViewById(R.id.jll).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.jll)).setText(str);
        }
    }

    public final void setSecondLineDescL2(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.jlf).setVisibility(8);
        } else {
            _$_findCachedViewById(R.id.jlf).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.jlf)).setText(str);
        }
    }

    public final void setSubDesc(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.jlg).setVisibility(8);
        } else {
            ((TextView) _$_findCachedViewById(R.id.jlg)).setText(str);
            _$_findCachedViewById(R.id.jlg).setVisibility(0);
        }
    }

    public final void setSubDescColor(int i) {
        ((TextView) _$_findCachedViewById(R.id.jlg)).setTextColor(i);
    }

    public final void setSubDescFont(int i) {
        ((TuxTextView) _$_findCachedViewById(R.id.jlg)).setTuxFont(i);
    }

    public final void setTitle(int i) {
        ((TextView) _$_findCachedViewById(R.id.jlm)).setText(getContext().getText(i));
    }

    public final void setTitle(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) _$_findCachedViewById(R.id.jlm)).setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27517Ar3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27517Ar3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a3r, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bje});
        String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, 0);
        if (LLLZLZ != null && LLLZLZ.length() > 0) {
            ((TextView) _$_findCachedViewById(R.id.jlm)).setText(LLLZLZ);
        }
        obtainStyledAttributes.recycle();
    }
}
