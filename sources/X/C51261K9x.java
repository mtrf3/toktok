package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ISearchSugContextAbility;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.ecommerce.search.sug.ui.EcSearchSugAssem;
import com.ss.android.ugc.aweme.ecommerce.search.sug.vm.EcSearchSugAssemVM;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.K9x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51261K9x implements KC6 {
    public final ISearchSugContextAbility LIZ;
    public final /* synthetic */ EcSearchSugAssem LIZIZ;

    @Override // X.KC6
    public final ISearchSugContextAbility LLIIIZ() {
        return this.LIZ;
    }

    public C51261K9x(EcSearchSugAssem ecSearchSugAssem) {
        this.LIZIZ = ecSearchSugAssem;
        this.LIZ = ecSearchSugAssem.I3().LJLILLLLZI;
    }

    @Override // X.KC6
    public final void LLIIJI(int i, SearchSugEntity entity) {
        C51260K9w c51260K9w;
        o.LJIIIZ(entity, "entity");
        if (i >= 0 && i < this.LIZIZ.H3().getItemCount()) {
            ListProtector.remove(this.LIZIZ.H3().LJLJJLL, i);
            this.LIZIZ.H3().notifyItemRemoved(i);
        }
        C51266KAc c51266KAc = this.LIZIZ.I3().LJLL;
        if (c51266KAc != null && (c51260K9w = c51266KAc.LIZ) != null) {
            for (Map.Entry<String, EcSearchSugResponse> entry : c51260K9w.LJLJJI.entrySet()) {
                String key = entry.getKey();
                Iterator<SearchSugEntity> it = entry.getValue().sugList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        SearchSugEntity next = it.next();
                        if (next.LIZ() && o.LJ(next.content, entity.content)) {
                            c51260K9w.LJLJJI.remove(key);
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // X.KC6
    public final void LLIIIJ(int i, SearchSugEntity entity, String requestId) {
        String str;
        String str2;
        String str3;
        KAN Vk0;
        String str4;
        SearchResultParam tc0;
        String sugShopId;
        String resultTab;
        o.LJIIIZ(entity, "entity");
        o.LJIIIZ(requestId, "requestId");
        KCM.LJJIL.getClass();
        KCN.LIZIZ = 0L;
        KCN.LIZJ = 0L;
        EcSearchSugAssemVM I3 = this.LIZIZ.I3();
        InterfaceC55235Lm3 scope = C55096Ljo.LJIIZILJ(this.LIZIZ);
        I3.getClass();
        o.LJIIIZ(scope, "scope");
        I3.LJLJL = true;
        SearchResultParam searchResultParam = new SearchResultParam();
        searchResultParam.setKeyword(entity.content);
        searchResultParam.setSugHint(entity.sugExtraInfo.getSugHint());
        searchResultParam.setSearchFrom("search_sug");
        if (C78840Uwu.LJJIFFI(entity)) {
            str = "enrich_sug";
        } else {
            str = "normal_sug";
        }
        searchResultParam.setSugType(str);
        searchResultParam.setOpenNewSearchContainer(false);
        searchResultParam.setQueryState(K7T.LIZ(entity));
        SugExtraInfo sugExtraInfo = entity.sugExtraInfo;
        String str5 = null;
        if (sugExtraInfo != null && (resultTab = sugExtraInfo.getResultTab()) != null) {
            if (o.LJ(resultTab, "general")) {
                searchResultParam.getSearchEnterParam().setTargetTab(KAK.TOP);
                searchResultParam.setLandTap("general");
            } else if (o.LJ(resultTab, "ecom")) {
                searchResultParam.getSearchEnterParam().setTargetTab(KAK.SHOP);
                searchResultParam.setLandTap("shop");
            }
        }
        SugExtraInfo sugExtraInfo2 = entity.sugExtraInfo;
        String str6 = "";
        if (sugExtraInfo2 == null || (str2 = sugExtraInfo2.getUserId()) == null) {
            str2 = "";
        }
        searchResultParam.setSugUserId(str2);
        SugExtraInfo sugExtraInfo3 = entity.sugExtraInfo;
        if (sugExtraInfo3 == null || (str3 = sugExtraInfo3.isRichSugValue()) == null) {
            str3 = "";
        }
        searchResultParam.setIsRichSug(str3);
        SugExtraInfo sugExtraInfo4 = entity.sugExtraInfo;
        if (sugExtraInfo4 != null && (sugShopId = sugExtraInfo4.getSugShopId()) != null) {
            searchResultParam.setSugShopId(sugShopId);
        }
        ISearchSugContextAbility iSearchSugContextAbility = I3.LJLILLLLZI;
        if (iSearchSugContextAbility != null && (tc0 = iSearchSugContextAbility.tc0(scope, searchResultParam)) != null) {
            searchResultParam = tc0;
        }
        ISearchSugContextAbility iSearchSugContextAbility2 = this.LIZIZ.I3().LJLILLLLZI;
        if (iSearchSugContextAbility2 != null) {
            iSearchSugContextAbility2.LJJIL(searchResultParam);
        }
        new C51239K9b().LJIILIIL();
        ISearchSugContextAbility iSearchSugContextAbility3 = this.LIZIZ.I3().LJLILLLLZI;
        if (iSearchSugContextAbility3 != null) {
            str5 = iSearchSugContextAbility3.f1();
        }
        Integer valueOf = Integer.valueOf(i);
        ISearchSugContextAbility iSearchSugContextAbility4 = this.LIZIZ.I3().LJLILLLLZI;
        if (iSearchSugContextAbility4 != null && (Vk0 = iSearchSugContextAbility4.Vk0()) != null && (str4 = Vk0.LIZJ) != null) {
            str6 = str4;
        }
        K7T.LIZIZ(str5, entity, requestId, valueOf, str6, "click");
    }

    @Override // X.KC6
    public final void LLIIIL(String str, Integer num, String str2, SearchSugEntity searchSugEntity) {
        String str3;
        int LJI;
        o.LJIIIZ(searchSugEntity, "searchSugEntity");
        String hv0 = this.LIZIZ.I3().hv0();
        Integer valueOf = Integer.valueOf(this.LIZIZ.I3().jv0());
        ISearchSugContextAbility iSearchSugContextAbility = this.LIZIZ.I3().LJLILLLLZI;
        String str4 = null;
        if (iSearchSugContextAbility != null) {
            str3 = iSearchSugContextAbility.f1();
        } else {
            str3 = null;
        }
        KC9 kc9 = new KC9();
        kc9.LJIILLIIL(hv0);
        kc9.LJIILL("enter_method", "sug");
        if (valueOf != null) {
            LJI = valueOf.intValue();
        } else {
            LJI = C51214K8c.LJI();
        }
        kc9.LJIILL("search_type", KAI.LIZ(LJI));
        kc9.LJIILL("words_type", str);
        kc9.LJIILL("action_type", str2);
        kc9.LJIILL("input_keyword", str3);
        kc9.LJIILL("search_keyword", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        if (word != null) {
            str4 = word.getId();
        }
        kc9.LJIILL("group_id", str4);
        kc9.LJIILL("order", String.valueOf(num));
        kc9.LJIILIIL();
    }
}
