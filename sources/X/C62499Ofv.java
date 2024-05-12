package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.channel.share.handler.BaseChannelShareHandler$executeShare$1$1", f = "BaseChannelShareHandler.kt", l = {147, 148}, m = "invokeSuspend")
/* renamed from: X.Ofv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62499Ofv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C62500Ofw LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62499Ofv(C62500Ofw c62500Ofw, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c62500Ofw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C62499Ofv c62499Ofv = new C62499Ofv(this.LJLJJI, completion);
        c62499Ofv.LJLIL = obj;
        return c62499Ofv;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:
    
        if (r10 == null) goto L52;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x0075. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fb  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62499Ofv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
