package X;

import fjb.a;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.metrics.sticker.StickerGiftTracker$onPlayerSeiUpdate$1", f = "StickerGiftTracker.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cj7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32121Cj7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32121Cj7(Object obj, InterfaceC67352kd<? super C32121Cj7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C32121Cj7 c32121Cj7 = new C32121Cj7(this.LJLILLLLZI, interfaceC67352kd);
        c32121Cj7.LJLIL = obj;
        return c32121Cj7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        JSONObject optJSONObject;
        C141335gf.LIZJ(obj);
        try {
            optJSONObject = new JSONObject((String) this.LJLILLLLZI).optJSONObject("live_sticker_gift_sei");
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (optJSONObject == null) {
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayerSeiUpdate: ");
        LIZ.append(optJSONObject);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ));
        String optString = optJSONObject.optString("log_id");
        C32217Ckf.LIZ.LIZIZ(optJSONObject.optLong("anchor_render_timestamp"), optJSONObject.optLong("anchor_latency"), optJSONObject.optLong("anchor_receive_timestamp"), optString);
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
