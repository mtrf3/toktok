package X;

import android.view.View;
import android.view.ViewGroup;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {97, 99}, m = "invokeSuspend")
/* renamed from: X.2F5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2F5 extends AbstractC65783Prn implements InterfaceC88471Ynr<AbstractC37657EqD<? super View>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public final /* synthetic */ ViewGroup LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2F5(ViewGroup viewGroup, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJLJ = viewGroup;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C2F5 c2f5 = new C2F5(this.LJLJLJ, completion);
        c2f5.LJLILLLLZI = obj;
        return c2f5;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(AbstractC37657EqD<? super View> abstractC37657EqD, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(abstractC37657EqD, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x001b, code lost:
    
        if (X.C76800UCe.LIZ == r9) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:6:0x001b). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r9 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJL
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L85
            if (r0 == r7) goto L3b
            if (r0 != r8) goto L97
            int r6 = r11.LJLJJLL
            int r3 = r11.LJLJJL
            java.lang.Object r5 = r11.LJLJI
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r4 = r11.LJLILLLLZI
            X.EqD r4 = (X.AbstractC37657EqD) r4
            X.C141335gf.LIZJ(r12)
        L1b:
            int r3 = r3 + 1
        L1d:
            if (r3 >= r6) goto L94
            android.view.View r10 = r5.getChildAt(r3)
            java.lang.String r0 = "getChildAt(index)"
            kotlin.jvm.internal.o.LJIIIIZZ(r10, r0)
            r11.LJLILLLLZI = r4
            r11.LJLJI = r5
            r11.LJLJJI = r10
            r11.LJLJJL = r3
            r11.LJLJJLL = r6
            r11.LJLJL = r7
            X.NAu r0 = r4.LIZ(r10, r11)
            if (r0 != r9) goto L4e
            return r9
        L3b:
            int r6 = r11.LJLJJLL
            int r3 = r11.LJLJJL
            java.lang.Object r10 = r11.LJLJJI
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r5 = r11.LJLJI
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r4 = r11.LJLILLLLZI
            X.EqD r4 = (X.AbstractC37657EqD) r4
            X.C141335gf.LIZJ(r12)
        L4e:
            boolean r0 = r10 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1b
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            java.lang.String r0 = "$this$descendants"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            X.2F5 r2 = new X.2F5
            r1 = 0
            r2.<init>(r10, r1)
            X.EqB r0 = new X.EqB
            r0.<init>(r2)
            r11.LJLILLLLZI = r4
            r11.LJLJI = r5
            r11.LJLJJI = r1
            r11.LJLJJL = r3
            r11.LJLJJLL = r6
            r11.LJLJL = r8
            r4.getClass()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r1 = r4.LIZIZ(r0, r11)
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            if (r1 != r0) goto L82
        L7f:
            if (r1 != r9) goto L1b
            return r9
        L82:
            X.UCe r1 = X.C76800UCe.LIZ
            goto L7f
        L85:
            X.C141335gf.LIZJ(r12)
            java.lang.Object r4 = r11.LJLILLLLZI
            X.EqD r4 = (X.AbstractC37657EqD) r4
            android.view.ViewGroup r5 = r11.LJLJLJ
            int r6 = r5.getChildCount()
            r3 = 0
            goto L1d
        L94:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2F5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
