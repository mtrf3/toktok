package X;

import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.util.HashMap;

/* renamed from: X.R8d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69051R8d<T> implements InterfaceC73518StG {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ java.util.Map<String, String> LIZJ;
    public final /* synthetic */ InterfaceC69056R8i LIZLLL;

    public C69051R8d(String str, String str2, java.util.Map map, BaseAccountFlowFragment baseAccountFlowFragment) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = baseAccountFlowFragment;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C69050R8c c69050R8c = new C69050R8c(this.LIZLLL, c73516StE);
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
        C78886Uxe.LJIILJJIL().LIZIZ("/passport/mobile/mobile_reused_login/", hashMap, c69050R8c);
    }
}
