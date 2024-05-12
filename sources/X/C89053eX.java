package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.viewmodel.VideoStickerCreationViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.viewmodel.VideoStickerCreationViewModel$uploadSavedVideoSticker$1$4$1", f = "VideoStickerCreationViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3eX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89053eX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoStickerCreationViewModel LJLIL;
    public final /* synthetic */ InterfaceC89073eZ LJLILLLLZI;
    public final /* synthetic */ Throwable LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C89053eX(VideoStickerCreationViewModel videoStickerCreationViewModel, InterfaceC89073eZ interfaceC89073eZ, Throwable th, InterfaceC67352kd<? super C89053eX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoStickerCreationViewModel;
        this.LJLILLLLZI = interfaceC89073eZ;
        this.LJLJI = th;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C89053eX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJJI = SystemClock.elapsedRealtime() - this.LJLIL.LJLJJI;
        InterfaceC89073eZ interfaceC89073eZ = this.LJLILLLLZI;
        if (interfaceC89073eZ != null) {
            interfaceC89073eZ.LIZIZ(new Integer(EnumC89013eT.CREATE_REQUEST_FAIL.getStatus()), this.LJLJI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
