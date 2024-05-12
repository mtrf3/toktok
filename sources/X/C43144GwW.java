package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$getStickerPhoto$1", f = "OptimizeTakePhotoProcessor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GwW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43144GwW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ HD3 LJLIL;
    public final /* synthetic */ List<String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43144GwW(HD3 hd3, List<String> list, InterfaceC67352kd<? super C43144GwW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = hd3;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43144GwW(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        HDA.LIZLLL(this.LJLIL.LIZJ.invoke(), this.LJLIL.LIZIZ.invoke(), this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
