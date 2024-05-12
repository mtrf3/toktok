package com.ss.android.ugc.aweme.paidcontent.activity;

import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C10A;
import X.C113554cx;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C254229yM;
import X.C254479yl;
import X.C29S;
import X.C3C5;
import X.C55230Lly;
import X.C55247LmF;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.EnumC254469yk;
import X.InterfaceC18010nF;
import X.InterfaceC61213O0r;
import X.OSZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class PaidContentCollectionFragment extends BaseFragment implements InterfaceC18010nF {
    public long LJLIL;
    public int LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();
    public int LJLILLLLZI = 1;
    public final String LJLJI = AnonymousClass629.LIZ("randomUUID().toString()");

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return C113554cx.LJJLIIIIJ(new OSZ("sessionId", this.LJLJI));
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC254469yk.SERIES_LIST.getPageCode();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C12460eI.LJIIIIZZ(this, null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        String str;
        Intent intent;
        boolean z;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        fragmentConfiguration(C254479yl.LJLIL);
        super.onCreate(bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        long j = 0;
        if (mo49getActivity != null && (intent5 = mo49getActivity.getIntent()) != null) {
            j = intent5.getLongExtra("creator_uid", 0L);
        }
        this.LJLIL = j;
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (intent4 = mo49getActivity2.getIntent()) != null) {
            i = intent4.getIntExtra("list_source", 1);
        } else {
            i = 1;
        }
        this.LJLILLLLZI = i;
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null && (intent3 = mo49getActivity3.getIntent()) != null) {
            i2 = intent3.getIntExtra("type", 0);
        } else {
            i2 = 0;
        }
        this.LJLJJI = i2;
        long j2 = this.LJLIL;
        int i3 = this.LJLILLLLZI;
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        if (mo49getActivity4 == null || (intent2 = mo49getActivity4.getIntent()) == null || (str = C16880lQ.LLJJIJIIJIL(intent2, "enter_from")) == null) {
            str = "";
        }
        String str2 = this.LJLJI;
        ActivityC45651qj mo49getActivity5 = mo49getActivity();
        if (mo49getActivity5 != null) {
            intent = mo49getActivity5.getIntent();
        } else {
            intent = null;
        }
        int i4 = this.LJLJJI;
        if (i4 == 55) {
            z = true;
        } else {
            z = false;
        }
        C254229yM c254229yM = new C254229yM(j2, i3, str, str2, intent, z, false, i4);
        C55247LmF.LIZIZ(C55230Lly.LIZJ(this, null), c254229yM, C254229yM.class, "source_default_key");
        C8VV.LIZ(this, false, new AqS135S0200000_4(this, c254229yM, 73));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aio, viewGroup, false);
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
}
