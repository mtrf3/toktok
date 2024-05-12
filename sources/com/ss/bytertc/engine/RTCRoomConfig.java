package com.ss.bytertc.engine;

import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.type.ChannelProfile;

/* loaded from: classes33.dex */
public class RTCRoomConfig {
    public boolean isAutoPublish;
    public boolean isAutoSubscribeAudio;
    public boolean isAutoSubscribeVideo;
    public ChannelProfile profile;
    public RemoteVideoConfig remoteVideoConfig;

    /* renamed from: com.ss.bytertc.engine.RTCRoomConfig$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile;

        static {
            int[] iArr = new int[ChannelProfile.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile = iArr;
            try {
                iArr[ChannelProfile.CHANNEL_PROFILE_COMMUNICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLOUD_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LOW_LATENCY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHAT_ROOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LW_TOGETHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME_HD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CO_HOST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_INTERACTIVE_PODCAST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_KTV.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHORUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFIEL_VR_CHAT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME_STREAMING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LAN_LIVE_STREAMING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFIEL_MEETING.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_MEETING_ROOM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLASSROOM.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public int getProfile() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[this.profile.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return 10;
            case 12:
                return 11;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            default:
                return 0;
        }
    }

    public int getRemoteVideoConfigFrameRate() {
        RemoteVideoConfig remoteVideoConfig = this.remoteVideoConfig;
        if (remoteVideoConfig != null) {
            return remoteVideoConfig.getFrameRate();
        }
        return 0;
    }

    public int getRemoteVideoConfigHeight() {
        RemoteVideoConfig remoteVideoConfig = this.remoteVideoConfig;
        if (remoteVideoConfig != null) {
            return remoteVideoConfig.getHeight();
        }
        return 0;
    }

    public int getRemoteVideoConfigWidth() {
        RemoteVideoConfig remoteVideoConfig = this.remoteVideoConfig;
        if (remoteVideoConfig != null) {
            return remoteVideoConfig.getWidth();
        }
        return 0;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RTCRoomConfig{profile=");
        LIZ.append(this.profile);
        LIZ.append(", isAutoPublish=");
        LIZ.append(this.isAutoPublish);
        LIZ.append(", isAutoSubscribeAudio=");
        LIZ.append(this.isAutoSubscribeAudio);
        LIZ.append(", isAutoSubscribeVideo=");
        LIZ.append(this.isAutoSubscribeVideo);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public boolean isAutoPublish() {
        return this.isAutoPublish;
    }

    public boolean isAutoSubscribeAudio() {
        return this.isAutoSubscribeAudio;
    }

    public boolean isAutoSubscribeVideo() {
        return this.isAutoSubscribeVideo;
    }

    public RTCRoomConfig(ChannelProfile channelProfile, boolean z, boolean z2, boolean z3) {
        this.profile = channelProfile;
        this.isAutoPublish = z;
        this.isAutoSubscribeAudio = z2;
        this.isAutoSubscribeVideo = z3;
    }

    public RTCRoomConfig(ChannelProfile channelProfile, boolean z, boolean z2, boolean z3, RemoteVideoConfig remoteVideoConfig) {
        this.profile = channelProfile;
        this.isAutoPublish = z;
        this.isAutoSubscribeAudio = z2;
        this.isAutoSubscribeVideo = z3;
        this.remoteVideoConfig = remoteVideoConfig;
    }
}
