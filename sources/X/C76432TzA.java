package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TzA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76432TzA extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewOnClickListenerC76430Tz8 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        AnonymousClass064 anonymousClass064 = new AnonymousClass064();
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LJLIL.findViewById(R.id.bcl);
        anonymousClass064.LJII(constraintLayout);
        if (this.LJLILLLLZI) {
            anonymousClass064.LJIJJ(0.0f, this.LJLJI);
        } else {
            anonymousClass064.LJIJJ(1.0f, this.LJLJI);
        }
        anonymousClass064.LIZIZ(constraintLayout);
        this.LJLJJI.setAlpha(0.0f);
        this.LJLJJI.setVisibility(0);
    }

    public C76432TzA(ViewOnClickListenerC76430Tz8 viewOnClickListenerC76430Tz8, boolean z, int i, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLIL = viewOnClickListenerC76430Tz8;
        this.LJLILLLLZI = z;
        this.LJLJI = i;
        this.LJLJJI = view;
        this.LJLJJL = interfaceC65784Pro;
    }
}
