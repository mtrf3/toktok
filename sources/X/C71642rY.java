package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel$addStickerSet$1$1$2$1", f = "StickerSetContentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2rY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71642rY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C72412sn LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ StickerSetContentViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71642rY(C72412sn c72412sn, View view, Long l, StickerSetContentViewModel stickerSetContentViewModel, InterfaceC67352kd<? super C71642rY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c72412sn;
        this.LJLILLLLZI = view;
        this.LJLJI = l;
        this.LJLJJI = stickerSetContentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71642rY(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C141335gf.LIZJ(obj);
        C71572rR.LJII.LJJ(this.LJLIL.LJLIL);
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.ro8);
        c26045AKb.LJIIJ();
        String l = this.LJLJI.toString();
        Long authorUid = this.LJLIL.LJLIL.getAuthorUid();
        if (authorUid != null) {
            str = authorUid.toString();
        } else {
            str = null;
        }
        String ov0 = this.LJLJJI.ov0();
        Integer stickerType = this.LJLIL.LJLIL.getStickerType();
        int type = EnumC73222u6.ANIMATED.getType();
        if (stickerType == null || stickerType.intValue() != type) {
            z = false;
        } else {
            z = true;
        }
        C87393br.LJII(l, str, ov0, z, true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
