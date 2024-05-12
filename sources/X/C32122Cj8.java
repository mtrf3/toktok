package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.metrics.sticker.StickerGiftTracker$onInteractionSeiUpdate$1$1", f = "StickerGiftTracker.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Cj8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32122Cj8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ java.util.Map<String, String> LJLIL;
    public final /* synthetic */ C32217Ckf LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32122Cj8(java.util.Map<String, String> map, C32217Ckf c32217Ckf, InterfaceC67352kd<? super C32122Cj8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = map;
        this.LJLILLLLZI = c32217Ckf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32122Cj8(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        Long LJIJJLI;
        Long LJIJJLI2;
        Long LJIJJLI3;
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInteractionSeiUpdate: ");
        LIZ.append(this.LJLIL);
        C32444CoK.LIZ("StickerGiftTracker", X1D.LIZIZ(LIZ));
        String str = this.LJLIL.get("log_id");
        String str2 = this.LJLIL.get("anchor_render_timestamp");
        long j3 = 0;
        if (str2 != null && (LJIJJLI3 = C79043V0l.LJIJJLI(str2)) != null) {
            j = LJIJJLI3.longValue();
        } else {
            j = 0;
        }
        String str3 = this.LJLIL.get("anchor_latency");
        if (str3 != null && (LJIJJLI2 = C79043V0l.LJIJJLI(str3)) != null) {
            j2 = LJIJJLI2.longValue();
        } else {
            j2 = 0;
        }
        String str4 = this.LJLIL.get("anchor_receive_timestamp");
        if (str4 != null && (LJIJJLI = C79043V0l.LJIJJLI(str4)) != null) {
            j3 = LJIJJLI.longValue();
        }
        this.LJLILLLLZI.LIZIZ(j, j2, j3, str);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
