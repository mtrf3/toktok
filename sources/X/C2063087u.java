package X;

import Y.IDfS127S0100000_3;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM$onPrepared$1", f = "VideoFavoriteVM.kt", l = {602}, m = "invokeSuspend")
/* renamed from: X.87u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2063087u extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoFavoriteVM LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2063087u(VideoFavoriteVM videoFavoriteVM, InterfaceC67352kd<? super C2063087u> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoFavoriteVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2063087u(this.LJLILLLLZI, interfaceC67352kd);
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
            C79883Bo LIZ = ((AnonymousClass884) this.LJLILLLLZI.LJLLLL.getValue()).LIZ();
            IDfS127S0100000_3 iDfS127S0100000_3 = new IDfS127S0100000_3(this.LJLILLLLZI, 2);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS127S0100000_3, this) == enumC58928NAu) {
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
