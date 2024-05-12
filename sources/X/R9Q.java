package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9Q<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ boolean LJFF;
    public final /* synthetic */ java.util.Map<String, String> LJI;

    public R9Q(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, java.util.Map map, boolean z) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = fragment;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = map;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        String str;
        R9I r9i = new R9I(this.LIZ, c73516StE);
        this.LIZ.bi(r9i);
        Context requireContext = this.LIZIZ.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        String code = this.LIZJ;
        String email = this.LIZLLL;
        String ticket = this.LJ;
        boolean z = this.LJFF;
        int LJJIIJZLJL = C78966Uyw.LJJIIJZLJL(this.LIZIZ, this.LIZ);
        java.util.Map<String, String> map = this.LJI;
        o.LJIIIZ(code, "code");
        o.LJIIIZ(email, "email");
        o.LJIIIZ(ticket, "ticket");
        R9X r9x = new R9X(code, email, ticket);
        QQN qqn = new QQN();
        if (z) {
            str = "/passport/email/change_with_update_password/";
        } else {
            str = "/passport/email/change/";
        }
        qqn.LIZ = str;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(ticket)) {
            hashMap.put("ticket", ticket);
        }
        String LIZIZ = C38354F3m.LIZIZ(code);
        o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.code)");
        hashMap.put("code", LIZIZ);
        hashMap.put("mix_mode", "1");
        String LIZIZ2 = C38354F3m.LIZIZ(email);
        o.LJIIIIZZ(LIZIZ2, "encryptWithXor(queryObj.email)");
        hashMap.put("email", LIZIZ2);
        String LIZIZ3 = C38354F3m.LIZIZ("6");
        o.LJIIIIZZ(LIZIZ3, "encryptWithXor(IEmailSen…_EMAIL_VERIFY.toString())");
        hashMap.put("type", LIZIZ3);
        if (map != null) {
            hashMap.putAll(map);
        }
        qqn.LIZLLL(hashMap);
        qqn.LIZJ("email_source", String.valueOf(LJJIIJZLJL));
        new R9R(requireContext, qqn.LJFF(), r9x, r9i).LJIIIZ();
    }
}
