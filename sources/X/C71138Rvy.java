package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.common.room.PreviewBagHelper$previewBag$2$1$1", f = "PreviewBagHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rvy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71138Rvy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Room LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71138Rvy(Room room, InterfaceC67352kd<? super C71138Rvy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = room;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71138Rvy(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C71144Rw4.LIZ(String.valueOf(this.LJLIL.getId()), null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
