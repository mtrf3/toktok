package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C169576l7;
import X.C184077Kh;
import X.C214298b3;
import X.C214528bQ;
import X.C219128iq;
import X.C219138ir;
import X.C221118m3;
import X.C235119Kp;
import X.C26338AVi;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C53947LFf;
import X.C55480Lq0;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78496UrM;
import X.C78926UyI;
import X.C7MY;
import X.C8VV;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.C9KF;
import X.InterfaceC218828iM;
import X.InterfaceC219588ja;
import X.InterfaceC25830ABu;
import X.InterfaceC67352kd;
import X.InterfaceC88473Ynt;
import X.LFH;
import X.O6R;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursInviteFriendsFragment extends BaseFragment implements InterfaceC219588ja, InterfaceC25830ABu {
    public static InterfaceC88473Ynt<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> LJLL;
    public InterfaceC218828iM LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C5H3 LJLJJI;
    public final boolean LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // X.InterfaceC25830ABu
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    public AddYoursInviteFriendsFragment() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C65776Prg LIZ = C65352Pkq.LIZ(AddYoursInviteFriendsViewModel.class);
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1450);
        C219128iq c219128iq = C219128iq.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c219128iq, LIZ);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c219128iq, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLILLLLZI = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(UserRecommendListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ2, 1451);
        C219138ir c219138ir = C219138ir.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c219138ir, LIZ2);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS153S0100000_32, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c219138ir, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b32;
        this.LJLJJI = C221118m3.LIZ(new AqS153S0100000_3(this, 1449));
        this.LJLJJL = LFH.LIZIZ.LIZLLL().LJIJ().LIZLLL() == 1;
        this.LJLJJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C53947LFf.LIZ())));
        this.LJLJL = C7MY.LIZIZ(28);
        this.LJLJLJ = C7MY.LIZIZ(44);
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = getResources().getString(R.string.bd0);
        o.LJIIIIZZ(string, "resources.getString(R.st…FriendsBottomSheet_title)");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        return c235119Kp;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C55480Lq0.LIZIZ.LIZLLL(249372162, 3);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        this.LJLJJLL = O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(C53947LFf.LIZ())));
        View view = getView();
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C169576l7 c169576l7;
        Map<String, Object> extras;
        Serializable serializable;
        super.onCreate(bundle);
        if (this.LJLIL == null) {
            InterfaceC218828iM interfaceC218828iM = null;
            if (bundle != null) {
                serializable = bundle.getSerializable("ay_invite_behavior");
            } else {
                serializable = null;
            }
            if (serializable instanceof InterfaceC218828iM) {
                interfaceC218828iM = (InterfaceC218828iM) serializable;
            }
            this.LJLIL = interfaceC218828iM;
        }
        InterfaceC218828iM interfaceC218828iM2 = this.LJLIL;
        if (interfaceC218828iM2 != null && (c169576l7 = (C169576l7) this.LJLJJI.getValue()) != null && (extras = c169576l7.getExtras()) != null) {
            interfaceC218828iM2.initExtra(extras);
        }
        InterfaceC218828iM interfaceC218828iM3 = this.LJLIL;
        if (interfaceC218828iM3 != null) {
            interfaceC218828iM3.mobEnter();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("ay_invite_behavior", this.LJLIL);
    }

    public final void vl(float f) {
        int i;
        int i2;
        if (getView() == null) {
            return;
        }
        if (this.LJLJJL) {
            i = C7MY.LIZIZ(12);
        } else {
            i = (int) ((this.LJLJJLL * 0.16000000000000003d * (1 - f)) + this.LJLJL);
        }
        View btn_invite = _$_findCachedViewById(R.id.awu);
        o.LJIIIIZZ(btn_invite, "btn_invite");
        ViewGroup.LayoutParams layoutParams = btn_invite.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
        }
        if (i2 != i) {
            View btn_invite2 = _$_findCachedViewById(R.id.awu);
            o.LJIIIIZZ(btn_invite2, "btn_invite");
            C26338AVi.LJI(btn_invite2, null, null, null, Integer.valueOf(i), false, 23);
        }
        View btn_invite_background = _$_findCachedViewById(R.id.awv);
        o.LJIIIIZZ(btn_invite_background, "btn_invite_background");
        g0.LJJIJIIJI(-1, i + this.LJLJLJ, btn_invite_background);
    }

    @Override // X.InterfaceC25830ABu
    public final void I7(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
        vl(f);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C55480Lq0.LIZIZ.LIZLLL(249372162, 2);
        C8VV.LIZ(this, false, new AqS134S0200000_3(this, view, 180));
        vl(0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r9.add(r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wl(java.util.List<com.ss.android.ugc.aweme.addyours.model.UserInvitee> r15, X.InterfaceC67352kd<? super X.C76800UCe> r16) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursInviteFriendsFragment.wl(java.util.List, X.2kd):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.gg, viewGroup, false, "inflater.inflate(R.layou…riends, container, false)");
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
}
