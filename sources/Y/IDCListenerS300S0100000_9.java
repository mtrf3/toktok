package Y;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C1DG;
import X.C4LD;
import X.C55096Ljo;
import X.C57596Mj2;
import X.InterfaceC57555MiN;
import X.MMX;
import X.MNT;
import X.ViewOnClickListenerC57546MiE;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverAssem;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDCListenerS300S0100000_9 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

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
            case 4:
                return onLongClick$4(this, view);
            case 5:
                return onLongClick$5(this, view);
            case 6:
                return onLongClick$6(this, view);
            case 7:
                return onLongClick$7(this, view);
            case 8:
                return onLongClick$8(this, view);
            case 9:
                return onLongClick$9(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS300S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        C4LD.LIZ.LJII(((EmptyGuideV2) iDCListenerS300S0100000_9.l0).LJLJLJ, "Following");
        return true;
    }

    public static final boolean onLongClick$1(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        ActivityC45651qj LJ = C1DG.LJ(((FriendsFeedEmptyPageCell) iDCListenerS300S0100000_9.l0).itemView, "itemView.context");
        if (LJ != null) {
            C4LD.LIZ.LJII(LJ, "FRIENDS_TAB");
            return true;
        }
        return true;
    }

    public static final boolean onLongClick$2(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        Object obj;
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((VideoMusicCoverAssem) iDCListenerS300S0100000_9.l0);
        if (LJIIIIZZ != null) {
            obj = C16880lQ.LLILLJJLI(LJIIIIZZ, "vibrator");
        } else {
            obj = null;
        }
        o.LJII(obj, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) obj).vibrate(50L);
        VideoMusicBaseVM C4 = ((VideoMusicCoverAssem) iDCListenerS300S0100000_9.l0).C4();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        VideoMusicBaseVM.mv0(C4, context, view.getId(), true, C55096Ljo.LJIIIIZZ((VideoMusicCoverAssem) iDCListenerS300S0100000_9.l0), ((VideoMusicCoverAssem) iDCListenerS300S0100000_9.l0).LLJJJJ, 4);
        return true;
    }

    public static final boolean onLongClick$3(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        DialogFragment dialogFragment = (DialogFragment) ((MMX) iDCListenerS300S0100000_9.l0).LJLIL.getValue();
        FragmentManager requireFragmentManager = ((MMX) iDCListenerS300S0100000_9.l0).getFragment().requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "fragment.requireFragmentManager()");
        dialogFragment.show(requireFragmentManager, "MultiBaseVH");
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.TBS, X.Ynr] */
    public static final boolean onLongClick$4(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        if (((MNT) iDCListenerS300S0100000_9.l0).N().entranceCell.getCanHide() || ((MNT) iDCListenerS300S0100000_9.l0).N().entranceCell.getCanPin()) {
            MNT mnt = (MNT) iDCListenerS300S0100000_9.l0;
            ?? r2 = mnt.LJLZ;
            if (r2 != 0) {
                r2.invoke(Integer.valueOf(mnt.getPosition()), mnt.N());
                return true;
            }
            return true;
        }
        return false;
    }

    public static final boolean onLongClick$5(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = (ViewOnClickListenerC57546MiE) iDCListenerS300S0100000_9.l0;
        InterfaceC57555MiN interfaceC57555MiN = viewOnClickListenerC57546MiE.LJLJI;
        viewOnClickListenerC57546MiE.getLayoutPosition();
        interfaceC57555MiN.LJIIJ();
        return true;
    }

    public static final boolean onLongClick$6(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = (ViewOnClickListenerC57546MiE) iDCListenerS300S0100000_9.l0;
        InterfaceC57555MiN interfaceC57555MiN = viewOnClickListenerC57546MiE.LJLJI;
        viewOnClickListenerC57546MiE.getLayoutPosition();
        interfaceC57555MiN.LJIIJ();
        return true;
    }

    public static final boolean onLongClick$7(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        ViewOnClickListenerC57546MiE viewOnClickListenerC57546MiE = (ViewOnClickListenerC57546MiE) iDCListenerS300S0100000_9.l0;
        InterfaceC57555MiN interfaceC57555MiN = viewOnClickListenerC57546MiE.LJLJI;
        viewOnClickListenerC57546MiE.getLayoutPosition();
        interfaceC57555MiN.LJIIJ();
        return true;
    }

    public static final boolean onLongClick$8(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        ((C57596Mj2) iDCListenerS300S0100000_9.l0).LIZLLL();
        return true;
    }

    public static final boolean onLongClick$9(IDCListenerS300S0100000_9 iDCListenerS300S0100000_9, View view) {
        RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) iDCListenerS300S0100000_9.l0;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        recSwipeViewModel.nv0(context, view);
        return true;
    }
}
