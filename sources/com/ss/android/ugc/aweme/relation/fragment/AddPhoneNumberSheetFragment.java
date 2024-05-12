package com.ss.android.ugc.aweme.relation.fragment;

import X.ASQ;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1JD;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252949wI;
import X.C29S;
import X.C3C5;
import X.C62822Ol8;
import X.C74088T5w;
import X.C76800UCe;
import X.C85665Xjh;
import X.C90903hW;
import X.C9WD;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.EnumC78973Uz3;
import X.InterfaceC219588ja;
import X.OSZ;
import X.V3N;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class AddPhoneNumberSheetFragment extends BaseAccountFlowFragment implements InterfaceC219588ja {
    public static final /* synthetic */ int LJZI = 0;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 535));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 606));

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark;
        LIZJ.LIZIZ(new AqS159S0100000_9(this, 534));
        c235119Kp.LIZIZ(LIZJ);
        return c235119Kp;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C9WD.LIZIZ(((C85665Xjh) _$_findCachedViewById(R.id.eo_)).getEditText());
    }

    public final void Hl(boolean z) {
        Bundle LJ = V3N.LJ(new OSZ("args_phone_number", ((C85665Xjh) _$_findCachedViewById(R.id.eo_)).getPhoneNumberObject()), new OSZ("code_sent", Boolean.valueOf(z)), new OSZ("use_sheet_style", Boolean.TRUE), new OSZ("current_page", Integer.valueOf(EnumC69113RAn.PHONE_SMS_BIND.getValue())), new OSZ("current_scene", Integer.valueOf(EnumC69116RAq.BIND_PHONE.getValue())), new OSZ("phone_number_source", Integer.valueOf(EnumC78973Uz3.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_FYP_POP_UP.getValue())));
        LJ.putAll(getArguments());
        InputCodeFragment inputCodeFragment = new InputCodeFragment();
        inputCodeFragment.setArguments(LJ);
        ASQ.LJIILIIL(this, inputCodeFragment, true);
    }

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
        C74088T5w c74088T5w;
        C74088T5w c74088T5w2;
        if (i != 0) {
            if (i != 1 || !isViewValid() || (c74088T5w2 = (C74088T5w) _$_findCachedViewById(R.id.eo5)) == null) {
                return;
            }
            c74088T5w2.LIZIZ(true);
            return;
        }
        if (!isViewValid() || (c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.eo5)) == null) {
            return;
        }
        c74088T5w.LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1JD.LJJIIJ(getEnterFrom(), "mobile", null, getEnterMethod());
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C252949wI c252949wI = (C252949wI) _$_findCachedViewById(R.id.eo8);
        if (c252949wI != null) {
            c252949wI.LIZIZ(message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0099, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            super.onViewCreated(r7, r8)
            android.content.Context r5 = r6.getContext()
            r0 = 2131364879(0x7f0a0c0f, float:1.8349608E38)
            android.view.View r4 = r6._$_findCachedViewById(r0)
            com.bytedance.tux.input.TuxTextView r4 = (com.bytedance.tux.input.TuxTextView) r4
            r3 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            X.C85837XmT.LIZJ(r5, r4, r2, r1, r0)
            r0 = 2131368819(0x7f0a1b73, float:1.8357599E38)
            android.view.View r4 = r6._$_findCachedViewById(r0)
            X.Xjh r4 = (X.C85665Xjh) r4
            kotlin.jvm.internal.AqS157S0100000_7 r1 = new kotlin.jvm.internal.AqS157S0100000_7
            r0 = 624(0x270, float:8.74E-43)
            r1.<init>(r6, r0)
            r4.setInputCountryViewClick(r1)
            android.widget.EditText r2 = r4.getEditText()
            r2.setInputType(r3)
            Y.IDObjectS123S0200000_15 r1 = new Y.IDObjectS123S0200000_15
            r0 = 1
            r1.<init>(r6, r2, r0)
            r2.addTextChangedListener(r1)
            r0 = 2131833037(0x7f1130cd, float:1.9299145E38)
            java.lang.String r0 = r6.getString(r0)
            r2.setHint(r0)
            com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil$PhoneNumber r3 = X.RBV.LJ(r6)
            if (r3 == 0) goto L9b
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r2 = ""
            r1.append(r2)
            int r0 = r3.getCountryCode()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.setCountryCode(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            java.lang.String r0 = r3.getCountryIso()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.setCountryName(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            java.lang.String r0 = r3.getNationalNumber()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r4.setPhoneNumber(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L9e
        L9b:
            r4.LIZJ()
        L9e:
            r0 = 2131368814(0x7f0a1b6e, float:1.8357589E38)
            android.view.View r2 = r6._$_findCachedViewById(r0)
            Y.ACListenerS35S0100000_15 r1 = new Y.ACListenerS35S0100000_15
            r0 = 242(0xf2, float:3.39E-43)
            r1.<init>(r6, r0)
            X.0ga r0 = new X.0ga
            r0.<init>(r1)
            r2.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.AddPhoneNumberSheetFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.axr, viewGroup, false);
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
