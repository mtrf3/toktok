package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.VCBasePipelineHandler$process2$2", f = "VCBasePipelineHandler.kt", l = {73}, m = "invokeSuspend")
/* renamed from: X.2hP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65352hP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<Object>>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ AbstractC166226fi LJLJJI;
    public final /* synthetic */ List<C166116fX> LJLJJL;
    public final /* synthetic */ InterfaceC88472Yns<C166116fX, Object> LJLJJLL;
    public final /* synthetic */ InterfaceC88473Ynt<InterfaceC70422pa, C166116fX, InterfaceC67352kd<Object>, Object> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65352hP(AbstractC166226fi abstractC166226fi, List<C166116fX> list, InterfaceC88472Yns<? super C166116fX, Object> interfaceC88472Yns, InterfaceC88473Ynt<? super InterfaceC70422pa, ? super C166116fX, ? super InterfaceC67352kd<Object>, ? extends Object> interfaceC88473Ynt, InterfaceC67352kd<? super C65352hP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = abstractC166226fi;
        this.LJLJJL = list;
        this.LJLJJLL = interfaceC88472Yns;
        this.LJLJL = interfaceC88473Ynt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65352hP c65352hP = new C65352hP(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
        c65352hP.LJLJI = obj;
        return c65352hP;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:5:0x0015). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:5:0x0015). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLILLLLZI
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L3c
            if (r0 != r5) goto L91
            java.lang.Object r2 = r11.LJLIL
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r11.LJLJI
            java.util.List r4 = (java.util.List) r4
            X.C141335gf.LIZJ(r12)
        L15:
            if (r12 == 0) goto L1a
            r4.add(r12)
        L1a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r1 = r2.next()
            X.2hQ r1 = (X.C65362hQ) r1
            X.2mE<T> r0 = r1.LIZIZ
            if (r0 == 0) goto L37
            r11.LJLJI = r4
            r11.LJLIL = r2
            r11.LJLILLLLZI = r5
            java.lang.Object r12 = r0.LJI(r11)
            if (r12 != r7) goto L15
            return r7
        L37:
            T r12 = r1.LIZ
            if (r12 == 0) goto L1a
            goto L15
        L3c:
            X.C141335gf.LIZJ(r12)
            java.lang.Object r8 = r11.LJLJI
            X.2pa r8 = (X.InterfaceC70422pa) r8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.6fi r1 = r11.LJLJJI
            r0 = 0
            r1.LIZIZ = r0
            java.util.List<X.6fX> r0 = r11.LJLJJL
            java.util.Iterator r10 = r0.iterator()
        L58:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r9 = r10.next()
            X.6fX r9 = (X.C166116fX) r9
            X.Yns<X.6fX, java.lang.Object> r0 = r11.LJLJJLL
            java.lang.Object r2 = r0.invoke(r9)
            if (r2 == 0) goto L7e
            X.6fi r1 = r11.LJLJJI
            int r0 = r1.LIZIZ
            int r0 = r0 + 1
            r1.LIZIZ = r0
            r1 = r6
        L75:
            X.2hQ r0 = new X.2hQ
            r0.<init>(r2, r1)
            r3.add(r0)
            goto L58
        L7e:
            X.2hO r1 = new X.2hO
            X.Ynt<X.2pa, X.6fX, X.2kd<java.lang.Object>, java.lang.Object> r0 = r11.LJLJL
            r1.<init>(r0, r9, r6)
            r0 = 3
            X.XKn r1 = X.XKX.LIZIZ(r8, r6, r6, r1, r0)
            goto L75
        L8b:
            java.util.Iterator r2 = r3.iterator()
            goto L1a
        L90:
            return r4
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65352hP.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<Object>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
