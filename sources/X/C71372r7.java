package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import fjb.a;
import java.io.File;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.stickerset.AddedStickerSetListManager$updateFileCache$1", f = "AddedStickerSetListManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2r7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71372r7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ List<StickerSetInfo> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71372r7(String str, List<StickerSetInfo> list, InterfaceC67352kd<? super C71372r7> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71372r7(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
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
        C71572rR c71572rR = C71572rR.LJII;
        String str = this.LJLIL;
        c71572rR.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/sticker_store_resources/added_sticker_set/");
        LIZ2.append(str);
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
