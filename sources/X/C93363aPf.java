package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aPf, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93363aPf {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final C93343aPL LIZJ;
    public TextView LIZLLL;

    public C93363aPf(Context context) {
        this.LIZ = context;
        C93362aPe c93362aPe = new C93362aPe(context);
        ViewGroup viewGroup = (ViewGroup) C16880lQ.LLLZIIL(R.layout.dug, C16880lQ.LLZIL(context), null);
        this.LIZIZ = viewGroup;
        C93343aPL c93343aPL = (C93343aPL) viewGroup.getChildAt(0);
        this.LIZJ = c93343aPL;
        this.LIZLLL = (TextView) c93343aPL.findViewById(R.id.nl7);
        c93362aPe.LIZJ = -1;
        LIZ(c93362aPe);
        TextView textView = this.LIZLLL;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.ade);
        }
    }

    public final void LIZ(Drawable drawable) {
        this.LIZIZ.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.LIZIZ.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.LIZIZ.setPadding(0, 0, 0, 0);
    }
}
