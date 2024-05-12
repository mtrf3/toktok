package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.contact.ContactSyncAuthProcessor$invokeSyncApi$1", f = "ContactSyncAuthProcessor.kt", l = {58, 75, 87}, m = "invokeSuspend")
/* renamed from: X.USy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77236USy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C77216USe>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C77211URz LJLJJL;
    public final /* synthetic */ UT3 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77236USy(boolean z, C77211URz c77211URz, UT3 ut3, InterfaceC67352kd<? super C77236USy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = c77211URz;
        this.LJLJJLL = ut3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77236USy c77236USy = new C77236USy(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
        c77236USy.LJLJI = obj;
        return c77236USy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, com.ss.android.ugc.aweme.base.api.BaseResponse, X.Ee8] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77236USy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C77216USe> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
