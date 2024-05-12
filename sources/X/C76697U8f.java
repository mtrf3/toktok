package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDComparatorS41S0000000_13;
import android.content.Context;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicSurfaceFixCombineSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76697U8f extends C76696U8e {
    public final U8P LLD;
    public final C76703U8l LLF;
    public final InterfaceC76661U6v LLFF;
    public final C62822Ol8 LLFFF;

    private final FrameLayout getRenderLayer() {
        return (FrameLayout) this.LLFFF.getValue();
    }

    public final void LJIIZILJ() {
        SurfaceView surfaceView;
        Layout LIZ = this.LLD.LIZ();
        if (LIZ == null) {
            return;
        }
        int LIZJ = this.LLD.LIZJ(LIZ);
        if (LIZJ > 0) {
            post(new ARunnableS32S0200000_13(this, LIZ, 122));
        } else {
            getPath().reset();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getWindowList());
        getWindowList().clear();
        int max = Math.max(arrayList.size(), LIZJ);
        if (max > LIZJ) {
            for (int i = LIZJ; i < max; i++) {
                Object obj = ListProtector.get(arrayList, i);
                o.LJIIIIZZ(obj, "snapshotList[pos]");
                LJIIL((C76699U8h) obj);
                SurfaceView surfaceView2 = ((C76699U8h) ListProtector.get(arrayList, i)).LJLJI.LJLIL.LIZLLL;
                if (surfaceView2 != null) {
                    C29306Beo.LJJIJIIJIL(surfaceView2);
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C76701U8j c76701U8j = ((C76699U8h) it.next()).LJLJI.LJLIL;
            if (c76701U8j.LJII && (surfaceView = c76701U8j.LIZLLL) != null) {
                C29306Beo.LJJIJIIJIL(surfaceView);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = LIZJ - 1; -1 < i2; i2--) {
            if (LJIILJJIL(i2, this.LLF.LJIIL(i2), LIZ, arrayList)) {
                Iterator<C76699U8h> it2 = getWindowList().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C76699U8h next = it2.next();
                        if (next.LJLIL == i2) {
                            if (next != null) {
                                arrayList2.add(next);
                            }
                        }
                    }
                }
            }
        }
        Collection<? extends C76699U8h> LLILII = ORZ.LLILII(new IDComparatorS41S0000000_13(15), getWindowList());
        getWindowList().clear();
        getWindowList().addAll(LLILII);
        post(new ARunnableS32S0200000_13(this, arrayList2, 123));
    }

    @Override // X.C76696U8e
    public final void LJII(AbstractC76785UBp actionType, InterfaceC88472Yns<? super String, C76737U9t> interfaceC88472Yns) {
        o.LJIIIZ(actionType, "actionType");
        if (actionType instanceof UBP) {
            C29306Beo.LJJJ(new AqS163S0100000_13(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
            LJIIZILJ();
            if (getParent() != null) {
                post(new ARunnableS49S0100000_13(this, 216));
                return;
            }
            return;
        }
        if (!(actionType instanceof UBO)) {
            return;
        }
        C29306Beo.LJJJ(new AqS160S0200000_13(this, (C76697U8f) interfaceC88472Yns, (InterfaceC88472Yns<? super String, C76737U9t>) 78));
    }

    public final void LJIILLIIL(SurfaceView surfaceView, int i) {
        if (surfaceView == null) {
            return;
        }
        C29306Beo.LJJIJIIJIL(surfaceView);
        if (this.LJLJJLL.LJIIIIZZ() && i == 0) {
            LJIILL(0, surfaceView, getRenderLayer());
        } else {
            surfaceView.setZOrderMediaOverlay(true);
            LJIILL(-1, surfaceView, getRenderLayer());
        }
    }

    @Override // X.C76696U8e, X.InterfaceC88471Ynr
    public final /* bridge */ /* synthetic */ C76800UCe invoke(AbstractC76785UBp abstractC76785UBp, InterfaceC88472Yns<? super String, ? extends C76737U9t> interfaceC88472Yns) {
        LJII(abstractC76785UBp, interfaceC88472Yns);
        return C76800UCe.LIZ;
    }

    public static void LJIILL(int i, View view, ViewGroup viewGroup) {
        if (view.getParent() == null) {
            viewGroup.addView(view, i);
        }
        if (o.LJ(view.getParent(), viewGroup)) {
            return;
        }
        C29306Beo.LJJIJIIJIL(view);
        viewGroup.addView(view, i);
    }

    public final boolean LJIILJJIL(int i, int i2, Layout layout, List<C76699U8h> list) {
        Rect rect;
        C76699U8h LJFF;
        FrameLayout.LayoutParams LJIILIIL;
        boolean z;
        boolean z2;
        Rect LJFF2 = this.LLD.LJFF(i, getMAllAreaInWindow(), layout);
        boolean LJIIIIZZ = LJIIIIZZ();
        boolean z3 = true;
        if (LJIIIIZZ) {
            rect = new Rect(LJFF2);
            rect.intersect(getMActualShowAreaInWindow());
        } else if (!LJIIIIZZ) {
            rect = LJFF2;
        } else {
            throw new C162476Zf();
        }
        C76711U8t LJFF3 = this.LLF.LJFF(i);
        if (list.size() > i) {
            C76699U8h c76699U8h = (C76699U8h) ListProtector.get(list, i);
            if (c76699U8h.LJLJJL.LJLIL == LJFF3.L()) {
                z = true;
            } else {
                z = false;
            }
            boolean L = c76699U8h.LJLJJL.LJLILLLLZI.L(LJFF2);
            boolean L2 = c76699U8h.LJLJJL.LJLJI.L(rect);
            if (c76699U8h.LJLJI.LJLILLLLZI.getParent() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C0NB.LIZIZ("LayoutViewV2DrawWindow", i + ' ' + c76699U8h.LJLIL + ' ' + c76699U8h.LJJ() + ' ' + LJFF3.LJLIL.LIZJ + c76699U8h.LJLJJL.LJLIL + ' ' + LJFF3.L() + ' ' + z + ' ' + c76699U8h.LJLJJL.LJLILLLLZI + ' ' + LJFF2 + ' ' + L + ' ' + c76699U8h.LJLJJL.LJLJI + ' ' + rect + ' ' + L2 + ' ' + c76699U8h.LJLJI.LJLIL.LIZ + ' ' + LJFF3.LJLIL.LIZ + ' ' + z2 + ' ');
            if (c76699U8h.LJLJJL.LJLIL == LJFF3.L() && c76699U8h.LJLJJL.LJLILLLLZI.L(LJFF2) && c76699U8h.LJLJJL.LJLJI.L(rect) && c76699U8h.LJLJI.LJLILLLLZI.getParent() != null) {
                LJFF = LJFF(i, i2, c76699U8h.LJLJI, layout.getLayoutId(), LJFF2, rect);
                z3 = false;
            } else {
                LJIIL(c76699U8h);
                LJFF = LJFF(i, i2, LJFF3, layout.getLayoutId(), LJFF2, rect);
            }
        } else {
            LJFF = LJFF(i, i2, LJFF3, layout.getLayoutId(), LJFF2, rect);
        }
        if (LivesdkLinkmicSurfaceFixCombineSetting.INSTANCE.getValue()) {
            LJIILIIL = C76696U8e.LJIILIIL(rect);
        } else {
            LJIILIIL = C76696U8e.LJIILIIL(LJFF2);
        }
        if (LJFF3.LJLIL.LJII) {
            getLayoutMixer().LIZLLL(i, i2, LJFF3);
        } else {
            getLayoutMixer().LIZJ(i, i2, LJFF3, LJIILIIL, getContainerAllRange());
        }
        FrameLayout.LayoutParams LJIILIIL2 = C76696U8e.LJIILIIL(rect);
        FrameLayout frameLayout = LJFF3.LJLILLLLZI;
        frameLayout.setLayoutParams(LJIILIIL2);
        frameLayout.setClipChildren(getClipChildren());
        SurfaceView surfaceView = LJFF3.LJLIL.LIZLLL;
        if (this.LJLJJLL.LJIIIIZZ() && i == 0) {
            LJIILL(0, frameLayout, getInteractLayer());
            if (LJFF3.LJLIL.LJII) {
                if (surfaceView != null) {
                    C29306Beo.LJJIJIIJIL(surfaceView);
                }
            } else {
                LJIILLIIL(surfaceView, i);
            }
        } else {
            if (LJFF3.LJLIL.LJII) {
                if (surfaceView != null) {
                    C29306Beo.LJJIJIIJIL(surfaceView);
                }
            } else {
                LJIILLIIL(surfaceView, i);
            }
            LJIILL(-1, frameLayout, getInteractLayer());
        }
        C76701U8j c76701U8j = LJFF3.LJLIL;
        if (c76701U8j.LJII) {
            c76701U8j.LIZLLL = null;
            c76701U8j.LJ = null;
        }
        getWindowList().add(LJFF);
        if (i == 0) {
            LJFF.LJLJLLL = getMOffsetY();
        }
        return z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76697U8f(U8P helper, C76703U8l micDataCenter, Context context, U8M u8m, U6C layoutListener, LayoutSlardarMonitor layoutSlardarMonitor) {
        super(helper, micDataCenter, context, u8m, layoutListener, layoutSlardarMonitor);
        o.LJIIIZ(helper, "helper");
        o.LJIIIZ(micDataCenter, "micDataCenter");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(layoutListener, "layoutListener");
        new LinkedHashMap();
        this.LLD = helper;
        this.LLF = micDataCenter;
        this.LLFF = layoutListener;
        this.LLFFF = C221108m2.LIZIZ(new AqS160S0200000_13(context, this, 79));
    }
}
