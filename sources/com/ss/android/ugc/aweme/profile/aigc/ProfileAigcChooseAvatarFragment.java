package com.ss.android.ugc.aweme.profile.aigc;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C26227ARb;
import X.C29S;
import X.C3C5;
import X.C5H3;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72121SSf;
import X.C72133SSr;
import X.C72135SSt;
import X.C72137SSv;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.InterfaceC61213O0r;
import X.SIN;
import X.SRW;
import X.STD;
import X.TBT;
import X.UC0;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes13.dex */
public final class ProfileAigcChooseAvatarFragment extends BaseFragment {
    public final C214298b3 LJLILLLLZI;
    public boolean LJLJI;
    public SRW LJLJJI;
    public final C62822Ol8 LJLJJL;
    public C72121SSf LJLJJLL;
    public final C73318Sq2 LJLJL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    public ProfileAigcChooseAvatarFragment() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProfileAigcAvatarViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 664);
        C72133SSr c72133SSr = C72133SSr.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c72133SSr, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c72133SSr, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
        this.LJLJJL = C221108m2.LIZIZ(C72135SSt.LJLIL);
        this.LJLJL = new C73318Sq2();
    }

    public final ProfileAigcAvatarViewModel vl() {
        return (ProfileAigcAvatarViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        String str;
        String str2 = ((SIN) vl().getState()).LJLJJL.LIZ.toString();
        SRW srw = this.LJLJJI;
        String str3 = null;
        if (srw != null) {
            str3 = srw.LJLILLLLZI;
            str = srw.LJLJI;
        } else {
            str = null;
        }
        STD.LIZLLL(str2, "back", str3, str, 0, null, null, 112);
        if (this.LJLJI) {
            Context context = getContext();
            if (context != null) {
                C26227ARb c26227ARb = new C26227ARb(context);
                c26227ARb.LIZIZ(getResources().getString(R.string.cc));
                UC0.LIZJ(c26227ARb, new AqS178S0100000_12(this, 252));
                c26227ARb.LJI().LIZLLL();
                return;
            }
            return;
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        mo49getActivity.finish();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJL.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onResume();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (onBackPressedDispatcher = mo49getActivity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new C72137SSv(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0212  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseAvatarFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Integer num;
        List<String> avatarUris;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.kej);
        Context context = findViewById.getContext();
        if (context != null) {
            findViewById.getLayoutParams().height = C63081OpJ.LJJJJLI(context);
        }
        C8VV.LIZ(this, false, new AqS178S0100000_12(this, 253));
        ((RecyclerView) _$_findCachedViewById(R.id.btw)).LJIIJJI(new IDrS50S0100000_12(this, 5));
        ProfileAigcAvatarViewModel.jv0(vl(), new TBT() { // from class: X.SIO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SIN) obj).LJLJLLL;
            }
        }, this, new AqS170S0100000_4(this, 546));
        String str3 = ((SIN) vl().getState()).LJLJJL.LIZ.toString();
        SRW srw = this.LJLJJI;
        if (srw != null) {
            str = srw.LJLILLLLZI;
            str2 = srw.LJLJI;
        } else {
            str = null;
            str2 = null;
        }
        C72121SSf c72121SSf = this.LJLJJLL;
        if (c72121SSf != null && (avatarUris = c72121SSf.getAvatarUris()) != null) {
            num = Integer.valueOf(avatarUris.size());
        } else {
            num = null;
        }
        STD.LIZLLL(str3, "show", str, str2, 0, null, num, 48);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c30, viewGroup, false);
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
