package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9D<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ Fragment LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ java.util.Map<String, String> LJI;
    public final /* synthetic */ EnumC69116RAq LJII;
    public final /* synthetic */ EnumC69113RAn LJIIIIZZ;

    public R9D(Fragment fragment, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, InterfaceC69056R8i interfaceC69056R8i, String str, String str2, String str3, java.util.Map map, boolean z) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = fragment;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = map;
        this.LJII = enumC69116RAq;
        this.LJIIIIZZ = enumC69113RAn;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C1JD.LJJIIJZLJL(this.LIZ.q9().LJJLIIIJJI(), "mobile", this.LIZ.Hg(), this.LIZ.q9().LJJLIIIJLLLLLLLZ(), this.LIZIZ);
        R9K r9k = new R9K(c73516StE, this.LJII, this.LJIIIIZZ);
        this.LIZ.bi(r9k);
        if (this.LIZJ) {
            Context requireContext = this.LIZLLL.requireContext();
            o.LJIIIIZZ(requireContext, "fragment.requireContext()");
            String mobile = this.LJ;
            String code = this.LJFF;
            int LJJIIZI = C78966Uyw.LJJIIZI(this.LIZLLL, this.LIZ);
            o.LJIIIZ(mobile, "mobile");
            o.LJIIIZ(code, "code");
            R9Z r9z = new R9Z(mobile, code, "", "");
            QQN qqn = new QQN();
            qqn.LIZ = "/passport/mobile/bind_with_change_password/";
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty("")) {
                hashMap.put("captcha", "");
            }
            String LIZIZ = C38354F3m.LIZIZ(code);
            o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.mCode)");
            hashMap.put("code", LIZIZ);
            String LIZIZ2 = C38354F3m.LIZIZ(mobile);
            o.LJIIIIZZ(LIZIZ2, "encryptWithXor(queryObj.mMobile)");
            hashMap.put("mobile", LIZIZ2);
            if (!TextUtils.isEmpty("")) {
                String LIZIZ3 = C38354F3m.LIZIZ("");
                o.LJIIIIZZ(LIZIZ3, "encryptWithXor(queryObj.mPassword)");
                hashMap.put("password", LIZIZ3);
            }
            String LIZIZ4 = C38354F3m.LIZIZ(String.valueOf(0));
            o.LJIIIIZZ(LIZIZ4, "encryptWithXor(queryObj.mUnbindExist.toString())");
            hashMap.put("unbind_exist", LIZIZ4);
            hashMap.put("mix_mode", "1");
            qqn.LIZLLL(hashMap);
            qqn.LIZJ("phone_number_source", String.valueOf(LJJIIZI));
            new R9G(requireContext, qqn.LJFF(), r9z, r9k).LJIIIZ();
            return;
        }
        QQN qqn2 = new QQN();
        qqn2.LIZ = C77412UZs.LJIJJLI("/passport/mobile/bind/v1/");
        qqn2.LIZJ("mobile", C38354F3m.LIZIZ(this.LJ));
        qqn2.LIZJ("code", C38354F3m.LIZIZ(this.LJFF));
        qqn2.LIZJ("unbind_exist", C38354F3m.LIZIZ(CardStruct.IStatusCode.DEFAULT));
        qqn2.LIZJ("phone_number_source", String.valueOf(C78966Uyw.LJJIIZI(this.LIZLLL, this.LIZ)));
        qqn2.LIZJ("mix_mode", "1");
        java.util.Map<String, String> map = this.LJI;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                qqn2.LIZJ(entry.getKey(), entry.getValue());
            }
        }
        new R9H(this.LIZLLL.requireContext(), qqn2.LJFF(), new R9Z(this.LJ, this.LJFF, null, null), r9k).LJIIIZ();
    }
}
