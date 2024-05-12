package com.ss.android.ugc.aweme.mix.mixdetail;

import X.ASQ;
import X.ASX;
import X.AbstractC234519Ih;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.AnonymousClass885;
import X.C00F;
import X.C107794Kx;
import X.C10A;
import X.C111944aM;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C16970lZ;
import X.C184077Kh;
import X.C1DJ;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C213228Yk;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C228628yA;
import X.C229238z9;
import X.C229638zn;
import X.C229718zv;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C283619k;
import X.C29S;
import X.C2IX;
import X.C2KL;
import X.C2U8;
import X.C32151Nz;
import X.C33Q;
import X.C34494DgI;
import X.C3C5;
import X.C3C8;
import X.C40443Fu3;
import X.C4LD;
import X.C52292Kfg;
import X.C52535Kjb;
import X.C53212KuW;
import X.C56303M7v;
import X.C56307M7z;
import X.C56412MCa;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C73305Spp;
import X.C76800UCe;
import X.C78926UyI;
import X.C87P;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9KF;
import X.DZA;
import X.EnumC2063587z;
import X.EnumC35471Dw3;
import X.FMX;
import X.FRW;
import X.HG3;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.M7B;
import X.M7C;
import X.M7T;
import X.M80;
import X.M82;
import X.M83;
import X.M84;
import X.M86;
import X.O6R;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.QD3;
import X.RBX;
import X.SYL;
import X.TBT;
import X.TBW;
import Y.IDrS12S0000000_6;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionStateAgent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixStatisStruct;
import com.ss.android.ugc.aweme.mix.model.MixStatusStruct;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.mix.videodetail.MixVideoDetailActivity;
import com.ss.android.ugc.aweme.utils.Au2S18S0100000_9;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS11S2000000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ujb.o;

/* loaded from: classes10.dex */
public final class MixVideosDialog extends Fragment implements KPL, AnonymousClass885 {
    public static final double LJZ;
    public static final /* synthetic */ int LJZI = 0;
    public TuxSheet LJLIL;
    public final C214298b3 LJLILLLLZI;
    public Aweme LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public Long LJLLILLLL;
    public C229238z9 LJLLJ;
    public C235119Kp LJLLL;
    public ComposeView LJLLLL;
    public final C56307M7z LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
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

    static {
        double d;
        if (C00F.LIZ(31744, 0, "playlist_decrease_panel_height", true) == 1) {
            SettingsManager.LIZLLL().getClass();
            d = SettingsManager.LIZIZ("playlist_panel_settings", 0.6d);
        } else {
            d = 0.73d;
        }
        LJZ = d;
    }

