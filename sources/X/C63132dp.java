package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.scheduler.story.DefaultStoryGroupTaskPublisher$startPublish$publishJob$1$defferTaskList$1$1$1$1", f = "DefaultStoryGroupTaskPublisher.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63132dp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ java.util.Map<String, String> LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63132dp(java.util.Map<String, String> map, List<String> list, InterfaceC67352kd<? super C63132dp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = map;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63132dp(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        java.util.Set<String> keySet = this.LJLIL.keySet();
        List<String> list = this.LJLILLLLZI;
        for (String str : keySet) {
            if (list.contains(str)) {
                C44687HgJ.LJIILJJIL(str);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
