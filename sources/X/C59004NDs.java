package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService$preloadIBE$1", f = "CommerceIBEService.kt", l = {50}, m = "invokeSuspend")
/* renamed from: X.NDs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59004NDs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ IBEInfo LJLILLLLZI;
    public final /* synthetic */ CommerceIBEService LJLJI;
    public final /* synthetic */ C58628Mzg LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C59004NDs(IBEInfo iBEInfo, CommerceIBEService commerceIBEService, C58628Mzg c58628Mzg, Context context, InterfaceC88472Yns<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C59004NDs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = iBEInfo;
        this.LJLJI = commerceIBEService;
        this.LJLJJI = c58628Mzg;
        this.LJLJJL = context;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59004NDs(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59004NDs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
