package com.ss.android.ugc.aweme.account.login.email;

import X.ASL;
import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C1DG;
import X.C2068389v;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26338AVi;
import X.C32151Nz;
import X.C35260Dse;
import X.C35936E8m;
import X.C61851OPf;
import X.C63081OpJ;
import X.C69093R9t;
import X.C6X6;
import X.C71897SJp;
import X.C74088T5w;
import X.C78685UuP;
import X.C7MY;
import X.C85706XkM;
import X.C85707XkN;
import X.C85709XkP;
import X.C85712XkS;
import X.C85729Xkj;
import X.C9KF;
import X.DialogInterfaceOnDismissListenerC85708XkO;
import X.FMX;
import X.M78;
import X.O6R;
import X.T5T;
import X.V86;
import Y.ACListenerS35S0100000_15;
import Y.AfS67S0100000_15;
import Y.IDObjectS186S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EmailPopUpFragment extends CommonInputEmailFragment {
    public static final /* synthetic */ int LLIIIZ = 0;
    public final int LLFFF;
    public final ActivityC45651qj LLFII;
    public final boolean LLFZ;
    public final boolean LLI;
    public final M78 LLIFFJFJJ;
    public final String LLII;
    public final String LLIIII;
    public final String LLIIIILZ;
    public TuxSheet LLIIIJ;
    public final Map<Integer, View> LLIIIL;

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void LLFII() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, X.C9WN
    public final void Rg() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIL;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        return R.layout.od;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.bindings.BaseAccountBindingsFlowFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (android.text.TextUtils.isEmpty(r2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        r2 = r1;
     */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C85712XkS Jl() {
        /*
            r14 = this;
            X.XkS r3 = new X.XkS
            r4 = 0
            r6 = 0
            r13 = 131071(0x1ffff, float:1.8367E-40)
            r5 = r4
            r7 = r4
            r8 = r4
            r9 = r6
            r10 = r4
            r11 = r6
            r12 = r6
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$PassportEmailPopupSettingsModel r0 = com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting.LIZ()
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$AddEmailPopupStrings r0 = r0.addEmailPopupStrings
            java.lang.String r2 = r0.actionSheetTitle
            r0 = 2131827698(0x7f111bf2, float:1.9288316E38)
            java.lang.String r1 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.dialog_add_email_address_title)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L2c
            r2 = r1
        L2c:
            r3.LJIIIIZZ = r2
            boolean r0 = r14.LLFZ
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$PassportEmailPopupSettingsModel r0 = com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting.LIZ()
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$AddEmailPopupStrings r0 = r0.addEmailPopupStrings
            java.lang.String r2 = r0.twoStepActionSheetBody
            r0 = 2131827696(0x7f111bf0, float:1.9288312E38)
            java.lang.String r1 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.dialo…mail_address_other_body3)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L4d
        L4c:
            r2 = r1
        L4d:
            r3.LJIIIZ = r2
            r0 = 1
            r3.LJIIJJI = r0
            r3.LJIILIIL = r0
            java.lang.String r0 = " "
            r3.LIZ = r0
            java.lang.String r0 = "bind_email_without_verify"
            r3.LJIIL = r0
            return r3
        L5d:
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$PassportEmailPopupSettingsModel r0 = com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting.LIZ()
            com.ss.android.ugc.aweme.account.login.email.EmailPopUpSetting$AddEmailPopupStrings r0 = r0.addEmailPopupStrings
            java.lang.String r2 = r0.oneStepActionSheetBody
            r0 = 2131844964(0x7f115f64, float:1.9323336E38)
            java.lang.String r1 = r14.getString(r0)
            java.lang.String r0 = "getString(R.string.setti…nsparencyDisclaimer_body)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L4d
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.email.EmailPopUpFragment.Jl():X.XkS");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC68974R5e
    public final String LJJLIIIJJI() {
        return C85707XkN.LIZIZ(Integer.valueOf(this.LLFFF));
    }

    public final void show() {
        double d;
        ASL asl = new ASL();
        asl.LIZIZ(this);
        asl.LIZ.LJLLJ = true;
        asl.LJI(1);
        if (C35260Dse.LIZ() == 5 && this.LLI) {
            d = 0.88d;
        } else {
            d = 0.82d;
        }
        asl.LIZ.LJLLLLLL = (int) (C63081OpJ.LJJJJJL(this.LLFII) * d);
        asl.LJ(new DialogInterfaceOnDismissListenerC85708XkO(this));
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        this.LLIIIJ = tuxSheet;
        C1DG.LJII(this.LLFII, "act.supportFragmentManager", tuxSheet, "BindUserEmail");
        Integer valueOf = Integer.valueOf(this.LLFFF);
        Boolean valueOf2 = Boolean.valueOf(this.LLFZ);
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", C85707XkN.LIZIZ(valueOf));
        c35936E8m.LIZLLL("enter_method", C85707XkN.LIZ(valueOf2));
        c35936E8m.LIZ(C61851OPf.LIZIZ(valueOf), "show_index");
        c35936E8m.LIZLLL("bind_type", "email");
        FMX.LJIIL("add_email_page_show", c35936E8m.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Il() {
        if (_$_findCachedViewById(R.id.aha).getVisibility() == 8) {
            return;
        }
        C85712XkS Jl = Jl();
        C235119Kp c235119Kp = new C235119Kp();
        String str = Jl.LIZ;
        if (str != null && C78685UuP.LJJJZ(str)) {
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = str;
            c235119Kp.LIZJ = c9kf;
        }
        c235119Kp.LIZLLL = false;
        C234529Ii c234529Ii = new C234529Ii();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_x_mark;
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = C7MY.LIZIZ(20);
        c234529Ii.LIZ(c2068389v);
        c234529Ii.LIZIZ(new C85709XkP(this));
        c235119Kp.LIZIZ(c234529Ii);
        ((C252709vu) _$_findCachedViewById(R.id.aha)).setNavActions(c235119Kp);
        View LJI = ((C252709vu) _$_findCachedViewById(R.id.aha)).LJI(this.LLII);
        if (LJI != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(20));
            layoutParams.gravity = 16;
            LJI.setLayoutParams(layoutParams);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void Zl() {
        View inputEmailDomainHint = _$_findCachedViewById(R.id.eny);
        o.LJIIIIZZ(inputEmailDomainHint, "inputEmailDomainHint");
        C26338AVi.LJI(inputEmailDomainHint, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, false, 29);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, X.InterfaceC68974R5e
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LLIIIILZ;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void dm(String data) {
        V86 v86;
        o.LJIIIZ(data, "data");
        int i = this.LLFFF;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    v86 = V86.DYABindEmailSourceTypeUnknown;
                } else {
                    v86 = V86.DYA_BIND_EMAIL_SOURCE_TYPE_PROFILE;
                }
            } else {
                v86 = V86.DYA_BIND_EMAIL_SOURCE_TYPE_INBOX;
            }
        } else {
            v86 = V86.DYA_BIND_EMAIL_SOURCE_TYPE_FEED;
        }
        C69093R9t.LIZ(this, this, data, v86, "").LJIIIZ(new C85706XkM(this, ((CompoundButton) _$_findCachedViewById(R.id.cti)).isChecked())).LJIIIIZZ(new AfS67S0100000_15(this, 17)).LJIILL();
        C85707XkN.LIZJ(Boolean.valueOf(this.LLFZ), "add", Integer.valueOf(this.LLFFF));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment, com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        T5T t5t;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C74088T5w c74088T5w = (C74088T5w) _$_findCachedViewById(R.id.eo0);
        String string = getString(R.string.ehe);
        o.LJIIIIZZ(string, "getString(R.string.dialog_add_email_address_add)");
        c74088T5w.setButtonText(string);
        if (_$_findCachedViewById(R.id.ah9).getVisibility() == 0) {
            ((TuxTextView) _$_findCachedViewById(R.id.ah9)).setTuxFont(13);
            View baseI18nContentTitle = _$_findCachedViewById(R.id.ah9);
            o.LJIIIIZZ(baseI18nContentTitle, "baseI18nContentTitle");
            C26338AVi.LJI(baseI18nContentTitle, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, null, false, 29);
        }
        EditText cm = cm();
        if (TextUtils.isEmpty(EmailPopUpSetting.LIZ().addEmailPopupStrings.actionSheetPlaceHolder)) {
            str = getString(R.string.ehj);
        } else {
            str = EmailPopUpSetting.LIZ().addEmailPopupStrings.actionSheetPlaceHolder;
        }
        cm.setHint(str);
        EditText cm2 = cm();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        cm2.setHintTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gp, context));
        cm().addTextChangedListener(new IDObjectS186S0100000_15(this, 1));
        if (C35260Dse.LIZ() == 5 && this.LLI) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            _$_findCachedViewById(R.id.cti).setVisibility(0);
            C16880lQ.LJJJI((C71897SJp) _$_findCachedViewById(R.id.cti), new ACListenerS35S0100000_15(this, 200));
            _$_findCachedViewById(R.id.cts).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.cts)).setText(getString(R.string.m5));
            ((C71897SJp) _$_findCachedViewById(R.id.cti)).setChecked(C85729Xkj.LIZ());
        } else {
            _$_findCachedViewById(R.id.cti).setVisibility(8);
            _$_findCachedViewById(R.id.cts).setVisibility(8);
        }
        EditText cm3 = cm();
        if ((cm3 instanceof T5T) && (t5t = (T5T) cm3) != null) {
            t5t.setTuxFont(41);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonInputEmailFragment
    public final void Yl(RecyclerView recyclerView, EditText editText, String enterFrom, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C6X6.LIZ(recyclerView, editText, enterFrom, this.LLIIIILZ, "");
    }

    public EmailPopUpFragment(ActivityC45651qj activity, int i, boolean z, boolean z2, M78 m78) {
        o.LJIIIZ(activity, "activity");
        this.LLIIIL = new LinkedHashMap();
        this.LLFFF = i;
        this.LLFII = activity;
        this.LLFZ = z2;
        this.LLI = z;
        this.LLIFFJFJJ = m78;
        this.LLII = "start_text";
        this.LLIIII = "is_not_external";
        this.LLIIIILZ = "click_add_email_page";
    }
}
