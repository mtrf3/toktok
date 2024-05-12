package X;

import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.friendstab.cache.FriendsFeedRespCacheManager$insertFriendsFeed$1", f = "FriendsFeedRespCacheManager.kt", l = {C61447O9r.LJIIJ}, m = "invokeSuspend")
/* renamed from: X.LVu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54378LVu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ FriendsFeedResponse LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54378LVu(int i, int i2, FriendsFeedResponse friendsFeedResponse, InterfaceC67352kd<? super C54378LVu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = friendsFeedResponse;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54378LVu(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            XI8 xi8 = C54383LVz.LIZJ;
            C54380LVw c54380LVw = new C54380LVw(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xi8, c54380LVw, this) == enumC58928NAu) {
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
