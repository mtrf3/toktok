package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.google.gson.m;
import com.google.gson.s;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel$fetchLoadMoreData$responseMap$1", f = "LiveVerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.ECk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36038ECk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super java.util.Map<String, ? extends Object>>, Object> {
    public final /* synthetic */ m LJLIL;
    public final /* synthetic */ CompletionBlock<InterfaceC36553EWf> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36038ECk(m mVar, CompletionBlock<InterfaceC36553EWf> completionBlock, InterfaceC67352kd<? super C36038ECk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mVar;
        this.LJLILLLLZI = completionBlock;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36038ECk(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object obj2 = null;
        try {
            Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), this.LJLIL, C65330PkU.LIZJ(C65352Pkq.LJIIIIZZ(java.util.Map.class, C65340Pke.LIZ(C65352Pkq.LJI(String.class)), C65340Pke.LIZ(C65352Pkq.LJI(Object.class)))));
            if (!(fromJson instanceof java.util.Map)) {
                fromJson = null;
            }
            obj2 = fromJson;
        } catch (s unused) {
        }
        if (obj2 == null) {
            C31626Cb8.LIZ(this.LJLILLLLZI, -5, "response has wrong data struct", 4);
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super java.util.Map<String, ? extends Object>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
