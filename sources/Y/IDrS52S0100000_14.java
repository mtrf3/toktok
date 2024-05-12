package Y;

import X.AbstractC28951Br;
import X.AbstractC77369UYb;
import X.AbstractViewOnTouchListenerC82865Wfd;
import X.C0A2;
import X.C0A6;
import X.C44689HgL;
import X.C80103VcB;
import X.C81066Vri;
import X.C81993WFx;
import X.C82102WKc;
import X.InterfaceC80118VcQ;
import X.InterfaceC81994WFy;
import X.InterfaceC82871Wfj;
import X.VVH;
import X.WG7;
import X.WG8;
import X.WW1;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.story.feed.ui.gallery.StoryGalleryLayoutManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDrS52S0100000_14 extends C0A6 {
    public final int $t;
    public Object l0;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        switch (this.$t) {
            case 1:
                LJIILJJIL$0(this, i, recyclerView);
                return;
            case 2:
                LJIILJJIL$1(this, i, recyclerView);
                return;
            case 3:
                LJIILJJIL$2(this, i, recyclerView);
                return;
            case 4:
                LJIILJJIL$3(this, i, recyclerView);
                return;
            case 5:
                LJIILJJIL$4(this, i, recyclerView);
                return;
            case 6:
                LJIILJJIL$5(this, i, recyclerView);
                return;
            case 7:
                LJIILJJIL$6(this, i, recyclerView);
                return;
            default:
                super.LJIILJJIL(i, recyclerView);
                return;
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJIILL$0(this, recyclerView, i, i2);
                return;
            case 1:
                LJIILL$1(this, recyclerView, i, i2);
                return;
            case 2:
            case 3:
            default:
                super.LJIILL(recyclerView, i, i2);
                return;
            case 4:
                LJIILL$2(this, recyclerView, i, i2);
                return;
            case 5:
                LJIILL$3(this, recyclerView, i, i2);
                return;
            case 6:
                LJIILL$4(this, recyclerView, i, i2);
                return;
            case 7:
                LJIILL$5(this, recyclerView, i, i2);
                return;
            case 8:
                LJIILL$6(this, recyclerView, i, i2);
                return;
        }
    }

    public IDrS52S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJIILJJIL$0(IDrS52S0100000_14 iDrS52S0100000_14, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        Iterator it = ((List) ((StoryGalleryLayoutManager) iDrS52S0100000_14.l0).LL.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC80118VcQ) it.next()).LIZ(i);
        }
    }

    public static final void LJIILJJIL$1(IDrS52S0100000_14 iDrS52S0100000_14, int i, RecyclerView recyclerView) {
        Object tag;
        Object tag2;
        String str;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            View LJFF = ((AbstractC28951Br) ((WW1) iDrS52S0100000_14.l0).LLILLJJLI.getValue()).LJFF(recyclerView.getLayoutManager());
            if (LJFF != null && (tag2 = LJFF.getTag()) != null && (tag2 instanceof AbstractC77369UYb)) {
                WW1 ww1 = (WW1) iDrS52S0100000_14.l0;
                if (ww1.LLIIZ || ww1.LLILIL) {
                    str = ww1.LLILII;
                } else {
                    str = "slide";
                }
                if (tag2 instanceof AbstractC77369UYb) {
                    ww1.LLJJIJIIJIL((AbstractC77369UYb) tag2, null, str);
                }
            }
            WW1 ww12 = (WW1) iDrS52S0100000_14.l0;
            ww12.LLIILII = false;
            if (ww12.LJLILLLLZI.LIZLLL.invoke().booleanValue()) {
                ((WW1) iDrS52S0100000_14.l0).LLJLIL(true, true);
                return;
            }
            return;
        }
        if (2 == i) {
            View LJFF2 = ((AbstractC28951Br) ((WW1) iDrS52S0100000_14.l0).LLILLJJLI.getValue()).LJFF(recyclerView.getLayoutManager());
            if (LJFF2 == null || (tag = LJFF2.getTag()) == null) {
                return;
            }
            WW1 ww13 = (WW1) iDrS52S0100000_14.l0;
            if (!(tag instanceof AbstractC77369UYb) || o.LJ(ww13.LLIIL, tag)) {
                return;
            }
            WW1 ww14 = (WW1) iDrS52S0100000_14.l0;
            ww14.LLIILII = true;
            ww14.LJLIL.LIZJ();
            ww14.LLJJLIIIJLLLLLLLZ(false);
            return;
        }
        if (i != 1) {
            return;
        }
        WW1 ww15 = (WW1) iDrS52S0100000_14.l0;
        ww15.LLIILII = true;
        if (ww15.LJLILLLLZI.LIZLLL.invoke().booleanValue()) {
            ((WW1) iDrS52S0100000_14.l0).LLJLIL(false, true);
        }
        ((WW1) iDrS52S0100000_14.l0).LLJJLIIIJLLLLLLLZ(false);
    }

    public static final void LJIILJJIL$2(IDrS52S0100000_14 iDrS52S0100000_14, int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 1) {
            ((C82102WKc) iDrS52S0100000_14.l0).LLJJL("scroll_tool_bar");
        }
    }

    public static final void LJIILJJIL$3(IDrS52S0100000_14 iDrS52S0100000_14, int i, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        View LJFF;
        int i2;
        int LJJJLL;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0) {
            if (i != 1) {
                return;
            }
            ((C80103VcB) iDrS52S0100000_14.l0).LJI = true;
            return;
        }
        C80103VcB c80103VcB = (C80103VcB) iDrS52S0100000_14.l0;
        c80103VcB.getClass();
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null && (LJFF = c80103VcB.LJFF(linearLayoutManager)) != null) {
            if (c80103VcB.LJIIJJI) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            if (c80103VcB.LJI && c80103VcB.LJFF == 0 && !recyclerView.canScrollHorizontally(i2)) {
                int i3 = c80103VcB.LJIIJ;
                if (i3 == -1) {
                    c80103VcB.LJIIJ = linearLayoutManager.LLIL() + 1;
                } else {
                    c80103VcB.LJIIJ = i3 + 1;
                }
                LJJJLL = c80103VcB.LJIIJ;
                int LJJJJZ = linearLayoutManager.LJJJJZ() - 1;
                if (LJJJLL > LJJJJZ) {
                    LJJJLL = LJJJJZ;
                }
            } else {
                c80103VcB.LJIIJ = -1;
                LJJJLL = C0A2.LJJJLL(LJFF);
            }
            if (LJJJLL != c80103VcB.LJIIIZ) {
                c80103VcB.LJIIIZ = LJJJLL;
            }
            c80103VcB.LJFF = 0;
        }
        ((C80103VcB) iDrS52S0100000_14.l0).LJI = false;
    }

    public static final void LJIILJJIL$4(IDrS52S0100000_14 iDrS52S0100000_14, int i, RecyclerView recyclerView) {
        WG7 wg7;
        WG8 wg8;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && (wg8 = (wg7 = (WG7) iDrS52S0100000_14.l0).LLLFZ) != null && wg7.LLLI) {
            o.LJI(wg8);
            float scrollDx = ((WG7) iDrS52S0100000_14.l0).getScrollDx() * 1.0f;
            if (((WG7) iDrS52S0100000_14.l0).LLLF != null) {
                wg8.LIZIZ(scrollDx / r0.getMeasuredWidth());
                WG7 wg72 = (WG7) iDrS52S0100000_14.l0;
                wg72.LLLI = false;
                wg72.LLLII = false;
                return;
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
    }

    public static final void LJIILJJIL$5(IDrS52S0100000_14 iDrS52S0100000_14, int i, RecyclerView recyclerView) {
        if (i == 1) {
            AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
            abstractViewOnTouchListenerC82865Wfd.LJIILLIIL(abstractViewOnTouchListenerC82865Wfd.LJLJLLL.getStartX() + C44689HgL.LIZJ, false);
            AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd2 = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
            abstractViewOnTouchListenerC82865Wfd2.LLJI = true;
            abstractViewOnTouchListenerC82865Wfd2.LJLJLLL.setEnabled(false);
            ((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).LJLJLJ.setEnabled(false);
            return;
        }
        if (i != 0) {
            return;
        }
        ((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).setFocusOnMode(false);
        ((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).LJLJLLL.setEnabled(true);
        ((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).LJLJLJ.setEnabled(true);
        AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd3 = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
        if (abstractViewOnTouchListenerC82865Wfd3.LLJI) {
            abstractViewOnTouchListenerC82865Wfd3.LJZL.LJLLILLLL.setValue(null);
            AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd4 = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
            abstractViewOnTouchListenerC82865Wfd4.LLJI = false;
            if (abstractViewOnTouchListenerC82865Wfd4.LJZL.kv0().size() <= 8) {
                return;
            }
            ((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).LLJJ.LIZLLL();
            return;
        }
        if (abstractViewOnTouchListenerC82865Wfd3.getLayoutManager().LLIL() == 0) {
            AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd5 = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
            abstractViewOnTouchListenerC82865Wfd5.LLILLL = 0L;
            abstractViewOnTouchListenerC82865Wfd5.LLILZIL = abstractViewOnTouchListenerC82865Wfd5.LLILZ - 0;
            abstractViewOnTouchListenerC82865Wfd5.LJZL.pv0(0.0f);
        }
        if (((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).getLayoutManager().LLILLIZIL() != ((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).getFrameAdapter().getItemCount() - 1) {
            return;
        }
        AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd6 = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
        long j = abstractViewOnTouchListenerC82865Wfd6.LLILLJJLI;
        abstractViewOnTouchListenerC82865Wfd6.LLILZ = j;
        abstractViewOnTouchListenerC82865Wfd6.LLILZIL = j - abstractViewOnTouchListenerC82865Wfd6.LLILLL;
        abstractViewOnTouchListenerC82865Wfd6.LJZL.pv0(0.0f);
    }

    public static final void LJIILJJIL$6(IDrS52S0100000_14 iDrS52S0100000_14, int i, RecyclerView recyclerView) {
        C81993WFx c81993WFx;
        InterfaceC81994WFy interfaceC81994WFy;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0 && (interfaceC81994WFy = (c81993WFx = (C81993WFx) iDrS52S0100000_14.l0).LLLFZ) != null && c81993WFx.LLLI) {
            o.LJI(interfaceC81994WFy);
            float scrollDx = ((C81993WFx) iDrS52S0100000_14.l0).getScrollDx() * 1.0f;
            if (((C81993WFx) iDrS52S0100000_14.l0).LLLF != null) {
                interfaceC81994WFy.LIZIZ(scrollDx / r0.getMeasuredWidth());
                C81993WFx c81993WFx2 = (C81993WFx) iDrS52S0100000_14.l0;
                c81993WFx2.LLLI = false;
                c81993WFx2.LLLII = false;
                return;
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
    }

    public static final void LJIILL$0(IDrS52S0100000_14 iDrS52S0100000_14, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C81066Vri) iDrS52S0100000_14.l0).LJJZZI();
    }

    public static final void LJIILL$1(IDrS52S0100000_14 iDrS52S0100000_14, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        View LJFF = ((AbstractC28951Br) ((StoryGalleryLayoutManager) iDrS52S0100000_14.l0).LJZI.getValue()).LJFF((StoryGalleryLayoutManager) iDrS52S0100000_14.l0);
        if (LJFF == null) {
            return;
        }
        ((StoryGalleryLayoutManager) iDrS52S0100000_14.l0).getClass();
        int LJJJLL = C0A2.LJJJLL(LJFF);
        StoryGalleryLayoutManager storyGalleryLayoutManager = (StoryGalleryLayoutManager) iDrS52S0100000_14.l0;
        if (LJJJLL == storyGalleryLayoutManager.LLF) {
            return;
        }
        View view = storyGalleryLayoutManager.LLFII;
        if (view != null) {
            view.setSelected(false);
            view.setTransitionName(null);
        }
        ((StoryGalleryLayoutManager) iDrS52S0100000_14.l0).LLFII = LJFF;
        LJFF.setSelected(true);
        StoryGalleryLayoutManager storyGalleryLayoutManager2 = (StoryGalleryLayoutManager) iDrS52S0100000_14.l0;
        storyGalleryLayoutManager2.LLF = LJJJLL;
        Iterator it = ((List) storyGalleryLayoutManager2.LL.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC80118VcQ) it.next()).LIZIZ(LJJJLL, LJFF);
        }
    }

    public static final void LJIILL$2(IDrS52S0100000_14 iDrS52S0100000_14, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        ((C80103VcB) iDrS52S0100000_14.l0).LJFF = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL$3(Y.IDrS52S0100000_14 r3, androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDrS52S0100000_14.LJIILL$3(Y.IDrS52S0100000_14, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public static final void LJIILL$4(IDrS52S0100000_14 iDrS52S0100000_14, RecyclerView recyclerView, int i, int i2) {
        if (i == 0) {
            return;
        }
        if (((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).LLJILJIL.booleanValue()) {
            AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
            abstractViewOnTouchListenerC82865Wfd.getClass();
            float abs = Math.abs(i) * abstractViewOnTouchListenerC82865Wfd.LLFF.LIZ;
            if (i > 0) {
                long j = ((float) abstractViewOnTouchListenerC82865Wfd.LLILZ) + abs;
                abstractViewOnTouchListenerC82865Wfd.LLILZ = j;
                long j2 = abstractViewOnTouchListenerC82865Wfd.LLILLJJLI;
                if (j >= j2) {
                    abstractViewOnTouchListenerC82865Wfd.LLILZ = j2;
                }
                abstractViewOnTouchListenerC82865Wfd.LLILLL = abstractViewOnTouchListenerC82865Wfd.LLILZ - abstractViewOnTouchListenerC82865Wfd.LLJIJIL;
            } else {
                long j3 = ((float) abstractViewOnTouchListenerC82865Wfd.LLILLL) - abs;
                abstractViewOnTouchListenerC82865Wfd.LLILLL = j3;
                if (j3 <= 0) {
                    abstractViewOnTouchListenerC82865Wfd.LLILLL = 0L;
                }
                abstractViewOnTouchListenerC82865Wfd.LLILZ = abstractViewOnTouchListenerC82865Wfd.LLILLL + abstractViewOnTouchListenerC82865Wfd.LLJIJIL;
            }
            abstractViewOnTouchListenerC82865Wfd.LJIJJLI();
            abstractViewOnTouchListenerC82865Wfd.LJIJJ();
            abstractViewOnTouchListenerC82865Wfd.LJII();
        } else {
            ((AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0).LJIILL(i);
        }
        AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd2 = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
        if (!abstractViewOnTouchListenerC82865Wfd2.LLJI) {
            abstractViewOnTouchListenerC82865Wfd2.LJZL.pv0(abstractViewOnTouchListenerC82865Wfd2.LLIFFJFJJ);
            AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd3 = (AbstractViewOnTouchListenerC82865Wfd) iDrS52S0100000_14.l0;
            InterfaceC82871Wfj interfaceC82871Wfj = abstractViewOnTouchListenerC82865Wfd3.LLJJI;
            if (interfaceC82871Wfj != null) {
                interfaceC82871Wfj.LIZJ(abstractViewOnTouchListenerC82865Wfd3.getSelectedTime());
            }
        }
    }

    public static final void LJIILL$5(IDrS52S0100000_14 iDrS52S0100000_14, RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C81993WFx c81993WFx = (C81993WFx) iDrS52S0100000_14.l0;
        c81993WFx.setScrollDx(c81993WFx.getScrollDx() + i);
        C81993WFx c81993WFx2 = (C81993WFx) iDrS52S0100000_14.l0;
        if (c81993WFx2.LLLFZ != null && c81993WFx2.LLLII) {
            float scrollDx = c81993WFx2.getScrollDx() * 1.0f;
            if (((C81993WFx) iDrS52S0100000_14.l0).LLLF != null) {
                float measuredWidth = scrollDx / r0.getMeasuredWidth();
                InterfaceC81994WFy interfaceC81994WFy = ((C81993WFx) iDrS52S0100000_14.l0).LLLFZ;
                o.LJI(interfaceC81994WFy);
                interfaceC81994WFy.LIZ(measuredWidth);
                return;
            }
            o.LJIJI("cutMusicView");
            throw null;
        }
    }

    public static final void LJIILL$6(IDrS52S0100000_14 iDrS52S0100000_14, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        o.LJIIJ(recyclerView, "recyclerView");
        if (recyclerView.getVisibility() == 0 && recyclerView.getGlobalVisibleRect(new Rect()) && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
            int LLILL = linearLayoutManager.LLILL();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            if (LLILL != -1 && LLILLJJLI - LLILL >= 0) {
                ((VVH) iDrS52S0100000_14.l0).LIZ(LLILL, LLILLJJLI);
            }
        }
    }
}
