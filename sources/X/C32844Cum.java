package X;

import com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.guide.LiveGiftGuideWidgetV2$onGuideSend$1", f = "LiveGiftGuideWidgetV2.kt", l = {339}, m = "invokeSuspend")
/* renamed from: X.Cum, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32844Cum extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Gift LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;
    public final /* synthetic */ C32822CuQ LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ LiveGiftGuideWidgetV2 LJLJJLL;
    public final /* synthetic */ GiftGuideMessage LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32844Cum(Gift gift, Room room, C32822CuQ c32822CuQ, String str, LiveGiftGuideWidgetV2 liveGiftGuideWidgetV2, GiftGuideMessage giftGuideMessage, InterfaceC67352kd<? super C32844Cum> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gift;
        this.LJLJI = room;
        this.LJLJJI = c32822CuQ;
        this.LJLJJL = str;
        this.LJLJJLL = liveGiftGuideWidgetV2;
        this.LJLJL = giftGuideMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32844Cum(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XLM LIZ;
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
            UVW uvw = UVW.LJI;
            Gift gift = this.LJLILLLLZI;
            Room room = this.LJLJI;
            LIZ = uvw.LIZ(new C32843Cul(gift, room, this.LJLJJI, this.LJLJJL, V16.LJIIJ(room, this.LJLJJLL.dataChannel), C76825UDd.LIZJ(this.LJLILLLLZI), this.LJLJL.hasSent), null, null, null, null, null);
            C32845Cun c32845Cun = new C32845Cun(this.LJLJJLL, null);
            this.LJLIL = 1;
            if (V1M.LJIIIIZZ(LIZ, c32845Cun, this) == enumC58928NAu) {
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
