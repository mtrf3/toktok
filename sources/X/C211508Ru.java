package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.story.popup.PopupWeaver$assembleTasks$1", f = "PopupWeaver.kt", l = {134, 136}, m = "invokeSuspend")
/* renamed from: X.8Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211508Ru extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C211498Rt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C211508Ru(C211498Rt c211498Rt, InterfaceC67352kd<? super C211508Ru> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c211498Rt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C211508Ru(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            this.LJLIL = 1;
            if (C1JD.LIZJ(1000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (!C211498Rt.LJIIIIZZ.getValue().getBoolean("private_like_tip_shown", false)) {
            C211498Rt c211498Rt = this.LJLILLLLZI;
            final View findViewById = c211498Rt.LIZIZ.findViewById(R.id.c_t);
            o.LJIIIIZZ(findViewById, "root.digg_container");
            AbstractC211528Rw abstractC211528Rw = new AbstractC211528Rw(findViewById) { // from class: X.8S0
                public InterfaceC82683Wch LJLJJL;
                public final WeakReference<View> LJLJJLL;

                @Override // X.InterfaceC56321M8n
                public final int getPriority() {
                    return 7001;
                }

                @Override // X.AbstractC211528Rw
                public final void LJIIIIZZ() {
                    InterfaceC82683Wch interfaceC82683Wch = this.LJLJJL;
                    this.LJLJJL = null;
                    if (interfaceC82683Wch != null) {
                        interfaceC82683Wch.dismiss();
                    }
                }

                {
                    super("private_like");
                    this.LJLJJLL = new WeakReference<>(findViewById);
                }

                @Override // X.M72
                public final void LIZLLL(C54082LKk context, M78 wrapper) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(wrapper, "wrapper");
                    ActivityC45651qj LIZJ = context.LIZJ();
                    if (LIZJ == null) {
                        wrapper.LIZIZ();
                        return;
                    }
                    InterfaceC82683Wch interfaceC82683Wch = (InterfaceC82683Wch) C78966Uyw.LJJLI(this.LJLJJLL, new AqS134S0200000_3(LIZJ, wrapper, 242));
                    if (interfaceC82683Wch == null) {
                        wrapper.LIZIZ();
                    } else {
                        this.LJLJJL = interfaceC82683Wch;
                    }
                }
            };
            this.LJLIL = 2;
            if (c211498Rt.LJ(abstractC211528Rw, "private_like_tip_shown", this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }
}
