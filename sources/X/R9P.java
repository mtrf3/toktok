package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9P<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ String LJII;

    public R9P(Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = fragment;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        String str;
        C1JD.LJJIIJZLJL(this.LIZ.q9().LJJLIIIJJI(), "email", null, this.LIZ.q9().LJJLIIIJLLLLLLLZ(), null);
        R9J r9j = new R9J(c73516StE, this.LIZ, this.LJFF, this.LJI, this.LJII);
        this.LIZ.bi(r9j);
        Context requireContext = this.LIZIZ.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        String email = this.LIZJ;
        String code = this.LIZLLL;
        boolean z = this.LJ;
        int LJJIIJZLJL = C78966Uyw.LJJIIJZLJL(this.LIZIZ, this.LIZ);
        o.LJIIIZ(email, "email");
        o.LJIIIZ(code, "code");
        R9W r9w = new R9W(email, code);
        QQN qqn = new QQN();
        if (z) {
            str = "/passport/email/bind_with_change_password/";
        } else {
            str = "/passport/email/bind/";
        }
        qqn.LIZ = str;
        HashMap hashMap = new HashMap();
        String LIZIZ = C38354F3m.LIZIZ(email);
        o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.email)");
        hashMap.put("email", LIZIZ);
        String LIZIZ2 = C38354F3m.LIZIZ(code);
        o.LJIIIIZZ(LIZIZ2, "encryptWithXor(queryObj.code)");
        hashMap.put("code", LIZIZ2);
        hashMap.put("mix_mode", "1");
        qqn.LIZLLL(hashMap);
        qqn.LIZJ("email_source", String.valueOf(LJJIIJZLJL));
        new R9O(requireContext, qqn.LJFF(), r9w, r9j).LJIIIZ();
    }
}
