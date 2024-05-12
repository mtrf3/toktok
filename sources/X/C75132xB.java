package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.guide.clientai.LiveGiftGuidePredictManager$Companion$triggerRequest$1", f = "LiveGiftGuidePredictManager.kt", l = {346}, m = "invokeSuspend")
/* renamed from: X.2xB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75132xB extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ Room LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ JSONObject LJLJJLL;
    public final /* synthetic */ long LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75132xB(DataChannel dataChannel, Room room, String str, long j, JSONObject jSONObject, long j2, InterfaceC67352kd<? super C75132xB> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = room;
        this.LJLJJI = str;
        this.LJLJJL = j;
        this.LJLJJLL = jSONObject;
        this.LJLJL = j2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75132xB(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(3000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C32146CjW.LIZIZ(this.LJLILLLLZI, this.LJLJI.getId(), this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
