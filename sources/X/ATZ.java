package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATZ extends OOS {
    public View LJLJLLL;
    public TuxIconView LJLL;
    public NZQ LJLLI;
    public BottomSheetBehavior<View> LJLLILLLL;
    public final ACListenerS24S0100000_4 LJLLJ;

    @Override // X.OOS, android.app.Dialog
    public final void onStart() {
        super.onStart();
        int LJJIIZ = O6R.LJJIIZ(KL2.LJIIIZ(getContext()) * 0.9f);
        View findViewById = findViewById(R.id.c8m);
        if (findViewById != null) {
            findViewById.setBackground(null);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = LJJIIZ;
            }
        }
        setOnShowListener(new DialogInterfaceOnShowListenerC26278ATa(this, findViewById, LJJIIZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ATZ(Context context) {
        super(context, R.style.a6_);
        o.LJIIIZ(context, "context");
        this.LJLLJ = new ACListenerS24S0100000_4(this, 245);
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
            }
        } catch (Exception e) {
            C36922EeM.LJ(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.adz);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(0);
        }
        this.LJLJLLL = findViewById(R.id.hht);
        this.LJLL = (TuxIconView) findViewById(R.id.eb1);
        this.LJLLI = (NZQ) findViewById(R.id.c01);
        TuxIconView tuxIconView = this.LJLL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, this.LJLLJ);
        }
        NZQ nzq = this.LJLLI;
        ViewGroup.LayoutParams layoutParams = null;
        if (nzq != null) {
            NZQ.LJIJI(nzq, "https://www.tiktok.com/legal/privacy-policy-row", false, null, 14);
        }
        View view = this.LJLJLLL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            layoutParams = layoutParams2;
        }
        view.setLayoutParams(layoutParams);
    }
}
