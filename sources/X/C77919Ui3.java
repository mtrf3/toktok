package X;

import android.content.Context;
import android.graphics.Canvas;

/* renamed from: X.Ui3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77919Ui3 extends C29701Eo {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        if (this.LJLJJI) {
            return;
        }
        super.onAttachedToWindow();
        if (this.LJLIL && this.LJLJJL && !isAnimating()) {
            playAnimation();
        }
    }

    @Override // X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (!this.LJLJJI) {
            if (isAnimating()) {
                this.LJLJJL = true;
            }
            super.onDetachedFromWindow();
            cancelAnimation();
        }
        C54339LUh.LIZ(this);
    }

    public final boolean getDestroyed() {
        return this.LJLILLLLZI;
    }

    public final boolean getIgnoreAttachStatus() {
        return this.LJLJJI;
    }

    public final boolean getMAutoPlay() {
        return this.LJLIL;
    }

    public final String getSrcUrl() {
        return this.LJLJI;
    }

    public C77919Ui3(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LJLILLLLZI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("draw lottie-view after destroyed with src ");
            C13870gZ.LIZJ(LIZ, this.LJLJI, LIZ, 1, "byted-lottie");
            return;
        }
        super.onDraw(canvas);
    }

    public final void setDestroyed(boolean z) {
        this.LJLILLLLZI = z;
    }

    public final void setIgnoreAttachStatus(boolean z) {
        this.LJLJJI = z;
    }

    public final void setMAutoPlay(boolean z) {
        this.LJLIL = z;
    }

    public final void setSrcUrl(String str) {
        this.LJLJI = str;
    }
}
