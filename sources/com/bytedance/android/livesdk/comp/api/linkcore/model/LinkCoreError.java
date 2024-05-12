package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkCoreError extends F9E {
    public final int errorCode;
    public final String errorMsg;
    public static final Companion Companion = new Companion();
    public static final LinkCoreError COMMON_UNKNOWN = new LinkCoreError(-10001, "unknown");
    public static final LinkCoreError COMMON_RESPONSE_INVALID = new LinkCoreError(-10002, "The response is null or invalid.");
    public static final LinkCoreError CHANNEL_ID_INVALID = new LinkCoreError(-20001, "The channel id is invalid.");
    public static final LinkCoreError CHANNEL_ID_INCONSISTENCY = new LinkCoreError(-30001, "The channel id is not inconsistency with the link.");
    public static final LinkCoreError APPLY_IN_WAITING_STATE = new LinkCoreError(-30002, "Can not apply in waiting state, the apply request is sent or invite message has received.");
    public static final LinkCoreError INVITE_WITH_INVALID_UID = new LinkCoreError(-40001, "Can not invite user, because the user id is invalid.");
    public static final LinkCoreError INVITE_SENT_TARGET_USER = new LinkCoreError(-40002, "Invite sent to target user.");
    public static final LinkCoreError CANCEL_INVITE_BUT_NOT_INVITED = new LinkCoreError(-40003, "Users not invited but got canceled.");
    public static final LinkCoreError CANCEL_APPLY_BUT_NOT_APPLIED = new LinkCoreError(-40004, "Users not applied but got canceled.");
    public static final LinkCoreError REPLY_INVITE_BUT_NO_INVITE_MESSAGE = new LinkCoreError(-40005, "Users not invited but got replied.");
    public static final LinkCoreError PERMIT_APPLY_BUT_NO_APPLY_MESSAGE = new LinkCoreError(-40006, "Users not applied but got permitted");
    public static final LinkCoreError CHANNEL_ALREADY_ALLOCATED = new LinkCoreError(-50001, "Linker should only bind one channel Id.");
    public static final LinkCoreError FORCE_JOIN_RTC_CHANNEL_STATE_ERROR = new LinkCoreError(-70001, "Can not join rtc channel in this state.");
    public static final LinkCoreError FORCE_JOIN_RTC_CHANNEL_INVALID = new LinkCoreError(-70002, "Current user can not join rtc because the rtc extra info or the linkmicid is not required.");
    public static final LinkCoreError FORCE_JOIN_RTC_CHANNEL_INIT_ERROR = new LinkCoreError(-70003, "RTC turn on error cause invalid param.");
    public static final LinkCoreError RTC_INITIALIZED_BY_ONE_CHANNEL = new LinkCoreError(-80001, "RTC is already initialized by one channel.");
    public static final LinkCoreError RTC_TURN_ON_ERROR = new LinkCoreError(-80002, "RTC turn on error cause invalid param.");
    public static final LinkCoreError RTC_INIT_BACKGROUND = new LinkCoreError(-80003, "RTC turn on error cause init in background.");
    public static final LinkCoreError BLOCK_BY_BIZ_SIDE = new LinkCoreError(-90001, "Block by biz side");

    public static /* synthetic */ LinkCoreError copy$default(LinkCoreError linkCoreError, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = linkCoreError.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = linkCoreError.errorMsg;
        }
        return linkCoreError.copy(i, str);
    }

    public final LinkCoreError copy(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        return new LinkCoreError(i, errorMsg);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.errorCode), this.errorMsg};
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final LinkCoreError getAPPLY_IN_WAITING_STATE() {
            return LinkCoreError.APPLY_IN_WAITING_STATE;
        }

        public final LinkCoreError getBLOCK_BY_BIZ_SIDE() {
            return LinkCoreError.BLOCK_BY_BIZ_SIDE;
        }

        public final LinkCoreError getCANCEL_APPLY_BUT_NOT_APPLIED() {
            return LinkCoreError.CANCEL_APPLY_BUT_NOT_APPLIED;
        }

        public final LinkCoreError getCANCEL_INVITE_BUT_NOT_INVITED() {
            return LinkCoreError.CANCEL_INVITE_BUT_NOT_INVITED;
        }

        public final LinkCoreError getCHANNEL_ALREADY_ALLOCATED() {
            return LinkCoreError.CHANNEL_ALREADY_ALLOCATED;
        }

        public final LinkCoreError getCHANNEL_ID_INCONSISTENCY() {
            return LinkCoreError.CHANNEL_ID_INCONSISTENCY;
        }

        public final LinkCoreError getCHANNEL_ID_INVALID() {
            return LinkCoreError.CHANNEL_ID_INVALID;
        }

        public final LinkCoreError getCOMMON_RESPONSE_INVALID() {
            return LinkCoreError.COMMON_RESPONSE_INVALID;
        }

        public final LinkCoreError getCOMMON_UNKNOWN() {
            return LinkCoreError.COMMON_UNKNOWN;
        }

        public final LinkCoreError getFORCE_JOIN_RTC_CHANNEL_INIT_ERROR() {
            return LinkCoreError.FORCE_JOIN_RTC_CHANNEL_INIT_ERROR;
        }

        public final LinkCoreError getFORCE_JOIN_RTC_CHANNEL_INVALID() {
            return LinkCoreError.FORCE_JOIN_RTC_CHANNEL_INVALID;
        }

        public final LinkCoreError getFORCE_JOIN_RTC_CHANNEL_STATE_ERROR() {
            return LinkCoreError.FORCE_JOIN_RTC_CHANNEL_STATE_ERROR;
        }

        public final LinkCoreError getINVITE_SENT_TARGET_USER() {
            return LinkCoreError.INVITE_SENT_TARGET_USER;
        }

        public final LinkCoreError getINVITE_WITH_INVALID_UID() {
            return LinkCoreError.INVITE_WITH_INVALID_UID;
        }

        public final LinkCoreError getPERMIT_APPLY_BUT_NO_APPLY_MESSAGE() {
            return LinkCoreError.PERMIT_APPLY_BUT_NO_APPLY_MESSAGE;
        }

        public final LinkCoreError getREPLY_INVITE_BUT_NO_INVITE_MESSAGE() {
            return LinkCoreError.REPLY_INVITE_BUT_NO_INVITE_MESSAGE;
        }

        public final LinkCoreError getRTC_INITIALIZED_BY_ONE_CHANNEL() {
            return LinkCoreError.RTC_INITIALIZED_BY_ONE_CHANNEL;
        }

        public final LinkCoreError getRTC_INIT_BACKGROUND() {
            return LinkCoreError.RTC_INIT_BACKGROUND;
        }

        public final LinkCoreError getRTC_TURN_ON_ERROR() {
            return LinkCoreError.RTC_TURN_ON_ERROR;
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public LinkCoreError(int i, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.errorCode = i;
        this.errorMsg = errorMsg;
    }
}
