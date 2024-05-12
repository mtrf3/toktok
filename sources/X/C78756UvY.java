package X;

import com.bytedance.retrofit2.client.Request;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander$onComplete$1", f = "EcomResourceBystander.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.UvY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78756UvY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ EN1 LJLIL;
    public final /* synthetic */ C64797Pbt<?> LJLILLLLZI;
    public final /* synthetic */ Request LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78756UvY(EN1 en1, C64797Pbt<?> c64797Pbt, Request request, InterfaceC67352kd<? super C78756UvY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = en1;
        this.LJLILLLLZI = c64797Pbt;
        this.LJLJI = request;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C78756UvY(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014f, code lost:
    
        if (r9 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bc, code lost:
    
        if (r9 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78756UvY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
