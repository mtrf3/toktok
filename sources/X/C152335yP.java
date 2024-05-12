package X;

import Y.ALAdapterS1S0100000_2;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.5yP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152335yP implements InterfaceC1290554r {
    public final Fragment LIZ;
    public final View LIZIZ;
    public final View LIZJ;

    @Override // X.InterfaceC1290554r
    public final void LIZ() {
        ViewPropertyAnimator alpha = this.LIZJ.animate().alpha(1.0f);
        alpha.setDuration(200L);
        alpha.setListener(new ALAdapterS1S0100000_2(this, 35));
        alpha.start();
    }

    @Override // X.InterfaceC1290554r
    public final void LIZIZ() {
        ViewPropertyAnimator alpha = this.LIZJ.animate().alpha(0.0f);
        alpha.setDuration(200L);
        alpha.setListener(new ALAdapterS1S0100000_2(this, 34)).start();
    }

    @Override // X.InterfaceC1290554r
    public final void LIZJ() {
        this.LIZIZ.setAlpha(0.0f);
        ViewPropertyAnimator alpha = this.LIZIZ.animate().alpha(1.0f);
        alpha.setDuration(200L);
        alpha.start();
    }

    @Override // X.InterfaceC1290554r
    public final void LIZLLL() {
        ViewPropertyAnimator alpha = this.LIZIZ.animate().alpha(0.0f);
        alpha.setDuration(200L);
        alpha.setListener(new ALAdapterS1S0100000_2(this, 33));
        alpha.start();
    }

    public C152335yP(AudioRecordFragment fragment, ConstraintLayout constraintLayout, TuxTextView tuxTextView) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ = fragment;
        this.LIZIZ = constraintLayout;
        this.LIZJ = tuxTextView;
    }
}
