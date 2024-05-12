package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.VoiceChanger$startPrefetchVoiceChangeMaterial$1$isSuccess$1", f = "VoiceChanger.kt", l = {252}, m = "invokeSuspend")
/* renamed from: X.6f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165806f2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C165866f8 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C165806f2(C165866f8 c165866f8, String str, InterfaceC67352kd<? super C165806f2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c165866f8;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C165806f2(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C165956fH c165956fH = (C165956fH) this.LJLILLLLZI.LJII.getValue();
            final C165866f8 c165866f8 = this.LJLILLLLZI;
            final String str = this.LJLJI;
            InterfaceC166346fu<C166396fz> interfaceC166346fu = new InterfaceC166346fu<C166396fz>() { // from class: X.6fU
                @Override // X.InterfaceC166346fu
                public final void LIZ(C166276fn executeResult, C166396fz c166396fz) {
                    C166396fz c166396fz2 = c166396fz;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (executeResult.LIZ == 2) {
                        C166106fW.LIZ(-2, "pipeline_state_code");
                        C166096fV.LIZ.put("total_duration", String.valueOf(c166396fz2.LIZ.LIZLLL));
                        C166106fW.LIZIZ(c166396fz2);
                    }
                }

                @Override // X.InterfaceC166346fu
                public final void LIZIZ(C166276fn executeResult, C166396fz allData) {
                    o.LJIIIZ(executeResult, "executeResult");
                    o.LJIIIZ(allData, "allData");
                    C165866f8 c165866f82 = C165866f8.this;
                    String uploadType = str;
                    c165866f82.LIZJ.getVideoLength();
                    o.LJIIIZ(uploadType, "uploadType");
                    if (executeResult.LIZ == 2) {
                        java.util.Map<String, String> map = C166096fV.LIZ;
                        ((LinkedHashMap) map).clear();
                        map.put("export_upload_type", uploadType);
                        C166106fW.LIZ(0, "error_code");
                        map.put("error_msg", "");
                        C166106fW.LIZ(0, "pipeline_state_code");
                        C166106fW.LIZ(0, "pipeline_error_stage");
                        map.put("upload_cache", String.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
                        C166106fW.LIZ(0, "origin_file_length");
                        C166106fW.LIZ(0, "upload_file_length");
                    }
                }

                @Override // X.InterfaceC166346fu
                public final void LIZJ(C166276fn executeResult, C166396fz c166396fz) {
                    C166396fz c166396fz2 = c166396fz;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (executeResult.LIZ == 2) {
                        C166106fW.LIZ(0, "pipeline_state_code");
                        C166096fV.LIZ.put("total_duration", String.valueOf(c166396fz2.LIZ.LIZLLL));
                        C166106fW.LIZIZ(c166396fz2);
                    }
                }
            };
            this.LJLIL = 1;
            obj = c165956fH.LIZIZ(c165956fH.LIZLLL(), interfaceC166346fu, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
