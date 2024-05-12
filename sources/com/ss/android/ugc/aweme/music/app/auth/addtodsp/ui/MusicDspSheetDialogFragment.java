package com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C26045AKb;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C48203Ivv;
import X.C76800UCe;
import X.C79045V0n;
import X.C8VV;
import X.C90903hW;
import X.C93574aT4;
import X.C94302aeo;
import X.C94347afX;
import X.C94566aj4;
import X.C9A8;
import X.C9KF;
import X.EF7;
import X.EnumC93896aYG;
import X.FMX;
import X.InterfaceC219588ja;
import X.InterfaceC65784Pro;
import X.InterfaceC94505ai5;
import X.O6R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS179S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicDspSheetDialogFragment extends BaseFragment implements InterfaceC94505ai5, InterfaceC219588ja {
    public static final C93574aT4 LJLLJ = new C93574aT4();
    public boolean LJLJL;
    public TT2DSPSongInfo LJLJLLL;
    public boolean LJLL;
    public Fragment LJLLI;
    public Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLILLLLZI = "homepage_hot";
    public String LJLJI = "";
    public String LJLJJI = "";
    public String LJLJJL = "";
    public String LJLJJLL = "";
    public ArrayList<TT2DSPSongInfo> LJLJLJ = new ArrayList<>();

    private final int Al() {
        return R.layout.dwc;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLLILLLL.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC94505ai5
    public void j6() {
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return wl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC94505ai5, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // X.C8VB
    /* renamed from: xl, reason: merged with bridge method [inline-methods] */
    public C94347afX defaultObservableData() {
        return new C94347afX();
    }

    private final void init() {
        ArrayList<TT2DSPSongInfo> arrayList;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("meta_song_id");
            String str = "";
            if (string == null) {
                string = "";
            }
            this.LJLIL = string;
            String string2 = arguments.getString("enter_from");
            if (string2 == null) {
                string2 = "homepage_hot";
            }
            this.LJLILLLLZI = string2;
            String string3 = arguments.getString("video_id");
            if (string3 == null) {
                string3 = "";
            }
            this.LJLJI = string3;
            String string4 = arguments.getString("id");
            if (string4 == null) {
                string4 = "";
            }
            this.LJLJJI = string4;
            String string5 = arguments.getString("music_volume");
            if (string5 == null) {
                string5 = "";
            }
            this.LJLJJL = string5;
            String string6 = arguments.getString("tt_to_dsp_button_type");
            if (string6 != null) {
                str = string6;
            }
            this.LJLJJLL = str;
            this.LJLJL = arguments.getBoolean("is_dsp_already_auth");
            Serializable serializable = arguments.getSerializable("tt_to_dsp_song_infos");
            TT2DSPSongInfo tT2DSPSongInfo = null;
            if (!(serializable instanceof ArrayList) || (arrayList = (ArrayList) serializable) == null) {
                arrayList = new ArrayList<>();
            }
            this.LJLJLJ = arrayList;
            Serializable serializable2 = arguments.getSerializable("linked_dsp_song_info");
            if (serializable2 instanceof TT2DSPSongInfo) {
                tT2DSPSongInfo = (TT2DSPSongInfo) serializable2;
            }
            this.LJLJLLL = tT2DSPSongInfo;
            this.LJLL = arguments.getBoolean("is_dsp_auth_from_music_detail");
        }
    }

    @Override // X.InterfaceC219588ja
    public C235119Kp createNavActions() {
        boolean z;
        Serializable serializable;
        TT2DSPSongInfo tT2DSPSongInfo;
        Context context = getContext();
        if (context == null) {
            context = EF7.LIZIZ();
        }
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark_small;
        c2068389v.LIZLLL = C79045V0n.LJI(R.attr.go, context);
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new IDqS423S0100000_42(this, 65));
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_dsp_already_auth");
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        Integer num = null;
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("linked_dsp_song_info");
        } else {
            serializable = null;
        }
        if (serializable instanceof TT2DSPSongInfo) {
            tT2DSPSongInfo = (TT2DSPSongInfo) serializable;
        } else {
            tT2DSPSongInfo = null;
        }
        DspPlatform.Companion companion = DspPlatform.Companion;
        if (tT2DSPSongInfo != null) {
            num = tT2DSPSongInfo.getDspPlatform();
        }
        DspPlatform from = companion.from(num);
        if (!z || tT2DSPSongInfo == null || from == DspPlatform.UNKNOWN) {
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZIZ(c234529Ii);
            c235119Kp.LIZLLL = false;
            return c235119Kp;
        }
        String string = getString(R.string.bak);
        o.LJIIIIZZ(string, "getString(R.string.addMu…p_manageActionSheetTitle)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{from.getTitle()}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = LLLZ;
        C235119Kp c235119Kp2 = new C235119Kp();
        c235119Kp2.LIZJ = c9kf;
        c235119Kp2.LIZIZ(c234529Ii);
        c235119Kp2.LIZLLL = true;
        return c235119Kp2;
    }

    private final void Gl(DspPlatform dspPlatform) {
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", this.LJLJI);
        hashMap.put("enter_from", this.LJLILLLLZI);
        hashMap.put("music_id", this.LJLJJI);
        hashMap.put("music_volume", this.LJLJJL);
        hashMap.put("button_name", dspPlatform.getEventName());
        hashMap.put("button_type", this.LJLJJLL);
        FMX.LJIIL("click_tttodsp_sheet", hashMap);
    }

    @Override // X.InterfaceC94505ai5
    public void N4(TT2DSPSongInfo dspSongInfo) {
        o.LJIIIZ(dspSongInfo, "dspSongInfo");
        Dl("create", DspPlatform.Companion.from(dspSongInfo.getDspPlatform()));
        String str = this.LJLIL;
        String enterFrom = this.LJLILLLLZI;
        String awemeId = this.LJLJI;
        String musicId = this.LJLJJI;
        String str2 = this.LJLJJL;
        String buttonType = this.LJLJJLL;
        boolean z = this.LJLL;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(awemeId, "awemeId");
        o.LJIIIZ(musicId, "musicId");
        o.LJIIIZ(buttonType, "buttonType");
        InputDspPlaylistSheetFragment inputDspPlaylistSheetFragment = new InputDspPlaylistSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("linked_dsp_song_info", dspSongInfo);
        bundle.putString("meta_song_id", str);
        bundle.putString("enter_from", enterFrom);
        bundle.putString("video_id", awemeId);
        bundle.putString("id", musicId);
        bundle.putString("music_volume", str2);
        bundle.putString("tt_to_dsp_button_type", buttonType);
        bundle.putBoolean("is_dsp_auth_from_music_detail", z);
        inputDspPlaylistSheetFragment.setArguments(bundle);
        ASQ.LJIILIIL(this, inputDspPlaylistSheetFragment, true);
    }

    @Override // X.InterfaceC94505ai5
    public void O9(DspPlatform dspPlatform) {
        o.LJIIIZ(dspPlatform, "dspPlatform");
        C94302aeo.LJJIJ(mo49getActivity(), dspPlatform, EnumC93896aYG.SELECT, new IDqS179S0200000_42(dspPlatform, this, 2), new IDqS175S0200000_42(dspPlatform, this, 6));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    private final void Dl(String str, DspPlatform dspPlatform) {
        HashMap hashMap = new HashMap();
        hashMap.put("group_id", this.LJLJI);
        hashMap.put("enter_from", this.LJLILLLLZI);
        hashMap.put("music_id", this.LJLJJI);
        hashMap.put("music_volume", this.LJLJJL);
        hashMap.put("button_name", str);
        hashMap.put("dsp_name", dspPlatform.getEventName());
        hashMap.put("button_type", this.LJLJJLL);
        FMX.LJIIL("click_tttodsp_playlist", hashMap);
    }

    @Override // X.InterfaceC94505ai5
    public void K9(TT2DSPPlatformInfo dspPlatformInfo, String str) {
        o.LJIIIZ(dspPlatformInfo, "dspPlatformInfo");
        Gl(DspPlatform.AMAZON_MUSIC);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!C48203Ivv.LJ(context)) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.bam);
            c26045AKb.LJIIJ();
            return;
        }
        C94302aeo.LJLIL.LJIJI(mo49getActivity(), this, str, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, C9A8.ENTER_FROM_SELECT_SHEET, this.LJLL);
    }

    @Override // X.InterfaceC94505ai5
    public void li(TT2DSPPlatformInfo dspPlatformInfo, String str) {
        o.LJIIIZ(dspPlatformInfo, "dspPlatformInfo");
        Gl(DspPlatform.APPLE_MUSIC);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!C48203Ivv.LJ(context)) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.bam);
            c26045AKb.LJIIJ();
            return;
        }
        C94302aeo.LJIJJ(mo49getActivity(), this, dspPlatformInfo.getDeveloperToken(), str, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, C9A8.ENTER_FROM_SELECT_SHEET, this.LJLL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C94566aj4.LJLIL);
        if (this.LJLJL) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.nn2);
            if (_$_findCachedViewById != null && (layoutParams2 = _$_findCachedViewById.getLayoutParams()) != null) {
                layoutParams2.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(210));
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.nn2);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setPadding(0, 0, 0, 0);
            }
        } else {
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.nn2);
            if (_$_findCachedViewById3 != null && (layoutParams = _$_findCachedViewById3.getLayoutParams()) != null) {
                layoutParams.height = -2;
            }
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.nn2);
            if (_$_findCachedViewById4 != null) {
                _$_findCachedViewById4.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
            }
        }
        C8VV.LIZ(this, false, new IDqS419S0100000_42(this, 27));
    }

    @Override // X.InterfaceC94505ai5
    public void pc(TT2DSPPlatformInfo dspPlatformInfo, String str) {
        o.LJIIIZ(dspPlatformInfo, "dspPlatformInfo");
        Gl(DspPlatform.SPOTIFY);
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (!C48203Ivv.LJ(context)) {
            C26045AKb c26045AKb = new C26045AKb(this);
            c26045AKb.LJIIIIZZ(R.string.bam);
            c26045AKb.LJIIJ();
            return;
        }
        C94302aeo.LJLIL.LJIJJLI(mo49getActivity(), this, str, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, C9A8.ENTER_FROM_SELECT_SHEET, this.LJLL);
    }

    @Override // X.InterfaceC94505ai5
    public void e1(DspPlatform dspPlatform, TT2DSPSongInfo tT2DSPSongInfo, boolean z) {
        ActivityC45651qj activityC45651qj;
        o.LJIIIZ(dspPlatform, "dspPlatform");
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        DspAuthParam dspAuthParam = new DspAuthParam(dspPlatform, this.LJLLI, tT2DSPSongInfo, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLL);
        Fragment fragment = this.LJLLI;
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        C94302aeo.LIZIZ(c94302aeo, dspAuthParam, activityC45651qj, z, false, 56);
    }

    @Override // X.InterfaceC94505ai5
    public void k(TT2DSPSongInfo dspSongInfo, DspPlaylist dspPlaylist, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(dspSongInfo, "dspSongInfo");
        o.LJIIIZ(dspPlaylist, "dspPlaylist");
        DspPlatform.Companion companion = DspPlatform.Companion;
        Dl("other", companion.from(dspSongInfo.getDspPlatform()));
        C94302aeo.LJJIIJ(new DspAuthParam(companion.from(dspSongInfo.getDspPlatform()), this, dspSongInfo, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLL), dspPlaylist, mo49getActivity(), false, SystemClock.elapsedRealtime(), new IDqS423S0100000_42(this, 66), interfaceC65784Pro);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 3456:
                C94302aeo.LJLIL.LJIIZILJ(intent, mo49getActivity(), this, null);
                return;
            case 3457:
                C94302aeo.LJLIL.LJIILLIIL(intent, mo49getActivity(), this, null);
                return;
            case 3458:
                C94302aeo.LJLIL.LJIJ(i2, intent, mo49getActivity(), this, null);
                return;
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    public View vl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, Al(), viewGroup, false);
    }

    public static View wl(MusicDspSheetDialogFragment musicDspSheetDialogFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View vl = musicDspSheetDialogFragment.vl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(vl instanceof View)) {
            vl = null;
        }
        if (vl != null) {
            try {
                ViewTreeLifecycleOwner.set(vl, musicDspSheetDialogFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(vl, musicDspSheetDialogFragment);
                C10A.LIZIZ(vl, musicDspSheetDialogFragment);
                ActivityC45651qj mo49getActivity = musicDspSheetDialogFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return vl;
    }
}
