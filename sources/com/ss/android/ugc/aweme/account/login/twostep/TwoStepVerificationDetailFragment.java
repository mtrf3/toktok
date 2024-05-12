package com.ss.android.ugc.aweme.account.login.twostep;

import X.AEM;
import X.AI8;
import X.AI9;
import X.AIF;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C2068389v;
import X.C221108m2;
import X.C22510uV;
import X.C253939xt;
import X.C26227ARb;
import X.C29S;
import X.C32151Nz;
import X.C3C5;
import X.C41234GGg;
import X.C47261Igj;
import X.C62822Ol8;
import X.C76800UCe;
import X.C85134Xb8;
import X.C85144XbI;
import X.C85148XbM;
import X.C90903hW;
import X.GJ0;
import X.O6R;
import X.R41;
import X.UC0;
import X.ViewOnClickListenerC85189Xc1;
import X.ViewOnClickListenerC85190Xc2;
import X.ViewOnClickListenerC85191Xc3;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS31S1200000_15;
import Y.ACListenerS35S0100000_15;
import Y.ACListenerS47S1100000_15;
import Y.ACListenerS49S0200000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS55S1200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TwoStepVerificationDetailFragment extends BaseFragment {
    public TuxIconView LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxIconView LJLJJI;
    public boolean LJLJJL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 147));
    public final int LJLJJLL = R.raw.icon_phone_fill;
    public final int LJLJL = R.raw.icon_envelpoe_fill;
    public final int LJLJLJ = R.raw.icon_lock_large_fill;
    public final int LJLJLLL = R.raw.icon_shield_tick;
    public String LJLL = "";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    public final String getEnterFrom() {
        return (String) this.LJLIL.getValue();
    }

    public final TuxIconView wl() {
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        o.LJIJI("defaultMore");
        throw null;
    }

    public final void Al(AddVerificationResponse addVerificationResponse) {
        VerifyWay verifyWay;
        VerifyWay verifyWay2;
        VerifyWay verifyWay3;
        boolean z;
        AddVerificationResponse.Data data;
        String default_verify_way;
        List<VerifyWay> two_step_verify_ways;
        VerifyWay verifyWay4;
        List<VerifyWay> two_step_verify_ways2;
        VerifyWay verifyWay5;
        List<VerifyWay> two_step_verify_ways3;
        VerifyWay verifyWay6;
        List<VerifyWay> two_step_verify_ways4;
        VerifyWay verifyWay7;
        User LIZJ = R41.LIZJ();
        AddVerificationResponse addVerificationResponse2 = addVerificationResponse;
        AddVerificationResponse.Data data2 = addVerificationResponse2.getData();
        List<VerifyWay> two_step_verify_ways5 = data2 != null ? data2.getTwo_step_verify_ways() : null;
        if (two_step_verify_ways5 != null) {
            int i = 0;
            for (VerifyWay verifyWay8 : two_step_verify_ways5) {
                Boolean is_available = verifyWay8.is_available();
                Boolean bool = Boolean.TRUE;
                if (o.LJ(is_available, bool)) {
                    i++;
                }
                this.LJLJJL = o.LJ(verifyWay8.getVerify_way(), "totp_verify") && o.LJ(verifyWay8.is_available(), bool);
            }
            _$_findCachedViewById(R.id.cdc).setVisibility(8);
            ((C253939xt) _$_findCachedViewById(R.id.afj)).LIZ(false, false);
            if (this.LJLJJL || GJ0.LIZ()) {
                AI8 ai8 = (AI8) _$_findCachedViewById(R.id.afg);
                o.LJII(ai8, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxTextCell");
                ai8.setWithSeparator(false);
                ((C253939xt) _$_findCachedViewById(R.id.afj)).setCellVisibility(true);
            }
            if (i == 1) {
                _$_findCachedViewById(R.id.cda).setVisibility(0);
                _$_findCachedViewById(R.id.v6).setVisibility(0);
                _$_findCachedViewById(R.id.cdb).setVisibility(8);
                _$_findCachedViewById(R.id.v7).setVisibility(8);
                ((AI8) _$_findCachedViewById(R.id.c5m)).LJ(true, true);
            } else if (i == 2) {
                _$_findCachedViewById(R.id.cda).setVisibility(8);
                _$_findCachedViewById(R.id.v6).setVisibility(8);
                _$_findCachedViewById(R.id.cdb).setVisibility(0);
                _$_findCachedViewById(R.id.v7).setVisibility(0);
                ((AI8) _$_findCachedViewById(R.id.c5m)).LJ(true, false);
                ((AI8) _$_findCachedViewById(R.id.aff)).LJ(false, true);
                if (this.LJLJJL || GJ0.LIZ()) {
                    ((AI8) _$_findCachedViewById(R.id.afg)).LJ(true, false);
                    ((C253939xt) _$_findCachedViewById(R.id.afj)).getTextCell().LJ(false, true);
                } else {
                    ((AI8) _$_findCachedViewById(R.id.afg)).LJ(true, true);
                }
            } else if (i == 3) {
                _$_findCachedViewById(R.id.cda).setVisibility(8);
                _$_findCachedViewById(R.id.v6).setVisibility(8);
                _$_findCachedViewById(R.id.cdb).setVisibility(8);
                _$_findCachedViewById(R.id.v7).setVisibility(8);
                if (this.LJLJJL || GJ0.LIZ()) {
                    _$_findCachedViewById(R.id.cdc).setVisibility(0);
                    ((C253939xt) _$_findCachedViewById(R.id.afj)).LIZ(true, true);
                }
                ((AI8) _$_findCachedViewById(R.id.c5m)).LJ(true, false);
                ((AI8) _$_findCachedViewById(R.id.aff)).LJ(false, false);
                ((AI8) _$_findCachedViewById(R.id.afg)).LJ(false, true);
                if (this.LJLJJL || GJ0.LIZ()) {
                    ((C253939xt) _$_findCachedViewById(R.id.afj)).getTextCell().LJ(true, true);
                }
            } else if (this.LJLJJL || GJ0.LIZ()) {
                _$_findCachedViewById(R.id.cda).setVisibility(8);
                _$_findCachedViewById(R.id.v6).setVisibility(8);
                _$_findCachedViewById(R.id.cdb).setVisibility(8);
                _$_findCachedViewById(R.id.v7).setVisibility(8);
                ((C253939xt) _$_findCachedViewById(R.id.afj)).LIZ(false, true);
                ((AI8) _$_findCachedViewById(R.id.c5m)).LJ(true, false);
                ((AI8) _$_findCachedViewById(R.id.aff)).LJ(false, false);
                ((AI8) _$_findCachedViewById(R.id.afg)).LJ(false, false);
                ((C253939xt) _$_findCachedViewById(R.id.afj)).getTextCell().LJ(false, true);
            }
        }
        AddVerificationResponse.Data data3 = addVerificationResponse2.getData();
        if (data3 == null || (two_step_verify_ways4 = data3.getTwo_step_verify_ways()) == null) {
            verifyWay = null;
        } else {
            Iterator<VerifyWay> it = two_step_verify_ways4.iterator();
            while (true) {
                if (it.hasNext()) {
                    verifyWay7 = it.next();
                    if (o.LJ(verifyWay7.getVerify_way(), "mobile_sms_verify")) {
                        break;
                    }
                } else {
                    verifyWay7 = null;
                    break;
                }
            }
            verifyWay = verifyWay7;
        }
        AddVerificationResponse.Data data4 = addVerificationResponse2.getData();
        if (data4 == null || (two_step_verify_ways3 = data4.getTwo_step_verify_ways()) == null) {
            verifyWay2 = null;
        } else {
            Iterator<VerifyWay> it2 = two_step_verify_ways3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    verifyWay6 = it2.next();
                    if (o.LJ(verifyWay6.getVerify_way(), "email_verify")) {
                        break;
                    }
                } else {
                    verifyWay6 = null;
                    break;
                }
            }
            verifyWay2 = verifyWay6;
        }
        AddVerificationResponse.Data data5 = addVerificationResponse2.getData();
        if (data5 == null || (two_step_verify_ways2 = data5.getTwo_step_verify_ways()) == null) {
            verifyWay3 = null;
        } else {
            Iterator<VerifyWay> it3 = two_step_verify_ways2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    verifyWay5 = it3.next();
                    if (o.LJ(verifyWay5.getVerify_way(), "pwd_verify")) {
                        break;
                    }
                } else {
                    verifyWay5 = null;
                    break;
                }
            }
            verifyWay3 = verifyWay5;
        }
        AddVerificationResponse.Data data6 = addVerificationResponse2.getData();
        if (data6 != null && (two_step_verify_ways = data6.getTwo_step_verify_ways()) != null) {
            Iterator<VerifyWay> it4 = two_step_verify_ways.iterator();
            while (true) {
                if (it4.hasNext()) {
                    verifyWay4 = it4.next();
                    if (o.LJ(verifyWay4.getVerify_way(), "totp_verify")) {
                        break;
                    }
                } else {
                    verifyWay4 = null;
                    break;
                }
            }
            VerifyWay verifyWay9 = verifyWay4;
            if (verifyWay9 != null && o.LJ(verifyWay9.is_available(), Boolean.TRUE)) {
                z = true;
                data = addVerificationResponse2.getData();
                if (data != null || (default_verify_way = data.getDefault_verify_way()) == null) {
                }
                switch (default_verify_way.hashCode()) {
                    case -797498437:
                        if (default_verify_way.equals("pwd_verify")) {
                            if (verifyWay != null) {
                                Boolean is_available2 = verifyWay.is_available();
                                Boolean bool2 = Boolean.TRUE;
                                if (o.LJ(is_available2, bool2)) {
                                    String bindPhone = LIZJ.getBindPhone();
                                    String string = (bindPhone == null || ujb.o.LJJJJJL(bindPhone)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    addVerificationResponse2 = addVerificationResponse2;
                                    Dl(string, C22510uV.LIZIZ(string, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", true, addVerificationResponse2);
                                    if (verifyWay2 != null && o.LJ(verifyWay2.is_available(), bool2)) {
                                        String email = LIZJ.getEmail();
                                        String string2 = (email == null || ujb.o.LJJJJJL(email)) ? getString(R.string.mu) : LIZJ.getEmail();
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Gl(string2, C22510uV.LIZIZ(string2, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", true, addVerificationResponse2);
                                        if (this.LJLJJL || GJ0.LIZ()) {
                                            if (z) {
                                                String string3 = getString(R.string.sgm);
                                                addVerificationResponse2 = addVerificationResponse2;
                                                Hl(string3, C22510uV.LIZIZ(string3, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                            } else {
                                                String string4 = getString(R.string.sgm);
                                                Hl(string4, C22510uV.LIZIZ(string4, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                            }
                                        }
                                    } else if (!this.LJLJJL && !GJ0.LIZ()) {
                                        String email2 = LIZJ.getEmail();
                                        String string5 = (email2 == null || ujb.o.LJJJJJL(email2)) ? getString(R.string.mu) : LIZJ.getEmail();
                                        Gl(string5, C22510uV.LIZIZ(string5, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                    } else if (z) {
                                        String string6 = getString(R.string.sgm);
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Gl(string6, C22510uV.LIZIZ(string6, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                        String email3 = LIZJ.getEmail();
                                        String string7 = (email3 == null || ujb.o.LJJJJJL(email3)) ? getString(R.string.mu) : LIZJ.getEmail();
                                        Hl(string7, C22510uV.LIZIZ(string7, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                    } else {
                                        String email4 = LIZJ.getEmail();
                                        String string8 = (email4 == null || ujb.o.LJJJJJL(email4)) ? getString(R.string.mu) : LIZJ.getEmail();
                                        Gl(string8, C22510uV.LIZIZ(string8, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                        String string9 = getString(R.string.sgm);
                                        Hl(string9, C22510uV.LIZIZ(string9, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                    }
                                    AI8 ai82 = (AI8) _$_findCachedViewById(R.id.c5m);
                                    ai82.setTitle(getString(R.string.t_p));
                                    ai82.setSubtitle(getString(R.string.ta6));
                                    C2068389v c2068389v = new C2068389v();
                                    c2068389v.LIZ = this.LJLJLJ;
                                    ai82.setIcon(c2068389v);
                                    C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 10));
                                    return;
                                }
                            }
                            if (verifyWay2 != null && o.LJ(verifyWay2.is_available(), Boolean.TRUE)) {
                                String email5 = LIZJ.getEmail();
                                String string10 = (email5 == null || ujb.o.LJJJJJL(email5)) ? getString(R.string.mu) : LIZJ.getEmail();
                                addVerificationResponse2 = addVerificationResponse2;
                                Dl(string10, C22510uV.LIZIZ(string10, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", true, addVerificationResponse2);
                                if (!this.LJLJJL && !GJ0.LIZ()) {
                                    String bindPhone2 = LIZJ.getBindPhone();
                                    String string11 = (bindPhone2 == null || ujb.o.LJJJJJL(bindPhone2)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Gl(string11, C22510uV.LIZIZ(string11, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                } else if (z) {
                                    String string12 = getString(R.string.sgm);
                                    addVerificationResponse2 = addVerificationResponse2;
                                    Gl(string12, C22510uV.LIZIZ(string12, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                    String bindPhone3 = LIZJ.getBindPhone();
                                    String string13 = (bindPhone3 == null || ujb.o.LJJJJJL(bindPhone3)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Hl(string13, C22510uV.LIZIZ(string13, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                } else {
                                    String bindPhone4 = LIZJ.getBindPhone();
                                    String string14 = (bindPhone4 == null || ujb.o.LJJJJJL(bindPhone4)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Gl(string14, C22510uV.LIZIZ(string14, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                    String string15 = getString(R.string.sgm);
                                    Hl(string15, C22510uV.LIZIZ(string15, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                }
                            } else if (!this.LJLJJL && !GJ0.LIZ()) {
                                String bindPhone5 = LIZJ.getBindPhone();
                                String string16 = (bindPhone5 == null || ujb.o.LJJJJJL(bindPhone5)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                Dl(string16, C22510uV.LIZIZ(string16, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                String email6 = LIZJ.getEmail();
                                String string17 = (email6 == null || ujb.o.LJJJJJL(email6)) ? getString(R.string.mu) : LIZJ.getEmail();
                                Gl(string17, C22510uV.LIZIZ(string17, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                            } else if (z) {
                                String string18 = getString(R.string.sgm);
                                Dl(string18, C22510uV.LIZIZ(string18, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                String bindPhone6 = LIZJ.getBindPhone();
                                String string19 = (bindPhone6 == null || ujb.o.LJJJJJL(bindPhone6)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                Gl(string19, C22510uV.LIZIZ(string19, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                String email7 = LIZJ.getEmail();
                                String string20 = (email7 == null || ujb.o.LJJJJJL(email7)) ? getString(R.string.mu) : LIZJ.getEmail();
                                Hl(string20, C22510uV.LIZIZ(string20, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                            } else {
                                String bindPhone7 = LIZJ.getBindPhone();
                                String string21 = (bindPhone7 == null || ujb.o.LJJJJJL(bindPhone7)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                Dl(string21, C22510uV.LIZIZ(string21, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                String email8 = LIZJ.getEmail();
                                String string22 = (email8 == null || ujb.o.LJJJJJL(email8)) ? getString(R.string.mu) : LIZJ.getEmail();
                                Gl(string22, C22510uV.LIZIZ(string22, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                String string23 = getString(R.string.sgm);
                                Hl(string23, C22510uV.LIZIZ(string23, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                            }
                            AI8 ai822 = (AI8) _$_findCachedViewById(R.id.c5m);
                            ai822.setTitle(getString(R.string.t_p));
                            ai822.setSubtitle(getString(R.string.ta6));
                            C2068389v c2068389v2 = new C2068389v();
                            c2068389v2.LIZ = this.LJLJLJ;
                            ai822.setIcon(c2068389v2);
                            C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 10));
                            return;
                        }
                        return;
                    case 300626556:
                        if (default_verify_way.equals("email_verify")) {
                            if (verifyWay != null) {
                                Boolean is_available3 = verifyWay.is_available();
                                Boolean bool3 = Boolean.TRUE;
                                if (o.LJ(is_available3, bool3)) {
                                    String bindPhone8 = LIZJ.getBindPhone();
                                    String string24 = (bindPhone8 == null || ujb.o.LJJJJJL(bindPhone8)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    addVerificationResponse2 = addVerificationResponse2;
                                    Dl(string24, C22510uV.LIZIZ(string24, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", true, addVerificationResponse2);
                                    if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), bool3)) {
                                        if (!this.LJLJJL && !GJ0.LIZ()) {
                                            String string25 = getString(R.string.t_p);
                                            Gl(string25, C22510uV.LIZIZ(string25, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                        } else if (z) {
                                            String string26 = getString(R.string.sgm);
                                            addVerificationResponse2 = addVerificationResponse2;
                                            Gl(string26, C22510uV.LIZIZ(string26, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                            String string27 = getString(R.string.t_p);
                                            Hl(string27, C22510uV.LIZIZ(string27, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                        } else {
                                            String string28 = getString(R.string.t_p);
                                            Gl(string28, C22510uV.LIZIZ(string28, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                            String string29 = getString(R.string.sgm);
                                            Hl(string29, C22510uV.LIZIZ(string29, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                        }
                                    } else if (!this.LJLJJL && !GJ0.LIZ()) {
                                        String string30 = getString(R.string.t_p);
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Gl(string30, C22510uV.LIZIZ(string30, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                    } else if (z) {
                                        String string31 = getString(R.string.sgm);
                                        Gl(string31, C22510uV.LIZIZ(string31, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                        String string32 = getString(R.string.t_p);
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Hl(string32, C22510uV.LIZIZ(string32, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                    } else {
                                        String string33 = getString(R.string.t_p);
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Gl(string33, C22510uV.LIZIZ(string33, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                        String string34 = getString(R.string.sgm);
                                        Hl(string34, C22510uV.LIZIZ(string34, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                    }
                                    AI8 ai83 = (AI8) _$_findCachedViewById(R.id.c5m);
                                    ai83.setTitle(LIZJ.getEmail());
                                    ai83.setSubtitle(getString(R.string.rmo));
                                    C2068389v c2068389v3 = new C2068389v();
                                    c2068389v3.LIZ = this.LJLJL;
                                    ai83.setIcon(c2068389v3);
                                    C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 9));
                                    return;
                                }
                            }
                            if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), Boolean.TRUE)) {
                                if (!this.LJLJJL && !GJ0.LIZ()) {
                                    String bindPhone9 = LIZJ.getBindPhone();
                                    String string35 = (bindPhone9 == null || ujb.o.LJJJJJL(bindPhone9)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Dl(string35, C22510uV.LIZIZ(string35, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                    String string36 = getString(R.string.t_p);
                                    Gl(string36, C22510uV.LIZIZ(string36, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                } else if (z) {
                                    String string37 = getString(R.string.sgm);
                                    Dl(string37, C22510uV.LIZIZ(string37, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                    String bindPhone10 = LIZJ.getBindPhone();
                                    String string38 = (bindPhone10 == null || ujb.o.LJJJJJL(bindPhone10)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Gl(string38, C22510uV.LIZIZ(string38, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                    String string39 = getString(R.string.t_p);
                                    Hl(string39, C22510uV.LIZIZ(string39, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                } else {
                                    String bindPhone11 = LIZJ.getBindPhone();
                                    String string40 = (bindPhone11 == null || ujb.o.LJJJJJL(bindPhone11)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Dl(string40, C22510uV.LIZIZ(string40, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                    String string41 = getString(R.string.sgm);
                                    Gl(string41, C22510uV.LIZIZ(string41, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                    String string42 = getString(R.string.t_p);
                                    Hl(string42, C22510uV.LIZIZ(string42, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                }
                            } else if (!this.LJLJJL && !GJ0.LIZ()) {
                                String string43 = getString(R.string.t_p);
                                Dl(string43, C22510uV.LIZIZ(string43, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                String bindPhone12 = LIZJ.getBindPhone();
                                String string44 = (bindPhone12 == null || ujb.o.LJJJJJL(bindPhone12)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                Gl(string44, C22510uV.LIZIZ(string44, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                            } else if (z) {
                                String string45 = getString(R.string.sgm);
                                Dl(string45, C22510uV.LIZIZ(string45, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                String string46 = getString(R.string.t_p);
                                Gl(string46, C22510uV.LIZIZ(string46, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                String bindPhone13 = LIZJ.getBindPhone();
                                String string47 = (bindPhone13 == null || ujb.o.LJJJJJL(bindPhone13)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                Hl(string47, C22510uV.LIZIZ(string47, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                            } else {
                                String string48 = getString(R.string.t_p);
                                Dl(string48, C22510uV.LIZIZ(string48, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                String bindPhone14 = LIZJ.getBindPhone();
                                String string49 = (bindPhone14 == null || ujb.o.LJJJJJL(bindPhone14)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                Gl(string49, C22510uV.LIZIZ(string49, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                String string50 = getString(R.string.sgm);
                                Hl(string50, C22510uV.LIZIZ(string50, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                            }
                            AI8 ai832 = (AI8) _$_findCachedViewById(R.id.c5m);
                            ai832.setTitle(LIZJ.getEmail());
                            ai832.setSubtitle(getString(R.string.rmo));
                            C2068389v c2068389v32 = new C2068389v();
                            c2068389v32.LIZ = this.LJLJL;
                            ai832.setIcon(c2068389v32);
                            C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 9));
                            return;
                        }
                        return;
                    case 312290780:
                        if (default_verify_way.equals("mobile_sms_verify")) {
                            if (verifyWay2 != null) {
                                Boolean is_available4 = verifyWay2.is_available();
                                Boolean bool4 = Boolean.TRUE;
                                if (o.LJ(is_available4, bool4)) {
                                    String email9 = LIZJ.getEmail();
                                    String string51 = (email9 == null || ujb.o.LJJJJJL(email9)) ? getString(R.string.mu) : LIZJ.getEmail();
                                    addVerificationResponse2 = addVerificationResponse2;
                                    Dl(string51, C22510uV.LIZIZ(string51, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", true, addVerificationResponse2);
                                    if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), bool4)) {
                                        if (!this.LJLJJL && !GJ0.LIZ()) {
                                            String string52 = getString(R.string.t_p);
                                            Gl(string52, C22510uV.LIZIZ(string52, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                        } else if (z) {
                                            String string53 = getString(R.string.sgm);
                                            addVerificationResponse2 = addVerificationResponse2;
                                            Gl(string53, C22510uV.LIZIZ(string53, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                            String string54 = getString(R.string.t_p);
                                            Hl(string54, C22510uV.LIZIZ(string54, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                        } else {
                                            String string55 = getString(R.string.t_p);
                                            Gl(string55, C22510uV.LIZIZ(string55, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                            String string56 = getString(R.string.sgm);
                                            Hl(string56, C22510uV.LIZIZ(string56, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                        }
                                    } else if (!this.LJLJJL && !GJ0.LIZ()) {
                                        String string57 = getString(R.string.t_p);
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Gl(string57, C22510uV.LIZIZ(string57, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                    } else if (z) {
                                        String string58 = getString(R.string.sgm);
                                        Gl(string58, C22510uV.LIZIZ(string58, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                        String string59 = getString(R.string.t_p);
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Hl(string59, C22510uV.LIZIZ(string59, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                    } else {
                                        String string60 = getString(R.string.t_p);
                                        addVerificationResponse2 = addVerificationResponse2;
                                        Gl(string60, C22510uV.LIZIZ(string60, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                        String string61 = getString(R.string.sgm);
                                        Hl(string61, C22510uV.LIZIZ(string61, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                    }
                                    AI8 ai84 = (AI8) _$_findCachedViewById(R.id.c5m);
                                    ai84.setTitle(LIZJ.getBindPhone());
                                    ai84.setSubtitle(getString(R.string.rmp));
                                    C2068389v c2068389v4 = new C2068389v();
                                    c2068389v4.LIZ = this.LJLJJLL;
                                    ai84.setIcon(c2068389v4);
                                    C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 8));
                                    return;
                                }
                            }
                            if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), Boolean.TRUE)) {
                                if (!this.LJLJJL && !GJ0.LIZ()) {
                                    String email10 = LIZJ.getEmail();
                                    String string62 = (email10 == null || ujb.o.LJJJJJL(email10)) ? getString(R.string.mu) : LIZJ.getEmail();
                                    Dl(string62, C22510uV.LIZIZ(string62, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                    String string63 = getString(R.string.t_p);
                                    Gl(string63, C22510uV.LIZIZ(string63, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                } else if (z) {
                                    String string64 = getString(R.string.sgm);
                                    Dl(string64, C22510uV.LIZIZ(string64, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                    String email11 = LIZJ.getEmail();
                                    String string65 = (email11 == null || ujb.o.LJJJJJL(email11)) ? getString(R.string.mu) : LIZJ.getEmail();
                                    Gl(string65, C22510uV.LIZIZ(string65, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                    String string66 = getString(R.string.t_p);
                                    Hl(string66, C22510uV.LIZIZ(string66, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                } else {
                                    String email12 = LIZJ.getEmail();
                                    String string67 = (email12 == null || ujb.o.LJJJJJL(email12)) ? getString(R.string.mu) : LIZJ.getEmail();
                                    Dl(string67, C22510uV.LIZIZ(string67, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                    String string68 = getString(R.string.sgm);
                                    Gl(string68, C22510uV.LIZIZ(string68, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                                    String string69 = getString(R.string.t_p);
                                    Hl(string69, C22510uV.LIZIZ(string69, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                }
                            } else if (!this.LJLJJL && !GJ0.LIZ()) {
                                String string70 = getString(R.string.t_p);
                                Dl(string70, C22510uV.LIZIZ(string70, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                String email13 = LIZJ.getEmail();
                                String string71 = (email13 == null || ujb.o.LJJJJJL(email13)) ? getString(R.string.mu) : LIZJ.getEmail();
                                Gl(string71, C22510uV.LIZIZ(string71, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                            } else if (z) {
                                String string72 = getString(R.string.sgm);
                                Dl(string72, C22510uV.LIZIZ(string72, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", true, addVerificationResponse2);
                                String string73 = getString(R.string.t_p);
                                Gl(string73, C22510uV.LIZIZ(string73, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                String email14 = LIZJ.getEmail();
                                String string74 = (email14 == null || ujb.o.LJJJJJL(email14)) ? getString(R.string.mu) : LIZJ.getEmail();
                                Hl(string74, C22510uV.LIZIZ(string74, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                            } else {
                                String string75 = getString(R.string.t_p);
                                Dl(string75, C22510uV.LIZIZ(string75, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                String email15 = LIZJ.getEmail();
                                String string76 = (email15 == null || ujb.o.LJJJJJL(email15)) ? getString(R.string.mu) : LIZJ.getEmail();
                                Gl(string76, C22510uV.LIZIZ(string76, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                String string77 = getString(R.string.sgm);
                                Hl(string77, C22510uV.LIZIZ(string77, "getString(R.string.totp2…nticatorApp_option_title)", this, R.string.sgl, "getString(R.string.totp2…enticatorApp_option_desc)"), this.LJLJLLL, "totp_verify", false, addVerificationResponse2);
                            }
                            AI8 ai842 = (AI8) _$_findCachedViewById(R.id.c5m);
                            ai842.setTitle(LIZJ.getBindPhone());
                            ai842.setSubtitle(getString(R.string.rmp));
                            C2068389v c2068389v42 = new C2068389v();
                            c2068389v42.LIZ = this.LJLJJLL;
                            ai842.setIcon(c2068389v42);
                            C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 8));
                            return;
                        }
                        return;
                    case 1972338561:
                        if (default_verify_way.equals("totp_verify")) {
                            if (this.LJLJJL || GJ0.LIZ()) {
                                if (verifyWay != null) {
                                    Boolean is_available5 = verifyWay.is_available();
                                    Boolean bool5 = Boolean.TRUE;
                                    if (o.LJ(is_available5, bool5)) {
                                        String bindPhone15 = LIZJ.getBindPhone();
                                        String string78 = (bindPhone15 == null || ujb.o.LJJJJJL(bindPhone15)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                        Dl(string78, C22510uV.LIZIZ(string78, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", true, addVerificationResponse2);
                                        if (verifyWay2 != null && o.LJ(verifyWay2.is_available(), bool5)) {
                                            String email16 = LIZJ.getEmail();
                                            String string79 = (email16 == null || ujb.o.LJJJJJL(email16)) ? getString(R.string.mu) : LIZJ.getEmail();
                                            Gl(string79, C22510uV.LIZIZ(string79, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", true, addVerificationResponse2);
                                            if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), bool5)) {
                                                String string80 = getString(R.string.t_p);
                                                Hl(string80, C22510uV.LIZIZ(string80, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                            } else {
                                                String string81 = getString(R.string.t_p);
                                                Hl(string81, C22510uV.LIZIZ(string81, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                            }
                                        } else if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), bool5)) {
                                            String email17 = LIZJ.getEmail();
                                            String string82 = (email17 == null || ujb.o.LJJJJJL(email17)) ? getString(R.string.mu) : LIZJ.getEmail();
                                            Gl(string82, C22510uV.LIZIZ(string82, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                            String string83 = getString(R.string.t_p);
                                            Hl(string83, C22510uV.LIZIZ(string83, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                        } else {
                                            String string84 = getString(R.string.t_p);
                                            Gl(string84, C22510uV.LIZIZ(string84, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                            String email18 = LIZJ.getEmail();
                                            String string85 = (email18 == null || ujb.o.LJJJJJL(email18)) ? getString(R.string.mu) : LIZJ.getEmail();
                                            Hl(string85, C22510uV.LIZIZ(string85, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                        }
                                        AI8 ai85 = (AI8) _$_findCachedViewById(R.id.c5m);
                                        ai85.setTitle(getString(R.string.sgm));
                                        ai85.setSubtitle(getString(R.string.sgl));
                                        C2068389v c2068389v5 = new C2068389v();
                                        c2068389v5.LIZ = this.LJLJLLL;
                                        ai85.setIcon(c2068389v5);
                                        C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 11));
                                        return;
                                    }
                                }
                                if (verifyWay2 != null) {
                                    Boolean is_available6 = verifyWay2.is_available();
                                    Boolean bool6 = Boolean.TRUE;
                                    if (o.LJ(is_available6, bool6)) {
                                        String email19 = LIZJ.getEmail();
                                        String string86 = (email19 == null || ujb.o.LJJJJJL(email19)) ? getString(R.string.mu) : LIZJ.getEmail();
                                        Dl(string86, C22510uV.LIZIZ(string86, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", true, addVerificationResponse2);
                                        if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), bool6)) {
                                            String bindPhone16 = LIZJ.getBindPhone();
                                            String string87 = (bindPhone16 == null || ujb.o.LJJJJJL(bindPhone16)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                            Gl(string87, C22510uV.LIZIZ(string87, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                            String string88 = getString(R.string.t_p);
                                            Hl(string88, C22510uV.LIZIZ(string88, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                        } else {
                                            String string89 = getString(R.string.t_p);
                                            Gl(string89, C22510uV.LIZIZ(string89, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                            String bindPhone17 = LIZJ.getBindPhone();
                                            String string90 = (bindPhone17 == null || ujb.o.LJJJJJL(bindPhone17)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                            Hl(string90, C22510uV.LIZIZ(string90, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                        }
                                        AI8 ai852 = (AI8) _$_findCachedViewById(R.id.c5m);
                                        ai852.setTitle(getString(R.string.sgm));
                                        ai852.setSubtitle(getString(R.string.sgl));
                                        C2068389v c2068389v52 = new C2068389v();
                                        c2068389v52.LIZ = this.LJLJLLL;
                                        ai852.setIcon(c2068389v52);
                                        C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 11));
                                        return;
                                    }
                                }
                                if (verifyWay3 == null || !o.LJ(verifyWay3.is_available(), Boolean.TRUE)) {
                                    String bindPhone18 = LIZJ.getBindPhone();
                                    String string91 = (bindPhone18 == null || ujb.o.LJJJJJL(bindPhone18)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Dl(string91, C22510uV.LIZIZ(string91, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                    String email20 = LIZJ.getEmail();
                                    String string92 = (email20 == null || ujb.o.LJJJJJL(email20)) ? getString(R.string.mu) : LIZJ.getEmail();
                                    Gl(string92, C22510uV.LIZIZ(string92, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                    String string93 = getString(R.string.t_p);
                                    Hl(string93, C22510uV.LIZIZ(string93, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", false, addVerificationResponse2);
                                } else {
                                    String string94 = getString(R.string.t_p);
                                    Dl(string94, C22510uV.LIZIZ(string94, "getString(R.string.twosv_pw)", this, R.string.ta6, "getString(R.string.twosv_settings_password_desc)"), this.LJLJLJ, "pwd_verify", true, addVerificationResponse2);
                                    String bindPhone19 = LIZJ.getBindPhone();
                                    String string95 = (bindPhone19 == null || ujb.o.LJJJJJL(bindPhone19)) ? getString(R.string.tx) : LIZJ.getBindPhone();
                                    Gl(string95, C22510uV.LIZIZ(string95, "if (user.bindPhone.isNul….SMS) else user.bindPhone", this, R.string.rmp, "getString(R.string.step_verification_SMS_code)"), this.LJLJJLL, "mobile_sms_verify", false, addVerificationResponse2);
                                    String email21 = LIZJ.getEmail();
                                    String string96 = (email21 == null || ujb.o.LJJJJJL(email21)) ? getString(R.string.mu) : LIZJ.getEmail();
                                    Hl(string96, C22510uV.LIZIZ(string96, "if (user.email.isNullOrB…ng.Email) else user.email", this, R.string.rmo, "getString(R.string.step_verification_Email_code)"), this.LJLJL, "email_verify", false, addVerificationResponse2);
                                }
                                AI8 ai8522 = (AI8) _$_findCachedViewById(R.id.c5m);
                                ai8522.setTitle(getString(R.string.sgm));
                                ai8522.setSubtitle(getString(R.string.sgl));
                                C2068389v c2068389v522 = new C2068389v();
                                c2068389v522.LIZ = this.LJLJLLL;
                                ai8522.setIcon(c2068389v522);
                                C16880lQ.LJJJ(wl(), new ACListenerS49S0200000_15(this, addVerificationResponse2, 11));
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
        z = false;
        data = addVerificationResponse2.getData();
        if (data != null) {
        }
    }

    public final void vl(String str) {
        TwoStepVerificationManageActivity twoStepVerificationManageActivity;
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJJI("add_back_up_method", enterFrom);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if ((mo49getActivity instanceof TwoStepVerificationManageActivity) && (twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) mo49getActivity) != null) {
            twoStepVerificationManageActivity.LLJJIJIIJIL(0, C47261Igj.LJJIJIL(str));
        }
    }

    public final void Il(AddVerificationResponse addVerificationResponse, String str) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJJIJLIJ(str, enterFrom);
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJFF(getString(R.string.rn8));
        c26227ARb.LIZIZ(getString(R.string.rn7));
        UC0.LIZJ(c26227ARb, new AqS55S1200000_15(addVerificationResponse, this, str, 0));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AIF aif;
        AEM aem;
        AIF aif2;
        AIF aif3;
        AIF aif4;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        fragmentConfiguration(C41234GGg.LJLIL);
        Bundle arguments = getArguments();
        o.LJI(arguments);
        Serializable serializable = arguments.getSerializable("response");
        o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse");
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) serializable;
        AI8 ai8 = (AI8) _$_findCachedViewById(R.id.c5m);
        ConstraintLayout constraintLayout = (ConstraintLayout) ai8.findViewById(R.id.b86);
        C16880lQ.LJIL(constraintLayout, null);
        constraintLayout.setBackgroundResource(0);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        TuxIconView tuxIconView = new TuxIconView(requireContext, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_ellipsis_horizontal);
        tuxIconView.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView.setTintColor(R.attr.gv);
        this.LJLILLLLZI = tuxIconView;
        AI9 accessory = ai8.getAccessory();
        if ((accessory instanceof AIF) && (aif4 = (AIF) accessory) != null) {
            aif4.LJIIL(wl());
            aif4.LJIILL(false);
        }
        AI8 ai82 = (AI8) _$_findCachedViewById(R.id.aff);
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        TuxIconView tuxIconView2 = new TuxIconView(requireContext2, null, 0, 6, null);
        tuxIconView2.setIconRes(R.raw.icon_ellipsis_horizontal);
        tuxIconView2.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView2.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView2.setTintColor(R.attr.gv);
        this.LJLJI = tuxIconView2;
        AI9 accessory2 = ai82.getAccessory();
        if ((accessory2 instanceof AIF) && (aif3 = (AIF) accessory2) != null) {
            TuxIconView tuxIconView3 = this.LJLJI;
            if (tuxIconView3 != null) {
                aif3.LJIIL(tuxIconView3);
                aif3.LJIILL(false);
            } else {
                o.LJIJI("backupMore");
                throw null;
            }
        }
        AI8 ai83 = (AI8) _$_findCachedViewById(R.id.afg);
        Context requireContext3 = requireContext();
        o.LJIIIIZZ(requireContext3, "requireContext()");
        TuxIconView tuxIconView4 = new TuxIconView(requireContext3, null, 0, 6, null);
        tuxIconView4.setIconRes(R.raw.icon_ellipsis_horizontal);
        tuxIconView4.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView4.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
        tuxIconView4.setTintColor(R.attr.gv);
        this.LJLJJI = tuxIconView4;
        AI9 accessory3 = ai83.getAccessory();
        if ((accessory3 instanceof AIF) && (aif2 = (AIF) accessory3) != null) {
            TuxIconView tuxIconView5 = this.LJLJJI;
            if (tuxIconView5 != null) {
                aif2.LJIIL(tuxIconView5);
                aif2.LJIILL(false);
            } else {
                o.LJIJI("backupSecondMore");
                throw null;
            }
        }
        Al(addVerificationResponse);
        AI8 ai84 = (AI8) _$_findCachedViewById(R.id.keq);
        ((TuxTextView) ai84.findViewById(R.id.lao)).setTuxFont(43);
        AI9 accessory4 = ai84.getAccessory();
        if ((accessory4 instanceof AEM) && (aem = (AEM) accessory4) != null) {
            aem.LJIIJJI(new ACListenerS49S0200000_15(this, addVerificationResponse, 7));
        }
        ai84.LJ(true, true);
        AI8 ai85 = (AI8) _$_findCachedViewById(R.id.aa3);
        ((TuxTextView) ai85.findViewById(R.id.lao)).setTuxFont(43);
        AI9 accessory5 = ai85.getAccessory();
        if ((accessory5 instanceof AIF) && (aif = (AIF) accessory5) != null) {
            ai85.LJ(true, true);
            aif.LJIILL(true);
            aif.LJIILJJIL(new ACListenerS27S0100000_7(this, 10));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.n1, viewGroup, false);
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

    public final void xl(String str, AddVerificationResponse addVerificationResponse, boolean z) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String str2;
        List<VerifyWay> two_step_verify_ways;
        User LIZJ = R41.LIZJ();
        boolean LJ = o.LJ(str, "mobile_sms_verify");
        boolean LJ2 = o.LJ(str, "email_verify");
        boolean LJ3 = o.LJ(str, "totp_verify");
        AddVerificationResponse.Data data = addVerificationResponse.getData();
        Boolean bool = null;
        if (data != null && (two_step_verify_ways = data.getTwo_step_verify_ways()) != null) {
            Iterator<VerifyWay> it = two_step_verify_ways.iterator();
            boolean z2 = false;
            int i = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next().is_available(), Boolean.TRUE)) {
                    i++;
                }
            }
            if (i > 2) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        if (LJ) {
            string = LIZJ.getBindPhone();
        } else if (LJ2) {
            string = LIZJ.getEmail();
        } else if (LJ3) {
            string = getString(R.string.sgi);
        } else {
            string = getString(R.string.t_p);
        }
        if (LJ) {
            string2 = getString(R.string.fl3);
        } else if (LJ2) {
            string2 = getString(R.string.fiy);
        } else if (LJ3) {
            string2 = getString(R.string.sgg);
        } else {
            string2 = getString(R.string.t_k);
        }
        o.LJIIIIZZ(string2, "when {\n            isPho…_changepw_desc)\n        }");
        if (LJ) {
            string3 = getString(R.string.a25);
        } else if (LJ2) {
            string3 = getString(R.string.a24);
        } else if (LJ3) {
            string3 = getString(R.string.sgk);
        } else {
            string3 = getString(R.string.t_5);
        }
        o.LJIIIIZZ(string3, "when {\n            isPho…e_pw_popup_btn)\n        }");
        String str3 = string3;
        C85134Xb8 c85134Xb8 = new C85134Xb8(LJ, this, LJ2, LJ3, z, string3, str);
        if (LJ) {
            string4 = getString(R.string.q1o);
        } else if (LJ2) {
            string4 = getString(R.string.q1b);
        } else if (LJ3) {
            string4 = getString(R.string.sgx);
        } else {
            string4 = getString(R.string.t_o);
        }
        o.LJIIIIZZ(string4, "when {\n            isPho…removepw_title)\n        }");
        if (LJ) {
            string5 = getString(R.string.q1n);
        } else if (LJ2) {
            string5 = getString(R.string.q1c);
        } else if (LJ3) {
            string5 = getString(R.string.sgw);
        } else {
            string5 = getString(R.string.t_n);
        }
        o.LJIIIIZZ(string5, "when {\n            isPho…_removepw_desc)\n        }");
        if (LJ) {
            str2 = "edit_sms";
        } else if (LJ2) {
            str2 = "edit_email";
        } else if (LJ3) {
            str2 = "totp";
        } else {
            str2 = "edit_password";
        }
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJJI(str2, enterFrom);
        String enterFrom2 = getEnterFrom();
        o.LJIIIIZZ(enterFrom2, "enterFrom");
        C85144XbI.LIZLLL(str, enterFrom2);
        Context context = getContext();
        if (context == null) {
            return;
        }
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJFF(string);
        c26227ARb.LIZIZ(string2);
        UC0.LIZJ(c26227ARb, new C85148XbM(LJ3, str3, bool, str2, this, str, c85134Xb8, addVerificationResponse, context, string4, string5));
        c26227ARb.LJI().LIZLLL();
    }

    public final void Dl(String str, String str2, int i, String str3, boolean z, AddVerificationResponse addVerificationResponse) {
        AIF aif;
        AIF aif2;
        AI8 ai8 = (AI8) _$_findCachedViewById(R.id.aff);
        ai8.setTitle(str);
        ai8.setSubtitle(str2);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        ai8.setIcon(c2068389v);
        if (z) {
            TuxIconView tuxIconView = this.LJLJI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                TuxIconView tuxIconView2 = this.LJLJI;
                if (tuxIconView2 != null) {
                    C16880lQ.LJJJ(tuxIconView2, new ACListenerS31S1200000_15(addVerificationResponse, this, str3, 0));
                    AI8 ai82 = (AI8) _$_findCachedViewById(R.id.aff);
                    ConstraintLayout constraintLayout = (ConstraintLayout) ai82.findViewById(R.id.b86);
                    C16880lQ.LJIL(constraintLayout, null);
                    constraintLayout.setBackgroundResource(0);
                    AI9 accessory = ai82.getAccessory();
                    if ((accessory instanceof AIF) && (aif2 = (AIF) accessory) != null) {
                        aif2.LJIILJJIL(ViewOnClickListenerC85189Xc1.LJLIL);
                        return;
                    }
                    return;
                }
                o.LJIJI("backupMore");
                throw null;
            }
            o.LJIJI("backupMore");
            throw null;
        }
        TuxIconView tuxIconView3 = this.LJLJI;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(8);
            AI8 ai83 = (AI8) _$_findCachedViewById(R.id.aff);
            C16880lQ.LJIL((ConstraintLayout) ai83.findViewById(R.id.b86), new ACListenerS35S0100000_15(ai83, 38));
            AI9 accessory2 = ai83.getAccessory();
            if (!(accessory2 instanceof AIF) || (aif = (AIF) accessory2) == null) {
                return;
            }
            aif.LJIILJJIL(new ACListenerS47S1100000_15(this, str3, 0));
            return;
        }
        o.LJIJI("backupMore");
        throw null;
    }

    public final void Gl(String str, String str2, int i, String str3, boolean z, AddVerificationResponse addVerificationResponse) {
        AIF aif;
        AIF aif2;
        AI8 ai8 = (AI8) _$_findCachedViewById(R.id.afg);
        ai8.setTitle(str);
        ai8.setSubtitle(str2);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        ai8.setIcon(c2068389v);
        if (z) {
            TuxIconView tuxIconView = this.LJLJJI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                TuxIconView tuxIconView2 = this.LJLJJI;
                if (tuxIconView2 != null) {
                    C16880lQ.LJJJ(tuxIconView2, new ACListenerS31S1200000_15(addVerificationResponse, this, str3, 1));
                    AI8 ai82 = (AI8) _$_findCachedViewById(R.id.afg);
                    ConstraintLayout constraintLayout = (ConstraintLayout) ai82.findViewById(R.id.b86);
                    C16880lQ.LJIL(constraintLayout, null);
                    constraintLayout.setBackgroundResource(0);
                    AI9 accessory = ai82.getAccessory();
                    if ((accessory instanceof AIF) && (aif2 = (AIF) accessory) != null) {
                        aif2.LJIILJJIL(ViewOnClickListenerC85190Xc2.LJLIL);
                        return;
                    }
                    return;
                }
                o.LJIJI("backupSecondMore");
                throw null;
            }
            o.LJIJI("backupSecondMore");
            throw null;
        }
        TuxIconView tuxIconView3 = this.LJLJJI;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(8);
            AI8 ai83 = (AI8) _$_findCachedViewById(R.id.afg);
            C16880lQ.LJIL((ConstraintLayout) ai83.findViewById(R.id.b86), new ACListenerS35S0100000_15(ai83, 39));
            AI9 accessory2 = ai83.getAccessory();
            if (!(accessory2 instanceof AIF) || (aif = (AIF) accessory2) == null) {
                return;
            }
            aif.LJIILJJIL(new ACListenerS47S1100000_15(this, str3, 1));
            return;
        }
        o.LJIJI("backupSecondMore");
        throw null;
    }

    public final void Hl(String str, String str2, int i, String str3, boolean z, AddVerificationResponse addVerificationResponse) {
        int i2;
        C253939xt c253939xt = (C253939xt) _$_findCachedViewById(R.id.afj);
        ACListenerS31S1200000_15 aCListenerS31S1200000_15 = new ACListenerS31S1200000_15(addVerificationResponse, this, str3, 2);
        ACListenerS47S1100000_15 aCListenerS47S1100000_15 = new ACListenerS47S1100000_15(this, str3, 2);
        c253939xt.getClass();
        AI8 textCell = c253939xt.getTextCell();
        textCell.setTitle(str);
        textCell.setSubtitle(str2);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        textCell.setIcon(c2068389v);
        TuxIconView tuxIconView = c253939xt.LJLJJI;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxIconView.setVisibility(i2);
        if (z) {
            C16880lQ.LJJJ(tuxIconView, aCListenerS31S1200000_15);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) c253939xt.getTextCell().findViewById(R.id.b86);
        if (z) {
            C16880lQ.LJIL(constraintLayout, null);
            constraintLayout.setBackgroundResource(0);
            AIF textCellAccessory = c253939xt.getTextCellAccessory();
            if (textCellAccessory != null) {
                textCellAccessory.LJIILJJIL(ViewOnClickListenerC85191Xc3.LJLIL);
                return;
            }
            return;
        }
        C16880lQ.LJIL(constraintLayout, new ACListenerS24S0100000_4(c253939xt, 316));
        AIF textCellAccessory2 = c253939xt.getTextCellAccessory();
        if (textCellAccessory2 == null) {
            return;
        }
        textCellAccessory2.LJIILJJIL(aCListenerS47S1100000_15);
    }
}
