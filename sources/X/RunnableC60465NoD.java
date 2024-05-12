package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NoD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC60465NoD implements Runnable {
    public final /* synthetic */ C60466NoE LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ android.net.Uri LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C73305Spp LJLJJL;

    public RunnableC60465NoD(C60466NoE c60466NoE, ActivityC45651qj activityC45651qj, android.net.Uri uri, boolean z, C73305Spp c73305Spp) {
        this.LJLIL = c60466NoE;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = uri;
        this.LJLJJI = z;
        this.LJLJJL = c73305Spp;
    }

    public final void LIZ() {
        String queryParameter;
        Window window;
        this.LJLIL.getBulletContainerView().LIZLLL(BulletService.LIZ().LJIILIIL());
        this.LJLIL.getBulletContainerView().setActivityWrapper(this.LJLIL.getActivityWrapper());
        NVG.LIZIZ(this.LJLIL.getBulletContainerView(), BulletService.LIZ().LJIIJJI(this.LJLILLLLZI));
        NVG.LIZ(this.LJLIL.getBulletContainerView(), this.LJLJI, null, new C60467NoF(this.LJLIL, this.LJLJJL, this.LJLILLLLZI), 2);
        final C60466NoE c60466NoE = this.LJLIL;
        android.net.Uri uri = this.LJLJI;
        boolean z = this.LJLJJI;
        c60466NoE.getClass();
        String queryParameter2 = UriProtector.getQueryParameter(uri, "url");
        if (queryParameter2 == null || (queryParameter = UriProtector.getQueryParameter(UriProtector.parse(queryParameter2), "soft_input_adjust")) == null || queryParameter.length() == 0) {
            return;
        }
        BottomSheetDialogFragment bottomSheetDialogFragment = c60466NoE.LJLJJLL;
        if (bottomSheetDialogFragment != null) {
            Dialog dialog = bottomSheetDialogFragment.getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            final View findViewById = c60466NoE.getBulletContainerView().getRootView().findViewById(R.id.bs8);
            View findViewById2 = c60466NoE.getBulletContainerView().getRootView().findViewById(R.id.bv5);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            window.setSoftInputMode(36);
            c60466NoE.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.7Fq
                public boolean LJLIL;
                public int LJLILLLLZI;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Rect rect = new Rect();
                    findViewById.getWindowVisibleDisplayFrame(rect);
                    int height = findViewById.getHeight() - rect.bottom;
                    if (height > 0) {
                        if (!this.LJLIL) {
                            this.LJLILLLLZI = c60466NoE.getHeight();
                            this.LJLIL = true;
                        }
                        int height2 = findViewById.getHeight() - height;
                        int i = this.LJLILLLLZI;
                        if (height2 <= i) {
                            int height3 = findViewById.getHeight() - height;
                            Context context = c60466NoE.getContext();
                            o.LJIIIIZZ(context, "context");
                            i = height3 - C63081OpJ.LJJJJLI(context);
                        }
                        C60466NoE c60466NoE2 = c60466NoE;
                        if (c60466NoE2.getLayoutParams().height != i) {
                            c60466NoE2.getLayoutParams().height = i;
                            c60466NoE2.requestLayout();
                            return;
                        }
                        return;
                    }
                    if (!this.LJLIL) {
                        return;
                    }
                    this.LJLIL = false;
                    if (c60466NoE.getLayoutParams().height == this.LJLILLLLZI) {
                        return;
                    }
                    c60466NoE.getLayoutParams().height = this.LJLILLLLZI;
                    c60466NoE.requestLayout();
                }
            });
            return;
        }
        c60466NoE.getActivity().getWindow().setSoftInputMode(36);
        c60466NoE.getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC60470NoI(c60466NoE, z, c60466NoE));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
