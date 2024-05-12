package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.AdX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26679AdX extends ConstraintLayout {
    public int LJLIL;
    public int LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public final int getViewWidth() {
        _$_findCachedViewById(R.id.gvs).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return _$_findCachedViewById(R.id.gvs).getMeasuredWidth() + this.LJLIL + this.LJLILLLLZI;
    }

    public final void setDesc(String str) {
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.desc)).setText(str);
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.desc));
        }
    }

    public final void setDivider(boolean z) {
        if (z) {
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.cdj));
        } else {
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.cdj));
        }
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        ((TextView) _$_findCachedViewById(R.id.gvs)).setEllipsize(truncateAt);
    }

    public final void setIcon(Image image) {
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image.toImageUrlModel());
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
            LIZLLL.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.e_q);
            C16880lQ.LLJJJ(LIZLLL);
        }
    }

    public final void setIconHeight(int i) {
        _$_findCachedViewById(R.id.e_q).getLayoutParams().height = i;
    }

    public final void setIconWidth(int i) {
        this.LJLIL = i;
        _$_findCachedViewById(R.id.e_q).getLayoutParams().width = i;
    }

    public final void setInterval(int i) {
        this.LJLILLLLZI = i;
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.gvs).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(i);
    }

    public final void setViewMaxWidth(int i) {
        setMaxWidth(i);
        ((TextView) _$_findCachedViewById(R.id.gvs)).setMaxWidth((i - this.LJLIL) - this.LJLILLLLZI);
    }

    public final void LJJLJLI(Integer num, String str) {
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.gvs)).setText(str);
        }
        if (num != null) {
            num.intValue();
            ((TuxTextView) _$_findCachedViewById(R.id.gvs)).setTuxFont(num.intValue());
        }
    }

    public C26679AdX(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = context.getResources().getDimensionPixelSize(R.dimen.k3);
        context.getResources().getDimensionPixelSize(R.dimen.k3);
        this.LJLILLLLZI = context.getResources().getDimensionPixelSize(R.dimen.k2);
        if (C26830Afy.LIZ()) {
            C27531ArH.LIZ(R.layout.a53, context, this, true);
        } else {
            C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a53, this, true);
        }
    }
}