    public MixVideosDialog() {
        C65776Prg LIZ = C65352Pkq.LIZ(MixVideosViewModel.class);
        this.LJLILLLLZI = new C214298b3(LIZ, new AqS159S0100000_9(LIZ, 326), C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C56303M7v.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLJJI = "";
        this.LJLJJL = "";
        this.LJLJJLL = "";
        this.LJLJL = true;
        this.LJLJLJ = "";
        this.LJLJLLL = "";
        this.LJLLI = "";
        this.LJLLLLLL = new C56307M7z(this);
    }

    public final MixVideosViewModel vl() {
        return (MixVideosViewModel) this.LJLILLLLZI.getValue();
    }

    public final void Tk0() {
        if (PlaylistCollectionStateAgent.LJIJ().LJ(this.LJLJJI).booleanValue()) {
            C87P.LIZIZ(PlaylistCollectionStateAgent.LJIILLIIL(), this.LJLJJI, null, null, null, 14);
            FMX.LJIIL("cancel_favourite_playlist", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(new OSZ("enter_from", "playlist"), new OSZ("enter_method", "playlist_panel"), new OSZ("playlist_id", this.LJLJJI), new OSZ("author_id", this.LJLJLJ)), new LinkedHashMap()));
            return;
        }
        C87P.LIZ(PlaylistCollectionStateAgent.LJIILLIIL(), this.LJLJJI, null, new AqS191S0100000_9(this, 25), null, 10);
        FMX.LJIIL("favourite_playlist", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(new OSZ("enter_from", "playlist"), new OSZ("enter_method", "playlist_panel"), new OSZ("playlist_id", this.LJLJJI), new OSZ("author_id", this.LJLJLJ)), new LinkedHashMap()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (!(mo49getActivity() instanceof MixVideoDetailActivity)) {
            vl().hv0();
        }
        this.LJLJL = false;
        if (C213228Yk.LIZ && C53212KuW.LIZIZ) {
            if (C52535Kjb.LIZIZ()) {
                PlaylistCollectionStateAgent.LJIIZILJ().LIZJ(this.LJLLLLLL);
            } else {
                PlaylistCollectionStateAgent.LJIIZILJ().LJIIIIZZ(this);
            }
        }
    }

    public final void wl() {
        Aweme aweme;
        List<Aweme> awemeList;
        MixStruct mixStruct;
        ShareInfo shareInfo;
        String str;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (aweme = this.LJLJI) == null || (awemeList = vl().getAwemeList()) == null || (mixStruct = vl().getState().LJLJL) == null || (shareInfo = mixStruct.getShareInfo()) == null) {
            return;
        }
        boolean LJJJJIZL = o.LJJJJIZL(this.LJLJLJ, ((RBX) HG3.LJIILL()).getCurUser().getUid(), false);
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ("enter_from", this.LJLJJLL);
        oszArr[1] = new OSZ("playlist_id", this.LJLJJI);
        if (LJJJJIZL) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[2] = new OSZ("is_self", str);
        FMX.LJIIL("click_share_playlist", C113554cx.LJJL(oszArr));
        C4LD.LIZ.LJJIIZI(mo49getActivity, this.LJLJJI, this.LJLJJL, aweme, awemeList, shareInfo, LJJJJIZL, this.LJLJJLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        String str4;
        String string;
        com.ss.android.ugc.aweme.feed.model.MixStruct mixInfo;
        Serializable serializable2;
        TuxSheet tuxSheet;
        Dialog dialog;
        Window window;
        super.onCreate(bundle);
        if (DZA.LIZ && (tuxSheet = this.LJLIL) != null && (dialog = tuxSheet.getDialog()) != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(R.style.a9_);
        }
        this.LJLL = 0;
        String str5 = null;
        if (C52292Kfg.LIZ() == 0) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable2 = arguments.getSerializable("key_positioned_aweme");
            } else {
                serializable2 = null;
            }
            this.LJLJI = (Aweme) serializable2;
        } else {
            this.LJLJI = M7T.LIZIZ;
            M7T.LIZIZ = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_search_params");
        } else {
            serializable = null;
        }
        this.LJLLJ = (C229238z9) serializable;
        Aweme aweme = this.LJLJI;
        if (aweme != null) {
            str5 = aweme.getAid();
        }
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        this.LJLLI = str5;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("key_mix_id", "")) == null) {
            str = "";
        }
        this.LJLJJI = str;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("key_mix_name", "")) == null) {
            str2 = "";
        }
        this.LJLJJL = str2;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            arguments5.getString("key_video_from", "");
        }
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (str3 = arguments6.getString("key_mix_uid", "")) == null) {
            str3 = "";
        }
        this.LJLJLJ = str3;
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (str4 = arguments7.getString("key_mix_secuid", "")) == null) {
            str4 = "";
        }
        this.LJLJLLL = str4;
        Aweme aweme2 = this.LJLJI;
        if (aweme2 != null) {
            String authorUid = aweme2.getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            this.LJLJLJ = authorUid;
            String secAuthorUid = aweme2.getSecAuthorUid();
            if (secAuthorUid == null) {
                secAuthorUid = "";
            }
            this.LJLJLLL = secAuthorUid;
        }
        MixVideosViewModel vl = vl();
        String str7 = this.LJLJLJ;
        if (str7 == null) {
            str7 = "";
        }
        vl.LJLLJ = str7;
        MixVideosViewModel vl2 = vl();
        String str8 = this.LJLJLLL;
        if (str8 == null) {
            str8 = "";
        }
        vl2.LJLLL = str8;
        Aweme aweme3 = this.LJLJI;
        if (aweme3 != null && (mixInfo = aweme3.getMixInfo()) != null) {
            String str9 = mixInfo.mixName;
            kotlin.jvm.internal.o.LJIIIIZZ(str9, "it2.mixName");
            this.LJLJJL = str9;
        }
        Bundle arguments8 = getArguments();
        if (arguments8 != null && (string = arguments8.getString("key_mix_dialog_enter_from", "")) != null) {
            str6 = string;
        }
        this.LJLJJLL = str6;
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3
    public final void onEvent(C107794Kx event) {
        kotlin.jvm.internal.o.LJIIIZ(event, "event");
        if (TextUtils.equals("mix_videos", event.LJLJJI)) {
            ASQ.LJ(this, ASX.LIZ);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMixDeleteEvent(M7B event) {
        kotlin.jvm.internal.o.LJIIIZ(event, "event");
        String str = event.LJLILLLLZI;
        if (str != null && kotlin.jvm.internal.o.LJ(this.LJLJJI, str)) {
            Aweme aweme = event.LJLIL;
            if (aweme != null) {
                aweme.playlist_info = null;
                C2U8.LIZ(new C2IX(null, event.LJLILLLLZI, false));
            }
            ASQ.LJ(this, ASX.LIZ);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMixManageEvent(C228628yA event) {
        kotlin.jvm.internal.o.LJIIIZ(event, "event");
        if (!(mo49getActivity() instanceof DetailActivity)) {
            ASQ.LJ(this, ASX.LIZ);
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onMixNameChangeEvent(C2KL event) {
        String str;
        String str2;
        UrlModel urlModel;
        String str3;
        MixStatisStruct mixStatisStruct;
        MixStatusStruct mixStatusStruct;
        ShareInfo shareInfo;
        PlayListInfo playListInfo;
        kotlin.jvm.internal.o.LJIIIZ(event, "event");
        if (kotlin.jvm.internal.o.LJ(this.LJLJJI, event.LJLILLLLZI)) {
            MixVideosViewModel vl = vl();
            String name = event.LJLIL;
            String mixId = event.LJLILLLLZI;
            vl.getClass();
            kotlin.jvm.internal.o.LJIIIZ(name, "name");
            kotlin.jvm.internal.o.LJIIIZ(mixId, "mixId");
            MixStruct mixStruct = vl.getVmDispatcher().getState().LJLJL;
            if (mixStruct != null) {
                str = mixStruct.mixId;
            } else {
                str = null;
            }
            int i = 0;
            if (o.LJJJJIZL(str, mixId, false)) {
                MixStruct mixStruct2 = new MixStruct();
                M7C state = vl.getVmDispatcher().getState();
                MixStruct mixStruct3 = state.LJLJL;
                if (mixStruct3 != null) {
                    str2 = mixStruct3.mixId;
                } else {
                    str2 = null;
                }
                mixStruct2.mixId = str2;
                mixStruct2.setMixName(name);
                MixStruct mixStruct4 = state.LJLJL;
                if (mixStruct4 != null) {
                    urlModel = mixStruct4.getIcon();
                } else {
                    urlModel = null;
                }
                mixStruct2.setIcon(urlModel);
                MixStruct mixStruct5 = state.LJLJL;
                if (mixStruct5 != null) {
                    str3 = mixStruct5.getExtra();
                } else {
                    str3 = null;
                }
                mixStruct2.setExtra(str3);
                MixStruct mixStruct6 = state.LJLJL;
                if (mixStruct6 != null) {
                    mixStatisStruct = mixStruct6.getStatis();
                } else {
                    mixStatisStruct = null;
                }
                mixStruct2.setStatis(mixStatisStruct);
                MixStruct mixStruct7 = state.LJLJL;
                if (mixStruct7 != null) {
                    i = mixStruct7.getMixType();
                }
                mixStruct2.setMixType(i);
                MixStruct mixStruct8 = state.LJLJL;
                if (mixStruct8 != null) {
                    mixStatusStruct = mixStruct8.getStatus();
                } else {
                    mixStatusStruct = null;
                }
                mixStruct2.setStatus(mixStatusStruct);
                MixStruct mixStruct9 = state.LJLJL;
                if (mixStruct9 != null) {
                    shareInfo = mixStruct9.getShareInfo();
                } else {
                    shareInfo = null;
                }
                mixStruct2.setShareInfo(shareInfo);
                vl.setState(new AqS175S0100000_9(mixStruct2, 626));
                vl.withState(new AqS11S2000000_9(mixId, name, 6));
            }
            Aweme aweme = this.LJLJI;
            if (aweme != null && (playListInfo = aweme.playlist_info) != null) {
                playListInfo.setMixName(event.LJLIL);
            }
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.sei);
            c26045AKb.LJIIJ();
            C2U8.LIZ(new C2IX(this.LJLJI, null, true));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        boolean z = C213228Yk.LIZ;
        if (z && C53212KuW.LIZIZ) {
            if (C52535Kjb.LIZIZ()) {
                PlaylistCollectionStateAgent.LJIIZILJ().LJFF(this.LJLLLLLL);
            } else {
                PlaylistCollectionStateAgent.LJIIZILJ().LJI(this);
            }
        }
        _$_findCachedViewById(R.id.kf_).setOnTouchListener(M84.LJLIL);
        this.LJLJL = true;
        C235119Kp c235119Kp = new C235119Kp();
        this.LJLLL = c235119Kp;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS159S0100000_9(this, 1011));
        c235119Kp.LIZLLL(LIZJ);
        if (z && C53212KuW.LIZIZ) {
            AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
            C234529Ii c234529Ii = new C234529Ii();
            c234529Ii.LIZIZ = "favorite_icon";
            if (PlaylistCollectionStateAgent.LJIJ().LJ(this.LJLJJI).booleanValue()) {
                i = R.raw.icon_bookmark_fill;
            } else {
                i = R.raw.icon_bookmark;
            }
            c234529Ii.LIZJ();
            c234529Ii.LIZJ = i;
            c234529Ii.LIZLLL = true;
            c234529Ii.LIZIZ(new M80(this));
            abstractC234519IhArr[0] = c234529Ii;
            c235119Kp.LIZIZ(abstractC234519IhArr);
        }
        if (o.LJJJJIZL(this.LJLJLJ, ((RBX) HG3.LJIILL()).getCurUser().getUid(), false)) {
            Au2S18S0100000_9 au2S18S0100000_9 = new Au2S18S0100000_9(this, 3);
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_ellipsis_vertical;
            LIZJ2.LIZLLL = true;
            LIZJ2.LIZIZ(new AqS156S0200000_9(au2S18S0100000_9, view, 113));
            c235119Kp.LIZIZ(LIZJ2);
        } else if (!z || C53212KuW.LIZIZ) {
            Au2S18S0100000_9 au2S18S0100000_92 = new Au2S18S0100000_9(this, 4);
            C234529Ii LIZJ3 = s1.LIZJ();
            LIZJ3.LIZJ = R.raw.icon_arrow_turn_up_right;
            LIZJ3.LIZLLL = true;
            LIZJ3.LIZIZ(new AqS156S0200000_9(au2S18S0100000_92, view, 114));
            c235119Kp.LIZIZ(LIZJ3);
        }
        C9KF c9kf = new C9KF();
        c9kf.LIZ(this.LJLJJL);
        c9kf.LIZLLL = " ";
        c9kf.LIZIZ = "mix_title";
        c235119Kp.LIZJ = c9kf;
        C8YN.LJII(this, vl(), new TBT() { // from class: X.9jw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M7C) obj).LJLJL;
            }
        }, null, new AqS191S0100000_9(this, 111), 6);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C235119Kp c235119Kp2 = this.LJLLL;
        if (c235119Kp2 != null) {
            c252709vu.setNavActions(c235119Kp2);
            ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJIILJJIL(true);
            C40443Fu3.LIZ("mix_video_dialog").LJIIIIZZ((RecyclerView) _$_findCachedViewById(R.id.i04));
            if (C34494DgI.LIZ) {
                ((RecyclerView) _$_findCachedViewById(R.id.i04)).LJIIJJI(new IDrS12S0000000_6(1));
            }
            ((SYL) _$_findCachedViewById(R.id.i04)).LLLF.LJZL(MixFeedCell.class);
            ((SYL) _$_findCachedViewById(R.id.i04)).LJLJLLL((AbstractC72278SYg) vl().LLFFF.getValue());
            ((SYL) _$_findCachedViewById(R.id.i04)).LJLJLJ(new M83(this));
            if (C229638zn.LIZ()) {
                C72808Sho<InterfaceC57784Mm4> state = ((SYL) _$_findCachedViewById(R.id.i04)).getState();
                EnumC35471Dw3 emitStrategy = EnumC35471Dw3.BUFFER;
                state.getClass();
                kotlin.jvm.internal.o.LJIIIZ(emitStrategy, "emitStrategy");
                state.LIZIZ = emitStrategy;
            }
            ((RecyclerView) _$_findCachedViewById(R.id.i04)).LJIIJ(new M86(this));
            ((RecyclerView) _$_findCachedViewById(R.id.i04)).LJII(new C111944aM(), -1);
            ((SYL) _$_findCachedViewById(R.id.i04)).LJLJLJ(new M82(this));
            C8YN.LJII(this, vl(), new TBT() { // from class: X.8xD
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((M7C) obj).LJLILLLLZI;
                }
            }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 115), 4);
            C8YN.LJII(this, vl(), new TBT() { // from class: X.8zA
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((M7C) obj).LJLIL;
                }
            }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 110), 4);
            C8YN.LJII(this, vl(), new TBT() { // from class: X.M7O
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((M7C) obj).LJLJJLL);
                }
            }, null, new AqS191S0100000_9(this, 112), 6);
            C8YN.LJII(this, vl(), new TBT() { // from class: X.M7Q
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((M7C) obj).LJLJI;
                }
            }, C213688a4.LIZLLL(), new AqS191S0100000_9(this, 113), 4);
            if (z && C53212KuW.LIZ) {
                View findViewById = view.findViewById(R.id.b2g);
                kotlin.jvm.internal.o.LJIIIIZZ(findViewById, "view.findViewById(R.id.buttons)");
                ComposeView composeView = (ComposeView) findViewById;
                this.LJLLLL = composeView;
                composeView.setVisibility(0);
                ComposeView composeView2 = this.LJLLLL;
                if (composeView2 != null) {
                    composeView2.setViewCompositionStrategy(C283619k.LIZIZ);
                    ComposeView composeView3 = this.LJLLLL;
                    if (composeView3 != null) {
                        composeView3.setContent(C1DJ.LJFF(new AqS191S0100000_9(this, 114), 1546873984, true));
                    } else {
                        kotlin.jvm.internal.o.LJIJI("buttonsView");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.o.LJIJI("buttonsView");
                    throw null;
                }
            }
            vl().ov0(this.LJLJI, this.LJLJJI);
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
            return;
        }
        kotlin.jvm.internal.o.LJIJI("navActions");
        throw null;
    }

    public final void xl(String title, String subtitle) {
        boolean z;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        if (subtitle == null || subtitle.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View LJI = ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJI("mix_title");
            if ((LJI instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) LJI) != null) {
                tuxTextView2.setMinTextSizePx(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
                tuxTextView2.setText(title);
                return;
            }
            return;
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.gwg);
        C9KF c9kf = new C9KF();
        kotlin.jvm.internal.o.LJIIIZ(title, "title");
        c9kf.LIZJ = title;
        c9kf.LIZIZ = "mix_title";
        kotlin.jvm.internal.o.LJIIIZ(subtitle, "subtitle");
        c9kf.LIZLLL = subtitle;
        c252709vu.LJIILLIIL(c9kf);
        View LJI2 = ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJI("mix_title");
        if (!(LJI2 instanceof TuxTextView) || (tuxTextView = (TuxTextView) LJI2) == null) {
            return;
        }
        tuxTextView.setMinTextSizePx(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)));
    }

    @Override // X.AnonymousClass885
    public final void id(String id, Object obj, EnumC2063587z source) {
        TuxIconView tuxIconView;
        int i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        kotlin.jvm.internal.o.LJIIIZ(id, "id");
        kotlin.jvm.internal.o.LJIIIZ(source, "source");
        if (!kotlin.jvm.internal.o.LJ(id, this.LJLJJI)) {
            return;
        }
        View LJI = ((C252709vu) _$_findCachedViewById(R.id.gwg)).LJI("favorite_icon");
        if (!(LJI instanceof TuxIconView) || (tuxIconView = (TuxIconView) LJI) == null) {
            return;
        }
        if (booleanValue) {
            i = R.raw.icon_bookmark_fill;
        } else {
            i = R.raw.icon_bookmark;
        }
        tuxIconView.setIconRes(i);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        kotlin.jvm.internal.o.LJIIIZ(inflater, "inflater");
        C29S c29s = null;
        if (C16970lZ.LIZ(R.layout.bta, null)) {
            FRW.LIZIZ(-1L, "playlist_dialog_inflate");
        } else {
            FRW.LIZIZ(-2L, "playlist_dialog_inflate");
        }
        FRW.LIZLLL("playlist_dialog_inflate");
        if (C229718zv.LIZ) {
            view = C16970lZ.LIZJ(R.layout.bta, mo49getActivity(), viewGroup, false);
        } else {
            view = C16880lQ.LLLLIILL(inflater, R.layout.bta, viewGroup, false);
        }
        FRW.LIZ("playlist_dialog_inflate");
        kotlin.jvm.internal.o.LJIIIIZZ(view, "view");
        try {
            ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(view, this);
            C10A.LIZIZ(view, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return view;
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
