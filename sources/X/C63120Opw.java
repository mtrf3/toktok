package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Opw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63120Opw implements Serializable, Comparable<C63120Opw>, Cloneable {
    public int badgeCount;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public C63088OpQ coreInfo;
    public String draftContent;
    public long draftTime;
    public boolean hasMore = true;
    public int inboxType;
    public boolean isFiltered;
    public boolean isInBox;
    public boolean isMember;
    public boolean isPreview;
    public boolean isStranger;
    public long lastMessageIndex;
    public long lastMessageOrderIndex;
    public String lastMessageUuid;
    public C109544Rq lastShowMessage;
    public java.util.Map<String, String> localExt;
    public long maxIndexV2;
    public C63089OpR member;
    public int memberCount;
    public List<Long> memberIds;
    public List<C63089OpR> members;
    public long minIndex;
    public long minIndexV2;
    public int readBadgeCount;
    public long readIndex;
    public long readIndexV2;
    public C63090OpS settingInfo;
    public List<C63089OpR> singleChatMembers;
    public long sortOrder;
    public int status;
    public long unreadCount;
    public List<C109544Rq> unreadSelfMentionedMessages;
    public long updatedTime;

    public synchronized java.util.Map<String, String> getExt() {
        java.util.Map<String, String> map;
        C63090OpS c63090OpS = this.settingInfo;
        if (c63090OpS != null) {
            map = c63090OpS.getExt();
        } else {
            map = null;
        }
        return map;
    }

    public synchronized java.util.Map<String, String> getLocalExt() {
        if (this.localExt == null) {
            this.localExt = new ConcurrentHashMap();
        }
        return this.localExt;
    }

    public int getCategory() {
        C63090OpS c63090OpS = this.settingInfo;
        if (c63090OpS != null) {
            return c63090OpS.getCategory();
        }
        return EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY.getValue();
    }

    public String getLocalExtStr() {
        return C63682Oz0.LIZ(this.localExt);
    }

    public List<Long> getMemberIds() {
        List<Long> list = this.memberIds;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    public String getMemberStr() {
        C63089OpR c63089OpR = this.member;
        if (c63089OpR != null) {
            try {
                return C63682Oz0.LIZ.LJIILL(c63089OpR);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public int getMuted() {
        C63090OpS c63090OpS = this.settingInfo;
        if (c63090OpS != null) {
            return c63090OpS.getMute();
        }
        return 0;
    }

    public int getStickTop() {
        C63090OpS c63090OpS = this.settingInfo;
        if (c63090OpS != null) {
            return c63090OpS.getStickTop();
        }
        return 0;
    }

    public int hashCode() {
        String str = this.conversationId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isDissolved() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public boolean isFavorite() {
        C63090OpS c63090OpS = this.settingInfo;
        if (c63090OpS != null && c63090OpS.isFavor()) {
            return true;
        }
        return false;
    }

    public boolean isGroupChat() {
        if (this.conversationType == AbstractC63505Ow9.LIZIZ) {
            return true;
        }
        return false;
    }

    public boolean isHide() {
        java.util.Map<String, String> map = this.localExt;
        if (map != null && map.containsKey("s:hide_conv_when_msg_index")) {
            try {
                if (CastLongProtector.parseLong(this.localExt.get("s:hide_conv_when_msg_index")) < this.lastMessageIndex) {
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    public boolean isLiveChat() {
        if (this.conversationType == AbstractC63505Ow9.LIZJ) {
            return true;
        }
        return false;
    }

    public boolean isLocal() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        C63090OpS c63090OpS = this.settingInfo;
        if (c63090OpS != null && c63090OpS.isMute()) {
            return true;
        }
        return false;
    }

    public boolean isReadBadgeCountUpdated() {
        if (this.readBadgeCount > 0 || TextUtils.equals(getLocalExt().get("s:read_badge_count_update"), "1")) {
            return true;
        }
        return false;
    }

    public boolean isSingleChat() {
        if (this.conversationType == AbstractC63505Ow9.LIZ) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        C63090OpS c63090OpS = this.settingInfo;
        if (c63090OpS != null && c63090OpS.isStickTop()) {
            return true;
        }
        return false;
    }

    public boolean isTemp() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public boolean isWaitingInfo() {
        java.util.Map<String, String> map = this.localExt;
        if (map != null && map.containsKey("s:conv_wait_info")) {
            return true;
        }
        return false;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C63120Opw m26clone() {
        try {
            return (C63120Opw) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Conversation{conversationId='");
        Q89.LIZIZ(LIZ, this.conversationId, '\'', ", conversationShortId=");
        LIZ.append(this.conversationShortId);
        LIZ.append(", conversationType=");
        LIZ.append(this.conversationType);
        LIZ.append(", isMember=");
        LIZ.append(this.isMember);
        LIZ.append(", memberCount=");
        LIZ.append(this.memberCount);
        LIZ.append(", unreadCount=");
        LIZ.append(this.unreadCount);
        LIZ.append(", updatedTime=");
        LIZ.append(this.updatedTime);
        LIZ.append(", readIndex=");
        LIZ.append(this.readIndex);
        LIZ.append(", lastMessageIndex=");
        LIZ.append(this.lastMessageIndex);
        LIZ.append(", inboxType=");
        LIZ.append(this.inboxType);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", draftTime=");
        LIZ.append(this.draftTime);
        LIZ.append(", draftContent='");
        Q89.LIZIZ(LIZ, this.draftContent, '\'', ", sortOrder=");
        LIZ.append(this.sortOrder);
        LIZ.append(", localExt=");
        LIZ.append(this.localExt);
        LIZ.append(", memberIds=");
        LIZ.append(this.memberIds);
        LIZ.append(", lastMessage=");
        LIZ.append(this.lastShowMessage);
        LIZ.append(", member=");
        LIZ.append(this.member);
        LIZ.append(", isStranger=");
        LIZ.append(this.isStranger);
        LIZ.append(", isInBox=");
        LIZ.append(this.isInBox);
        LIZ.append(", members=");
        LIZ.append(this.members);
        LIZ.append(", isPreview=");
        return C48339Iy7.LIZJ(LIZ, this.isPreview, '}', LIZ);
    }

    public int getBadgeCount() {
        return this.badgeCount;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public C63088OpQ getCoreInfo() {
        return this.coreInfo;
    }

    public String getDraftContent() {
        return this.draftContent;
    }

    public long getDraftTime() {
        return this.draftTime;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public long getLastMessageIndex() {
        return this.lastMessageIndex;
    }

    public long getLastMessageOrderIndex() {
        return this.lastMessageOrderIndex;
    }

    public String getLastMessageUuid() {
        return this.lastMessageUuid;
    }

    public C109544Rq getLastShowMessage() {
        return this.lastShowMessage;
    }

    public long getMaxIndexV2() {
        return this.maxIndexV2;
    }

    public C63089OpR getMember() {
        return this.member;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public List<C63089OpR> getMembers() {
        return this.members;
    }

    public long getMinIndex() {
        return this.minIndex;
    }

    public long getMinIndexV2() {
        return this.minIndexV2;
    }

    public int getReadBadgeCount() {
        return this.readBadgeCount;
    }

    public long getReadIndex() {
        return this.readIndex;
    }

    public long getReadIndexV2() {
        return this.readIndexV2;
    }

    public C63090OpS getSettingInfo() {
        return this.settingInfo;
    }

    public List<C63089OpR> getSingleChatMembers() {
        return this.singleChatMembers;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUnreadCount() {
        return this.unreadCount;
    }

    public List<C109544Rq> getUnreadSelfMentionedMessages() {
        return this.unreadSelfMentionedMessages;
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public boolean isFiltered() {
        return this.isFiltered;
    }

    public boolean isInBox() {
        return this.isInBox;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isStranger() {
        return this.isStranger;
    }

    private java.util.Map<String, String> convertToSynchronizedMap(java.util.Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map instanceof ConcurrentHashMap) {
            return map;
        }
        try {
            return new ConcurrentHashMap(map);
        } catch (NullPointerException unused) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    concurrentHashMap.put(entry.getKey(), entry.getValue());
                } else if (entry.getKey() != null) {
                    concurrentHashMap.put(entry.getKey(), "");
                }
            }
            return concurrentHashMap;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(C63120Opw c63120Opw) {
        if (c63120Opw.getStickTop() != getStickTop()) {
            return c63120Opw.getStickTop() - getStickTop();
        }
        long max = Math.max(c63120Opw.getUpdatedTime(), c63120Opw.getDraftTime()) - Math.max(getUpdatedTime(), getDraftTime());
        if (max > 0) {
            return 1;
        }
        if (max < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C63120Opw.class != obj.getClass()) {
            return false;
        }
        String str = this.conversationId;
        String str2 = ((C63120Opw) obj).conversationId;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public boolean removeMentionMessage(String str) {
        List<C109544Rq> list = this.unreadSelfMentionedMessages;
        if (list != null && !list.isEmpty()) {
            for (C109544Rq c109544Rq : this.unreadSelfMentionedMessages) {
                if (TextUtils.equals(str, c109544Rq.getUuid())) {
                    this.unreadSelfMentionedMessages.remove(c109544Rq);
                    return true;
                }
            }
        }
        return false;
    }

    public void setBadgeCount(int i) {
        if (i > this.badgeCount) {
            this.badgeCount = i;
        }
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j) {
        this.conversationShortId = j;
    }

    public void setConversationType(int i) {
        this.conversationType = i;
    }

    public void setCoreInfo(C63088OpQ c63088OpQ) {
        this.coreInfo = c63088OpQ;
    }

    public void setDraftContent(String str) {
        this.draftContent = str;
    }

    public void setDraftTime(long j) {
        this.draftTime = j;
    }

    public void setFiltered(boolean z) {
        this.isFiltered = z;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInBox(boolean z) {
        this.isInBox = z;
    }

    public void setInboxType(int i) {
        this.inboxType = i;
    }

    public void setIsMember(boolean z) {
        this.isMember = z;
    }

    public void setLastMessageIndex(long j) {
        this.lastMessageIndex = j;
    }

    public void setLastMessageOrderIndex(long j) {
        if (this.lastMessageOrderIndex < j) {
            this.lastMessageOrderIndex = j;
        }
    }

    public void setLastMessageUuid(String str) {
        this.lastMessageUuid = str;
    }

    public void setLastShowMessage(C109544Rq c109544Rq) {
        this.lastShowMessage = c109544Rq;
        if (c109544Rq != null) {
            setLastMessageOrderIndex(c109544Rq.getOrderIndex());
            setLastMessageUuid(c109544Rq.getUuid());
        }
    }

    public void setLocalExt(java.util.Map<String, String> map) {
        this.localExt = convertToSynchronizedMap(map);
    }

    public void setLocalExtStr(String str) {
        this.localExt = convertToSynchronizedMap(C63682Oz0.LIZIZ(str));
    }

    public void setMaxIndexV2(long j) {
        if (j > this.maxIndexV2) {
            this.maxIndexV2 = j;
        }
    }

    public void setMember(C63089OpR c63089OpR) {
        this.member = c63089OpR;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setMemberIds(List<Long> list) {
        this.memberIds = list;
    }

    public void setMemberStr(String str) {
        C63089OpR c63089OpR = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                c63089OpR = (C63089OpR) C63682Oz0.LIZ.LJI(str, C63089OpR.class);
            }
        } catch (Exception unused) {
        }
        this.member = c63089OpR;
    }

    public void setMembers(List<C63089OpR> list) {
        this.members = list;
    }

    public void setMinIndex(long j) {
        if (j > this.minIndex) {
            this.minIndex = j;
        }
    }

    public void setMinIndexV2(long j) {
        if (j > this.minIndexV2) {
            this.minIndexV2 = j;
        }
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setReadBadgeCount(int i) {
        if (i > this.readBadgeCount) {
            this.readBadgeCount = i;
        }
    }

    public void setReadIndex(long j) {
        this.readIndex = j;
    }

    public void setReadIndexV2(long j) {
        if (j > this.readIndexV2) {
            this.readIndexV2 = j;
        }
    }

    public void setSettingInfo(C63090OpS c63090OpS) {
        this.settingInfo = c63090OpS;
    }

    public void setSingleChatMembers(List<C63089OpR> list) {
        this.singleChatMembers = list;
    }

    public void setSortOrder(long j) {
        this.sortOrder = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStranger(boolean z) {
        this.isStranger = z;
    }

    public void setUnreadCount(long j) {
        this.unreadCount = j;
    }

    public void setUnreadSelfMentionedMessages(List<C109544Rq> list) {
        this.unreadSelfMentionedMessages = list;
    }

    public void setUpdatedTime(long j) {
        this.updatedTime = j;
    }
}
