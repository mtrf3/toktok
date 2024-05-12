package X;

import com.bytedance.android.live.walletnew.BaseRechargeViewModel;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ucf, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77585Ucf<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ BaseRechargeViewModel LJLILLLLZI;
    public final /* synthetic */ HashMap<String, Object> LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ InterfaceC77685UeH LJLJJL;

    public C77585Ucf(boolean z, BaseRechargeViewModel baseRechargeViewModel, HashMap hashMap, long j, EnumC77641UdZ enumC77641UdZ) {
        this.LJLIL = z;
        this.LJLILLLLZI = baseRechargeViewModel;
        this.LJLJI = hashMap;
        this.LJLJJI = j;
        this.LJLJJL = enumC77641UdZ;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        Throwable it = (Throwable) obj;
        o.LJIIIZ(it, "it");
        if (this.LJLIL) {
            C77626UdK LIZ = C77607Ud1.LIZJ().LIZ(C67702lC.LIZ(this.LJLILLLLZI.LJLJJI));
            if (LIZ != null) {
                this.LJLJI.put("cost", Long.valueOf(System.currentTimeMillis() - this.LJLJJI));
                this.LJLJI.put("error_msg", it.toString());
                this.LJLJI.put("use_fallback_cache", 1);
                this.LJLJI.put("cache_policy", this.LJLJJL.toString());
                this.LJLJI.put("hit_cache", 1);
                InterfaceC11100c6.LIZ.getClass();
                C11090c5.LIZ().LIZJ(InterfaceC77675Ue7.class, new C77702UeY());
                UIO.LIZ("ttlive_wallet_recharge_panel_use_fallback_cache", this.LJLJI);
                HashMap<String, Object> logMap = this.LJLJI;
                o.LJIIIZ(logMap, "logMap");
                C77744UfE.LIZ(C77739Uf9.LIZ, EnumC77742UfC.BOTH, "livesdk_wallet_recharge_panel_load_package_success", C38393F4z.LIZLLL(logMap), 56);
                C77629UdN.LJIIL = true;
                return LIZ;
            }
            throw it;
        }
        throw it;
    }
}
