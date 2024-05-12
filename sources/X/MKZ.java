package X;

import android.animation.AnimatorSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("inbox_filter_guide_popup")
/* loaded from: classes10.dex */
public final class MKZ extends M71 {
    public final InterfaceC56322M8o LJLIL;
    public ViewOnClickListenerC56620MKa LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.M74
    public final boolean canShow() {
        CommonPageFragment commonPageFragment;
        Object obj;
        ActivityC45651qj activityC45651qj;
        Object obj2 = this.LJLIL;
        if (obj2 instanceof InboxFragment) {
            commonPageFragment = (CommonPageFragment) obj2;
        } else {
            commonPageFragment = null;
        }
        if (commonPageFragment == null) {
            return false;
        }
        if (((RecyclerView) commonPageFragment._$_findCachedViewById(R.id.ekg)).getScrollState() != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("not in idle state ,state =  ");
            LIZ.append(((RecyclerView) commonPageFragment._$_findCachedViewById(R.id.ekg)).getScrollState());
            LIZ.append(' ');
            C56204M4a.LIZLLL(X1D.LIZIZ(LIZ));
            return false;
        }
        Object LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ instanceof InterfaceC55058LjC) {
            obj = (InterfaceC55058LjC) LJIIIIZZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) obj) == null || !LKR.LIZIZ(activityC45651qj, "NOTIFICATION")) {
            C56204M4a.LIZLLL("not in inbox Fragment ");
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKZ(InboxFragment pagePopupScene) {
        super(pagePopupScene);
        o.LJIIIZ(pagePopupScene, "pagePopupScene");
        this.LJLIL = pagePopupScene;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        Object LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        if (!canShow()) {
            wrapper.LIZ();
            C56204M4a.LIZLLL("showPopup can't show ");
            return;
        }
        MM4 LIZIZ = LA9.LIZIZ();
        if (LIZIZ != null) {
            C2WG.LIZ().storeBoolean("show_guide", true);
            C56621MKb c56621MKb = new C56621MKb(context.LIZ);
            C56623MKd c56623MKd = c56621MKb.LIZIZ;
            c56623MKd.LIZ = LIZIZ;
            c56623MKd.LIZIZ = new C56622MKc(wrapper);
            ViewOnClickListenerC56620MKa viewOnClickListenerC56620MKa = new ViewOnClickListenerC56620MKa(c56621MKb.LIZ);
            try {
                viewOnClickListenerC56620MKa.setParams(c56621MKb.LIZIZ);
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m10exceptionOrNullimpl(LIZ);
            this.LJLILLLLZI = viewOnClickListenerC56620MKa;
            if (viewOnClickListenerC56620MKa.LJLJJL != null) {
                if (viewOnClickListenerC56620MKa.getVisibility() == 8) {
                    viewOnClickListenerC56620MKa.setVisibility(0);
                    ViewGroup viewGroup = viewOnClickListenerC56620MKa.LJLJJL;
                    if (viewGroup != null) {
                        viewGroup.addView(viewOnClickListenerC56620MKa);
                    }
                    viewOnClickListenerC56620MKa.addView(viewOnClickListenerC56620MKa.LJLILLLLZI);
                    viewOnClickListenerC56620MKa.addView(viewOnClickListenerC56620MKa.LJLJJI);
                    viewOnClickListenerC56620MKa.addView(viewOnClickListenerC56620MKa.LJLJI);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(viewOnClickListenerC56620MKa.LJLLILLLL).before(viewOnClickListenerC56620MKa.LJLLJ);
                    animatorSet.play(viewOnClickListenerC56620MKa.LJLLJ).with(viewOnClickListenerC56620MKa.LJLLL).with(viewOnClickListenerC56620MKa.LJLLLL);
                    animatorSet.start();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from", "notification_page");
                FMX.LJIIL("creator_inbox_mask_show", hashMap);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        wrapper.LIZ();
    }
}
