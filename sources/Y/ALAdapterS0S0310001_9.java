package Y;

import X.C17N;
import X.C54570LbK;
import X.C54587Lbb;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.aweme.ui.NearbySkylightBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ALAdapterS0S0310001_9 extends AnimatorListenerAdapter {
    public final int $t;
    public float f4;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0310001_9 aLAdapterS0S0310001_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C54570LbK) aLAdapterS0S0310001_9.l0).setTranslationY(aLAdapterS0S0310001_9.f4);
        if (!aLAdapterS0S0310001_9.z3) {
            View view = ((NearbySkylightBaseAssem) aLAdapterS0S0310001_9.l1).LJLLLLLL;
            if (view != null) {
                view.setBackgroundColor(R.attr.d4);
            }
            View view2 = ((NearbySkylightBaseAssem) aLAdapterS0S0310001_9.l1).LJLLI;
            if (view2 != null) {
                view2.setBackgroundColor(R.attr.d4);
            }
            C17N.LJJIIJZLJL(((NearbySkylightBaseAssem) aLAdapterS0S0310001_9.l1).getContainerView());
            View view3 = ((NearbySkylightBaseAssem) aLAdapterS0S0310001_9.l1).LJLZ;
            if (view3 != null) {
                C17N.LJJIIJZLJL(view3);
            }
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS0S0310001_9.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0310001_9 aLAdapterS0S0310001_9, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C54570LbK) aLAdapterS0S0310001_9.l0).setTranslationY(aLAdapterS0S0310001_9.f4);
        if (!aLAdapterS0S0310001_9.z3) {
            View view = ((C54587Lbb) aLAdapterS0S0310001_9.l1).LJI;
            if (view != null) {
                view.setBackgroundColor(R.attr.d4);
            }
            View view2 = ((C54587Lbb) aLAdapterS0S0310001_9.l1).LIZLLL;
            if (view2 != null) {
                view2.setBackgroundColor(R.attr.d4);
            }
            View view3 = ((C54587Lbb) aLAdapterS0S0310001_9.l1).LIZ;
            if (view3 != null) {
                C17N.LJJIIJZLJL(view3);
                View view4 = ((C54587Lbb) aLAdapterS0S0310001_9.l1).LJII;
                if (view4 != null) {
                    C17N.LJJIIJZLJL(view4);
                }
            } else {
                o.LJIJI("containerView");
                throw null;
            }
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aLAdapterS0S0310001_9.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS0S0310001_9(Object obj, C54570LbK c54570LbK, float f, boolean z, NearbySkylightBaseAssem nearbySkylightBaseAssem, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.f4 = c54570LbK;
        this.z3 = f;
        this.l1 = z;
        this.l2 = nearbySkylightBaseAssem;
    }
}
