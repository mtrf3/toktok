package X;

import android.os.SystemClock;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import tikcast.api.wallet.tiktok.QueryOrderResult;

/* renamed from: X.Uf0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77730Uf0<T> implements InterfaceC64592gB {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC77737Uf7 LJLJJL;

    public C77730Uf0(long j, String str, String str2, int i, InterfaceC77737Uf7 interfaceC77737Uf7) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC77737Uf7;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        QueryOrderResult response = (QueryOrderResult) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(SystemClock.uptimeMillis() - this.LJLIL));
        hashMap.put("productId", this.LJLILLLLZI);
        hashMap.put("orderId", this.LJLJI);
        C78609UtB.LJJJJZI("ttlive_wallet_check_order", hashMap);
        hashMap.put("is_subscription", Boolean.FALSE);
        C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_check_order_success", C38393F4z.LIZLLL(hashMap), 56);
        long uptimeMillis = SystemClock.uptimeMillis() - this.LJLIL;
        if (C77640UdY.LIZ) {
            C77640UdY.LJIIIIZZ = uptimeMillis;
        }
        C77613Ud7 c77613Ud7 = new C77613Ud7(this.LJLJJI, this.LJLILLLLZI, this.LJLJI, 8);
        InterfaceC77647Udf LIZLLL = C77607Ud1.LIZLLL();
        String str = this.LJLJI;
        o.LJIIIIZZ(response, "response");
        LIZLLL.LIZ(str, response);
        C77731Uf1.LJIIL(this.LJLJJL, 3, new C31556Ca0(3, null, null, c77613Ud7, null, null, null, null, 246));
    }
}
