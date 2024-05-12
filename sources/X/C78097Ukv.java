package X;

import android.animation.Animator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ukv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78097Ukv implements Animator.AnimatorListener {
    public final EnumC78092Ukq LJLIL;
    public InterfaceC78107Ul5 LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        InterfaceC78107Ul5 interfaceC78107Ul5 = this.LJLILLLLZI;
        if (interfaceC78107Ul5 == null) {
            return;
        }
        int i = C78096Uku.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        }
                        interfaceC78107Ul5.LIZJ();
                        this.LJLILLLLZI = null;
                        return;
                    }
                    interfaceC78107Ul5.LJFF();
                    return;
                }
                interfaceC78107Ul5.LJI();
                return;
            }
            interfaceC78107Ul5.LIZIZ();
            return;
        }
        interfaceC78107Ul5.LIZLLL();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
        InterfaceC78107Ul5 interfaceC78107Ul5 = this.LJLILLLLZI;
        if (interfaceC78107Ul5 != null && this.LJLIL == EnumC78092Ukq.ENTRY) {
            interfaceC78107Ul5.LIZ();
        }
    }

    public C78097Ukv(EnumC78092Ukq type, InterfaceC78107Ul5 interfaceC78107Ul5) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = interfaceC78107Ul5;
    }
}
