package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XlJ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85765XlJ {
    public static final /* synthetic */ int LIZ = 0;

    public static C73517StF LIZ(String credentialCreationData, String webauthn_ticket) {
        o.LJIIIZ(credentialCreationData, "credentialCreationData");
        o.LJIIIZ(webauthn_ticket, "webauthn_ticket");
        HashMap hashMap = new HashMap();
        hashMap.put("entrance", "account_settings");
        hashMap.put("credential_creation_data", credentialCreationData);
        hashMap.put("webauthn_ticket", webauthn_ticket);
        return AbstractC73635Sv9.LJ(new R9V("/passport/fido2/finish_user_registration/", hashMap));
    }
}
