package X;

import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Jp0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50322Jp0 implements InterfaceC63694OzC<C50322Jp0> {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final String LJLJLJ;
    public final List<FeedbackContents> LJLJLLL;
    public final InterfaceC65784Pro<Integer> LJLL;
    public final HashMap<String, Object> LJLLI;
    public final boolean LJLLILLLL;
    public final boolean LJLLJ;
    public final String LJLLL;
    public final C50351JpT LJLLLL;
    public final java.util.Set<String> LJLLLLLL;
    public final boolean LJLZ;
    public final String LJZ;
    public final String LJZI;
    public final String LJZL;

    public C50322Jp0() {
        this(0);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLILZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab_index", Integer.valueOf(this.LJLIL));
        linkedHashMap.put("tab_position", this.LJLILLLLZI);
        linkedHashMap.put("search_id", this.LJLJI);
        linkedHashMap.put("search_keyword", this.LJLJJI);
        linkedHashMap.put("tns_ban_type", this.LJLJJL);
        linkedHashMap.put("use_scenario", this.LJLJLJ);
        linkedHashMap.put("has_shown_research_filter", Boolean.valueOf(this.LJLLILLLL));
        linkedHashMap.put("is_recent_request_search_source_unknown", Boolean.valueOf(this.LJLLJ));
        linkedHashMap.put("feel_good_survey_data_str", this.LJLLL);
        linkedHashMap.put("feel_good_survey_data", this.LJLLLL);
        linkedHashMap.put("inner_flow_consume_video_count", this.LJLLLLLL);
        linkedHashMap.put("is_fragment_visible", Boolean.valueOf(this.LJLZ));
        linkedHashMap.put("enter_method", this.LJZ);
        linkedHashMap.put("log_pb", this.LJZI);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LJLJLJ, (((C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, C79062V1e.LJ(this.LJLILLLLZI, this.LJLIL * 31, 31), 31), 31), 31) + this.LJLJJLL) * 31) + this.LJLJL) * 31, 31);
        List<FeedbackContents> list = this.LJLJLLL;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode2 = (this.LJLLI.hashCode() + C1JX.LIZLLL(this.LJLL, (LJ + hashCode) * 31, 31)) * 31;
        boolean z = this.LJLLILLLL;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z2 = this.LJLLJ;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJLLL, (i4 + i5) * 31, 31);
        C50351JpT c50351JpT = this.LJLLLL;
        if (c50351JpT != null) {
            i = c50351JpT.hashCode();
        }
        int LIZ = HXX.LIZ(this.LJLLLLLL, (LJ2 + i) * 31, 31);
        if (!this.LJLZ) {
            i2 = 0;
        }
        return this.LJZL.hashCode() + C79062V1e.LJ(this.LJZI, C79062V1e.LJ(this.LJZ, (LIZ + i2) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFragmentState(tabIndex=");
        sb.append(this.LJLIL);
        sb.append(", searchPosition=");
        sb.append(this.LJLILLLLZI);
        sb.append(", searchId=");
        sb.append(this.LJLJI);
        sb.append(", searchKeyword=");
        sb.append(this.LJLJJI);
        sb.append(", tnsBanType=");
        sb.append(this.LJLJJL);
        sb.append(", maskOriginType=");
        sb.append(this.LJLJJLL);
        sb.append(", chunkStatus=");
        sb.append(this.LJLJL);
        sb.append(", useScenario=");
        sb.append(this.LJLJLJ);
        sb.append(", feedbackSurvey=");
        sb.append(this.LJLJLLL);
        sb.append(", headerSize=");
        sb.append(this.LJLL);
        sb.append(", feelGoodToken=");
        sb.append(this.LJLLI);
        sb.append(", hasShownResearchFilter=");
        sb.append(this.LJLLILLLL);
        sb.append(", isRecentRequestSearchSourceUnknown=");
        sb.append(this.LJLLJ);
        sb.append(", feelgoodSurveyDataStr=");
        sb.append(this.LJLLL);
        sb.append(", feelgoodSurveyData=");
        sb.append(this.LJLLLL);
        sb.append(", innerFlowConsumeVideoRecords=");
        sb.append(this.LJLLLLLL);
        sb.append(", isFragmentVisible=");
        sb.append(this.LJLZ);
        sb.append(", enterMethod=");
        sb.append(this.LJZ);
        sb.append(", logPb=");
        sb.append(this.LJZI);
        sb.append(", sourceId=");
        return C07670Rv.LIZIZ(sb, this.LJZL, ')');
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final java.util.Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public C50322Jp0(int i) {
        this(0, "", "", "", "normal", 0, 0, "normal", C61878OQg.INSTANCE, DIB.LJLIL, new HashMap(), false, false, "", null, new LinkedHashSet(), false, "", "", AnonymousClass629.LIZ("randomUUID().toString()"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50322Jp0)) {
            return false;
        }
        C50322Jp0 c50322Jp0 = (C50322Jp0) obj;
        if (this.LJLIL == c50322Jp0.LJLIL && o.LJ(this.LJLILLLLZI, c50322Jp0.LJLILLLLZI) && o.LJ(this.LJLJI, c50322Jp0.LJLJI) && o.LJ(this.LJLJJI, c50322Jp0.LJLJJI) && o.LJ(this.LJLJJL, c50322Jp0.LJLJJL) && this.LJLJJLL == c50322Jp0.LJLJJLL && this.LJLJL == c50322Jp0.LJLJL && o.LJ(this.LJLJLJ, c50322Jp0.LJLJLJ) && o.LJ(this.LJLJLLL, c50322Jp0.LJLJLLL) && o.LJ(this.LJLL, c50322Jp0.LJLL) && o.LJ(this.LJLLI, c50322Jp0.LJLLI) && this.LJLLILLLL == c50322Jp0.LJLLILLLL && this.LJLLJ == c50322Jp0.LJLLJ && o.LJ(this.LJLLL, c50322Jp0.LJLLL) && o.LJ(this.LJLLLL, c50322Jp0.LJLLLL) && o.LJ(this.LJLLLLLL, c50322Jp0.LJLLLLLL) && this.LJLZ == c50322Jp0.LJLZ && o.LJ(this.LJZ, c50322Jp0.LJZ) && o.LJ(this.LJZI, c50322Jp0.LJZI) && o.LJ(this.LJZL, c50322Jp0.LJZL)) {
            return true;
        }
        return false;
    }

    public C50322Jp0(int i, String searchPosition, String searchId, String searchKeyword, String tnsBanType, int i2, int i3, String useScenario, List<FeedbackContents> list, InterfaceC65784Pro<Integer> headerSize, HashMap<String, Object> feelGoodToken, boolean z, boolean z2, String feelgoodSurveyDataStr, C50351JpT c50351JpT, java.util.Set<String> innerFlowConsumeVideoRecords, boolean z3, String enterMethod, String logPb, String sourceId) {
        o.LJIIIZ(searchPosition, "searchPosition");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(tnsBanType, "tnsBanType");
        o.LJIIIZ(useScenario, "useScenario");
        o.LJIIIZ(headerSize, "headerSize");
        o.LJIIIZ(feelGoodToken, "feelGoodToken");
        o.LJIIIZ(feelgoodSurveyDataStr, "feelgoodSurveyDataStr");
        o.LJIIIZ(innerFlowConsumeVideoRecords, "innerFlowConsumeVideoRecords");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(logPb, "logPb");
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = i;
        this.LJLILLLLZI = searchPosition;
        this.LJLJI = searchId;
        this.LJLJJI = searchKeyword;
        this.LJLJJL = tnsBanType;
        this.LJLJJLL = i2;
        this.LJLJL = i3;
        this.LJLJLJ = useScenario;
        this.LJLJLLL = list;
        this.LJLL = headerSize;
        this.LJLLI = feelGoodToken;
        this.LJLLILLLL = z;
        this.LJLLJ = z2;
        this.LJLLL = feelgoodSurveyDataStr;
        this.LJLLLL = c50351JpT;
        this.LJLLLLLL = innerFlowConsumeVideoRecords;
        this.LJLZ = z3;
        this.LJZ = enterMethod;
        this.LJZI = logPb;
        this.LJZL = sourceId;
    }

    public static C50322Jp0 LIZ(C50322Jp0 c50322Jp0, int i, String str, String str2, String str3, String str4, int i2, int i3, String str5, List list, InterfaceC65784Pro interfaceC65784Pro, HashMap hashMap, boolean z, boolean z2, C50351JpT c50351JpT, java.util.Set set, boolean z3, String str6, String str7, int i4) {
        String feelgoodSurveyDataStr;
        String sourceId;
        String logPb = str7;
        String enterMethod = str6;
        int i5 = i2;
        boolean z4 = z3;
        String tnsBanType = str4;
        String searchKeyword = str3;
        String searchId = str2;
        int i6 = i;
        String searchPosition = str;
        int i7 = i3;
        String useScenario = str5;
        List list2 = list;
        C50351JpT c50351JpT2 = c50351JpT;
        InterfaceC65784Pro headerSize = interfaceC65784Pro;
        HashMap feelGoodToken = hashMap;
        boolean z5 = z;
        boolean z6 = z2;
        java.util.Set innerFlowConsumeVideoRecords = set;
        if ((i4 & 1) != 0) {
            i6 = c50322Jp0.LJLIL;
        }
        if ((i4 & 2) != 0) {
            searchPosition = c50322Jp0.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            searchId = c50322Jp0.LJLJI;
        }
        if ((i4 & 8) != 0) {
            searchKeyword = c50322Jp0.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            tnsBanType = c50322Jp0.LJLJJL;
        }
        if ((i4 & 32) != 0) {
            i5 = c50322Jp0.LJLJJLL;
        }
        if ((i4 & 64) != 0) {
            i7 = c50322Jp0.LJLJL;
        }
        if ((i4 & 128) != 0) {
            useScenario = c50322Jp0.LJLJLJ;
        }
        if ((i4 & 256) != 0) {
            list2 = c50322Jp0.LJLJLLL;
        }
        if ((i4 & 512) != 0) {
            headerSize = c50322Jp0.LJLL;
        }
        if ((i4 & 1024) != 0) {
            feelGoodToken = c50322Jp0.LJLLI;
        }
        if ((i4 & 2048) != 0) {
            z5 = c50322Jp0.LJLLILLLL;
        }
        if ((i4 & 4096) != 0) {
            z6 = c50322Jp0.LJLLJ;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            feelgoodSurveyDataStr = c50322Jp0.LJLLL;
        } else {
            feelgoodSurveyDataStr = null;
        }
        if ((i4 & 16384) != 0) {
            c50351JpT2 = c50322Jp0.LJLLLL;
        }
        if ((32768 & i4) != 0) {
            innerFlowConsumeVideoRecords = c50322Jp0.LJLLLLLL;
        }
        if ((65536 & i4) != 0) {
            z4 = c50322Jp0.LJLZ;
        }
        if ((131072 & i4) != 0) {
            enterMethod = c50322Jp0.LJZ;
        }
        if ((262144 & i4) != 0) {
            logPb = c50322Jp0.LJZI;
        }
        if ((i4 & 524288) != 0) {
            sourceId = c50322Jp0.LJZL;
        } else {
            sourceId = null;
        }
        c50322Jp0.getClass();
        o.LJIIIZ(searchPosition, "searchPosition");
        o.LJIIIZ(searchId, "searchId");
        o.LJIIIZ(searchKeyword, "searchKeyword");
        o.LJIIIZ(tnsBanType, "tnsBanType");
        o.LJIIIZ(useScenario, "useScenario");
        o.LJIIIZ(headerSize, "headerSize");
        o.LJIIIZ(feelGoodToken, "feelGoodToken");
        o.LJIIIZ(feelgoodSurveyDataStr, "feelgoodSurveyDataStr");
        o.LJIIIZ(innerFlowConsumeVideoRecords, "innerFlowConsumeVideoRecords");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(logPb, "logPb");
        o.LJIIIZ(sourceId, "sourceId");
        List list3 = list2;
        boolean z7 = z5;
        boolean z8 = z6;
        return new C50322Jp0(i6, searchPosition, searchId, searchKeyword, tnsBanType, i5, i7, useScenario, list3, headerSize, feelGoodToken, z7, z8, feelgoodSurveyDataStr, c50351JpT2, innerFlowConsumeVideoRecords, z4, enterMethod, logPb, sourceId);
    }
}
