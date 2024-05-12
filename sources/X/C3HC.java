package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.SharePanelContactsPreloadManager$recentLoader$1$4", f = "SharePanelContactsPreloadManager.kt", l = {136}, m = "invokeSuspend")
/* renamed from: X.3HC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HC extends AbstractC65782Prm implements InterfaceC88471Ynr<List<? extends IMContact>, InterfaceC67352kd<? super List<? extends IMContact>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;

    public C3HC(InterfaceC67352kd<? super C3HC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3HC c3hc = new C3HC(interfaceC67352kd);
        c3hc.LJLILLLLZI = obj;
        return c3hc;
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
            List<? extends IMContact> list = (List) this.LJLILLLLZI;
            C3R9 parameters = C82563Lw.LJLJJLL;
            o.LJIIIZ(parameters, "parameters");
            C3H8 c3h8 = new C3H8(parameters);
            this.LJLIL = 1;
            obj = c3h8.LJIILL(list, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<? extends IMContact> list, InterfaceC67352kd<? super List<? extends IMContact>> interfaceC67352kd) {
        return ((a) create(list, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
