package com.bytedance.android.live.design.view.sheet;

import X.C16360ka;
import X.C16880lQ;
import X.C1GW;
import X.C78609UtB;
import X.InterfaceC16710l9;
import Y.IDCListenerS135S0100000;
import Y.IDCListenerS250S0100000;
import Y.IDTListenerS67S0000000;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LifecycleAwareDialog;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import o3.IDaS464S0100000;
import o3.h0;

/* loaded from: classes.dex */
public class LiveBottomSheetDialog extends LifecycleAwareDialog {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public LiveBottomSheetBehavior<FrameLayout> LJLJJI;
    public FrameLayout LJLJJL;
    public FrameLayout LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public float LJLL;
    public final C1GW LJLLI;

    public LiveBottomSheetDialog() {
        throw null;
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJIJJLI() {
        if (this.LJLJJL == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.bp1, null);
            this.LJLJJL = frameLayout;
            frameLayout.findViewById(R.id.bv5);
            FrameLayout frameLayout2 = (FrameLayout) this.LJLJJL.findViewById(R.id.c8m);
            this.LJLJJLL = frameLayout2;
            C16360ka.LJIJJ(frameLayout2, new InterfaceC16710l9() { // from class: X.1Qz
                @Override // X.InterfaceC16710l9
                public final C16800lI LIZ(View view, C16800lI c16800lI) {
                    return c16800lI;
                }
            });
            LiveBottomSheetBehavior<FrameLayout> LIZLLL = LiveBottomSheetBehavior.LIZLLL(this.LJLJJLL);
            this.LJLJJI = LIZLLL;
            LIZLLL.LIZ(this.LJLLI);
            this.LJLJJI.setHideable(this.LJLJL);
            this.LJLJJL.addOnLayoutChangeListener(new IDCListenerS250S0100000(this, 2));
        }
    }

    public final void LJIJJ() {
        float f;
        if (getWindow() != null) {
            LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.LJLJJI;
            int expandedOffset = liveBottomSheetBehavior.LJJIFFI - liveBottomSheetBehavior.getExpandedOffset();
            if (expandedOffset > 0) {
                f = (this.LJLJJI.LJJIFFI - this.LJLJJLL.getTop()) / expandedOffset;
            } else {
                f = 1.0f;
            }
            getWindow().setDimAmount(C78609UtB.LJJIIJZLJL(f, 0.0f, 1.0f) * this.LJLL);
        }
    }

    @Override // X.DialogC47081t2, android.app.Dialog
    public void onStart() {
        super.onStart();
        LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.LJLJJI;
        if (liveBottomSheetBehavior != null && liveBottomSheetBehavior.LJIJI == 5) {
            if (liveBottomSheetBehavior.LJIIZILJ) {
                liveBottomSheetBehavior.setState(3);
            } else {
                liveBottomSheetBehavior.setState(4);
            }
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                i = R.style.af;
            } else if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                i = R.style.ah;
            } else {
                i = R.style.ag;
            }
            window.setWindowAnimations(i);
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(android.R.attr.backgroundDimAmount, typedValue, true);
        this.LJLL = typedValue.getFloat();
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.LJLJL != z) {
            this.LJLJL = z;
            LiveBottomSheetBehavior<FrameLayout> liveBottomSheetBehavior = this.LJLJJI;
            if (liveBottomSheetBehavior != null) {
                liveBottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.LJLJL) {
            this.LJLJL = true;
        }
        this.LJLJLJ = z;
        this.LJLJLLL = true;
    }

    @Override // X.C18Z, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(LJIL(view, 0, null));
    }

    @Override // X.C18Z, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(LJIL(null, i, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveBottomSheetDialog(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r3 = 1
            if (r6 != 0) goto L17
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2130970476(0x7f04076c, float:1.7549663E38)
            boolean r0 = r1.resolveAttribute(r0, r2, r3)
            if (r0 == 0) goto L2a
            int r6 = r2.resourceId
        L17:
            r0 = 0
            r4.<init>(r5, r6, r0)
            r4.LJLJL = r3
            r4.LJLJLJ = r3
            X.1GW r0 = new X.1GW
            r0.<init>(r4)
            r4.LJLLI = r0
            r4.LJIJI(r3)
            return
        L2a:
            r6 = 2131886667(0x7f12024b, float:1.940792E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog.<init>(android.content.Context, int):void");
    }

    @Override // X.C18Z, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJIL(view, 0, layoutParams));
    }

    public final View LJIL(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LJIJJLI();
        ViewGroup viewGroup = (ViewGroup) this.LJLJJL.findViewById(R.id.bv5);
        if (i != 0 && view == null) {
            view = C16880lQ.LLLLIILL(getLayoutInflater(), i, viewGroup, false);
        }
        this.LJLJJLL.removeAllViews();
        if (layoutParams == null) {
            this.LJLJJLL.addView(view, -1, -1);
        } else {
            this.LJLJJLL.addView(view, layoutParams);
        }
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 73), viewGroup.findViewById(R.id.liz));
        h0.LJIJI(this.LJLJJLL, new IDaS464S0100000(this, 1));
        this.LJLJJLL.setOnTouchListener(new IDTListenerS67S0000000(0));
        return this.LJLJJL;
    }
}
