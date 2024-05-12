package X;

import android.view.View;
import com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerUpdateResponse;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$addFavSticker$1$2$1", f = "ChatRoomViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2s4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71962s4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FavStickerUpdateResponse LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71962s4(FavStickerUpdateResponse favStickerUpdateResponse, View view, InterfaceC67352kd<? super C71962s4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = favStickerUpdateResponse;
        this.LJLILLLLZI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71962s4(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C71512rL.LJII.LJJ(this.LJLIL.getFavSticker());
        if (!C91093hp.LIZIZ()) {
            C91093hp.LJII();
            C91093hp.LJIIJ(true);
            C2U8.LIZ(new C72092sH(true));
        }
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.rnj);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
