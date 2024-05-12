package com.bytedance.ies.actionai.jni;

import X.AnonymousClass073;
import X.V0N;

/* loaded from: classes15.dex */
public enum ActionAIErrorCode {
    SUCCESS(0),
    InitSessionNotSend(101),
    InitSessionServerInternalError(102),
    InitSessionServerLogicError(103),
    InitSessionSDKError(104),
    FetchModelListServerInternalError(201),
    FetchModelListServerLogicError(202),
    FetchModelListSDKError(203),
    FetchModelListEmptyError(204),
    SendMsgNotSend(301),
    SendMsgServerInternalError(302),
    SendMsgServerLogicError(303),
    SendMsgInputSecurityError(304),
    SendMsgOutputSecurityError(305),
    SendMsgSDKError(306),
    SendMsgExecutorError(307),
    SendMsgExecutorPartialError(308),
    SaveChatHistoryServerInternalError(401),
    SaveChatHistoryServerLogicError(402),
    SaveChatHistorySDKError(403),
    CancelMsgNotSend(501),
    CancelMsgServerInternalError(502),
    CancelMsgServerLogicError(503),
    CancelMsgSDKError(504),
    DelSessionNotSend(601),
    DelSessionServerInternalError(602),
    DelSessionServerLogicError(603),
    DelSessionSDKError(604),
    SearchAbilityServerInternalError(701),
    SearchAbilityServerLogicError(702),
    SearchAbilityClientError(703),
    SearchAbilityTextGenerateError(704);

    public final int swigValue;

    /* loaded from: classes15.dex */
    public static class SwigNext {
        public static int next;
    }

    public final int swigValue() {
        return this.swigValue;
    }

    public static ActionAIErrorCode swigToEnum(int i) {
        ActionAIErrorCode[] actionAIErrorCodeArr = (ActionAIErrorCode[]) ActionAIErrorCode.class.getEnumConstants();
        if (i < actionAIErrorCodeArr.length && i >= 0) {
            ActionAIErrorCode actionAIErrorCode = actionAIErrorCodeArr[i];
            if (actionAIErrorCode.swigValue == i) {
                return actionAIErrorCode;
            }
        }
        for (ActionAIErrorCode actionAIErrorCode2 : actionAIErrorCodeArr) {
            if (actionAIErrorCode2.swigValue == i) {
                return actionAIErrorCode2;
            }
        }
        throw new IllegalArgumentException(AnonymousClass073.LIZ("No enum ", ActionAIErrorCode.class, " with value ", i));
    }

    public static ActionAIErrorCode valueOf(String str) {
        return (ActionAIErrorCode) V0N.LJJJ(ActionAIErrorCode.class, str);
    }

    ActionAIErrorCode() {
        int i = SwigNext.next;
        SwigNext.next = i + 1;
        this.swigValue = i;
    }

    ActionAIErrorCode(ActionAIErrorCode actionAIErrorCode) {
        int i = actionAIErrorCode.swigValue;
        this.swigValue = i;
        SwigNext.next = i + 1;
    }

    ActionAIErrorCode(int i) {
        this.swigValue = i;
        SwigNext.next = i + 1;
    }
}
