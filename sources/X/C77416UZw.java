package X;

import fjb.a;

@InterfaceC65848Psq(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {57, 79, 82}, m = "invokeSuspend")
/* renamed from: X.UZw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77416UZw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC78936UyS LJLIL;
    public byte[] LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ InterfaceC65462ha<Object>[] LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<Object[]> LJLJLJ;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC64672gJ<Object>, Object[], InterfaceC67352kd<? super C76800UCe>, Object> LJLJLLL;
    public final /* synthetic */ InterfaceC64672gJ<Object> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77416UZw(InterfaceC67352kd interfaceC67352kd, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC64672gJ interfaceC64672gJ, InterfaceC65462ha[] interfaceC65462haArr) {
        super(2, interfaceC67352kd);
        this.LJLJL = interfaceC65462haArr;
        this.LJLJLJ = interfaceC65784Pro;
        this.LJLJLLL = interfaceC88473Ynt;
        this.LJLL = interfaceC64672gJ;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77416UZw c77416UZw = new C77416UZw(interfaceC67352kd, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLJL);
        c77416UZw.LJLJJLL = obj;
        return c77416UZw;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[EDGE_INSN: B:43:0x006b->B:29:0x006b BREAK  A[LOOP:0: B:19:0x0059->B:41:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77416UZw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
