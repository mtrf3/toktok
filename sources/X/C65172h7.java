package X;

import com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh$sendUpdateSignal$1", f = "StickerDurationAutoRefresh.kt", l = {51, 52}, m = "invokeSuspend")
/* renamed from: X.2h7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65172h7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super C76800UCe>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StickerDurationAutoRefresh LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65172h7(StickerDurationAutoRefresh stickerDurationAutoRefresh, InterfaceC67352kd<? super C65172h7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = stickerDurationAutoRefresh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C65172h7 c65172h7 = new C65172h7(this.LJLJI, interfaceC67352kd);
        c65172h7.LJLILLLLZI = obj;
        return c65172h7;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:6:0x0013). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 == r3) goto L26
            if (r0 != r4) goto L45
            java.lang.Object r2 = r6.LJLILLLLZI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r7)
        L13:
            com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh r0 = r6.LJLJI
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L42
            X.UCe r0 = X.C76800UCe.LIZ
            r6.LJLILLLLZI = r2
            r6.LJLIL = r3
            java.lang.Object r0 = r2.emit(r0, r6)
            if (r0 != r5) goto L2d
            return r5
        L26:
            java.lang.Object r2 = r6.LJLILLLLZI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            X.C141335gf.LIZJ(r7)
        L2d:
            r6.LJLILLLLZI = r2
            r6.LJLIL = r4
            r0 = 36
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r6)
            if (r0 != r5) goto L13
            return r5
        L3a:
            X.C141335gf.LIZJ(r7)
            java.lang.Object r2 = r6.LJLILLLLZI
            X.2gJ r2 = (X.InterfaceC64672gJ) r2
            goto L13
        L42:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L45:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65172h7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super C76800UCe> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
