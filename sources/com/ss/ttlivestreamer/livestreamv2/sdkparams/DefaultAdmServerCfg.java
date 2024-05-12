package com.ss.ttlivestreamer.livestreamv2.sdkparams;

import com.livecore.base.tinyjson.annotations.Serialized;

/* loaded from: classes12.dex */
public class DefaultAdmServerCfg {

    @Serialized("engine_BAC")
    public EngineBAC engineBAC = new EngineBAC();

    /* loaded from: classes12.dex */
    public static class EngineBAC {

        @Serialized("adm")
        public ADM adm = new ADM();

        @Serialized("aec")
        public AEC aec = new AEC();

        @Serialized("ans")
        public ANS ans = new ANS();

        @Serialized("version")
        public String version = "livecore-demo-byteaudio-default";

        @Serialized("config_level")
        public int configLevel = 1;

        @Serialized("loudnorm")
        public LoudNorm loudNorm = new LoudNorm();

        /* loaded from: classes12.dex */
        public static class ADM {

            @Serialized("play")
            public AudioSrAndChn play = new AudioSrAndChn();

            @Serialized("record")
            public AudioSrAndChn record = new AudioSrAndChn();

            /* loaded from: classes12.dex */
            public static class AudioSrAndChn {

                @Serialized("chn")
                public int chn = 2;

                @Serialized("sr")
                public int sr = 48000;
            }
        }

        /* loaded from: classes12.dex */
        public static class AEC {

            @Serialized("delay_mode")
            public int delayMode = 1;

            @Serialized("headset_level")
            public int headsetLevel = 1;

            @Serialized("hw")
            public boolean hw = true;

            @Serialized("level")
            public int level = 2;

            @Serialized("sw")
            public boolean sw = true;

            @Serialized("type")
            public int type = 3;
        }

        /* loaded from: classes12.dex */
        public static class ANS {

            @Serialized("headset_level")
            public int headsetLevel;

            @Serialized("hw")
            public boolean hw = true;

            @Serialized("level")
            public int level = 1;

            @Serialized("sw")
            public boolean sw = true;

            @Serialized("type")
            public int type = 2;
        }

        /* loaded from: classes12.dex */
        public static class LoudNorm {

            @Serialized("enable")
            public boolean enable = true;

            @Serialized("vocal_noise_level")
            public int vocalNoiseLevel = -35;

            @Serialized("vocal_target_loudness")
            public int vocalTargetLoudness = -14;

            @Serialized("vocal_max_gain")
            public int vocalMaxGain = 6;

            @Serialized("vocal_gain_increase")
            public int vocalGainIncrease = 4;

            @Serialized("aux_target_loudness")
            public int auxTargetLoudness = -18;

            @Serialized("vocal_window_duration")
            public int vocalWindowDuration = 15;
        }
    }
}
