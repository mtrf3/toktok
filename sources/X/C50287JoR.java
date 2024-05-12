package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.JoR, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50287JoR implements Serializable {
    public int LJLIL;
    public SubFilterOptionStruct LJLILLLLZI;
    public int LJLJI;
    public SubFilterOptionStruct LJLJJI;
    public boolean LJLJJLL;
    public List<SubSwitchStruct> LJLJL;
    public SubFilterOptionStruct LJLJLJ;
    public SubFilterOptionStruct LJLJLLL;
    public SubFilterOptionStruct LJLL;
    public SubFilterOptionStruct LJLLI;
    public ResearchFilterStruct LJLLILLLL;
    public boolean LJLJJL = true;
    public boolean LJLLJ = true;

    public final LinkedHashMap<String, Integer> activityToFieldMap() {
        java.util.Map<String, String> requestInfo;
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        List<SubSwitchStruct> list = this.LJLJL;
        if (list != null) {
            for (SubSwitchStruct subSwitchStruct : list) {
                String requestKey = subSwitchStruct.getRequestKey();
                if (requestKey == null) {
                    requestKey = "";
                }
                linkedHashMap.put(requestKey, Integer.valueOf(subSwitchStruct.isSelected() ? 1 : 0));
            }
        }
        SubFilterOptionStruct subFilterOptionStruct = this.LJLJLJ;
        if (subFilterOptionStruct != null && (requestInfo = subFilterOptionStruct.getRequestInfo()) != null) {
            for (Map.Entry<String, String> entry : requestInfo.entrySet()) {
                linkedHashMap.put(entry.getKey(), Integer.valueOf(CastIntegerProtector.parseInt(entry.getValue())));
            }
        }
        return linkedHashMap;
    }

    public final LinkedHashMap<String, String> userToFieldRequestMap() {
        java.util.Map<String, String> requestInfo;
        java.util.Map<String, String> requestInfo2;
        java.util.Map<String, String> requestInfo3;
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        SubFilterOptionStruct subFilterOptionStruct = this.LJLJLLL;
        if (subFilterOptionStruct != null && (requestInfo3 = subFilterOptionStruct.getRequestInfo()) != null) {
            linkedHashMap.putAll(requestInfo3);
        }
        SubFilterOptionStruct subFilterOptionStruct2 = this.LJLL;
        if (subFilterOptionStruct2 != null && (requestInfo2 = subFilterOptionStruct2.getRequestInfo()) != null) {
            linkedHashMap.putAll(requestInfo2);
        }
        SubFilterOptionStruct subFilterOptionStruct3 = this.LJLLI;
        if (subFilterOptionStruct3 != null && (requestInfo = subFilterOptionStruct3.getRequestInfo()) != null) {
            linkedHashMap.putAll(requestInfo);
        }
        return linkedHashMap;
    }

    public final List<SubSwitchStruct> getActivitySwitchOption() {
        return this.LJLJL;
    }

    public final SubFilterOptionStruct getCategoryOption() {
        return this.LJLJLJ;
    }

    public final int getFilterBy() {
        return this.LJLJI;
    }

    public final SubFilterOptionStruct getFilterByStruct() {
        return this.LJLJJI;
    }

    public final SubFilterOptionStruct getFollowerNumberOption() {
        return this.LJLJLLL;
    }

    public final SubFilterOptionStruct getOtherPreferencesOption() {
        return this.LJLLI;
    }

    public final SubFilterOptionStruct getProfilesTypesOption() {
        return this.LJLL;
    }

    public final ResearchFilterStruct getResearchFilterOption() {
        return this.LJLLILLLL;
    }

    public final int getSortType() {
        return this.LJLIL;
    }

    public final SubFilterOptionStruct getSortTypeStruct() {
        return this.LJLILLLLZI;
    }

    public final boolean isDefaultOption() {
        return this.LJLJJL;
    }

    public final boolean isDefaultResearchOption() {
        return this.LJLLJ;
    }

    public final boolean isFromSchema() {
        return this.LJLJJLL;
    }

    public final void setActivitySwitchOption(List<SubSwitchStruct> list) {
        this.LJLJL = list;
    }

    public final void setCategoryOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LJLJLJ = subFilterOptionStruct;
    }

    public final void setDefaultOption(boolean z) {
        this.LJLJJL = z;
    }

    public final void setDefaultResearchOption(boolean z) {
        this.LJLLJ = z;
    }

    public final void setFilterBy(int i) {
        this.LJLJI = i;
    }

    public final void setFilterByStruct(SubFilterOptionStruct subFilterOptionStruct) {
        this.LJLJJI = subFilterOptionStruct;
    }

    public final void setFollowerNumberOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LJLJLLL = subFilterOptionStruct;
    }

    public final void setFromSchema(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setOtherPreferencesOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LJLLI = subFilterOptionStruct;
    }

    public final void setProfilesTypesOption(SubFilterOptionStruct subFilterOptionStruct) {
        this.LJLL = subFilterOptionStruct;
    }

    public final void setResearchFilterOption(ResearchFilterStruct researchFilterStruct) {
        this.LJLLILLLL = researchFilterStruct;
    }

    public final void setSortType(int i) {
        this.LJLIL = i;
    }

    public final void setSortTypeStruct(SubFilterOptionStruct subFilterOptionStruct) {
        this.LJLILLLLZI = subFilterOptionStruct;
    }
}
