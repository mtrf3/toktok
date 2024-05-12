package com.ss.android.ugc.aweme.commercialize.im;

import X.AnonymousClass446;
import X.C45804HyK;
import X.C99023uc;
import X.EF7;
import X.HG3;
import X.InterfaceC61208O0m;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.route.BaseRoute;
import defpackage.m0;
import ujb.o;

/* loaded from: classes10.dex */
public final class OpenChatExt extends BaseRoute implements InterfaceC61208O0m {
    public static final OpenChatExt LJLIL = new OpenChatExt();

    public static final boolean LIZIZ(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        Uri parse = UriProtector.parse(str);
        String str3 = null;
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (!o.LJJJJIZL("chatting", str2, true)) {
            return false;
        }
        if (parse != null) {
            str3 = parse.getPath();
        }
        if (!o.LJJJJIZL("/message", str3, true)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.route.IRoute
    public final void open(Context context) {
        Activity activity;
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        kotlin.jvm.internal.o.LJI(activity);
        LIZ(activity, getUrl());
    }

    @Override // X.InterfaceC61208O0m
    public final boolean open(String str) {
        return LIZ(null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.content.Context] */
    @Override // X.InterfaceC61208O0m
    public final boolean LIZ(Activity activity, String str) {
        AnonymousClass446 anonymousClass446;
        if (str == null || str.length() == 0) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = EF7.LIZIZ();
        }
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "uri");
        if (!o.LJJJJIZL("chatting", uri.getHost(), true) || !o.LJJJJIZL("/message", uri.getPath(), true)) {
            return false;
        }
        String queryParameter = UriProtector.getQueryParameter(uri, "uid");
        String queryParameter2 = UriProtector.getQueryParameter(uri, "ext");
        LJLIL.getClass();
        String queryParameter3 = UriProtector.getQueryParameter(uri, "cid");
        String queryParameter4 = UriProtector.getQueryParameter(uri, "log_extra");
        if (queryParameter3 == null || queryParameter3.length() == 0) {
            anonymousClass446 = null;
        } else {
            anonymousClass446 = new AnonymousClass446(queryParameter4, queryParameter3);
        }
        LIZJ(activity2, queryParameter, queryParameter2, anonymousClass446);
        return true;
    }

    public static final void LIZJ(Context context, String str, String str2, AnonymousClass446 anonymousClass446) {
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        if (((RBX) HG3.LJIILL()).isLogin()) {
            new C99023uc(context, str, str2).LIZIZ();
            return;
        }
        SmartRoute LIZ = m0.LIZ(context, "//main/im/check_login", "extra_uid", str, "extra_ext", str2);
        LIZ.withParam("extra_imadlog", anonymousClass446);
        LIZ.open();
    }
}
