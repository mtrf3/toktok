package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.mammon.audiosdk.SAMICoreCallBackListener;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreWebSocketConnectionEvent;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.WZb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82491WZb implements SAMICoreCallBackListener {
    public final /* synthetic */ C82493WZd LIZ;

    public C82491WZb(C82493WZd c82493WZd) {
        this.LIZ = c82493WZd;
    }

    @Override // com.mammon.audiosdk.SAMICoreCallBackListener
    public final void onMessageReceived(SAMICoreCallBackEventType type, SAMICoreBlock data) {
        String outputSVCFile;
        String str = "";
        o.LJIIIZ(type, "type");
        o.LJIIIZ(data, "data");
        if (type == SAMICoreCallBackEventType.VC_Started) {
            if (data.dataType == SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                this.LIZ.LJIIIIZZ(new WZ5("EVENT_VC_STARTED"));
                Object obj = data.audioData[0];
                o.LJII(obj, "null cannot be cast to non-null type com.mammon.audiosdk.structures.SAMICoreServerEvent");
                SAMICoreServerEvent sAMICoreServerEvent = (SAMICoreServerEvent) obj;
                C82478WYo c82478WYo = this.LIZ.LJLZ;
                String str2 = sAMICoreServerEvent.taskId;
                o.LJIIIIZZ(str2, "serverEvent.taskId");
                c82478WYo.LIZJ(str2);
                C82478WYo c82478WYo2 = this.LIZ.LJZ;
                String str3 = sAMICoreServerEvent.taskId;
                o.LJIIIIZZ(str3, "serverEvent.taskId");
                c82478WYo2.LIZJ(str3);
                C82478WYo c82478WYo3 = this.LIZ.LJZI;
                String str4 = sAMICoreServerEvent.taskId;
                o.LJIIIIZZ(str4, "serverEvent.taskId");
                c82478WYo3.LIZJ(str4);
                C82493WZd c82493WZd = this.LIZ;
                c82493WZd.LIZIZ(new AqS180S0100000_14(c82493WZd, BuildConfig.VERSION_CODE));
                this.LIZ.LJLZ.LJ();
                this.LIZ.LJZ.LJ();
                this.LIZ.LJZI.LJ();
                int i = sAMICoreServerEvent.statusCode;
                if (i != 20000000) {
                    String valueOf = String.valueOf(i);
                    if (!C78685UuP.LJJJZ(valueOf)) {
                        valueOf = "5003";
                    }
                    String errMsg = sAMICoreServerEvent.statusText;
                    if (!C78685UuP.LJJJZ(errMsg)) {
                        errMsg = "vc start failed";
                    }
                    C82493WZd c82493WZd2 = this.LIZ;
                    if (c82493WZd2.LJLLL) {
                        C82478WYo c82478WYo4 = c82493WZd2.LJLZ;
                        o.LJIIIIZZ(errMsg, "errMsg");
                        c82478WYo4.LJIIIIZZ(valueOf, errMsg);
                        this.LIZ.LJZ.LJIIIIZZ(valueOf, errMsg);
                    }
                    C82493WZd c82493WZd3 = this.LIZ;
                    if (c82493WZd3.LJLLLL) {
                        C82478WYo c82478WYo5 = c82493WZd3.LJZI;
                        o.LJIIIIZZ(errMsg, "errMsg");
                        c82478WYo5.LJIIIIZZ(valueOf, errMsg);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (type == SAMICoreCallBackEventType.VC_GetResulted) {
            if (data.dataType != SAMICoreDataType.SAMICoreDataType_AudioBin) {
                return;
            }
            o.LJII(data.audioData[0], "null cannot be cast to non-null type com.mammon.audiosdk.structures.SAMICoreVcResult");
            C82493WZd c82493WZd4 = this.LIZ;
            if (!c82493WZd4.LLF) {
                return;
            }
            c82493WZd4.LLF = false;
            c82493WZd4.LJIIIIZZ(new WZ5("EVENT_VC_GET_RESULT_RECEIVE_FIRST_PACKET"));
            this.LIZ.LJLZ.LIZLLL();
            this.LIZ.LJZ.LIZLLL();
            this.LIZ.LJZI.LIZLLL();
            return;
        }
        if (type == SAMICoreCallBackEventType.VC_Finished) {
            if (data.dataType != SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                return;
            }
            Object obj2 = data.audioData[0];
            o.LJII(obj2, "null cannot be cast to non-null type com.mammon.audiosdk.structures.SAMICoreServerEvent");
            SAMICoreServerEvent sAMICoreServerEvent2 = (SAMICoreServerEvent) obj2;
            this.LIZ.LJLZ.LJFF();
            this.LIZ.LJZ.LJFF();
            this.LIZ.LJZI.LJFF();
            C82493WZd c82493WZd5 = this.LIZ;
            c82493WZd5.LIZIZ(new AqS180S0100000_14(c82493WZd5, 291));
            try {
                outputSVCFile = new JSONObject(sAMICoreServerEvent2.textMsg).optString("output_audio_file", "");
            } catch (Exception unused) {
                outputSVCFile = "";
            }
            try {
                str = new JSONObject(sAMICoreServerEvent2.textMsg).optString("input_audio_file", "");
            } catch (Exception unused2) {
            }
            StringBuilder sb = new StringBuilder();
            CreativeInfo creativeInfo = this.LIZ.LIZ().creativeInfo;
            o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
            sb.append(C171196nj.LIZ(creativeInfo));
            sb.append('/');
            sb.append(this.LIZ.LJLJLJ);
            sb.append("_vc_input_audio.pcm");
            String sb2 = sb.toString();
            C44687HgJ.LIZLLL(str, sb2);
            o.LJIIIIZZ(outputSVCFile, "outputSVCFile");
            C82493WZd c82493WZd6 = this.LIZ;
            String str5 = c82493WZd6.LJLJLJ;
            Effect effect = c82493WZd6.LJLL;
            this.LIZ.LJLLI = new C168316j5(outputSVCFile, sb2, str5, effect, effect.getEffect_id(), this.LIZ.LJLJLLL, LiveChatShowDelayForHotLiveSetting.DEFAULT);
            long LIZ = C78496UrM.LIZ(outputSVCFile);
            C82478WYo c82478WYo6 = this.LIZ.LJLZ;
            if (!c82478WYo6.LIZLLL) {
                c82478WYo6.LIZ.LIZIZ(LIZ, "vc_file_size");
            }
            C82478WYo c82478WYo7 = this.LIZ.LJZ;
            if (!c82478WYo7.LIZLLL) {
                c82478WYo7.LIZ.LIZIZ(LIZ, "vc_file_size");
            }
            C82478WYo c82478WYo8 = this.LIZ.LJZI;
            if (!c82478WYo8.LIZLLL) {
                c82478WYo8.LIZ.LIZIZ(LIZ, "vc_file_size");
            }
            long LIZ2 = C78496UrM.LIZ(str);
            C82478WYo c82478WYo9 = this.LIZ.LJLZ;
            if (!c82478WYo9.LIZLLL) {
                c82478WYo9.LIZ.LIZIZ(LIZ2, "origin_file_size");
            }
            C82478WYo c82478WYo10 = this.LIZ.LJZ;
            if (!c82478WYo10.LIZLLL) {
                c82478WYo10.LIZ.LIZIZ(LIZ2, "origin_file_size");
            }
            C82478WYo c82478WYo11 = this.LIZ.LJZI;
            if (!c82478WYo11.LIZLLL) {
                c82478WYo11.LIZ.LIZIZ(LIZ2, "origin_file_size");
            }
            C82493WZd c82493WZd7 = this.LIZ;
            if (c82493WZd7.LJLLL) {
                c82493WZd7.LJLZ.LJII(CardStruct.IStatusCode.DEFAULT, "success", true);
            }
            C82493WZd c82493WZd8 = this.LIZ;
            if (c82493WZd8.LJLLLL) {
                c82493WZd8.LJZI.LJII(CardStruct.IStatusCode.DEFAULT, "success", true);
            }
            if (sAMICoreServerEvent2.statusCode == 20000000) {
                C82493WZd c82493WZd9 = this.LIZ;
                if (c82493WZd9.LJLLL) {
                    ShortVideoContext shortVideoContext = c82493WZd9.LIZ();
                    Effect effect2 = this.LIZ.LJLL;
                    o.LJIIIZ(shortVideoContext, "shortVideoContext");
                    o.LJIIIZ(effect2, "effect");
                    C145995oB LJIIIZ = C82468WYe.LJIIIZ(shortVideoContext);
                    LJIIIZ.LIZLLL("effect_id", effect2.getEffect_id());
                    LJIIIZ.LIZLLL("effect_name", effect2.getName());
                    LJIIIZ.LIZIZ((LIZ2 * 1000) / 88200, "duration");
                    FMX.LJIIL("voice_effect_preview_record_vc_end", LJIIIZ.LIZ);
                }
            }
            C82493WZd c82493WZd10 = this.LIZ;
            WZ5 wz5 = new WZ5("EVENT_VC_FINISHED");
            wz5.LIZIZ = sAMICoreServerEvent2.statusCode;
            c82493WZd10.LJIIIIZZ(wz5);
            return;
        }
        if (type == SAMICoreCallBackEventType.VC_Failed) {
            if (data.dataType != SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                return;
            }
            this.LIZ.LJLZ.LJFF();
            this.LIZ.LJZ.LJFF();
            this.LIZ.LJZI.LJFF();
            C82493WZd c82493WZd11 = this.LIZ;
            c82493WZd11.LIZIZ(new AqS180S0100000_14(c82493WZd11, 292));
            Object obj3 = data.audioData[0];
            o.LJII(obj3, "null cannot be cast to non-null type com.mammon.audiosdk.structures.SAMICoreServerEvent");
            SAMICoreServerEvent sAMICoreServerEvent3 = (SAMICoreServerEvent) obj3;
            String valueOf2 = String.valueOf(sAMICoreServerEvent3.statusCode);
            if (!C78685UuP.LJJJZ(valueOf2)) {
                valueOf2 = "5004";
            }
            String errMsg2 = sAMICoreServerEvent3.statusText;
            if (!C78685UuP.LJJJZ(errMsg2)) {
                errMsg2 = "vc failed";
            }
            C82493WZd c82493WZd12 = this.LIZ;
            if (c82493WZd12.LJLLL) {
                C82478WYo c82478WYo12 = c82493WZd12.LJLZ;
                o.LJIIIIZZ(errMsg2, "errMsg");
                c82478WYo12.LJIIIIZZ(valueOf2, errMsg2);
            }
            C82493WZd c82493WZd13 = this.LIZ;
            if (c82493WZd13.LJLLLL) {
                C82478WYo c82478WYo13 = c82493WZd13.LJZI;
                o.LJIIIIZZ(errMsg2, "errMsg");
                c82478WYo13.LJIIIIZZ(valueOf2, errMsg2);
            }
            C82493WZd c82493WZd14 = this.LIZ;
            WZ5 wz52 = new WZ5("EVENT_VC_FAILED");
            wz52.LIZIZ = sAMICoreServerEvent3.statusCode;
            c82493WZd14.LJIIIIZZ(wz52);
            return;
        }
        if (type == SAMICoreCallBackEventType.VC_WebSocketStateChanged) {
            if (data.dataType != SAMICoreDataType.SAMICoreDataType_WebSocket_Connection_Event) {
                return;
            }
            Object obj4 = data.audioData[0];
            o.LJII(obj4, "null cannot be cast to non-null type com.mammon.audiosdk.structures.SAMICoreWebSocketConnectionEvent");
            C82493WZd c82493WZd15 = this.LIZ;
            c82493WZd15.LIZIZ(new AqS180S0100000_14(c82493WZd15, 293));
            int i2 = ((SAMICoreWebSocketConnectionEvent) obj4).state;
            if (i2 == 2) {
                C82493WZd c82493WZd16 = this.LIZ;
                c82493WZd16.LJLLJ = true;
                c82493WZd16.LJLZ.LJFF();
                this.LIZ.LJZ.LJFF();
                this.LIZ.LJZI.LJFF();
                this.LIZ.LJIIIIZZ(new WZ5("EVENT_VC_WEBSOCKET_CONNECT_FAILED"));
                return;
            }
            if (i2 == 0) {
                this.LIZ.LJIIIIZZ(new WZ5("EVENT_VC_WEBSOCKET_CONNECTING"));
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                this.LIZ.LJLZ.LJI();
                this.LIZ.LJZ.LJI();
                this.LIZ.LJZI.LJI();
                this.LIZ.LJIIIIZZ(new WZ5("EVENT_VC_WEBSOCKET_CONNECTED"));
                return;
            }
        }
        if (type != SAMICoreCallBackEventType.VC_Player_Finished) {
            return;
        }
        this.LIZ.LJIIIIZZ(new WZ5("EVENT_VC_PLAY_FINISHED"));
        this.LIZ.LJZL = true;
    }
}
