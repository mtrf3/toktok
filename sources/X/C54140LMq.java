package X;

import Y.ARunnableS8S0210000_9;
import android.view.View;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.AqS76S1100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("main_slide_guide_mask")
/* renamed from: X.LMq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54140LMq extends M71 {
    public static final LinearInterpolator LJLJJL = new LinearInterpolator();
    public final View LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final int LJLJI;
    public boolean LJLJJI;

    @Override // X.M74
    public final boolean canShow() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        LJIIIIZZ(this.LJLIL, true, this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54140LMq(InterfaceC55643Lsd interfaceC55643Lsd, View maskView, AqS76S1100000_9 aqS76S1100000_9) {
        super(interfaceC55643Lsd);
        o.LJIIIZ(maskView, "maskView");
        this.LJLIL = maskView;
        this.LJLILLLLZI = aqS76S1100000_9;
        this.LJLJI = 1000;
        this.LJLJJI = true;
    }

    public static void LJIIIIZZ(View view, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z2;
        float f;
        if (view.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            view.setAlpha(f);
            view.setVisibility(0);
            view.animate().alpha(1.0f - f).setDuration(150L).setInterpolator(LJLJJL).withEndAction(new ARunnableS8S0210000_9((Object) view, (View) z, (boolean) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 5)).start();
        }
    }
}
