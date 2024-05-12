package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel$tryToUpdateAddedStickerSet$2$1", f = "StickerSetContentViewModel.kt", l = {324, 326, 337}, m = "invokeSuspend")
/* renamed from: X.2kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67372kf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ List<StickerSetInfo> LJLJI;
    public final /* synthetic */ StickerSetContentViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67372kf(StickerSetContentViewModel stickerSetContentViewModel, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = list;
        this.LJLJJI = stickerSetContentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67372kf(this.LJLJJI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ba  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r18
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r5 = r17
            int r0 = r5.LJLILLLLZI
            r13 = 0
            r3 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L1a
            if (r0 == r7) goto L7d
            if (r0 == r8) goto Lac
            if (r0 != r3) goto Lcc
            X.C141335gf.LIZJ(r1)
        L17:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1a:
            X.C141335gf.LIZJ(r1)
            java.util.List<com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo> r1 = r5.LJLJI
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r6 = X.C74722wW.LIZ()     // Catch: java.lang.Throwable -> L86
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L86
            r9.<init>()     // Catch: java.lang.Throwable -> L86
            r0 = 91
            r9.append(r0)     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Throwable -> L86
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r10 = r1.iterator()     // Catch: java.lang.Throwable -> L86
        L3c:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L86
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo r0 = (com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo) r0     // Catch: java.lang.Throwable -> L86
            java.lang.Long r0 = r0.getSetId()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L5b
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L86
        L52:
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L86
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L86
            r11.add(r2)     // Catch: java.lang.Throwable -> L86
            goto L3c
        L5b:
            r0 = 0
            goto L52
        L5e:
            java.lang.String r12 = ","
            r16 = 62
            r14 = r13
            r15 = r13
            java.lang.String r0 = X.ORZ.LLD(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L86
            r9.append(r0)     // Catch: java.lang.Throwable -> L86
            r0 = 93
            r9.append(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = r9.toString()     // Catch: java.lang.Throwable -> L86
            r5.LJLILLLLZI = r7     // Catch: java.lang.Throwable -> L86
            java.lang.Object r1 = r6.updateAddedStickerSetList(r0, r5)     // Catch: java.lang.Throwable -> L86
            if (r1 != r4) goto L80
            goto Ld4
        L7d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L86
        L80:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1     // Catch: java.lang.Throwable -> L86
            X.C3C5.m7constructorimpl(r1)     // Catch: java.lang.Throwable -> L86
            goto L8e
        L86:
            r0 = move-exception
            X.3C4 r1 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r1)
        L8e:
            r7 = r1
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel r6 = r5.LJLJJI
            java.util.List<com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo> r2 = r5.LJLJI
            boolean r0 = X.C3C5.m13isSuccessimpl(r7)
            if (r0 == 0) goto Lb1
        L9a:
            X.UtN r1 = X.C36636EZk.LIZ
            X.2rV r0 = new X.2rV
            r0.<init>(r6, r2, r13)
            r5.LJLIL = r7
            r5.LJLILLLLZI = r8
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r5)
            if (r0 != r4) goto Lb1
            return r4
        Lac:
            java.lang.Object r7 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        Lb1:
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel r2 = r5.LJLJJI
            java.lang.Throwable r0 = X.C3C5.m10exceptionOrNullimpl(r7)
            if (r0 == 0) goto L17
        Lba:
            X.UtN r1 = X.C36636EZk.LIZ
            X.2rW r0 = new X.2rW
            r0.<init>(r2, r13)
            r5.LJLIL = r7
            r5.LJLILLLLZI = r3
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r5)
            if (r0 != r4) goto L17
            return r4
        Lcc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Ld4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67372kf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
