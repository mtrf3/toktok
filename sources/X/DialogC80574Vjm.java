package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS17S0201000_14;
import Y.IDTListenerS70S0000000_14;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import o3.IDaS471S0100000_14;
import o3.h0;

/* renamed from: X.Vjm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC80574Vjm extends C18Z {
    public ViewPagerBottomSheetBehavior<FrameLayout> LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final C80573Vjl LJLJL;

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.LJLJI;
        if (viewPagerBottomSheetBehavior == null || 4 == viewPagerBottomSheetBehavior.LJIIIIZZ) {
            return;
        }
        WeakReference<FrameLayout> weakReference = viewPagerBottomSheetBehavior.LJIILJJIL;
        if (weakReference == null) {
            viewPagerBottomSheetBehavior.LJIIIIZZ = 4;
            return;
        }
        FrameLayout frameLayout = weakReference.get();
        if (frameLayout == null) {
            return;
        }
        ViewParent parent = frameLayout.getParent();
        if (parent != null && parent.isLayoutRequested() && C16330kX.LIZIZ(frameLayout)) {
            frameLayout.post(new ARunnableS17S0201000_14(viewPagerBottomSheetBehavior, frameLayout, 16));
        } else {
            viewPagerBottomSheetBehavior.LIZIZ(4, frameLayout);
        }
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.LJLJJI != z) {
            this.LJLJJI = z;
            ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.LJLJI;
            if (viewPagerBottomSheetBehavior != null) {
                viewPagerBottomSheetBehavior.LJI = z;
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.LJLJJI) {
            this.LJLJJI = true;
        }
        this.LJLJJL = z;
        this.LJLJJLL = true;
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(LJIJJ(view, 0, null));
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(LJIJJ(null, i, null));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC80574Vjm(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r3 = 1
            if (r6 != 0) goto L17
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2130969449(0x7f040369, float:1.754758E38)
            boolean r0 = r1.resolveAttribute(r0, r2, r3)
            if (r0 == 0) goto L29
            int r6 = r2.resourceId
        L17:
            r4.<init>(r5, r6)
            r4.LJLJJI = r3
            r4.LJLJJL = r3
            X.Vjl r0 = new X.Vjl
            r0.<init>(r4)
            r4.LJLJL = r0
            r4.LJIJI(r3)
            return
        L29:
            r6 = 2131886663(0x7f120247, float:1.9407911E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC80574Vjm.<init>(android.content.Context, int):void");
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJIJJ(view, 0, layoutParams));
    }

    public final View LJIJJ(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View inflate = View.inflate(getContext(), R.layout.akh, null);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.bv5);
        if (i != 0 && view == null) {
            view = C16880lQ.LLLLIILL(getLayoutInflater(), i, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.c8m);
        ViewPagerBottomSheetBehavior<FrameLayout> LIZ = ViewPagerBottomSheetBehavior.LIZ(viewGroup2);
        this.LJLJI = LIZ;
        LIZ.getClass();
        LIZ.LJIILLIIL = new WeakReference<>(this);
        ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.LJLJI;
        viewPagerBottomSheetBehavior.LJIIZILJ = this.LJLJL;
        viewPagerBottomSheetBehavior.LJI = this.LJLJJI;
        if (layoutParams == null) {
            viewGroup2.addView(view);
        } else {
            viewGroup2.addView(view, layoutParams);
        }
        C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 101), viewGroup.findViewById(R.id.liz));
        h0.LJIJI(viewGroup2, new IDaS471S0100000_14(this, 3));
        viewGroup2.setOnTouchListener(new IDTListenerS70S0000000_14(2));
        return inflate;
    }
}
