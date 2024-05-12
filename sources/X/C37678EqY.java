package X;

import fjb.a;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;

/* renamed from: X.EqY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37678EqY extends AbstractC65783Prn implements InterfaceC88471Ynr<AbstractC37657EqD<? super char[]>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public AbstractC37657EqD LJLILLLLZI;
    public AbstractC37657EqD LJLJI;
    public char[] LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ InputStreamReader LJLJJLL;
    public final /* synthetic */ InputStream LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37678EqY(InputStreamReader inputStreamReader, InterfaceC67352kd interfaceC67352kd, InputStream inputStream, String str, int i) {
        super(2, interfaceC67352kd);
        this.LJLJJLL = inputStreamReader;
        this.LJLJL = inputStream;
        this.LJLJLJ = str;
        this.LJLJLLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIJ(completion, "completion");
        C37678EqY c37678EqY = new C37678EqY(this.LJLJJLL, completion, this.LJLJL, this.LJLJLJ, this.LJLJLLL);
        c37678EqY.LJLILLLLZI = (AbstractC37657EqD) obj;
        return c37678EqY;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AbstractC37657EqD<? super char[]> abstractC37657EqD, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(abstractC37657EqD, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0036 -> B:5:0x0010). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 != r4) goto L4c
            char[] r3 = r6.LJLJJI
            X.EqD r2 = r6.LJLJI
            X.C141335gf.LIZJ(r7)
        L10:
            java.io.InputStreamReader r0 = r6.LJLJJLL
            int r1 = r0.read(r3)
        L16:
            r0 = -1
            if (r1 == r0) goto L49
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            int r0 = r3.length
            X.OQN.LJFF(r1, r0)
            r0 = 0
            char[] r1 = java.util.Arrays.copyOfRange(r3, r0, r1)
            java.lang.String r0 = "copyOfRange(this, fromIndex, toIndex)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r6.LJLJI = r2
            r6.LJLJJI = r3
            r6.LJLJJL = r4
            X.NAu r0 = r2.LIZ(r1, r6)
            if (r0 != r5) goto L10
            return r5
        L39:
            X.C141335gf.LIZJ(r7)
            X.EqD r2 = r6.LJLILLLLZI
            int r0 = r6.LJLJLLL
            char[] r3 = new char[r0]
            java.io.InputStreamReader r0 = r6.LJLJJLL
            int r1 = r0.read(r3)
            goto L16
        L49:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37678EqY.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
