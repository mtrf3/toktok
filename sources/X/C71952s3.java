package X;

import android.view.View;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$addFavSticker$1", f = "ChatRoomViewModel.kt", l = {605, 607, 618}, m = "invokeSuspend")
/* renamed from: X.2s3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71952s3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ View LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71952s3(long j, int i, View view, InterfaceC67352kd<? super C71952s3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = i;
        this.LJLJJL = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71952s3(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLILLLLZI
            r6 = 0
            r4 = 3
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 == r1) goto L30
            if (r0 == r3) goto L60
            if (r0 != r4) goto L80
            X.C141335gf.LIZJ(r13)
        L13:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L16:
            X.C141335gf.LIZJ(r13)
            long r8 = r12.LJLJI
            int r10 = r12.LJLJJI
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r7 = X.C74722wW.LIZ()     // Catch: java.lang.Throwable -> L39
            X.321 r0 = X.AnonymousClass321.ADD     // Catch: java.lang.Throwable -> L39
            int r11 = r0.getAction()     // Catch: java.lang.Throwable -> L39
            r12.LJLILLLLZI = r1     // Catch: java.lang.Throwable -> L39
            java.lang.Object r13 = r7.updateFavSticker(r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L39
            if (r13 != r5) goto L33
            goto L88
        L30:
            X.C141335gf.LIZJ(r13)     // Catch: java.lang.Throwable -> L39
        L33:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerUpdateResponse r13 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerUpdateResponse) r13     // Catch: java.lang.Throwable -> L39
            X.C3C5.m7constructorimpl(r13)     // Catch: java.lang.Throwable -> L39
            goto L41
        L39:
            r0 = move-exception
            X.3C4 r13 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r13)
        L41:
            r7 = r13
            android.view.View r8 = r12.LJLJJL
            boolean r0 = X.C3C5.m13isSuccessimpl(r7)
            if (r0 == 0) goto L65
            r2 = r7
            com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerUpdateResponse r2 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerUpdateResponse) r2
            X.UtN r1 = X.C36636EZk.LIZ
            X.2s4 r0 = new X.2s4
            r0.<init>(r2, r8, r6)
            r12.LJLIL = r7
            r12.LJLILLLLZI = r3
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r12)
            if (r0 != r5) goto L65
            return r5
        L60:
            java.lang.Object r7 = r12.LJLIL
            X.C141335gf.LIZJ(r13)
        L65:
            android.view.View r3 = r12.LJLJJL
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r7)
            if (r2 == 0) goto L13
        L6e:
            X.UtN r1 = X.C36636EZk.LIZ
            X.2s2 r0 = new X.2s2
            r0.<init>(r3, r2, r6)
            r12.LJLIL = r7
            r12.LJLILLLLZI = r4
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r12)
            if (r0 != r5) goto L13
            return r5
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71952s3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
