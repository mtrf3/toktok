package com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui;

import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C243199gZ;
import X.C243209ga;
import X.C243219gb;
import X.C29S;
import X.C3C5;
import X.C65300Pk0;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.DialogC25756A8y;
import X.InterfaceC198557ql;
import X.InterfaceC243349go;
import X.InterfaceC61213O0r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class FeatureVideoAwemeListFragment extends BaseFragment implements InterfaceC243349go {
    public static final C243209ga LJLJL = new Object() { // from class: X.9ga
    };
    public Aweme LJLILLLLZI;
    public DialogC25756A8y LJLJJL;
    public Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public String LJLIL = "";
    public String LJLJI = "";
    public String LJLJJI = "";

    private final int Dl() {
        return R.layout.avg;
    }

    public static void wl(DialogC25756A8y dialogC25756A8y) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "1990550120111928950")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public void _$_clearFindViewByIdCache() {
        this.LJLJJLL.clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJLL;
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

    @Override // X.InterfaceC243349go, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    private final void Gl() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
        dialogC25756A8y.LIZIZ(R.string.hvo);
        dialogC25756A8y.LIZ(false);
        dialogC25756A8y.hide();
        this.LJLJJL = dialogC25756A8y;
        dialogC25756A8y.hide();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9gb] */
    @Override // X.C8VB
    /* renamed from: Al, reason: merged with bridge method [inline-methods] */
    public C243219gb defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9gb
        };
    }

    @Override // X.InterfaceC243349go
    public void Ej() {
        DialogC25756A8y dialogC25756A8y = this.LJLJJL;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.hide();
        }
    }

    @Override // X.InterfaceC243349go
    public void LJJI() {
        DialogC25756A8y dialogC25756A8y = this.LJLJJL;
        if (dialogC25756A8y != null) {
            wl(dialogC25756A8y);
        }
    }

    private final void init() {
        String str;
        String str2;
        String LLJJIJIIJIL;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        Intent intent = mo49getActivity.getIntent();
        Serializable serializable = null;
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "sticker_id");
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        this.LJLIL = str;
        Intent intent2 = mo49getActivity.getIntent();
        if (intent2 != null) {
            serializable = intent2.getSerializableExtra("extra_related_item");
        }
        this.LJLILLLLZI = (Aweme) serializable;
        Intent intent3 = mo49getActivity.getIntent();
        if (intent3 == null || (str2 = C16880lQ.LLJJIJIIJIL(intent3, "author_id")) == null) {
            str2 = "";
        }
        this.LJLJI = str2;
        Intent intent4 = mo49getActivity.getIntent();
        if (intent4 != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent4, "video_id")) != null) {
            str3 = LLJJIJIIJIL;
        }
        this.LJLJJI = str3;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C243199gZ.LJLIL);
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 761));
        Gl();
    }

    public View vl(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        return C16880lQ.LLLLIILL(inflater, Dl(), viewGroup, false);
    }

    public static View xl(FeatureVideoAwemeListFragment featureVideoAwemeListFragment, LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View vl = featureVideoAwemeListFragment.vl(inflater, viewGroup, bundle);
        C29S c29s = null;
        if (!(vl instanceof View)) {
            vl = null;
        }
        if (vl != null) {
            try {
                ViewTreeLifecycleOwner.set(vl, featureVideoAwemeListFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(vl, featureVideoAwemeListFragment);
                C10A.LIZIZ(vl, featureVideoAwemeListFragment);
                ActivityC45651qj mo49getActivity = featureVideoAwemeListFragment.mo49getActivity();
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
