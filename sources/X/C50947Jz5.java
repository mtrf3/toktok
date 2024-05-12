package X;

import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Jz5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50947Jz5 {
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public Word LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public KAK LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public Integer LJIL;
    public String LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public ECSearchEntranceData LJJIIJ;
    public java.util.Map<String, Object> LJJIIZ;
    public boolean LJJIIZI;
    public EnumC50961JzJ LJJIJ;
    public String LJJIJIIJI;
    public String LIZ = "discovery";
    public String LIZIZ = "";
    public boolean LJIIIZ = true;
    public boolean LJIIJ = true;
    public final java.util.Map<String, Object> LJIIZILJ = new LinkedHashMap();
    public String LJIJJLI = "";
    public int LJJ = -100;
    public final java.util.Map<String, Object> LJJIIJZLJL = new LinkedHashMap();

    public final C50948Jz6 LIZIZ() {
        C50948Jz6 c50948Jz6 = new C50948Jz6();
        c50948Jz6.setEnterSearchFrom(this.LIZ);
        c50948Jz6.setEnterSearchFromSub(this.LIZIZ);
        c50948Jz6.setPreviousPage(this.LIZJ);
        c50948Jz6.setSourcePage(this.LIZLLL);
        c50948Jz6.setGroupId(this.LJ);
        c50948Jz6.setAuthorId(this.LJFF);
        c50948Jz6.setSearchHint(this.LJII);
        c50948Jz6.setSearchHintWordId(this.LJIIIIZZ);
        c50948Jz6.setShouldShowScanView(this.LJIIIZ);
        c50948Jz6.setShouldShowSug(this.LJIIJ);
        c50948Jz6.setDisplayHint(this.LJI);
        c50948Jz6.setSetHintBySugWord(this.LJIIL);
        c50948Jz6.setUseSingleStack(this.LJIILIIL);
        c50948Jz6.setTargetTab(this.LJIILJJIL);
        c50948Jz6.setHideTabs(this.LJIILL);
        c50948Jz6.setKeepTabPosition(this.LJIILLIIL);
        c50948Jz6.setLogExtraMap(this.LJIIZILJ);
        c50948Jz6.setSrcMaterialId(this.LJIJ);
        c50948Jz6.setSrcAnchorProductId(this.LJIJI);
        c50948Jz6.setPreloadSuggestWordsScene(this.LJIJJ);
        c50948Jz6.setFromVideoFix(this.LJIJJLI);
        c50948Jz6.setRootEnterFromType(this.LJIL);
        c50948Jz6.setLastSearchPosition(this.LJJI);
        c50948Jz6.setEcSearchEntranceValue(this.LJJ);
        c50948Jz6.setEcSearchEntranceData(this.LJJIIJ);
        c50948Jz6.setEcExtraLogParams(this.LJJIIJZLJL);
        c50948Jz6.setInboxWord(this.LJIIJJI);
        c50948Jz6.setLeftIcon(this.LJJIIZI);
        c50948Jz6.setHalfSearchForMallParams(this.LJJIIZ);
        c50948Jz6.setTrafficSourceList(this.LJJIFFI);
        c50948Jz6.setEcSearchSessionId(this.LJJII);
        c50948Jz6.setSearchSessionId(this.LJJIII);
        c50948Jz6.setInitDirectPage(this.LJJIJ);
        c50948Jz6.setInitSugWord(this.LJJIJIIJI);
        return c50948Jz6;
    }

    public final void LIZ(Object obj, String key) {
        o.LJIIIZ(key, "key");
        this.LJJIIJZLJL.put(key, obj);
    }
}
