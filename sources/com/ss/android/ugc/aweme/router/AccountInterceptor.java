package com.ss.android.ugc.aweme.router;

import X.C16880lQ;
import X.C47261Igj;
import X.C62712d9;
import X.C62905OmT;
import X.C62906OmU;
import X.C63144OqK;
import X.DialogInterfaceOnClickListenerC78619UtL;
import X.HG3;
import X.RBX;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AccountInterceptor implements IInterceptor {
    public final ArrayList<String> LJLIL = C47261Igj.LJII("mobile/phoneNumber", "password/change", "emailBind", "setAltLoginMethod");

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        Uri uri;
        Uri uri2;
        StringBuilder LIZ = X1D.LIZ();
        String str2 = null;
        if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
            str = uri2.getHost();
        } else {
            str = null;
        }
        LIZ.append(str);
        if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
            str2 = uri.getPath();
        }
        LIZ.append(str2);
        String LIZIZ = X1D.LIZIZ(LIZ);
        Iterator<String> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            String accountUrl = it.next();
            o.LJIIIIZZ(accountUrl, "accountUrl");
            if (ujb.o.LJJJLIIL(LIZIZ, accountUrl, false)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        String str11;
        Intent extra;
        Uri uri;
        Uri uri2;
        Uri uri3;
        Uri uri4;
        Uri uri5;
        Uri uri6;
        Uri uri7;
        Uri uri8;
        Uri uri9;
        String queryParameter;
        Uri uri10;
        Intent extra2;
        if (!(context instanceof Activity)) {
            return false;
        }
        String str12 = "";
        if (routeIntent == null || (((uri10 = routeIntent.getUri()) == null || (str = UriProtector.getQueryParameter(uri10, "enter_from")) == null) && ((extra2 = routeIntent.getExtra()) == null || (str = C16880lQ.LLJJIJIIJIL(extra2, "enterFrom")) == null))) {
            str = "";
        }
        if (routeIntent != null && (uri9 = routeIntent.getUri()) != null && (queryParameter = UriProtector.getQueryParameter(uri9, "enter_method")) != null) {
            str12 = queryParameter;
        }
        StringBuilder LIZ = X1D.LIZ();
        if (routeIntent != null && (uri8 = routeIntent.getUri()) != null) {
            str2 = uri8.getHost();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        if (routeIntent != null && (uri7 = routeIntent.getUri()) != null) {
            str3 = uri7.getPath();
        } else {
            str3 = null;
        }
        LIZ.append(str3);
        if (ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ), "setAltLoginMethod", false)) {
            HG3.LJFF().bindMobileOrEmailAndSetPwd((Activity) context, str, str12, null, null);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            if (routeIntent != null && (uri6 = routeIntent.getUri()) != null) {
                str4 = uri6.getHost();
            } else {
                str4 = null;
            }
            LIZ2.append(str4);
            if (routeIntent != null && (uri5 = routeIntent.getUri()) != null) {
                str5 = uri5.getPath();
            } else {
                str5 = null;
            }
            LIZ2.append(str5);
            if (ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ2), "mobile/phoneNumber", false)) {
                HG3.LJFF().bindMobile((Activity) context, str, str12, null, null);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                if (routeIntent != null && (uri4 = routeIntent.getUri()) != null) {
                    str6 = uri4.getHost();
                } else {
                    str6 = null;
                }
                LIZ3.append(str6);
                if (routeIntent != null && (uri3 = routeIntent.getUri()) != null) {
                    str7 = uri3.getPath();
                } else {
                    str7 = null;
                }
                LIZ3.append(str7);
                if (ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ3), "password/change", false)) {
                    HG3.LJIIL();
                    HG3.LJLJL.LJII().changePassword((Activity) context, str, str12, null, null);
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                        str8 = uri2.getHost();
                    } else {
                        str8 = null;
                    }
                    LIZ4.append(str8);
                    if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                        str9 = uri.getPath();
                    } else {
                        str9 = null;
                    }
                    LIZ4.append(str9);
                    if (ujb.o.LJJJLIIL(X1D.LIZIZ(LIZ4), "emailBind", false)) {
                        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                        if (routeIntent != null && (extra = routeIntent.getExtra()) != null) {
                            str10 = C16880lQ.LLJJIJIIJIL(extra, "enableSwitchPhone");
                        } else {
                            str10 = null;
                        }
                        if (ujb.o.LJJJJIZL(str10, "1", false) && !currentUser.isPhoneBinded()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Bundle bundle = new Bundle();
                        if (routeIntent != null && routeIntent.getExtra() != null) {
                            bundle.putBoolean("use_phone", z);
                        }
                        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                        if (curUser != null) {
                            str11 = curUser.getEmail();
                        } else {
                            str11 = null;
                        }
                        if (!TextUtils.isEmpty(str11) && ((RBX) HG3.LJIILL()).getCurUser().isEmailVerified()) {
                            C62905OmT c62905OmT = new C62905OmT(context);
                            c62905OmT.LJ(R.string.dsl);
                            Locale locale = Locale.US;
                            String string = context.getString(R.string.dsk);
                            o.LJIIIIZZ(string, "context.getString(R.stri…irm_change_email_message)");
                            c62905OmT.LIZJ = C63144OqK.LIZIZ(new Object[]{str11}, 1, locale, string, "format(locale, format, *args)");
                            c62905OmT.LJIIJ(R.string.ipo, new DialogInterfaceOnClickListenerC78619UtL(context, str, bundle));
                            c62905OmT.LJII(R.string.cg_, null);
                            new C62906OmU(c62905OmT).LIZLLL();
                        } else if (!TextUtils.isEmpty(str11)) {
                            HG3.LJFF().verifyEmail((Activity) context, str, bundle, null);
                        } else {
                            HG3.LJFF().bindEmail((Activity) context, str, str12, bundle, null);
                        }
                    }
                }
            }
        }
        return true;
    }
}
