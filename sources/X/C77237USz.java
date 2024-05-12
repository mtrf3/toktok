package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.fb.FBSyncAuthProcessor$invokeSyncApi$1", f = "FBSyncAuthProcessor.kt", l = {51, 60, 67}, m = "invokeSuspend")
/* renamed from: X.USz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77237USz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C77216USe>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ UT2 LJLJJL;
    public final /* synthetic */ C77211URz LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77237USz(boolean z, UT2 ut2, C77211URz c77211URz, InterfaceC67352kd<? super C77237USz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = ut2;
        this.LJLJJLL = c77211URz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77237USz c77237USz = new C77237USz(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c77237USz.LJLJI = obj;
        return c77237USz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object, com.ss.android.ugc.aweme.base.api.BaseResponse, X.Ee8] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77237USz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C77216USe> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
