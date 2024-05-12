package X;

import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.IMUserPortraitManager$trackUserPortrait$1", f = "IMUserPortraitManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.30D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30D extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ java.util.Map<String, String> LJLIL;
    public final /* synthetic */ InterfaceC75532xp LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30D(java.util.Map<String, String> map, InterfaceC75532xp interfaceC75532xp, InterfaceC67352kd<? super C30D> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = map;
        this.LJLILLLLZI = interfaceC75532xp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C30D(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        java.util.Map<String, String> map = this.LJLIL;
        User LIZJ = C80763Ey.LIZJ();
        if (LIZJ != null) {
            num = new Integer(LIZJ.getFriendCount());
        } else {
            num = null;
        }
        map.put("local_friends_count", String.valueOf(num));
        C100483wy.LIZ.putAll(this.LJLIL);
        this.LJLILLLLZI.LIZIZ("user_portrait_delay", this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
