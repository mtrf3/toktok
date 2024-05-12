package X;

import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneNumRecycleProcessFragment;
import java.util.HashMap;

/* renamed from: X.R8g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69054R8g<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZJ = null;
    public final /* synthetic */ InterfaceC69056R8i LIZLLL;

    public C69054R8g(String str, String str2, PhoneNumRecycleProcessFragment phoneNumRecycleProcessFragment) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZLLL = phoneNumRecycleProcessFragment;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C69052R8e c69052R8e = new C69052R8e(this.LIZLLL, c73516StE);
        HashMap hashMap = new HashMap();
        String str = this.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("sms_code_key", C38354F3m.LIZIZ(str));
        String str3 = this.LIZIZ;
        if (str3 != null) {
            str2 = str3;
        }
        hashMap.put("mobile", C38354F3m.LIZIZ(str2));
        hashMap.put("mix_mode", "1");
        hashMap.putAll(C69093R9t.LJIIIIZZ());
        java.util.Map<String, String> map = this.LIZJ;
        if (map != null) {
            hashMap.putAll(map);
        }
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/mobile/origin_mobile_login/", hashMap, c69052R8e);
    }
}
