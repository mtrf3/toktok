package X;

import android.view.View;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel$addStickerSet$2$2$1", f = "StickerSetDetailViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2rX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71632rX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StickerSetInfo LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71632rX(StickerSetInfo stickerSetInfo, View view, long j, InterfaceC67352kd<? super C71632rX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = stickerSetInfo;
        this.LJLILLLLZI = view;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71632rX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C141335gf.LIZJ(obj);
        C71572rR.LJII.LJJ(this.LJLIL);
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.ro8);
        c26045AKb.LJIIJ();
        String valueOf = String.valueOf(this.LJLJI);
        Long authorUid = this.LJLIL.getAuthorUid();
        if (authorUid != null) {
            str = authorUid.toString();
        } else {
            str = null;
        }
        Integer stickerType = this.LJLIL.getStickerType();
        int type = EnumC73222u6.ANIMATED.getType();
        if (stickerType == null || stickerType.intValue() != type) {
            z = false;
        } else {
            z = true;
        }
        C87393br.LJII(valueOf, str, "sticker_set_details_page", z, true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
