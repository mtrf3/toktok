package X;

import com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.sticker.core.duration.StickerDurationAutoRefresh$begin$1", f = "StickerDurationAutoRefresh.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2h8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65182h8 extends AbstractC65782Prm implements InterfaceC88471Ynr<C76800UCe, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public final /* synthetic */ StickerDurationAutoRefresh LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C65182h8(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, StickerDurationAutoRefresh stickerDurationAutoRefresh, InterfaceC67352kd<? super C65182h8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = stickerDurationAutoRefresh;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65182h8(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.invoke(this.LJLILLLLZI.LIZ.invoke());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C76800UCe c76800UCe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c76800UCe, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
