package X;

import Y.AUListenerS95S0100000_7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.I4z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46037I4z implements InterfaceC82871Wfj {
    public final /* synthetic */ C46036I4y LIZ;

    @Override // X.InterfaceC82871Wfj
    public final void LIZ() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        C46036I4y c46036I4y = this.LIZ;
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new AUListenerS95S0100000_7(c46036I4y, 2));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LIZ.LJLJLLL;
        if (cutVideoBottomBarViewModel != null) {
            ((LiveData) cutVideoBottomBarViewModel.LJLJL.getValue()).setValue(Boolean.TRUE);
            FrameLayout frameLayout = this.LIZ.LJLJJL;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                ofFloat.start();
                return;
            } else {
                o.LJIJI("selfAdaptionToastLayout");
                throw null;
            }
        }
        o.LJIJI("bottomBarViewModel");
        throw null;
    }

    public C46037I4z(C46036I4y c46036I4y) {
        this.LIZ = c46036I4y;
    }

    @Override // X.InterfaceC82871Wfj
    public final void LIZIZ(float f) {
        LIZJ(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C46036I4y c46036I4y = this.LIZ;
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new AUListenerS95S0100000_7(c46036I4y, 3));
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.LIZ.LJLJLLL;
        if (cutVideoBottomBarViewModel != null) {
            ((LiveData) cutVideoBottomBarViewModel.LJLJL.getValue()).setValue(Boolean.FALSE);
            FrameLayout frameLayout = this.LIZ.LJLJJL;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                ofFloat.start();
                return;
            } else {
                o.LJIJI("selfAdaptionToastLayout");
                throw null;
            }
        }
        o.LJIJI("bottomBarViewModel");
        throw null;
    }

    @Override // X.InterfaceC82871Wfj
    public final void LIZJ(float f) {
        C46036I4y c46036I4y = this.LIZ;
        TextView textView = c46036I4y.LJLJJI;
        if (textView != null) {
            Activity requireActivity = c46036I4y.requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            textView.setText(C44689HgL.LIZIZ(requireActivity, f, this.LIZ.LLJILJILJ().LIZIZ()));
            return;
        }
        o.LJIJI("selfAdaptionToast");
        throw null;
    }
}
