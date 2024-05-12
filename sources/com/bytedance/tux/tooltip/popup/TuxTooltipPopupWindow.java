package com.bytedance.tux.tooltip.popup;

import X.C16880lQ;
import X.C82679Wcd;
import X.C82682Wcg;
import X.C82687Wcl;
import X.C90W;
import X.C9TV;
import X.InterfaceC82683Wch;
import X.InterfaceC82688Wcm;
import X.InterfaceC82689Wcn;
import X.WHL;
import X.WHM;
import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class TuxTooltipPopupWindow extends PopupWindow implements GenericLifecycleObserver, InterfaceC82683Wch {
    public final Context LJLIL;
    public C82682Wcg LJLILLLLZI;
    public final View LJLJI;
    public boolean LJLJJI;
    public final C82679Wcd LJLJJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC82683Wch
    public final void LIZLLL() {
        this.LJLJJL.LJIIIIZZ();
        C82687Wcl c82687Wcl = this.LJLJJL.LJIIIZ;
        update(c82687Wcl.LIZ, c82687Wcl.LIZIZ, -1, -1);
    }

    public final void LJI() {
        Context context = this.LJLIL;
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            C90W c90w = this.LJLILLLLZI.LJIILL;
            if (c90w != null) {
                ((C9TV) c90w).LIZ();
            }
            View view = this.LJLILLLLZI.LIZIZ;
            if (view == null) {
                View decorView = ((Activity) this.LJLIL).getWindow().getDecorView();
                C82687Wcl c82687Wcl = this.LJLJJL.LJIIIZ;
                C16880lQ.LLLF(this, decorView, c82687Wcl.LIZ, c82687Wcl.LIZIZ);
            } else {
                C82687Wcl c82687Wcl2 = this.LJLJJL.LJIIIZ;
                C16880lQ.LLLF(this, view, c82687Wcl2.LIZ, c82687Wcl2.LIZIZ);
            }
            InterfaceC82689Wcn interfaceC82689Wcn = this.LJLILLLLZI.LJJII;
            if (interfaceC82689Wcn != null) {
                interfaceC82689Wcn.onShow();
            }
            C82679Wcd c82679Wcd = this.LJLJJL;
            c82679Wcd.LJIIIZ(c82679Wcd.LJIIIZ, true);
            if (this.LJLILLLLZI.LJII != -1001) {
                new Handler().postDelayed(new ARunnableS50S0100000_14(this, 28), this.LJLILLLLZI.LJII);
            }
        }
    }

    @Override // android.widget.PopupWindow, X.InterfaceC82683Wch
    public final void dismiss() {
        if (this.LJLILLLLZI.LJIIJJI) {
            if (!this.LJLJJI) {
                C82679Wcd c82679Wcd = this.LJLJJL;
                c82679Wcd.LJIIIZ(c82679Wcd.LJIIIZ, false);
                this.LJLJJI = true;
                new Handler().postDelayed(new ARunnableS50S0100000_14(this, 27), this.LJLILLLLZI.LJIIJ);
                return;
            }
            return;
        }
        super.dismiss();
    }

    @Override // X.InterfaceC82683Wch
    public final void show() {
        C82682Wcg c82682Wcg = this.LJLILLLLZI;
        if (c82682Wcg.LIZIZ == null && (c82682Wcg.LJIILLIIL < 0 || c82682Wcg.LJIIZILJ < 0)) {
            return;
        }
        if (!this.LJLJJL.LJIIIIZZ()) {
            int i = WHM.LIZ[this.LJLILLLLZI.LIZLLL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.LJLILLLLZI.LIZ(WHL.BOTTOM);
                        }
                    } else {
                        this.LJLILLLLZI.LIZ(WHL.TOP);
                    }
                } else {
                    this.LJLILLLLZI.LIZ(WHL.START);
                }
            } else {
                this.LJLILLLLZI.LIZ(WHL.END);
            }
            C82682Wcg bundle = this.LJLILLLLZI;
            o.LJIIIZ(bundle, "bundle");
            C82679Wcd c82679Wcd = this.LJLJJL;
            c82679Wcd.getClass();
            c82679Wcd.LIZIZ = bundle;
            this.LJLILLLLZI = bundle;
            this.LJLJJL.LJFF();
            this.LJLJJL.LJI();
            if (this.LJLJJL.LJIIIIZZ() || this.LJLILLLLZI.LJIIIZ) {
                LJI();
                return;
            }
            return;
        }
        LJI();
    }

    @Override // android.widget.PopupWindow, X.InterfaceC82683Wch
    public final boolean isShowing() {
        return super.isShowing();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        super.dismiss();
    }

    public static final /* synthetic */ void LJFF(TuxTooltipPopupWindow tuxTooltipPopupWindow) {
        super.dismiss();
    }

    @Override // X.InterfaceC82683Wch
    public final void LIZ(boolean z) {
        setOutsideTouchable(z);
    }

    @Override // X.InterfaceC82683Wch
    public final void LIZIZ(InterfaceC82688Wcm interfaceC82688Wcm) {
        this.LJLILLLLZI.LJJIFFI = interfaceC82688Wcm;
    }

    @Override // X.InterfaceC82683Wch
    public final void LJ(InterfaceC82689Wcn interfaceC82689Wcn) {
        this.LJLILLLLZI.LJJII = interfaceC82689Wcn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TuxTooltipPopupWindow(android.content.Context r9, X.C82682Wcg r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            r3 = r9
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "toolTipBundle"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            r5 = r8
            r5.<init>()
            r5.LJLIL = r3
            r5.LJLILLLLZI = r10
            android.view.View r0 = r10.LIZIZ
            r2 = 0
            if (r0 == 0) goto L7c
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r0)
            if (r0 != 0) goto L27
            boolean r0 = r3 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L30
            r0 = r3
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
        L25:
            if (r0 == 0) goto L30
        L27:
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L30
            r0.addObserver(r5)
        L30:
            r0 = -2
            r5.setWidth(r0)
            r5.setHeight(r0)
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r0 = 0
            r1.<init>(r0)
            r5.setBackgroundDrawable(r1)
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r3)
            r0 = 2131558404(0x7f0d0004, float:1.8742123E38)
            android.view.View r6 = X.C16880lQ.LLLZIIL(r0, r1, r2)
            java.lang.String r0 = "from(context).inflate(R.…base_tooltip_popup, null)"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            r5.LJLJI = r6
            r5.setContentView(r6)
            X.Wcd r2 = new X.Wcd
            X.Wcg r4 = r5.LJLILLLLZI
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            r5.LJLJJL = r2
            X.Wci r0 = new X.Wci
            r0.<init>(r5)
            r5.setOnDismissListener(r0)
            r2.LJ()
            X.Wcg r1 = r5.LJLILLLLZI
            java.lang.String r0 = "bundle"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            r2.LIZIZ = r1
            r5.LJLILLLLZI = r1
            r2.LJFF()
            r2.LJI()
            return
        L7c:
            boolean r0 = r3 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L30
            r0 = r3
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow.<init>(android.content.Context, X.Wcg):void");
    }

    @Override // X.InterfaceC82683Wch
    public final void LIZJ(View.OnClickListener onClickListener, boolean z) {
        this.LJLILLLLZI.LJJ = onClickListener;
        if (z) {
            setTouchable(true);
            C16880lQ.LJIILJJIL((FrameLayout) this.LJLJI.findViewById(R.id.bst), onClickListener);
        } else {
            setTouchable(false);
        }
    }
}
