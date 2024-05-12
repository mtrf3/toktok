package com.mammon.audiosdk.enums;

import X.V0N;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.util.HashMap;

/* loaded from: classes9.dex */
public enum SAMICoreDataType {
    SAMICoreDataType_Float(0),
    SAMICoreDataType_Int(1),
    SAMICoreDataType_String(2),
    SAMICoreDataType_Null(5),
    SAMICoreDataType_AudioBuffer(50),
    SAMICoreDataType_ContextPrepareParameter(100),
    SAMICoreDataType_ResourceParameter(101),
    SAMICoreDataType_ParameterEvent(102),
    SAMICoreDataType_ProcessorParameter(150),
    SAMICoreDataType_FeatureSet(LiveCoverMinSizeSetting.DEFAULT),
    SAMICoreDataType_ExtractorParameter(251),
    SAMICoreDataType_ModelBin(300),
    SAMICoreDataType_AecInput(350),
    SAMICoreDataType_TTSCallBack(LiveChatShowDelayForHotLiveSetting.DEFAULT),
    SAMICoreDataType_EngineCreateParameter(401),
    SAMICoreDataType_ExecutorCreateParameter(402),
    SAMICoreDataType_TimeAlign(450),
    SAMICoreDataType_TTS_Result(LiveMaxRetainAlogMessageSizeSetting.DEFAULT),
    SAMICoreDataType_ASR_Result(503),
    SAMICoreDataType_AudioBin(504),
    SAMICoreDataType_BeatTracking_Result(505),
    SAMICoreDataType_MusicSourceSeparate_Result(506),
    SAMICoreDataType_MusicTagging_Result(507),
    SAMICoreDataType_Chorus_Result(508),
    SAMICoreDataType_MusicRetarget_Result(509),
    SAMICoreDataType_Midi_Result(510),
    SAMICoreDataType_Token_Result(511),
    SAMICoreDataType_SpeechDisfluency_Result(512),
    SAMICoreDataType_VoiceFilterParam(513),
    SAMICoreDataType_ServerHttpResponse(514),
    SAMICoreDataType_WebSocket_Server_Event(600),
    SAMICoreDataType_WebSocket_Connection_Event(601),
    SAMICoreDataType_WebSocket_Asr(602),
    SAMICoreDataType_WebSocket_Tts(603),
    SAMICoreDataType_WebSocket_Vc(604),
    SAMICoreDataType_WebSocket_Vc_Speaker(605),
    SAMICoreDataType_WebSocket_KeepAliveParam(606);

    public static final HashMap<Integer, SAMICoreDataType> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICoreDataType sAMICoreDataType : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICoreDataType.getValue()), sAMICoreDataType);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICoreDataType fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICoreDataType valueOf(String str) {
        return (SAMICoreDataType) V0N.LJJJ(SAMICoreDataType.class, str);
    }

    SAMICoreDataType(int i) {
        this.value = i;
    }
}
