package X;

import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel$fetchDataNew$1", f = "VoiceEffectViewModel.kt", l = {C61447O9r.LJIIJ, 52, 54, 56, 57, 60}, m = "invokeSuspend")
/* renamed from: X.2DS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VoiceEffectViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DS(VoiceEffectViewModel voiceEffectViewModel, InterfaceC67352kd<? super C2DS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = voiceEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2DS(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:7:0x0010, B:11:0x002b, B:14:0x0048, B:16:0x0052, B:19:0x0065, B:22:0x0076, B:28:0x0045, B:29:0x0073), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:7:0x0010, B:11:0x002b, B:14:0x0048, B:16:0x0052, B:19:0x0065, B:22:0x0076, B:28:0x0045, B:29:0x0073), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLIL
            r4 = 1
            switch(r0) {
                case 0: goto L19;
                case 1: goto L15;
                case 2: goto L45;
                case 3: goto L10;
                case 4: goto L73;
                case 5: goto L10;
                case 6: goto La0;
                default: goto L8;
            }
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L10:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> L8b
            goto La3
        L15:
            X.C141335gf.LIZJ(r6)
            goto L2b
        L19:
            X.C141335gf.LIZJ(r6)
            com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel r0 = r5.LJLILLLLZI
            X.XLL r1 = r0.LJLJI
            X.1d3 r0 = X.C37171d3.LIZ
            r5.LJLIL = r4
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r3) goto L2b
            return r3
        L2b:
            X.0TX r1 = X.C0TX.LIZ     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "VoiceEffect"
            r1.LIZJ(r0)     // Catch: java.lang.Exception -> L8b
            java.lang.String r0 = "begin to fetch voice effect's data."
            X.C0TX.LIZLLL(r0)     // Catch: java.lang.Exception -> L8b
            com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L8b
            X.1O0 r1 = r0.LJLJJI     // Catch: java.lang.Exception -> L8b
            r0 = 2
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L8b
            java.lang.Object r6 = r1.LIZ(r5)     // Catch: java.lang.Exception -> L8b
            if (r6 != r3) goto L48
            return r3
        L45:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> L8b
        L48:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L8b
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Exception -> L8b
            r0 = r0 ^ 1
            if (r0 == 0) goto L65
            com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L8b
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> L8b
            X.1d2 r1 = new X.1d2     // Catch: java.lang.Exception -> L8b
            r1.<init>(r6)     // Catch: java.lang.Exception -> L8b
            r0 = 3
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L8b
            java.lang.Object r0 = r2.emit(r1, r5)     // Catch: java.lang.Exception -> L8b
            if (r0 != r3) goto La3
            return r3
        L65:
            com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L8b
            X.1O0 r1 = r0.LJLJJI     // Catch: java.lang.Exception -> L8b
            r0 = 4
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L8b
            java.lang.Object r6 = r1.LIZJ(r5)     // Catch: java.lang.Exception -> L8b
            if (r6 != r3) goto L76
            return r3
        L73:
            X.C141335gf.LIZJ(r6)     // Catch: java.lang.Exception -> L8b
        L76:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L8b
            com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel r0 = r5.LJLILLLLZI     // Catch: java.lang.Exception -> L8b
            X.XLL r2 = r0.LJLJI     // Catch: java.lang.Exception -> L8b
            X.1d2 r1 = new X.1d2     // Catch: java.lang.Exception -> L8b
            r1.<init>(r6)     // Catch: java.lang.Exception -> L8b
            r0 = 5
            r5.LJLIL = r0     // Catch: java.lang.Exception -> L8b
            java.lang.Object r0 = r2.emit(r1, r5)     // Catch: java.lang.Exception -> L8b
            if (r0 != r3) goto La3
            return r3
        L8b:
            com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel r0 = r5.LJLILLLLZI
            X.XLL r2 = r0.LJLJI
            X.1cq r1 = new X.1cq
            java.lang.String r0 = "ERROR"
            r1.<init>(r4, r0)
            r0 = 6
            r5.LJLIL = r0
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r3) goto La3
            return r3
        La0:
            X.C141335gf.LIZJ(r6)
        La3:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
