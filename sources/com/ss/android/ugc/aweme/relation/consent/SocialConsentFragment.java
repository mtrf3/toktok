package com.ss.android.ugc.aweme.relation.consent;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C26227ARb;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73411SrX;
import X.C73969T1h;
import X.C74096T6e;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC58085Mqv;
import X.HG3;
import X.InterfaceC18010nF;
import X.RBX;
import X.T16;
import X.UC0;
import X.UPT;
import X.UPZ;
import X.UQ6;
import X.UQ7;
import X.UQI;
import X.UQX;
import X.UQY;
import Y.AfS65S0100000_13;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS100S0101000_13;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SocialConsentFragment extends JediBaseFragment implements InterfaceC18010nF {
    public C73411SrX LJLIL;
    public final lifecycleAwareLazy LJLILLLLZI;
    public UQI LJLJI;
    public final C62822Ol8 LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment
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
    public String getBtmPageCode() {
        return "b2140";
    }

    @Override // com.ss.android.ugc.aweme.base.arch.JediBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public SocialConsentFragment() {
        C65776Prg LIZ = C65352Pkq.LIZ(SocialRecRequestViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 877);
        this.LJLILLLLZI = new lifecycleAwareLazy(this, aqS162S0100000_12, new AqS72S0400000_12(this, aqS162S0100000_12, LIZ, C74096T6e.INSTANCE, 21));
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 876));
    }

    public final SocialRecFlowModel Al() {
        return (SocialRecFlowModel) this.LJLJJI.getValue();
    }

    public final SocialRecRequestViewModel xl() {
        return (SocialRecRequestViewModel) this.LJLILLLLZI.getValue();
    }

    public final void Dl() {
        MediatorLiveData<Bundle> mediatorLiveData;
        SocialRecFlowModel Al = Al();
        if (Al != null && (mediatorLiveData = Al.LJLILLLLZI) != null) {
            mediatorLiveData.postValue(new Bundle());
        }
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C12460eI.LJIIIIZZ(this, mo49getActivity());
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        UQI uqi = this.LJLJI;
        if (uqi != null) {
            if (uqi.getSocialRecType() == 3) {
                UQI uqi2 = this.LJLJI;
                if (uqi2 != null) {
                    if (uqi2.getStep() == UQ7.NEW_VERSION_FACEBOOK.getValue()) {
                        str = "facebook";
                    } else {
                        str = "contact";
                    }
                    UQ6.LIZJ(str, "background");
                    return;
                }
                o.LJIJI("consentConfig");
                throw null;
            }
            return;
        }
        o.LJIJI("consentConfig");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0.LJLJJI != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vl(int r6) {
        /*
            r5 = this;
            java.lang.String r0 = "skip"
            X.UQ6.LIZ(r6, r0)
            boolean r3 = X.UQB.LJ()
            com.bytedance.keva.Keva r2 = X.UQB.LIZIZ
            java.lang.String r1 = "key_check_status"
            java.lang.String r0 = "value_check_start"
            java.lang.String r1 = r2.getString(r1, r0)
            java.lang.String r0 = "value_check_hasdata"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L26
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r5.Al()
            r1 = 0
            if (r0 == 0) goto L27
            boolean r0 = r0.LJLJJI
            if (r0 == 0) goto L27
        L26:
            r1 = 1
        L27:
            X.UQ7 r0 = X.UQ7.NEW_VERSION_FACEBOOK
            int r0 = r0.getValue()
            if (r6 != r0) goto L6a
            if (r3 == 0) goto L61
            X.UQ7 r0 = X.UQ7.NEW_VERSION_CONTACT
            int r4 = r0.getValue()
        L37:
            if (r4 <= 0) goto L73
            X.UQ8 r3 = new X.UQ8
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r5.Al()
            r2 = 0
            if (r0 == 0) goto L5f
            java.lang.String r1 = r0.LJLJJL
        L44:
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r5.Al()
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.LJLJJLL
        L4c:
            r3.<init>(r4, r2, r1, r0)
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r5.Al()
            if (r0 == 0) goto L5c
            androidx.lifecycle.MediatorLiveData<X.UQ8> r0 = r0.LJLIL
            if (r0 == 0) goto L5c
            r0.postValue(r3)
        L5c:
            return
        L5d:
            r0 = r2
            goto L4c
        L5f:
            r1 = r2
            goto L44
        L61:
            if (r1 == 0) goto L73
            X.UQ7 r0 = X.UQ7.NEW_VERSION_RECOMMEND
            int r4 = r0.getValue()
            goto L37
        L6a:
            if (r1 == 0) goto L73
            X.UQ7 r0 = X.UQ7.NEW_VERSION_RECOMMEND
            int r4 = r0.getValue()
            goto L37
        L73:
            com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel r0 = r5.Al()
            if (r0 == 0) goto L5c
            androidx.lifecycle.MediatorLiveData<android.os.Bundle> r1 = r0.LJLILLLLZI
            if (r1 == 0) goto L5c
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.postValue(r0)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment.vl(int):void");
    }

    public final void wl(boolean z) {
        int i;
        int i2;
        String str;
        UQI uqi = this.LJLJI;
        if (uqi != null) {
            if (uqi.getSocialRecType() == 3) {
                if (z) {
                    UQI uqi2 = this.LJLJI;
                    if (uqi2 != null) {
                        if (uqi2.getStep() == UQ7.NEW_VERSION_FACEBOOK.getValue()) {
                            SocialRecFlowModel Al = Al();
                            if (Al != null) {
                                Al.LJLJJLL = "2";
                            }
                        } else {
                            SocialRecFlowModel Al2 = Al();
                            if (Al2 == null || (str = Al2.LJLJJLL) == null) {
                                str = "";
                            }
                            SocialRecFlowModel Al3 = Al();
                            if (Al3 != null) {
                                if (TextUtils.isEmpty(str)) {
                                    str = "1";
                                } else if (TextUtils.equals("2", str)) {
                                    str = "1,2";
                                }
                                Al3.LJLJJLL = str;
                            }
                        }
                    } else {
                        o.LJIJI("consentConfig");
                        throw null;
                    }
                }
                UQI uqi3 = this.LJLJI;
                if (uqi3 != null) {
                    int step = uqi3.getStep();
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity != null) {
                        SocialRecFlowModel Al4 = Al();
                        if (Al4 != null && !Al4.LJLJI) {
                            SocialRecFlowModel Al5 = Al();
                            if (Al5 != null) {
                                Al5.LJLJI = true;
                            }
                            C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
                            UQ7 uq7 = UQ7.NEW_VERSION_FACEBOOK;
                            if (step == uq7.getValue()) {
                                i = R.string.gaw;
                            } else {
                                i = R.string.dv5;
                            }
                            c26227ARb.LJ(i);
                            if (step == uq7.getValue()) {
                                i2 = R.string.gav;
                            } else {
                                i2 = R.string.dv4;
                            }
                            c26227ARb.LIZ(i2);
                            UC0.LIZJ(c26227ARb, new AqS100S0101000_13(step, this, 9));
                            c26227ARb.LJII = false;
                            c26227ARb.LJI().LIZLLL();
                            return;
                        }
                        vl(step);
                        return;
                    }
                    return;
                }
                o.LJIJI("consentConfig");
                throw null;
            }
            Dl();
            return;
        }
        o.LJIJI("consentConfig");
        throw null;
    }

    public final void Gl(int i, int i2) {
        String uid = ((RBX) HG3.LJIILL()).getCurUserId();
        if (TextUtils.isEmpty(uid)) {
            Dl();
            return;
        }
        SocialRecRequestViewModel xl = xl();
        o.LJIIIIZZ(uid, "uid");
        xl.getClass();
        if (i == 3) {
            if (i2 == UQ7.NEW_VERSION_CONTACT.getValue()) {
                UPZ upz = UPZ.LIZ;
                if (upz.LJ()) {
                    if (upz.LIZIZ()) {
                        xl.setState(UQX.LJLIL);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        xl.disposeOnClear(AbstractC73672Svk.LJJLIIIJLJLI(2L, timeUnit).LJJJJZI(new AfS65S0100000_13(xl, 112)));
                        xl.disposeOnClear(UPT.LIZJ(EnumC58085Mqv.NEW_VERSION).LJJLIIIJJI(5L, timeUnit).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS65S0100000_13(xl, 110), new AfS65S0100000_13(xl, 111)));
                        return;
                    }
                    xl.Hv0(i2, uid);
                    return;
                }
                xl.setState(UQY.LJLIL);
                return;
            }
            xl.Hv0(i2, uid);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0237, code lost:
    
        if (r1 == X.UQ7.NEW_VERSION_FACEBOOK.getValue()) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022e  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ay2, viewGroup, false);
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
