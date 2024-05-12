package com.ss.android.ugc.aweme.account.network;

import X.C188727au;
import X.C35870E5y;
import X.C64797Pbt;
import X.C64908Pdg;
import X.C77275UUl;
import X.F7S;
import X.FBZ;
import X.FMX;
import X.InterfaceC37216Ej6;
import X.YE1;
import com.bytedance.retrofit2.client.Request;
import defpackage.a1;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes7.dex */
public final class StoreRegionInterceptor implements InterfaceC37216Ej6 {
    public static final StoreRegionInterceptor LJLIL = new StoreRegionInterceptor();
    public static final Set<String> LJLILLLLZI = C77275UUl.LJIIIIZZ("/passport/mobile/send_code/v1", "/passport/mobile/send_voice_code", "/passport/mobile/sms_login_only", "/passport/user/check_email_registered", "/passport/password/check", "/passport/email/send_code", "/passport/email/check_code", "/passport/auth/login", "/passport/username/register", "/passport/mobile/register", "/passport/mobile/sms_login", "/passport/mobile/sms_login_continue", "/passport/email/register", "/passport/email/register/v2", "/passport/email/register_verify", "/passport/email/register_verify_login", "/passport/app/email/register/ticket_register", "/passport/totp/register", "/passport/login_name/register", "/tiktok/v1/calculate/age", "/aweme/v3/verification/age", "/passport/app/region", "/passport/auth/only_login", "/passport/auth/login_only", "/passport/mobile/can_send_voice_code", "/passport/app/region/register_region_list", "/passport/auth/get_nonce");

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        String path = request.getPath();
        o.LJIIIIZZ(path, "request.path");
        String lowerCase = path.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (LJLILLLLZI.contains(s.LL(lowerCase, '/'))) {
            String url = request.getUrl();
            String LJIILL = a.LIZIZ().LJIILL();
            if (LJIILL != null) {
                o.LJIIIIZZ(url, "url");
                if (s.LJJJLZIJ(url, "?", false)) {
                    url = a1.LJ(url, "&reg_store_region=", LJIILL);
                } else {
                    url = a1.LJ(url, "?reg_store_region=", LJIILL);
                }
            }
            if (C35870E5y.LIZ()) {
                int LJIILIIL = a.LIZIZ().LJIILIIL();
                o.LJIIIIZZ(url, "url");
                if (s.LJJJLZIJ(url, "?", false)) {
                    url = YE1.LIZIZ(url, "&user_selected_region=", LJIILIIL);
                } else {
                    url = YE1.LIZIZ(url, "?user_selected_region=", LJIILIIL);
                }
                C188727au c188727au = new C188727au();
                c188727au.LIZLLL(a.LIZIZ().LJIILIIL(), "source_client");
                FMX.LJIIL("sign_up_store_region_source_client", c188727au.LIZ);
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("source_api", a.LIZIZ().LJIIZILJ());
                FMX.LJIIL("sign_up_store_region_source_api", c188727au2.LIZ);
            }
            C64908Pdg newBuilder = request.newBuilder();
            newBuilder.LIZJ(url);
            return f7s.LIZ(newBuilder.LIZ());
        }
        return f7s.LIZ(request);
    }
}
