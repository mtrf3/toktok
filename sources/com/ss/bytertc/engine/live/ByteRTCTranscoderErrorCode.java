package com.ss.bytertc.engine.live;

import X.V0N;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes33.dex */
public enum ByteRTCTranscoderErrorCode {
    TRANSCODER_ERROR_OK(0),
    TRANSCODER_ERROR_BASE(1090),
    TRANSCODER_ERROR_INVALID_PARAM(1091),
    TRANSCODER_ERROR_INVALID_STATE(1092),
    TRANSCODER_ERROR_INVALID_OPERATOR(1093),
    TRANSCODER_ERROR_TIMEOUT(1094),
    TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER(1095),
    TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER(1096),
    TRANSCODER_ERROR_INVALID_STATE_BY_SERVER(1097),
    TRANSCODER_ERROR_AUTHENTICATION_BY_CDN(1098),
    TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING(1099),
    TRANSCODER_ERROR_MIX_IMAGE_FAIL(1100),
    TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER(1101),
    TRANSCODER_ERROR_STREAM_SYNC_WORSE(1102),
    TRANSCODER_ERROR_MAX(1199);

    public int value;

    /* renamed from: com.ss.bytertc.engine.live.ByteRTCTranscoderErrorCode$1, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode;

        static {
            int[] iArr = new int[ByteRTCTranscoderErrorCode.values().length];
            $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode = iArr;
            try {
                iArr[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_BASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_PARAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_OPERATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_TIMEOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_INVALID_STATE_BY_SERVER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_AUTHENTICATION_BY_CDN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_MIX_IMAGE_FAIL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_STREAM_SYNC_WORSE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ByteRTCTranscoderErrorCode.TRANSCODER_ERROR_MAX.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$live$ByteRTCTranscoderErrorCode[ordinal()]) {
            case 1:
                return "TRANSCODER_ERROR_OK";
            case 2:
                return "TRANSCODER_ERROR_BASE";
            case 3:
                return "TRANSCODER_ERROR_INVALID_PARAM";
            case 4:
                return "TRANSCODER_ERROR_INVALID_STATE";
            case 5:
                return "TRANSCODER_ERROR_INVALID_OPERATOR";
            case 6:
                return "TRANSCODER_ERROR_TIMEOUT";
            case 7:
                return "TRANSCODER_ERROR_INVALID_PARAM_BY_SERVER";
            case 8:
                return "TRANSCODER_ERROR_SUB_TIMEOUT_BY_SERVER";
            case 9:
                return "TRANSCODER_ERROR_INVALID_STATE_BY_SERVER";
            case 10:
                return "TRANSCODER_ERROR_AUTHENTICATION_BY_CDN";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "TRANSCODER_ERROR_TIMEOUT_BY_SIGNALING";
            case 12:
                return "TRANSCODER_ERROR_MIX_IMAGE_FAIL";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return "TRANSCODER_ERROR_UNKNOW_ERROR_BY_SERVER";
            case 14:
                return "TRANSCODER_ERROR_STREAM_SYNC_WORSE";
            case 15:
                return "TRANSCODER_ERROR_MAX";
            default:
                return "";
        }
    }

    public int value() {
        return this.value;
    }

    public static ByteRTCTranscoderErrorCode fromId(int i) {
        for (ByteRTCTranscoderErrorCode byteRTCTranscoderErrorCode : values()) {
            if (byteRTCTranscoderErrorCode.value() == i) {
                return byteRTCTranscoderErrorCode;
            }
        }
        return null;
    }

    public static ByteRTCTranscoderErrorCode valueOf(String str) {
        return (ByteRTCTranscoderErrorCode) V0N.LJJJ(ByteRTCTranscoderErrorCode.class, str);
    }

    ByteRTCTranscoderErrorCode(int i) {
        this.value = i;
    }
}
