package X;

import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.image.utils.VideoModeUtils$resizeBitmapForVideoMode$1$3", f = "VideoModeUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gfq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42110Gfq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MvCreateVideoData LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42110Gfq(MvCreateVideoData mvCreateVideoData, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C42110Gfq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mvCreateVideoData;
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42110Gfq(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C42111Gfr.LIZIZ((int) C42111Gfr.LIZ.LIZ("resize image", "success"), this.LJLIL.selectMediaList.size());
        this.LJLILLLLZI.invoke();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
