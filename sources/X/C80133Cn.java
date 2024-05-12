package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.SessionListDataSource$SessionPageValue$onQueryResult$2$deps$userMap$1", f = "SessionListDataSource.kt", l = {456}, m = "invokeSuspend")
/* renamed from: X.3Cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80133Cn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends IMUser>>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3JS LJLILLLLZI;
    public final /* synthetic */ List<C63120Opw> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C80133Cn(C3JS c3js, List<? extends C63120Opw> list, InterfaceC67352kd<? super C80133Cn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3js;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80133Cn(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C3JS c3js = this.LJLILLLLZI;
            List<C63120Opw> list = this.LJLJI;
            this.LJLIL = 1;
            c3js.getClass();
            if (list == null) {
                obj = C61878OQg.INSTANCE;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<C63120Opw> it = list.iterator();
                while (it.hasNext()) {
                    OSZ LIZ = C3JS.LIZ(it.next());
                    if (LIZ != null) {
                        arrayList.add(LIZ);
                    }
                }
                obj = C80533Eb.LJIILJJIL(C80533Eb.LIZ, arrayList, null, false, this, 2);
            }
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends IMUser>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
