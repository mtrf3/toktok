package X;

import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.preloader.ImageLogReporter$loadInner$1", f = "ImageLogReporter.kt", l = {82}, m = "invokeSuspend")
/* renamed from: X.As6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27582As6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C27583As7 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27582As6(C27583As7 c27583As7, InterfaceC67352kd<? super C27582As6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c27583As7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27582As6(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
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
            List<String> list = this.LJLILLLLZI.LJ;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        str2 = it.next();
                        if (C72440Sbs.LIZIZ(str2)) {
                            break;
                        }
                    } else {
                        str2 = null;
                        break;
                    }
                }
                str = str2;
            } else {
                str = null;
            }
            boolean LJJJIL = C78857UxB.LJJJIL(str);
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C27581As5 c27581As5 = new C27581As5(this.LJLILLLLZI, LJJJIL, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c27581As5, this) == enumC58928NAu) {
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
