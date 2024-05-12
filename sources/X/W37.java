package X;

import android.content.Context;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.experiment.ViewPagerSlideTransitionServiceImpl;
import dmt.viewpager.servie.ViewPagerSlideTransitionService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.progressbar.ViewPagerSwipeHintController$showSwipeHint$1", f = "ViewPagerSwipeHintController.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class W37 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ W36 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W37(W36 w36, InterfaceC67352kd<? super W37> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = w36;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new W37(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        W34 w34;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            W36 w36 = this.LJLILLLLZI;
            w36.LJLIL.LJFF(w36);
            W36 w362 = this.LJLILLLLZI;
            w362.getClass();
            C94A c94a = new Interpolator() { // from class: X.94A
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) (Math.pow(f - 1.0f, 5.0d) + 1.0f);
                }
            };
            ViewPagerSlideTransitionService LIZIZ = ViewPagerSlideTransitionServiceImpl.LIZIZ();
            if (LIZIZ != null && LIZIZ.isEnable()) {
                Context context = w362.LJLILLLLZI;
                Interpolator LIZ = LIZIZ.LIZ();
                o.LJIIIIZZ(LIZ, "transitionService.interpolator");
                w34 = new W34(context, LIZ);
            } else {
                w34 = new W34(w362.LJLILLLLZI, c94a);
            }
            w362.LJLJJI = w34;
            w362.LJLIL.setScroller(w34);
            W36 w363 = this.LJLILLLLZI;
            this.LJLIL = 1;
            if (w363.LIZ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
