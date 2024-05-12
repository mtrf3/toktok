package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class CFM extends C47061t0 {
    public AnimatedDrawable2 LLIIJI;
    public boolean LLIIJLIL;
    public int LLIIL;

    public final void setAutoPlay(boolean z) {
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final int getAdjustSvMode() {
        return this.LLIIL;
    }

    public final AnimatedDrawable2 getAnimatedDrawable2() {
        return this.LLIIJI;
    }

    public final boolean getUseWrapContent() {
        return this.LLIIJLIL;
    }

    public final void setAdjustSvMode(int i) {
        this.LLIIL = i;
    }

    public final void setAnimatedDrawable2(AnimatedDrawable2 animatedDrawable2) {
        this.LLIIJI = animatedDrawable2;
    }

    public final void setUseWrapContent(boolean z) {
        this.LLIIJLIL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
    }
}
