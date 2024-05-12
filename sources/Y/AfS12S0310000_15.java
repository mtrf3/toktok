package Y;

import X.C116694i1;
import X.C45804HyK;
import X.C68922R3e;
import X.C85756XlA;
import X.C85761XlF;
import X.C85766XlK;
import X.C85768XlM;
import X.C85769XlN;
import X.C85772XlQ;
import X.EnumC85762XlG;
import X.EnumC85764XlI;
import X.InterfaceC64592gB;
import X.InterfaceC85767XlL;
import X.OAF;
import android.app.Activity;
import com.bytedance.awemelobby.LobbyNonceGenerator;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.google.gson.s;
import com.ss.android.ugc.aweme.account.login.passkey.PassKeyRegistrationRequest;
import com.ss.android.ugc.aweme.account.login.passkey.PasskeyService;
import com.ss.android.ugc.aweme.account.login.passkey.passkeyets.RespondSetPasskeyInfoEvent;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;
import org.json.JSONException;

/* loaded from: classes16.dex */
public class AfS12S0310000_15 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS12S0310000_15 afS12S0310000_15, Object obj) {
        C68922R3e c68922R3e = (C68922R3e) obj;
        try {
            String ticket = JSONObjectProtectorUtils.getString(c68922R3e.LJIILJJIL, "webauthn_ticket");
            c68922R3e.LJIILJJIL.remove("webauthn_ticket");
            PasskeyService.LIZ = null;
            if (afS12S0310000_15.z3) {
                PasskeyService passkeyService = (PasskeyService) afS12S0310000_15.l0;
                Activity activity = (Activity) afS12S0310000_15.l1;
                String jSONObject = c68922R3e.LJIILJJIL.toString();
                o.LJIIIIZZ(jSONObject, "it.data.toString()");
                o.LJIIIIZZ(ticket, "ticket");
                passkeyService.LJII(activity, jSONObject, ticket, (InterfaceC85767XlL) afS12S0310000_15.l2);
            } else {
                PasskeyService passkeyService2 = (PasskeyService) afS12S0310000_15.l0;
                Activity activity2 = (Activity) afS12S0310000_15.l1;
                String jSONObject2 = c68922R3e.LJIILJJIL.toString();
                o.LJIIIIZZ(jSONObject2, "it.data.toString()");
                o.LJIIIIZZ(ticket, "ticket");
                InterfaceC85767XlL interfaceC85767XlL = (InterfaceC85767XlL) afS12S0310000_15.l2;
                passkeyService2.getClass();
                LobbyNonceGenerator.LIZIZ().LIZ(new C85769XlN(passkeyService2, activity2, jSONObject2, ticket, interfaceC85767XlL));
            }
        } catch (JSONException unused) {
            C85766XlK.LIZ((InterfaceC85767XlL) afS12S0310000_15.l2, new C85772XlQ(EnumC85762XlG.PASSKEY_LOGIN_JSON_EXCEPTION.getErrorCode()), false, null, 12);
        }
    }

    public static final void accept$1(AfS12S0310000_15 afS12S0310000_15, Object obj) {
        C68922R3e c68922R3e = (C68922R3e) obj;
        try {
            PassKeyRegistrationRequest passKeyRegistrationRequest = (PassKeyRegistrationRequest) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), c68922R3e.LJIILJJIL.toString(), PassKeyRegistrationRequest.class);
            String str = passKeyRegistrationRequest.webauthnTicket;
            boolean z = passKeyRegistrationRequest.userExists;
            c68922R3e.LJIILJJIL.remove("webauthn_ticket");
            c68922R3e.LJIILJJIL.remove("user_exists");
            String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), passKeyRegistrationRequest);
            json.toString();
            if (z) {
                PasskeyPopUpHelper.LJ().LIZ();
                if (!afS12S0310000_15.z3) {
                    RespondSetPasskeyInfoEvent respondSetPasskeyInfoEvent = new RespondSetPasskeyInfoEvent();
                    respondSetPasskeyInfoEvent.LJI();
                    respondSetPasskeyInfoEvent.LJII();
                    respondSetPasskeyInfoEvent.LIZLLL(1, "result");
                    respondSetPasskeyInfoEvent.LIZLLL(1, "is_key_set");
                    respondSetPasskeyInfoEvent.LJFF();
                    ((PasskeyService) afS12S0310000_15.l0).LJIIIIZZ((Activity) afS12S0310000_15.l1, json, str, (InterfaceC85767XlL) afS12S0310000_15.l2);
                }
            } else if (afS12S0310000_15.z3) {
                if (!o.LJ(C116694i1.LIZ(C45804HyK.LJJIFFI((Activity) afS12S0310000_15.l1)).nv0(), "USER")) {
                    C85766XlK.LIZ((InterfaceC85767XlL) afS12S0310000_15.l2, new C85772XlQ(EnumC85764XlI.PASSKEY_REGISTRATION_NOT_ON_PROFILE.getErrorCode()), true, null, 12);
                } else {
                    Activity activity = (Activity) afS12S0310000_15.l1;
                    PopupManager.LJIIL(new C85756XlA(activity, (InterfaceC85767XlL) afS12S0310000_15.l2, new C85768XlM((PasskeyService) afS12S0310000_15.l0, activity, json, str)));
                }
            } else {
                RespondSetPasskeyInfoEvent respondSetPasskeyInfoEvent2 = new RespondSetPasskeyInfoEvent();
                respondSetPasskeyInfoEvent2.LJI();
                respondSetPasskeyInfoEvent2.LJII();
                respondSetPasskeyInfoEvent2.LIZLLL(1, "result");
                respondSetPasskeyInfoEvent2.LIZLLL(0, "is_key_set");
                respondSetPasskeyInfoEvent2.LJFF();
                PasskeyService passkeyService = (PasskeyService) afS12S0310000_15.l0;
                Activity activity2 = (Activity) afS12S0310000_15.l1;
                InterfaceC85767XlL interfaceC85767XlL = (InterfaceC85767XlL) afS12S0310000_15.l2;
                passkeyService.getClass();
                PasskeyService.LJI(activity2, json, str, true, false, true, interfaceC85767XlL);
            }
        } catch (s e) {
            RespondSetPasskeyInfoEvent respondSetPasskeyInfoEvent3 = new RespondSetPasskeyInfoEvent();
            respondSetPasskeyInfoEvent3.LJI();
            respondSetPasskeyInfoEvent3.LJII();
            respondSetPasskeyInfoEvent3.LIZLLL(1, "result");
            respondSetPasskeyInfoEvent3.LIZLLL(0, "is_key_set");
            respondSetPasskeyInfoEvent3.LJFF();
            C85761XlF.LJII(OAF.LIZIZ((Activity) afS12S0310000_15.l1), afS12S0310000_15.z3, null, EnumC85764XlI.PASSKEY_REGISTRATION_JSON_EXCEPTION.getErrorCode());
            C85766XlK.LIZ((InterfaceC85767XlL) afS12S0310000_15.l2, e, false, null, 12);
        }
    }

    public AfS12S0310000_15(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.z3 = z;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
