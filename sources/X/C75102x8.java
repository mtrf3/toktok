package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.SlimShortTouch;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$prepareToShow$4$1", f = "ECAudienceWidget.kt", l = {448}, m = "invokeSuspend")
/* renamed from: X.2x8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75102x8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Room LJLIL;
    public C71188Rwm LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ Room LJLJJI;
    public final /* synthetic */ C71188Rwm LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75102x8(Room room, C71188Rwm c71188Rwm, InterfaceC67352kd<? super C75102x8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = room;
        this.LJLJJL = c71188Rwm;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75102x8(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Room room;
        C71188Rwm c71188Rwm;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c71188Rwm = this.LJLILLLLZI;
                    room = this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                room = this.LJLJJI;
                c71188Rwm = this.LJLJJL;
                C74992wx c74992wx = EcMessageApi.LIZ;
                String valueOf = String.valueOf(room.getId());
                String valueOf2 = String.valueOf(room.getOwnerUserId());
                this.LJLIL = room;
                this.LJLILLLLZI = c71188Rwm;
                this.LJLJI = 1;
                obj = c74992wx.LIZ(valueOf, valueOf2, null, 0L, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            List<SlimShortTouch> list = (List) obj;
            if (list != null) {
                c71188Rwm.LJJI(room, list);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
