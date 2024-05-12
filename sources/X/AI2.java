package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.Switch;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AI2 extends AEY {
    @Override // X.AI9
    public final void LJII() {
        CompoundButton compoundButton = this.LIZIZ.LIZ;
        o.LJII(compoundButton, "null cannot be cast to non-null type com.bytedance.tux.input.TuxSwitch");
        ((ARV) compoundButton).setDisableListener$tux_theme_release(this.LIZ);
    }

    @Override // X.AI9
    public final void LJIIIZ() {
        C26338AVi.LJI(this.LIZIZ.LIZIZ, null, KNV.LIZIZ(13.5d), null, null, false, 29);
    }

    @Override // X.AI9
    public final AI4 LIZ() {
        return AI6.LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AI2(Context context) {
        super(context, null);
        o.LJIIIZ(context, "context");
    }

    public AI2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.AI9
    public final void LJI(ConstraintLayout constraintLayout, C17760mq info) {
        o.LJIIIZ(info, "info");
        info.LJIIL(true);
        info.LJIILIIL(LJIIL());
        info.LJIILJJIL(Switch.class.getName());
        this.LIZIZ.LIZIZ.setImportantForAccessibility(4);
    }

    @Override // X.AEY
    public final CompoundButton LJIIJJI(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        ARV arv = new ARV(context, null, 6);
        arv.setEnableTouch$tux_theme_release(false);
        return arv;
    }
}
