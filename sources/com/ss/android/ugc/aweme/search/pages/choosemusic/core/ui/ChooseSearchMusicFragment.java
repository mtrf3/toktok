package com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C1799074g;
import X.C184077Kh;
import X.C188727au;
import X.C19K;
import X.C1B3;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2U8;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C49814Jgo;
import X.C50287JoR;
import X.C50674Jug;
import X.C51057K2b;
import X.C51058K2c;
import X.C51105K3x;
import X.C51433KGn;
import X.C51468KHw;
import X.C51493KIv;
import X.C56412MCa;
import X.C5H3;
import X.C61630OGs;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C6ZT;
import X.C76800UCe;
import X.C78496UrM;
import X.C78897Uxp;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC61629OGr;
import X.FMX;
import X.HJZ;
import X.IKO;
import X.IKR;
import X.InterfaceC1798974f;
import X.InterfaceC212198Ul;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC51059K2d;
import X.InterfaceC51567KLr;
import X.InterfaceC65350Pko;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.K2I;
import X.K2O;
import X.K2Z;
import X.KI2;
import X.KI3;
import X.KIB;
import X.KIG;
import X.KIH;
import X.KII;
import X.KIK;
import X.KIY;
import X.KJC;
import X.KO4;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.TBT;
import X.TBW;
import X.V16;
import X.X1D;
import X.XVF;
import X.Z9N;
import Y.IDAListenerS234S0100000_8;
import Y.IDObjectS180S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.choosemusic.fragment.NewMusicTabFragment;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel;
import com.ss.android.ugc.aweme.search.pages.choosemusic.result.core.ui.DynamicSearchMusicResultFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.viewmodel.ChooseSearchMusicViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS13S0010000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.AqS32S0001000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class ChooseSearchMusicFragment extends AmeBaseFragment implements InterfaceC51567KLr, View.OnClickListener, KPL, TextView.OnEditorActionListener {
    public static final /* synthetic */ int LLFII = 0;
    public int LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public C50674Jug LJLJJI;
    public SearchKeywordPresenter LJLJJL;
    public C51468KHw LJLJJLL;
    public KIY LJLJL;
    public C50287JoR LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public DynamicSearchMusicResultFragment LJLLILLLL;
    public String LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public long LJLLLLLL;
    public long LJLZ;
    public int LJZ;
    public String LJZI;
    public boolean LJZL;
    public boolean LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C5H3 LLFF;
    public final Map<Integer, View> LLFFF = new LinkedHashMap();

    @Override // X.InterfaceC51567KLr
    public final void Nb() {
        this.LL = false;
        ((TextView) _$_findCachedViewById(R.id.czt)).setText("");
        KIY kiy = this.LJLJL;
        if (kiy != null) {
            ((KIK) kiy).LIZ.LJLJL = "";
        }
        Il();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFFF;
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

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    public ChooseSearchMusicFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChooseSearchMusicViewModel.class);
        AqS158S0100000_8 aqS158S0100000_8 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 189);
        KIB kib = KIB.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), kib, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS158S0100000_8, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), kib, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(ChooseSearchMusicStateViewModel.class);
        AqS158S0100000_8 aqS158S0100000_82 = new AqS158S0100000_8((InterfaceC65350Pko) LIZ2, 190);
        C51058K2c c51058K2c = C51058K2c.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(aqS158S0100000_82, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c51058K2c, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, c9be)) {
            c214298b32 = new C214298b3(aqS158S0100000_82, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c51058K2c, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b32;
        this.LJLJLLL = "";
        this.LJZI = "";
        this.LJZL = true;
        this.LLD = C221108m2.LIZIZ(C51433KGn.LJLIL);
        this.LLF = C221108m2.LIZIZ(KII.LJLIL);
        this.LLFF = V16.LJJJJLL(new AqS158S0100000_8(this, 187));
    }

    public final void Gl() {
        String str;
        SearchKeywordPresenter searchKeywordPresenter = this.LJLJJL;
        if (searchKeywordPresenter == null || (str = searchKeywordPresenter.getKeyword().LJLIL) == null || str.length() == 0) {
            LJIJI();
            return;
        }
        C51468KHw c51468KHw = new C51468KHw();
        c51468KHw.LIZIZ = str;
        c51468KHw.LIZ = "normal_search";
        Al(c51468KHw);
        C2U8.LIZ(new IKR());
    }

    public final ChooseSearchMusicViewModel wl() {
        return (ChooseSearchMusicViewModel) this.LJLILLLLZI.getValue();
    }

    public final void Il() {
        View et_search = _$_findCachedViewById(R.id.czt);
        o.LJIIIIZZ(et_search, "et_search");
        C51493KIv.LIZIZ(et_search, new AqS158S0100000_8(this, 188));
    }

    public final void LJIJI() {
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.czt));
        _$_findCachedViewById(R.id.czt).clearFocus();
        ChooseSearchMusicViewModel wl = wl();
        wl.getClass();
        wl.setState(new AqS13S0010000_8(false, 12));
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C2U8.LIZ(new KIH(-1));
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(childFragmentManager);
        List<Fragment> LJJJJLI = getChildFragmentManager().LJJJJLI();
        o.LJIIIIZZ(LJJJJLI, "childFragmentManager.fragments");
        Iterator<Fragment> it = LJJJJLI.iterator();
        while (it.hasNext()) {
            c1b3.LJJI(it.next());
        }
        c1b3.LJI();
    }

    public final boolean xl() {
        if (K2Z.LIZ() != 0 && this.LJLIL != 2) {
            return true;
        }
        return false;
    }

    public final void Al(C51468KHw c51468KHw) {
        if (!isViewValid() || c51468KHw == null || TextUtils.isEmpty(c51468KHw.LIZIZ)) {
            return;
        }
        ((AssemViewModel) this.LJLJI.getValue()).setState(C51057K2b.LJLIL);
        SearchKeywordPresenter searchKeywordPresenter = this.LJLJJL;
        if (searchKeywordPresenter != null) {
            String str = c51468KHw.LIZIZ;
            o.LJIIIIZZ(str, "param.keyword");
            searchKeywordPresenter.LIZ(new C49814Jgo(str, ""));
        }
        c51468KHw.LJII = this.LJZ;
        this.LJLJJLL = c51468KHw;
        if (((InterfaceC212198Ul) this.LLD.getValue()).LIZLLL()) {
            C51468KHw c51468KHw2 = this.LJLJJLL;
            o.LJI(c51468KHw2);
            if (c51468KHw2.LJ == null) {
                this.LJLJLJ = null;
                ((C51105K3x) this.LLFF.getValue()).LIZJ();
            }
        }
        c51468KHw.LJFF = this.LJLLLLLL;
        c51468KHw.LJI = this.LJLZ;
        ChooseSearchMusicViewModel wl = wl();
        wl.getClass();
        wl.setState(new AqS174S0100000_8(c51468KHw, 260));
        ChooseSearchMusicViewModel wl2 = wl();
        wl2.getClass();
        wl2.setState(new AqS32S0001000_8(0, 8));
        if (!c51468KHw.LIZJ) {
            KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.czt));
            Z9N.LIZIZ.LLD(new MusicSearchHistory(c51468KHw.LIZIZ));
        }
        _$_findCachedViewById(R.id.czt).clearFocus();
        ChooseSearchMusicViewModel wl3 = wl();
        wl3.getClass();
        wl3.setState(new AqS13S0010000_8(false, 12));
        this.LJLLI = true;
        String str2 = c51468KHw.LIZIZ;
        o.LJIIIIZZ(str2, "param.keyword");
        if (_$_findCachedViewById(R.id.czt) != null && !TextUtils.isEmpty(str2)) {
            ((TextView) _$_findCachedViewById(R.id.czt)).setText(str2);
        }
        this.LJLLI = false;
        Hl(false);
        ((InterfaceC51059K2d) this.LLF.getValue()).setLastSearchSoundPage(HJZ.SEARCH_RES_PAGE);
    }

    @Override // X.InterfaceC51567KLr
    public final void B5(C50674Jug c50674Jug) {
        this.LJLJJI = c50674Jug;
    }

    public final void Dl(boolean z) {
        String str;
        if (wl().getState().LJLIL == 1) {
            return;
        }
        ChooseSearchMusicViewModel wl = wl();
        wl.getClass();
        wl.setState(new AqS32S0001000_8(1, 8));
        if (z) {
            K2O k2o = new K2O();
            k2o.LJIJI(((ChooseSearchMusicStateViewModel) this.LJLJI.getValue()).gv0());
            if (xl() && !this.LL) {
                str = "return";
            } else {
                str = "cancel";
            }
            k2o.LJIIZILJ("enter_method", str);
            String str2 = XVF.LIZ;
            C1799074g c1799074g = InterfaceC1798974f.LIZ;
            k2o.LJ("search_entrance", str2, c1799074g);
            k2o.LJ("creation_id", XVF.LJ, c1799074g);
            k2o.LJIILIIL();
        }
    }

    public final void Hl(boolean z) {
        int i;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.caw);
        if (_$_findCachedViewById == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    @Override // X.InterfaceC51567KLr
    public final void md(KIK kik) {
        this.LJLJL = kik;
    }

    @QD3
    public final void onChooseMusicDismissKeyboardEvent(IKO event) {
        o.LJIIIZ(event, "event");
        LJIJI();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment LJJJIL;
        Integer num = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        }
        String str = "";
        boolean z = true;
        if (num != null) {
            if (num.intValue() == R.id.mit) {
                KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.czt));
                FragmentManager fragmentManager = getFragmentManager();
                if (fragmentManager == null || (LJJJIL = fragmentManager.LJJJIL("ChooseSearchMusicFragment")) == null || !LJJJIL.isAdded()) {
                    return;
                }
                ((TextView) _$_findCachedViewById(R.id.czt)).setText("");
                KIY kiy = this.LJLJL;
                if (kiy == null) {
                    return;
                }
                ((KIK) kiy).LIZ.wl();
                return;
            }
            if (num.intValue() == R.id.mir) {
                Gl();
                return;
            }
            if (num.intValue() == R.id.f0d) {
                this.LL = true;
                ((TextView) _$_findCachedViewById(R.id.czt)).setText("");
                KIY kiy2 = this.LJLJL;
                if (kiy2 != null) {
                    ((KIK) kiy2).LIZ.LJLJL = "";
                }
                Il();
                return;
            }
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == R.id.jfn) {
            if (C6ZT.LIZ(view)) {
                return;
            }
            C51105K3x c51105K3x = (C51105K3x) this.LLFF.getValue();
            HashMap hashMap = new HashMap();
            if (_$_findCachedViewById(R.id.czt) != null) {
                str = String.valueOf(((C19K) _$_findCachedViewById(R.id.czt)).getText());
            }
            hashMap.put("search_keyword", str);
            hashMap.put("search_id", this.LJLJLLL);
            hashMap.put("search_type", "music_create");
            hashMap.put("enter_from", "search_music");
            c51105K3x.LIZLLL(hashMap);
            return;
        }
        if (num.intValue() != R.id.caw) {
            return;
        }
        String str2 = XVF.LJ;
        String str3 = XVF.LIZ;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "search_music_blankpage");
        c188727au.LJIIIZ("creation_id", str2);
        c188727au.LJIIIZ("previous_page", str3);
        FMX.LJIIL("click_discover_more_sounds", c188727au.LIZ);
        KeyboardUtils.LIZIZ(_$_findCachedViewById(R.id.czt));
        KIY kiy3 = this.LJLJL;
        if (kiy3 != null) {
            ((KIK) kiy3).LIZ.wl();
        }
        int position = EnumC61629OGr.TAB_TYPE_DISCOVER.getPosition();
        KIY kiy4 = this.LJLJL;
        if (kiy4 == null) {
            return;
        }
        KIK kik = (KIK) kiy4;
        NewMusicTabFragment newMusicTabFragment = kik.LIZ.LJLJJL;
        if (newMusicTabFragment == null) {
            return;
        }
        newMusicTabFragment.Nl();
        BaseChooseMusicFragment baseChooseMusicFragment = kik.LIZ;
        NewMusicTabFragment newMusicTabFragment2 = baseChooseMusicFragment.LJLJJL;
        if (!baseChooseMusicFragment.LLI || !KO4.LIZ()) {
            z = false;
        }
        newMusicTabFragment2.Rl(C61630OGs.LIZIZ(position, z));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LJLIL = arguments.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            this.LJZ = arguments.getInt("sound_page_scene", 0);
            this.LJLLL = arguments.getString("creation_id");
            this.LJLLLL = arguments.getString("shoot_way");
            this.LJLLLLLL = arguments.getLong("max_video_duration", 0L);
            this.LJLZ = arguments.getLong("shoot_video_length", 0L);
            String string = arguments.getString("music_default_query", "");
            o.LJIIIIZZ(string, "getString(MusicConstants….MUSIC_DEFAULT_QUERY, \"\")");
            this.LJZI = string;
            this.LJZL = arguments.getBoolean("music_initial_load", true);
        }
        CommerceMediaServiceImpl.LIZJ().LJIIJJI(this).LU();
    }

    @QD3
    public final void onInnerMusicSearchEvent(K2I k2i) {
        String str;
        C51468KHw c51468KHw;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchMusicResultFragment InnerMusicSearchEventNew: ");
        if (k2i != null && (c51468KHw = k2i.LJLIL) != null) {
            str = c51468KHw.LIZIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (!isViewValid() || k2i == null) {
            return;
        }
        Al(k2i.LJLIL);
    }

    @QD3
    public final void onSugCompletionEvent(KIG kig) {
        if (!isViewValid() || kig == null) {
            return;
        }
        String str = kig.LJLIL;
        if (str == null) {
            str = "";
        }
        if (_$_findCachedViewById(R.id.czt) != null && !TextUtils.isEmpty(str)) {
            ((TextView) _$_findCachedViewById(R.id.czt)).setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((EditText) _$_findCachedViewById(R.id.czt)).setSelection(str.length());
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJJL = new SearchKeywordPresenter(mo49getActivity);
        }
        C8YN.LJII(this, wl(), new TBT() { // from class: X.KI5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((KI0) obj).LJLIL);
            }
        }, null, new AqS190S0100000_8(this, 19), 6);
        C8YN.LJII(this, wl(), new TBT() { // from class: X.KI6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((KI0) obj).LJLJJL;
            }
        }, null, new AqS190S0100000_8(this, 20), 6);
        C8YN.LJII(this, wl(), new TBT() { // from class: X.KIA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((KI0) obj).LJLJJLL;
            }
        }, null, new AqS190S0100000_8(this, 21), 6);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.mit), this);
        C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.mir), this);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.jfn), this);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.f0d), this);
        ((TextView) _$_findCachedViewById(R.id.czt)).setOnEditorActionListener(this);
        _$_findCachedViewById(R.id.czt).setOnTouchListener(new IDTListenerS117S0100000_8(this, 3));
        ((TextView) _$_findCachedViewById(R.id.czt)).addTextChangedListener(new IDObjectS180S0100000_8(this, 2));
        if (xl()) {
            TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.f1y);
            if (K2Z.LIZ() == 4) {
                i = R.attr.eb;
            } else {
                i = R.attr.go;
            }
            tuxIconView.setTintColorRes(i);
            _$_findCachedViewById(R.id.mit).setVisibility(8);
            _$_findCachedViewById(R.id.mir).setVisibility(0);
            Hl(true);
            if (!this.LJZL && this.LJZI.length() > 0) {
                String str = this.LJZI;
                if (((InterfaceC51059K2d) this.LLF.getValue()).getLastSearchSoundPage() == HJZ.SEARCH_RES_PAGE) {
                    SearchKeywordPresenter searchKeywordPresenter = this.LJLJJL;
                    if (searchKeywordPresenter != null) {
                        searchKeywordPresenter.LIZ(new C49814Jgo(str, 2));
                    }
                    Gl();
                    LJIJI();
                    z = true;
                    C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.caw), this);
                } else {
                    ((TextView) _$_findCachedViewById(R.id.czt)).setText(str);
                    ((EditText) _$_findCachedViewById(R.id.czt)).setSelection(str.length());
                }
            }
            z = false;
            C16880lQ.LJIJ((RelativeLayout) _$_findCachedViewById(R.id.caw), this);
        } else {
            Hl(false);
            z = false;
        }
        Z9N z9n = Z9N.LIZIZ;
        if ((!z9n.LJL() || this.LJLJJI == null) && !z) {
            Il();
            ChooseSearchMusicViewModel wl = wl();
            wl.getClass();
            wl.setState(new AqS32S0001000_8(1, 8));
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.jfn);
        if (_$_findCachedViewById != null) {
            C78897Uxp.LJJJJLI(_$_findCachedViewById, null);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.f0d);
        if (_$_findCachedViewById2 != null) {
            C78897Uxp.LJJJJLI(_$_findCachedViewById2, null);
        }
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.mir);
        if (_$_findCachedViewById3 != null) {
            C78897Uxp.LJJJJLI(_$_findCachedViewById3, null);
        }
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.mit);
        if (_$_findCachedViewById4 != null) {
            C78897Uxp.LJJJJLI(_$_findCachedViewById4, null);
        }
        if (z9n.LJL()) {
            KI3 ki3 = new KI3(this);
            KJC kjc = KJC.LIZIZ;
            TuxIconView tuxIconView2 = (TuxIconView) _$_findCachedViewById(R.id.ndu);
            OSZ[] oszArr = new OSZ[3];
            String str2 = XVF.LIZ;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            oszArr[0] = new OSZ("enter_from", str2);
            oszArr[1] = new OSZ("enter_from_second", "search_box_right");
            String str4 = XVF.LJ;
            if (str4 == null) {
                str4 = "";
            }
            oszArr[2] = new OSZ("creation_id", str4);
            kjc.initEditVoiceButton(tuxIconView2, this, ki3, C113554cx.LJJJLZIJ(oszArr), new KI2(this));
            TuxIconView tuxIconView3 = (TuxIconView) _$_findCachedViewById(R.id.ndv);
            OSZ[] oszArr2 = new OSZ[3];
            String str5 = XVF.LIZ;
            if (str5 == null) {
                str5 = "";
            }
            oszArr2[0] = new OSZ("enter_from", str5);
            oszArr2[1] = new OSZ("enter_from_second", "search_result");
            String str6 = XVF.LJ;
            if (str6 != null) {
                str3 = str6;
            }
            oszArr2[2] = new OSZ("creation_id", str3);
            kjc.LIZ.initVoiceButton(tuxIconView3, this, ki3, C113554cx.LJJJLZIJ(oszArr2));
            C50674Jug c50674Jug = this.LJLJJI;
            if (c50674Jug != null) {
                C51468KHw c51468KHw = new C51468KHw();
                c51468KHw.LIZ = "voice_input";
                c51468KHw.LIZIZ = c50674Jug.LJLIL;
                Al(c51468KHw);
                this.LJLJJI = null;
            }
        }
        C8VV.LIZ(this, false, new AqS174S0100000_8(this, 190));
    }

    public final void vl(boolean z, boolean z2) {
        if (z) {
            _$_findCachedViewById(R.id.jfn).setClickable(true);
            if (!z2) {
                ((TuxIconView) _$_findCachedViewById(R.id.jfn)).setTintColorRes(R.attr.eb);
                return;
            } else {
                ((TuxIconView) _$_findCachedViewById(R.id.jfn)).setTintColorRes(R.attr.go);
                return;
            }
        }
        if (Z9N.LIZIZ.LLILZ().LJFF()) {
            _$_findCachedViewById(R.id.jfn).setClickable(true);
            ((TuxIconView) _$_findCachedViewById(R.id.jfn)).setTintColorRes(R.attr.go);
        } else {
            _$_findCachedViewById(R.id.jfn).setClickable(false);
            ((TuxIconView) _$_findCachedViewById(R.id.jfn)).setTintColorRes(R.attr.gp);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation loadAnimation = AnimationUtils.loadAnimation(mo49getActivity(), R.anim.az);
        loadAnimation.setStartOffset(20L);
        loadAnimation.setAnimationListener(new IDAListenerS234S0100000_8(this, 0));
        Animation loadAnimation2 = AnimationUtils.loadAnimation(mo49getActivity(), R.anim.b0);
        loadAnimation2.setStartOffset(10L);
        loadAnimation2.setAnimationListener(new IDAListenerS234S0100000_8(this, 1));
        if (i2 == R.anim.az) {
            return loadAnimation;
        }
        if (i2 == R.anim.b0) {
            return loadAnimation2;
        }
        return super.onCreateAnimation(i, z, i2);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.cfs, viewGroup, false, "inflater.inflate(R.layou…c_root, container, false)");
        XVF.LJFF = this.LJLLLL;
        XVF.LJ = this.LJLLL;
        try {
            ViewTreeLifecycleOwner.set(LIZIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZIZ, this);
            C10A.LIZIZ(LIZIZ, this);
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
        return LIZIZ;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 3) {
            Gl();
            return false;
        }
        return false;
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
