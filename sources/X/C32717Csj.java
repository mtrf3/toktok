package X;

import android.animation.Animator;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Csj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32717Csj implements Animator.AnimatorListener {
    public final /* synthetic */ AbstractC32678Cs6 LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ ImageModel LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        long j;
        o.LJIIIZ(animation, "animation");
        C47061t0 c47061t0 = this.LJLIL.LJLJLJ;
        if (c47061t0 != null) {
            c47061t0.setAlpha(1.0f);
        }
        C47061t0 c47061t02 = this.LJLIL.LJLJLJ;
        if (c47061t02 != null) {
            c47061t02.setScaleX(1.0f);
        }
        C47061t0 c47061t03 = this.LJLIL.LJLJLJ;
        if (c47061t03 != null) {
            c47061t03.setScaleY(1.0f);
        }
        C47061t0 c47061t04 = this.LJLIL.LJLJLJ;
        if (c47061t04 != null) {
            c47061t04.setTranslationX(0.0f);
        }
        C47061t0 c47061t05 = this.LJLIL.LJLJLJ;
        if (c47061t05 != null) {
            ImageModel imageModel = this.LJLJI;
            int LIZJ = C30760C5k.LIZJ();
            C30760C5k.LIZ(LIZJ, LIZJ, imageModel, c47061t05);
        }
        C47061t0 c47061t06 = this.LJLIL.LJLJLJ;
        if (c47061t06 != null) {
            c47061t06.invalidate();
        }
        C47061t0 c47061t07 = this.LJLIL.LJLJL;
        if (c47061t07 != null) {
            c47061t07.setAlpha(0.0f);
        }
        C47061t0 c47061t08 = this.LJLIL.LJLJL;
        if (c47061t08 != null) {
            c47061t08.setTranslationX(this.LJLILLLLZI * 300.0f);
        }
        C47061t0 c47061t09 = this.LJLIL.LJLJL;
        if (c47061t09 != null) {
            c47061t09.invalidate();
        }
        AbstractC32678Cs6 abstractC32678Cs6 = this.LJLIL;
        InterfaceC32725Csr interfaceC32725Csr = abstractC32678Cs6.LJZI;
        if (interfaceC32725Csr != null) {
            AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = abstractC32678Cs6.LJZ;
            if (abstractC32698CsQ != null) {
                j = abstractC32698CsQ.LIZJ();
            } else {
                j = 0;
            }
            interfaceC32725Csr.LJIIJJI(j);
        }
    }

    public C32717Csj(AbstractC32678Cs6 abstractC32678Cs6, float f, ImageModel imageModel) {
        this.LJLIL = abstractC32678Cs6;
        this.LJLILLLLZI = f;
        this.LJLJI = imageModel;
    }
}
