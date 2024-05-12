package Y;

import X.AnonymousClass605;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.OSZ;
import android.view.View;
import android.view.animation.Animation;

/* loaded from: classes3.dex */
public class IDAListenerS144S0200000_2 implements Animation.AnimationListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationRepeat$0(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
    }

    public static final void onAnimationRepeat$1(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
    }

    public static final void onAnimationRepeat$2(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
    }

    public static final void onAnimationStart$1(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animation);
                return;
            case 1:
                onAnimationEnd$1(this, animation);
                return;
            case 2:
                onAnimationEnd$2(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationRepeat$0(this, animation);
                return;
            case 1:
                onAnimationRepeat$1(this, animation);
                return;
            case 2:
                onAnimationRepeat$2(this, animation);
                return;
            default:
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animation);
                return;
            case 1:
                onAnimationStart$1(this, animation);
                return;
            case 2:
                onAnimationStart$2(this, animation);
                return;
            default:
                return;
        }
    }

    public static final void onAnimationEnd$0(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS144S0200000_2.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationEnd$1(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
        ((InterfaceC65784Pro) ((OSZ) iDAListenerS144S0200000_2.l0).getSecond()).invoke();
        View view = ((AnonymousClass605) iDAListenerS144S0200000_2.l1).mView;
        if (view != null) {
            view.clearAnimation();
        }
    }

    public static final void onAnimationEnd$2(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS144S0200000_2.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationStart$0(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS144S0200000_2.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void onAnimationStart$2(IDAListenerS144S0200000_2 iDAListenerS144S0200000_2, Animation animation) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDAListenerS144S0200000_2.l0;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDAListenerS144S0200000_2(Object obj, OSZ<Boolean, ? extends InterfaceC65784Pro<C76800UCe>> osz, AnonymousClass605 anonymousClass605) {
        this.$t = anonymousClass605;
        this.l0 = obj;
        this.l1 = osz;
    }
}
