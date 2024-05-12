package X;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;

/* renamed from: X.Zge, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90572Zge extends C02Z {
    public final float LJLILLLLZI;
    public boolean LJLJI;
    public Drawable LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @Override // X.C02Z, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        if (isEnabled()) {
            i = 255;
        } else {
            i = (int) (this.LJLILLLLZI * 255.0f);
        }
        this.LJLJJI.setColorFilter(this.LJLJJL, PorterDuff.Mode.SRC_IN);
        this.LJLJJI.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            progressDrawable = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.LJLJJLL, PorterDuff.Mode.SRC_IN);
        }
        progressDrawable.setColorFilter(this.LJLJJL, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public final void LIZ(boolean z) {
        Drawable drawable;
        if (this.LJLJI == z) {
            return;
        }
        this.LJLJI = z;
        if (z) {
            drawable = null;
        } else {
            drawable = this.LJLJJI;
        }
        super.setThumb(drawable);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.LJLJJI = drawable;
        if (this.LJLJI) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public C90572Zge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.zhiliaoapp.musically.R.attr.b_h);
        this.LJLILLLLZI = ZXT.LIZLLL(context);
    }
}
