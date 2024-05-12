package com.ss.android.ugc.aweme.music.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C29S;
import X.C3C5;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.KD6;
import X.OX0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ChooseThirdMusicFragment extends BaseFragment {
    public static final /* synthetic */ int LJLLI = 0;
    public List<ExternalMusicInfo> LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public Map<String, String> LJLJLJ;
    public OX0 LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        Serializable serializable2;
        Map<String, String> map;
        Serializable serializable3;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        OX0 ox0 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("music_info_list");
        } else {
            serializable = null;
        }
        o.LJII(serializable, "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.music.model.ExternalMusicInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.android.ugc.aweme.music.model.ExternalMusicInfo> }");
        this.LJLIL = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z = arguments2.getBoolean("is_exclusive_resso");
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str = arguments3.getString("process_id");
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        }
        this.LJLJI = str;
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("music_id")) == null) {
            str2 = "";
        }
        this.LJLJJI = str2;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (str3 = arguments5.getString("group_id")) == null) {
            str3 = "";
        }
        this.LJLJJL = str3;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (str4 = arguments6.getString("request_id")) == null) {
            str4 = "";
        }
        this.LJLJJLL = str4;
        Bundle arguments7 = getArguments();
        if (arguments7 != null && (string = arguments7.getString("show_type")) != null) {
            str5 = string;
        }
        this.LJLJL = str5;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            serializable2 = arguments8.getSerializable("log_extra");
        } else {
            serializable2 = null;
        }
        if (serializable2 instanceof Map) {
            map = (Map) serializable2;
        } else {
            map = null;
        }
        this.LJLJLJ = map;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            serializable3 = arguments9.getSerializable("simple_music_data");
        } else {
            serializable3 = null;
        }
        if (serializable3 instanceof OX0) {
            ox0 = (OX0) serializable3;
        }
        this.LJLJLLL = ox0;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS178S0100000_12(this, 236));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LIZ = KD6.LIZ(mo49getActivity(), R.layout.bva, inflater, viewGroup);
        try {
            ViewTreeLifecycleOwner.set(LIZ, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LIZ, this);
            C10A.LIZIZ(LIZ, this);
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
        return LIZ;
    }
}
