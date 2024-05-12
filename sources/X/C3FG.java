package X;

import android.animation.ValueAnimator;
import fjb.a;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedstickers.ui.SuggestedStickerBanner$show$1", f = "SuggestedStickerBanner.kt", l = {346}, m = "invokeSuspend")
/* renamed from: X.3FG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC71762rk<C3FJ> LJLILLLLZI;
    public final /* synthetic */ C3WX LJLJI;
    public final /* synthetic */ C99033ud LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ C73122tw LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3FG(InterfaceC71762rk<? extends C3FJ> interfaceC71762rk, C3WX c3wx, C99033ud c99033ud, String str, C73122tw c73122tw, InterfaceC67352kd<? super C3FG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC71762rk;
        this.LJLJI = c3wx;
        this.LJLJJI = c99033ud;
        this.LJLJJL = str;
        this.LJLJJLL = c73122tw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3FG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC71762rk<C3FJ> interfaceC71762rk = this.LJLILLLLZI;
            final C3WX c3wx = this.LJLJI;
            final C99033ud c99033ud = this.LJLJJI;
            final String str = this.LJLJJL;
            final C73122tw c73122tw = this.LJLJJLL;
            InterfaceC64672gJ<C3FJ> interfaceC64672gJ = new InterfaceC64672gJ<C3FJ>() { // from class: X.3FH
                @Override // X.InterfaceC64672gJ
                public final Object emit(C3FJ c3fj, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    int i2 = C3FI.LIZ[c3fj.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                C3WX c3wx2 = C3WX.this;
                                if (c3wx2.getVisibility() == 0) {
                                    AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(c3wx2, 894);
                                    ValueAnimator valueAnimator = c3wx2.LJLLILLLL;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    c3wx2.LJLLILLLL = c3wx2.LIZ(c3wx2.getHeight(), 0.0f, new AqS151S0100000_1((InterfaceC65784Pro) aqS151S0100000_1, 895));
                                    c3wx2.LJLJJLL = null;
                                    XKQ xkq = c3wx2.LJLJJI;
                                    if (xkq != null) {
                                        xkq.LIZIZ(null);
                                    }
                                    XKQ xkq2 = c3wx2.LJLJJL;
                                    if (xkq2 != null) {
                                        xkq2.LIZIZ(null);
                                    }
                                    c3wx2.LJLILLLLZI = C3FE.LIZ;
                                }
                            }
                        } else {
                            C3WX c3wx3 = C3WX.this;
                            ValueAnimator valueAnimator2 = c3wx3.LJLLILLLL;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            c3wx3.LJLLILLLL = c3wx3.LIZ(c3wx3.getHeight(), 0.0f, new AqS151S0100000_1((InterfaceC65784Pro) null, 895));
                        }
                    } else if (o.LJ(C3WX.this.LJLILLLLZI, C3FE.LIZ)) {
                        XKQ xkq3 = C3WX.this.LJLJJI;
                        if (xkq3 == null || !xkq3.isActive()) {
                            C3WX.this.LIZIZ(c99033ud, str, c73122tw);
                        }
                    } else {
                        C3WX c3wx4 = C3WX.this;
                        ValueAnimator valueAnimator3 = c3wx4.LJLLILLLL;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                        }
                        c3wx4.LJLLILLLL = c3wx4.LIZ(0.0f, C3WX.LJLLJ, null);
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (interfaceC71762rk.collect(interfaceC64672gJ, this) == enumC58928NAu) {
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
