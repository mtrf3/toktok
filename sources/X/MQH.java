package X;

import Y.ALAdapterS2S0110000_9;
import Y.AObserverS77S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MQH extends C56766MPq {
    public final C5H3 LJLILLLLZI = V1B.LJZI(new AqS159S0100000_9(this, 962));
    public final C5H3 LJLJI = V1B.LJZI(new AqS159S0100000_9(this, 964));
    public final C5H3 LJLJJI = V1B.LJZI(new AqS159S0100000_9(this, 959));
    public final C5H3 LJLJJL = V1B.LJZI(new AqS159S0100000_9(this, 960));
    public final C5H3 LJLJJLL = V1B.LJZI(new AqS159S0100000_9(this, 963));
    public Animator LJLJL;
    public C73306Spq LJLJLJ;
    public C73306Spq LJLJLLL;

    public final C73305Spp LJIILIIL() {
        return (C73305Spp) this.LJLJJI.getValue();
    }

    public final C73305Spp LJIILJJIL() {
        return (C73305Spp) this.LJLJJLL.getValue();
    }

    public final void LJIIL(boolean z) {
        int i;
        int i2;
        Animator animator = this.LJLJL;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        if (z) {
            i = -((Number) this.LJLILLLLZI.getValue()).intValue();
            i2 = 0;
        } else {
            i = 0;
            i2 = -((Number) this.LJLILLLLZI.getValue()).intValue();
        }
        ValueAnimator ofInt = ObjectAnimator.ofInt(i, i2);
        C73305Spp LJIILJJIL = LJIILJJIL();
        ViewGroup.LayoutParams layoutParams = LJIILJJIL.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i;
        LJIILJJIL.setLayoutParams(marginLayoutParams);
        ofInt.addUpdateListener(new AUListenerS97S0100000_9(this, 55));
        ofInt.addListener(new ALAdapterS2S0110000_9(this, z, 4));
        ofInt.setDuration(200L);
        ofInt.start();
        this.LJLJL = ofInt;
    }

    @Override // X.C56766MPq
    public final void LJIIIZ(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        LJIILL(R.string.iw5, R.string.iwg, Integer.valueOf(R.raw.icon_large_inbox));
        ((LiveData) ((BaseNotificationVM) this.LJLJI.getValue()).LJLJJI.getValue()).observe(LIZ(), new AObserverS77S0100000_9(this, 97));
    }

    public final void LJIILL(int i, int i2, Integer num) {
        C73306Spq c73306Spq = new C73306Spq();
        String string = LIZ().getString(i);
        o.LJIIIIZZ(string, "fragment.getString(titleId)");
        c73306Spq.LJFF = string;
        String string2 = LIZ().getString(i2);
        o.LJIIIIZZ(string2, "fragment.getString(descId)");
        c73306Spq.LJI = string2;
        this.LJLJLJ = c73306Spq;
        if (num != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = num.intValue();
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            c73306Spq.LIZ(c2068389v);
        }
        if (i == R.string.r_ && QnaService.LIZ().enablePublicQna()) {
            C73306Spq c73306Spq2 = this.LJLJLJ;
            o.LJI(c73306Spq2);
            c73306Spq2.LJII = new AqS175S0100000_9(this, 564);
        }
        if (C1DH.LJIJJLI()) {
            C73306Spq c73306Spq3 = new C73306Spq();
            String string3 = LIZ().getString(R.string.hn6);
            o.LJIIIIZZ(string3, "fragment.getString(R.str…notification_description)");
            c73306Spq3.LJFF = string3;
            this.LJLJLJ = c73306Spq3;
        }
        C73306Spq c73306Spq4 = new C73306Spq();
        C73312Spw.LJI(c73306Spq4, new AqS159S0100000_9(this, 961));
        this.LJLJLLL = c73306Spq4;
    }
}
