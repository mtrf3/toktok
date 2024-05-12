package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9C<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ EnumC69116RAq LJ;
    public final /* synthetic */ EnumC69113RAn LJFF;

    public R9C(Fragment fragment, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, InterfaceC69056R8i interfaceC69056R8i, String str, String str2) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = fragment;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = enumC69116RAq;
        this.LJFF = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R9B r9b = new R9B(c73516StE, this.LJ, this.LJFF);
        this.LIZ.bi(r9b);
        Context requireContext = this.LIZIZ.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        String str = this.LIZJ;
        String code = this.LIZLLL;
        o.LJIIIZ(code, "code");
        C69074R9a c69074R9a = new C69074R9a(code);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("")) {
            String LIZIZ = C38354F3m.LIZIZ("");
            o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.mMobile)");
            hashMap.put("mobile", LIZIZ);
        }
        if (!TextUtils.isEmpty("")) {
            hashMap.put("captcha", "");
        }
        String LIZIZ2 = C38354F3m.LIZIZ(code);
        o.LJIIIIZZ(LIZIZ2, "encryptWithXor(queryObj.mCode.toString())");
        hashMap.put("code", LIZIZ2);
        hashMap.put("mix_mode", "1");
        if (str != null) {
            hashMap.put("not_login_ticket", str);
        }
        java.util.Map LJIIIIZZ = C69093R9t.LJIIIIZZ();
        if (!((HashMap) LJIIIIZZ).isEmpty()) {
            C113554cx.LJJLIIIJILLIZJL(hashMap, LJIIIIZZ);
        }
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/mobile/sms_login/");
        qqn.LIZLLL(hashMap);
        qqn.LIZ();
        new R9F(requireContext, qqn.LJFF(), c69074R9a, r9b).LJIIIZ();
    }
}
