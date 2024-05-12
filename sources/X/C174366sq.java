package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: X.6sq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174366sq extends C174376sr<C174366sq> {
    public static final long serialVersionUID = -8706130331733501305L;
    public int LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public Aweme LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public String LJLZ;
    public int LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public boolean LLD;
    public boolean LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public java.util.Map<String, String> LLIFFJFJJ;
    public String LLII;
    public transient C75O LLIIII;
    public transient InterfaceC218588hy LLIIIILZ;
    public CommentStruct LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public boolean LLILIL;
    public boolean LLILL;
    public boolean LLILLIZIL;
    public int LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;
    public List<User> LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public long LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public long LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public float LLJL;
    public long LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public String LLLFF;

    public CommentStruct getAdCommentStruct() {
        CommentStruct commentStruct = this.LLIIIJ;
        if (commentStruct == null) {
            return null;
        }
        commentStruct.setAwemeId(this.LJLILLLLZI);
        User user = new User();
        user.setUid(this.LJLJI);
        user.setAvatarThumb(this.LLIIIJ.getAvatarIcon());
        this.LLIIIJ.setUser(user);
        this.LLIIIJ.setCommentType(10);
        return this.LLIIIJ;
    }

    public String getCommentTag() {
        String str = this.LJLJJLL;
        str.getClass();
        if (!str.equals("collection") && !str.equals("opus")) {
            return this.LJLJJLL;
        }
        if (isMyProfile()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public String getEnterFrom() {
        if (TextUtils.isEmpty(this.LJLJJL)) {
            int i = this.LJLLI;
            if (i != 1000) {
                if (i != 1001) {
                    if (i != 2000) {
                        if (i != 2001) {
                            return this.LJLJJLL;
                        }
                        return "others_collection";
                    }
                    return "others_homepage";
                }
                return "personal_collection";
            }
            return "personal_homepage";
        }
        return this.LJLJJL;
    }

    public String getFromPage() {
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = "";
        }
        return this.LJLLILLLL;
    }

    public Boolean getIsFromPostMode() {
        return Boolean.valueOf(this.LLJJJJLIIL);
    }

    public boolean isLandscapeMode() {
        if (getOrientationMode() == 1) {
            return true;
        }
        return false;
    }

    public String getAutoReplyMethod() {
        return this.LLL;
    }

    public Aweme getAweme() {
        return this.LJLLL;
    }

    public long getCommentCount() {
        return this.LLJJIII;
    }

    public String getCommentEnterMethod() {
        return this.LLJJIJIL;
    }

    public int getCommentNotice() {
        return this.LLJJJJJIL;
    }

    public String getCreationId() {
        return this.LLJILJILJ;
    }

    public String getEnterMethod() {
        return this.LLILLL;
    }

    public String getEnterPosition() {
        return this.LLLF;
    }

    public String getEventType() {
        return this.LJLJJLL;
    }

    public String getFromGroupId() {
        return this.LLJJJIL;
    }

    public String getHintCids() {
        return this.LJZL;
    }

    public java.util.Map<String, String> getHotPlayerMap() {
        return this.LLIFFJFJJ;
    }

    public String getInsertCids() {
        return this.LJZI;
    }

    public String getInsertLikeUserIds() {
        return this.LJLZ;
    }

    public String getInsertVid() {
        return this.LL;
    }

    public int getIsLongItem() {
        return this.LLILLJJLI;
    }

    public String getLabelText() {
        return this.LLLFF;
    }

    public int getLabelType() {
        return this.LLJJIJI;
    }

    public String getLastGroupId() {
        return this.LLJJJ;
    }

    public int getLikeUserCount() {
        return this.LJZ;
    }

    public List<User> getLikeUsers() {
        return this.LLJIJIL;
    }

    public int getLocatePageType() {
        return this.LJLLLL;
    }

    public String getNewsId() {
        return this.LLJJJJ;
    }

    public String getNowType() {
        return this.LLJZIJLIL;
    }

    public InterfaceC218588hy getOnScrollStateChangedListener() {
        return this.LLIIIILZ;
    }

    public C75O getOnShowHeightChangeListener() {
        return this.LLIIII;
    }

    public int getOrientationMode() {
        return this.LLJLLL;
    }

    public int getPageType() {
        return this.LJLLI;
    }

    public String getParentTagId() {
        return this.LLILZIL;
    }

    public String getPlayListId() {
        return this.LLIZLLLIL;
    }

    public String getPlayListIdKey() {
        return this.LLIZ;
    }

    public String getPlayListType() {
        return this.LLILZLL;
    }

    public int getPlayLoops() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public float getPlayPct() {
        return this.LLJL;
    }

    public String getPreviousPage() {
        return this.LLII;
    }

    public String getRequestId() {
        return this.LJLJL;
    }

    public String getSearchId() {
        return this.LLJJ;
    }

    public String getSearchResultId() {
        return this.LLJJI;
    }

    public long getSessionId() {
        return this.LLJLIL;
    }

    public int getSource() {
        return this.LJLJJI;
    }

    public String getSplitContainerTag() {
        return this.LLJLL;
    }

    public String getTabName() {
        return this.LLJ;
    }

    public String getTagId() {
        return this.LLILZ;
    }

    public String getTempEnterMethod() {
        return this.LLJJIJIIJIL;
    }

    public long getVideoDuration() {
        return this.LLJJL;
    }

    public String getVideoFrom() {
        return this.LLJLILLLLZIIL;
    }

    public boolean isCommentClose() {
        return this.LLIIIZ;
    }

    public boolean isCommentLimited() {
        return this.LLIIJI;
    }

    public boolean isEnableComment() {
        return this.LJLL;
    }

    public boolean isEnableMinInnerCommentPanelHeight() {
        return this.LLIILZL;
    }

    public boolean isEnterFullScreen() {
        return this.LLJI;
    }

    public boolean isForceHideBatchManagementView() {
        return this.LLILIL;
    }

    public boolean isForceHideCommentDesc() {
        return this.LLILL;
    }

    public boolean isForceHideDonation() {
        return this.LLIL;
    }

    public boolean isForceHideKeyboard() {
        return this.LLFFF;
    }

    public boolean isForceHidePoi() {
        return this.LLILII;
    }

    public boolean isForceHideReplyWithVideo() {
        return this.LLIIL;
    }

    public boolean isForceOpenReply() {
        return this.LLFF;
    }

    public boolean isForceRefresh() {
        return this.LLIIIL;
    }

    public boolean isFromPostList() {
        return this.LLJILLL;
    }

    public boolean isHotPlayer() {
        return this.LLI;
    }

    public boolean isMyProfile() {
        return this.LJLJLLL;
    }

    public boolean isNeedAutoLikeComment() {
        return this.LLFII;
    }

    public boolean isNeedShowReplyPanel() {
        return this.LLFZ;
    }

    public boolean isNoPermissionVideo() {
        return this.LLJZ;
    }

    public boolean isPrivateAweme() {
        return this.LJLJLJ;
    }

    public boolean isScrollToTop() {
        return this.LLD;
    }

    public boolean isShowBackgroundOverlay() {
        return this.LLIIZ;
    }

    public boolean isShowEmptyCommentTips() {
        return this.LLIIJLIL;
    }

    public boolean isShowLikeUsers() {
        return this.LLJILJIL;
    }

    public boolean isShowTitle() {
        return this.LJLLJ;
    }

    public boolean isShowTopToastAfterComment() {
        return this.LLIILII;
    }

    public boolean isSmoothScrollLocate() {
        return this.LJLLLLLL;
    }

    public boolean isSplitMode() {
        return this.LLJLLIL;
    }

    public boolean shouldShowVideoDesc() {
        return this.LLILLIZIL;
    }

    public boolean showReplyWithInsertCid() {
        return this.LLF;
    }

    public C174366sq(String str) {
        super(str);
        this.LLJJIJI = -1;
        this.LLJJIJIL = "";
        this.LLJJJ = "";
        this.LLJZIJLIL = "post";
    }

    public C174366sq forceRefresh(boolean z) {
        this.LLIIIL = z;
        return this;
    }

    public C174366sq setAdCommentStruct(CommentStruct commentStruct) {
        this.LLIIIJ = commentStruct;
        return this;
    }

    public C174366sq setAutoReplyMethod(String str) {
        this.LLL = str;
        return this;
    }

    public C174366sq setAweme(Aweme aweme) {
        this.LJLLL = aweme;
        return this;
    }

    public C174366sq setCommentClose(boolean z) {
        this.LLIIIZ = z;
        return this;
    }

    public C174366sq setCommentCount(long j) {
        this.LLJJIII = j;
        return this;
    }

    public C174366sq setCommentEnterMethod(String str) {
        this.LLJJIJIL = str;
        return this;
    }

    public C174366sq setCommentLimited(boolean z) {
        this.LLIIJI = z;
        return this;
    }

    public C174366sq setCommentNotice(int i) {
        this.LLJJJJJIL = i;
        return this;
    }

    public C174366sq setCreationId(String str) {
        this.LLJILJILJ = str;
        return this;
    }

    public C174366sq setEnableComment(boolean z) {
        this.LJLL = z;
        return this;
    }

    public C174366sq setEnableMinInnerCommentPanelHeight(boolean z) {
        this.LLIILZL = z;
        return this;
    }

    public C174366sq setEnterFrom(String str) {
        this.LJLJJL = str;
        return this;
    }

    public C174366sq setEnterFullScreen(boolean z) {
        this.LLJI = z;
        return this;
    }

    public C174366sq setEnterMethod(String str) {
        this.LLILLL = str;
        return this;
    }

    public void setEnterPosition(String str) {
        this.LLLF = str;
    }

    public C174366sq setEventType(String str) {
        this.LJLJJLL = str;
        return this;
    }

    public C174366sq setForceHideBatchManagementView(boolean z) {
        this.LLILIL = z;
        return this;
    }

    public C174366sq setForceHideCommentDesc(boolean z) {
        this.LLILL = z;
        return this;
    }

    public C174366sq setForceHideDonation(boolean z) {
        this.LLIL = z;
        return this;
    }

    public C174366sq setForceHideKeyboard(boolean z) {
        this.LLFFF = z;
        return this;
    }

    public C174366sq setForceHidePoi(boolean z) {
        this.LLILII = z;
        return this;
    }

    public C174366sq setForceHideReplyWithVideo(boolean z) {
        this.LLIIL = z;
        return this;
    }

    public C174366sq setFromGroupId(String str) {
        this.LLJJJIL = str;
        return this;
    }

    public C174366sq setFromPage(String str) {
        this.LJLLILLLL = str;
        return this;
    }

    public C174366sq setFromPostList(boolean z) {
        this.LLJILLL = z;
        return this;
    }

    public C174366sq setHintCids(String str) {
        this.LJZL = str;
        return this;
    }

    public C174366sq setHotPlayer(boolean z) {
        this.LLI = z;
        return this;
    }

    public C174366sq setHotPlayerMap(java.util.Map<String, String> map) {
        this.LLIFFJFJJ = map;
        return this;
    }

    public C174366sq setInsertLikeUserIds(String str) {
        this.LJLZ = str;
        return this;
    }

    public C174366sq setInsertVid(String str) {
        this.LL = str;
        return this;
    }

    public C174366sq setIsFromPostMode(boolean z) {
        this.LLJJJJLIIL = z;
        return this;
    }

    public C174366sq setIsLongItem(int i) {
        this.LLILLJJLI = i;
        return this;
    }

    public C174366sq setIsNoPermissionVideo(boolean z) {
        this.LLJZ = z;
        return this;
    }

    public C174366sq setLabelText(String str) {
        this.LLLFF = str;
        return this;
    }

    public C174366sq setLabelType(int i) {
        this.LLJJIJI = i;
        return this;
    }

    public C174366sq setLastGroupId(String str) {
        this.LLJJJ = str;
        return this;
    }

    public C174366sq setLikeUserCount(int i) {
        this.LJZ = i;
        return this;
    }

    public C174366sq setLikeUsers(List<User> list) {
        this.LLJIJIL = list;
        return this;
    }

    public C174366sq setLocatePageType(int i) {
        this.LJLLLL = i;
        return this;
    }

    public C174366sq setMyProfile(boolean z) {
        this.LJLJLLL = z;
        return this;
    }

    public C174366sq setNeedAutoLikeComment(boolean z) {
        this.LLFII = z;
        return this;
    }

    public C174366sq setNeedShowReplyPanel(boolean z) {
        this.LLFZ = z;
        return this;
    }

    public C174366sq setNewsId(String str) {
        this.LLJJJJ = str;
        return this;
    }

    public void setNowType(String str) {
        this.LLJZIJLIL = str;
    }

    public C174366sq setOnScrollStateChangedListener(InterfaceC218588hy interfaceC218588hy) {
        this.LLIIIILZ = interfaceC218588hy;
        return this;
    }

    public C174366sq setOnShowHeightChangeListener(C75O c75o) {
        this.LLIIII = c75o;
        return this;
    }

    public C174366sq setOrientationMode(int i) {
        this.LLJLLL = i;
        return this;
    }

    public C174366sq setPageType(int i) {
        this.LJLLI = i;
        return this;
    }

    public void setParentTagId(String str) {
        this.LLILZIL = str;
    }

    public C174366sq setPlayListId(String str) {
        this.LLIZLLLIL = str;
        return this;
    }

    public C174366sq setPlayListIdKey(String str) {
        this.LLIZ = str;
        return this;
    }

    public C174366sq setPlayListType(String str) {
        this.LLILZLL = str;
        return this;
    }

    public C174366sq setPlayLoops(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        return this;
    }

    public C174366sq setPlayPct(float f) {
        this.LLJL = f;
        return this;
    }

    public C174366sq setPreviousPage(String str) {
        this.LLII = str;
        return this;
    }

    public C174366sq setPrivateAweme(boolean z) {
        this.LJLJLJ = z;
        return this;
    }

    public C174366sq setRequestId(String str) {
        this.LJLJL = str;
        return this;
    }

    public C174366sq setScrollToTop(boolean z) {
        this.LLD = z;
        return this;
    }

    public C174366sq setSearchId(String str) {
        this.LLJJ = str;
        return this;
    }

    public C174366sq setSearchResultId(String str) {
        this.LLJJI = str;
        return this;
    }

    public C174366sq setSessionId(long j) {
        this.LLJLIL = j;
        return this;
    }

    public C174366sq setShouldShowVideoDesc(boolean z) {
        this.LLILLIZIL = z;
        return this;
    }

    public C174366sq setShowBackgroundOverlay(boolean z) {
        this.LLIIZ = z;
        return this;
    }

    public C174366sq setShowEmptyCommentTips(boolean z) {
        this.LLIIJLIL = z;
        return this;
    }

    public C174366sq setShowLikeUsers(boolean z) {
        this.LLJILJIL = z;
        return this;
    }

    public C174366sq setShowTitle(boolean z) {
        this.LJLLJ = z;
        return this;
    }

    public C174366sq setShowTopToastAfterComment(boolean z) {
        this.LLIILII = z;
        return this;
    }

    public C174366sq setSmoothScrollLocate(boolean z) {
        this.LJLLLLLL = z;
        return this;
    }

    public C174366sq setSource(int i) {
        this.LJLJJI = i;
        return this;
    }

    public void setSplitContainerTag(String str) {
        this.LLJLL = str;
    }

    public void setSplitMode(boolean z) {
        this.LLJLLIL = z;
    }

    public C174366sq setTabName(String str) {
        this.LLJ = str;
        return this;
    }

    public void setTagId(String str) {
        this.LLILZ = str;
    }

    public void setTempEnterMethod(String str) {
        this.LLJJIJIIJIL = str;
    }

    public C174366sq setVideoDuration(long j) {
        this.LLJJL = j;
        return this;
    }

    public C174366sq setVideoFrom(String str) {
        this.LLJLILLLLZIIL = str;
        return this;
    }

    public C174366sq setInsertCids(String str, boolean z, boolean z2) {
        this.LJZI = str;
        this.LLF = z;
        this.LLFF = z2;
        return this;
    }
}
