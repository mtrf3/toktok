package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.io.Serializable;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98593tv implements Serializable {
    public transient Context LJLIL;
    public String LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public IMUser LJLJLLL;
    public Integer LJLL;
    public IMContact LJLLI;
    public String LJLLILLLL;
    public AnonymousClass446 LJLLJ;
    public Serializable LJLLL;
    public boolean LJLLLL;
    public C98803uG LJLLLLLL;
    public boolean LJLZ;
    public int LJZ;
    public AbstractC82843My LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public C4FY LLFFF;
    public String LLFII;
    public boolean LLFZ;
    public String LLI;
    public String LLIFFJFJJ;
    public long LLII;
    public int LLIIII;
    public String LLIIIILZ;
    public int LLIIIJ;
    public String LLIIIL;
    public String LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public String LLIILII;
    public final String LLIILZL;
    public String LLIIZ;
    public java.util.Map<String, String> LLIL;
    public C100053wH LLILII;
    public int LLILIL;
    public Integer LLILL;
    public String LLILLIZIL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public Boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public Integer LLJJ;
    public boolean LLJJI;
    public Long LLJJIII;

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public static /* synthetic */ void getTransitionType$annotations() {
    }

    public final String getUserId() {
        IMUser iMUser = this.LJLJLLL;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return "";
    }

    public C98593tv() {
        this.LJLILLLLZI = "";
        this.LJLJI = -1;
        this.LJLJJL = "";
        this.LJLJL = "";
        this.LLFFF = C4FY.NO_STATUS;
        this.LLFII = "";
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLIIIILZ = "";
        this.LLIIIJ = -1;
        this.LLIIIL = "";
        this.LLIIIZ = "";
        this.LLIILII = "";
        this.LLIILZL = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LLIL = new LinkedHashMap();
        this.LLILIL = -1;
    }

    public final C4FY getActivityStatus() {
        return this.LLFFF;
    }

    public final String getAuthorId() {
        return this.LLIILII;
    }

    public final String getButtonType() {
        return this.LJLJLJ;
    }

    public final Serializable getChatExt() {
        return this.LJLLL;
    }

    public final int getChatType() {
        return this.LJLJI;
    }

    public final boolean getCheckWelcomeMsg() {
        return this.LLIZLLLIL;
    }

    public final Context getContext() {
        return this.LJLIL;
    }

    public final int getEnterFrom() {
        return this.LJLJJI;
    }

    public final String getEnterFromForMob() {
        return this.LJLJJL;
    }

    public final String getEnterFromSubPage() {
        return this.LJLJJLL;
    }

    public final String getEnterMethodForMob() {
        return this.LJLJL;
    }

    public final java.util.Map<String, String> getExtraMobParams() {
        return this.LLIL;
    }

    public final int getFollowStatus() {
        return this.LLIIIJ;
    }

    public final boolean getForceRefresh() {
        return this.LLJILJILJ;
    }

    public final boolean getFullScreenByDefault() {
        return this.LLILZLL;
    }

    public final String getGroupId() {
        return this.LLIIIILZ;
    }

    public final boolean getHasCameraIcon() {
        return this.LL;
    }

    public final boolean getHasUnreadDot() {
        return this.LLIIJLIL;
    }

    public final AnonymousClass446 getImAdLog() {
        return this.LJLLJ;
    }

    public final IMContact getImContact() {
        return this.LJLLI;
    }

    public final IMUser getImUser() {
        return this.LJLJLLL;
    }

    public final Integer getInboxType() {
        return this.LJLL;
    }

    public final int getInnerPushType() {
        return this.LLIIII;
    }

    public final boolean getKeepEnterFrom() {
        return this.LLD;
    }

    public final int getLastMessageMsgType() {
        return this.LLILIL;
    }

    public final String getLastMsgUUId() {
        return this.LLFII;
    }

    public final String getLastVideoPlayDuration() {
        return this.LLILZ;
    }

    public final long getMsgIdFromPush() {
        return this.LLII;
    }

    public final boolean getNoEvent() {
        return this.LJLZ;
    }

    public final String getPreviousPage() {
        return this.LLIIZ;
    }

    public final C100053wH getPushReferenceInfo() {
        return this.LLILII;
    }

    public final String getRecType() {
        return this.LLI;
    }

    public final C98803uG getReportParams() {
        return this.LJLLLLLL;
    }

    public final Long getScrollToMsgId() {
        return this.LLJJIII;
    }

    public final String getSearchId() {
        return this.LLILLJJLI;
    }

    public final String getSearchResultId() {
        return this.LLILLL;
    }

    public final String getSearchType() {
        return this.LLILLIZIL;
    }

    public final String getSectionType() {
        return this.LLJILLL;
    }

    public final String getSessionId() {
        return this.LJLILLLLZI;
    }

    public final String getShareUserId() {
        return this.LJLLILLLL;
    }

    public final boolean getShowKeyBoardByDefault() {
        return this.LLILZIL;
    }

    public final String getStoryCollectionId() {
        return this.LLIIIZ;
    }

    public final String getStoryType() {
        return this.LLIIIL;
    }

    public final String getToUserType() {
        return this.LLIFFJFJJ;
    }

    public final Integer getTransitionType() {
        return this.LLJJ;
    }

    public final int getUnreadCount() {
        return this.LJZ;
    }

    public final AbstractC82843My getUnreadViewState() {
        return this.LJZI;
    }

    public final String getUuid() {
        return this.LLIILZL;
    }

    public final Boolean getWelcomeMsgEnabled() {
        return this.LLIZ;
    }

    public final boolean isBookMode() {
        return this.LLJILJIL;
    }

    public final boolean isDissolvedGroup() {
        return this.LLJIJIL;
    }

    public final boolean isFiltered() {
        return this.LLFF;
    }

    public final boolean isHighRiskConversation() {
        return this.LLJ;
    }

    public final boolean isLastMsgRead() {
        return this.LLFZ;
    }

    public final boolean isMediaMsgMasking() {
        return this.LLJI;
    }

    public final boolean isQuickChat() {
        return this.LLIIL;
    }

    public final boolean isRecommendedChat() {
        return this.LJZL;
    }

    public final boolean isReportPage() {
        return this.LJLLLL;
    }

    public final boolean isReturnToInbox() {
        return this.LLJJI;
    }

    public final Integer isSearchScene() {
        return this.LLILL;
    }

    public final boolean isStickyTop() {
        return this.LLIIJI;
    }

    public final boolean isTCM() {
        return this.LLF;
    }

    public final void setActivityStatus(C4FY c4fy) {
        o.LJIIIZ(c4fy, "<set-?>");
        this.LLFFF = c4fy;
    }

    public final void setAuthorId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLIILII = str;
    }

    public final void setBookMode(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setButtonType(String str) {
        this.LJLJLJ = str;
    }

    public final void setChatExt(Serializable serializable) {
        this.LJLLL = serializable;
    }

    public final void setChatType(int i) {
        this.LJLJI = i;
    }

    public final void setCheckWelcomeMsg(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setContext(Context context) {
        this.LJLIL = context;
    }

    public final void setDissolvedGroup(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setEnterFrom(int i) {
        this.LJLJJI = i;
    }

    public final void setEnterFromForMob(String str) {
        this.LJLJJL = str;
    }

    public final void setEnterFromSubPage(String str) {
        this.LJLJJLL = str;
    }

    public final void setEnterMethodForMob(String str) {
        this.LJLJL = str;
    }

    public final void setExtraMobParams(java.util.Map<String, String> map) {
        o.LJIIIZ(map, "<set-?>");
        this.LLIL = map;
    }

    public final void setFiltered(boolean z) {
        this.LLFF = z;
    }

    public final void setFollowStatus(int i) {
        this.LLIIIJ = i;
    }

    public final void setForceRefresh(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setFullScreenByDefault(boolean z) {
        this.LLILZLL = z;
    }

    public final void setGroupId(String str) {
        this.LLIIIILZ = str;
    }

    public final void setHasCameraIcon(boolean z) {
        this.LL = z;
    }

    public final void setHasUnreadDot(boolean z) {
        this.LLIIJLIL = z;
    }

    public final void setHighRiskConversation(boolean z) {
        this.LLJ = z;
    }

    public final void setImAdLog(AnonymousClass446 anonymousClass446) {
        this.LJLLJ = anonymousClass446;
    }

    public final void setImContact(IMContact iMContact) {
        this.LJLLI = iMContact;
    }

    public final void setImUser(IMUser iMUser) {
        this.LJLJLLL = iMUser;
    }

    public final void setInboxType(Integer num) {
        this.LJLL = num;
    }

    public final void setInnerPushType(int i) {
        this.LLIIII = i;
    }

    public final void setKeepEnterFrom(boolean z) {
        this.LLD = z;
    }

    public final void setLastMessageMsgType(int i) {
        this.LLILIL = i;
    }

    public final void setLastMsgRead(boolean z) {
        this.LLFZ = z;
    }

    public final void setLastMsgUUId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLFII = str;
    }

    public final void setLastVideoPlayDuration(String str) {
        this.LLILZ = str;
    }

    public final void setMediaMsgMasking(boolean z) {
        this.LLJI = z;
    }

    public final void setMsgIdFromPush(long j) {
        this.LLII = j;
    }

    public final void setNoEvent(boolean z) {
        this.LJLZ = z;
    }

    public final void setPreviousPage(String str) {
        this.LLIIZ = str;
    }

    public final void setPushReferenceInfo(C100053wH c100053wH) {
        this.LLILII = c100053wH;
    }

    public final void setQuickChat(boolean z) {
        this.LLIIL = z;
    }

    public final void setRecType(String str) {
        this.LLI = str;
    }

    public final void setRecommendedChat(boolean z) {
        this.LJZL = z;
    }

    public final void setReportPage(boolean z) {
        this.LJLLLL = z;
    }

    public final void setReportParams(C98803uG c98803uG) {
        this.LJLLLLLL = c98803uG;
    }

    public final void setReturnToInbox(boolean z) {
        this.LLJJI = z;
    }

    public final void setScrollToMsgId(Long l) {
        this.LLJJIII = l;
    }

    public final void setSearchId(String str) {
        this.LLILLJJLI = str;
    }

    public final void setSearchResultId(String str) {
        this.LLILLL = str;
    }

    public final void setSearchScene(Integer num) {
        this.LLILL = num;
    }

    public final void setSearchType(String str) {
        this.LLILLIZIL = str;
    }

    public final void setSectionType(String str) {
        this.LLJILLL = str;
    }

    public final void setSessionId(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setShareUserId(String str) {
        this.LJLLILLLL = str;
    }

    public final void setShowKeyBoardByDefault(boolean z) {
        this.LLILZIL = z;
    }

    public final void setStickyTop(boolean z) {
        this.LLIIJI = z;
    }

    public final void setStoryCollectionId(String str) {
        this.LLIIIZ = str;
    }

    public final void setStoryType(String str) {
        this.LLIIIL = str;
    }

    public final void setTCM(boolean z) {
        this.LLF = z;
    }

    public final void setToUserType(String str) {
        this.LLIFFJFJJ = str;
    }

    public final void setTransitionType(Integer num) {
        this.LLJJ = num;
    }

    public final void setUnreadCount(int i) {
        this.LJZ = i;
    }

    public final void setUnreadViewState(AbstractC82843My abstractC82843My) {
        this.LJZI = abstractC82843My;
    }

    public final void setWelcomeMsgEnabled(Boolean bool) {
        this.LLIZ = bool;
    }

    public C98593tv(Context context, IMContact iMContact) {
        this.LJLILLLLZI = "";
        this.LJLJI = -1;
        this.LJLJJL = "";
        this.LJLJL = "";
        this.LLFFF = C4FY.NO_STATUS;
        this.LLFII = "";
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLIIIILZ = "";
        this.LLIIIJ = -1;
        this.LLIIIL = "";
        this.LLIIIZ = "";
        this.LLIILII = "";
        this.LLIILZL = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LLIL = new LinkedHashMap();
        this.LLILIL = -1;
        this.LJLIL = context;
        this.LJLLI = iMContact;
    }

    public C98593tv(Context context, IMUser iMUser) {
        this.LJLILLLLZI = "";
        this.LJLJI = -1;
        this.LJLJJL = "";
        this.LJLJL = "";
        this.LLFFF = C4FY.NO_STATUS;
        this.LLFII = "";
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLIIIILZ = "";
        this.LLIIIJ = -1;
        this.LLIIIL = "";
        this.LLIIIZ = "";
        this.LLIILII = "";
        this.LLIILZL = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LLIL = new LinkedHashMap();
        this.LLILIL = -1;
        this.LJLIL = context;
        this.LJLJLLL = iMUser;
    }

    public C98593tv(Context context, int i, String str) {
        this.LJLILLLLZI = "";
        this.LJLJI = -1;
        this.LJLJJL = "";
        this.LJLJL = "";
        this.LLFFF = C4FY.NO_STATUS;
        this.LLFII = "";
        this.LLI = "";
        this.LLIFFJFJJ = "";
        this.LLIIIILZ = "";
        this.LLIIIJ = -1;
        this.LLIIIL = "";
        this.LLIIIZ = "";
        this.LLIILII = "";
        this.LLIILZL = AnonymousClass629.LIZ("randomUUID().toString()");
        this.LLIL = new LinkedHashMap();
        this.LLILIL = -1;
        this.LJLIL = context;
        this.LJLJI = i;
        this.LJLILLLLZI = str;
    }
}
