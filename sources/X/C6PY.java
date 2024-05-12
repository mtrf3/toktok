package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.StickerManager$initListener$1$onStickerEditDone$2", f = "StickerManager.kt", l = {210}, m = "invokeSuspend")
/* renamed from: X.6PY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C6PV LJLJI;
    public final /* synthetic */ C68322mC<StickerModel> LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6PY(C6PV c6pv, C68322mC<StickerModel> c68322mC, boolean z, InterfaceC67352kd<? super C6PY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c6pv;
        this.LJLJJI = c68322mC;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6PY(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[LOOP:0: B:7:0x001e->B:9:0x0024, LOOP_END] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLILLLLZI
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L5a
            X.2mC r1 = r5.LJLIL
            X.C141335gf.LIZJ(r6)
        Le:
            r1.element = r6
        L10:
            X.6PV r0 = r5.LJLJI
            java.util.List<X.6Pu> r0 = r0.LJIIL
            X.2mC<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r4 = r5.LJLJJI
            boolean r3 = r5.LJLJJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L1e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            X.6Pu r1 = (X.InterfaceC160026Pu) r1
            T r0 = r4.element
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.StickerModel) r0
            r1.LIZ(r0, r3)
            goto L1e
        L32:
            X.C141335gf.LIZJ(r6)
            X.6PV r0 = r5.LJLJI
            java.util.List<X.6QO> r1 = r0.LJIIJJI
            X.2mC<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r0 = r5.LJLJJI
            T r0 = r0.element
            com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r0 = (com.ss.android.ugc.aweme.tools.sticker.core.StickerModel) r0
            int r0 = r0.getId()
            X.6QO r2 = X.C30581Hy.LJJJ(r0, r1)
            if (r2 == 0) goto L10
            X.2mC<com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r1 = r5.LJLJJI
            r5.LJLIL = r1
            r5.LJLILLLLZI = r3
            r0 = 0
            java.lang.Object r6 = r2.LJIJJLI(r0, r5)
            if (r6 != r4) goto Le
            return r4
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6PY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
