package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.FavStickerListManager$onLoadMore$3$1", f = "FavStickerListManager.kt", l = {53, 57}, m = "invokeSuspend")
/* renamed from: X.2rM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71522rM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ FavStickerListResponse LJLILLLLZI;
    public final /* synthetic */ InterfaceC65692hx LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71522rM(FavStickerListResponse favStickerListResponse, InterfaceC65692hx interfaceC65692hx, InterfaceC67352kd<? super C71522rM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = favStickerListResponse;
        this.LJLJI = interfaceC65692hx;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71522rM(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[LOOP:0: B:13:0x002f->B:15:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093 A[LOOP:1: B:21:0x008d->B:23:0x0093, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L12
            if (r0 == r2) goto L26
            if (r0 != r6) goto Lc1
            X.C141335gf.LIZJ(r9)
        Lf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L12:
            X.C141335gf.LIZJ(r9)
            com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse r1 = r8.LJLILLLLZI
            int r0 = r1.status_code
            if (r0 != 0) goto Lf
            X.2rL r0 = X.C71512rL.LJII
            r8.LJLIL = r2
            java.lang.Object r9 = r0.LJJIFFI(r1)
            if (r9 != r5) goto L29
            return r5
        L26:
            X.C141335gf.LIZJ(r9)
        L29:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r7 = r9.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r4 = r7.next()
            X.OSZ r4 = (X.OSZ) r4
            X.2rL r3 = X.C71512rL.LJII
            java.lang.Object r2 = r4.getFirst()
            java.lang.Object r1 = r4.getSecond()
            r3.getClass()
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.concurrent.ConcurrentHashMap<KEY, DATA> r0 = r3.LIZ
            r0.put(r2, r1)
            java.lang.Object r1 = r4.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r4.getSecond()
            java.util.List r0 = (java.util.List) r0
            r3.LJIJJ(r1, r0)
            goto L2f
        L67:
            X.2hx r7 = r8.LJLJI
            X.2rL r0 = X.C71512rL.LJII
            java.util.concurrent.ConcurrentHashMap<KEY, DATA> r1 = r0.LIZ
            java.lang.String r0 = X.C71512rL.LJJI()
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L7e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L7e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L8d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct r2 = (com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct) r2
            X.4Bx r1 = new X.4Bx
            r1.<init>()
            java.lang.Integer r0 = r2.getStickerType()
            r1.LIZLLL = r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker r0 = r2.getSetSticker()
            r1.LJ = r0
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r0 = r2.getVideoSticker()
            r1.LJFF = r0
            r4.add(r1)
            goto L8d
        Lb4:
            java.util.List r0 = X.ORZ.LLJILJILJ(r4)
            r8.LJLIL = r6
            X.UCe r0 = r7.onSuccess(r0)
            if (r0 != r5) goto Lf
            return r5
        Lc1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71522rM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
