package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum AudioPlaybackDevice {
    AUDIO_PLAYBACK_DEVICE_HEADSET(1),
    AUDIO_PLAYBACK_DEVICE_EARPIECE(2),
    AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE(3),
    AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH(4),
    AUDIO_PLAYBACK_DEVICE_HEADSET_USB(5);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.AudioPlaybackDevice$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice;

        static {
            int[] iArr = new int[AudioPlaybackDevice.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice = iArr;
            try {
                iArr[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET_USB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return "";
                        }
                        return "kAudioPlaybackDeviceHeadsetUSB";
                    }
                    return "kAudioPlaybackDeviceHeadsetBluetooth";
                }
                return "kAudioPlaybackDeviceHeadset";
            }
            return "kAudioPlaybackDeviceEarpiece";
        }
        return "kAudioPlaybackDeviceSpeakerphone";
    }

    public int value() {
        return this.value;
    }

    public static AudioPlaybackDevice fromId(int i) {
        for (AudioPlaybackDevice audioPlaybackDevice : values()) {
            if (audioPlaybackDevice.value() == i) {
                return audioPlaybackDevice;
            }
        }
        return null;
    }

    public static AudioPlaybackDevice valueOf(String str) {
        return (AudioPlaybackDevice) V0N.LJJJ(AudioPlaybackDevice.class, str);
    }

    AudioPlaybackDevice(int i) {
        this.value = i;
    }
}
