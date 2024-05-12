package X;

import Y.ARunnableS33S0200000_14;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("global_follow_live_pop")
/* renamed from: X.Xl8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85754Xl8 extends AbstractC55363Lo7 {
    public final ActivityC45651qj LJLIL;
    public final InterfaceC82702Wd0 LJLILLLLZI;
    public final Runnable LJLJI;
    public final int LJLJJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        this.LJLILLLLZI.LJI(new C85755Xl9(wrapper));
        this.LJLJI.run();
    }

    public C85754Xl8(ActivityC45651qj activity, InterfaceC82702Wd0 popupWindow, ARunnableS33S0200000_14 aRunnableS33S0200000_14) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(popupWindow, "popupWindow");
        this.LJLIL = activity;
        this.LJLILLLLZI = popupWindow;
        this.LJLJI = aRunnableS33S0200000_14;
        this.LJLJJI = 1999;
    }
}
