package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class R7H implements InterfaceC69035R7n {
    public final Context LIZ;

    public R7H(Context context) {
        this.LIZ = context;
    }

    public final void LJJIII(String str, AbstractC68941R3x abstractC68941R3x) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C78939UyV.LIZIZ("/passport/account/info/v2/");
        qqn.LIZJ(WM7.SCENE_SERVICE, str);
        if ("polling".equals(str)) {
            qqn.LIZJ("get_info_type", "1");
        }
        new R4U(context, qqn.LIZIZ(), abstractC68941R3x).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LIZ(String str, C93833mF c93833mF, R8H r8h) {
        Context context = this.LIZ;
        R7X r7x = new R7X(str, c93833mF);
        QQN qqn = new QQN();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(r7x.LJFF)) {
            hashMap.put("email", C38354F3m.LIZIZ(r7x.LJFF));
        }
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, r7x.LJI);
        qqn.LIZ = C1GE.LJII(C77412UZs.LJIJJLI("/passport/user/check_email_registered"), "");
        new R7M(context, qqn.LJFF(), r7x, r8h).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJI(String str, String str2, R96 r96) {
        QTV.LIZ = 3;
        QTV.LIZIZ = str;
        R97.LJIIJJI(this.LIZ, str, null, null, str2, r96).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIIIZ(String str, java.util.Map map, R8A r8a) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/password/check/");
        HashMap hashMap = new HashMap();
        hashMap.put("password", C38354F3m.LIZIZ(str));
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7S(context, qqn.LJFF(), r8a).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIIJJI(String str, String str2, R96 r96) {
        QTV.LIZ = 4;
        QTV.LIZIZ = str;
        R97.LJIIJJI(this.LIZ, null, str, null, str2, r96).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIILIIL(String str, java.util.Map map, R4C r4c) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/account/switch/");
        qqn.LIZJ("to_user_id", str);
        qqn.LIZLLL(map);
        new R4L(context, qqn.LJFF(), r4c).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIILL(String str, java.util.Map map, AbstractC69028R7g abstractC69028R7g) {
        Context context = this.LIZ;
        C69024R7c c69024R7c = new C69024R7c(str);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/password/set/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("captcha", null);
        }
        hashMap.put("password", C38354F3m.LIZIZ(str));
        hashMap.put("mix_mode", "1");
        hashMap.putAll(map);
        qqn.LIZLLL(hashMap);
        new R7R(context, qqn.LJFF(), c69024R7c, abstractC69028R7g).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIIZILJ(String str, String str2, R4O r4o) {
        QTV.LIZ = 5;
        QTV.LIZIZ = str;
        R97.LJIIJJI(this.LIZ, null, null, str, str2, r4o).LJIIIZ();
    }

    public final void LJJIIJ(String str, java.util.Map map, R4E r4e) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C78939UyV.LIZIZ("/passport/user/logout/");
        qqn.LIZJ("logout_from", str);
        qqn.LIZLLL(map);
        new C68968R4y(context, qqn.LJFF(), str, r4e).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LIZIZ(String str, int i, java.util.Map<String, String> map, R4N r4n) {
        R76.LJIIJJI(this.LIZ, str, i, null, -1, 0, null, null, map, r4n).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LIZJ(String str, String str2, java.util.Map map, R85 r85) {
        QTV.LIZ = 2;
        QTV.LIZIZ = str;
        Context context = this.LIZ;
        C69022R7a c69022R7a = new C69022R7a(str, str2);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/sms_login_only/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C38354F3m.LIZIZ(str));
        if (!TextUtils.isEmpty("")) {
            hashMap.put("captcha", "");
        }
        hashMap.put("code", C38354F3m.LIZIZ(String.valueOf(str2)));
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7J(context, qqn.LJFF(), c69022R7a, r85).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJFF(String str, int i, java.util.Map map, R88 r88) {
        Context context = this.LIZ;
        R7E r7e = new R7E(i, str);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/send_voice_code/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C38354F3m.LIZIZ(str));
        if (!TextUtils.isEmpty("")) {
            hashMap.put("old_mobile", C38354F3m.LIZIZ(""));
        }
        hashMap.put("captcha", "");
        hashMap.put("type", C38354F3m.LIZIZ(String.valueOf(i)));
        hashMap.put("unbind_exist", C38354F3m.LIZIZ(String.valueOf(0)));
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7G(context, qqn.LJFF(), r7e, r88).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJII(String str, String str2, java.util.Map map, R8M r8m) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C1GE.LJII(C77412UZs.LJIJJLI("/passport/password/reset_by_email_ticket/"), null);
        HashMap hashMap = new HashMap();
        hashMap.put("password", C38354F3m.LIZIZ(str));
        hashMap.put("ticket", str2);
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R53(context, qqn.LJFF(), "email", r8m).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIIJ(String str, String str2, java.util.Map map, R82 r82) {
        QTV.LIZ = 4;
        QTV.LIZIZ = str2;
        Context context = this.LIZ;
        R7V r7v = new R7V(str, str2);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/email/register/v2/");
        HashMap hashMap = new HashMap();
        hashMap.put("email", C38354F3m.LIZIZ(r7v.LJFF));
        if (!TextUtils.isEmpty(r7v.LJII)) {
            hashMap.put("code", C38354F3m.LIZIZ(r7v.LJII));
        }
        hashMap.put("password", C38354F3m.LIZIZ(r7v.LJI));
        if (!TextUtils.isEmpty(r7v.LJIIIIZZ)) {
            hashMap.put("recaptcha_token", r7v.LJIIIIZZ);
        }
        hashMap.put("mix_mode", "1");
        hashMap.put("fixed_mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7O(context, qqn.LJFF(), r7v, r82).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIJJLI(String str, String str2, java.util.Map map, C69047R7z c69047R7z) {
        QTV.LIZ = 5;
        QTV.LIZIZ = str;
        Context context = this.LIZ;
        C69023R7b c69023R7b = new C69023R7b(str, str2);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/username/register/");
        HashMap hashMap = new HashMap();
        hashMap.put("username", C38354F3m.LIZIZ(str));
        hashMap.put("password", C38354F3m.LIZIZ(str2));
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7Q(context, qqn.LJFF(), c69023R7b, c69047R7z).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIL(String str, String str2, java.util.Map map, R8G r8g) {
        QTV.LIZ = 4;
        QTV.LIZIZ = str;
        Context context = this.LIZ;
        R7U r7u = new R7U(str, str2, map);
        QQN qqn = new QQN();
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(r7u.LJFF)) {
            hashMap.put("email", C38354F3m.LIZIZ(r7u.LJFF));
        }
        hashMap.put("type", C38354F3m.LIZIZ(String.valueOf(r7u.LJII)));
        if (!TextUtils.isEmpty(r7u.LJI)) {
            hashMap.put("code", r7u.LJI);
        }
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, r7u.LJIIIIZZ);
        qqn.LIZ = C1GE.LJII(C77412UZs.LJIJJLI("/passport/email/register_verify_login/"), null);
        new R7K(context, qqn.LJFF(), r7u, r8g).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJJ(String str, String str2, java.util.Map map, R8B r8b) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/password/reset_by_ticket/");
        HashMap hashMap = new HashMap();
        hashMap.put("password", C38354F3m.LIZIZ(str));
        hashMap.put("ticket", C38354F3m.LIZIZ(str2));
        hashMap.put("mix_mode", "1");
        hashMap.putAll(map);
        qqn.LIZLLL(hashMap);
        new R53(context, qqn.LJFF(), "mobile", r8b).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJJI(int i, String str, java.util.Map map, R8I r8i) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/email/verify/");
        qqn.LIZJ("mix_mode", "1");
        qqn.LIZJ("type", C38354F3m.LIZIZ(String.valueOf(i)));
        qqn.LIZJ("code", C38354F3m.LIZIZ(str));
        qqn.LIZLLL(map);
        new C69031R7j(context, qqn.LJFF(), r8i).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJJIFFI(String str, String str2, java.util.Map map, R84 r84) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/password/update/");
        HashMap hashMap = new HashMap();
        hashMap.put("current_password", C38354F3m.LIZIZ(str));
        hashMap.put("password", C38354F3m.LIZIZ(str2));
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7T(context, qqn.LJFF(), r84).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJJII(String str, String str2, java.util.Map map, R83 r83) {
        QTV.LIZ = 2;
        QTV.LIZIZ = str;
        Context context = this.LIZ;
        R7Z r7z = new R7Z(str, str2);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/sms_login_continue/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C38354F3m.LIZIZ(str));
        hashMap.put("sms_code_key", C38354F3m.LIZIZ(String.valueOf(str2)));
        hashMap.put("mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7P(context, qqn.LJFF(), r7z, r83).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LIZLLL(String str, String str2, int i, java.util.Map map, R81 r81) {
        R7I.LJIIJJI(this.LIZ, str, str2, i, map, r81).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJ(String str, String str2, int i, java.util.Map map, R8L r8l) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/check_code/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C38354F3m.LIZIZ(str));
        hashMap.put("code", C38354F3m.LIZIZ(str2));
        hashMap.put("type", C38354F3m.LIZIZ(String.valueOf(i)));
        hashMap.put("mix_mode", "1");
        hashMap.put("fixed_mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7L(context, qqn.LJFF(), r8l).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIIIIZZ(String str, String str2, String str3, C1HQ c1hq, R8K r8k) {
        Context context = this.LIZ;
        R7W r7w = new R7W(str, str2, str3, c1hq);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/change/v1/");
        HashMap hashMap = new HashMap();
        hashMap.put("mobile", C38354F3m.LIZIZ(str));
        if (!TextUtils.isEmpty("")) {
            hashMap.put("captcha", "");
        }
        hashMap.put("code", C38354F3m.LIZIZ(str2));
        hashMap.put("mix_mode", "1");
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("ticket", str3);
        }
        qqn.LJ(hashMap, c1hq);
        new R7N(context, qqn.LJFF(), r7w, r8k).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIJ(String str, String str2, int i, java.util.Map map, R8N r8n) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C1GE.LJII(C77412UZs.LJIJJLI("/passport/email/check_code/"), null);
        HashMap hashMap = new HashMap();
        hashMap.put("email", C38354F3m.LIZIZ(str));
        hashMap.put("code", C38354F3m.LIZIZ(str2));
        hashMap.put("type", C38354F3m.LIZIZ(String.valueOf(i)));
        hashMap.put("mix_mode", "1");
        hashMap.put("fixed_mix_mode", "1");
        qqn.LJ(hashMap, map);
        new R7L(context, qqn.LJFF(), r8n).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIJJ(String str, String str2, String str3, java.util.Map map, R8O r8o) {
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/account/verify/");
        HashMap LIZJ = C03660Ck.LIZJ("mix_mode", "1");
        if (!TextUtils.isEmpty(null)) {
            LIZJ.put("username", C38354F3m.LIZIZ(null));
        }
        if (!TextUtils.isEmpty(str)) {
            LIZJ.put("mobile", C38354F3m.LIZIZ(str));
        }
        if (!TextUtils.isEmpty(null)) {
            LIZJ.put("email", C38354F3m.LIZIZ(null));
        }
        if (!TextUtils.isEmpty(str2)) {
            LIZJ.put("password", C38354F3m.LIZIZ(str2));
        }
        if (!TextUtils.isEmpty(str3)) {
            LIZJ.put("verify_ticket", str3);
        }
        qqn.LJ(LIZJ, map);
        new C69029R7h(context, qqn.LJFF(), r8o).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIIL(String str, int i, int i2, String str2, java.util.Map map, AbstractC68940R3w abstractC68940R3w) {
        Context context = this.LIZ;
        C69012R6q c69012R6q = new C69012R6q(i, i2, str, str2);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/validate_code/v1/");
        qqn.LJ(C69013R6r.LJIIJJI(c69012R6q), map);
        new C69013R6r(context, qqn.LJFF(), c69012R6q, abstractC68940R3w).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIJI(String str, String str2, int i, int i2, java.util.Map map, R81 r81) {
        Context context = this.LIZ;
        map.put("email_logic_type", String.valueOf(i2));
        R7I.LJIIJJI(context, str, str2, i, map, r81).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIILJJIL(String str, boolean z, String str2, Integer num, Long l, String str3, java.util.Map map, C68939R3v c68939R3v) {
        String str4;
        QTV.LIZ = 7;
        QTV.LIZIZ = null;
        Context context = this.LIZ;
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/device/one_login/");
        HashMap hashMap = new HashMap();
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("encrypted", str4);
        hashMap.put("mix_mode", "1");
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                hashMap.put("sec_user_id", str);
            } else {
                hashMap.put("user_id", str);
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("d_ticket", C38354F3m.LIZIZ(str2));
        }
        if (num != null) {
            hashMap.put("last_login_way", String.valueOf(num));
        }
        if (l != null) {
            hashMap.put("last_login_time", String.valueOf(l));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("last_login_platform", str3);
        }
        qqn.LJ(hashMap, map);
        new R50(context, qqn.LIZIZ(), c68939R3v).LJIIIZ();
    }

    @Override // X.InterfaceC69035R7n
    public final void LJIILLIIL(String str, int i, String str2, int i2, int i3, String str3, String str4, java.util.Map map, R4M r4m) {
        R76.LJIIJJI(this.LIZ, str, i, str2, i2, i3, str3, str4, map, r4m).LJIIIZ();
    }
}
