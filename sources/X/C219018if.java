package X;

import android.util.SparseArray;
import com.ss.android.ugc.tiktok.addyours.service.PerformanceServiceImpl;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.service.PerformanceServiceImpl$end$1", f = "PerformanceServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219018if extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PerformanceServiceImpl LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ SparseArray<C123134sP> LJLJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219018if(PerformanceServiceImpl performanceServiceImpl, int i, SparseArray<C123134sP> sparseArray, java.util.Map<String, Object> map, boolean z, InterfaceC67352kd<? super C219018if> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = performanceServiceImpl;
        this.LJLILLLLZI = i;
        this.LJLJI = sparseArray;
        this.LJLJJI = map;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219018if(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            PerformanceServiceImpl performanceServiceImpl = this.LJLIL;
            int i = this.LJLILLLLZI;
            SparseArray<C123134sP> sparseArray = this.LJLJI;
            java.util.Map<String, Object> map = this.LJLJJI;
            boolean z = this.LJLJJL;
            performanceServiceImpl.getClass();
            PerformanceServiceImpl.LJ(i, sparseArray, map, z);
        } catch (Throwable th) {
            if (!C218998id.LIZ()) {
                C221018lt.LIZJ("PrfImpl", "report err", th);
            } else {
                throw th;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
