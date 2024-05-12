package com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper;

import X.C05040Hs;
import X.C1FJ;
import X.C98663u2;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.DMNavArg;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMNavArg implements IRouteArg {
    public final Integer chatType;
    public final String conversationId;
    public final String enterFrom;
    public final String enterMethod;
    public final Integer isGroupMemberRequest;
    public final String jumpedFromInviteId;
    public final Integer messageCount;
    public final Integer messagePreviewEnabled;
    public final long msgIdFromPush;
    public final String noticeType;
    public final String refMessageContent;
    public final Long refMessageId;
    public final Long refMessageSenderUid;
    public final Integer refMessageType;
    public static final C98663u2 Companion = new Object() { // from class: X.3u2
    };
    public static final Parcelable.Creator<DMNavArg> CREATOR = new Parcelable.Creator<DMNavArg>() { // from class: X.3u1
        @Override // android.os.Parcelable.Creator
        public final DMNavArg createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            Integer valueOf4;
            Long valueOf5;
            Integer valueOf6;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Long l = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            long readLong = parcel.readLong();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Integer.valueOf(parcel.readInt());
            }
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                l = Long.valueOf(parcel.readLong());
            }
            return new DMNavArg(readString, readString2, valueOf, readString3, readString4, readString5, readLong, valueOf2, valueOf3, valueOf4, readString6, valueOf5, valueOf6, l);
        }

        @Override // android.os.Parcelable.Creator
        public final DMNavArg[] newArray(int i) {
            return new DMNavArg[i];
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16382, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16380, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num) {
        this(str, str2, num, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16376, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3) {
        this(str, str2, num, str3, null, 0 == true ? 1 : 0, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16368, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4) {
        this(str, str2, num, str3, str4, null, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16352, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5) {
        this(str, str2, num, str3, str4, str5, 0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16320, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j) {
        this(str, str2, num, str3, str4, str5, j, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16256, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2) {
        this(str, str2, num, str3, str4, str5, j, num2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16128, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15872, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15360, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14336, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, null, 0 == true ? 1 : 0, 12288, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5) {
        this(str, str2, num, str3, str4, str5, j, num2, num3, num4, str6, l, num5, null, FileUtils.BUFFER_SIZE, 0 == true ? 1 : 0);
    }

    public static DMNavArg __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        Long l;
        Integer num2;
        Integer num3;
        Integer num4;
        String str6;
        Long l2;
        Integer num5;
        Long l3 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("enter_from")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("enter_method")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("message_cnt")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("message_cnt"), Integer.class);
        } else {
            i += 4;
            num = null;
        }
        if (bundle.containsKey("notice_type")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("notice_type"), String.class);
        } else {
            i += 8;
            str3 = null;
        }
        if (bundle.containsKey("im_group_invite_id")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("im_group_invite_id"), String.class);
        } else {
            i += 16;
            str4 = null;
        }
        if (bundle.containsKey("conversation_id")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("conversation_id"), String.class);
        } else {
            i += 32;
            str5 = null;
        }
        if (bundle.containsKey("msg_id")) {
            l = (Long) RouteParser.INSTANCE.parse(bundle.get("msg_id"), Long.class);
            if (l == null) {
                i += 64;
            }
        } else {
            i += 64;
            l = null;
        }
        if (bundle.containsKey("is_member_request")) {
            num2 = (Integer) RouteParser.INSTANCE.parse(bundle.get("is_member_request"), Integer.class);
        } else {
            i += 128;
            num2 = null;
        }
        if (bundle.containsKey("chat_type")) {
            num3 = (Integer) RouteParser.INSTANCE.parse(bundle.get("chat_type"), Integer.class);
        } else {
            i += 256;
            num3 = null;
        }
        if (bundle.containsKey("message_preview_enabled")) {
            num4 = (Integer) RouteParser.INSTANCE.parse(bundle.get("message_preview_enabled"), Integer.class);
        } else {
            i += 512;
            num4 = null;
        }
        if (bundle.containsKey("reply_to_message_content")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("reply_to_message_content"), String.class);
        } else {
            i += 1024;
            str6 = null;
        }
        if (bundle.containsKey("reply_to_message_server_id")) {
            l2 = (Long) RouteParser.INSTANCE.parse(bundle.get("reply_to_message_server_id"), Long.class);
        } else {
            i += 2048;
            l2 = null;
        }
        if (bundle.containsKey("reply_to_message_type")) {
            num5 = (Integer) RouteParser.INSTANCE.parse(bundle.get("reply_to_message_type"), Integer.class);
        } else {
            i += 4096;
            num5 = null;
        }
        if (bundle.containsKey("reply_to_message_from_uid")) {
            l3 = (Long) RouteParser.INSTANCE.parse(bundle.get("reply_to_message_from_uid"), Long.class);
        } else {
            i += FileUtils.BUFFER_SIZE;
        }
        return new DMNavArg(str, str2, num, str3, str4, str5, l != null ? l.longValue() : 0L, num2, num3, num4, str6, l2, num5, l3, i, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer getChatType() {
        return this.chatType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getJumpedFromInviteId() {
        return this.jumpedFromInviteId;
    }

    public final Integer getMessageCount() {
        return this.messageCount;
    }

    public final Integer getMessagePreviewEnabled() {
        return this.messagePreviewEnabled;
    }

    public final long getMsgIdFromPush() {
        return this.msgIdFromPush;
    }

    public final String getNoticeType() {
        return this.noticeType;
    }

    public final String getRefMessageContent() {
        return this.refMessageContent;
    }

    public final Long getRefMessageId() {
        return this.refMessageId;
    }

    public final Long getRefMessageSenderUid() {
        return this.refMessageSenderUid;
    }

    public final Integer getRefMessageType() {
        return this.refMessageType;
    }

    public final Integer isGroupMemberRequest() {
        return this.isGroupMemberRequest;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.enterFrom);
        out.writeString(this.enterMethod);
        Integer num = this.messageCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.noticeType);
        out.writeString(this.jumpedFromInviteId);
        out.writeString(this.conversationId);
        out.writeLong(this.msgIdFromPush);
        Integer num2 = this.isGroupMemberRequest;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Integer num3 = this.chatType;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num3);
        }
        Integer num4 = this.messagePreviewEnabled;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num4);
        }
        out.writeString(this.refMessageContent);
        Long l = this.refMessageId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Integer num5 = this.refMessageType;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num5);
        }
        Long l2 = this.refMessageSenderUid;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
    }

    public DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.messageCount = num;
        this.noticeType = str3;
        this.jumpedFromInviteId = str4;
        this.conversationId = str5;
        this.msgIdFromPush = j;
        this.isGroupMemberRequest = num2;
        this.chatType = num3;
        this.messagePreviewEnabled = num4;
        this.refMessageContent = str6;
        this.refMessageId = l;
        this.refMessageType = num5;
        this.refMessageSenderUid = l2;
    }

    public /* synthetic */ DMNavArg(String str, String str2, Integer num, String str3, String str4, String str5, long j, Integer num2, Integer num3, Integer num4, String str6, Long l, Integer num5, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? 0L : j, (i & 128) != 0 ? 0 : num2, (i & 256) != 0 ? 0 : num3, (i & 512) != 0 ? 0 : num4, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : l, (i & 4096) != 0 ? null : num5, (i & FileUtils.BUFFER_SIZE) == 0 ? l2 : null);
    }
}
