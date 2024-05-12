package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.TryModeContainer$7$1", f = "TryModeContainer.kt", l = {501}, m = "invokeSuspend")
/* renamed from: X.Bvh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30353Bvh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30353Bvh(String str, InterfaceC67352kd<? super C30353Bvh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C30353Bvh(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C7N.LJII().getH5EventStickerManager();
            C1HD.LIZIZ();
            C0WH h5EventStickerManager = C7N.LJII().getH5EventStickerManager();
            String str = this.LJLILLLLZI;
            h5EventStickerManager.getClass();
            C1HD.LIZIZ = str;
            C0WL liveEffectController = C7N.LJII().getLiveEffectController();
            o.LJIIIIZZ(liveEffectController, "effectService.liveEffectController");
            String str2 = this.LJLILLLLZI;
            String STICKER = C0TY.LIZIZ;
            o.LJIIIIZZ(STICKER, "STICKER");
            C30375Bw3 c30375Bw3 = C30375Bw3.LJLIL;
            C30363Bvr c30363Bvr = C30363Bvr.LJLIL;
            this.LJLIL = 1;
            if (C0WK.LIZ(liveEffectController, str2, STICKER, "trending", c30375Bw3, c30363Bvr, null, this, 96) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
