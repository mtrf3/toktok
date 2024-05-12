package X;

import Y.ACListenerS22S0100000_2;
import Y.IDAListenerS71S0100000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.581, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass581 implements InterfaceC134705Qk, InterfaceC70422pa {
    public final Context LJLIL;
    public final NLEModel LJLILLLLZI;
    public C52Q LJLJI;
    public View LJLJJI;
    public C1303959v LJLJJL;
    public C5A3 LJLJJLL;
    public C1297757l LJLJL;
    public ImageView LJLJLJ;
    public ImageView LJLJLLL;
    public View LJLL;
    public PopupWindow LJLLI;
    public int LJLLJ;
    public HandlerC1285852w LJLLLL;
    public final MBA LJLLILLLL = C36636EZk.LIZ.plus(T2R.LJIIJJI());
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 1026));

    public final C131235Db LIZ() {
        return (C131235Db) this.LJLLL.getValue();
    }

    public final void LIZIZ() {
        PopupWindow popupWindow;
        View contentView;
        PopupWindow popupWindow2 = this.LJLLI;
        if (popupWindow2 != null && popupWindow2.isShowing() && (popupWindow = this.LJLLI) != null && (contentView = popupWindow.getContentView()) != null) {
            contentView.animate().alpha(0.0f).translationYBy(C170576mj.LIZ(contentView.getContext(), 2.0f)).setDuration(100L).setInterpolator(new C58V()).setListener(new IDAListenerS71S0100000_2(this, 16));
        }
    }

    @Override // X.InterfaceC134705Qk
    public final void onCreate() {
        C1303959v c1303959v;
        C5A3 c5a3;
        C1297757l c1297757l;
        ImageView imageView;
        ImageView imageView2;
        View view;
        Object LLILL = C16880lQ.LLILL(this.LJLIL, "layout_inflater");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.LayoutInflater");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.ak0, (LayoutInflater) LLILL, null);
        this.LJLJJI = LLLZIIL;
        if (LLLZIIL != null) {
            c1303959v = (C1303959v) LLLZIIL.findViewById(R.id.e8a);
        } else {
            c1303959v = null;
        }
        this.LJLJJL = c1303959v;
        View view2 = this.LJLJJI;
        if (view2 != null) {
            c5a3 = (C5A3) view2.findViewById(R.id.dmw);
        } else {
            c5a3 = null;
        }
        this.LJLJJLL = c5a3;
        View view3 = this.LJLJJI;
        if (view3 != null) {
            c1297757l = (C1297757l) view3.findViewById(R.id.gp3);
        } else {
            c1297757l = null;
        }
        this.LJLJL = c1297757l;
        if (c1297757l != null) {
            c1297757l.setLongClickEnable(false);
        }
        C1297757l c1297757l2 = this.LJLJL;
        if (c1297757l2 != null) {
            c1297757l2.setSlotClickEnable(false);
        }
        View view4 = this.LJLJJI;
        if (view4 != null) {
            imageView = (ImageView) view4.findViewById(R.id.f3f);
        } else {
            imageView = null;
        }
        this.LJLJLJ = imageView;
        View view5 = this.LJLJJI;
        if (view5 != null) {
            imageView2 = (ImageView) view5.findViewById(R.id.f8p);
        } else {
            imageView2 = null;
        }
        this.LJLJLLL = imageView2;
        View view6 = this.LJLJJI;
        if (view6 != null) {
            view = view6.findViewById(R.id.fbd);
        } else {
            view = null;
        }
        this.LJLL = view;
        ImageView imageView3 = this.LJLJLJ;
        if (imageView3 != null) {
            C16880lQ.LJIILLIIL(imageView3, new ACListenerS22S0100000_2(this, 163));
        }
        ImageView imageView4 = this.LJLJLLL;
        if (imageView4 != null) {
            C16880lQ.LJIILLIIL(imageView4, new ACListenerS22S0100000_2(this, 164));
        }
        C1297757l c1297757l3 = this.LJLJL;
        o.LJI(c1297757l3);
        C54U c54u = new C54U(c1297757l3);
        LIZ().LIZIZ(c54u);
        C1303959v c1303959v2 = this.LJLJJL;
        if (c1303959v2 != null) {
            c1303959v2.LJLLI.add(new InterfaceC1299658e() { // from class: X.582
                @Override // X.InterfaceC1299658e
                public final void LIZ(C5AF state, int i) {
                    o.LJIIIZ(state, "state");
                }
            });
        }
        C1303959v c1303959v3 = this.LJLJJL;
        if (c1303959v3 != null) {
            NLEModel nLEModel = this.LJLILLLLZI;
            o.LJI(nLEModel);
            c1303959v3.LJJZZI(nLEModel.getMaxTargetEnd() / 1000);
        }
        InterfaceC1298857w interfaceC1298857w = new InterfaceC1298857w() { // from class: X.56X
            @Override // X.InterfaceC1298857w
            public final List<Long> LIZIZ() {
                return C61878OQg.INSTANCE;
            }

            @Override // X.InterfaceC1298857w
            public final Bitmap LIZ(int i, String path) {
                o.LJIIIZ(path, "path");
                return AnonymousClass581.this.LIZ().LJFF(i, path);
            }
        };
        C1297757l c1297757l4 = this.LJLJL;
        if (c1297757l4 != null) {
            c1297757l4.LJZI = null;
            c1297757l4.LJZL = interfaceC1298857w;
            c1297757l4.setMultiTrackListener(new InterfaceC1298157p() { // from class: X.52x
                @Override // X.InterfaceC1298157p
                public final boolean LIZ() {
                    return true;
                }

                @Override // X.InterfaceC1298157p
                public final NLETrackSlot LJIIIIZZ() {
                    return null;
                }

                @Override // X.InterfaceC1298157p
                public final void LJIIL(NLETrackSlot nLETrackSlot, int i) {
                }

                @Override // X.C59H
                public final void LJJIIZI(int i) {
                }

                @Override // X.InterfaceC1298157p
                public final void LJJIZ(NLETrackSlot nLETrackSlot) {
                }

                @Override // X.InterfaceC1298157p
                public final void LJJJ(NLETrackSlot nLETrackSlot) {
                }

                @Override // X.InterfaceC1298157p
                public final void LJJJIL(long j) {
                }

                @Override // X.InterfaceC1298157p
                public final void LJJJJL() {
                }

                @Override // X.InterfaceC1298157p
                public final void LJJJLZIJ(NLETrackSlot slot, int i, int i2) {
                    o.LJIIIZ(slot, "slot");
                }

                @Override // X.InterfaceC1298157p
                public final void onClipMainToMinDuration() {
                }

                @Override // X.InterfaceC1298157p
                public final void onStartAndDuration(NLETrackSlot slot, long j, long j2, int i) {
                    o.LJIIIZ(slot, "slot");
                }

                @Override // X.InterfaceC1298157p
                public final void onTransitionClick(NLETrackSlot slot, NLETrackSlot nextSlot) {
                    o.LJIIIZ(slot, "slot");
                    o.LJIIIZ(nextSlot, "nextSlot");
                }

                @Override // X.InterfaceC1298157p
                public final void onUnableToSetTransition(int i) {
                }

                @Override // X.InterfaceC1298157p
                public final int LJFF() {
                    C5A3 c5a32 = AnonymousClass581.this.LJLJJLL;
                    o.LJI(c5a32);
                    return c5a32.getScrollX();
                }

                @Override // X.InterfaceC1298157p
                public final InterfaceC1289354f LJIJJ() {
                    return new C121004oy(AnonymousClass581.this.LJLIL);
                }

                @Override // X.C59H
                public final void LJJJJJ(int i, boolean z) {
                    C1303959v c1303959v4 = AnonymousClass581.this.LJLJJL;
                    if (c1303959v4 != null) {
                        c1303959v4.LJJJJJ(i, true);
                    }
                }

                @Override // X.C59H
                public final void LIZLLL(boolean z, boolean z2, int i, int i2, boolean z3) {
                    C1303959v c1303959v4 = AnonymousClass581.this.LJLJJL;
                    if (c1303959v4 != null) {
                        c1303959v4.LIZLLL(z, z2, i, i2, z3);
                    }
                }
            });
        }
        NLEModel nLEModel2 = this.LJLILLLLZI;
        o.LJI(nLEModel2);
        NLETrack mainTrack = nLEModel2.getMainTrack();
        o.LJI(mainTrack);
        VecNLETrackSlotSPtr LJIILLIIL = mainTrack.LJIILLIIL();
        XKX.LIZLLL(this, C36636EZk.LIZ, null, new C131155Ct(this, LJIILLIIL, null), 2);
        c54u.LIZJ = LJIILLIIL;
        LIZ().LJI(false);
        Object LLILL2 = C16880lQ.LLILL(this.LJLIL, "layout_inflater");
        o.LJII(LLILL2, "null cannot be cast to non-null type android.view.LayoutInflater");
        View LLLZIIL2 = C16880lQ.LLLZIIL(R.layout.as3, (LayoutInflater) LLILL2, null);
        PopupWindow popupWindow = new PopupWindow((int) C170576mj.LIZ(this.LJLIL, 100.0f), (int) C170576mj.LIZ(this.LJLIL, 43.0f));
        this.LJLLI = popupWindow;
        popupWindow.setContentView(LLLZIIL2);
        C5A3 c5a32 = this.LJLJJLL;
        if (c5a32 != null) {
            c5a32.setScrollChangeListener(new AqS184S0100000_2(this, 90));
        }
        C5A3 c5a33 = this.LJLJJLL;
        if (c5a33 != null) {
            c5a33.setMustUpdateScrollXListener(new AqS168S0100000_2(this, 631));
        }
    }

    @Override // X.InterfaceC134705Qk
    public final void onDestroy() {
        C5A3 c5a3 = this.LJLJJLL;
        if (c5a3 != null) {
            c5a3.setScrollChangeListener(null);
        }
        C5A3 c5a32 = this.LJLJJLL;
        if (c5a32 != null) {
            c5a32.setMustUpdateScrollXListener(null);
        }
        HandlerC1285852w handlerC1285852w = this.LJLLLL;
        if (handlerC1285852w != null) {
            handlerC1285852w.removeCallbacksAndMessages(null);
        } else {
            o.LJIJI("customHandler");
            throw null;
        }
    }

    @Override // X.InterfaceC134705Qk
    public final void onHide() {
        LIZIZ();
        C79146V4k.LJIJ(this.LJLLILLLL, null);
        LIZ().LIZJ();
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC134705Qk
    public final View getView() {
        return this.LJLJJI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.52w] */
    @Override // X.InterfaceC134705Qk
    public final void LLLLLZ(final DialogC134805Qu dialogC134805Qu) {
        this.LJLJI = dialogC134805Qu;
        this.LJLLLL = new AbstractHandlerC135645Ua<C52Q>(dialogC134805Qu, this) { // from class: X.52w
            public final AnonymousClass581 LIZIZ;
            public final int LIZJ;
            public int LIZLLL;

            {
                o.LJIIIZ(this, "controlBar");
                this.LIZIZ = this;
                this.LIZJ = 300;
            }

            @Override // X.AbstractHandlerC135645Ua
            public final void LIZ(Object obj, Message msg) {
                o.LJIIIZ(msg, "msg");
                if (msg.what == 0) {
                    removeMessages(1);
                    this.LIZIZ.LIZIZ();
                }
                if (msg.what == 2) {
                    int i = this.LIZLLL - 50;
                    this.LIZLLL = i;
                    if (i != 0) {
                        sendEmptyMessageDelayed(2, 50L);
                    } else {
                        sendEmptyMessage(0);
                    }
                }
                if (msg.what == 1) {
                    this.LIZLLL = this.LIZJ;
                    removeMessages(2);
                    sendEmptyMessageDelayed(2, 50L);
                }
            }
        };
    }

    public AnonymousClass581(Context context, NLEModel nLEModel) {
        this.LJLIL = context;
        this.LJLILLLLZI = nLEModel;
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLLZZ(float f, boolean z) {
        int LIZIZ = (int) (C1300758p.LIZIZ() * f);
        C5A3 c5a3 = this.LJLJJLL;
        o.LJI(c5a3);
        if (c5a3.getScrollX() != LIZIZ) {
            C1303959v c1303959v = this.LJLJJL;
            if (c1303959v != null) {
                c1303959v.LJJLL(LIZIZ);
            }
            C5A3 c5a32 = this.LJLJJLL;
            o.LJI(c5a32);
            LIZJ(c5a32.getScrollX(), false, z);
        }
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZIL(Animation animation, boolean z) {
        int i;
        View view = this.LJLJJI;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
        View view2 = this.LJLJJI;
        if (view2 != null) {
            view2.startAnimation(animation);
        }
    }

    @Override // X.InterfaceC134705Qk
    public final void LLLLLZL(boolean z, boolean z2) {
        ImageView imageView = this.LJLJLLL;
        if (imageView == null) {
            return;
        }
        imageView.setActivated(z);
    }

    public final void LIZJ(int i, boolean z, boolean z2) {
        C1297757l c1297757l = this.LJLJL;
        if (c1297757l != null) {
            c1297757l.LJLLLL = i;
            Iterator it = ((ArrayList) c1297757l.LJLIL).iterator();
            while (it.hasNext()) {
                ((C59L) it.next()).LJIJ(i);
            }
            List<C59L> list = c1297757l.LJLIL;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((C59L) next).getStyle() != EnumC127354zD.NONE) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C59L c59l = (C59L) it3.next();
                if (c59l.LJLJJI != EnumC127354zD.NONE) {
                    c59l.LLIIJI.LIZIZ();
                }
            }
        }
        if (Math.abs(i - this.LJLLJ) >= C1289254e.LJIIIZ || z) {
            LIZ().LJI(z2);
            this.LJLLJ = i;
        }
    }
}
