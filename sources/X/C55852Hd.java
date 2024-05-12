package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchRecentEffect$1", f = "StickerEffectViewModel.kt", l = {100, 101, 102, 104}, m = "invokeSuspend")
/* renamed from: X.2Hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55852Hd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StickerEffectViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55852Hd(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C55852Hd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55852Hd(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLIL
            r7 = 4
            r9 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 == r3) goto L35
            if (r0 == r4) goto L62
            if (r0 == r9) goto L18
            if (r0 != r7) goto L8b
            X.C141335gf.LIZJ(r12)
        L15:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L18:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L79
            goto L15
        L1c:
            X.C141335gf.LIZJ(r12)
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LJLILLLLZI     // Catch: java.lang.Exception -> L79
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> L79
            X.1d4 r1 = new X.1d4     // Catch: java.lang.Exception -> L79
            X.1g1 r0 = r0.LJLJJI     // Catch: java.lang.Exception -> L79
            X.1QC r0 = r0.LJLJLLL     // Catch: java.lang.Exception -> L79
            r1.<init>(r0)     // Catch: java.lang.Exception -> L79
            r11.LJLIL = r3     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r2.emit(r1, r11)     // Catch: java.lang.Exception -> L79
            if (r0 != r5) goto L38
            goto L93
        L35:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L79
        L38:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LJLILLLLZI     // Catch: java.lang.Exception -> L79
            X.1g1 r10 = r0.LJLJJI     // Catch: java.lang.Exception -> L79
            r11.LJLIL = r4     // Catch: java.lang.Exception -> L79
            r10.getClass()     // Catch: java.lang.Exception -> L79
            X.XKg r8 = new X.XKg     // Catch: java.lang.Exception -> L79
            X.2kd r0 = X.C78555UsJ.LJJII(r11)     // Catch: java.lang.Exception -> L79
            r8.<init>(r0)     // Catch: java.lang.Exception -> L79
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L79
            com.ss.android.ugc.effectmanager.EffectManager r6 = r10.LJLILLLLZI     // Catch: java.lang.Exception -> L79
            java.lang.String r2 = r10.LJLIL     // Catch: java.lang.Exception -> L79
            X.1pJ r1 = new X.1pJ     // Catch: java.lang.Exception -> L79
            r1.<init>()     // Catch: java.lang.Exception -> L79
            r0 = 0
            r6.fetchRecentUsedEffect(r2, r0, r1)     // Catch: java.lang.Exception -> L79
            java.lang.Object r12 = r8.LIZ()     // Catch: java.lang.Exception -> L79
            if (r12 != r5) goto L65
            goto L94
        L62:
            X.C141335gf.LIZJ(r12)     // Catch: java.lang.Exception -> L79
        L65:
            X.1QC r12 = (X.C1QC) r12     // Catch: java.lang.Exception -> L79
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LJLILLLLZI     // Catch: java.lang.Exception -> L79
            X.XLL r1 = r0.LJLJI     // Catch: java.lang.Exception -> L79
            X.1d4 r0 = new X.1d4     // Catch: java.lang.Exception -> L79
            r0.<init>(r12)     // Catch: java.lang.Exception -> L79
            r11.LJLIL = r9     // Catch: java.lang.Exception -> L79
            java.lang.Object r0 = r1.emit(r0, r11)     // Catch: java.lang.Exception -> L79
            if (r0 != r5) goto L15
            goto L95
        L79:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LJLILLLLZI
            X.XLL r1 = r0.LJLJI
            X.1cs r0 = new X.1cs
            r0.<init>()
            r11.LJLIL = r7
            java.lang.Object r0 = r1.emit(r0, r11)
            if (r0 != r5) goto L15
            return r5
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L93:
            return r5
        L94:
            return r5
        L95:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55852Hd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
