package X;

import android.content.Context;
import android.view.View;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.KRu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51726KRu implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ TextSwitcher LIZ;

    public C51726KRu(TextSwitcher textSwitcher) {
        this.LIZ = textSwitcher;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        TextView textView;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ.getContext()), R.layout.cfg, this.LIZ, false);
        if (Z9N.LIZIZ.LLLILZJ() && (LLLLIILL instanceof TextView) && (textView = (TextView) LLLLIILL) != null) {
            Context context = this.LIZ.getContext();
            o.LJIIIIZZ(context, "this.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
        }
        return LLLLIILL;
    }
}
