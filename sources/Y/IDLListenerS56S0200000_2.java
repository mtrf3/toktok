package Y;

import X.AnonymousClass574;
import X.AnonymousClass576;
import X.C0A2;
import X.C134825Qw;
import X.C1551667c;
import X.C1555268m;
import X.C40517FvF;
import X.C47261Igj;
import X.C5R1;
import X.C5R4;
import X.DialogC134805Qu;
import X.InterfaceC127784zu;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.MagicFragment;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.components.base.transition.DavinciViewPositionRect;

/* loaded from: classes3.dex */
public class IDLListenerS56S0200000_2 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS56S0200000_2 iDLListenerS56S0200000_2) {
        if (((View) iDLListenerS56S0200000_2.l0).getWidth() != 0) {
            ((View) iDLListenerS56S0200000_2.l0).getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS56S0200000_2);
            ((C1555268m) iDLListenerS56S0200000_2.l1).smoothScrollTo(((((View) iDLListenerS56S0200000_2.l0).getRight() + ((View) iDLListenerS56S0200000_2.l0).getLeft()) / 2) - (((C1555268m) iDLListenerS56S0200000_2.l1).getWidth() / 2), 0);
        }
    }

    public static final void onGlobalLayout$1(IDLListenerS56S0200000_2 iDLListenerS56S0200000_2) {
        C0A2 c0a2;
        ViewTreeObserver viewTreeObserver;
        LinearLayoutManager linearLayoutManager;
        NLETrackSlot selectedTrackSlot = ((MagicFragment) iDLListenerS56S0200000_2.l0).Jl().getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            ((MagicFragment) iDLListenerS56S0200000_2.l0).nm(selectedTrackSlot);
        }
        ((MagicFragment) iDLListenerS56S0200000_2.l0).zm();
        RecyclerView recyclerView = ((AnonymousClass574) iDLListenerS56S0200000_2.l1).getRecyclerView();
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if ((c0a2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) c0a2) != null) {
            AnonymousClass574 anonymousClass574 = (AnonymousClass574) iDLListenerS56S0200000_2.l1;
            MagicFragment magicFragment = (MagicFragment) iDLListenerS56S0200000_2.l0;
            C40517FvF c40517FvF = new C40517FvF(linearLayoutManager.LLILL(), linearLayoutManager.LLILLJJLI());
            AnonymousClass576 resourceListAdapter = anonymousClass574.getResourceListAdapter();
            if (resourceListAdapter != null) {
                int i = 0;
                for (ResourceItem resourceItem : resourceListAdapter.LJLLLLLL()) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        ResourceItem resourceItem2 = resourceItem;
                        int i3 = c40517FvF.LJLIL;
                        if (i <= c40517FvF.LJLILLLLZI && i3 <= i) {
                            magicFragment.vm(resourceItem2, i);
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        RecyclerView recyclerView2 = ((AnonymousClass574) iDLListenerS56S0200000_2.l1).getRecyclerView();
        if (recyclerView2 != null && (viewTreeObserver = recyclerView2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS56S0200000_2);
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS56S0200000_2 iDLListenerS56S0200000_2) {
        ((Runnable) iDLListenerS56S0200000_2.l0).run();
        ViewTreeObserver viewTreeObserver = ((C1551667c) iDLListenerS56S0200000_2.l1).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS56S0200000_2);
        }
    }

    public static final void onGlobalLayout$3(IDLListenerS56S0200000_2 iDLListenerS56S0200000_2) {
        ((C134825Qw) iDLListenerS56S0200000_2.l0).LIZJ.getViewTreeObserver().removeOnGlobalLayoutListener(iDLListenerS56S0200000_2);
        C134825Qw c134825Qw = (C134825Qw) iDLListenerS56S0200000_2.l0;
        DavinciViewPositionRect davinciViewPositionRect = c134825Qw.LJ;
        if (davinciViewPositionRect != null) {
            C5R4 c5r4 = (C5R4) iDLListenerS56S0200000_2.l1;
            if (davinciViewPositionRect.right - davinciViewPositionRect.left == 0 || davinciViewPositionRect.bottom - davinciViewPositionRect.top == 0 || c134825Qw.LIZJ.getWidth() == 0 || c134825Qw.LIZJ.getHeight() == 0) {
                c5r4.LIZIZ();
            } else {
                c134825Qw.LIZIZ(davinciViewPositionRect, true, new C5R1(c5r4));
            }
        }
    }

    public static final void onGlobalLayout$4(IDLListenerS56S0200000_2 iDLListenerS56S0200000_2) {
        ViewTreeObserver viewTreeObserver;
        SurfaceView surfaceView = ((DialogC134805Qu) iDLListenerS56S0200000_2.l0).LJLJJI;
        if (surfaceView != null && (viewTreeObserver = surfaceView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(iDLListenerS56S0200000_2);
        }
        InterfaceC127784zu player = ((DialogC134805Qu) iDLListenerS56S0200000_2.l0).LJLIL.getPlayer();
        int[] iArr = (int[]) iDLListenerS56S0200000_2.l1;
        player.LIZ(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public IDLListenerS56S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
