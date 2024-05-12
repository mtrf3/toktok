package X;

import com.bytedance.ies.actionai.jni.ActionAIErrorCode;

/* renamed from: X.Wnf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C83363Wnf {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[ActionAIErrorCode.values().length];
        try {
            iArr[ActionAIErrorCode.SendMsgSDKError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionAIErrorCode.SendMsgExecutorError.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionAIErrorCode.SendMsgServerInternalError.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ActionAIErrorCode.SendMsgServerLogicError.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ActionAIErrorCode.SendMsgOutputSecurityError.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ActionAIErrorCode.SearchAbilityServerLogicError.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ActionAIErrorCode.SendMsgInputSecurityError.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ActionAIErrorCode.SendMsgExecutorPartialError.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ActionAIErrorCode.SearchAbilityTextGenerateError.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC83354WnW.values().length];
        try {
            iArr2[EnumC83354WnW.REQUEST_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[EnumC83354WnW.CONTENT_SECURITY_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[EnumC83354WnW.WAITING.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[EnumC83354WnW.CLEAR_CHAT_LIST.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[EnumC83354WnW.NO_NETWORK.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[EnumC83354WnW.FOLLOW_UP_QUESTIONS.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[EnumC83354WnW.USER_RETRY_FROM_BOT.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[EnumC83354WnW.INIT_HINT_LIST.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[EnumC83354WnW.CANCEL_BY_USER.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[EnumC83354WnW.CANCEL_WITH_QUIT.ordinal()] = 10;
        } catch (NoSuchFieldError unused19) {
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC83358Wna.values().length];
        try {
            iArr3[EnumC83358Wna.USER_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[EnumC83358Wna.BOT.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[EnumC83358Wna.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[EnumC83358Wna.OPTIONS_CLICK.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[EnumC83358Wna.ACTION_CALLBACK.ordinal()] = 5;
        } catch (NoSuchFieldError unused24) {
        }
        LIZJ = iArr3;
    }
}
