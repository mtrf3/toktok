package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* loaded from: classes11.dex */
public class OOS extends C18Z {
    public BottomSheetBehavior<FrameLayout> LJLJI;
    public FrameLayout LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final OOV LJLJLJ;

    private void LJIJJ() {
        if (this.LJLJJI == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.ak4, null);
            this.LJLJJI = frameLayout;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout.findViewById(R.id.c8m));
            this.LJLJI = from;
            from.addBottomSheetCallback(this.LJLJLJ);
            this.LJLJI.setHideable(this.LJLJJL);
        }
    }

    public final BottomSheetBehavior<FrameLayout> LJIJJLI() {
        if (this.LJLJI == null) {
            LJIJJ();
        }
        return this.LJLJI;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        LJIJJLI();
        super.cancel();
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLJI;
        if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 5) {
            this.LJLJI.setState(4);
        }
    }

    @Override // X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
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
        if (this.LJLJJL != z) {
            this.LJLJJL = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.LJLJI;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.LJLJJL) {
            this.LJLJJL = true;
        }
        this.LJLJJLL = z;
        this.LJLJL = true;
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
    public OOS(android.content.Context r5, int r6) {
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
            r4.LJLJJL = r3
            r4.LJLJJLL = r3
            X.OOV r0 = new X.OOV
            r0.<init>(r4)
            r4.LJLJLJ = r0
            r4.LJIJI(r3)
            return
        L29:
            r6 = 2131886663(0x7f120247, float:1.9407911E38)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OOS.<init>(android.content.Context, int):void");
    }

    @Override // X.C18Z, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(LJIL(view, 0, layoutParams));
    }

    private View LJIL(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LJIJJ();
        ViewGroup viewGroup = (ViewGroup) this.LJLJJI.findViewById(R.id.bv5);
        if (i != 0 && view == null) {
            view = C16880lQ.LLLLIILL(getLayoutInflater(), i, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.LJLJJI.findViewById(R.id.c8m);
        viewGroup2.removeAllViews();
        if (layoutParams == null) {
            viewGroup2.addView(view);
        } else {
            viewGroup2.addView(view, layoutParams);
        }
        C16880lQ.LJIIJ(new OOT(this), viewGroup.findViewById(R.id.liz));
        h0.LJIJI(viewGroup2, new OOR(this));
        viewGroup2.setOnTouchListener(new OOW());
        return this.LJLJJI;
    }
}
