package X;

import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel$fetchStickersOld$1$multiGuestEffectList$1", f = "MultiGuestStickerViewModel.kt", l = {142, 144}, m = "invokeSuspend")
/* renamed from: X.2HX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<LiveEffect>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ MultiGuestStickerViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2HX(MultiGuestStickerViewModel multiGuestStickerViewModel, InterfaceC67352kd<? super C2HX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = multiGuestStickerViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2HX c2hx = new C2HX(this.LJLJI, interfaceC67352kd);
        c2hx.LJLILLLLZI = obj;
        return c2hx;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: Exception -> 0x007f, LOOP:0: B:12:0x006c->B:14:0x0072, LOOP_END, TryCatch #0 {Exception -> 0x007f, blocks: (B:9:0x005e, B:10:0x0061, B:11:0x0063, B:12:0x006c, B:14:0x0072, B:19:0x002e, B:20:0x0031, B:22:0x003c, B:28:0x004b, B:30:0x004f, B:36:0x001d), top: B:2:0x0006 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLIL
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 == r3) goto L15
            if (r0 != r4) goto Ld
            goto L5e
        Ld:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L15:
            java.lang.Object r2 = r6.LJLILLLLZI
            com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel r2 = (com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel) r2
            goto L2e
        L1a:
            X.C141335gf.LIZJ(r7)
            com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel r2 = r6.LJLJI     // Catch: java.lang.Exception -> L7f
            X.1g1 r0 = r2.iv0()     // Catch: java.lang.Exception -> L7f
            r6.LJLILLLLZI = r2     // Catch: java.lang.Exception -> L7f
            r6.LJLIL = r3     // Catch: java.lang.Exception -> L7f
            java.lang.Object r7 = r0.LJIIJ(r6)     // Catch: java.lang.Exception -> L7f
            if (r7 != r5) goto L31
            return r5
        L2e:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L7f
        L31:
            r0 = r7
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L7f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L7f
            r0 = r0 ^ 1
            if (r0 == 0) goto L45
            X.1g1 r0 = r2.iv0()     // Catch: java.lang.Exception -> L7f
            boolean r0 = r0.LJLL     // Catch: java.lang.Exception -> L7f
            if (r0 == 0) goto L45
            goto L46
        L45:
            r3 = 0
        L46:
            r1 = 0
            if (r3 == 0) goto L4a
            goto L4b
        L4a:
            r7 = r1
        L4b:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L7f
            if (r7 != 0) goto L63
            X.1g1 r0 = r2.iv0()     // Catch: java.lang.Exception -> L7f
            r6.LJLILLLLZI = r1     // Catch: java.lang.Exception -> L7f
            r6.LJLIL = r4     // Catch: java.lang.Exception -> L7f
            java.lang.Object r7 = r0.LJIIL(r6)     // Catch: java.lang.Exception -> L7f
            if (r7 != r5) goto L61
            return r5
        L5e:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L7f
        L61:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L7f
        L63:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L7f
            r2.<init>()     // Catch: java.lang.Exception -> L7f
            java.util.Iterator r1 = r7.iterator()     // Catch: java.lang.Exception -> L7f
        L6c:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L7f
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L7f
            X.1QC r0 = (X.C1QC) r0     // Catch: java.lang.Exception -> L7f
            java.util.List<java.lang.Object> r0 = r0.LJLILLLLZI     // Catch: java.lang.Exception -> L7f
            r2.addAll(r0)     // Catch: java.lang.Exception -> L7f
            goto L6c
        L7e:
            return r2
        L7f:
            r2 = move-exception
            java.lang.String r1 = "StickerEffectViewModel"
            java.lang.String r0 = "fetch multiguest sticker effect data error."
            X.C0NB.LJFF(r1, r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<LiveEffect>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
