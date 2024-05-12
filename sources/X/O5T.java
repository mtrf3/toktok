package X;

import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import fjb.a;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.comp.impl.image.fresco.LiveBDFrescoMonitor$onImageLoaded$1", f = "LiveBDFrescoMonitor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class O5T extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O5T(JSONObject jSONObject, String str, boolean z, String str2, InterfaceC67352kd<? super O5T> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new O5T(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        C141335gf.LIZJ(obj);
        JSONObject jSONObject = this.LJLIL;
        String str = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        String str2 = this.LJLJJI;
        try {
            if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_live_image_monitor", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
                BZI LIZ2 = C28787BRn.LIZ("live_image_monitor");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(new Integer(jSONObject.optInt("file_size")), "file_size");
                LIZ2.LJIJJ(new Integer(jSONObject.optInt("applied_image_size")), "applied_image_size");
                LIZ2.LJIJJ(new Long(jSONObject.optLong("duration")), "duration");
                LIZ2.LJIJJ(new Integer(jSONObject.optInt("queue_duration")), "queue_duration");
                LIZ2.LJIJJ(new Long(jSONObject.optLong("download_duration")), "download_duration");
                LIZ2.LJIJJ(new Integer(jSONObject.optInt("decode_duration")), "decode_duration");
                LIZ2.LJIJJ(jSONObject.optString("image_type"), "image_type");
                LIZ2.LJIJJ(jSONObject.optString("load_status"), "load_status");
                LIZ2.LJIJJ(Boolean.valueOf(jSONObject.optBoolean("is_request_network")), "is_request_network");
                LIZ2.LJIJJ(str, "biz_tag");
                if (!z) {
                    LIZ2.LJIJJ(jSONObject.optString("fail_phase"), "fail_phase");
                    LIZ2.LJIJJ(new Integer(jSONObject.optInt("err_code")), "err_code");
                    LIZ2.LJIJJ(jSONObject.optString("err_desc"), "err_desc");
                    LIZ2.LJIJJ(str2, "uri");
                }
                LIZ2.LJJIIJZLJL();
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
