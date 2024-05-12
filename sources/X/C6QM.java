package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerOpShortCuts$showShortCuts$1", f = "StickerOpShortCuts.kt", l = {61, BaseNotice.CREATOR}, m = "invokeSuspend")
/* renamed from: X.6QM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C6QO LJLILLLLZI;
    public final /* synthetic */ C6QO LJLJI;
    public final /* synthetic */ C6QL LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6QM(C6QO c6qo, C6QO c6qo2, C6QL c6ql, InterfaceC67352kd<? super C6QM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c6qo;
        this.LJLJI = c6qo2;
        this.LJLJJI = c6ql;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6QM(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLIL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L44
            if (r0 == r1) goto L52
            if (r0 != r2) goto L60
            X.C141335gf.LIZJ(r5)
        Lf:
            X.6QL r0 = r4.LJLJJI
            android.view.View r0 = r0.LJJIIJ()
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L3e
            X.6QL r0 = r4.LJLJJI
            android.widget.FrameLayout r1 = r0.LIZIZ
            android.view.View r0 = r0.LJJIIJ()
            r1.addView(r0)
            kotlin.jvm.internal.AqS152S0100000_2 r3 = new kotlin.jvm.internal.AqS152S0100000_2
            X.6QL r1 = r4.LJLJJI
            r0 = 931(0x3a3, float:1.305E-42)
            r3.<init>(r1, r0)
            android.os.Handler r2 = X.C6QQ.LIZ
            Y.ARunnableS38S0100000_2 r1 = new Y.ARunnableS38S0100000_2
            r0 = 144(0x90, float:2.02E-43)
            r1.<init>(r3, r0)
            r2.post(r1)
        L3b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L3e:
            X.6QL r0 = r4.LJLJJI
            r0.LJJIFFI()
            goto L3b
        L44:
            X.C141335gf.LIZJ(r5)
            X.6QO r0 = r4.LJLILLLLZI
            r4.LJLIL = r1
            java.lang.Object r0 = r0.LJIJJLI(r1, r4)
            if (r0 != r3) goto L55
            return r3
        L52:
            X.C141335gf.LIZJ(r5)
        L55:
            X.6QO r0 = r4.LJLJI
            r4.LJLIL = r2
            java.lang.Object r0 = r0.LJIJJLI(r1, r4)
            if (r0 != r3) goto Lf
            return r3
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6QM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
