package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.PopularStickerStruct;
import fjb.a;
import java.io.File;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager$updateFileCache$2", f = "PopularStickerListManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2r5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71352r5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PopularStickerListManager LJLIL;
    public final /* synthetic */ List<PopularStickerStruct> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71352r5(PopularStickerListManager popularStickerListManager, List<PopularStickerStruct> list, InterfaceC67352kd<? super C71352r5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = popularStickerListManager;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71352r5(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        this.LJLIL.getClass();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/sticker_store_resources/pop_sticker/");
        LIZ2.append(curUserId);
        LIZ.append(X1D.LIZIZ(LIZ2));
        String LIZIZ = X1D.LIZIZ(LIZ);
        c37246Eja.getClass();
        File LIZJ = C37246Eja.LIZJ(LIZIZ);
        if (LIZJ == null) {
            return C76800UCe.LIZ;
        }
        C64544PUu.LIZLLL(LIZJ, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }
}
