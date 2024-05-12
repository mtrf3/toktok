package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.Spu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73310Spu extends AbstractC244669iw {
    public final Drawable LJFF;
    public final int LJI;
    public final int LJII;

    @Override // X.ARS
    public final View LIZIZ() {
        C86982YBu c86982YBu = new C86982YBu((Context) this.LIZIZ, null, 6);
        ViewGroup.LayoutParams c86981YBt = new C86981YBt(-1);
        c86982YBu.setPadding(0, 0, 0, this.LJII);
        c86982YBu.setLayoutParams(c86981YBt);
        c86982YBu.setBackground(new ColorDrawable(this.LJ));
        AppCompatImageView appCompatImageView = new AppCompatImageView(c86982YBu.getContext());
        Drawable drawable = this.LJFF;
        if (drawable != null || (drawable = C20110qd.LIZ(appCompatImageView.getContext(), this.LJI)) != null) {
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
    public C73310Spu(int i, int i2, Context context) {
        super(context, i2);
        o.LJIIIZ(context, "context");
        this.LJII = C7MY.LIZIZ(24);
        this.LJI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73310Spu(int i, Context context, Drawable drawable) {
        super(context, i);
        o.LJIIIZ(context, "context");
        this.LJII = C7MY.LIZIZ(24);
        this.LJFF = drawable;
    }
}
