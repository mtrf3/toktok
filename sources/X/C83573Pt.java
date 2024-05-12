package X;

import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.UserSearchContentUpdateEngine$11", f = "UserSearchContentUpdateEngine.kt", l = {76}, m = "invokeSuspend")
/* renamed from: X.3Pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83573Pt extends AbstractC65782Prm implements InterfaceC88473Ynt<List<? extends C3QL>, C3QC, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public /* synthetic */ C3QC LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<String> LJLJJL;
    public final /* synthetic */ C3Q8 LJLJJLL;
    public final /* synthetic */ C98453th LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C83573Pt(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<String> interfaceC65784Pro, C3Q8 c3q8, C98453th c98453th, InterfaceC67352kd<? super C83573Pt> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = c3q8;
        this.LJLJL = c98453th;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
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
            List list = (List) this.LJLILLLLZI;
            C3QC c3qc = this.LJLJI;
            C3QE c3qe = C3QE.LIZ;
            AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(list, (List<String>) 770);
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLJJI;
            InterfaceC65784Pro<String> interfaceC65784Pro = this.LJLJJL;
            C3Q8 c3q8 = this.LJLJJLL;
            C98453th c98453th = this.LJLJL;
            this.LJLILLLLZI = null;
            this.LJLIL = 1;
            LIZ = c3qe.LIZ(0, aqS151S0100000_1, interfaceC88472Yns, interfaceC65784Pro, c3q8, c98453th, c3qc, new C3QJ(c3qe), new C81393Hj(c3qe), C3QE.LIZIZ, this);
            if (LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(List<? extends C3QL> list, C3QC c3qc, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C83573Pt c83573Pt = new C83573Pt(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c83573Pt.LJLILLLLZI = list;
        c83573Pt.LJLJI = c3qc;
        return c83573Pt.invokeSuspend(C76800UCe.LIZ);
    }
}
