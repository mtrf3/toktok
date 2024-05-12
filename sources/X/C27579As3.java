package X;

import com.bytedance.mt.protector.impl.UriProtector;
import fjb.a;
import java.io.File;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.preloader.ImageLogReporter$onComplete$3", f = "ImageLogReporter.kt", l = {143}, m = "invokeSuspend")
/* renamed from: X.As3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27579As3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C27583As7 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27579As3(C27583As7 c27583As7, InterfaceC67352kd<? super C27579As3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c27583As7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27579As3(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
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
            C72242sW c72242sW = new C72242sW();
            List<String> list = this.LJLILLLLZI.LJ;
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        File LIZLLL = W5U.LIZJ().LIZLLL(UriProtector.parse(it.next()));
                        if (LIZLLL != null) {
                            j = LIZLLL.length();
                        } else {
                            j = 0;
                        }
                        c72242sW.element = j;
                    } catch (Throwable unused) {
                    }
                    if (c72242sW.element > 0) {
                        break;
                    }
                }
            }
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C27580As4 c27580As4 = new C27580As4(this.LJLILLLLZI, c72242sW, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c27580As4, this) == enumC58928NAu) {
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
