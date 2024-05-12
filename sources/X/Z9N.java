package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.BaseMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.google.gson.e;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.TakoInfoModel;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public final class Z9N implements ISearchService {
    public static final Z9N LIZIZ = new Z9N();
    public final /* synthetic */ ISearchService LIZ = SearchServiceImpl.LLLZI();

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<MusicSearchHistory> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LIZJ(LastSearch lastSearch) {
        this.LIZ.LIZJ(lastSearch);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Intent LIZLLL(Activity activity, android.net.Uri uri) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        return this.LIZ.LIZLLL(activity, uri);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJ(String tagId, boolean z) {
        o.LJIIIZ(tagId, "tagId");
        this.LIZ.LJ(tagId, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC44306HaA LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJI(Aweme aweme, M89 m89) {
        return this.LIZ.LJI(aweme, m89);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final java.util.Map<String, Class<?>> LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIIIZ(String str, String keyword, String str2) {
        o.LJIIIZ(keyword, "keyword");
        this.LIZ.LJIIIZ(str, keyword, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJIIJ(VNU context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJIIJ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC55623LsJ LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIIL(MusicSearchHistory musicSearchHistory) {
        this.LIZ.LJIIL(musicSearchHistory);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJIILIIL(boolean z) {
        return this.LIZ.LJIILIIL(z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final IMusicSearchContextAbility LJIILJJIL(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return this.LIZ.LJIILJJIL(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIILL(Context context, TextExtraStruct struct, Aweme aweme, String str, String str2, String str3, Integer num) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(struct, "struct");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LJIILL(context, struct, aweme, str, str2, str3, num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C48X LJIILLIIL(RecyclerView parentRecyclerView) {
        o.LJIIIZ(parentRecyclerView, "parentRecyclerView");
        return this.LIZ.LJIILLIIL(parentRecyclerView);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIIZILJ(SearchResultParam searchResultParam) {
        this.LIZ.LJIIZILJ(searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIJ(String str, String str2, String searchPostion, String wordContent, boolean z) {
        o.LJIIIZ(searchPostion, "searchPostion");
        o.LJIIIZ(wordContent, "wordContent");
        this.LIZ.LJIJ(str, str2, searchPostion, wordContent, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIJI(String str, String str2) {
        this.LIZ.LJIJI(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJIJJ(VNU context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJIJJ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJIJJLI(Exception e) {
        o.LJIIIZ(e, "e");
        this.LIZ.LJIJJLI(e);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJIL(Activity activity) {
        return this.LIZ.LJIL(activity);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final HashMap<String, String> LJJ(String str, String processId, String str2) {
        o.LJIIIZ(processId, "processId");
        return this.LIZ.LJJ(str, processId, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJJI(VNU context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJJI(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC174276sh LJJIFFI() {
        return this.LIZ.LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJII(JSONObject jSONObject) {
        this.LIZ.LJJII(jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJIII(int i) {
        return this.LIZ.LJJIII(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIIJ() {
        return this.LIZ.LJJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIIJZLJL() {
        return this.LIZ.LJJIIJZLJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC65350Pko<? extends C8W0> LJJIIZ() {
        return this.LIZ.LJJIIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIIZI(String str) {
        return this.LIZ.LJJIIZI(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C90T LJJIJ() {
        return this.LIZ.LJJIJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIJIIJI() {
        return this.LIZ.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIJIIJIL() {
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJIJIL(int i, Aweme aweme, String str, String str2, boolean z) {
        this.LIZ.LJJIJIL(i, aweme, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIJL(List<? extends java.util.Map<String, ? extends Object>> list, boolean z) {
        return this.LIZ.LJJIJL(list, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIJLIJ(String str) {
        return this.LIZ.LJJIJLIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJIL(String str, String str2) {
        return this.LIZ.LJJIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJIZ(FragmentManager fragmentManager, boolean z, java.util.Map<String, String> map) {
        this.LIZ.LJJIZ(fragmentManager, z, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJJ(boolean z) {
        return this.LIZ.LJJJ(z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJI() {
        return this.LIZ.LJJJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final View LJJJJ(int i, ViewGroup container) {
        o.LJIIIZ(container, "container");
        return this.LIZ.LJJJJ(i, container);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJJI() {
        return this.LIZ.LJJJJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJJJIZL() {
        return this.LIZ.LJJJJIZL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJJJJ() {
        return this.LIZ.LJJJJJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJJJJL(ViewGroup viewGroup, Context context, Aweme aweme, String str, String str2, long j) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJJJJJL(viewGroup, context, aweme, str, str2, j);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJJJJL(Aweme aweme) {
        return this.LIZ.LJJJJL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJJJLI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LIZ.LJJJJLI(interfaceC65784Pro, interfaceC65784Pro2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJJJLL(Aweme aweme, boolean z) {
        this.LIZ.LJJJJLL(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Object LJJJJZ(Aweme aweme) {
        return this.LIZ.LJJJJZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchResultStatistics LJJJJZI() {
        return this.LIZ.LJJJJZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final BaseMovementMethod LJJJLIIL() {
        return this.LIZ.LJJJLIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchContextAbility LJJJLL() {
        return this.LIZ.LJJJLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC51676KPw LJJJLZIJ() {
        return this.LIZ.LJJJLZIJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJJZ(android.net.Uri routeUri) {
        o.LJIIIZ(routeUri, "routeUri");
        this.LIZ.LJJJZ(routeUri);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C4H5 LJJL() {
        return this.LIZ.LJJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJLI() {
        return this.LIZ.LJJLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIIJ() {
        this.LIZ.LJJLIIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJLIIIJ() {
        return this.LIZ.LJJLIIIJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJILLIZJL() {
        this.LIZ.LJJLIIIJILLIZJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJJI(EnumC51264KAa enumC51264KAa) {
        this.LIZ.LJJLIIIJJI(enumC51264KAa);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJJIZ(e eVar) {
        this.LIZ.LJJLIIIJJIZ(eVar);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJL() {
        this.LIZ.LJJLIIIJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C50948Jz6 LJJLIIIJLJLI() {
        return this.LIZ.LJJLIIIJLJLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC65350Pko<? extends C8W0> LJJLIIJ() {
        return this.LIZ.LJJLIIJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIL(int i) {
        this.LIZ.LJJLIL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLJ(long j, String str) {
        this.LIZ.LJJLJ(j, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC50670Juc LJJLJLI(ECSearchEntranceData eCSearchEntranceData, Integer num) {
        return this.LIZ.LJJLJLI(eCSearchEntranceData, num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJLL() {
        return this.LIZ.LJJLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final java.util.Map<String, String> LJJZ(String str, String str2, String... strArr) {
        return this.LIZ.LJJZ(str, str2, strArr);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJZZI(android.net.Uri routeUri) {
        o.LJIIIZ(routeUri, "routeUri");
        this.LIZ.LJJZZI(routeUri);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJJZZIII(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LJJZZIII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJL() {
        return this.LIZ.LJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final int LJLI() {
        return this.LIZ.LJLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLIIIL() {
        return this.LIZ.LJLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLIIL(Aweme aweme, M89 m89) {
        return this.LIZ.LJLIIL(aweme, m89);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final SearchSecurityControlValue LJLIL() {
        return this.LIZ.LJLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJLILLLLZI() {
        return this.LIZ.LJLILLLLZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLJI() {
        this.LIZ.LJLJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLJJI(Activity activity, long j, String enterFrom, String GroupId) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(GroupId, "GroupId");
        this.LIZ.LJLJJI(activity, j, enterFrom, GroupId);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final HashMap<String, String> LJLJJL(String str, String processId) {
        o.LJIIIZ(processId, "processId");
        return this.LIZ.LJLJJL(str, processId);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LJLJJLL(String str) {
        return this.LIZ.LJLJJLL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLJL() {
        this.LIZ.LJLJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LJLJLJ(VNU context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LJLJLJ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLJLLL(LifecycleOwner owner, Aweme aweme, java.util.Map<String, String> map) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LJLJLLL(owner, aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJLL() {
        return this.LIZ.LJLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLLI(Context context, SearchResultParam searchResultParam) {
        this.LIZ.LJLLI(context, searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLLILLLL(C50652JuK source, InterfaceC63694OzC ability, String str) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(ability, "ability");
        this.LIZ.LJLLILLLL(source, ability, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLLJ(Fragment fragment, String str) {
        this.LIZ.LJLLJ(fragment, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJLLL() {
        return this.LIZ.LJLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLLLL(Context context, String str, String str2, boolean z, java.util.Map<String, String> map, java.util.Map<String, String> map2) {
        this.LIZ.LJLLLL(context, str, str2, z, map, map2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC221168m8 LJLLLLLL() {
        return this.LIZ.LJLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJLZ(int i, View view) {
        this.LIZ.LJLZ(i, view);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Fragment LJZ(K75 k75) {
        return this.LIZ.LJZ(k75);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJZI(M89 m89) {
        return this.LIZ.LJZI(m89);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LJZL() {
        return this.LIZ.LJZL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchContextAbility LL(InterfaceC80653En sourceState) {
        o.LJIIIZ(sourceState, "sourceState");
        return this.LIZ.LL(sourceState);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLD(MusicSearchHistory musicSearchHistory) {
        this.LIZ.LLD(musicSearchHistory);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<C40197Fq5> LLF() {
        return this.LIZ.LLF();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLFF(Context context, SearchResultParam param) {
        o.LJIIIZ(param, "param");
        this.LIZ.LLFF(context, param);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final KGT LLFFF(SearchResultParam searchResultParam, SearchKeywordPresenter searchKeywordPresenter, KRC krc) {
        return this.LIZ.LLFFF(searchResultParam, searchKeywordPresenter, krc);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LLFII(VNU context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LLFII(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLFZ() {
        this.LIZ.LLFZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLI(String str) {
        this.LIZ.LLI(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final C48Q LLIFFJFJJ(RecyclerView parentRecyclerView) {
        o.LJIIIZ(parentRecyclerView, "parentRecyclerView");
        return this.LIZ.LLIFFJFJJ(parentRecyclerView);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final JSONObject LLII() {
        return this.LIZ.LLII();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLIIII(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LLIIII(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIIIILZ() {
        return this.LIZ.LLIIIILZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIIJ(String str) {
        this.LIZ.LLIIIJ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIIIL() {
        return this.LIZ.LLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIIZ(String str) {
        this.LIZ.LLIIIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final LynxUI<?> LLIIJI(VNU context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LLIIJI(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIIJLIL(Aweme aweme, String str) {
        return this.LIZ.LLIIJLIL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIIL(String str, String str2) {
        this.LIZ.LLIIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIILII(C38150EyA dmtJsBridge, WeakReference<Context> contextRef) {
        o.LJIIIZ(dmtJsBridge, "dmtJsBridge");
        o.LJIIIZ(contextRef, "contextRef");
        this.LIZ.LLIILII(dmtJsBridge, contextRef);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIILZL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LLIILZL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLIIZ(String str) {
        return this.LIZ.LLIIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Aweme LLIL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LLIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILII(Context context, Bundle bundle) {
        this.LIZ.LLILII(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLILIL() {
        return this.LIZ.LLILIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILL(C49586Jd8 c49586Jd8, C49587Jd9 c49587Jd9) {
        this.LIZ.LLILL(c49586Jd8, c49587Jd9);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILLIZIL(LifecycleOwner lifecycleOwner) {
        this.LIZ.LLILLIZIL(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final IMusicSearchContextAbility LLILLJJLI() {
        return this.LIZ.LLILLJJLI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILLL(String str, Fragment fragment, InterfaceC50392Jq8 interfaceC50392Jq8) {
        this.LIZ.LLILLL(str, fragment, interfaceC50392Jq8);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC212198Ul LLILZ() {
        return this.LIZ.LLILZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLILZIL() {
        return this.LIZ.LLILZIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLIZ() {
        this.LIZ.LLIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final java.util.Map<String, String> LLIZLLLIL() {
        return this.LIZ.LLIZLLLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchContextAbility LLJ() {
        return this.LIZ.LLJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJI(List<String> historyList, boolean z, Activity activity) {
        o.LJIIIZ(historyList, "historyList");
        this.LIZ.LLJI(historyList, z, activity);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJIJIL(C84553Tn c84553Tn) {
        this.LIZ.LLJIJIL(c84553Tn);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJILJIL(int i) {
        this.LIZ.LLJILJIL(i);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final EnumC223268pW LLJILJILJ() {
        return this.LIZ.LLJILJILJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJILLL(Context context, Aweme aweme) {
        return this.LIZ.LLJILLL(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJ(C50450Jr4 c50450Jr4) {
        this.LIZ.LLJJ(c50450Jr4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchContextAbility LLJJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LLJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJIII(Activity activity, String str, String str2, long j, long j2, long j3, Integer num) {
        this.LIZ.LLJJIII(activity, str, str2, j, j2, j3, num);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJJIJI() {
        return this.LIZ.LLJJIJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJIJIIJIL(EnumC223268pW state) {
        o.LJIIIZ(state, "state");
        this.LIZ.LLJJIJIIJIL(state);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJIJIL(Context context, Bundle bundle) {
        this.LIZ.LLJJIJIL(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJJ(String str, boolean z) {
        this.LIZ.LLJJJ(str, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJJJIL() {
        return this.LIZ.LLJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final java.util.Map LLJJJJ(String str, String str2, String str3, String str4, java.util.Map map) {
        return this.LIZ.LLJJJJ(str, str2, str3, str4, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJJJJIL(Integer num, String str) {
        this.LIZ.LLJJJJJIL(num, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJJJLIIL(String str, String str2, String str3) {
        this.LIZ.LLJJJJLIIL(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final HashMap<String, String> LLJJL(Aweme aweme, String str) {
        return this.LIZ.LLJJL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJJLIIIJLLLLLLLZ(Fragment fragment, boolean z) {
        this.LIZ.LLJJLIIIJLLLLLLLZ(fragment, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJL(Context context) {
        return this.LIZ.LLJL(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLJLIL() {
        return this.LIZ.LLJLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJLILLLLZIIL(AqS185S0100000_3 aqS185S0100000_3) {
        this.LIZ.LLJLILLLLZIIL(aqS185S0100000_3);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final Long LLJLL() {
        return this.LIZ.LLJLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final java.util.Map<String, String> LLJLLIL(String str, String str2) {
        return this.LIZ.LLJLLIL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJLLL(Fragment fragment, boolean z) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LLJLLL(fragment, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLJZ() {
        return this.LIZ.LLJZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLJZIJLIL(String str, Fragment fragment, InterfaceC50393Jq9 interfaceC50393Jq9) {
        this.LIZ.LLJZIJLIL(str, fragment, interfaceC50393Jq9);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLL(String str) {
        return this.LIZ.LLL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLF(Aweme aweme) {
        return this.LIZ.LLLF(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLFF(Context context, String str, java.util.Map<String, String> traceData) {
        o.LJIIIZ(traceData, "traceData");
        this.LIZ.LLLFF(context, str, traceData);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLFFI(Context context, User user) {
        return this.LIZ.LLLFFI(context, user);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLFZ() {
        return this.LIZ.LLLFZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchContextAbility LLLI(View view) {
        o.LJIIIZ(view, "view");
        return this.LIZ.LLLI(view);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC224618rh LLLII() {
        return this.LIZ.LLLII();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLIIII(long j, String str, boolean z) {
        this.LIZ.LLLIIII(j, str, z);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLIIIIL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LLLIIIIL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLIIIL() {
        return this.LIZ.LLLIIIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLIIL(String str, String str2, String str3, String str4) {
        this.LIZ.LLLIIL(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLIILIL() {
        this.LIZ.LLLIILIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLIL(String resPath) {
        o.LJIIIZ(resPath, "resPath");
        this.LIZ.LLLIL(resPath);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC51567KLr LLLILZ(Bundle bundle) {
        return this.LIZ.LLLILZ(bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLILZJ() {
        return this.LIZ.LLLILZJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLILZLLLI(Context context, C50434Jqo c50434Jqo) {
        this.LIZ.LLLILZLLLI(context, c50434Jqo);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLIZZ() {
        return this.LIZ.LLLIZZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLJ() {
        this.LIZ.LLLJ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLJIL(String str) {
        return this.LIZ.LLLJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLJL() {
        return this.LIZ.LLLJL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLL(String str, String str2) {
        this.LIZ.LLLL(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLII(Aweme aweme) {
        this.LIZ.LLLLII(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLLIIIILLL() {
        return this.LIZ.LLLLIIIILLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLIIL(Context context, Aweme aweme, Fragment detailPageFragment) {
        o.LJIIIZ(detailPageFragment, "detailPageFragment");
        return this.LIZ.LLLLIIL(context, aweme, detailPageFragment);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final java.util.Map<String, String> LLLLIILL() {
        return this.LIZ.LLLLIILL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLIILLL(Lifecycle lifecycle) {
        return this.LIZ.LLLLIILLL(lifecycle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final TakoInfoModel LLLLIL() {
        return this.LIZ.LLLLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLILI(String str, String str2, String str3, String str4) {
        this.LIZ.LLLLILI(str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final View LLLLJ(long j, Context context, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LLLLJ(j, context, aweme, str, str2, z, z2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLJI() {
        return this.LIZ.LLLLJI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLL() {
        this.LIZ.LLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final KG6 LLLLLIL() {
        return this.LIZ.LLLLLIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final ISearchContextAbility LLLLLILLIL(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return this.LIZ.LLLLLILLIL(lifecycleOwner);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLJIL(boolean z, Fragment owner, View rootView, Aweme aweme, String str, String str2) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ.LLLLLJIL(z, owner, rootView, aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final FeedSearchIconViewModel LLLLLJLJLL(ActivityC45651qj activityC45651qj) {
        return this.LIZ.LLLLLJLJLL(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final String LLLLLL() {
        return this.LIZ.LLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLLIL(Context context, Bundle bundle) {
        this.LIZ.LLLLLLIL(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLLJ(Aweme aweme, String str, String keyWordId, String keyword, String str2) {
        o.LJIIIZ(keyWordId, "keyWordId");
        o.LJIIIZ(keyword, "keyword");
        this.LIZ.LLLLLLJ(aweme, str, keyWordId, keyword, str2);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLLL() {
        return this.LIZ.LLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final KGV LLLLLLLLL() {
        return this.LIZ.LLLLLLLLL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLLLLLL(Aweme aweme, String str) {
        return this.LIZ.LLLLLLLLLL(aweme, str);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final List<InterfaceC38186Eyk> LLLLLLLZIL(F3T providerFactory) {
        o.LJIIIZ(providerFactory, "providerFactory");
        return this.LIZ.LLLLLLLZIL(providerFactory);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLLZ() {
        return this.LIZ.LLLLLLZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLLLZZ(java.util.Map<String, String> map) {
        this.LIZ.LLLLLLZZ(map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLZ(Context context) {
        o.LJIIIZ(context, "context");
        return this.LIZ.LLLLLZ(context);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLZIL() {
        return this.LIZ.LLLLLZIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLLZL() {
        return this.LIZ.LLLLLZL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLZ(Context context, String keyword, java.util.Map<String, String> map) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(keyword, "keyword");
        this.LIZ.LLLLZ(context, keyword, map);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLZI() {
        return this.LIZ.LLLLZI();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLLLZIL() {
        this.LIZ.LLLLZIL();
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final boolean LLLLZLL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return this.LIZ.LLLLZLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final InterfaceC38012Evw getJSMethodByName(C38150EyA c38150EyA, WeakReference<Context> weakReference, String name) {
        o.LJIIIZ(name, "name");
        return this.LIZ.getJSMethodByName(c38150EyA, weakReference, name);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final java.util.Map<String, InterfaceC38012Evw> getJSMethods(C38150EyA c38150EyA, WeakReference<Context> weakReference) {
        return this.LIZ.getJSMethods(c38150EyA, weakReference);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LLILZLL(Aweme aweme, String str, String str2, String str3, String str4) {
        HH1.LIZ(str2, "keyWordId", str3, "keyword", str4, "tabName");
        this.LIZ.LLILZLL(aweme, str, str2, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.search.ISearchService
    public final void LJJLIIIJLLLLLLLZ(int i, String str, String str2, String str3, String str4, String str5) {
        HH1.LIZ(str, "keyword", str4, "enterMethod", str5, "sectionType");
        this.LIZ.LJJLIIIJLLLLLLLZ(i, str, str2, str3, str4, str5);
    }
}
