package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C122034qd;
import X.C122424rG;
import X.C122784rq;
import X.C124574uj;
import X.C132265Ha;
import X.C132315Hf;
import X.C141425go;
import X.C145995oB;
import X.C166116fX;
import X.C168316j5;
import X.C168346j8;
import X.C169586l8;
import X.C171196nj;
import X.C17N;
import X.C43882HKc;
import X.C5MG;
import X.C5QW;
import X.C6M6;
import X.C76800UCe;
import X.C77357UXp;
import X.C78685UuP;
import X.C78688UuS;
import X.C78915Uy7;
import X.C79057V0z;
import X.C82492WZc;
import X.FMX;
import X.GFJ;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OUP;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.StreamVoiceConversionModel;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AqS27S0100100_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS27S0100100_2 aqS27S0100100_2, Object it) {
        o.LJIIIZ(it, "it");
        C145995oB LJI = C5QW.LJI((Bundle) aqS27S0100100_2.l0, String.valueOf(aqS27S0100100_2.j1));
        if (LJI != null) {
            FMX.LJIIL("choose_shorter_video_popup_cancel", LJI.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS27S0100100_2 aqS27S0100100_2, Object obj) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        NLEModel LJ;
        Integer num;
        int intValue;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C171196nj.LIZ.removeCallbacks(((C168346j8) aqS27S0100100_2.l0).LJLJJL);
        ((C168346j8) aqS27S0100100_2.l0).LJJLIIIJJI();
        if (!booleanValue) {
            C145995oB LIZIZ = GFJ.LIZIZ(4, "calling_event_index");
            LIZIZ.LJI("error_code", "6000");
            LIZIZ.LIZ(C169586l8.LIZJ() ? 1 : 0, "has_too_short_segment");
            LIZIZ.LJI("error_msg", "edit_page_failed");
            LIZIZ.LJI("debug_vc_scene", "enter_edit_page");
            FMX.LJIIL("audio_vc_stream_event", LIZIZ.LIZ);
            Activity LJIJJ = C78688UuS.LJIJJ((C168346j8) aqS27S0100100_2.l0);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            String string = C78688UuS.LJIJJ((C168346j8) aqS27S0100100_2.l0).getResources().getString(R.string.bzm);
            o.LJIIIIZZ(string, "activity.resources.getSt…_voice_effect_use_failed)");
            creativeToastBuilder.message(string);
            C78915Uy7.LJJIIZI(LJIJJ, 3066, creativeToastBuilder);
        } else {
            C145995oB LIZIZ2 = GFJ.LIZIZ(4, "calling_event_index");
            LIZIZ2.LJI("error_code", CardStruct.IStatusCode.DEFAULT);
            LIZIZ2.LJI("debug_vc_scene", "enter_edit_page");
            LIZIZ2.LIZ(C169586l8.LIZJ() ? 1 : 0, "has_too_short_segment");
            LIZIZ2.LIZIZ(System.currentTimeMillis() - aqS27S0100100_2.j1, "total_duration");
            FMX.LJIIL("audio_vc_stream_event", LIZIZ2.LIZ);
            C5MG WS = ((C168346j8) aqS27S0100100_2.l0).LJJLIIJ().WS();
            if (WS != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null && (nLEEditor = LJJI.LJIIJ) != null && (LJ = nLEEditor.LJ()) != null) {
                List LIZ = C122424rG.LIZ(LJ);
                List<C82492WZc> LIZJ = C169586l8.LIZIZ.LIZJ();
                o.LJIIIIZZ(LIZJ, "vcCompletedTasks.immutableList");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C168346j8 c168346j8 = (C168346j8) aqS27S0100100_2.l0;
                for (C82492WZc c82492WZc : LIZJ) {
                    TimeSpeedModelExtension timeSpeedModelExtension = c82492WZc.LJLJLLL;
                    C168316j5 c168316j5 = c82492WZc.LJLLLLLL.LJLLI;
                    if (!c168316j5.LJLJLLL && c168316j5.M()) {
                        Effect effect = c168316j5.LJLJJI;
                        if (timeSpeedModelExtension == null || (num = (Integer) ((LinkedHashMap) C169586l8.LIZJ).get(timeSpeedModelExtension)) == null) {
                            intValue = -1;
                        } else {
                            intValue = num.intValue();
                        }
                        ArrayList arrayList = (ArrayList) LIZ;
                        if (true ^ arrayList.isEmpty()) {
                            if (intValue >= arrayList.size() || intValue < 0) {
                                if (timeSpeedModelExtension != null) {
                                    C169586l8.LIZIZ(timeSpeedModelExtension);
                                }
                            } else {
                                C166116fX c166116fX = new C166116fX(null, (NLEModel) ListProtector.get(LIZ, intValue), effect);
                                c166116fX.LJ = c168316j5.LJLIL;
                                c166116fX.LJI = c168316j5.LJLJLJ;
                                C141425go.LIZIZ(c166116fX, c168346j8.LJJLIIJ(), new AqS184S0100000_2(c168346j8, 31));
                                StreamVoiceConversionModel streamVoiceConversionModel = c168346j8.LJJLJ().creativeModel.streamVoiceConversionModel;
                                String name = c168316j5.LJLJJI.getName();
                                streamVoiceConversionModel.getClass();
                                o.LJIIIZ(name, "<set-?>");
                                streamVoiceConversionModel.vcEffectName = name;
                                StreamVoiceConversionModel streamVoiceConversionModel2 = c168346j8.LJJLJ().creativeModel.streamVoiceConversionModel;
                                String LJJJLIIL = OUP.LJJJLIIL(c168316j5.LJLJJI);
                                streamVoiceConversionModel2.getClass();
                                streamVoiceConversionModel2.vcEffectSpeakerId = LJJJLIIL;
                                StreamVoiceConversionModel streamVoiceConversionModel3 = c168346j8.LJJLJ().creativeModel.streamVoiceConversionModel;
                                String str = c168316j5.LJLJJLL;
                                streamVoiceConversionModel3.getClass();
                                o.LJIIIZ(str, "<set-?>");
                                streamVoiceConversionModel3.vcEffectId = str;
                                linkedHashSet.add(c168316j5.LJLJJLL);
                            }
                        }
                    }
                }
                ((C168346j8) aqS27S0100100_2.l0).LJJLI(LJ);
                nLEEditor.LIZIZ();
                nLEEditor.LIZJ();
                VoiceConversionModel voiceConversionModel = ((C168346j8) aqS27S0100100_2.l0).LJJLJ().creativeModel.voiceConversionModel;
                List<String> LIZLLL = C122424rG.LIZLLL(LJ);
                voiceConversionModel.getClass();
                o.LJIIIZ(LIZLLL, "<set-?>");
                voiceConversionModel.vcMultiOriginPathList = LIZLLL;
                ((C168346j8) aqS27S0100100_2.l0).LJJLJ().creativeModel.voiceConversionModel.hasOriginVoiceConversion = !((C168346j8) aqS27S0100100_2.l0).LJJLJ().creativeModel.voiceConversionModel.vcMultiOriginPathList.isEmpty();
                VoiceConversionModel voiceConversionModel2 = ((C168346j8) aqS27S0100100_2.l0).LJJLJ().creativeModel.voiceConversionModel;
                Set<String> LLJJ = ORZ.LLJJ(C122784rq.LJIIIIZZ(LJ));
                voiceConversionModel2.getClass();
                o.LJIIIZ(LLJJ, "<set-?>");
                voiceConversionModel2.voiceModifyIds = LLJJ;
                if (!((C168346j8) aqS27S0100100_2.l0).LJJLJ().hasRetake()) {
                    boolean z = !((ArrayList) C122784rq.LJIIIIZZ(LJ)).isEmpty();
                    NLETrack mainTrack = LJ.getMainTrack();
                    boolean z2 = false;
                    if (mainTrack != null) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        int size = mainTrack.LJIILL().size();
                        Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            String extra = it.next().getExtra("extra_voice_chang_effect_id");
                            if (extra == null) {
                                extra = "";
                            }
                            if (C78685UuP.LJJJZ(extra)) {
                                linkedHashSet2.add(extra);
                                i++;
                            }
                        }
                        if (i == size && linkedHashSet2.size() == 1) {
                            z2 = true;
                        }
                    }
                    String str2 = ((C168346j8) aqS27S0100100_2.l0).LJJLJ().creativeModel.streamVoiceConversionModel.vcEffectId;
                    if (z && z2 && C78685UuP.LJJJZ(str2)) {
                        AudioEffectParam audioEffectParam = ((C168346j8) aqS27S0100100_2.l0).LJJLJ().veAudioEffectParam;
                        if (audioEffectParam != null) {
                            audioEffectParam.setUploadId(str2);
                        }
                        Effect effect2 = new Effect(null, 1, null);
                        effect2.setEffectId(str2);
                        C141425go.LJ(((C168346j8) aqS27S0100100_2.l0).LJJLIIJ(), effect2);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS27S0100100_2 aqS27S0100100_2, Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        ((C6M6) aqS27S0100100_2.l0).LLIILII = false;
        C77357UXp.LJJJI((int) (System.currentTimeMillis() - aqS27S0100100_2.j1), it);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", (int) (System.currentTimeMillis() - aqS27S0100100_2.j1));
        C43882HKc.LIZ.LIZLLL("edit_recommend_effect_request_info", 1, jSONObject, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS27S0100100_2 aqS27S0100100_2, Object obj) {
        boolean z;
        C132315Hf setState = (C132315Hf) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (Math.abs(C124574uj.LJJLIIIJL(aqS27S0100100_2.j1) - C79057V0z.LJJII(((C132265Ha) aqS27S0100100_2.l0).LLF())) > 1) {
            z = true;
        } else {
            z = false;
        }
        return C132315Hf.L(setState, false, z, false, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0100100_2(long j, C132265Ha c132265Ha, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = c132265Ha;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0100100_2(long j, Bundle bundle, int i) {
        super(1);
        this.$t = i;
        this.l0 = bundle;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0100100_2(C6M6 c6m6, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c6m6;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0100100_2(C168346j8 c168346j8, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c168346j8;
        this.j1 = j;
    }
}
