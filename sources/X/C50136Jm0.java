package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.filter.SubSwitchStruct;
import com.ss.android.ugc.aweme.search.filter.research.ResearchFilterStruct;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jm0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50136Jm0 {
    public String LIZ;
    public String LIZIZ;
    public String LJ;
    public C50948Jz6 LJFF;
    public int LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public SearchResultParam LJIILL;
    public String LIZJ = "";
    public String LIZLLL = "";
    public boolean LJI = true;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        r1 = "normal_search";
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r2.equals("recom_search") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if (r2.equals("related_search_keyword") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r2.equals("search_sug") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r1.length() != 0) goto L9;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C49458Jb4 r4) {
        /*
            r3 = this;
            java.lang.String r2 = r3.LIZJ
            int r0 = r2.hashCode()
            switch(r0) {
                case -1816950631: goto L19;
                case -1191929626: goto L22;
                case -710131922: goto L2b;
                case 3452698: goto L34;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = r3.LIZJ
        Lb:
            if (r1 == 0) goto L13
        Ld:
            int r0 = r1.length()
            if (r0 != 0) goto L15
        L13:
            java.lang.String r1 = "normal_search"
        L15:
            r4.LJIJJ(r1)
            return
        L19:
            java.lang.String r1 = "recom_search"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Ld
            goto L9
        L22:
            java.lang.String r1 = "related_search_keyword"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Ld
            goto L9
        L2b:
            java.lang.String r1 = "search_sug"
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Ld
            goto L9
        L34:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r1 = r3.LJIIJJI
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50136Jm0.LIZIZ(X.Jb4):void");
    }

    public final void LIZ(C49458Jb4 c49458Jb4, ActivityC45651qj activityC45651qj) {
        String str;
        String str2;
        C50433Jqn searchCommonModel;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        java.util.Map<String, String> linkedHashMap;
        java.util.Map<String, String> linkedHashMap2;
        java.util.Map<String, String> linkedHashMap3;
        C50287JoR filterOption;
        ResearchFilterStruct researchFilterOption;
        C50287JoR filterOption2;
        SubFilterOptionStruct categoryOption;
        C50287JoR filterOption3;
        List<SubSwitchStruct> activitySwitchOption;
        C50287JoR filterOption4;
        SubFilterOptionStruct sortTypeStruct;
        C50287JoR filterOption5;
        SubFilterOptionStruct filterByStruct;
        String str8;
        String utmSource;
        String str9;
        String eventKeyword;
        String str10;
        C50433Jqn searchCommonModel2;
        C50469JrN searchVideoModel;
        C50373Jpp searchEventModel;
        java.util.Map<String, String> extraLogParams;
        C50652JuK.Companion.getClass();
        C50650JuI LJII = C50651JuJ.LJII(activityC45651qj);
        if (LJII != null && (searchEventModel = LJII.getSearchEventModel()) != null && (extraLogParams = searchEventModel.getExtraLogParams()) != null) {
            str = extraLogParams.get("previous_page");
        } else {
            str = null;
        }
        c49458Jb4.LJIIZILJ("search_keyword", this.LIZIZ);
        c49458Jb4.LJIIZILJ("request_id", this.LJ);
        c49458Jb4.LJIIZILJ("log_pb", C3A5.LIZ.LIZIZ(this.LJ));
        c49458Jb4.LJIIZILJ("impr_id", this.LJ);
        c49458Jb4.LJIIZILJ("search_type", this.LIZ);
        C50948Jz6 c50948Jz6 = this.LJFF;
        if (c50948Jz6 != null) {
            str2 = c50948Jz6.getEnterSearchFrom();
        } else {
            str2 = null;
        }
        c49458Jb4.LJIJI(str2);
        if (str == null || !C78685UuP.LJJJZ(str)) {
            if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null) {
                str = searchCommonModel.getPreviousPage();
            } else {
                str = null;
            }
        }
        c49458Jb4.LJIIZILJ("previous_page", str);
        c49458Jb4.LJIIZILJ("group_id", C50293JoX.LJFF());
        if (LJII != null && (searchVideoModel = LJII.getSearchVideoModel()) != null) {
            str3 = searchVideoModel.getAuthorId();
        } else {
            str3 = null;
        }
        c49458Jb4.LJIIZILJ("author_id", str3);
        c49458Jb4.LJIIZILJ("is_success", String.valueOf(this.LJI ? 1 : 0));
        JSONObject jSONObject = new JSONObject();
        C50948Jz6 c50948Jz62 = this.LJFF;
        if (c50948Jz62 != null) {
            str4 = c50948Jz62.getEnterSearchFrom();
        } else {
            str4 = null;
        }
        jSONObject.put("enter_from", str4);
        if (LJII != null && (searchCommonModel2 = LJII.getSearchCommonModel()) != null) {
            str5 = searchCommonModel2.getEnterFrom();
        } else {
            str5 = null;
        }
        jSONObject.put("enter_from_x", str5);
        JVR.LIZLLL("search_install_to_metrics", C77275UUl.LIZLLL("enter_from"), jSONObject);
        String str11 = C50440Jqu.LIZ;
        SearchResultParam searchResultParam = this.LJIILL;
        if (searchResultParam != null) {
            str6 = searchResultParam.getLastSearchId();
        } else {
            str6 = null;
        }
        if (C78685UuP.LJJJZ(str6)) {
            c49458Jb4.LJJIII(str6);
        } else if (C78685UuP.LJJJZ(str11)) {
            c49458Jb4.LJJIII(str11);
        } else {
            c49458Jb4.LJJIII("");
        }
        SearchResultParam searchResultParam2 = this.LJIILL;
        if (searchResultParam2 != null && (eventKeyword = searchResultParam2.getEventKeyword()) != null && eventKeyword.length() != 0) {
            SearchResultParam searchResultParam3 = this.LJIILL;
            if (searchResultParam3 != null) {
                str10 = searchResultParam3.getEventKeyword();
            } else {
                str10 = null;
            }
            c49458Jb4.LJIIZILJ("event_keyword", str10);
            SearchResultParam searchResultParam4 = this.LJIILL;
            if (searchResultParam4 != null) {
                searchResultParam4.setEventKeyword("");
            }
        }
        SearchResultParam searchResultParam5 = this.LJIILL;
        if (searchResultParam5 != null && (utmSource = searchResultParam5.getUtmSource()) != null && utmSource.length() != 0) {
            SearchResultParam searchResultParam6 = this.LJIILL;
            if (searchResultParam6 != null) {
                str9 = searchResultParam6.getUtmSource();
            } else {
                str9 = null;
            }
            c49458Jb4.LJIIZILJ("utm_source", str9);
            SearchResultParam searchResultParam7 = this.LJIILL;
            if (searchResultParam7 != null) {
                searchResultParam7.setUtmSource("");
            }
        }
        SearchResultParam searchResultParam8 = this.LJIILL;
        if (searchResultParam8 != null) {
            str7 = searchResultParam8.getEnterFromSub();
        } else {
            str7 = null;
        }
        if (C78685UuP.LJJJZ(str7)) {
            SearchResultParam searchResultParam9 = this.LJIILL;
            if (searchResultParam9 != null) {
                str8 = searchResultParam9.getEnterFromSub();
            } else {
                str8 = null;
            }
            if (C78685UuP.LJJJZ(str8)) {
                c49458Jb4.LIZLLL("enter_from_sub", str8);
            }
            SearchResultParam searchResultParam10 = this.LJIILL;
            if (searchResultParam10 != null) {
                searchResultParam10.setEnterFromSub("");
            }
        }
        if (this.LJIILIIL) {
            c49458Jb4.LJIJJ("click_more_general_list");
        } else {
            int i2 = this.LJIIIIZZ;
            if (i2 == -1 || (i = this.LJII) == -1 || i2 == i) {
                String str12 = this.LJIIL;
                if (str12 == null || str12.length() == 0) {
                    LIZIZ(c49458Jb4);
                } else {
                    c49458Jb4.LJIJJ(this.LJIIL);
                }
            } else {
                c49458Jb4.LJIJJ("switch_tab");
                String LIZIZ = C50676Jui.LIZIZ(this.LJIIIIZZ);
                if (o.LJ(LIZIZ, "general_search")) {
                    LIZIZ = "general";
                }
                c49458Jb4.LJIIZILJ("from_search_subtab", LIZIZ);
            }
        }
        if (o.LJ(this.LIZJ, "tab_search") || o.LJ(this.LIZJ, "guide_search") || o.LJ(this.LIZJ, "guide_search_cancel") || o.LJ(this.LIZJ, "correct_word")) {
            c49458Jb4.LJIJJ(this.LIZJ);
            SearchResultParam searchResultParam11 = this.LJIILL;
            if (searchResultParam11 == null || (filterOption5 = searchResultParam11.getFilterOption()) == null || (filterByStruct = filterOption5.getFilterByStruct()) == null || (linkedHashMap = filterByStruct.getLogInfo()) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            c49458Jb4.LIZ(linkedHashMap);
            SearchResultParam searchResultParam12 = this.LJIILL;
            if (searchResultParam12 == null || (filterOption4 = searchResultParam12.getFilterOption()) == null || (sortTypeStruct = filterOption4.getSortTypeStruct()) == null || (linkedHashMap2 = sortTypeStruct.getLogInfo()) == null) {
                linkedHashMap2 = new LinkedHashMap<>();
            }
            c49458Jb4.LIZ(linkedHashMap2);
            SearchResultParam searchResultParam13 = this.LJIILL;
            if (searchResultParam13 != null && (filterOption3 = searchResultParam13.getFilterOption()) != null && (activitySwitchOption = filterOption3.getActivitySwitchOption()) != null) {
                for (SubSwitchStruct subSwitchStruct : activitySwitchOption) {
                    String logInfo = subSwitchStruct.getLogInfo();
                    if (logInfo == null) {
                        logInfo = "";
                    }
                    c49458Jb4.LIZJ(subSwitchStruct.isSelected() ? 1 : 0, logInfo);
                }
            }
            SearchResultParam searchResultParam14 = this.LJIILL;
            if (searchResultParam14 == null || (filterOption2 = searchResultParam14.getFilterOption()) == null || (categoryOption = filterOption2.getCategoryOption()) == null || (linkedHashMap3 = categoryOption.getLogInfo()) == null) {
                linkedHashMap3 = new LinkedHashMap<>();
            }
            c49458Jb4.LIZ(linkedHashMap3);
            SearchResultParam searchResultParam15 = this.LJIILL;
            if (searchResultParam15 != null && (filterOption = searchResultParam15.getFilterOption()) != null && (researchFilterOption = filterOption.getResearchFilterOption()) != null) {
                c49458Jb4.LIZLLL("filter_option_exposed", researchFilterOption.getLogInfo());
            }
        }
        if (o.LJ(this.LIZJ, "search_sug") && o.LJ(this.LJIIJJI, "search_sug")) {
            c49458Jb4.LJIIZILJ("sug_type", this.LJIIIZ);
        }
        if (activityC45651qj != null) {
            SearchHubVM searchHubVM = (SearchHubVM) ViewModelProviders.of(activityC45651qj).get(SearchHubVM.class);
            searchHubVM.getClass();
            InterfaceC50057Jkj interfaceC50057Jkj = searchHubVM.LJLILLLLZI;
            if (interfaceC50057Jkj != null) {
                if (interfaceC50057Jkj instanceof C50053Jkf) {
                    C50053Jkf c50053Jkf = (C50053Jkf) interfaceC50057Jkj;
                    c49458Jb4.LIZLLL("entity_id", String.valueOf(c50053Jkf.LIZ));
                    c49458Jb4.LIZLLL("entity_keyword", c50053Jkf.LIZIZ);
                } else if (interfaceC50057Jkj instanceof C50054Jkg) {
                    c49458Jb4.LJIJJ("entity_switch");
                    C50054Jkg c50054Jkg = (C50054Jkg) interfaceC50057Jkj;
                    c49458Jb4.LIZLLL("entity_id", String.valueOf(c50054Jkg.LIZ));
                    c49458Jb4.LIZLLL("entity_keyword", c50054Jkg.LIZIZ);
                    c49458Jb4.LIZLLL("entity_sub", c50054Jkg.LIZJ);
                }
                searchHubVM.LJLILLLLZI = null;
            }
            java.util.Map<String, Object> value = searchHubVM.LJLIL.getValue();
            if (value != null) {
                for (Map.Entry<String, Object> entry : value.entrySet()) {
                    c49458Jb4.LIZLLL(entry.getKey(), entry.getValue().toString());
                }
            }
        }
    }
}
