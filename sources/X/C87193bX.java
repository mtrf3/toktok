package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel$fetchVideoStickerListInProfile$2", f = "VideoStickerContentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3bX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87193bX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super IEvent>, Object> {
    public final /* synthetic */ VideoStickerContentViewModel LJLIL;
    public final /* synthetic */ List<C87123bQ> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87193bX(VideoStickerContentViewModel videoStickerContentViewModel, List<C87123bQ> list, InterfaceC67352kd<? super C87193bX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoStickerContentViewModel;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C87193bX(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        int type = EnumC87203bY.DEFAULT.getType();
        C72808Sho<ITEM> c72808Sho = this.LJLIL.state;
        if (c72808Sho != 0) {
            num = new Integer(this.LJLILLLLZI.size() + c72808Sho.LJIIIIZZ());
        } else {
            num = null;
        }
        C87223ba c87223ba = new C87223ba(type, num);
        C2U8.LIZ(c87223ba);
        return c87223ba;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super IEvent> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
