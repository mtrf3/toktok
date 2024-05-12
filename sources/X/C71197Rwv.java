package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.ext.EcDrawEntity;
import com.bytedance.android.livesdk.model.message.ext.EcDrawMessage;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.ugc.live.sdk.message.data.IMessage;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$5", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rwv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71197Rwv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ IMessage LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71197Rwv(IMessage iMessage, InterfaceC67352kd<? super C71197Rwv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = iMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71197Rwv(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        EcDrawEntity ecDrawEntity = ((EcDrawMessage) this.LJLIL).entity;
        if (ecDrawEntity != null) {
            IEventCenter LJ = EventCenter.LJ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("draw_type", ecDrawEntity.type);
            jSONObject.put("sub_type", ecDrawEntity.subType);
            jSONObject.put("activity_id", ecDrawEntity.activityId);
            ImageModel imageModel = ecDrawEntity.incentiveImage;
            if (imageModel != null) {
                List<String> urls = imageModel.getUrls();
                o.LJIIIIZZ(urls, "image.urls");
                jSONObject.put("incentive_image", ORZ.LJLLLL(urls));
                jSONObject.put("incentive_record_id", ecDrawEntity.incentiveRecordId);
            }
            String jSONObject2 = jSONObject.toString();
            o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …             }.toString()");
            LJ.LIZ("live_ec_lucky_draw_result", jSONObject2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
