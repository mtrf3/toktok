package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.VideoModeContainer$8$1", f = "VideoModeContainer.kt", l = {802}, m = "invokeSuspend")
/* renamed from: X.Bvi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30354Bvi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30354Bvi(String str, InterfaceC67352kd<? super C30354Bvi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C30354Bvi(this.LJLILLLLZI, interfaceC67352kd);
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
            C30376Bw4 c30376Bw4 = C30376Bw4.LJLIL;
            C30364Bvs c30364Bvs = C30364Bvs.LJLIL;
            this.LJLIL = 1;
            if (C0WK.LIZ(liveEffectController, str2, STICKER, "trending", c30376Bw4, c30364Bvs, null, this, 96) == enumC58928NAu) {
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
