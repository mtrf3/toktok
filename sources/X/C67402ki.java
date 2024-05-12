package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel$addStickerSet$1$1", f = "StickerSetContentViewModel.kt", l = {133, 135, 145}, m = "invokeSuspend")
/* renamed from: X.2ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67402ki extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ C72412sn LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ StickerSetContentViewModel LJLJJLL;
    public final /* synthetic */ int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67402ki(Long l, C72412sn c72412sn, View view, StickerSetContentViewModel stickerSetContentViewModel, int i, InterfaceC67352kd<? super C67402ki> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = l;
        this.LJLJJI = c72412sn;
        this.LJLJJL = view;
        this.LJLJJLL = stickerSetContentViewModel;
        this.LJLJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67402ki(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r0 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r12.LJLILLLLZI
            r2 = 3
            r4 = 2
            r7 = 1
            if (r1 == 0) goto L15
            if (r1 == r7) goto L2b
            if (r1 == r4) goto L5f
            if (r1 != r2) goto L88
            X.C141335gf.LIZJ(r13)
        L12:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L15:
            X.C141335gf.LIZJ(r13)
            java.lang.Long r3 = r12.LJLJI
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r1 = X.C74722wW.LIZ()     // Catch: java.lang.Throwable -> L34
            long r5 = r3.longValue()     // Catch: java.lang.Throwable -> L34
            r12.LJLILLLLZI = r7     // Catch: java.lang.Throwable -> L34
            java.lang.Object r13 = r1.addStickerSet(r5, r12)     // Catch: java.lang.Throwable -> L34
            if (r13 != r0) goto L2e
            goto L90
        L2b:
            X.C141335gf.LIZJ(r13)     // Catch: java.lang.Throwable -> L34
        L2e:
            com.ss.android.ugc.aweme.base.api.BaseResponse r13 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r13     // Catch: java.lang.Throwable -> L34
            X.C3C5.m7constructorimpl(r13)     // Catch: java.lang.Throwable -> L34
            goto L3c
        L34:
            r1 = move-exception
            X.3C4 r13 = X.C141335gf.LIZ(r1)
            X.C3C5.m7constructorimpl(r13)
        L3c:
            r1 = r13
            X.2sn r6 = r12.LJLJJI
            android.view.View r7 = r12.LJLJJL
            java.lang.Long r8 = r12.LJLJI
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel r9 = r12.LJLJJLL
            boolean r3 = X.C3C5.m13isSuccessimpl(r13)
            if (r3 == 0) goto L64
        L4c:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2rY r5 = new X.2rY
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12.LJLIL = r1
            r12.LJLILLLLZI = r4
            java.lang.Object r3 = X.XKX.LJI(r3, r5, r12)
            if (r3 != r0) goto L64
            return r0
        L5f:
            java.lang.Object r1 = r12.LJLIL
            X.C141335gf.LIZJ(r13)
        L64:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel r5 = r12.LJLJJLL
            int r6 = r12.LJLJL
            X.2sn r7 = r12.LJLJJI
            android.view.View r9 = r12.LJLJJL
            java.lang.Long r10 = r12.LJLJI
            java.lang.Throwable r8 = X.C3C5.m10exceptionOrNullimpl(r1)
            if (r8 == 0) goto L12
        L75:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2ra r4 = new X.2ra
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r12.LJLIL = r1
            r12.LJLILLLLZI = r2
            java.lang.Object r1 = X.XKX.LJI(r3, r4, r12)
            if (r1 != r0) goto L12
            return r0
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67402ki.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
