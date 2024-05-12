package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.agw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94434agw extends AbstractC244669iw {
    public final Drawable LJFF;
    public final Rect LJI;

    @Override // X.ARS
    public final View LIZIZ() {
        C86982YBu c86982YBu = new C86982YBu((Context) this.LIZIZ, null, 6);
        ViewGroup.LayoutParams c86981YBt = new C86981YBt(-1);
        Rect rect = this.LJI;
        c86982YBu.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        c86982YBu.setLayoutParams(c86981YBt);
        c86982YBu.setBackground(new ColorDrawable(this.LJ));
        AppCompatImageView appCompatImageView = new AppCompatImageView(c86982YBu.getContext());
        Drawable drawable = this.LJFF;
        if (drawable != null) {
            C86981YBt c86981YBt2 = new C86981YBt(-1);
            Context context = appCompatImageView.getContext();
            o.LJIIIIZZ(context, "context");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("this.width * ");
            LIZ.append(drawable.getIntrinsicHeight() / drawable.getIntrinsicWidth());
            c86981YBt2.LJII = C86977YBp.LIZ(context, X1D.LIZIZ(LIZ), "layout_height");
            appCompatImageView.setLayoutParams(c86981YBt2);
            appCompatImageView.setImageDrawable(drawable);
        }
        c86982YBu.addView(appCompatImageView);
        return c86982YBu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94434agw(Context context, Drawable icon, Rect rect) {
        super(context, 0);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(icon, "icon");
        this.LJI = new Rect(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
        if (rect != null) {
            this.LJI = rect;
        }
        this.LJFF = icon;
    }
}
