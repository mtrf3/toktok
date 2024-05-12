package com.ss.android.ugc.aweme.music.search;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C239349aM;
import X.C239379aP;
import X.C239389aQ;
import X.C240369c0;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.HG3;
import X.InterfaceC241869eQ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.music.ab.ProfileMusicTabConfig;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicFragment extends BaseFragment implements InterfaceC241869eQ {
    public static final C239349aM LJLILLLLZI = new Object() { // from class: X.9aM
    };
    public Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLIL.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLIL;
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return xl(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC241869eQ, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // X.C8VB
    /* renamed from: Al, reason: merged with bridge method [inline-methods] */
    public C240369c0 defaultObservableData() {
        String str;
        String str2;
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            str = arguments.getString("user_id");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("sec_user_id");
        } else {
            str2 = null;
        }
        boolean vl = vl();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            serializable = arguments3.getSerializable("pinned_music_list");
        }
        return new C240369c0(str, str2, true, vl, true, (PinnedMusicList) serializable, (List) null, (String) null, 416);
    }

    private final boolean vl() {
        ProfileMusicTabConfig profileMusicTabConfig = (ProfileMusicTabConfig) SettingsManager.LIZLLL().LJIIIIZZ("profile_music_tab_config", ProfileMusicTabConfig.class, C239389aQ.LIZ);
        if (profileMusicTabConfig == null) {
            profileMusicTabConfig = new ProfileMusicTabConfig();
        }
        if (profileMusicTabConfig.getEnablePin() && HG3.LJIILL().getCurUser().getAccountType() != 3) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C239379aP.LJLIL);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_me", false);
        } else {
            z = false;
        }
        Bundle arguments2 = getArguments();
        Serializable serializable = null;
        if (arguments2 != null) {
            str = arguments2.getString("user_id");
        } else {
            str = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str2 = arguments3.getString("sec_user_id");
        } else {
            str2 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            str3 = arguments4.getString("previous_page");
        } else {
            str3 = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            serializable = arguments5.getSerializable("pinned_music_list");
        }
        C8VV.LIZ(this, false, new AqS135S0200000_4(this, new SearchMusicArg(z, str, str2, str3, (PinnedMusicList) serializable), 69));
    }

    public View wl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, R.layout.c4w, viewGroup, false);
    }

    public static View xl(SearchMusicFragment searchMusicFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View wl = searchMusicFragment.wl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(wl instanceof View)) {
            wl = null;
        }
        if (wl != null) {
            try {
                ViewTreeLifecycleOwner.set(wl, searchMusicFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(wl, searchMusicFragment);
                C10A.LIZIZ(wl, searchMusicFragment);
                ActivityC45651qj mo49getActivity = searchMusicFragment.mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return wl;
    }
}
