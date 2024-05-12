package com.ss.android.ugc.aweme.profile.viewer.ui;

import X.AbstractC029409q;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C187907Za;
import X.C187917Zb;
import X.C187927Zc;
import X.C1DH;
import X.C207988Eg;
import X.C221018lt;
import X.C221108m2;
import X.C226738v7;
import X.C226908vO;
import X.C227108vi;
import X.C227528wO;
import X.C234529Ii;
import X.C235119Kp;
import X.C243119gR;
import X.C252709vu;
import X.C29S;
import X.C2P8;
import X.C3C5;
import X.C41172GDw;
import X.C5H3;
import X.C62822Ol8;
import X.C73305Spp;
import X.C73306Spq;
import X.C76800UCe;
import X.C77266UUc;
import X.C78939UyV;
import X.C7ZT;
import X.C90903hW;
import X.C92173jZ;
import X.C99W;
import X.C9KF;
import X.InterfaceC191547fS;
import X.InterfaceC57784Mm4;
import X.InterfaceC61213O0r;
import X.JBR;
import X.JBS;
import X.MGN;
import X.SRG;
import X.SY4;
import X.SYL;
import Y.AObserverS71S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.profile.popup.AvatarAndNicknamePopupController;
import com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerFragment;
import com.ss.android.ugc.aweme.profile.viewer.viewmodel.ProfileViewerViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class ProfileViewerFragment extends BaseFragment implements JBS, SRG {
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.optionalArg(this, C187927Zc.LJLIL, "enter_from", String.class);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 830));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 827));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 826));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 828));
    public final C187907Za LJLJJLL = new C187907Za(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.SRG
    public final C227108vi LJJJIL() {
        SYL viewer_list = (SYL) _$_findCachedViewById(R.id.ncu);
        o.LJIIIIZZ(viewer_list, "viewer_list");
        return new C227108vi(viewer_list, new InterfaceC191547fS() { // from class: X.8v2
            @Override // X.InterfaceC191547fS
            public final void LJIIJJI() {
                ((PowerPageSource) ProfileViewerFragment.this.vl().LJLLL.getValue()).getOperator().LIZJ(SZP.Next);
            }
        });
    }

    public final ProfileViewerViewModel vl() {
        return (ProfileViewerViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        JBR.LIZIZ(this);
        C221018lt.LIZ("PVFragment", "onBackPressed_Activity");
        C78939UyV.LJJJJ(mo49getActivity());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJLL.LIZJ();
        AvatarAndNicknamePopupController.LIZJ().LIZIZ();
        PopupManager.LIZJ(C207988Eg.class);
        C243119gR.LIZ(C227528wO.LJLIL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 89));
        if (!(vl().hv0().getValue() instanceof C226738v7) || !C7ZT.LIZLLL() || _$_findCachedViewById(R.id.ncu) == null || _$_findCachedViewById(R.id.ncu).getVisibility() != 0) {
            return;
        }
        int size = ((ArrayList) ((SYL) _$_findCachedViewById(R.id.ncu)).getState().LJII()).size();
        for (int i = 0; i < size; i++) {
            InterfaceC57784Mm4 LJI = ((SYL) _$_findCachedViewById(R.id.ncu)).getState().LJI(i);
            if (LJI instanceof C187917Zb) {
                C187917Zb c187917Zb = (C187917Zb) LJI;
                String uid = c187917Zb.LJLIL.user.getUid();
                if (uid != null && uid.length() != 0) {
                    ((SYL) _$_findCachedViewById(R.id.ncu)).getState().LJIILL(i, C187917Zb.LIZ(c187917Zb, C2P8.LIZ(c187917Zb.LJLIL.user), null, null, null, 29));
                }
            }
        }
    }

    public final void wl() {
        _$_findCachedViewById(R.id.ncu).setVisibility(8);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.a_s);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
        MGN mgn = MGN.LJLILLLLZI;
        if (mgn.isStandardUIEnable()) {
            C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
            o.LJIIIIZZ(status_view, "status_view");
            mgn.setStatusView(status_view, "profile_viewer", new AqS153S0100000_3(this, 829), (Exception) null);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            mgn.triggerNetworkTips(mo49getActivity, "profile_viewer", (Exception) null, (C73305Spp) _$_findCachedViewById(R.id.kf_));
        } else {
            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setStatus((C73306Spq) this.LJLJI.getValue());
        }
        xl(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(C41172GDw.LJLIL);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
    
        if (r2.equals("personal_homepage") == false) goto L14;
     */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.viewer.ui.ProfileViewerFragment.onCreate(android.os.Bundle):void");
    }

    public final void xl(boolean z) {
        ((C252709vu) _$_findCachedViewById(R.id.la4)).LJIJ("navbar_end_action", new AqS8S0010000_3(z, 14));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        String string = getString(R.string.aub);
        o.LJIIIIZZ(string, "getString(R.string.acces…lityLabels_settings_back)");
        LIZJ.LJII = string;
        LIZJ.LIZIZ(new AqS153S0100000_3(this, 1483));
        C9KF c9kf = new C9KF();
        String string2 = getString(R.string.pgu);
        o.LJIIIIZZ(string2, "getString(R.string.profile_viewers_title)");
        c9kf.LIZJ = string2;
        C234529Ii c234529Ii = new C234529Ii();
        c234529Ii.LIZIZ = "navbar_end_action";
        c234529Ii.LIZJ();
        c234529Ii.LIZJ = R.raw.icon_gear;
        c234529Ii.LIZIZ(new AqS153S0100000_3(this, 1482));
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        c235119Kp.LIZLLL(LIZJ);
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZIZ(c234529Ii);
        c235119Kp.LIZLLL = true;
        c252709vu.setNavActions(c235119Kp);
        xl(false);
        SYL syl = (SYL) _$_findCachedViewById(R.id.ncu);
        syl.setItemAnimator(null);
        syl.LLLF.LJZL(ProfileViewerCell.class);
        syl.LJLJLLL((AbstractC72278SYg) vl().LJLLL.getValue());
        AbstractC029409q adapter = syl.getAdapter();
        o.LJII(adapter, "null cannot be cast to non-null type com.bytedance.ies.powerlist.PowerAdapter");
        ((PowerAdapter) adapter).LLF(this, SRG.class);
        if (C226908vO.LIZIZ()) {
            ((SYL) _$_findCachedViewById(R.id.ncu)).LJLJLJ(this.LJLJJLL);
        }
        C77266UUc.LIZIZ.getRelationService().LJFF().subscribe(this, new AObserverS71S0100000_3(this, 42));
        C92173jZ c92173jZ = (C92173jZ) _$_findCachedViewById(R.id.a_s);
        if (c92173jZ != null && C99W.LIZ) {
            c92173jZ.LJLIL.findViewById(R.id.axl).getClass();
            ((SY4) c92173jZ.LJLIL.findViewById(R.id.axl)).setButtonVariant(5);
            c92173jZ.LJLIL.findViewById(R.id.b05).getClass();
        }
        C92173jZ c92173jZ2 = (C92173jZ) _$_findCachedViewById(R.id.a_s);
        if (c92173jZ2 != null) {
            c92173jZ2.setOnClickNotNowListener(new AqS169S0100000_3(this, 677));
            c92173jZ2.setOnClickTurnOnListener(new AqS169S0100000_3(this, 678));
        }
        ((PowerPageSource) vl().LJLLL.getValue()).getOperator().refresh();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c53, viewGroup, false);
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
