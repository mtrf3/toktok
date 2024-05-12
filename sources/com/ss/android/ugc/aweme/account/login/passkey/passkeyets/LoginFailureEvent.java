package com.ss.android.ugc.aweme.account.login.passkey.passkeyets;

import X.AbstractC63695OzD;
import X.C113554cx;
import X.C214578bV;
import X.C65352Pkq;
import X.InterfaceC54035LIp;
import X.OSZ;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LoginFailureEvent extends AbstractC63695OzD {
    public final Map<String, C214578bV> LJII;

    public LoginFailureEvent() {
        super("login_failure");
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        Class cls = Integer.TYPE;
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        C65352Pkq.LIZ(String.class);
        C65352Pkq.LIZ(cls);
        this.LJII = C113554cx.LJJL(new OSZ("auth_app", new C214578bV(false, null, null, false)), new OSZ("carrier", new C214578bV(false, null, null, false)), new OSZ("channel", new C214578bV(false, null, null, false)), new OSZ("encouraged_platform", new C214578bV(true, null, null, false)), new OSZ("enter_from", new C214578bV(false, null, null, false)), new OSZ("enter_method", new C214578bV(false, null, null, false)), new OSZ("enter_type", new C214578bV(false, null, null, false)), new OSZ("error_code", new C214578bV(false, null, null, false)), new OSZ("error_desc", new C214578bV(false, null, null, false)), new OSZ("gms_auto_fill", new C214578bV(false, null, null, false)), new OSZ("has_flow_changed", new C214578bV(false, null, null, false)), new OSZ("is_ab_backend_resp_received", new C214578bV(false, null, null, false)), new OSZ("is_apple_error", new C214578bV(false, null, null, false)), new OSZ("is_express_login", new C214578bV(false, null, null, false)), new OSZ("is_forced_login_required", new C214578bV(true, null, null, false)), new OSZ("is_in_personalized_nuj", new C214578bV(true, null, null, false)), new OSZ("is_register", new C214578bV(false, null, null, false)), new OSZ("is_resume", new C214578bV(true, null, null, false)), new OSZ("login_last_platform", new C214578bV(false, null, null, false)), new OSZ("login_last_platform_trust", new C214578bV(false, null, null, false)), new OSZ("login_last_time", new C214578bV(false, null, null, false)), new OSZ("login_panel_type", new C214578bV(false, null, null, false)), new OSZ("migrated_type", new C214578bV(true, null, null, false)), new OSZ("mp_id", new C214578bV(false, null, null, false)), new OSZ("order", new C214578bV(false, null, null, false)), new OSZ("params_for_special", new C214578bV(false, null, null, false)), new OSZ("platform", new C214578bV(false, null, null, false)), new OSZ("prev_login_platform", new C214578bV(true, null, null, false)), new OSZ("show_user_cnt", new C214578bV(false, null, null, false)), new OSZ("stay_time", new C214578bV(false, null, null, false)), new OSZ("token_authorized_label", new C214578bV(true, null, null, false)), new OSZ("trigger", new C214578bV(false, null, null, false)), new OSZ("trust_one_click_is_show", new C214578bV(false, null, null, false)), new OSZ("user_detail", new C214578bV(false, null, null, false)));
    }

    @Override // X.AbstractC63695OzD
    public final Map<String, C214578bV> LIZIZ() {
        return this.LJII;
    }

    @Override // X.AbstractC63695OzD
    public final AbstractC63695OzD LJ(InterfaceC54035LIp group) {
        o.LJIIIZ(group, "group");
        LIZ().add(group);
        return this;
    }
}
