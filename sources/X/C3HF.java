package X;

import fjb.a;
import java.util.Comparator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.BaseRelationModel$recentLoader$1$2", f = "BaseRelationModel.kt", l = {53}, m = "invokeSuspend")
/* renamed from: X.3HF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HF extends AbstractC65782Prm implements InterfaceC88471Ynr<List<? extends C3L4>, InterfaceC67352kd<? super List<? extends C3L4>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C3HH LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3HF(C3HH c3hh, InterfaceC67352kd<? super C3HF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c3hh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3HF c3hf = new C3HF(this.LJLJI, interfaceC67352kd);
        c3hf.LJLILLLLZI = obj;
        return c3hf;
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
            Iterable iterable = (Iterable) this.LJLILLLLZI;
            C3HH c3hh = this.LJLJI;
            this.LJLIL = 1;
            c3hh.getClass();
            obj = ORZ.LLILII(new Comparator() { // from class: X.3HG
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return C66851QLn.LJFF(Long.valueOf(((C3L4) obj3).LJLJLJ), Long.valueOf(((C3L4) obj2).LJLJLJ));
                }
            }, iterable);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(List<? extends C3L4> list, InterfaceC67352kd<? super List<? extends C3L4>> interfaceC67352kd) {
        return ((a) create(list, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
