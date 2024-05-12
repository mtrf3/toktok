package com.mammon.audiosdk.enums;

import X.V0N;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;

/* loaded from: classes9.dex */
public enum SAMICorePropertyId {
    SAMICorePropertyID_Base_NAME(0),
    SAMICorePropertyID_Base_UNKNOWN(1),
    SAMICorePropertyID_Processor_ContextPrepare(100),
    SAMICorePropertyID_VAD_Aggressiveness_Mode_Name(200),
    SAMICorePropertyID_VAD_Silence_Robust_Length_name(201),
    SAMICorePropertyID_VAD_Frame_Time_Length_Name(202),
    SAMICorePropertyID_VAD_Smoothing_Searching_Width_Name(203),
    SAMICorePropertyID_VAD_Smoothing_Searching_Threshold_Ratio_Name(204),
    SAMICorePropertyID_VAD_Overall_Moving_Average_Width_Name(205),
    SAMICorePropertyID_VAD_Overall_Searching_Threshold_Ratio_Name(206),
    SAMICorePropertyID_VAD_Overall_Silence_Length_Name(207),
    SAMICorePropertyID_Compressor_Bypass(300),
    SAMICorePropertyID_Compressor_Ratio(301),
    SAMICorePropertyID_Compressor_Threshold(302),
    SAMICorePropertyID_Compressor_Knee_dB(303),
    SAMICorePropertyID_Compressor_Attack(304),
    SAMICorePropertyID_Compressor_Release(305),
    SAMICorePropertyID_Compressor_Auto_Makeup_Gain(306),
    SAMICorePropertyID_Compressor_Output_Gain_dB(307),
    SAMICorePropertyID_Compressor_Look_Head(308),
    SAMICorePropertyID_FrameFeatures(LiveChatShowDelayForHotLiveSetting.DEFAULT),
    SAMICorePropertyID_FrameFeature_SPECTRUM(401),
    SAMICorePropertyID_FrameFeature_ONSET(402),
    SAMICorePropertyID_FrameFeature_F0(403),
    SAMICorePropertyID_FrameFeature_BEAT_TRACKING(404),
    SAMICorePropertyID_FrameFeature_VOLUME(405),
    SAMICorePropertyID_FrameFeature_NNVAD(406),
    SAMICorePropertyID_FrameFeature_Voice_Activity(407),
    SAMICorePropertyID_FrameFeature_AudioMetrics(409),
    SAMICorePropertyID_OverallFeatures(LiveMaxRetainAlogMessageSizeSetting.DEFAULT),
    SAMICorePropertyID_OverallFeature_GLOBAL_LOUDNESS(501),
    SAMICorePropertyID_OverallFeature_GLOBAL_PEAK(502),
    SAMICorePropertyID_OverallFeature_TRACKING_OFFLINE_OVERALL(503),
    SAMICorePropertyID_OverallFeature_NNVAD_OVERALL(504),
    SAMICorePropertyID_OverallFeature_ONSET_OVERALL(505),
    SAMICorePropertyID_OverallFeature_Voice_Activity_OVERALL(506),
    SAMICorePropertyID_SetExtractorFloatParameter(600),
    SAMICorePropertyID_SetExtractorStringParameter(601),
    SAMICorePropertyId_LoadModelBinary(700),
    SAMICorePropertyId_Seek(800),
    SAMICorePropertyId_TimeScaler(900),
    SAMICorePropertyID_Processor_Prepare(1000),
    SAMICorePropertyID_Processor_SetParametersOffline(1001),
    SAMICorePropertyID_Processor_ContextUpdateFromFile(1002),
    SAMICorePropertyID_Processor_ContextUpdateFromString(1003),
    SAMICorePropertyID_Processor_ContextEmplaceParameterEventNow(1004),
    SAMICorePropertyID_Processor_ContextEmplaceParameterEventNowWithPlainValue(1005),
    SAMICoreEngineExecutorOutPut(1100),
    SAMICorePropertyID_Common_Flush(1103),
    SAMICorePropertyID_Common_Reset(1104),
    SAMICorePropertyID_Common_SetParam(1105),
    SAMICorePropertyID_Common_SetInputEnd(1106),
    SAMICorePropertyID_Common_GetParam(1107),
    SAMICorePropertyID_Common_GetResult(1108),
    SAMICorePropertyID_TCNDenoise(LinkMicRtcMixBitrateSetting.DEFAULT),
    SAMICorePropertyID_TCNDenoise_Rate(1201),
    SAMICorePropertyID_TCNDenoise_Mode(1202),
    SAMICorePropertyID_Processor_ContextChunkBinaryRes(1300),
    SAMICorePropertyID_Processor_ContextUpdateFromBinaryFile(1301),
    SAMICorePropertyID_Processor_ContextUpdateFromBinaryRes(1302),
    SAMICorePropertyID_Denoise_V2(1400),
    SAMICorePropertyID_Denoise_V2_Rate(1401),
    SAMICorePropertyID_Denoise_V2_Mode(1402),
    SAMICorePropertyID_SpeechRecognition(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED),
    SAMICorePropertyID_SpeechRecognition_Reset(1501),
    SAMICorePropertyID_SpeechRecognition_Finish(1502),
    SAMICorePropertyID_SpeechRecognition_UseWordInfo(1503),
    SAMICorePropertyId_ASR_Online_Reset_Recognition(1700),
    SAMICorePropertyID_Stream_TTS_Online_Force_Finish(1701),
    SAMICorePropertyID_Stream_TTS_Online_Wait_Stop(1702),
    SAMICorePropertyID_Stream_Play_TTS_Online_Force_Finish(1703),
    SAMICorePropertyId_VC_Online(1710),
    SAMICorePropertyId_VC_Online_Open_Loudspeaker(1711),
    SAMICorePropertyId_VC_Online_Close_Loudspeaker(1712),
    SAMICorePropertyId_VC_Online_Audio_Start_Play(1713),
    SAMICorePropertyId_VC_Online_Audio_Stop_Play(1714),
    SAMICorePropertyId_VC_Online_Audio_Pause_Play(1715),
    SAMICorePropertyId_VC_Online_Audio_Resume_Play(1716),
    SAMICorePropertyId_VC_Online_Start_Server(1717),
    SAMICorePropertyId_VC_Online_Stop_Server(1718),
    SAMICorePropertyId_VC_Online_Stop_Server_Async(1719),
    SAMICorePropertyId_VC_Online_Force_Finish_Server(1720),
    SAMICorePropertyId_VC_Online_Set_Speaker(1721),
    SAMICorePropertyId_VC_Online_Get_Performance_Event_Tracking(1722),
    SAMICorePropertyId_VC_Online_Get_Input_Data_Save_File(1723),
    SAMICorePropertyId_VC_Online_Set_Input_Data_Uri(1724),
    SAMICorePropertyId_VC_Online_Set_Output_Data_Uri(1725),
    SAMICorePropertyId_VC_Online_Restart_Task(1726),
    SAMICorePropertyId_VC_Online_Cancel_Task(1727),
    SAMICorePropertyId_VC_Online_KeepAlive(1728),
    SAMICorePropertyID_AudioMetricsJson(1800),
    SAMICorePropertyID_AudioMetrics_InputEnd(1801);

    public static final HashMap<Integer, SAMICorePropertyId> intToEnumMap = new HashMap<>();
    public int value;

    static {
        for (SAMICorePropertyId sAMICorePropertyId : values()) {
            intToEnumMap.put(Integer.valueOf(sAMICorePropertyId.getValue()), sAMICorePropertyId);
        }
    }

    public int getValue() {
        return this.value;
    }

    public static SAMICorePropertyId fromInt(int i) {
        return intToEnumMap.get(Integer.valueOf(i));
    }

    public static SAMICorePropertyId valueOf(String str) {
        return (SAMICorePropertyId) V0N.LJJJ(SAMICorePropertyId.class, str);
    }

    SAMICorePropertyId(int i) {
        this.value = i;
    }
}
