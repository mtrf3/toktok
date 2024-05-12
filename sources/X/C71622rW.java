package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel$tryToUpdateAddedStickerSet$2$1$3$1", f = "StickerSetContentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2rW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71622rW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StickerSetContentViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71622rW(StickerSetContentViewModel stickerSetContentViewModel, InterfaceC67352kd<? super C71622rW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = stickerSetContentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71622rW(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C141335gf.LIZJ(obj);
        Iterator it = ((ArrayList) this.LJLIL.LJLJI).iterator();
        while (it.hasNext()) {
            StickerSetInfo stickerSetInfo = (StickerSetInfo) it.next();
            C87393br c87393br = C87393br.LIZ;
            Long setId = stickerSetInfo.getSetId();
            if (setId != null) {
                str = setId.toString();
            } else {
                str = null;
            }
            Integer stickerType = stickerSetInfo.getStickerType();
            int type = EnumC73222u6.ANIMATED.getType();
            if (stickerType == null || stickerType.intValue() != type) {
                z = false;
            } else {
                z = true;
            }
            C87393br.LJJ(c87393br, "store_sticker_set_page", "set", null, str, z, null, false);
        }
        ((ArrayList) this.LJLIL.LJLJI).clear();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
