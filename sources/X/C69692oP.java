package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeFetchManager$batchQueryAweme$2", f = "AwemeFetchManager.kt", l = {165}, m = "invokeSuspend")
/* renamed from: X.2oP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69692oP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69692oP(List<String> list, InterfaceC67352kd<? super C69692oP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C69692oP(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0093, code lost:
    
        if (r10 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6 A[Catch: Exception -> 0x0124, TRY_LEAVE, TryCatch #0 {Exception -> 0x0124, blocks: (B:8:0x0059, B:9:0x005c, B:11:0x0060, B:13:0x0066, B:14:0x006f, B:16:0x0075, B:19:0x0081, B:24:0x008a, B:25:0x0095, B:27:0x009b, B:28:0x00a4, B:30:0x00aa, B:33:0x00b2, B:36:0x00b8, B:42:0x00c6, B:43:0x00ca, B:44:0x00d0, B:46:0x00d6, B:57:0x00e8, B:50:0x0102, B:52:0x010a, B:53:0x0120, B:63:0x00c1, B:64:0x008f, B:83:0x0047), top: B:2:0x0005 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69692oP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
