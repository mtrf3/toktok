package com.ss.android.ugc.aweme.account.bindings;

import X.C06530Nl;
import X.C245319jz;
import X.C252669vq;
import X.C47261Igj;
import X.C85631Xj9;
import X.C85698XkE;
import X.EnumC63822P3a;
import X.EnumC69116RAq;
import X.EnumC85633XjB;
import X.EnumC85692Xk8;
import X.EnumC85693Xk9;
import X.EnumC85694XkA;
import X.IMV;
import X.ORZ;
import X.P3W;
import X.P3X;
import X.R41;
import X.RBV;
import X.X1D;
import Y.ACListenerS35S0100000_15;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationResultEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationShowEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.IdentityVerificationTypingEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.VerificationListShowEvent;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class BaseAccountBindingsFlowFragment extends BaseI18nLoginFragment {
    public final Map<Integer, View> LL = new LinkedHashMap();
    public final User LJZL = R41.LIZJ();

    public final boolean Ql() {
        Integer num;
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(EnumC69116RAq.UNBIND_EMAIL.getValue()), Integer.valueOf(EnumC69116RAq.UNBIND_PHONE.getValue()), Integer.valueOf(EnumC69116RAq.MODIFY_PHONE.getValue()), Integer.valueOf(EnumC69116RAq.CHANGE_EMAIL.getValue()));
        Bundle arguments = getArguments();
        if (arguments != null) {
            num = Integer.valueOf(arguments.getInt("current_scene"));
        } else {
            num = null;
        }
        return ORZ.LJLJJI(num, LJJIJIIJI);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Tl() {
        EnumC85693Xk9 verificationMethod;
        IdentityVerificationShowEvent identityVerificationShowEvent = new IdentityVerificationShowEvent();
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        identityVerificationShowEvent.LIZLLL(enterFrom, "enter_from");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        identityVerificationShowEvent.LIZLLL(enterMethod, "enter_method");
        if (C85631Xj9.LJIIIZ(this)) {
            verificationMethod = EnumC85693Xk9.SMS;
        } else if (C85631Xj9.LJIIIIZZ(this)) {
            verificationMethod = EnumC85693Xk9.EMAIL;
        } else {
            verificationMethod = EnumC85693Xk9.PASSWORD;
        }
        o.LJIIIZ(verificationMethod, "verificationMethod");
        identityVerificationShowEvent.LIZLLL(verificationMethod.getValue(), "verification_method");
        identityVerificationShowEvent.LIZLLL(RBV.LIZLLL(this), "page");
        identityVerificationShowEvent.LJFF();
    }

    public final void Wl() {
        EnumC85694XkA verificationMethod;
        P3W isEmailShow;
        P3X isPwShow;
        EnumC63822P3a isSmsShow;
        C245319jz c245319jz = new C245319jz();
        c245319jz.LJI(R.string.c_g);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) C85631Xj9.LIZLLL(this)).iterator();
        while (it.hasNext()) {
            VerificationMethodType verificationMethodType = (VerificationMethodType) it.next();
            int i = C85698XkE.LIZ[verificationMethodType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.c_d);
                        LIZIZ.LJ = new ACListenerS35S0100000_15(this, 201);
                        arrayList.add(LIZIZ);
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Unknown verification type of ");
                        LIZ.append(verificationMethodType);
                        LIZ.append(" type");
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    }
                } else {
                    C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.c_e);
                    LIZIZ2.LJ = new ACListenerS35S0100000_15(this, 202);
                    arrayList.add(LIZIZ2);
                }
            } else {
                C252669vq LIZIZ3 = C06530Nl.LIZIZ(R.string.c_f);
                LIZIZ3.LJ = new ACListenerS35S0100000_15(this, 203);
                arrayList.add(LIZIZ3);
            }
        }
        C252669vq[] c252669vqArr = (C252669vq[]) arrayList.toArray(new C252669vq[0]);
        c245319jz.LIZIZ((C252669vq[]) Arrays.copyOf(c252669vqArr, c252669vqArr.length));
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        LIZJ.show(childFragmentManager, "ChangeMethodSheet");
        List LIZLLL = C85631Xj9.LIZLLL(this);
        VerificationListShowEvent verificationListShowEvent = new VerificationListShowEvent();
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        verificationListShowEvent.LIZLLL(enterFrom, "enter_from");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        verificationListShowEvent.LIZLLL(enterMethod, "enter_method");
        verificationListShowEvent.LIZLLL(RBV.LIZLLL(this), "page");
        if (C85631Xj9.LJIIIZ(this)) {
            verificationMethod = EnumC85694XkA.SMS;
        } else if (C85631Xj9.LJIIIIZZ(this)) {
            verificationMethod = EnumC85694XkA.EMAIL;
        } else {
            verificationMethod = EnumC85694XkA.PASSWORD;
        }
        o.LJIIIZ(verificationMethod, "verificationMethod");
        verificationListShowEvent.LIZLLL(verificationMethod.getValue(), "verification_method");
        ArrayList arrayList2 = (ArrayList) LIZLLL;
        if (arrayList2.contains(VerificationMethodType.EMAIL)) {
            isEmailShow = P3W.TRUE;
        } else {
            isEmailShow = P3W.FALSE;
        }
        o.LJIIIZ(isEmailShow, "isEmailShow");
        verificationListShowEvent.LIZLLL(isEmailShow.getValue(), "is_email_show");
        if (arrayList2.contains(VerificationMethodType.PASSWORD)) {
            isPwShow = P3X.TRUE;
        } else {
            isPwShow = P3X.FALSE;
        }
        o.LJIIIZ(isPwShow, "isPwShow");
        verificationListShowEvent.LIZLLL(isPwShow.getValue(), "is_pw_show");
        if (arrayList2.contains(VerificationMethodType.MOBILE)) {
            isSmsShow = EnumC63822P3a.TRUE;
        } else {
            isSmsShow = EnumC63822P3a.FALSE;
        }
        o.LJIIIZ(isSmsShow, "isSmsShow");
        verificationListShowEvent.LIZLLL(isSmsShow.getValue(), "is_sms_show");
        verificationListShowEvent.LJFF();
    }

    public final void Vl(EnumC85633XjB verificationMethod) {
        o.LJIIIZ(verificationMethod, "verificationMethod");
        IdentityVerificationTypingEvent identityVerificationTypingEvent = new IdentityVerificationTypingEvent();
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        identityVerificationTypingEvent.LIZLLL(enterFrom, "enter_from");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        identityVerificationTypingEvent.LIZLLL(enterMethod, "enter_method");
        identityVerificationTypingEvent.LIZLLL(verificationMethod.getValue(), "verification_method");
        identityVerificationTypingEvent.LIZLLL(RBV.LIZLLL(this), "page");
        identityVerificationTypingEvent.LJFF();
    }

    public final void Rl(int i, boolean z) {
        IMV isSuccess;
        EnumC85692Xk8 verificationMethod;
        IdentityVerificationResultEvent identityVerificationResultEvent = new IdentityVerificationResultEvent();
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        identityVerificationResultEvent.LIZLLL(enterFrom, "enter_from");
        String enterMethod = getEnterMethod();
        o.LJIIIIZZ(enterMethod, "enterMethod");
        identityVerificationResultEvent.LIZLLL(enterMethod, "enter_method");
        if (z) {
            isSuccess = IMV.DIGITAL_1;
        } else {
            isSuccess = IMV.DIGITAL_0;
        }
        o.LJIIIZ(isSuccess, "isSuccess");
        identityVerificationResultEvent.LIZLLL(Integer.valueOf(isSuccess.getValue()), "is_success");
        if (C85631Xj9.LJIIIZ(this)) {
            verificationMethod = EnumC85692Xk8.SMS;
        } else if (C85631Xj9.LJIIIIZZ(this)) {
            verificationMethod = EnumC85692Xk8.EMAIL;
        } else {
            verificationMethod = EnumC85692Xk8.PASSWORD;
        }
        o.LJIIIZ(verificationMethod, "verificationMethod");
        identityVerificationResultEvent.LIZLLL(verificationMethod.getValue(), "verification_method");
        identityVerificationResultEvent.LIZLLL(RBV.LIZLLL(this), "page");
        String errorCode = String.valueOf(i);
        o.LJIIIZ(errorCode, "errorCode");
        identityVerificationResultEvent.LIZLLL(errorCode, "error_code");
        identityVerificationResultEvent.LJFF();
    }
}
