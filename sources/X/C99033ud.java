package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3ud, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C99033ud implements Serializable {
    public static final C82223Ko Companion = new C82223Ko();
    public final String LJLIL;
    public String LJLILLLLZI;
    public boolean LJLJI;
    public List<? extends C109544Rq> LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public C71302r0 LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public C100053wH LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public int LJZI;
    public boolean LJZL;
    public boolean LL;
    public long LLD;
    public int LLF;
    public boolean LLFF;
    public C98803uG LLFFF;
    public String LLFII;
    public java.util.Map<String, String> LLFZ;
    public java.util.Map<String, String> LLI;
    public boolean LLIFFJFJJ;
    public List<String> LLII;
    public java.util.Map<String, String> LLIIII;
    public boolean LLIIIILZ;
    public Long LLIIIJ;

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public IMUser getSingleChatFromUser() {
        return null;
    }

    public String getSingleChatFromUserId() {
        return null;
    }

    public final boolean hasChatHistory() {
        int i = this.LJZ;
        if (i > 0 && i != 15) {
            return true;
        }
        return false;
    }

    public final boolean isAuthorSupporterChat() {
        if (this.LJLJJL == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEnterpriseChat() {
        if (this.LJLJJL == 2) {
            return true;
        }
        return false;
    }

    public final boolean isFriendChat() {
        if (this.LJLJJL == 0) {
            return true;
        }
        return false;
    }

    public final boolean isGroupChat() {
        if (this.LJLJJL == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSingleChat() {
        int i = this.LJLJJL;
        if (i == 0 || i == 1 || i == 2 || i == 4) {
            return true;
        }
        return false;
    }

    public final boolean isStrangerChat() {
        if (this.LJLJJL == 1) {
            return true;
        }
        return false;
    }

    public final boolean isTakoChat$im_base_release() {
        C82223Ko c82223Ko = Companion;
        String str = this.LJLILLLLZI;
        c82223Ko.getClass();
        return C82223Ko.LIZ(str);
    }

    public final String getAuthorId() {
        return this.LJLLILLLL;
    }

    public final List<String> getAutoSendMessageContent() {
        return this.LLII;
    }

    public final java.util.Map<String, String> getAutoSendMessageExtra() {
        return this.LLIIII;
    }

    public final java.util.Map<String, String> getBotQueryRequestExtra() {
        return this.LLFZ;
    }

    public final java.util.Map<String, String> getBotSendParams() {
        return this.LLI;
    }

    public final int getChatType() {
        return this.LJLJJL;
    }

    public final String getConversationId() {
        return this.LJLILLLLZI;
    }

    public final int getDefaultMsgSelectedNum() {
        return this.LJZI;
    }

    public final boolean getDisableLocateMsgWhenEnter() {
        return this.LLIFFJFJJ;
    }

    public final int getEnterFrom() {
        return this.LJLJJLL;
    }

    public final String getEnterFromForMob() {
        return this.LJLJL;
    }

    public final String getEnterMethod() {
        return this.LJLLI;
    }

    public final String getGroupId() {
        return this.LJLLJ;
    }

    public final int getInnerPushType() {
        return this.LLF;
    }

    public final int getLastMessageMsgType() {
        return this.LJZ;
    }

    public final String getLastMsgUUIdWhenEnterChatRoom() {
        return this.LJLLLL;
    }

    public final long getMsgIdFromPush() {
        return this.LLD;
    }

    public final String getPanelSourceForMob() {
        return this.LJLJLJ;
    }

    public final C100053wH getPushReferenceInfo() {
        return this.LJLLL;
    }

    public final C98803uG getReportParams() {
        return this.LLFFF;
    }

    public final Long getScrollToMsgId() {
        return this.LLIIIJ;
    }

    public final String getSearchId() {
        return this.LLFII;
    }

    public final List<C109544Rq> getSelectMsgList() {
        return this.LJLJJI;
    }

    public final boolean getShowKeyBoardByDefault() {
        return this.LJZL;
    }

    public final C71302r0 getStatisticsParams() {
        return this.LJLJLLL;
    }

    public final int getUnreadCount() {
        return this.LJLL;
    }

    public final String getUuid() {
        return this.LJLIL;
    }

    public final boolean isBookMode() {
        return this.LJLZ;
    }

    public final boolean isDissolvedGroup() {
        return this.LLIIIILZ;
    }

    public final boolean isHighRiskConversation() {
        return this.LL;
    }

    public final boolean isLastMsgReadWhenEnterChatRoom() {
        return this.LJLLLLLL;
    }

    public final boolean isMediaMsgMasking() {
        return this.LLFF;
    }

    public final boolean isReportPage() {
        return this.LJLJI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C99033ud(String uuid) {
        o.LJIIIZ(uuid, "uuid");
        this.LJLIL = uuid;
        this.LJLILLLLZI = "";
        this.LJLJL = "";
        this.LJLJLJ = "";
        this.LJLJLLL = new C71302r0(null, 1, 0 == true ? 1 : 0);
        this.LJLLI = "";
        this.LJLLILLLL = "";
        this.LJLLJ = "";
        this.LJLLLL = "";
        this.LJZ = -1;
    }

    public final void setAuthorId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLILLLL = str;
    }

    public final void setAutoSendMessageContent(List<String> list) {
        this.LLII = list;
    }

    public final void setAutoSendMessageExtra(java.util.Map<String, String> map) {
        this.LLIIII = map;
    }

    public final void setBookMode(boolean z) {
        this.LJLZ = z;
    }

    public final void setBotQueryRequestExtra(java.util.Map<String, String> map) {
        this.LLFZ = map;
    }

    public final void setBotSendParams(java.util.Map<String, String> map) {
        this.LLI = map;
    }

    public final void setChatType(int i) {
        this.LJLJJL = i;
    }

    public final void setConversationId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setDefaultMsgSelectedNum(int i) {
        this.LJZI = i;
    }

    public final void setDisableLocateMsgWhenEnter(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public final void setDissolvedGroup(boolean z) {
        this.LLIIIILZ = z;
    }

    public final void setEnterFrom(int i) {
        this.LJLJJLL = i;
    }

    public final void setEnterFromForMob(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJL = str;
    }

    public final void setEnterMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLI = str;
    }

    public final void setGroupId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLJ = str;
    }

    public final void setHighRiskConversation(boolean z) {
        this.LL = z;
    }

    public final void setInnerPushType(int i) {
        this.LLF = i;
    }

    public final void setLastMessageMsgType(int i) {
        this.LJZ = i;
    }

    public final void setLastMsgReadWhenEnterChatRoom(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setLastMsgUUIdWhenEnterChatRoom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLLL = str;
    }

    public final void setMediaMsgMasking(boolean z) {
        this.LLFF = z;
    }

    public final void setMsgIdFromPush(long j) {
        this.LLD = j;
    }

    public final void setPanelSourceForMob(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJLJ = str;
    }

    public final void setPushReferenceInfo(C100053wH c100053wH) {
        this.LJLLL = c100053wH;
    }

    public final void setReportPage(boolean z) {
        this.LJLJI = z;
    }

    public final void setReportParams(C98803uG c98803uG) {
        this.LLFFF = c98803uG;
    }

    public final void setScrollToMsgId(Long l) {
        this.LLIIIJ = l;
    }

    public final void setSearchId(String str) {
        this.LLFII = str;
    }

    public final void setSelectMsgList(List<? extends C109544Rq> list) {
        this.LJLJJI = list;
    }

    public final void setShowKeyBoardByDefault(boolean z) {
        this.LJZL = z;
    }

    public final void setStatisticsParams(C71302r0 c71302r0) {
        o.LJIIIZ(c71302r0, "<set-?>");
        this.LJLJLLL = c71302r0;
    }

    public final void setUnreadCount(int i) {
        this.LJLL = i;
    }
}
