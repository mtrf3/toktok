package X;

import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import Y.IDaS214S0100000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.bubble.UpvoteVideoAssem;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7IZ */
/* loaded from: classes4.dex */
public final class C7IZ {
    public static final int LJIIL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(10));
    public final FrameLayout LIZ;
    public final UpvoteListViewModel LIZIZ;
    public final InterfaceC181487Ai LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C73318Sq2 LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJ;
    public InterfaceC88475Ynv<? super View, ? super Integer, ? super Integer, ? super UpvoteStruct, ? super String, C76800UCe> LJIIJJI;

    public final void LIZIZ() {
        Long l;
        List<UpvoteStruct> upvotes;
        UpvoteList value = this.LIZIZ.LIZJ().getValue();
        int size = this.LIZIZ.LJLJJI.size();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(hashCode());
        LIZ.append(" bindNext: start, upvoteList: total: ");
        Integer num = null;
        if (value != null) {
            l = Long.valueOf(value.getTotal());
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(", list size: ");
        if (value != null && (upvotes = value.getUpvotes()) != null) {
            num = Integer.valueOf(upvotes.size());
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (value == null) {
            return;
        }
        while (this.LJIIIIZZ < size) {
            C183487Ia LJ = LJ();
            int i = this.LJIIIIZZ;
            LJ.LIZLLL = i;
            UpvoteStruct upvoteStruct = (UpvoteStruct) ListProtector.get(this.LIZIZ.LJLJJI, i);
            if (value.getHasMore() && this.LJIIIIZZ == this.LIZIZ.LJLJJI.size() - 5) {
                UpvoteListViewModel upvoteListViewModel = this.LIZIZ;
                long cursor = value.getCursor();
                upvoteListViewModel.getClass();
                String str = upvoteListViewModel.LJLJJL;
                if (str != null) {
                    C7H1.LIZJ(str, C7H2.LIZJ(str), cursor, "", upvoteListViewModel.LJLJL, null);
                }
            }
            this.LJIIIIZZ++;
            if (!upvoteStruct.getBubbleHidden() && (!C1FP.LJII(upvoteStruct) || (AV1.LJIJ(upvoteStruct.getUser()) && this.LIZJ.LJLLLL() && !this.LIZIZ.LJLJI))) {
                C7IW c7iw = C7IW.LIZ;
                C183937Jt c183937Jt = LJ().LIZIZ;
                this.LIZIZ.LJLJJI.size();
                InterfaceC181487Ai interfaceC181487Ai = this.LIZJ;
                c7iw.getClass();
                C7IW.LIZJ(c183937Jt, upvoteStruct, interfaceC181487Ai);
                return;
            }
        }
        if (LJ().LIZJ != Integer.MAX_VALUE) {
            C7IW c7iw2 = C7IW.LIZ;
            C183937Jt c183937Jt2 = LJ().LIZIZ;
            List<UpvoteStruct> upvotes2 = value.getUpvotes();
            long total = value.getTotal();
            InterfaceC181487Ai interfaceC181487Ai2 = this.LIZJ;
            c7iw2.getClass();
            C7IW.LIZLLL(c183937Jt2, upvotes2, total, interfaceC181487Ai2);
        }
        this.LJIIIIZZ = 0;
        LJ().LIZLLL = Integer.MAX_VALUE;
    }

    public final void LIZJ() {
        this.LJ.LIZLLL();
        ((AnimatorSet) this.LJFF.getValue()).cancel();
        ((Animator) this.LJII.getValue()).cancel();
        LIZLLL().cancel();
        this.LJIIIZ = false;
    }

    public final Animator LIZLLL() {
        return (Animator) this.LJI.getValue();
    }

    public final C183487Ia LJ() {
        return (C183487Ia) this.LIZLLL.getValue();
    }

    public final boolean LJFF() {
        UpvoteStruct upvoteStruct;
        String text;
        if (!C7HO.LIZIZ(this.LIZIZ.LJLJJLL) || !C7HO.LIZ(this.LIZIZ.LJLJJLL) || !C7IP.LIZ(this.LIZIZ.LIZIZ())) {
            return false;
        }
        List<UpvoteStruct> upvoteList = this.LIZIZ.LIZIZ();
        o.LJIIIZ(upvoteList, "upvoteList");
        Iterator<UpvoteStruct> it = upvoteList.iterator();
        do {
            upvoteStruct = null;
            if (!it.hasNext()) {
                break;
            }
            upvoteStruct = it.next();
        } while (!AV1.LJIJ(upvoteStruct.getUser()));
        UpvoteStruct upvoteStruct2 = upvoteStruct;
        if ((upvoteStruct2 == null || (text = upvoteStruct2.getText()) == null || text.length() == 0) && this.LIZIZ.LJLJI) {
            return false;
        }
        return this.LIZJ.LJLLLL();
    }

    public final void LJIIJ() {
        long j;
        if (!this.LIZ.isAttachedToWindow() || this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        if (C183537If.LIZ()) {
            j = 3500;
        } else {
            j = 3000;
        }
        C78999UzT.LJFF(C115724gS.LJLIL.LIZJ(j, TimeUnit.MILLISECONDS).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJ(C73674Svm.LIZLLL, new IDaS214S0100000_3(this, 2), C73674Svm.LIZJ).LJIIJJI(), this.LJ);
    }

    public final void LJIIJJI() {
        if (this.LJIIJ == null || !LJIIL() || this.LJIIIZ || ((AnimatorSet) this.LJFF.getValue()).isRunning() || ((Animator) this.LJII.getValue()).isRunning()) {
            return;
        }
        LJIIJ();
    }

    public final boolean LJIIL() {
        List<UpvoteStruct> list = this.LIZIZ.LJLJJI;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (UpvoteStruct upvoteStruct : list) {
                if (!C1FP.LJII(upvoteStruct) && !upvoteStruct.getBubbleHidden()) {
                    return true;
                }
            }
        }
        if (LJFF()) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        C183937Jt c183937Jt = LJ().LIZ;
        int bubbleStyle = c183937Jt.getBubbleStyle();
        if (bubbleStyle != 1) {
            if (bubbleStyle != 2) {
                if (bubbleStyle != 3) {
                    if (bubbleStyle == 4) {
                        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, c183937Jt, 49), c183937Jt.getTouchArea());
                    }
                } else {
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 169), c183937Jt.getTouchArea());
                }
            } else {
                C16880lQ.LJIILJJIL(c183937Jt.getAvatarLL(), new ACListenerS23S0100000_3(this, 170));
                View upvoteTVContainer = c183937Jt.getUpvoteTVContainer();
                if (upvoteTVContainer != null) {
                    C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 171), upvoteTVContainer);
                }
            }
        } else {
            C16880lQ.LJIILJJIL(c183937Jt.getAvatarLL(), new ACListenerS23S0100000_3(this, 172));
            View upvoteTVContainer2 = c183937Jt.getUpvoteTVContainer();
            if (upvoteTVContainer2 != null) {
                C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 173), upvoteTVContainer2);
            }
        }
        LIZ(LJ().LIZIZ);
    }

    public static void LIZ(C183937Jt c183937Jt) {
        c183937Jt.getTouchArea().setClickable(false);
        c183937Jt.getAvatarLL().setClickable(false);
        c183937Jt.getUpvoteTV().setClickable(false);
        View upvoteTVContainer = c183937Jt.getUpvoteTVContainer();
        if (upvoteTVContainer == null) {
            return;
        }
        upvoteTVContainer.setClickable(false);
    }

    public final void LJIIIZ(UpvoteList upvoteList) {
        LIZ(LJ().LIZ);
        this.LJIIIIZZ = 0;
        C7IW c7iw = C7IW.LIZ;
        C183937Jt c183937Jt = LJ().LIZ;
        List<UpvoteStruct> upvotes = upvoteList.getUpvotes();
        long total = upvoteList.getTotal();
        InterfaceC181487Ai interfaceC181487Ai = this.LIZJ;
        c7iw.getClass();
        C7IW.LIZLLL(c183937Jt, upvotes, total, interfaceC181487Ai);
        LJ().LIZ.setAlpha(1.0f);
        LJ().LIZIZ.setAlpha(0.0f);
        LJ().LIZJ = Integer.MAX_VALUE;
        LIZIZ();
        LJI();
    }

    public final void LJII(boolean z, boolean z2) {
        LIZJ();
        UpvoteListViewModel upvoteListViewModel = this.LIZIZ;
        this.LJIIJ = upvoteListViewModel.LJLJJL;
        if (upvoteListViewModel.LIZLLL()) {
            LJ().LIZ.setAlpha(0.0f);
            return;
        }
        UpvoteList value = this.LIZIZ.LIZJ().getValue();
        if (value == null) {
            return;
        }
        LJIIIZ(value);
        if (z) {
            LIZLLL().start();
        }
        if (z2) {
            LJIIJ();
        }
    }

    public C7IZ(FrameLayout frameLayout, UpvoteListViewModel vm, UpvoteVideoAssem bubbleContext) {
        o.LJIIIZ(vm, "vm");
        o.LJIIIZ(bubbleContext, "bubbleContext");
        this.LIZ = frameLayout;
        this.LIZIZ = vm;
        this.LIZJ = bubbleContext;
        this.LIZLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1166));
        this.LJ = new C73318Sq2();
        this.LJFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1167));
        this.LJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1164));
        this.LJII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1165));
    }

    public static /* synthetic */ void LJIIIIZZ(C7IZ c7iz, boolean z, int i) {
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        c7iz.LJII(z, z2);
    }
}
