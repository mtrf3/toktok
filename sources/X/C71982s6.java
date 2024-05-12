package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerUpdateResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.StickerStoreHelper$removeFavSticker$3$1", f = "StickerStoreHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2s6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71982s6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC71992s7 LJLIL;
    public final /* synthetic */ FavStickerUpdateResponse LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ Fragment LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71982s6(InterfaceC71992s7 interfaceC71992s7, FavStickerUpdateResponse favStickerUpdateResponse, Long l, Fragment fragment, InterfaceC67352kd<? super C71982s6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC71992s7;
        this.LJLILLLLZI = favStickerUpdateResponse;
        this.LJLJI = l;
        this.LJLJJI = fragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71982s6(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        VideoSticker videoSticker;
        C141335gf.LIZJ(obj);
        InterfaceC71992s7 interfaceC71992s7 = this.LJLIL;
        VideoSticker videoSticker2 = null;
        if (interfaceC71992s7 != null) {
            FavStickerStruct favSticker = this.LJLILLLLZI.getFavSticker();
            if (favSticker != null) {
                videoSticker = favSticker.getVideoSticker();
            } else {
                videoSticker = null;
            }
            interfaceC71992s7.LIZ(videoSticker);
        }
        C71512rL.LJII.LJJIII(this.LJLJI);
        FavStickerStruct favSticker2 = this.LJLILLLLZI.getFavSticker();
        if (favSticker2 != null) {
            videoSticker2 = favSticker2.getVideoSticker();
        }
        C87083bM.LIZIZ(videoSticker2);
        C26045AKb c26045AKb = new C26045AKb(this.LJLJJI);
        c26045AKb.LJIIIIZZ(R.string.ro2);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
