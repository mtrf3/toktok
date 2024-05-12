package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchCategoryList$1", f = "StickerEffectViewModel.kt", l = {142, 143, 145, 147, 150}, m = "invokeSuspend")
/* renamed from: X.2Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55822Ha extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StickerEffectViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55822Ha(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C55822Ha> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55822Ha c55822Ha = new C55822Ha(this.LJLJI, interfaceC67352kd);
        c55822Ha.LJLILLLLZI = obj;
        return c55822Ha;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:15:0x001c, B:17:0x0054, B:18:0x0057, B:20:0x005f, B:24:0x0075, B:26:0x007d, B:27:0x0096, B:31:0x0041, B:32:0x0044, B:37:0x002c), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:15:0x001c, B:17:0x0054, B:18:0x0057, B:20:0x005f, B:24:0x0075, B:26:0x007d, B:27:0x0096, B:31:0x0041, B:32:0x0044, B:37:0x002c), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLIL
            r7 = 5
            r11 = 4
            r3 = 3
            r8 = 2
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 == r4) goto L41
            if (r0 == r8) goto L20
            if (r0 == r3) goto L1c
            if (r0 == r11) goto L1c
            if (r0 != r7) goto Lba
            X.C141335gf.LIZJ(r13)
        L19:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1c:
            X.C141335gf.LIZJ(r13)     // Catch: java.lang.Exception -> La4
            goto L19
        L20:
            java.lang.Object r10 = r12.LJLILLLLZI
            java.util.List r10 = (java.util.List) r10
            goto L54
        L25:
            X.C141335gf.LIZJ(r13)
            java.lang.Object r2 = r12.LJLILLLLZI
            X.2pa r2 = (X.InterfaceC70422pa) r2
            X.2HZ r1 = new X.2HZ     // Catch: java.lang.Exception -> La4
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r12.LJLJI     // Catch: java.lang.Exception -> La4
            r1.<init>(r0, r6)     // Catch: java.lang.Exception -> La4
            X.XKn r0 = X.XKX.LIZIZ(r2, r6, r6, r1, r3)     // Catch: java.lang.Exception -> La4
            r12.LJLIL = r4     // Catch: java.lang.Exception -> La4
            java.lang.Object r13 = r0.LJJIJ(r12)     // Catch: java.lang.Exception -> La4
            if (r13 != r5) goto L44
            goto Lc2
        L41:
            X.C141335gf.LIZJ(r13)     // Catch: java.lang.Exception -> La4
        L44:
            r10 = r13
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Exception -> La4
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r12.LJLJI     // Catch: java.lang.Exception -> La4
            r12.LJLILLLLZI = r10     // Catch: java.lang.Exception -> La4
            r12.LJLIL = r8     // Catch: java.lang.Exception -> La4
            java.lang.Object r13 = r0.tv0(r12)     // Catch: java.lang.Exception -> La4
            if (r13 != r5) goto L57
            goto Lc3
        L54:
            X.C141335gf.LIZJ(r13)     // Catch: java.lang.Exception -> La4
        L57:
            X.1Ne r13 = (X.C31941Ne) r13     // Catch: java.lang.Exception -> La4
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Exception -> La4
            if (r0 == 0) goto L75
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r12.LJLJI     // Catch: java.lang.Exception -> La4
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> La4
            X.1cq r1 = new X.1cq     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "categoryList is empty"
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> La4
            r12.LJLILLLLZI = r6     // Catch: java.lang.Exception -> La4
            r12.LJLIL = r3     // Catch: java.lang.Exception -> La4
            java.lang.Object r0 = r2.emit(r1, r12)     // Catch: java.lang.Exception -> La4
            if (r0 != r5) goto L19
            goto Lc4
        L75:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r12.LJLJI     // Catch: java.lang.Exception -> La4
            X.XLL r9 = r0.LJLJI     // Catch: java.lang.Exception -> La4
            X.1cz r8 = new X.1cz     // Catch: java.lang.Exception -> La4
            if (r13 == 0) goto L96
            java.util.List r10 = X.ORZ.LLJILJILJ(r10)     // Catch: java.lang.Exception -> La4
            X.1Nk r3 = new X.1Nk     // Catch: java.lang.Exception -> La4
            java.lang.String r2 = X.C0TY.LJIIIZ     // Catch: java.lang.Exception -> La4
            java.lang.String r0 = "EFFECT_REWARD_PANEL_NAME"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Exception -> La4
            java.lang.String r1 = "livereward"
            r0 = 0
            r3.<init>(r2, r1, r0)     // Catch: java.lang.Exception -> La4
            r0 = r10
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> La4
            r0.add(r3)     // Catch: java.lang.Exception -> La4
        L96:
            r8.<init>(r10)     // Catch: java.lang.Exception -> La4
            r12.LJLILLLLZI = r6     // Catch: java.lang.Exception -> La4
            r12.LJLIL = r11     // Catch: java.lang.Exception -> La4
            java.lang.Object r0 = r9.emit(r8, r12)     // Catch: java.lang.Exception -> La4
            if (r0 != r5) goto L19
            goto Lc5
        La4:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r12.LJLJI
            X.XLL r2 = r0.LJLJI
            X.1cq r1 = new X.1cq
            java.lang.String r0 = "fetchCategoryList failed"
            r1.<init>(r4, r0)
            r12.LJLILLLLZI = r6
            r12.LJLIL = r7
            java.lang.Object r0 = r2.emit(r1, r12)
            if (r0 != r5) goto L19
            return r5
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc2:
            return r5
        Lc3:
            return r5
        Lc4:
            return r5
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55822Ha.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
