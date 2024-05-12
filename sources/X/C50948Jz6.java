package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.Jz6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50948Jz6 implements Serializable {
    public static final C50955JzD Companion = new C50955JzD();
    public static final long serialVersionUID = 42;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public KAK LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public Word LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public java.util.Map<String, Object> LJZL;
    public String LL;
    public String LLD;
    public String LLF;
    public boolean LLFF;
    public Integer LLFII;
    public String LLI;
    public String LLIFFJFJJ;
    public String LLII;
    public EnumC50961JzJ LLIIII;
    public String LLIIIILZ;
    public ECSearchEntranceData LLIIIJ;
    public java.util.Map<String, Object> LLIIIL;
    public java.util.Map<String, Object> LLIIIZ;
    public boolean LJLLLL = true;
    public boolean LJLLLLLL = true;
    public String LLFFF = "";
    public int LLFZ = -100;

    public static /* synthetic */ void getRootEnterFromType$annotations() {
    }

    public static final C50947Jz5 newBuilder() {
        return Companion.newBuilder();
    }

    public final void restEnterSearchPosition() {
        java.util.Map<String, Object> map = this.LJZL;
        if (map != null) {
            o.LJI(map);
            if (map.containsKey("search_position")) {
                java.util.Map<String, Object> map2 = this.LJZL;
                o.LJI(map2);
                map2.remove("search_position");
            }
        }
    }

    public final String getAuthorId() {
        return this.LJLJL;
    }

    public final String getDisplayHint() {
        return this.LJLLILLLL;
    }

    public final java.util.Map<String, Object> getEcExtraLogParams() {
        return this.LLIIIL;
    }

    public final ECSearchEntranceData getEcSearchEntranceData() {
        return this.LLIIIJ;
    }

    public final int getEcSearchEntranceValue() {
        return this.LLFZ;
    }

    public final String getEcSearchSessionId() {
        return this.LLIFFJFJJ;
    }

    public final String getEnterSearchFrom() {
        return this.LJLILLLLZI;
    }

    public final String getEnterSearchFromSub() {
        return this.LJLJI;
    }

    public final String getGidRequest() {
        return this.LJLJLJ;
    }

    public final String getGroupId() {
        return this.LJLJJLL;
    }

    public final java.util.Map<String, Object> getHalfSearchForMallParams() {
        return this.LLIIIZ;
    }

    public final boolean getHideTabs() {
        return this.LJLL;
    }

    public final Word getInboxWord() {
        return this.LJLZ;
    }

    public final EnumC50961JzJ getInitDirectPage() {
        return this.LLIIII;
    }

    public final String getInitSugWord() {
        return this.LLIIIILZ;
    }

    public final boolean getKeepTabPosition() {
        return this.LJLJLLL;
    }

    public final String getLastSearchPosition() {
        return this.LJLIL;
    }

    public final boolean getLeftIcon() {
        return this.LLFF;
    }

    public final java.util.Map<String, Object> getLogExtraMap() {
        return this.LJZL;
    }

    public final String getPreloadSuggestWordsScene() {
        return this.LLF;
    }

    public final String getPreviousPage() {
        return this.LJLJJI;
    }

    public final Integer getRootEnterFromType() {
        return this.LLFII;
    }

    public final String getSearchHint() {
        return this.LJLLJ;
    }

    public final String getSearchHintWordId() {
        return this.LJLLL;
    }

    public final String getSearchSessionId() {
        return this.LLII;
    }

    public final boolean getShouldShowScanView() {
        return this.LJLLLL;
    }

    public final boolean getShouldShowSug() {
        return this.LJLLLLLL;
    }

    public final String getSourcePage() {
        return this.LJLJJL;
    }

    public final String getSrcAnchorProductId() {
        return this.LLD;
    }

    public final String getSrcMaterialId() {
        return this.LL;
    }

    public final KAK getTargetTab() {
        return this.LJLLI;
    }

    public final String getTrafficSourceList() {
        return this.LLI;
    }

    public final boolean getUseSingleStack() {
        return this.LJZI;
    }

    public final String isFromVideoFix() {
        return this.LLFFF;
    }

    public final boolean isSetHintBySugWord() {
        return this.LJZ;
    }

    public final Object obtainEcLogData(String key) {
        o.LJIIIZ(key, "key");
        java.util.Map<String, Object> map = this.LLIIIL;
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final Object obtainLogData(String key) {
        o.LJIIIZ(key, "key");
        java.util.Map<String, Object> map = this.LJZL;
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final void setAuthorId(String str) {
        this.LJLJL = str;
    }

    public final void setDisplayHint(String str) {
        this.LJLLILLLL = str;
    }

    public final void setEcExtraLogParams(java.util.Map<String, Object> map) {
        this.LLIIIL = map;
    }

    public final void setEcSearchEntranceData(ECSearchEntranceData eCSearchEntranceData) {
        this.LLIIIJ = eCSearchEntranceData;
    }

    public final void setEcSearchEntranceValue(int i) {
        this.LLFZ = i;
    }

    public final void setEcSearchSessionId(String str) {
        this.LLIFFJFJJ = str;
    }

    public final void setEnterSearchFrom(String str) {
        this.LJLILLLLZI = str;
    }

    public final void setEnterSearchFromSub(String str) {
        this.LJLJI = str;
    }

    public final void setFromVideoFix(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LLFFF = str;
    }

    public final void setGidRequest(String str) {
        this.LJLJLJ = str;
    }

    public final void setGroupId(String str) {
        this.LJLJJLL = str;
        this.LJLJLJ = str;
    }

    public final void setHalfSearchForMallParams(java.util.Map<String, Object> map) {
        this.LLIIIZ = map;
    }

    public final void setHideTabs(boolean z) {
        this.LJLL = z;
    }

    public final void setInboxWord(Word word) {
        this.LJLZ = word;
    }

    public final void setInitDirectPage(EnumC50961JzJ enumC50961JzJ) {
        this.LLIIII = enumC50961JzJ;
    }

    public final void setInitSugWord(String str) {
        this.LLIIIILZ = str;
    }

    public final void setKeepTabPosition(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setLastSearchPosition(String str) {
        this.LJLIL = str;
    }

    public final void setLeftIcon(boolean z) {
        this.LLFF = z;
    }

    public final void setLogExtraMap(java.util.Map<String, Object> map) {
        this.LJZL = map;
    }

    public final void setPreloadSuggestWordsScene(String str) {
        this.LLF = str;
    }

    public final void setPreviousPage(String str) {
        this.LJLJJI = str;
    }

    public final void setRootEnterFromType(Integer num) {
        this.LLFII = num;
    }

    public final void setSearchHint(String str) {
        this.LJLLJ = str;
    }

    public final void setSearchHintWordId(String str) {
        this.LJLLL = str;
    }

    public final void setSearchSessionId(String str) {
        this.LLII = str;
    }

    public final void setSetHintBySugWord(boolean z) {
        this.LJZ = z;
    }

    public final void setShouldShowScanView(boolean z) {
        this.LJLLLL = z;
    }

    public final void setShouldShowSug(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setSourcePage(String str) {
        this.LJLJJL = str;
    }

    public final void setSrcAnchorProductId(String str) {
        this.LLD = str;
    }

    public final void setSrcMaterialId(String str) {
        this.LL = str;
    }

    public final void setTargetTab(KAK kak) {
        this.LJLLI = kak;
    }

    public final void setTrafficSourceList(String str) {
        this.LLI = str;
    }

    public final void setUseSingleStack(boolean z) {
        this.LJZI = z;
    }
}
