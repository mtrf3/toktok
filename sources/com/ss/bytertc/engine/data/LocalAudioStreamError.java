package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum LocalAudioStreamError {
    LOCAL_AUDIO_STREAM_ERROR_OK(0),
    LOCAL_AUDIO_STREAM_ERROR_FAILURE(1),
    LOCAL_AUDIO_STREAM_ERROR_DEVICE_NO_PERMISSION(2),
    LOCAL_AUDIO_STREAM_ERROR_DEVICE_BUSY(3),
    LOCAL_AUDIO_STREAM_ERROR_RECORD_FAILURE(4),
    LOCAL_AUDIO_STREAM_ERROR_ENCODE_FAILURE(5),
    LOCAL_AUDIO_STREAM_ERROR_NO_RECORDING_DEVICE(6);

    public int value;

    /* renamed from: com.ss.bytertc.engine.data.LocalAudioStreamError$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError;

        static {
            int[] iArr = new int[LocalAudioStreamError.values().length];
            $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError = iArr;
            try {
                iArr[LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_DEVICE_NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_DEVICE_BUSY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_RECORD_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_ENCODE_FAILURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[LocalAudioStreamError.LOCAL_AUDIO_STREAM_ERROR_NO_RECORDING_DEVICE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$LocalAudioStreamError[ordinal()]) {
            case 1:
                return "kLocalAudioStreamErrorOk";
            case 2:
                return "kLocalAudioStreamErrorFailure";
            case 3:
                return "kLocalAudioStreamErrorDeviceNoPermission";
            case 4:
                return "kLocalAudioStreamErrorDeviceBusy";
            case 5:
                return "kLocalAudioStreamErrorRecordFailure";
            case 6:
                return "kLocalAudioStreamErrorEncodeFailure";
            case 7:
                return "kLocalAudioStreamErrorNoRecordingDevice";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static LocalAudioStreamError fromId(int i) {
        for (LocalAudioStreamError localAudioStreamError : values()) {
            if (localAudioStreamError.value() == i) {
                return localAudioStreamError;
            }
        }
        return null;
    }

    public static LocalAudioStreamError valueOf(String str) {
        return (LocalAudioStreamError) V0N.LJJJ(LocalAudioStreamError.class, str);
    }

    LocalAudioStreamError(int i) {
        this.value = i;
    }
}
