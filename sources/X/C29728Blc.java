package X;

import Y.ALAdapterS4S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Blc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29728Blc extends C78983UzD {
    public final /* synthetic */ C29727Blb LJZL;

    public C29728Blc(C29727Blb c29727Blb) {
        this.LJZL = c29727Blb;
    }

    @Override // X.C78983UzD, X.InterfaceC81841WAb
    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
        C29727Blb c29727Blb = this.LJZL;
        if (c29727Blb.LIZIZ == null || c29727Blb.LJIIL != EnumC29732Blg.FOLLOW_ANIM) {
            return;
        }
        ValueAnimator valueAnimator = c29727Blb.LJJIJIIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(c29727Blb.LJIL.getResources().getColor(R.color.a09), -1);
        c29727Blb.LJJIJIIJIL = ofInt;
        ofInt.setEvaluator(new ArgbEvaluator());
        c29727Blb.LJJIJIIJIL.setDuration(300L);
        c29727Blb.LJJIJIIJIL.addUpdateListener(new AUListenerS94S0100000_5(c29727Blb, 3));
        c29727Blb.LJJIJIIJIL.addListener(new ALAdapterS4S0100000_5(c29727Blb, 12));
        c29727Blb.LJJIJIIJIL.start();
    }
}
