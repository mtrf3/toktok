package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.AnonymousClass636;
import X.C04330Ez;
import X.C16880lQ;
import X.C188727au;
import X.C239209a8;
import X.C64707PaR;
import X.C73969T1h;
import X.C84763XOl;
import X.FMX;
import X.InterfaceC239229aA;
import X.InterfaceC64592gB;
import X.SY4;
import X.T16;
import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public final class PrivateAccountTipsViewDelegate implements IPrivateAccountTipsView {
    public C239209a8 LIZ;

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onDestroyView() {
        this.LIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onResume() {
        C239209a8 c239209a8 = this.LIZ;
        o.LJI(c239209a8);
        c239209a8.LIZJ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onStop() {
        if (C84763XOl.LJIIJJI) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("result", "background");
            long currentTimeMillis = System.currentTimeMillis();
            C239209a8 c239209a8 = this.LIZ;
            o.LJI(c239209a8);
            c188727au.LJ(currentTimeMillis - c239209a8.LIZJ, "stay_time");
            FMX.LJIIL("private_notify_exit", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            FMX.onEventV3("private_notify_show");
        }
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final void LIZIZ(View view, InterfaceC239229aA interfaceC239229aA) {
        o.LJIIIZ(view, "view");
        C239209a8 c239209a8 = new C239209a8(view, interfaceC239229aA);
        this.LIZ = c239209a8;
        SY4 sy4 = (SY4) c239209a8.LIZ.findViewById(R.id.drr);
        sy4.getClass();
        C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(c239209a8, 18));
        final Context context = c239209a8.LIZ.getContext();
        String string = context.getString(R.string.hsl);
        o.LJIIIIZZ(string, "context.getString(R.stri…rn_more_private_accounts)");
        int i = 0;
        String string2 = context.getString(R.string.egu, string);
        o.LJIIIIZZ(string2, "context.getString(R.stri…_signup, learnMoreString)");
        SpannableString spannableString = new SpannableString(string2);
        int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
        final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context);
        spannableString.setSpan(new ClickableSpan() { // from class: X.9a5
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                String str;
                o.LJIIIZ(widget, "widget");
                Context context2 = context;
                try {
                    SettingsManager.LIZLLL().getClass();
                    str = SettingsManager.LJI("minor_default_private_hint_intro_url", "");
                } catch (Throwable unused) {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "aweme://webview/?url=https%3A%2F%2Fsupport.tiktok.com%2F" + ((ILanguageService) C58725N2z.LIZIZ(ILanguageService.class)).getAppLanguage() + "%2Faccount-and-privacy%2Faccount-privacy-settings%2Fmaking-your-account-public-or-private";
                }
                o.LJI(str);
                SmartRouter.buildRoute(context2, str).open();
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                ds.setColor(LJIIIIZZ);
                T5S t5s = new T5S();
                t5s.LIZ(82);
                ds.setTypeface(t5s.getTypeface());
                ds.setUnderlineText(false);
            }
        }, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
        TextView textView = (TextView) c239209a8.LIZ.findViewById(R.id.l8z);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        textView.setHighlightColor(C04330Ez.LIZIZ(context, R.color.cz));
        View findViewById = c239209a8.LIZ.findViewById(R.id.l96);
        String str = C64707PaR.LIZJ;
        o.LJIIIIZZ(str, "getUserRegion()");
        Locale ROOT = Locale.ROOT;
        o.LJIIIIZZ(ROOT, "ROOT");
        String lowerCase = str.toLowerCase(ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!o.LJ(lowerCase, "fr")) {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((PrivateAccountUserSettingsApi) c239209a8.LIZLLL.getValue()).setPrivatePolicyShow("minor_private_policy_status", CardStruct.IStatusCode.DEFAULT).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9Dy
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.2PE
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ((Throwable) obj).getMessage();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView
    public final View LIZ(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.mu, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…t_tips, container, false)");
        return LLLLIILL;
    }
}
