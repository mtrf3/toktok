package X;

import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.quickproduct.QuickProductSlot$onCreate$3$1", f = "QuickProductSlot.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BNh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28677BNh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C71256Rxs LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28677BNh(C71256Rxs c71256Rxs, InterfaceC67352kd<? super C28677BNh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c71256Rxs;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28677BNh(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Room room = this.LJLIL.LJLLI;
        if (room != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("room_id", room.getId());
                jSONObject.put("author_id", room.getOwnerUserId());
                jSONObject.put("anchor_id", room.getOwnerUserId());
                if (room.getOwner() != null) {
                    Long l = room.getOwner().followStatus;
                    o.LJIIIIZZ(l, "room.owner.followStatus");
                    jSONObject.put("follow_status", l.longValue());
                }
                Hashtag hashtag = room.hashtag;
                if (hashtag != null) {
                    jSONObject.put("hashtag_id", hashtag.id);
                    jSONObject.put("hashtag_type", room.hashtag.title);
                }
                jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                C48658J7u.LIZIZ("tiktokec_light_product_add_click", jSONObject);
            } catch (Exception unused) {
            }
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
