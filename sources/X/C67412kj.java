package X;

import android.view.View;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel$addStickerSet$2", f = "StickerSetDetailViewModel.kt", l = {93, 95, 105}, m = "invokeSuspend")
/* renamed from: X.2kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67412kj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ StickerSetInfo LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ StickerSetDetailViewModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67412kj(long j, StickerSetInfo stickerSetInfo, View view, StickerSetDetailViewModel stickerSetDetailViewModel, InterfaceC67352kd<? super C67412kj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = j;
        this.LJLJJI = stickerSetInfo;
        this.LJLJJL = view;
        this.LJLJJLL = stickerSetDetailViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67412kj(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
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
            r3 = 1
            if (r1 == 0) goto L15
            if (r1 == r3) goto L27
            if (r1 == r4) goto L59
            if (r1 != r2) goto L80
            X.C141335gf.LIZJ(r13)
        L12:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L15:
            X.C141335gf.LIZJ(r13)
            long r5 = r12.LJLJI
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r1 = X.C74722wW.LIZ()     // Catch: java.lang.Throwable -> L30
            r12.LJLILLLLZI = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r13 = r1.addStickerSet(r5, r12)     // Catch: java.lang.Throwable -> L30
            if (r13 != r0) goto L2a
            goto L88
        L27:
            X.C141335gf.LIZJ(r13)     // Catch: java.lang.Throwable -> L30
        L2a:
            com.ss.android.ugc.aweme.base.api.BaseResponse r13 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r13     // Catch: java.lang.Throwable -> L30
            X.C3C5.m7constructorimpl(r13)     // Catch: java.lang.Throwable -> L30
            goto L38
        L30:
            r1 = move-exception
            X.3C4 r13 = X.C141335gf.LIZ(r1)
            X.C3C5.m7constructorimpl(r13)
        L38:
            r1 = r13
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo r6 = r12.LJLJJI
            android.view.View r7 = r12.LJLJJL
            long r8 = r12.LJLJI
            boolean r3 = X.C3C5.m13isSuccessimpl(r13)
            if (r3 == 0) goto L5e
        L46:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2rX r5 = new X.2rX
            r10 = 0
            r5.<init>(r6, r7, r8, r10)
            r12.LJLIL = r1
            r12.LJLILLLLZI = r4
            java.lang.Object r3 = X.XKX.LJI(r3, r5, r12)
            if (r3 != r0) goto L5e
            return r0
        L59:
            java.lang.Object r1 = r12.LJLIL
            X.C141335gf.LIZJ(r13)
        L5e:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel r5 = r12.LJLJJLL
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo r7 = r12.LJLJJI
            android.view.View r8 = r12.LJLJJL
            long r9 = r12.LJLJI
            java.lang.Throwable r6 = X.C3C5.m10exceptionOrNullimpl(r1)
            if (r6 == 0) goto L12
        L6d:
            X.UtN r3 = X.C36636EZk.LIZ
            X.2rb r4 = new X.2rb
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r11)
            r12.LJLIL = r1
            r12.LJLILLLLZI = r2
            java.lang.Object r1 = X.XKX.LJI(r3, r4, r12)
            if (r1 != r0) goto L12
            return r0
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67412kj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
