package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.Yd0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87798Yd0 extends C87797Ycz {
    public final /* synthetic */ InterfaceC87791Yct LJLIL;
    public final /* synthetic */ AbstractC87817YdJ LJLILLLLZI;

    @Override // X.C87797Ycz, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC87791Yct interfaceC87791Yct = this.LJLIL;
        if (interfaceC87791Yct != null) {
            interfaceC87791Yct.LIZ();
        }
        this.LJLILLLLZI.LIZ();
    }

    public C87798Yd0(InterfaceC87791Yct interfaceC87791Yct, int i, AbstractC87817YdJ abstractC87817YdJ) {
        this.LJLIL = interfaceC87791Yct;
        this.LJLILLLLZI = abstractC87817YdJ;
    }
}
