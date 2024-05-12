package X;

import com.ss.android.vesdk.VERecorder;
import fjb.a;
import jp3.c;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.asve.recorder.media.VEMediaController$startRecordMp4Async$1", f = "VEMediaController.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Wxu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83998Wxu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C84004Wy0 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ double LJLJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83998Wxu(C84004Wy0 c84004Wy0, String str, double d, InterfaceC88472Yns interfaceC88472Yns, boolean z, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c84004Wy0;
        this.LJLILLLLZI = str;
        this.LJLJI = d;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83998Wxu(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        VERecorder vERecorder = this.LJLIL.LJII;
        String str = this.LJLILLLLZI;
        float f = (float) this.LJLJI;
        vERecorder.getClass();
        P4Q.LJFF("VERecorder", "startRecord in mp4 mode...");
        int startRecord = vERecorder.LIZIZ.startRecord(str, f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("speed", f);
            jSONObject.put("resultCode", startRecord);
            c.LIZ("vesdk_event_recorder_start_record_async", "business", jSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJLJJI.invoke(new Integer(startRecord));
        if (this.LJLJJL) {
            if (startRecord == 0) {
                InterfaceC83970WxS interfaceC83970WxS = this.LJLIL.LIZ;
                if (interfaceC83970WxS != null) {
                    interfaceC83970WxS.LJIIZILJ();
                }
            } else {
                InterfaceC83970WxS interfaceC83970WxS2 = this.LJLIL.LIZ;
                if (interfaceC83970WxS2 != null) {
                    interfaceC83970WxS2.LIZJ(startRecord, "");
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
