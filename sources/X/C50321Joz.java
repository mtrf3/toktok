package X;

import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Joz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50321Joz implements Serializable {
    public int LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public final java.util.Map<String, String> LJLJJL;
    public List<FeedbackContents> LJLJJLL;
    public final HashMap<String, Object> LJLJL;
    public Boolean LJLJLJ;
    public boolean LJLJLLL;
    public String LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;

    public C50321Joz() {
        this(0, null, null, null, null, null, null, null, false, null, null, false, null, 8191, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C50321Joz copy$default(C50321Joz c50321Joz, int i, String str, String str2, String str3, java.util.Map map, List list, HashMap hashMap, Boolean bool, boolean z, String str4, String str5, boolean z2, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c50321Joz.LJLIL;
        }
        if ((i2 & 2) != 0) {
            str = c50321Joz.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            str2 = c50321Joz.LJLJI;
        }
        if ((i2 & 8) != 0) {
            str3 = c50321Joz.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            map = c50321Joz.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            list = c50321Joz.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            hashMap = c50321Joz.LJLJL;
        }
        if ((i2 & 128) != 0) {
            bool = c50321Joz.LJLJLJ;
        }
        if ((i2 & 256) != 0) {
            z = c50321Joz.LJLJLLL;
        }
        if ((i2 & 512) != 0) {
            str4 = c50321Joz.LJLL;
        }
        if ((i2 & 1024) != 0) {
            str5 = c50321Joz.LJLLI;
        }
        if ((i2 & 2048) != 0) {
            z2 = c50321Joz.LJLLILLLL;
        }
        if ((i2 & 4096) != 0) {
            str6 = c50321Joz.LJLLJ;
        }
        return c50321Joz.copy(i, str, str2, str3, map, list, hashMap, bool, z, str4, str5, z2, str6);
    }

    public final C50321Joz copy(int i, String searchPosition, String searchId, String searchKeyword, java.util.Map<String, String> searchTrackMap, List<FeedbackContents> list, HashMap<String, Object> feelGoodToken, Boolean bool, boolean z, String feelgoodSurveyDataStr, String lastPlayItemId, boolean z2, String enterMethod) {
        o.LJIIIZ(searchPosition, "searchPosition");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(searchTrackMap, "searchTrackMap");
        o.LJIIIZ(feelGoodToken, "feelGoodToken");
        o.LJIIIZ(feelgoodSurveyDataStr, "feelgoodSurveyDataStr");
        o.LJIIIZ(lastPlayItemId, "lastPlayItemId");
        o.LJIIIZ(enterMethod, "enterMethod");
        return new C50321Joz(i, searchPosition, searchId, searchKeyword, searchTrackMap, list, feelGoodToken, bool, z, feelgoodSurveyDataStr, lastPlayItemId, z2, enterMethod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50321Joz)) {
            return false;
        }
        C50321Joz c50321Joz = (C50321Joz) obj;
        return this.LJLIL == c50321Joz.LJLIL && o.LJ(this.LJLILLLLZI, c50321Joz.LJLILLLLZI) && o.LJ(this.LJLJI, c50321Joz.LJLJI) && o.LJ(this.LJLJJI, c50321Joz.LJLJJI) && o.LJ(this.LJLJJL, c50321Joz.LJLJJL) && o.LJ(this.LJLJJLL, c50321Joz.LJLJJLL) && o.LJ(this.LJLJL, c50321Joz.LJLJL) && o.LJ(this.LJLJLJ, c50321Joz.LJLJLJ) && this.LJLJLLL == c50321Joz.LJLJLLL && o.LJ(this.LJLL, c50321Joz.LJLL) && o.LJ(this.LJLLI, c50321Joz.LJLLI) && this.LJLLILLLL == c50321Joz.LJLLILLLL && o.LJ(this.LJLLJ, c50321Joz.LJLLJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LIZ = C12400eC.LIZ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL * 31, 31), 31), 31), 31);
        List<FeedbackContents> list = this.LJLJJLL;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode2 = (this.LJLJL.hashCode() + ((LIZ + hashCode) * 31)) * 31;
        Boolean bool = this.LJLJLJ;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.LJLJLLL;
        int i3 = 1;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJLLI, C79062V1e.LJ(this.LJLL, (i2 + i4) * 31, 31), 31);
        if (!this.LJLLILLLL) {
            i3 = 0;
        }
        return this.LJLLJ.hashCode() + ((LJ + i3) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SearchFragmentData(tabIndex=");
        sb.append(this.LJLIL);
        sb.append(", searchPosition=");
        sb.append(this.LJLILLLLZI);
        sb.append(", searchId=");
        sb.append(this.LJLJI);
        sb.append(", searchKeyword=");
        sb.append(this.LJLJJI);
        sb.append(", searchTrackMap=");
        sb.append(this.LJLJJL);
        sb.append(", feedbackSurvey=");
        sb.append(this.LJLJJLL);
        sb.append(", feelGoodToken=");
        sb.append(this.LJLJL);
        sb.append(", hasShownResearchFilter=");
        sb.append(this.LJLJLJ);
        sb.append(", isRecentRequestSearchSourceUnknown=");
        sb.append(this.LJLJLLL);
        sb.append(", feelgoodSurveyDataStr=");
        sb.append(this.LJLL);
        sb.append(", lastPlayItemId=");
        sb.append(this.LJLLI);
        sb.append(", isFragmentVisible=");
        sb.append(this.LJLLILLLL);
        sb.append(", enterMethod=");
        return C07670Rv.LIZIZ(sb, this.LJLLJ, ')');
    }

    public final String getEnterMethod() {
        return this.LJLLJ;
    }

    public final List<FeedbackContents> getFeedbackSurvey() {
        return this.LJLJJLL;
    }

    public final HashMap<String, Object> getFeelGoodToken() {
        return this.LJLJL;
    }

    public final String getFeelgoodSurveyDataStr() {
        return this.LJLL;
    }

    public final Boolean getHasShownResearchFilter() {
        return this.LJLJLJ;
    }

    public final String getLastPlayItemId() {
        return this.LJLLI;
    }

    public final String getSearchId() {
        return this.LJLJI;
    }

    public final String getSearchKeyword() {
        return this.LJLJJI;
    }

    public final String getSearchPosition() {
        return this.LJLILLLLZI;
    }

    public final java.util.Map<String, String> getSearchTrackMap() {
        return this.LJLJJL;
    }

    public final int getTabIndex() {
        return this.LJLIL;
    }

    public final boolean isFragmentVisible() {
        return this.LJLLILLLL;
    }

    public final boolean isRecentRequestSearchSourceUnknown() {
        return this.LJLJLLL;
    }

    public final void setEnterMethod(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLJ = str;
    }

    public final void setFeedbackSurvey(List<FeedbackContents> list) {
        this.LJLJJLL = list;
    }

    public final void setFeelgoodSurveyDataStr(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLL = str;
    }

    public final void setFragmentVisible(boolean z) {
        this.LJLLILLLL = z;
    }

    public final void setHasShownResearchFilter(Boolean bool) {
        this.LJLJLJ = bool;
    }

    public final void setLastPlayItemId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLLI = str;
    }

    public final void setRecentRequestSearchSourceUnknown(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setSearchId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJI = str;
    }

    public final void setSearchKeyword(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJI = str;
    }

    public final void setSearchPosition(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setTabIndex(int i) {
        this.LJLIL = i;
    }

    public C50321Joz(int i, String searchPosition, String searchId, String searchKeyword, java.util.Map<String, String> searchTrackMap, List<FeedbackContents> list, HashMap<String, Object> feelGoodToken, Boolean bool, boolean z, String feelgoodSurveyDataStr, String lastPlayItemId, boolean z2, String enterMethod) {
        o.LJIIIZ(searchPosition, "searchPosition");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(searchTrackMap, "searchTrackMap");
        o.LJIIIZ(feelGoodToken, "feelGoodToken");
        o.LJIIIZ(feelgoodSurveyDataStr, "feelgoodSurveyDataStr");
        o.LJIIIZ(lastPlayItemId, "lastPlayItemId");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = i;
        this.LJLILLLLZI = searchPosition;
        this.LJLJI = searchId;
        this.LJLJJI = searchKeyword;
        this.LJLJJL = searchTrackMap;
        this.LJLJJLL = list;
        this.LJLJL = feelGoodToken;
        this.LJLJLJ = bool;
        this.LJLJLLL = z;
        this.LJLL = feelgoodSurveyDataStr;
        this.LJLLI = lastPlayItemId;
        this.LJLLILLLL = z2;
        this.LJLLJ = enterMethod;
    }

    public C50321Joz(int i, String str, String str2, String str3, java.util.Map map, List list, HashMap hashMap, Boolean bool, boolean z, String str4, String str5, boolean z2, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? JF1.LIZIZ("tns_ban_type", "normal", "use_scenario", "normal") : map, (i2 & 32) != 0 ? C61878OQg.INSTANCE : list, (i2 & 64) != 0 ? new HashMap() : hashMap, (i2 & 128) != 0 ? Boolean.FALSE : bool, (i2 & 256) != 0 ? false : z, (i2 & 512) != 0 ? "" : str4, (i2 & 1024) != 0 ? "" : str5, (i2 & 2048) == 0 ? z2 : false, (i2 & 4096) == 0 ? str6 : "");
    }
}
