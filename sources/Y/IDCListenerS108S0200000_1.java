package Y;

import X.AbstractC1041546x;
import X.C1044548b;
import X.C113304cY;
import X.C3L4;
import X.C55953Lxd;
import X.InterfaceC83713Qh;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDCListenerS108S0200000_1 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            default:
                return false;
        }
    }

    public static final boolean onLongClick$0(IDCListenerS108S0200000_1 iDCListenerS108S0200000_1, View view) {
        InterfaceC83713Qh interfaceC83713Qh;
        C3L4 c3l4 = ((SessionListViewHolder) iDCListenerS108S0200000_1.l0).LLFZ;
        if (c3l4 != null && (interfaceC83713Qh = (InterfaceC83713Qh) iDCListenerS108S0200000_1.l1) != null) {
            interfaceC83713Qh.LIZ(c3l4, 0, null);
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS108S0200000_1 iDCListenerS108S0200000_1, View view) {
        TuxActionSheet tuxActionSheet = (TuxActionSheet) iDCListenerS108S0200000_1.l0;
        Fragment fragment = ((C113304cY) iDCListenerS108S0200000_1.l1).LJLJJLL;
        if (fragment != null) {
            FragmentManager requireFragmentManager = fragment.requireFragmentManager();
            o.LJIIIIZZ(requireFragmentManager, "fragment.requireFragmentManager()");
            tuxActionSheet.show(requireFragmentManager, "MafChatListViewHolder");
            return true;
        }
        o.LJIJI("fragment");
        throw null;
    }

    public static final boolean onLongClick$2(IDCListenerS108S0200000_1 iDCListenerS108S0200000_1, View view) {
        ((AbstractC1041546x) iDCListenerS108S0200000_1.l0).LLFII.LJIIIZ = true;
        return ((View.OnLongClickListener) iDCListenerS108S0200000_1.l1).onLongClick(view);
    }

    public static final boolean onLongClick$3(IDCListenerS108S0200000_1 iDCListenerS108S0200000_1, View view) {
        AbstractC1041546x abstractC1041546x = (AbstractC1041546x) iDCListenerS108S0200000_1.l0;
        abstractC1041546x.LLFII.LJIIIZ = true;
        View a0 = abstractC1041546x.a0();
        if (a0 == null || !C1044548b.LIZ) {
            C1044548b.LIZ = true;
        } else {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(C55953Lxd.LJ());
            ObjectAnimator duration = ObjectAnimator.ofFloat(a0, "scaleX", 1.0f, 0.92f).setDuration(150L);
            o.LJIIIIZZ(duration, "ofFloat(v, \"scaleX\", 1f,…        .setDuration(150)");
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(a0, "scaleY", 1.0f, 0.92f).setDuration(150L);
            o.LJIIIIZZ(duration2, "ofFloat(v, \"scaleY\", 1f,…        .setDuration(150)");
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(a0, "scaleX", 0.92f, 1.0f).setDuration(200L);
            o.LJIIIIZZ(duration3, "ofFloat(v, \"scaleX\", shr…        .setDuration(200)");
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(a0, "scaleY", 0.92f, 1.0f).setDuration(200L);
            o.LJIIIIZZ(duration4, "ofFloat(v, \"scaleY\", shr…        .setDuration(200)");
            animatorSet.play(duration).with(duration2);
            animatorSet.play(duration3).with(duration4);
            animatorSet.play(duration).before(duration3);
            animatorSet.start();
        }
        return ((View.OnLongClickListener) iDCListenerS108S0200000_1.l1).onLongClick(view);
    }

    public IDCListenerS108S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
