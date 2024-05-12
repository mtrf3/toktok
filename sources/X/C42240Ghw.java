package X;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ghw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42240Ghw extends RelativeLayout {
    public TextView LJLIL;
    public TextView LJLILLLLZI;

    public final void setSelect(boolean z) {
        if (z) {
            TextView textView = this.LJLIL;
            if (textView != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "this.context");
                textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gq, context));
            }
            TextView textView2 = this.LJLILLLLZI;
            if (textView2 != null) {
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "this.context");
                textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gq, context2));
                return;
            }
            return;
        }
        TextView textView3 = this.LJLIL;
        if (textView3 != null) {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "this.context");
            textView3.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gs, context3));
        }
        TextView textView4 = this.LJLILLLLZI;
        if (textView4 == null) {
            return;
        }
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "this.context");
        textView4.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gs, context4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42240Ghw(Context context, boolean z) {
        super(context);
        View LLLLIILL;
        TextView textView;
        new LinkedHashMap();
        if (z) {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dt9, this, false);
        } else {
            LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dta, this, false);
        }
        if (LLLLIILL != null) {
            textView = (TextView) LLLLIILL.findViewById(R.id.m34);
        } else {
            textView = null;
        }
        this.LJLIL = textView;
        this.LJLILLLLZI = LLLLIILL != null ? (TextView) LLLLIILL.findViewById(R.id.mct) : null;
        addView(LLLLIILL);
    }
}
