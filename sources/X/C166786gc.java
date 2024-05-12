package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import fjb.a;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS0S2301000_2;
import kotlin.jvm.internal.AqS14S1201000_2;
import kotlin.jvm.internal.AqS36S1300000_2;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.SpeechToSongHelper$startPrepareSpeechToSong$1$1", f = "SpeechToSongHelper.kt", l = {172}, m = "invokeSuspend")
/* renamed from: X.6gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166786gc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C166736gX LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C166866gk LJLJJI;
    public final /* synthetic */ OnSpeechToSongPrepareListener LJLJJL;
    public final /* synthetic */ C166926gq LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C166786gc(C166736gX c166736gX, String str, C166866gk c166866gk, OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, C166926gq c166926gq, InterfaceC67352kd<? super C166786gc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c166736gX;
        this.LJLJI = str;
        this.LJLJJI = c166866gk;
        this.LJLJJL = onSpeechToSongPrepareListener;
        this.LJLJJLL = c166926gq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C166786gc(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
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
            C166886gm c166886gm = (C166886gm) this.LJLILLLLZI.LIZLLL.getValue();
            final C166736gX c166736gX = this.LJLILLLLZI;
            final String str = this.LJLJI;
            final C166866gk c166866gk = this.LJLJJI;
            final OnSpeechToSongPrepareListener onSpeechToSongPrepareListener = this.LJLJJL;
            final C166926gq c166926gq = this.LJLJJLL;
            InterfaceC166346fu<C166856gj> interfaceC166346fu = new InterfaceC166346fu<C166856gj>() { // from class: X.6gZ
                @Override // X.InterfaceC166346fu
                public final void LIZ(C166276fn executeResult, C166856gj c166856gj) {
                    C166856gj c166856gj2 = c166856gj;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (o.LJ(C166736gX.this.LJFF.get(str), Boolean.TRUE)) {
                        C166936gr c166936gr = c166856gj2.LJIIIZ;
                        int i2 = c166936gr.LJI;
                        String str2 = c166936gr.LJII;
                        int i3 = executeResult.LIZ;
                        if (i3 == 2) {
                            C166746gY.LIZIZ(-2, "pipeline_state_code");
                            C166746gY.LIZJ(c166856gj2.LIZ.LIZLLL, "total_duration");
                            C166746gY.LJI();
                        } else if (i3 == 1) {
                            C166746gY.LIZIZ(executeResult.LIZJ, "pipeline_error_stage");
                            long j = c166856gj2.LIZ.LJI;
                            C166936gr c166936gr2 = c166856gj2.LJIIIZ;
                            C166746gY.LJ(executeResult.LIZJ, j, c166936gr2, c166936gr2.LJI, c166936gr2.LJII, c166936gr2.LJIIIIZZ);
                        }
                        if (executeResult.LIZ == 2) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("curHandlerName", executeResult.LIZIZ);
                            linkedHashMap.put("curHandlerId", String.valueOf(executeResult.LIZJ));
                            C2VQ.LIZIZ(new AqS0S2301000_2(c166866gk, (C166866gk) onSpeechToSongPrepareListener, (OnSpeechToSongPrepareListener) str, (String) i2, (int) str2, (String) linkedHashMap, (java.util.Map<String, String>) 4), 0L);
                        }
                    }
                }

                @Override // X.InterfaceC166346fu
                public final void LIZIZ(C166276fn executeResult, C166856gj c166856gj) {
                    String effectId;
                    C166856gj allData = c166856gj;
                    o.LJIIIZ(executeResult, "executeResult");
                    o.LJIIIZ(allData, "allData");
                    C166736gX c166736gX2 = C166736gX.this;
                    String bizType = c166736gX2.LIZ;
                    int videoLength = c166736gX2.LIZJ.getVideoLength();
                    o.LJIIIZ(bizType, "bizType");
                    if (executeResult.LIZ == 2) {
                        java.util.Map<String, String> map = C166746gY.LIZ;
                        ((LinkedHashMap) map).clear();
                        C166746gY.LIZIZ = false;
                        List<Effect> templateIds = allData.LIZLLL.LIZ.getTemplateIds();
                        EffectTemplate effectTemplate = null;
                        if (templateIds != null) {
                            effectTemplate = (EffectTemplate) ORZ.LJLLLL(templateIds);
                        }
                        map.put("bizType", bizType);
                        if (effectTemplate != null) {
                            String name = effectTemplate.getName();
                            if (name != null) {
                                map.put("template_name", name);
                            }
                            if (effectTemplate != null && (effectId = effectTemplate.getEffectId()) != null) {
                                map.put("template_id", effectId);
                            }
                        }
                        C166746gY.LIZIZ(0, "error_code");
                        map.put("error_msg", "");
                        C166746gY.LIZIZ(0, "pipeline_state_code");
                        C166746gY.LIZIZ(0, "pipeline_error_stage");
                        C166746gY.LIZLLL("extract_audio_cache_rate", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        C166746gY.LIZLLL("upload_cache_rate", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        C166746gY.LIZLLL("changed_cache_rate", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        C166746gY.LIZLLL("export_duration", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        C166746gY.LIZJ(0L, "upload_duration");
                        C166746gY.LIZJ(0L, "fetch_duration");
                        C166746gY.LIZJ(0L, "download_duration");
                        C166746gY.LIZIZ(0, "upload_max_file_length");
                        C166746gY.LIZIZ(0, "download_max_file_length");
                        C166746gY.LIZ(videoLength / 1000.0f, "video_duration");
                    }
                    if (o.LJ(C166736gX.this.LJFF.get(str), Boolean.TRUE) && executeResult.LIZ == 1) {
                        C2VQ.LIZIZ(new AqS14S1201000_2(executeResult.LIZJ, c166866gk, onSpeechToSongPrepareListener, str, 4), 0L);
                    }
                }

                @Override // X.InterfaceC166346fu
                public final void LIZJ(C166276fn executeResult, C166856gj c166856gj) {
                    C166856gj c166856gj2 = c166856gj;
                    o.LJIIIZ(executeResult, "executeResult");
                    if (o.LJ(C166736gX.this.LJFF.get(str), Boolean.TRUE)) {
                        int i2 = executeResult.LIZ;
                        if (i2 == 2) {
                            C166746gY.LIZIZ(0, "pipeline_state_code");
                            C166746gY.LIZJ(c166856gj2.LIZ.LIZLLL, "total_duration");
                            C166746gY.LJI();
                        } else if (i2 == 1) {
                            long j = c166856gj2.LIZ.LJI;
                            C166936gr c166936gr = c166856gj2.LJIIIZ;
                            C166746gY.LJ(executeResult.LIZJ, j, c166936gr, c166936gr.LJI, c166936gr.LJII, null);
                        }
                        if (executeResult.LIZ == 2) {
                            C2VQ.LIZIZ(new AqS36S1300000_2(c166866gk, c166926gq, onSpeechToSongPrepareListener, str, 2), 0L);
                        }
                    }
                }
            };
            this.LJLIL = 1;
            if (c166886gm.LIZIZ(c166886gm.LIZLLL(), interfaceC166346fu, this) == enumC58928NAu) {
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
