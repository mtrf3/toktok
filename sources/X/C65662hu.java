package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel$updateVideoStickerStatus$1$2$1", f = "VideoStickerContentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65662hu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65662hu(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C65662hu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65662hu(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}