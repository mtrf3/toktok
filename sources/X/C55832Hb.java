package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchDataNew$1", f = "StickerEffectViewModel.kt", l = {372, 374, 376, 378, 379, 383}, m = "invokeSuspend")
/* renamed from: X.2Hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55832Hb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StickerEffectViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55832Hb(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C55832Hb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55832Hb(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: Exception -> 0x0087, TryCatch #0 {Exception -> 0x0087, blocks: (B:7:0x0010, B:11:0x002b, B:14:0x003c, B:16:0x0046, B:18:0x004e, B:21:0x0061, B:24:0x0072, B:30:0x0039, B:31:0x006f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r6 = 1
            switch(r0) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L39;
                case 3: goto L10;
                case 4: goto L6f;
                case 5: goto L10;
                case 6: goto Lac;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L10:
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Exception -> L87
            goto Laf
        L15:
            X.C141335gf.LIZJ(r8)
            goto L2b
        L19:
            X.C141335gf.LIZJ(r8)
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r7.LJLILLLLZI
            X.XLL r1 = r0.LJLJI
            X.1d3 r0 = X.C37171d3.LIZ
            r7.LJLIL = r6
            java.lang.Object r0 = r1.emit(r0, r7)
            if (r0 != r5) goto L2b
            return r5
        L2b:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L87
            X.1g1 r1 = r0.LJLJJI     // Catch: java.lang.Exception -> L87
            r0 = 2
            r7.LJLIL = r0     // Catch: java.lang.Exception -> L87
            java.lang.Object r8 = r1.LJIIJ(r7)     // Catch: java.lang.Exception -> L87
            if (r8 != r5) goto L3c
            return r5
        L39:
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Exception -> L87
        L3c:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L87
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Exception -> L87
            r0 = r0 ^ 1
            if (r0 == 0) goto L61
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L87
            X.1g1 r0 = r0.LJLJJI     // Catch: java.lang.Exception -> L87
            boolean r0 = r0.LJLL     // Catch: java.lang.Exception -> L87
            if (r0 == 0) goto L61
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L87
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> L87
            X.1d2 r1 = new X.1d2     // Catch: java.lang.Exception -> L87
            r1.<init>(r8)     // Catch: java.lang.Exception -> L87
            r0 = 3
            r7.LJLIL = r0     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = r2.emit(r1, r7)     // Catch: java.lang.Exception -> L87
            if (r0 != r5) goto Laf
            return r5
        L61:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L87
            X.1g1 r1 = r0.LJLJJI     // Catch: java.lang.Exception -> L87
            r0 = 4
            r7.LJLIL = r0     // Catch: java.lang.Exception -> L87
            java.lang.Object r8 = r1.LJIIL(r7)     // Catch: java.lang.Exception -> L87
            if (r8 != r5) goto L72
            return r5
        L6f:
            X.C141335gf.LIZJ(r8)     // Catch: java.lang.Exception -> L87
        L72:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L87
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r7.LJLILLLLZI     // Catch: java.lang.Exception -> L87
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> L87
            X.1d2 r1 = new X.1d2     // Catch: java.lang.Exception -> L87
            r1.<init>(r8)     // Catch: java.lang.Exception -> L87
            r0 = 5
            r7.LJLIL = r0     // Catch: java.lang.Exception -> L87
            java.lang.Object r0 = r2.emit(r1, r7)     // Catch: java.lang.Exception -> L87
            if (r0 != r5) goto Laf
            return r5
        L87:
            r4 = move-exception
            java.lang.String r1 = "StickerEffectViewModel"
            java.lang.String r0 = "fetch sticker effect data error."
            X.C0NB.LJFF(r1, r0, r4)
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r7.LJLILLLLZI
            X.XLL r3 = r0.LJLJI
            X.1cq r2 = new X.1cq
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "ERROR: "
            java.lang.String r0 = X.KMP.LJFF(r1, r0, r4, r1)
            r2.<init>(r6, r0)
            r0 = 6
            r7.LJLIL = r0
            java.lang.Object r0 = r3.emit(r2, r7)
            if (r0 != r5) goto Laf
            return r5
        Lac:
            X.C141335gf.LIZJ(r8)
        Laf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55832Hb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
