package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C44384HbQ;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56309M8b;
import X.InterfaceC54197LOv;
import X.LFQ;
import X.LUF;
import X.LUG;
import X.M78;
import X.M7A;
import X.X1D;
import android.animation.AnimatorSet;
import android.view.View;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import com.ss.android.ugc.aweme.friendstab.ability.FriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishBottomTabViewFactory;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.TopTabLayoutAbility;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes10.dex */
public class IDCListenerS116S0200000_9 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                return;
            case 1:
                onViewAttachedToWindow$1(this, view);
                return;
            case 2:
                onViewAttachedToWindow$2(this, view);
                return;
            case 3:
                onViewAttachedToWindow$3(this, view);
                return;
            case 4:
                onViewAttachedToWindow$4(this, view);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                return;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                return;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                return;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                return;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onViewAttachedToWindow$0(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C56309M8b) iDCListenerS116S0200000_9.l0).LJLILLLLZI);
        LIZ.append(" change state from ");
        LIZ.append(((C56309M8b) iDCListenerS116S0200000_9.l0).LJLJJLL.getState().name());
        LIZ.append(" to SHOWED");
        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
        M78 stateWrapper = ((C56309M8b) iDCListenerS116S0200000_9.l0).LJLJJLL.getStateWrapper();
        stateWrapper.getClass();
        stateWrapper.LIZJ(M7A.SHOWED);
    }

    public static final void onViewAttachedToWindow$1(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        InterfaceC54197LOv interfaceC54197LOv = ((FollowTabViewLifecycleObserver) iDCListenerS116S0200000_9.l0).LJZI;
        if (interfaceC54197LOv != null) {
            interfaceC54197LOv.LJII((ActivityC45651qj) iDCListenerS116S0200000_9.l1);
        }
        EventBus.LIZJ().LJIILJJIL((FollowTabViewLifecycleObserver) iDCListenerS116S0200000_9.l0);
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDCListenerS116S0200000_9.l1;
        C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(activityC45651qj, null), (FollowTabViewLifecycleObserver) iDCListenerS116S0200000_9.l0, FollowTabAbility.class, null);
    }

    public static final void onViewAttachedToWindow$2(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDCListenerS116S0200000_9.l0;
        C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(activityC45651qj, null), (FriendsTabLayoutAbility) iDCListenerS116S0200000_9.l1, IFriendsTabLayoutAbility.class, null);
    }

    public static final void onViewAttachedToWindow$3(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) iDCListenerS116S0200000_9.l0;
        C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(activityC45651qj, null), (TopTabLayoutAbility) iDCListenerS116S0200000_9.l1, TopTabAbility.class, null);
    }

    public static final void onViewAttachedToWindow$4(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View view) {
        o.LJIIIZ(view, "view");
        EventBus.LIZJ().LJIILJJIL((PublishBottomTabViewFactory) iDCListenerS116S0200000_9.l0);
        C55096Ljo.LJIIJJI(C55230Lly.LIZLLL((ActivityC45651qj) iDCListenerS116S0200000_9.l1, null), (PublishBottomTabViewFactory) iDCListenerS116S0200000_9.l0, PublishTabAbility.class, null);
    }

    public static final void onViewDetachedFromWindow$0(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C56309M8b) iDCListenerS116S0200000_9.l0).LJLILLLLZI);
        LIZ.append(" change state from ");
        LIZ.append(((C56309M8b) iDCListenerS116S0200000_9.l0).LJLJJLL.getState().name());
        LIZ.append(" to DISMISSED");
        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
        ((C56309M8b) iDCListenerS116S0200000_9.l0).LJLJJLL.getStateWrapper().LIZ();
        ((View) iDCListenerS116S0200000_9.l1).removeOnAttachStateChangeListener(iDCListenerS116S0200000_9);
    }

    public static final void onViewDetachedFromWindow$1(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        InterfaceC54197LOv interfaceC54197LOv = ((FollowTabViewLifecycleObserver) iDCListenerS116S0200000_9.l0).LJZI;
        if (interfaceC54197LOv != null) {
            interfaceC54197LOv.dispose();
        }
        ((FollowTabViewLifecycleObserver) iDCListenerS116S0200000_9.l0).LJZI = null;
        EventBus.LIZJ().LJIJ((FollowTabViewLifecycleObserver) iDCListenerS116S0200000_9.l0);
        C55096Ljo.LJIILL(C55230Lly.LIZLLL((ActivityC45651qj) iDCListenerS116S0200000_9.l1, null), FollowTabAbility.class, null);
    }

    public static final void onViewDetachedFromWindow$2(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        C55096Ljo.LJIILL(C55230Lly.LIZLLL((ActivityC45651qj) iDCListenerS116S0200000_9.l0, null), TopTabAbility.class, null);
    }

    public static final void onViewDetachedFromWindow$3(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View v) {
        o.LJIIIZ(v, "v");
        C55096Ljo.LJIILL(C55230Lly.LIZLLL((ActivityC45651qj) iDCListenerS116S0200000_9.l0, null), TopTabAbility.class, null);
    }

    public static final void onViewDetachedFromWindow$4(IDCListenerS116S0200000_9 iDCListenerS116S0200000_9, View view) {
        o.LJIIIZ(view, "view");
        EventBus.LIZJ().LJIJ((PublishBottomTabViewFactory) iDCListenerS116S0200000_9.l0);
        LFQ.LIZJ((PublishBottomTabViewFactory) iDCListenerS116S0200000_9.l0);
        LUF luf = ((PublishBottomTabViewFactory) iDCListenerS116S0200000_9.l0).LJLJI;
        if (luf != null) {
            AnimatorSet animatorSet = luf.LJII;
            if (animatorSet != null) {
                C16880lQ.LJLJJL(animatorSet);
            }
            AnimatorSet animatorSet2 = luf.LJII;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            luf.LJII = null;
            luf.LJI();
        }
        LUG lug = ((PublishBottomTabViewFactory) iDCListenerS116S0200000_9.l0).LJLJJLL;
        if (lug != null) {
            lug.LJ();
        }
        C55096Ljo.LJIILL(C55230Lly.LIZLLL((ActivityC45651qj) iDCListenerS116S0200000_9.l1, null), PublishTabAbility.class, null);
    }

    public IDCListenerS116S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
