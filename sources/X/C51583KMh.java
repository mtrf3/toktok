package X;

import Y.ACListenerS28S0100000_8;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import defpackage.a1;

/* renamed from: X.KMh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51583KMh extends KMZ {
    public final C51584KMi LLIIJI;

    @Override // X.KMZ, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.KMZ, X.AbstractC79989VaL
    public final void LIZJ() {
        Activity LIZLLL;
        Window window;
        C51584KMi c51584KMi = this.LLIIJI;
        C47689Ind mTextureView = getMTextureView();
        if (c51584KMi.LIZIZ) {
            return;
        }
        c51584KMi.LIZIZ = true;
        c51584KMi.LIZ = mTextureView;
        c51584KMi.LIZJ.setFocusableInTouchMode(true);
        c51584KMi.LIZJ.requestFocus();
        Activity LJIJJ = C45804HyK.LJIJJ(c51584KMi.LIZLLL);
        C51584KMi.LJ(LJIJJ, false);
        Activity LIZLLL2 = C51584KMi.LIZLLL(LJIJJ);
        ViewGroup viewGroup = null;
        if (LIZLLL2 != null && (window = LIZLLL2.getWindow()) != null) {
            window.setFlags(1024, 1024);
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setSystemUiVisibility(5894);
            }
        }
        try {
            if (C51584KMi.LIZ(LJIJJ) && (LIZLLL = C51584KMi.LIZLLL(LJIJJ)) != null) {
                LIZLLL.setRequestedOrientation(0);
            }
            C16880lQ.LJLLL(c51584KMi.LIZ, c51584KMi.LJ);
            Activity LIZLLL3 = C51584KMi.LIZLLL(c51584KMi.LIZLLL);
            if (LIZLLL3 != null) {
                viewGroup = (ViewGroup) LIZLLL3.findViewById(R.id.content);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (viewGroup != null) {
                viewGroup.addView(c51584KMi.LIZJ, layoutParams);
            }
            c51584KMi.LIZJ.addView(c51584KMi.LIZ, new FrameLayout.LayoutParams(-1, -1));
            c51584KMi.LIZJ.setBackgroundColor(-16777216);
            C16880lQ.LLLZIIL(com.zhiliaoapp.musically.R.layout.ajo, C16880lQ.LLZIL(LJIJJ), c51584KMi.LIZJ);
            ImageView imageView = (ImageView) LJIJJ.findViewById(com.zhiliaoapp.musically.R.id.auv);
            if (imageView == null) {
                return;
            }
            C16880lQ.LJIILLIIL(imageView, new ACListenerS28S0100000_8(c51584KMi, 107));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // X.KMZ, X.AbstractC79989VaL
    public final void LIZLLL() {
        this.LLIIJI.LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51583KMh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LLIIJI = new C51584KMi(context, this);
    }
}
