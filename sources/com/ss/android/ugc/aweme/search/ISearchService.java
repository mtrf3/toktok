package com.ss.android.ugc.aweme.search;

import X.ActivityC45651qj;
import X.C38150EyA;
import X.C3C8;
import X.C40197Fq5;
import X.C48Q;
import X.C48X;
import X.C49586Jd8;
import X.C49587Jd9;
import X.C4H5;
import X.C50434Jqo;
import X.C50450Jr4;
import X.C50652JuK;
import X.C50948Jz6;
import X.C76800UCe;
import X.C84553Tn;
import X.C8W0;
import X.C90T;
import X.EnumC223268pW;
import X.EnumC51264KAa;
import X.F3T;
import X.InterfaceC174276sh;
import X.InterfaceC212198Ul;
import X.InterfaceC221168m8;
import X.InterfaceC224618rh;
import X.InterfaceC38012Evw;
import X.InterfaceC38186Eyk;
import X.InterfaceC44306HaA;
import X.InterfaceC50392Jq8;
import X.InterfaceC50393Jq9;
import X.InterfaceC50670Juc;
import X.InterfaceC51567KLr;
import X.InterfaceC51676KPw;
import X.InterfaceC55623LsJ;
import X.InterfaceC63694OzC;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC80653En;
import X.K75;
import X.KG6;
import X.KGT;
import X.KGV;
import X.KRC;
import X.M89;
import X.VNU;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.TakoInfoModel;
import com.ss.android.ugc.aweme.search.source.neo.IMusicSearchContextAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS185S0100000_3;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ISearchService {
    String LIZ();

    List<MusicSearchHistory> LIZIZ();

    void LIZJ(LastSearch lastSearch);

    Intent LIZLLL(Activity activity, Uri uri);

    void LJ(String str, boolean z);

    InterfaceC44306HaA LJFF();

    boolean LJI(Aweme aweme, M89 m89);

    boolean LJII();

    Map<String, Class<?>> LJIIIIZZ();

    void LJIIIZ(String str, String str2, String str3);

    LynxUI<?> LJIIJ(VNU vnu);

    InterfaceC55623LsJ LJIIJJI();

    void LJIIL(MusicSearchHistory musicSearchHistory);

    String LJIILIIL(boolean z);

    IMusicSearchContextAbility LJIILJJIL(LifecycleOwner lifecycleOwner);

    void LJIILL(Context context, TextExtraStruct textExtraStruct, Aweme aweme, String str, String str2, String str3, Integer num);

    C48X LJIILLIIL(RecyclerView recyclerView);

    void LJIIZILJ(SearchResultParam searchResultParam);

    void LJIJ(String str, String str2, String str3, String str4, boolean z);

    void LJIJI(String str, String str2);

    LynxUI<?> LJIJJ(VNU vnu);

    void LJIJJLI(Exception exc);

    boolean LJIL(Activity activity);

    HashMap<String, String> LJJ(String str, String str2, String str3);

    LynxUI<?> LJJI(VNU vnu);

    InterfaceC174276sh LJJIFFI();

    void LJJII(JSONObject jSONObject);

    String LJJIII(int i);

    boolean LJJIIJ();

    boolean LJJIIJZLJL();

    InterfaceC65350Pko<? extends C8W0> LJJIIZ();

    boolean LJJIIZI(String str);

    C90T LJJIJ();

    boolean LJJIJIIJI();

    boolean LJJIJIIJIL();

    void LJJIJIL(int i, Aweme aweme, String str, String str2, boolean z);

    boolean LJJIJL(List<? extends Map<String, ? extends Object>> list, boolean z);

    boolean LJJIJLIJ(String str);

    boolean LJJIL(String str, String str2);

    void LJJIZ(FragmentManager fragmentManager, boolean z, Map<String, String> map);

    String LJJJ(boolean z);

    boolean LJJJI();

    boolean LJJJIL();

    View LJJJJ(int i, ViewGroup viewGroup);

    boolean LJJJJI();

    String LJJJJIZL();

    boolean LJJJJJ();

    void LJJJJJL(ViewGroup viewGroup, Context context, Aweme aweme, String str, String str2, long j);

    String LJJJJL(Aweme aweme);

    void LJJJJLI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2);

    void LJJJJLL(Aweme aweme, boolean z);

    Object LJJJJZ(Aweme aweme);

    ISearchResultStatistics LJJJJZI();

    BaseMovementMethod LJJJLIIL();

    ISearchContextAbility LJJJLL();

    InterfaceC51676KPw LJJJLZIJ();

    void LJJJZ(Uri uri);

    C4H5 LJJL();

    boolean LJJLI();

    void LJJLIIIIJ();

    boolean LJJLIIIJ();

    void LJJLIIIJILLIZJL();

    void LJJLIIIJJI(EnumC51264KAa enumC51264KAa);

    void LJJLIIIJJIZ(e eVar);

    void LJJLIIIJL();

    C50948Jz6 LJJLIIIJLJLI();

    void LJJLIIIJLLLLLLLZ(int i, String str, String str2, String str3, String str4, String str5);

    InterfaceC65350Pko<? extends C8W0> LJJLIIJ();

    void LJJLIL(int i);

    void LJJLJ(long j, String str);

    InterfaceC50670Juc LJJLJLI(ECSearchEntranceData eCSearchEntranceData, Integer num);

    boolean LJJLL();

    Map<String, String> LJJZ(String str, String str2, String... strArr);

    void LJJZZI(Uri uri);

    boolean LJJZZIII(Aweme aweme);

    boolean LJL();

    int LJLI();

    boolean LJLIIIL();

    boolean LJLIIL(Aweme aweme, M89 m89);

    SearchSecurityControlValue LJLIL();

    InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJLILLLLZI();

    void LJLJI();

    void LJLJJI(Activity activity, long j, String str, String str2);

    HashMap<String, String> LJLJJL(String str, String str2);

    String LJLJJLL(String str);

    void LJLJL();

    LynxUI<?> LJLJLJ(VNU vnu);

    void LJLJLLL(LifecycleOwner lifecycleOwner, Aweme aweme, Map<String, String> map);

    InterfaceC65350Pko<? extends ReusedUIAssem<? extends C3C8>> LJLL();

    void LJLLI(Context context, SearchResultParam searchResultParam);

    void LJLLILLLL(C50652JuK c50652JuK, InterfaceC63694OzC interfaceC63694OzC, String str);

    void LJLLJ(Fragment fragment, String str);

    boolean LJLLL();

    void LJLLLL(Context context, String str, String str2, boolean z, Map<String, String> map, Map<String, String> map2);

    InterfaceC221168m8 LJLLLLLL();

    void LJLZ(int i, View view);

    Fragment LJZ(K75 k75);

    boolean LJZI(M89 m89);

    boolean LJZL();

    ISearchContextAbility LL(InterfaceC80653En interfaceC80653En);

    void LLD(MusicSearchHistory musicSearchHistory);

    List<C40197Fq5> LLF();

    void LLFF(Context context, SearchResultParam searchResultParam);

    KGT LLFFF(SearchResultParam searchResultParam, SearchKeywordPresenter searchKeywordPresenter, KRC krc);

    LynxUI<?> LLFII(VNU vnu);

    void LLFZ();

    void LLI(String str);

    C48Q LLIFFJFJJ(RecyclerView recyclerView);

    JSONObject LLII();

    String LLIIII(Context context);

    boolean LLIIIILZ();

    void LLIIIJ(String str);

    boolean LLIIIL();

    void LLIIIZ(String str);

    LynxUI<?> LLIIJI(VNU vnu);

    boolean LLIIJLIL(Aweme aweme, String str);

    void LLIIL(String str, String str2);

    void LLIILII(C38150EyA c38150EyA, WeakReference<Context> weakReference);

    void LLIILZL(Aweme aweme);

    boolean LLIIZ(String str);

    Aweme LLIL(Aweme aweme);

    void LLILII(Context context, Bundle bundle);

    boolean LLILIL();

    void LLILL(C49586Jd8 c49586Jd8, C49587Jd9 c49587Jd9);

    void LLILLIZIL(LifecycleOwner lifecycleOwner);

    IMusicSearchContextAbility LLILLJJLI();

    void LLILLL(String str, Fragment fragment, InterfaceC50392Jq8 interfaceC50392Jq8);

    InterfaceC212198Ul LLILZ();

    boolean LLILZIL();

    void LLILZLL(Aweme aweme, String str, String str2, String str3, String str4);

    void LLIZ();

    Map<String, String> LLIZLLLIL();

    ISearchContextAbility LLJ();

    void LLJI(List<String> list, boolean z, Activity activity);

    void LLJIJIL(C84553Tn c84553Tn);

    void LLJILJIL(int i);

    EnumC223268pW LLJILJILJ();

    boolean LLJILLL(Context context, Aweme aweme);

    void LLJJ(C50450Jr4 c50450Jr4);

    ISearchContextAbility LLJJI(Aweme aweme);

    void LLJJIII(Activity activity, String str, String str2, long j, long j2, long j3, Integer num);

    boolean LLJJIJI();

    void LLJJIJIIJIL(EnumC223268pW enumC223268pW);

    void LLJJIJIL(Context context, Bundle bundle);

    void LLJJJ(String str, boolean z);

    boolean LLJJJIL();

    Map LLJJJJ(String str, String str2, String str3, String str4, Map map);

    void LLJJJJJIL(Integer num, String str);

    void LLJJJJLIIL(String str, String str2, String str3);

    HashMap<String, String> LLJJL(Aweme aweme, String str);

    void LLJJLIIIJLLLLLLLZ(Fragment fragment, boolean z);

    boolean LLJL(Context context);

    boolean LLJLIL();

    void LLJLILLLLZIIL(AqS185S0100000_3 aqS185S0100000_3);

    Long LLJLL();

    Map<String, String> LLJLLIL(String str, String str2);

    void LLJLLL(Fragment fragment, boolean z);

    String LLJZ();

    void LLJZIJLIL(String str, Fragment fragment, InterfaceC50393Jq9 interfaceC50393Jq9);

    boolean LLL(String str);

    boolean LLLF(Aweme aweme);

    void LLLFF(Context context, String str, Map<String, String> map);

    String LLLFFI(Context context, User user);

    boolean LLLFZ();

    ISearchContextAbility LLLI(View view);

    InterfaceC224618rh LLLII();

    void LLLIIII(long j, String str, boolean z);

    String LLLIIIIL(Aweme aweme);

    boolean LLLIIIL();

    void LLLIIL(String str, String str2, String str3, String str4);

    void LLLIILIL();

    void LLLIL(String str);

    InterfaceC51567KLr LLLILZ(Bundle bundle);

    boolean LLLILZJ();

    void LLLILZLLLI(Context context, C50434Jqo c50434Jqo);

    boolean LLLIZZ();

    void LLLJ();

    boolean LLLJIL(String str);

    boolean LLLJL();

    void LLLL(String str, String str2);

    void LLLLII(Aweme aweme);

    String LLLLIIIILLL();

    boolean LLLLIIL(Context context, Aweme aweme, Fragment fragment);

    Map<String, String> LLLLIILL();

    boolean LLLLIILLL(Lifecycle lifecycle);

    TakoInfoModel LLLLIL();

    void LLLLILI(String str, String str2, String str3, String str4);

    View LLLLJ(long j, Context context, Aweme aweme, String str, String str2, boolean z, boolean z2);

    boolean LLLLJI();

    void LLLLL();

    KG6 LLLLLIL();

    ISearchContextAbility LLLLLILLIL(LifecycleOwner lifecycleOwner);

    void LLLLLJIL(boolean z, Fragment fragment, View view, Aweme aweme, String str, String str2);

    FeedSearchIconViewModel LLLLLJLJLL(ActivityC45651qj activityC45651qj);

    String LLLLLL();

    void LLLLLLIL(Context context, Bundle bundle);

    void LLLLLLJ(Aweme aweme, String str, String str2, String str3, String str4);

    boolean LLLLLLL();

    KGV LLLLLLLLL();

    boolean LLLLLLLLLL(Aweme aweme, String str);

    List<InterfaceC38186Eyk> LLLLLLLZIL(F3T f3t);

    boolean LLLLLLZ();

    void LLLLLLZZ(Map<String, String> map);

    boolean LLLLLZ(Context context);

    boolean LLLLLZIL();

    boolean LLLLLZL();

    void LLLLZ(Context context, String str, Map<String, String> map);

    boolean LLLLZI();

    void LLLLZIL();

    boolean LLLLZLL(Aweme aweme);

    InterfaceC38012Evw getJSMethodByName(C38150EyA c38150EyA, WeakReference<Context> weakReference, String str);

    Map<String, InterfaceC38012Evw> getJSMethods(C38150EyA c38150EyA, WeakReference<Context> weakReference);
}
