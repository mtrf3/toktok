package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* loaded from: classes5.dex */
public final class AIG extends LinearLayout {
    public View LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
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

    public final CharSequence getLabel() {
        return ((AppCompatTextView) LIZ(R.id.ffc)).getText();
    }

    public final TuxTextView getLabelTv$tux_theme_release() {
        return (TuxTextView) LIZ(R.id.ffc);
    }

    public final boolean getWithIcon$tux_theme_release() {
        if (LIZ(R.id.ebu).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final View getCustomView$tux_theme_release() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIG(Context context) {
        super(context, null, R.attr.ks);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cn, this, true);
        TextView textView = (TextView) LIZ(R.id.ffc);
        textView.setMaxLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void setCustomView(View view) {
        View view2 = this.LJLIL;
        if (view2 != null) {
            if (C78996UzQ.LJJIIJZLJL(view2)) {
                C78996UzQ.LJI();
            }
            removeView(view2);
        }
        int i = 0;
        if (view != null) {
            addView(view, 0);
        }
        this.LJLIL = view;
        View LIZ = LIZ(R.id.ffc);
        if (view != null) {
            i = 8;
        }
        LIZ.setVisibility(i);
    }

    public final void setCustomView$tux_theme_release(View view) {
        this.LJLIL = view;
    }

    public final void setFont(int i) {
        ((TuxTextView) LIZ(R.id.ffc)).setTuxFont(i);
    }

    public final void setIconColor(int i) {
        ((TuxIconView) LIZ(R.id.ebu)).setTintColor(i);
    }

    public final void setIconRes(int i) {
        ((TuxIconView) LIZ(R.id.ebu)).setIconRes(i);
    }

    public final void setLabel(CharSequence charSequence) {
        ((TextView) LIZ(R.id.ffc)).setText(charSequence);
        if (charSequence != null) {
            setCustomView(null);
        }
    }

    public final void setShowArrow(boolean z) {
        int i;
        ImageView imageView = (ImageView) LIZ(R.id.ebu);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void setTextColor(int i) {
        ((TextView) LIZ(R.id.ffc)).setTextColor(i);
    }
}
