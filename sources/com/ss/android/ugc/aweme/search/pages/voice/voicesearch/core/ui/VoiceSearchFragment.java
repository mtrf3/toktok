package com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.ui;

import X.ActivityC45651qj;
import X.C10620bK;
import X.C10660bO;
import X.C10A;
import X.C10K;
import X.C110614Vt;
import X.C113624d4;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C29701Eo;
import X.C29S;
import X.C32151Nz;
import X.C32581Pq;
import X.C32591Pr;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C45631qh;
import X.C50764Jw8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C64707PaR;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78685UuP;
import X.C78897Uxp;
import X.C78926UyI;
import X.C78983UzD;
import X.C78996UzQ;
import X.C85990Xow;
import X.C85999Xp5;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C93594aTO;
import X.C93793aWb;
import X.C93877aXx;
import X.C93878aXy;
import X.C93934aYs;
import X.C93935aYt;
import X.C93963aZL;
import X.C93985aZh;
import X.C94352afc;
import X.C94592ajU;
import X.C94593ajV;
import X.C94594ajW;
import X.C9BD;
import X.C9BE;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.T5S;
import X.TBT;
import X.TBW;
import X.ViewOnClickListenerC13880ga;
import X.ViewOnClickListenerC93905aYP;
import X.X1D;
import X.Z9N;
import Y.IDCListenerS139S0100000_42;
import Y.IDObserverS227S0100000_42;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.repo.VoiceSearchSugApi;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchSugViewModel;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.core.viewmodel.VoiceSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.viewmodel.LanguageSelectionState;
import com.ss.android.ugc.aweme.search.voice.core.config.VoiceSearchMultiLanguageSettings;
import com.ss.android.ugc.aweme.service.ISearchDebugService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS446S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class VoiceSearchFragment extends BaseFragment implements KPL {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public final C214298b3 LJLIL;
    public VoiceSearchSugViewModel LJLILLLLZI;
    public final String LJLJI;
    public final C214378bB LJLJJI;
    public C45631qh LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public C29701Eo LJLJLJ;
    public View LJLJLLL;
    public TuxIconView LJLL;
    public LinearLayoutCompat LJLLI;
    public TuxTextView LJLLILLLL;
    public TuxTextView LJLLJ;
    public TuxTextView LJLLL;
    public TuxTextView LJLLLL;
    public LinearLayoutCompat LJLLLLLL;
    public long LJLZ;
    public int LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public final C62822Ol8 LLD;
    public boolean LLF;
    public String LLFF;
    public String LLFFF;
    public String LLFII;
    public final Observer<C50764Jw8<SuggestWordResponse>> LLFZ;
    public final Map<Integer, View> LLI = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public VoiceSearchFragment() {
        C214298b3 c214298b3;
        AqS60S0110000_3 LJJ;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VoiceSearchViewModel.class);
        IDqS423S0100000_42 iDqS423S0100000_42 = new IDqS423S0100000_42(LIZ, 92);
        C94593ajV c94593ajV = C94593ajV.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(iDqS423S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c94593ajV, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(iDqS423S0100000_42, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c94593ajV, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLIL = c214298b3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("VoiceSearchLanguageSetting");
        LIZ2.append(System.currentTimeMillis());
        this.LJLJI = X1D.LIZIZ(LIZ2);
        IDqS423S0100000_42 iDqS423S0100000_422 = new IDqS423S0100000_42(this, 90);
        C65776Prg LIZ3 = C65352Pkq.LIZ(LanguageSelectionState.class);
        C94594ajW c94594ajW = C94594ajW.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJJI = new C214378bB(LIZ3, iDqS423S0100000_422, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c94594ajW, LJJ, C78926UyI.LJIILLIIL(this, true));
        this.LLD = C221108m2.LIZIZ(new IDqS423S0100000_42(this, 91));
        this.LLFF = "";
        this.LLFFF = "";
        this.LLFII = "";
        this.LLFZ = new IDObserverS227S0100000_42(this, 3);
    }

    public final VoiceSearchViewModel Dl() {
        return (VoiceSearchViewModel) this.LJLIL.getValue();
    }

    public final void Gl() {
        if (this.LJLZ == 0) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJII(xl());
        c188727au.LJIIIZ("board_show_time", String.valueOf(System.currentTimeMillis() - this.LJLZ));
        FMX.LJIIL("voice_recept_board_time", c188727au.LIZ);
    }

    public final void Hl() {
        String str;
        C93878aXy.LIZ.getClass();
        if (((Number) C93878aXy.LIZIZ.getValue()).intValue() == 1) {
            C78996UzQ.LJJ(this.LJLLJ);
            TuxTextView tuxTextView = this.LJLLJ;
            String str2 = "";
            if (tuxTextView != null) {
                tuxTextView.setText("");
            }
            VoiceSearchSugViewModel voiceSearchSugViewModel = this.LJLILLLLZI;
            if (voiceSearchSugViewModel != null) {
                HashMap<String, String> xl = xl();
                if (xl != null && (str = xl.get("group_id")) != null) {
                    str2 = str;
                }
                String str3 = C93985aZh.LIZ(wl()).LIZJ;
                VoiceSearchSugApi.LIZ.getClass();
                C93594aTO.LIZIZ.getTrendingWords(1, "voice_guide", str2, str3).LJ(new C94352afc(voiceSearchSugViewModel), C10K.LJIIIIZZ, null);
            }
        }
    }

    public final void Il() {
        String str;
        C93878aXy.LIZ.getClass();
        if (((Number) C93878aXy.LIZIZ.getValue()).intValue() == 1 && this.LLFF.length() > 0) {
            C78996UzQ.LJJJJL(this.LJLLJ);
            if (this.LLF) {
                this.LLF = false;
                C188727au c188727au = new C188727au();
                HashMap<String, String> xl = xl();
                if (xl == null || (str = xl.get("enter_from")) == null) {
                    str = "";
                }
                c188727au.LJIIIZ("search_position", str);
                c188727au.LJIIIZ("words_source", "voice_input");
                c188727au.LJIIIZ("words_content", this.LLFF);
                c188727au.LJIIIZ("group_id", this.LLFFF);
                c188727au.LJIIIZ("impr_id", this.LLFII);
                FMX.LJIIL("trending_words_show", c188727au.LIZ);
            }
        }
    }

    public final HashMap<String, String> xl() {
        return (HashMap) this.LLD.getValue();
    }

    public static String Al() {
        C10660bO c10660bO;
        String language;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (Build.VERSION.SDK_INT >= 24) {
            c10660bO = new C10660bO(new C32591Pr(C10620bK.LIZ(configuration)));
        } else {
            c10660bO = new C10660bO(new C32581Pq(configuration.locale));
        }
        Locale locale = c10660bO.LIZ.get();
        if (locale == null || (language = locale.getLanguage()) == null) {
            return "en";
        }
        return language;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData;
        super.onDestroy();
        VoiceSearchSugViewModel voiceSearchSugViewModel = this.LJLILLLLZI;
        if (voiceSearchSugViewModel != null && (nextLiveData = voiceSearchSugViewModel.LJLIL) != null) {
            nextLiveData.removeObserver(this.LLFZ);
        }
        if (this.LJLZ != 0) {
            if (!this.LL) {
                C188727au c188727au = new C188727au();
                c188727au.LJII(xl());
                String str2 = "1";
                if (this.LJZL) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("close_type", str);
                if (!this.LJZI) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c188727au.LJIIIZ("success_status", str2);
                C93877aXx.LIZ.getClass();
                if (C93877aXx.LIZ()) {
                    c188727au.LJI("req_id", C93934aYs.LIZ);
                }
                FMX.LJIIL("voice_recept_board_close", c188727au.LIZ);
            }
            Gl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Dl().iv0(2, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLZ = System.currentTimeMillis();
        if (Dl().getState().LJLIL == 0 && isResumed()) {
            Dl().hv0(vl());
            this.LJZ = 1;
        }
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            C78996UzQ.LJJJJL(this.LJLLL);
            TuxTextView tuxTextView = this.LJLLL;
            if (tuxTextView != null) {
                ISearchDebugService iSearchDebugService = (ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class);
                getContext();
                String str = C64707PaR.LIZJ;
                String LIZ = C85990Xow.LIZ();
                if (str == null || str.length() == 0) {
                    str = LIZ;
                } else {
                    o.LJIIIIZZ(str, "{\n            storeRegion\n        }");
                }
                iSearchDebugService.LIZLLL(str, Al(), vl());
                tuxTextView.setText("");
            }
            ((ISearchDebugService) ServiceManager.get().getService(ISearchDebugService.class)).LIZJ();
        }
    }

    public final String vl() {
        String wl = wl();
        if (C93935aYt.LIZIZ() > 0) {
            return C93985aZh.LIZ(wl).LIZLLL;
        }
        return wl;
    }

    public final String wl() {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        Context context = getContext();
        if (context == null || (str = C85999Xp5.LIZJ(context, null, null).getLanguage()) == null) {
            str = "en";
        }
        String Al = Al();
        String region = C64707PaR.LIZJ;
        String LIZ = C85990Xow.LIZ();
        boolean z4 = false;
        if (region == null || region.length() == 0) {
            region = LIZ;
        } else {
            o.LJIIIIZZ(region, "{\n            storeRegion\n        }");
        }
        o.LJIIIZ(region, "region");
        String LJ = C93935aYt.LJ(str);
        String LJ2 = C93935aYt.LJ(Al);
        VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel tiktokVoiceSearchMultiLanguageSettingsModel = (VoiceSearchMultiLanguageSettings.TiktokVoiceSearchMultiLanguageSettingsModel) VoiceSearchMultiLanguageSettings.LIZIZ.getValue();
        if (LJ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "vs_tt_input";
        if ((z && LJ2.length() == 0) || region.length() == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("appLang sysLang Region empty: ");
            if (LJ.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZ2.append(z2);
            LIZ2.append(' ');
            if (LJ2.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            LIZ2.append(z3);
            LIZ2.append(' ');
            if (region.length() == 0) {
                z4 = true;
            }
            LIZ2.append(z4);
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ2));
            if (!C78685UuP.LJJJZ(tiktokVoiceSearchMultiLanguageSettingsModel.saucLanguageDefault)) {
                return "vs_tt_input";
            }
            return tiktokVoiceSearchMultiLanguageSettingsModel.saucLanguageDefault;
        }
        String str3 = C93935aYt.LIZIZ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LJ);
        LIZ3.append(LJ2);
        LIZ3.append(region);
        if (ujb.o.LJJJJIZL(str3, X1D.LIZIZ(LIZ3), true) && !o.LJ(C93935aYt.LIZ, "")) {
            return C93935aYt.LIZ;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LJ);
        LIZ4.append(LJ2);
        LIZ4.append(region);
        C93935aYt.LIZIZ = X1D.LIZIZ(LIZ4);
        OSZ LIZ5 = C93935aYt.LIZ(LJ, region, tiktokVoiceSearchMultiLanguageSettingsModel);
        if (((Boolean) LIZ5.getFirst()).booleanValue()) {
            String str4 = (String) LIZ5.getSecond();
            C93935aYt.LIZ = str4;
            return str4;
        }
        OSZ LIZ6 = C93935aYt.LIZ(LJ2, region, tiktokVoiceSearchMultiLanguageSettingsModel);
        if (((Boolean) LIZ6.getFirst()).booleanValue()) {
            String str5 = (String) LIZ6.getSecond();
            C93935aYt.LIZ = str5;
            return str5;
        }
        if (C78685UuP.LJJJZ(tiktokVoiceSearchMultiLanguageSettingsModel.saucLanguageDefault)) {
            str2 = tiktokVoiceSearchMultiLanguageSettingsModel.saucLanguageDefault;
        }
        C93935aYt.LIZ = str2;
        return str2;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C94592ajU.LJLIL);
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NextLiveData<C50764Jw8<SuggestWordResponse>> nextLiveData;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJLJ = (C29701Eo) view.findViewById(R.id.no7);
        this.LJLJLLL = view.findViewById(R.id.no8);
        this.LJLJJL = (C45631qh) view.findViewById(R.id.nnv);
        this.LJLJLJ = (C29701Eo) view.findViewById(R.id.no7);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fed);
        this.LJLJJLL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTextAlignment(4);
        }
        T5S t5s = new T5S();
        t5s.LIZ(12);
        TuxTextView tuxTextView2 = this.LJLJJLL;
        if (tuxTextView2 != null) {
            tuxTextView2.LJJIZ(24.0f, 36, t5s.getTypeface(), 0.01f);
        }
        this.LJLJL = (TuxTextView) view.findViewById(R.id.kf7);
        this.LJLLL = (TuxTextView) view.findViewById(R.id.nqi);
        this.LJLLLL = (TuxTextView) view.findViewById(R.id.nqj);
        this.LJLLJ = (TuxTextView) view.findViewById(R.id.e5v);
        this.LJLL = (TuxIconView) view.findViewById(R.id.bf7);
        this.LJLLI = (LinearLayoutCompat) view.findViewById(R.id.nm1);
        this.LJLLILLLL = (TuxTextView) view.findViewById(R.id.ffm);
        this.LJLLLLLL = (LinearLayoutCompat) view.findViewById(R.id.noc);
        TuxIconView tuxIconView = this.LJLL;
        if (tuxIconView != null) {
            C78897Uxp.LJJJJLI(tuxIconView, null);
        }
        TuxIconView tuxIconView2 = this.LJLL;
        if (tuxIconView2 != null) {
            C16880lQ.LJJJ(tuxIconView2, new IDCListenerS139S0100000_42(this, 25));
        }
        if (C93935aYt.LIZIZ() > 1) {
            C78996UzQ.LJJJJL(this.LJLLI);
            Context context = getContext();
            if (context != null && (linearLayoutCompat2 = this.LJLLI) != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZLLL = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(0.5d))));
                c110614Vt.LJFF = Integer.valueOf(R.attr.dz);
                c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(30));
                linearLayoutCompat2.setBackground(c110614Vt.LIZ(context));
            }
            LinearLayoutCompat linearLayoutCompat3 = this.LJLLI;
            if (linearLayoutCompat3 != null) {
                C78897Uxp.LJJJJLI(linearLayoutCompat3, null);
            }
            LinearLayoutCompat linearLayoutCompat4 = this.LJLLI;
            if (linearLayoutCompat4 != null) {
                linearLayoutCompat4.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC93905aYP(this)));
            }
            C113624d4 LIZ = C93985aZh.LIZ(wl());
            TuxTextView tuxTextView3 = this.LJLLILLLL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(LIZ.LIZ);
            }
        } else {
            C78996UzQ.LJJ(this.LJLLI);
        }
        C93793aWb.LIZ.getClass();
        if (((Number) C93793aWb.LIZIZ.getValue()).intValue() == 1 && Z9N.LIZIZ.LLLFZ()) {
            if (C93963aZL.LIZ == -1) {
                C93963aZL.LIZ = SpeechEngineGenerator.isEngineSupported("asr") ? 1 : 0;
            }
            if (C93963aZL.LIZ == 1) {
                LinearLayoutCompat linearLayoutCompat5 = this.LJLLLLLL;
                if (linearLayoutCompat5 != null) {
                    C78897Uxp.LJJJJLI(linearLayoutCompat5, null);
                }
                Context context2 = getContext();
                if (context2 != null && (linearLayoutCompat = this.LJLLLLLL) != null) {
                    C110614Vt c110614Vt2 = new C110614Vt();
                    c110614Vt2.LIZLLL = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(0.5d))));
                    c110614Vt2.LJFF = Integer.valueOf(R.attr.dz);
                    c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(30));
                    linearLayoutCompat.setBackground(c110614Vt2.LIZ(context2));
                }
                C78996UzQ.LJJJJL(this.LJLLLLLL);
                LinearLayoutCompat linearLayoutCompat6 = this.LJLLLLLL;
                if (linearLayoutCompat6 != null) {
                    linearLayoutCompat6.setOnClickListener(new ViewOnClickListenerC13880ga(new IDCListenerS139S0100000_42(this, 24)));
                }
            }
        }
        if (o.LJ(((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getSearchDebugSwitch(), Boolean.TRUE)) {
            C93877aXx.LIZ.getClass();
            if (C93877aXx.LIZ()) {
                C78996UzQ.LJJJJL(this.LJLLLL);
                C8YN.LJII(this, Dl(), new TBT() { // from class: X.apz
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C94350afa) obj).LJLJJI;
                    }
                }, null, new IDqS446S0100000_42(this, 9), 6);
            }
        }
        VoiceSearchViewModel Dl = Dl();
        String string = getString(R.string.tse);
        o.LJIIIIZZ(string, "getString(R.string.voicesearch_header)");
        String string2 = getString(R.string.tsd);
        o.LJIIIIZZ(string2, "getString(R.string.voicesearch_failure_header)");
        Dl.getClass();
        Dl.LJLJJI = string;
        Dl.LJLJJL = string2;
        C8YN.LJII(this, Dl(), new TBT() { // from class: X.aq0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C94350afa) obj).LJLJI;
            }
        }, null, new IDqS446S0100000_42(this, 10), 6);
        C8YN.LJII(this, Dl(), new TBT() { // from class: X.aq1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C94350afa) obj).LJLIL);
            }
        }, null, new IDqS446S0100000_42(this, 11), 6);
        VoiceSearchSugViewModel voiceSearchSugViewModel = (VoiceSearchSugViewModel) ViewModelProviders.of(this).get(VoiceSearchSugViewModel.class);
        this.LJLILLLLZI = voiceSearchSugViewModel;
        if (voiceSearchSugViewModel != null && (nextLiveData = voiceSearchSugViewModel.LJLIL) != null) {
            nextLiveData.observe(getViewLifecycleOwner(), this.LLFZ);
        }
        Hl();
        C8YN.LJII(this, (AssemViewModel) this.LJLJJI.getValue(), new TBT() { // from class: X.aq2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C94378ag2) obj).LJLIL);
            }
        }, null, new IDqS446S0100000_42(this, 12), 6);
        View view2 = this.LJLJLLL;
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS139S0100000_42(this, 23), view2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dwm, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
