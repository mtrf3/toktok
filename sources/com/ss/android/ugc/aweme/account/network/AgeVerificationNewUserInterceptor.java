package com.ss.android.ugc.aweme.account.network;

import X.C221108m2;
import X.C2U8;
import X.C62822Ol8;
import X.C64797Pbt;
import X.C77275UUl;
import X.F7S;
import X.FBZ;
import X.G52;
import X.G53;
import X.InterfaceC37216Ej6;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class AgeVerificationNewUserInterceptor implements InterfaceC37216Ej6 {
    public static final AgeVerificationNewUserInterceptor LJLIL = new AgeVerificationNewUserInterceptor();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(G52.LJLIL);
    public static final Set<String> LJLJI = C77275UUl.LJIIIIZZ("/passport/web/email/register_verify_login", "/passport/email/oauth_bind_register_or_login", "/passport/web/mobile_email_register", "/passport/mobile/sms_login", "/passport/employee/account/create", "/passport/web/sms_login", "/passport/carrier_auth/login_continue", "/passport/mobile/oauth_bind_register_or_login", "/passport/email/register/v2", "/passport/auth/login", "/passport/web/sms_login_continue", "/passport/email/register_verify_login", "/passport/mobile/sms_login_continue", "/passport/web/auth/login", "/passport/app/email/register/ticket_register", "/passport/web/email/register/ticket_register", "/passport/mobile/register", "/passport/web/auth/login_only", "/passport/auth/login_only", "/passport/web/mobile/bind_login", "/passport/auth/only_login", "/passport/web/email/quick_login", "/passport/web/email/register_verify", "/passport/web/email/register/v2", "/passport/username/register");

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        String path = UriProtector.parse(request.getUrl()).getPath();
        String str = "";
        if (path == null) {
            path = "";
        }
        C64797Pbt<?> LIZ = f7s.LIZ(request);
        String lowerCase = path.toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String LL = s.LL(lowerCase, '/');
        if (((Boolean) LJLILLLLZI.getValue()).booleanValue() && LJLJI.contains(LL)) {
            T t = LIZ.LIZIZ;
            o.LJII(t, "null cannot be cast to non-null type kotlin.String");
            try {
                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject((String) t), "data");
                if (o.LJ(JSONObjectProtectorUtils.getString(jSONObject, "new_user"), "1") && jSONObject.has("age_verification_type")) {
                    String string = JSONObjectProtectorUtils.getString(jSONObject, "age_verification_type");
                    o.LJIIIIZZ(string, "responseData.getString(\"age_verification_type\")");
                    str = string;
                }
            } catch (IOException unused) {
            }
            if (o.LJ(str, "1")) {
                C2U8.LIZ(new G53());
            }
        }
        return LIZ;
    }
}
