package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopup;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupBodyLinkList;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupButton;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupResponse;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.net.URLEncoder;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Onl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62985Onl implements InterfaceC36824Ecm {
    public final Context LIZ;
    public final String LIZIZ;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 617));
    public final String LIZLLL = "v1";
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 618));
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final java.util.Map<String, String> LJIIIZ;

    public static void LIZLLL(String str) {
        ICompliancePolicyService LJII = a.LJII();
        if (LJII != null) {
            LJII.LIZ(new O0X(AGJ.CONSENT_BOX_ROW.getValue(), str, false, false, 28));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC36824Ecm
    public final C10K<UniversalPopupResponse> LIZ(int i) {
        String string;
        String str;
        List LJJIJIL;
        String str2 = (String) this.LIZJ.getValue();
        String str3 = this.LIZLLL;
        String str4 = (String) this.LJ.getValue();
        String str5 = this.LIZIZ;
        if (o.LJ(str5, "CO")) {
            string = this.LIZ.getString(R.string.due, this.LJFF, this.LJI);
        } else if (o.LJ(str5, "EU")) {
            string = this.LIZ.getString(R.string.duc, this.LJFF, this.LJI, this.LJII);
        } else {
            string = this.LIZ.getString(R.string.dud, this.LJFF, this.LJI);
        }
        o.LJIIIIZZ(string, "when (region) {\n        …cyPolicyString)\n        }");
        String LJJJJZ = ujb.o.LJJJJZ(ujb.o.LJJJJZ(ujb.o.LJJJJZ(string, this.LJFF, "%s", false), this.LJI, "%s", false), this.LJII, "%s", false);
        List LJJIJ = C47261Igj.LJJIJ(new UniversalPopupButton(this.LJIIIIZZ, new UniversalPopupAction("1", null, null, null, 0, Boolean.TRUE, null, true, null, null, 862, null), true, 0, 8, null));
        if (AGI.LIZ()) {
            str = null;
            LJJIJIL = C47261Igj.LJJIJIL(new UniversalPopupBodyLinkList(this.LJFF, new UniversalPopupAction("2", null, null, null, 0, null, null, false, C47261Igj.LJJIJ("terms-of-use"), null, 766, null)), new UniversalPopupBodyLinkList(this.LJI, new UniversalPopupAction("3", null, null, null, 0, null, null, false, C47261Igj.LJJIJ("privacy-policy"), null, 766, null)));
            LIZLLL("terms-of-use");
            LIZLLL("privacy-policy");
            if (o.LJ(this.LIZIZ, "EU")) {
                LJJIJIL.add(new UniversalPopupBodyLinkList(this.LJII, new UniversalPopupAction("4", null, null, null, 0, null, null, false, C47261Igj.LJJIJ("cookie-policy"), null, 766, null)));
                LIZLLL("cookie-policy");
            }
        } else {
            String str6 = this.LJFF;
            C8GI c8gi = C8GI.LINK_TYPE_INTERNAL;
            str = null;
            LJJIJIL = C47261Igj.LJJIJIL(new UniversalPopupBodyLinkList(str6, new UniversalPopupAction("2", LIZJ("terms-of-use"), c8gi.getValue(), null, 0, null, null, false, null, null, 1016, null)), new UniversalPopupBodyLinkList(this.LJI, new UniversalPopupAction("3", LIZJ("privacy-policy"), c8gi.getValue(), null, 0, null, null, false, null, null, 1016, null)));
            if (o.LJ(this.LIZIZ, "EU")) {
                LJJIJIL.add(new UniversalPopupBodyLinkList(this.LJII, new UniversalPopupAction("4", LIZJ("cookie-policy-eu"), c8gi.getValue(), null, 0, null, null, false, null, null, 1016, null)));
            }
        }
        C10K<UniversalPopupResponse> LJIIIZ = C10K.LJIIIZ(new UniversalPopupResponse(C47261Igj.LJJIJ(new UniversalPopup(str2, str3, str4, str, LJJJJZ, LJJIJ, str, str, LJJIJIL, str, str, this.LJIIIZ, 1736, str))));
        o.LJIIIIZZ(LJIIIZ, "forResult(response)");
        return LJIIIZ;
    }

    public final String LIZJ(String str) {
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://www.tiktok.com/in_app/redirect?region=");
        YE1.LIZLLL(LIZ, this.LIZIZ, "&language=", appLanguage, "&projectKey=");
        LIZ.append(str);
        return i0.LJFF("aweme://webview?url=", URLEncoder.encode(X1D.LIZIZ(LIZ), "UTF-8"));
    }

    public C62985Onl(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
        String string = context.getString(R.string.dua);
        o.LJIIIIZZ(string, "context.getString(R.stri…tbox_link_termsofservice)");
        this.LJFF = string;
        String string2 = context.getString(R.string.du_);
        o.LJIIIIZZ(string2, "context.getString(R.stri…ntbox_link_privacypolicy)");
        this.LJI = string2;
        String string3 = context.getString(R.string.du9);
        o.LJIIIIZZ(string3, "context.getString(R.stri…ntbox_link_cookiespolicy)");
        this.LJII = string3;
        String string4 = context.getString(R.string.dub);
        o.LJIIIIZZ(string4, "context.getString(R.stri…nsentbox_modal_world_btn)");
        this.LJIIIIZZ = string4;
        this.LJIIIZ = E2C.LIZJ("consentKey", EnumC62988Ono.DEVICE_CONSENT.getKey().LIZ);
    }

    @Override // X.InterfaceC36824Ecm
    public final C10K LIZIZ(int i, String business, java.util.Map map) {
        o.LJIIIZ(business, "business");
        C8GK.LIZ(a.LJIIL(), (String) this.LIZJ.getValue(), this.LIZLLL, "pop", null, 2, 0, Boolean.TRUE, null, 384);
        C10K LJIIIZ = C10K.LJIIIZ(C76800UCe.LIZ);
        o.LJIIIIZZ(LJIIIZ, "forResult(Unit)");
        return LJIIIZ;
    }
}
