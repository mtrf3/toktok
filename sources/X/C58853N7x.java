package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.N7x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58853N7x extends AbstractC58851N7v {
    @Override // X.AbstractC58851N7v
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC58851N7v
    public int getLayoutId$commercialize_search_impl_release() {
        return R.layout.csc;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        N50.LIZ.LIZJ(getMAwemeRawAd$commercialize_search_impl_release());
    }

    @Override // X.AbstractC58851N7v
    public final void LIZ(View view) {
        String str;
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.lgs);
        o.LJIIIIZZ(findViewById, "rootview.findViewById(R.…eo_ad_transform_bar_icon)");
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.lgm);
        o.LJIIIIZZ(findViewById2, "rootview.findViewById(R.…op_video_ad_chevron_icon)");
        TuxIconView tuxIconView2 = (TuxIconView) findViewById2;
        AwemeRawAd mAwemeRawAd$commercialize_search_impl_release = getMAwemeRawAd$commercialize_search_impl_release();
        if (mAwemeRawAd$commercialize_search_impl_release != null) {
            str = mAwemeRawAd$commercialize_search_impl_release.getType();
        } else {
            str = null;
        }
        if (o.LJ(str, "web")) {
            if (O5Y.LJJJJIZL(getMAwemeRawAd$commercialize_search_impl_release()) && !O5Y.LJIILLIIL(getMAwemeRawAd$commercialize_search_impl_release())) {
                tuxIconView.setVisibility(8);
            } else {
                tuxIconView.setVisibility(0);
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_3pt_link;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView.setTuxIcon(c2068389v);
            }
        } else if (o.LJ(str, "app")) {
            tuxIconView.setVisibility(0);
            C2068389v c2068389v2 = new C2068389v();
            c2068389v2.LIZ = R.raw.icon_arrow_to_down;
            c2068389v2.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView.setTuxIcon(c2068389v2);
        }
        C2068389v c2068389v3 = new C2068389v();
        c2068389v3.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c2068389v3.LJ = Integer.valueOf(R.attr.dj);
        tuxIconView2.setTuxIcon(c2068389v3);
    }

    @Override // X.AbstractC58851N7v
    public void setTransformButtonVisibility$commercialize_search_impl_release(int i) {
        setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58853N7x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setDefaultBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
    }

    @Override // X.AbstractC58851N7v
    public final void LJ(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
        } else {
            gradientDrawable.setColor(getBackGroundColor());
            C59894Nf0.LIZJ(this, gradientDrawable, getBackGroundColor(), i, i2);
        }
    }
}
