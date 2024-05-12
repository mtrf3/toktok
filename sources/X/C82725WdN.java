package X;

import com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login.IRuInstantLoginApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.WdN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82725WdN<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ C68322mC<String> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;

    public C82725WdN(C68322mC<String> c68322mC, String str, C68322mC<String> c68322mC2) {
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = str;
        this.LJLJI = c68322mC2;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object it) {
        o.LJIIIZ(it, "it");
        XJ3 xj3 = IRuInstantLoginApi.LIZ;
        String str = this.LJLIL.element;
        o.LJI(str);
        String mobile = this.LJLILLLLZI;
        String str2 = this.LJLJI.element;
        xj3.getClass();
        o.LJIIIZ(mobile, "mobile");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("vendor_id", str);
        linkedHashMap.put("mode", "si");
        linkedHashMap.put("mobile", mobile);
        if (C78685UuP.LJJJZ(str2)) {
            o.LJI(str2);
            linkedHashMap.put("other", str2);
        }
        return XJ3.LIZIZ.getSIToken(linkedHashMap);
    }
}
