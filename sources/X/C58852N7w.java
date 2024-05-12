package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.N7w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58852N7w extends AbstractC58851N7v {
    @Override // X.AbstractC58851N7v
    public final void LIZ(View view) {
    }

    @Override // X.AbstractC58851N7v
    public int getLayoutId$commercialize_search_impl_release() {
        return R.layout.cev;
    }

    @Override // X.AbstractC58851N7v
    public final boolean LJFF() {
        AwemeRawAd mAwemeRawAd$commercialize_search_impl_release;
        if (this.LJLJJLL != null && ((mAwemeRawAd$commercialize_search_impl_release = getMAwemeRawAd$commercialize_search_impl_release()) == null || !O5Y.LJIILLIIL(mAwemeRawAd$commercialize_search_impl_release))) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC58851N7v
    public void setTransformButtonVisibility$commercialize_search_impl_release(int i) {
        setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58852N7w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setDefaultBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
    }

    @Override // X.AbstractC58851N7v
    public final void LJ(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(getResources().getDimensionPixelOffset(R.dimen.a6k));
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
        } else {
            gradientDrawable.setColor(getBackGroundColor());
            C59894Nf0.LIZJ(this, gradientDrawable, getBackGroundColor(), i, i2);
        }
    }
}
