package com.ss.android.ugc.aweme.account.unbind;

import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C62822Ol8;
import X.C76800UCe;
import X.C7D8;
import X.C7D9;
import X.C85631Xj9;
import X.C85642XjK;
import X.C85689Xk5;
import X.C85699XkF;
import X.C85791Xlj;
import X.C90903hW;
import X.DialogC25756A8y;
import X.EnumC69113RAn;
import X.EnumC85785Xld;
import X.EnumC85786Xle;
import X.EnumC85788Xlg;
import X.EnumC85789Xlh;
import X.IMP;
import X.IMQ;
import X.IMR;
import X.IMS;
import X.ORZ;
import X.R41;
import X.RBV;
import X.T5U;
import X.VL0;
import X.VL1;
import X.VL2;
import Y.ACListenerS35S0100000_15;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountBindingsService;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.experiment.AccountBindingsService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes16.dex */
public final class UnbindConfirmFragment extends BaseAccountFlowFragment {
    public DialogC25756A8y LLFFF;
    public C7D8 LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final IAccountBindingsService LJLLLLLL = AccountBindingsService.LIZJ();
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 200));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new C85689Xk5(this));
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(new C85791Xlj(this));
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 196));
    public final C62822Ol8 LL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 198));
    public final C62822Ol8 LLD = C221108m2.LIZIZ(new AqS165S0100000_15(this, 197));
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 199));
    public final C62822Ol8 LLFF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 208));

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final String Gl() {
        return "UnbindConfirmFragment";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFZ).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFZ;
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

    @Override // X.InterfaceC69056R8i
    public final void ee(int i) {
    }

    public final String Hl() {
        return (String) this.LLFF.getValue();
    }

    public final boolean Il() {
        return ((Boolean) this.LJZI.getValue()).booleanValue();
    }

    public final boolean Jl() {
        return ((Boolean) this.LJLZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        Kl(VL2.GO_BACK);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DialogC25756A8y dialogC25756A8y = this.LLFFF;
        if (dialogC25756A8y != null) {
            dialogC25756A8y.hide();
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Kl(VL2 exitMethod) {
        IMP isEmailVerified;
        VL1 vl1;
        IMQ imq;
        EnumC85786Xle enumC85786Xle;
        ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
        if (Jl()) {
            isEmailVerified = IMP.NULL;
        } else if (C85642XjK.LIZ(this)) {
            isEmailVerified = IMP.DIGITAL_1;
        } else {
            isEmailVerified = IMP.DIGITAL_0;
        }
        o.LJIIIZ(isEmailVerified, "isEmailVerified");
        exitUnlinkPhoneEmailConfirmPageEvent.LIZLLL(isEmailVerified.getValue(), "is_email_verified");
        o.LJIIIZ(exitMethod, "exitMethod");
        exitUnlinkPhoneEmailConfirmPageEvent.LIZLLL(exitMethod.getValue(), "exit_method");
        if (((Boolean) this.LJZ.getValue()).booleanValue()) {
            vl1 = VL1.YES;
        } else {
            vl1 = VL1.NO;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ(vl1);
        if (Il()) {
            imq = IMQ.DIGITAL_1;
        } else {
            imq = IMQ.DIGITAL_0;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJII(imq);
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(EnumC85785Xld.UNLINK);
        if (Jl()) {
            enumC85786Xle = EnumC85786Xle.PHONE;
        } else {
            enumC85786Xle = EnumC85786Xle.EMAIL;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIIZ(enumC85786Xle);
        exitUnlinkPhoneEmailConfirmPageEvent.LJFF();
    }

    public final void Ml(List<? extends VerificationMethodType> list) {
        int i;
        VerificationMethodType verificationMethodType = (VerificationMethodType) ORZ.LJLLLL(list);
        if (verificationMethodType == null) {
            i = -1;
        } else {
            i = C85699XkF.LIZ[verificationMethodType.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C26045AKb c26045AKb = new C26045AKb(this);
                    c26045AKb.LJIIIIZZ(R.string.gqr);
                    c26045AKb.LJIIJ();
                    return;
                }
                User LIZJ = R41.LIZJ();
                Bundle arguments = getArguments();
                if (arguments != null) {
                    if (Jl()) {
                        arguments.putInt("next_page", EnumC69113RAn.UNBIND_PHONE_VERIFY_USING_PASSWORD.getValue());
                        String bindPhone = LIZJ.getBindPhone();
                        o.LJIIIIZZ(bindPhone, "currentUser.bindPhone");
                        RBV.LJIILIIL(arguments, bindPhone);
                    } else {
                        arguments.putInt("next_page", EnumC69113RAn.UNBIND_EMAIL_VERIFY_USING_PASSWORD.getValue());
                        String email = LIZJ.getEmail();
                        o.LJIIIIZZ(email, "currentUser.email");
                        RBV.LJIIJ(arguments, email);
                    }
                } else {
                    arguments = new Bundle();
                }
                rh(arguments);
                return;
            }
            C85642XjK.LIZLLL(this, "user_click", new AqS165S0100000_15(this, 736), C85631Xj9.LJI(this), new AqS165S0100000_15(this, 737));
            return;
        }
        C85642XjK.LJFF(this, "user_click", new AqS165S0100000_15(this, 738), C85631Xj9.LJI(this), new AqS165S0100000_15(this, 739));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.7D8] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        final String[] strArr;
        EnumC85789Xlh unlinkType;
        IMR isEmailVerified;
        VL0 isEnvSafe;
        IMS is2svOn;
        super.onCreate(bundle);
        if (Jl()) {
            List LJJIJIL = C47261Igj.LJJIJIL(getString(R.string.tfe), getString(R.string.tff), getString(R.string.tfg), getString(R.string.tfh), getString(R.string.tfi));
            if (Il()) {
                LJJIJIL.add(getString(R.string.c_c));
            }
            strArr = (String[]) LJJIJIL.toArray(new String[0]);
        } else {
            List LJJIJIL2 = C47261Igj.LJJIJIL(getString(R.string.ter), getString(R.string.tes), getString(R.string.tet), getString(R.string.teu));
            if (Il()) {
                LJJIJIL2.add(getString(R.string.c_a));
            }
            strArr = (String[]) LJJIJIL2.toArray(new String[0]);
        }
        this.LLFII = new AbstractC029409q<C7D9>(strArr) { // from class: X.7D8
            public final String[] LJLIL;
            public final IAccountBindingsService LJLILLLLZI;

            @Override // X.AbstractC029409q
            public final int getItemCount() {
                return this.LJLIL.length;
            }

            {
                o.LJIIIZ(strArr, "detailList");
                this.LJLIL = strArr;
                this.LJLILLLLZI = AccountBindingsService.LIZJ();
            }

            @Override // X.AbstractC029409q
            public final void onBindViewHolder(C7D9 c7d9, int i) {
                C7D9 holder = c7d9;
                o.LJIIIZ(holder, "holder");
                holder.LJLIL.setText(this.LJLIL[i]);
                if (this.LJLILLLLZI.LIZIZ()) {
                    int LIZIZ = C7MY.LIZIZ(24);
                    Context context = holder.itemView.getContext();
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_x_mark;
                    o.LJIIIIZZ(context, "context");
                    c2068389v.LIZLLL = C79045V0n.LJI(R.attr.e7, context);
                    c2068389v.LIZIZ = LIZIZ;
                    c2068389v.LIZJ = LIZIZ;
                    holder.LJLILLLLZI.setCompoundDrawablesWithIntrinsicBounds(c2068389v.LIZ(context), (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }

            @Override // X.AbstractC029409q
            /* renamed from: onCreateViewHolder */
            public final C7D9 com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup viewGroup, int i) {
                View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.nd, viewGroup, false);
                o.LJIIIIZZ(view, "view");
                C7D9 c7d9 = new C7D9(view);
                C0AX.LIZ(viewGroup, c7d9.itemView, R.id.lj7);
                View view2 = c7d9.itemView;
                if (view2 != null) {
                    view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
                }
                try {
                    if (c7d9.itemView.getParent() != null) {
                        boolean z = true;
                        try {
                            SettingsManager.LIZLLL().getClass();
                            z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (z) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C7D9.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C78983UzD.LJIILL(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c7d9.itemView.getParent();
                            if (viewGroup2 != null) {
                                C16880lQ.LJLLL(c7d9.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e) {
                    C78946Uyc.LIZIZ(e);
                    C36922EeM.LIZ(e);
                }
                C29127Bbv.LIZ = C7D9.class.getName();
                return c7d9;
            }
        };
        Context context = getContext();
        if (context != null) {
            this.LLFFF = new DialogC25756A8y(context);
        }
        ShowUnlinkPhoneEmailConfirmPageEvent showUnlinkPhoneEmailConfirmPageEvent = new ShowUnlinkPhoneEmailConfirmPageEvent();
        if (Jl()) {
            unlinkType = EnumC85789Xlh.PHONE;
        } else {
            unlinkType = EnumC85789Xlh.EMAIL;
        }
        o.LJIIIZ(unlinkType, "unlinkType");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(unlinkType.getValue(), "unlink_type");
        if (Jl()) {
            isEmailVerified = IMR.NULL;
        } else if (C85642XjK.LIZ(this)) {
            isEmailVerified = IMR.DIGITAL_1;
        } else {
            isEmailVerified = IMR.DIGITAL_0;
        }
        o.LJIIIZ(isEmailVerified, "isEmailVerified");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(isEmailVerified.getValue(), "is_email_verified");
        if (((Boolean) this.LJZ.getValue()).booleanValue()) {
            isEnvSafe = VL0.YES;
        } else {
            isEnvSafe = VL0.NO;
        }
        o.LJIIIZ(isEnvSafe, "isEnvSafe");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(Integer.valueOf(isEnvSafe.getValue()), "is_env_safe");
        if (Il()) {
            is2svOn = IMS.DIGITAL_1;
        } else {
            is2svOn = IMS.DIGITAL_0;
        }
        o.LJIIIZ(is2svOn, "is2svOn");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(Integer.valueOf(is2svOn.getValue()), "is_2sv_on");
        EnumC85788Xlg actionType = EnumC85788Xlg.UNLINK;
        o.LJIIIZ(actionType, "actionType");
        showUnlinkPhoneEmailConfirmPageEvent.LIZLLL(actionType.getValue(), "action_type");
        showUnlinkPhoneEmailConfirmPageEvent.LJFF();
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIZ(message);
        c26045AKb.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        User LIZJ = R41.LIZJ();
        if (Jl()) {
            ((TextView) _$_findCachedViewById(R.id.msw)).setText(getString(R.string.tfn));
            ((TextView) _$_findCachedViewById(R.id.msv)).setText(getString(R.string.tfm, LIZJ.getBindPhone()));
            TextView textView = (TextView) _$_findCachedViewById(R.id.mss);
            String string3 = getString(R.string.cbt);
            o.LJIIIIZZ(string3, "getString(R.string.bold_email)");
            if (((Boolean) this.LLD.getValue()).booleanValue()) {
                if (((Boolean) this.LLF.getValue()).booleanValue()) {
                    string2 = getString(R.string.tfk, string3, Hl());
                } else {
                    string2 = getString(R.string.tfl, string3);
                }
            } else {
                string2 = getString(R.string.tfj, Hl());
            }
            o.LJIIIIZZ(string2, "if (hasEmailAfterUnlink)…irdLoginMethod)\n        }");
            SpannableString spannableString = new SpannableString(string2);
            Ll(spannableString, string2, string3);
            Ll(spannableString, string2, Hl());
            textView.setText(spannableString);
        } else {
            ((TextView) _$_findCachedViewById(R.id.msw)).setText(getString(R.string.tez));
            ((TextView) _$_findCachedViewById(R.id.msv)).setText(getString(R.string.tey, LIZJ.getEmail()));
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.mss);
            String string4 = getString(R.string.cbu);
            o.LJIIIIZZ(string4, "getString(R.string.bold_phone_number)");
            if (((Boolean) this.LL.getValue()).booleanValue()) {
                if (((Boolean) this.LLF.getValue()).booleanValue()) {
                    string = getString(R.string.tew, string4, Hl());
                } else {
                    string = getString(R.string.tex, string4);
                }
            } else {
                string = getString(R.string.tev, Hl());
            }
            o.LJIIIIZZ(string, "if (hasPhoneAfterUnlink)…irdLoginMethod)\n        }");
            SpannableString spannableString2 = new SpannableString(string);
            Ll(spannableString2, string, string4);
            Ll(spannableString2, string, Hl());
            textView2.setText(spannableString2);
        }
        if (this.LJLLLLLL.LIZIZ()) {
            ((AppCompatTextView) _$_findCachedViewById(R.id.mst)).setBackgroundResource(R.drawable.wb);
            ((TextView) _$_findCachedViewById(R.id.mst)).setText(R.string.b5d);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.msu);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.msu);
        C7D8 c7d8 = this.LLFII;
        if (c7d8 != null) {
            recyclerView2.setAdapter(c7d8);
            C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.mst), new ACListenerS35S0100000_15(this, 85));
            C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.aha);
            C235119Kp c235119Kp = new C235119Kp();
            C234529Ii LIZJ2 = s1.LIZJ();
            LIZJ2.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ2.LIZIZ(new AqS165S0100000_15(this, 207));
            c235119Kp.LIZLLL(LIZJ2);
            c252709vu.setNavActions(c235119Kp);
            return;
        }
        o.LJIJI("detailItemAdapter");
        throw null;
    }

    public static void Ll(SpannableString spannableString, String str, String str2) {
        int LJJLIIIJL;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (LJJLIIIJL = s.LJJLIIIJL(str, str2, 0, false, 6)) == -1) {
            return;
        }
        spannableString.setSpan(new T5U(52, true), LJJLIIIJL, str2.length() + LJJLIIIJL, 33);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.n2, viewGroup, false);
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
