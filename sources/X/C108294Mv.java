package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.ies.im.core.client.FilteredListModelImpl$mergeAndNotify$1$1", f = "FilteredListModelImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4Mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108294Mv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C108274Mt LJLIL;
    public final /* synthetic */ List<C63120Opw> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C108294Mv(C108274Mt c108274Mt, List<? extends C63120Opw> list, InterfaceC67352kd<? super C108294Mv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c108274Mt;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C108294Mv(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        C108274Mt c108274Mt = this.LJLIL;
        C4W6 c4w6 = c108274Mt.LJLILLLLZI;
        if (c4w6 != null) {
            List<C63120Opw> list = this.LJLILLLLZI;
            if (c108274Mt.LJLJLLL || c108274Mt.LJLLL) {
                z = true;
            } else {
                z = false;
            }
            c4w6.kc(list, z);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
