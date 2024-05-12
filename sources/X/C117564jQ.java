package X;

import com.bytedance.im.core.proto.Response;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$receiveWs$1", f = "IMUseCaseClient.kt", l = {174, 182}, m = "invokeSuspend")
/* renamed from: X.4jQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117564jQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Response LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C63383OuB LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ byte[] LJLJJLL;
    public final /* synthetic */ EP1 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C117564jQ(C63383OuB c63383OuB, String str, byte[] bArr, EP1 ep1, InterfaceC67352kd<? super C117564jQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c63383OuB;
        this.LJLJJL = str;
        this.LJLJJLL = bArr;
        this.LJLJL = ep1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C117564jQ c117564jQ = new C117564jQ(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c117564jQ.LJLJI = obj;
        return c117564jQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r0 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        r9 = r3.cmd;
        r1 = X.EnumC63625Oy5.NEW_MSG_NOTIFY.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        if (r9 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        r0 = r10.LJLJJI.LIZIZ;
        r10.LJLJI = r2;
        r10.LJLIL = r3;
        r10.LJLILLLLZI = 2;
        r11 = r0.LIZLLL(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (r11 != r8) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (r9.intValue() != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r8 = r10.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d0, code lost:
    
        if (r8.LJIILLIIL != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (r8.LIZ.invoke().LJLI == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
    
        r8.LJIILLIIL = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r7 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e4, code lost:
    
        if (r3.inbox_type == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        X.XKX.LIZLLL(r2, null, null, new X.C63384OuC(r8, r3, null), 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0138, code lost:
    
        X.XKX.LIZLLL(r2, X.C120394nz.LIZ(), null, new X.C115454g1(r8, r3, null), 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0123, code lost:
    
        if (r1.LIZ.invoke().LJJLIIIJL != false) goto L32;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117564jQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
