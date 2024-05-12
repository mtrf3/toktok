package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager$getStickerByTopicId$2", f = "AddYoursStickerManager.kt", l = {236}, m = "invokeSuspend")
/* renamed from: X.8kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220428kw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AddYoursStickerStruct>, Object> {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C68322mC<AddYoursStickerStruct> LJLJJL;
    public final /* synthetic */ long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C220428kw(boolean z, C68322mC<AddYoursStickerStruct> c68322mC, long j, InterfaceC67352kd<? super C220428kw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = c68322mC;
        this.LJLJJLL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C220428kw(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJI
            r5 = 1
            r7 = 0
            if (r0 == 0) goto L17
            if (r0 != r5) goto Lf
            X.2mC r3 = r8.LJLILLLLZI
            X.2mC r4 = r8.LJLIL
            goto L48
        Lf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L17:
            X.C141335gf.LIZJ(r9)
            boolean r0 = r8.LJLJJI
            if (r0 != 0) goto L2f
            X.2mC<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r4 = r8.LJLJJL
            android.util.LruCache<java.lang.Long, com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r3 = com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZIZ
            long r1 = r8.LJLJJLL
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            java.lang.Object r0 = r3.get(r0)
            r4.element = r0
        L2f:
            X.2mC<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r3 = r8.LJLJJL
            T r0 = r3.element
            if (r0 != 0) goto L6f
            X.8k6 r2 = X.C219908k6.LIZ     // Catch: java.lang.Exception -> L52
            long r0 = r8.LJLJJLL     // Catch: java.lang.Exception -> L52
            r8.LJLIL = r3     // Catch: java.lang.Exception -> L52
            r8.LJLILLLLZI = r3     // Catch: java.lang.Exception -> L52
            r8.LJLJI = r5     // Catch: java.lang.Exception -> L52
            java.lang.Object r9 = r2.LIZIZ(r0, r8)     // Catch: java.lang.Exception -> L52
            if (r9 != r6) goto L46
            return r6
        L46:
            r4 = r3
            goto L4b
        L48:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Exception -> L50
        L4b:
            com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp r9 = (com.ss.android.ugc.tiktok.addyours.model.AddYoursTopicStickerResp) r9     // Catch: java.lang.Exception -> L50
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r0 = r9.sticker     // Catch: java.lang.Exception -> L50
            goto L6d
        L50:
            r2 = move-exception
            goto L54
        L52:
            r2 = move-exception
            r4 = r3
        L54:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "getAddYoursStickerByQA error, "
            r1.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "AddYoursStickerManager"
            X.C221018lt.LIZIZ(r0, r1)
            r3 = r4
            r0 = r7
        L6d:
            r3.element = r0
        L6f:
            X.2mC<com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r0 = r8.LJLJJL
            T r4 = r0.element
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r4 = (com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct) r4
            if (r4 == 0) goto L9b
            java.lang.Long r0 = r4.getTopicId()
            boolean r0 = X.C30591Hz.LJIJJLI(r0)
            if (r0 == 0) goto L9b
            long r2 = r8.LJLJJLL
            android.util.LruCache<java.lang.Long, com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r1 = com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZIZ
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            java.lang.Object r1 = r1.put(r0, r4)
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r1 = (com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct) r1
            if (r1 == 0) goto L9a
            com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager r0 = com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZ
            r0.getClass()
            com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager.LIZJ(r1)
        L9a:
            r7 = r4
        L9b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220428kw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AddYoursStickerStruct> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
