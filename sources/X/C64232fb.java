package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.model.ShareStateResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper.RelationModelFilterHelper$fetchShareState$2$1", f = "RelationModelFilterHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64232fb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<ShareStateResponse, C76800UCe> LJLIL;
    public final /* synthetic */ ShareStateResponse LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C64232fb(InterfaceC88472Yns<? super ShareStateResponse, C76800UCe> interfaceC88472Yns, ShareStateResponse shareStateResponse, InterfaceC67352kd<? super C64232fb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = shareStateResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64232fb(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
