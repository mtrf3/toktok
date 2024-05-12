package com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.ui;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C184077Kh;
import X.C188727au;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C49995Jjj;
import X.C50002Jjq;
import X.C50013Jk1;
import X.C50068Jku;
import X.C50287JoR;
import X.C50466JrK;
import X.C50469JrN;
import X.C50537JsT;
import X.C50628Jtw;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50799Jwh;
import X.C51468KHw;
import X.C51469KHx;
import X.C51470KHy;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C79409VEn;
import X.C87256YMi;
import X.C8YN;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.FMX;
import X.H96;
import X.InterfaceC65350Pko;
import X.JSE;
import X.KIC;
import X.KIK;
import X.KIO;
import X.KIP;
import X.KIY;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.TBT;
import X.XUC;
import X.XVF;
import X.XVG;
import X.Z9N;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel.DynamicSearchMusicResultViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.viewmodel.SearchMusicPlayViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import com.ss.android.ugc.aweme.services.IDLCallbackS0S0300000_7;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS13S0010000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DynamicSearchMusicResultFragment extends SearchMusicBaseFragment implements KIP, XUC {
    public static final /* synthetic */ int LJZI = 0;
    public MusicPlayHelper LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public long LJLJJLL;
    public String LJLJL;
    public KIY LJLJLJ;
    public int LJLJLLL;
    public LogPbBean LJLL;
    public String LJLLI;
    public C50799Jwh LJLLILLLL;
    public ViewGroup LJLLJ;
    public C51468KHw LJLLL;
    public final Gson LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C214298b3 LJLZ;
    public final C62822Ol8 LJZ;

    @Override // X.XUC
    public final MusicModel LIZLLL() {
        return null;
    }

    @Override // X.XUC
    public final /* synthetic */ void LJJJJIZL(MusicModel musicModel, Exception exc) {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLIZLLLIL() {
    }

    @Override // X.XUC
    public final /* synthetic */ void LLLL(MusicModel musicModel, long j) {
    }

    @Override // X.XUC
    public final /* synthetic */ void T3(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment
    public final void vl(String keyword) {
        o.LJIIIZ(keyword, "keyword");
    }

    public DynamicSearchMusicResultFragment() {
        C214298b3 c214298b3;
        new LinkedHashMap();
        this.LJLJLLL = -1;
        this.LJLLI = "";
        this.LJLLLL = GsonHolder.LIZLLL().LIZ();
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 194));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchMusicPlayViewModel.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 195);
        KIC kic = KIC.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), kic, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), kic, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLZ = c214298b3;
        this.LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 196));
    }

    public final void Dl() {
        String str;
        C50469JrN searchVideoModel;
        String groupId;
        m mVar;
        j LJJIJ;
        C50799Jwh c50799Jwh = this.LJLLILLLL;
        if (c50799Jwh != null) {
            c50799Jwh.LJIIIIZZ(C17N.LJJJJJL(this));
            String str2 = this.LJLIL;
            try {
                SearchResultConfig searchResultConfig = (SearchResultConfig) SettingsManager.LIZLLL().LJIIIIZZ("search_result_config", SearchResultConfig.class, C50002Jjq.LIZIZ);
                C50002Jjq.LIZIZ = searchResultConfig;
                if (searchResultConfig == null || (mVar = searchResultConfig.musicCreateResults) == null || (LJJIJ = mVar.LJJIJ("schema")) == null || (str = LJJIJ.LJJIFFI()) == null) {
                    str = "aweme://lynxview/?channel=fe_search_vertical_lynx&bundle=music-create-results/template.js&dynamic=1&surl=https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/fe_search_vertical_lynx/music-create-results/template.js&ab_params=search_video_mask_gradual_opt,optimize_search_preload_cover,search_create_page_lynx";
                }
                Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
                o.LJIIIIZZ(buildUpon, "parse(schema).buildUpon()");
                String str3 = "";
                if (str2 == null) {
                    str2 = "";
                }
                Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("keyword", str2);
                C50652JuK.Companion.getClass();
                C50650JuI LJII = C50651JuJ.LJII(this);
                if (LJII != null && (searchVideoModel = LJII.getSearchVideoModel()) != null && (groupId = searchVideoModel.getGroupId()) != null) {
                    str3 = groupId;
                }
                appendQueryParameter.appendQueryParameter("lastFromGroupId", str3);
                DynamicPatch dynamicPatch = new DynamicPatch();
                dynamicPatch.schema = buildUpon.toString();
                C50799Jwh c50799Jwh2 = this.LJLLILLLL;
                if (c50799Jwh2 != null) {
                    C50068Jku.LIZIZ(c50799Jwh2, dynamicPatch, null, true, false, 56);
                    return;
                } else {
                    o.LJIJI("dynamicViewContainer");
                    throw null;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        o.LJIJI("dynamicViewContainer");
        throw null;
    }

    public final SearchMusicPlayViewModel wl() {
        return (SearchMusicPlayViewModel) this.LJLZ.getValue();
    }

    public final DynamicSearchMusicResultViewModel xl() {
        return (DynamicSearchMusicResultViewModel) this.LJZ.getValue();
    }

    public final void Hl() {
        SearchMusicPlayViewModel wl = wl();
        wl.getClass();
        wl.withState(new AqS174S0100000_8(wl, 248));
        wl.k2(null);
        wl().getClass();
        Z9N.LIZIZ.LJLJI();
        MusicPlayHelper musicPlayHelper = this.LJLJI;
        if (musicPlayHelper != null) {
            musicPlayHelper.hv0();
        }
    }

    @Override // X.XUC
    public final Activity LJJIZ() {
        return mo49getActivity();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        SearchMusicPlayViewModel wl = wl();
        wl.LJLIL = null;
        wl.LJLJJI = null;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Hl();
    }

    @Override // X.XUC
    public final boolean LJJIIZI() {
        return this.mStatusViewValid;
    }

    public final void Al(Context context) {
        ViewGroup viewGroup;
        try {
            C50799Jwh c50799Jwh = new C50799Jwh(context, this, 12);
            this.LJLLILLLL = c50799Jwh;
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50799Jwh.LJIIJJI;
            ViewParent viewParent = null;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                viewParent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
            }
            if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                viewGroup.removeAllViews();
            }
            Dl();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void Gl(boolean z) {
        SearchStartViewModel searchStartViewModel;
        NextLiveData<Boolean> gv0;
        if (C50013Jk1.LIZ() || (searchStartViewModel = (SearchStartViewModel) this.LJLLLLLL.getValue()) == null || (gv0 = searchStartViewModel.gv0()) == null) {
            return;
        }
        gv0.setValue(Boolean.valueOf(z));
    }

    @Override // X.KIP
    public final void Oh(m mVar) {
        LinkedHashMap linkedHashMap;
        Map linkedHashMap2;
        Map linkedHashMap3;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C50287JoR c50287JoR;
        SubFilterOptionStruct filterByStruct;
        SubFilterOptionStruct sortTypeStruct;
        Map<String, String> map;
        Map<String, String> map2;
        String str6;
        String imprId;
        int i;
        int i2;
        String str7;
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.LJLJJLL);
        C49995Jjj c49995Jjj = C49995Jjj.LIZ;
        c49995Jjj.LIZJ(this.LJLJLLL);
        DynamicSearchMusicResultViewModel xl = xl();
        String str8 = "";
        boolean z = true;
        if (xl != null) {
            Integer num = 0;
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("creation_id", XVF.LJ);
            linkedHashMap.put("max_shoot_time", Long.valueOf(xl.LJLJJLL));
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            linkedHashMap.put("rank", Integer.valueOf(i));
            String str9 = XVF.LIZ;
            if (str9 == null) {
                str9 = "";
            }
            linkedHashMap.put("previous_page", str9);
            Map<String, String> LJFF = new H96().LJFF("is_commercial");
            if ((!LJFF.isEmpty()) && (str7 = LJFF.get("is_commercial")) != null) {
                i2 = CastIntegerProtector.parseInt(str7);
            } else {
                i2 = 0;
            }
            linkedHashMap.put("is_commercial", Integer.valueOf(i2));
            linkedHashMap.put("search_keyword", xl.LJLILLLLZI.LIZIZ);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (mVar != null) {
            XVF.LIZJ = this.LJLIL;
            this.LJLJLLL = c49995Jjj.LIZIZ(new JSE(new DynamicPatch()));
            linkedHashMap.put("data", mVar);
            DynamicSearchMusicResultViewModel xl2 = xl();
            if (xl2 == null || (linkedHashMap3 = xl2.LJLJI) == null) {
                linkedHashMap3 = new LinkedHashMap();
            }
            linkedHashMap.put("request", linkedHashMap3);
            C51468KHw c51468KHw = this.LJLLL;
            if (c51468KHw != null) {
                str = c51468KHw.LIZ;
            } else {
                str = null;
            }
            String str10 = "normal_search";
            if (str == null) {
                str = "normal_search";
            }
            linkedHashMap.put("enter_method", str);
            linkedHashMap.put("sessionid", Integer.valueOf(this.LJLJLLL));
            linkedHashMap.put("dataTransferStartTime", Long.valueOf(System.currentTimeMillis()));
            linkedHashMap.put("searchStartTime", Long.valueOf(this.LJLJJLL));
            linkedHashMap.put("searchDuration", Integer.valueOf(currentTimeMillis));
            C50799Jwh c50799Jwh = this.LJLLILLLL;
            if (c50799Jwh != null) {
                String json = GsonProtectorUtils.toJson(this.LJLLLL, linkedHashMap);
                o.LJIIIIZZ(json, "gson.toJson(templateData)");
                c50799Jwh.LIZJ(json);
                LogPbBean logPbBean = (LogPbBean) GsonProtectorUtils.fromJson(this.LJLLLL, mVar.LJJIJ("log_pb").toString(), LogPbBean.class);
                this.LJLL = logPbBean;
                if (logPbBean != null && (imprId = logPbBean.getImprId()) != null) {
                    str8 = imprId;
                }
                this.LJLLI = str8;
                DynamicSearchMusicResultViewModel xl3 = xl();
                if (xl3 != null) {
                    xl3.LJLJJI = this.LJLLI;
                }
                GlobalDoodleConfig globalDoodleConfig = (GlobalDoodleConfig) GsonProtectorUtils.fromJson(this.LJLLLL, mVar.LJJIJ("global_doodle_config").toString(), GlobalDoodleConfig.class);
                if (globalDoodleConfig != null && globalDoodleConfig.getDisplayFilterBar() != 1) {
                    z = false;
                }
                ChooseSearchMusicViewModel chooseSearchMusicViewModel = this.LJLILLLLZI;
                if (chooseSearchMusicViewModel != null) {
                    chooseSearchMusicViewModel.setState(new AqS13S0010000_8(z, 11));
                }
                ChooseSearchMusicViewModel chooseSearchMusicViewModel2 = this.LJLILLLLZI;
                if (chooseSearchMusicViewModel2 != null) {
                    String value = this.LJLLI;
                    o.LJIIIZ(value, "value");
                    chooseSearchMusicViewModel2.setState(new AqS31S1000000_8(value, 9));
                }
                Gl(z);
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("search_type", "music");
                C51468KHw c51468KHw2 = this.LJLLL;
                if (c51468KHw2 != null && (str6 = c51468KHw2.LIZ) != null) {
                    str10 = str6;
                }
                c188727au.LJIIIZ("enter_method", str10);
                c188727au.LJIIIZ("search_keyword", this.LJLIL);
                c188727au.LJIIIZ("creation_id", this.LJLJL);
                if (this.LJLJJI == 0) {
                    str2 = "video_edit_page";
                } else {
                    str2 = "video_shoot_page";
                }
                c188727au.LJIIIZ("enter_from", str2);
                c188727au.LJIIIZ("trigger_reason", "cold_launch");
                c188727au.LJFF(this.LJLL, "log_pb");
                c188727au.LJIIIZ("new_sug_session_id", KIO.LIZ);
                LogPbBean logPbBean2 = this.LJLL;
                if (logPbBean2 != null) {
                    str3 = logPbBean2.getImprId();
                } else {
                    str3 = null;
                }
                c188727au.LJIIIZ("search_id", str3);
                c188727au.LJ(SearchServiceImpl.LLLZI().LJIILJJIL(this).FD().LIZJ().LJLIL, "search_session_id");
                C51468KHw c51468KHw3 = this.LJLLL;
                if (c51468KHw3 != null && (c50287JoR = c51468KHw3.LJ) != null && (filterByStruct = c50287JoR.getFilterByStruct()) != null && filterByStruct.getLogInfo() != null && (sortTypeStruct = c50287JoR.getSortTypeStruct()) != null && sortTypeStruct.getLogInfo() != null) {
                    c188727au.LJI("enter_method", "tab_search");
                    SubFilterOptionStruct filterByStruct2 = c50287JoR.getFilterByStruct();
                    if (filterByStruct2 != null) {
                        map = filterByStruct2.getLogInfo();
                    } else {
                        map = null;
                    }
                    c188727au.LJIIIIZZ(map);
                    SubFilterOptionStruct sortTypeStruct2 = c50287JoR.getSortTypeStruct();
                    if (sortTypeStruct2 != null) {
                        map2 = sortTypeStruct2.getLogInfo();
                    } else {
                        map2 = null;
                    }
                    c188727au.LJIIIIZZ(map2);
                }
                if (CommerceMediaServiceImpl.LIZJ().LJIIIZ()) {
                    c188727au.LJI("is_commercial", "1");
                }
                FMX.LJIIL("search_music", c188727au.LIZ);
                C87256YMi c87256YMi = C87256YMi.LIZ;
                String str11 = this.LJLIL;
                String str12 = this.LJLLI;
                if (globalDoodleConfig != null) {
                    str4 = globalDoodleConfig.getSearchChannel();
                    str5 = globalDoodleConfig.getNewSource();
                } else {
                    str4 = null;
                    str5 = null;
                }
                LastSearch lastSearch = new LastSearch(str11, str12, str4, str5, Long.valueOf(System.currentTimeMillis()));
                c87256YMi.getClass();
                C17N.LJJJJLL().kO().LIZ(new C50628Jtw(lastSearch));
                return;
            }
            o.LJIJI("dynamicViewContainer");
            throw null;
        }
        ChooseSearchMusicViewModel chooseSearchMusicViewModel3 = this.LJLILLLLZI;
        if (chooseSearchMusicViewModel3 != null) {
            chooseSearchMusicViewModel3.setState(new AqS13S0010000_8(true, 11));
        }
        Gl(true);
        linkedHashMap.put("showNetworkError", 1);
        DynamicSearchMusicResultViewModel xl4 = xl();
        if (xl4 == null || (linkedHashMap2 = xl4.LJLJI) == null) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap.put("request", linkedHashMap2);
        C50799Jwh c50799Jwh2 = this.LJLLILLLL;
        if (c50799Jwh2 != null) {
            String json2 = GsonProtectorUtils.toJson(this.LJLLLL, linkedHashMap);
            o.LJIIIIZZ(json2, "gson.toJson(templateData)");
            c50799Jwh2.LIZJ(json2);
            return;
        }
        o.LJIJI("dynamicViewContainer");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "4715843106825437916");
        if (c03880Dg.LIZJ(10501, "com/ss/android/ugc/aweme/search/pages/choosemusic/result/core/ui/DynamicSearchMusicResultFragment", "onHiddenChanged", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/search/pages/choosemusic/result/core/ui/DynamicSearchMusicResultFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            Hl();
        }
        c03880Dg.LIZIZ(10501, "com/ss/android/ugc/aweme/search/pages/choosemusic/result/core/ui/DynamicSearchMusicResultFragment", "onHiddenChanged", null, objArr, this, c65300Pk0, true);
    }

    @QD3
    public final void onShootSearchMusicEvent(C50466JrK event) {
        o.LJIIIZ(event, "event");
        wl().y8(event.LJLIL.convertToMusicModel());
    }

    @QD3
    public final void onTrimMusicEvent(C50537JsT event) {
        DynamicSearchMusicResultViewModel xl;
        o.LJIIIZ(event, "event");
        Hl();
        if (isAdded() && (xl = xl()) != null) {
            MusicModel musicModel = event.LJLIL;
            XVG musicMobBean = xl.LJLIL;
            String str = xl.LJLJJI;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String rank = event.LJLILLLLZI;
            String tokenType = event.LJLJI;
            o.LJIIIZ(musicModel, "musicModel");
            o.LJIIIZ(musicMobBean, "musicMobBean");
            o.LJIIIZ(rank, "rank");
            o.LJIIIZ(tokenType, "tokenType");
            XVG clone = musicMobBean.clone();
            musicModel.setSearchId(str);
            clone.LJIIIZ = str;
            clone.LIZ = "search_music";
            String str3 = XVF.LIZ;
            o.LJIIIIZZ(str3, "getPreviousPage()");
            if (o.LJ(str3, "video_shoot_page")) {
                str2 = "shoot_page_search";
            } else if (o.LJ(str3, "video_edit_page")) {
                str2 = "edit_page_search";
            }
            clone.LJIIJ = str2;
            clone.LJIILL = rank;
            clone.LJIILJJIL = tokenType;
            MusicService.LJJLIIIJJI().LJJLI(this, musicModel, clone);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.SearchMusicBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NextLiveData<Boolean> gv0;
        Intent intent;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (mo49getActivity() == null) {
            return;
        }
        if (isAdded()) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJII(mo49getActivity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.LJLJI = (MusicPlayHelper) ViewModelProviders.of(mo49getActivity).get(MusicPlayHelper.class);
        }
        Z9N.LIZIZ.LLJILJIL(hashCode());
        DataCenter gv02 = DataCenter.gv0(ViewModelProviders.of(this), this);
        SearchMusicPlayViewModel wl = wl();
        wl.getClass();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new C51469KHx(wl));
        wl.LJLJJI = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.LJ();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper2 = wl.LJLJJI;
        if (chooseMusicDownloadPlayHelper2 != null) {
            chooseMusicDownloadPlayHelper2.LJLJJLL = new C51470KHy(wl);
        }
        wl.LJLIL = gv02;
        boolean z = false;
        gv02.iv0("music_loading", wl, false);
        if (this.LJLLILLLL == null) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            Al(requireContext);
        }
        C50799Jwh c50799Jwh = this.LJLLILLLL;
        if (c50799Jwh != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c50799Jwh.LJIIJJI;
            ViewGroup viewGroup = this.LJLLJ;
            if (viewGroup != null) {
                viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, new ViewGroup.LayoutParams(-1, -1));
                ViewGroup viewGroup2 = this.LJLLJ;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                } else {
                    o.LJIJI("rnFragment");
                    throw null;
                }
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.LJLJJI = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0);
                SearchMusicPlayViewModel wl2 = wl();
                int i = this.LJLJJI;
                ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper3 = wl2.LJLJJI;
                if (chooseMusicDownloadPlayHelper3 != null) {
                    chooseMusicDownloadPlayHelper3.LJLILLLLZI = i;
                }
                this.LJLJL = arguments.getString("creation_id");
                SearchMusicPlayViewModel wl3 = wl();
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 != null && (intent = mo49getActivity2.getIntent()) != null) {
                    z = intent.getBooleanExtra("extra_beat_music_sticker", false);
                }
                wl3.LJLILLLLZI = z;
                this.LJLJJL = arguments.getLong("max_video_duration", 0L);
                DynamicSearchMusicResultViewModel xl = xl();
                if (xl != null) {
                    long j = this.LJLJJL;
                    xl.LJLJJLL = j;
                    xl.LJLIL.LJIIJJI = j;
                }
            }
            DynamicSearchMusicResultViewModel xl2 = xl();
            if (xl2 != null) {
                xl2.getClass();
            }
            DynamicSearchMusicResultViewModel xl3 = xl();
            if (xl3 != null) {
                xl3.LJLJJL = this;
            }
            ChooseSearchMusicViewModel chooseSearchMusicViewModel = this.LJLILLLLZI;
            if (chooseSearchMusicViewModel != null) {
                C8YN.LJII(this, chooseSearchMusicViewModel, new TBT() { // from class: X.KHz
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((KI0) obj).LJLJI;
                    }
                }, null, new AqS190S0100000_8(this, 23), 6);
            }
            SearchStartViewModel searchStartViewModel = (SearchStartViewModel) this.LJLLLLLL.getValue();
            if (searchStartViewModel == null || (gv0 = searchStartViewModel.gv0()) == null) {
                return;
            }
            gv0.setValue(Boolean.valueOf(!C50013Jk1.LIZ()));
            return;
        }
        o.LJIJI("dynamicViewContainer");
        throw null;
    }

    @Override // X.XUC
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        KIY kiy;
        if (musicModel == null || str2 == null || str == null || (kiy = this.LJLJLJ) == null) {
            return;
        }
        BaseChooseMusicFragment baseChooseMusicFragment = ((KIK) kiy).LIZ;
        int i = baseChooseMusicFragment.LJLJI;
        ActivityC45651qj mo49getActivity = baseChooseMusicFragment.mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        if (i == 0 || i == 2) {
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            HashMap hashMap = new HashMap();
            hashMap.put("music_shoot_from_search", "search_music");
            hashMap.put("music_enter_method", "click_music_publish");
            hashMap.put("music_enter_position", musicModel.getEnterPosition());
            if (musicModel.getLogPb() != null && !TextUtils.isEmpty(musicModel.getLogPb().getImprId())) {
                hashMap.put("music_search_id", musicModel.getLogPb().getImprId());
            }
            if (!TextUtils.isEmpty(musicModel.getSearchResultId())) {
                hashMap.put("music_search_result_id", musicModel.getSearchResultId());
            } else if (!TextUtils.isEmpty(musicModel.getMusicId())) {
                hashMap.put("music_search_result_id", musicModel.getMusicId());
            }
            if (!TextUtils.isEmpty(musicModel.getListItemId())) {
                hashMap.put("music_list_item_id", musicModel.getListItemId());
            }
            intent.putExtra("extra_log_params", hashMap);
            mo49getActivity.setResult(-1, intent);
            ChooseMusicWithSceneViewModel chooseMusicWithSceneViewModel = baseChooseMusicFragment.LLIIIILZ;
            if (chooseMusicWithSceneViewModel.LJLIL) {
                chooseMusicWithSceneViewModel.gv0().setValue(new C79409VEn(-1, intent));
                return;
            } else {
                mo49getActivity.finish();
                return;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("shoot_way", "search_result");
        FMX.LJIIL("shoot", c188727au.LIZ);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("search_result");
        builder.musicPath(str);
        builder.musicModel(musicModel);
        builder.musicOrigin(str2);
        AVExternalServiceImpl.LIZ().asyncService("ChooseMusic", new IDLCallbackS0S0300000_7(mo49getActivity, builder, musicModel, 8));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cg6, viewGroup, false);
        View findViewById = LLLLIILL.findViewById(R.id.j6_);
        o.LJIIIIZZ(findViewById, "root.findViewById(R.id.rn_fragment)");
        this.LJLLJ = (ViewGroup) findViewById;
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }
}
