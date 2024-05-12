package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.PopularStickerStruct;
import fjb.a;
import java.io.File;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager$readCacheFromFile$2", f = "PopularStickerListManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2r3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71332r3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends PopularStickerStruct>>, Object> {
    public final /* synthetic */ PopularStickerListManager LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71332r3(PopularStickerListManager popularStickerListManager, InterfaceC67352kd<? super C71332r3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = popularStickerListManager;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71332r3(this.LJLIL, interfaceC67352kd);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<PopularStickerStruct>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends PopularStickerStruct>> interfaceC67352kd) {
        return invoke2(interfaceC70422pa, (InterfaceC67352kd<? super List<PopularStickerStruct>>) interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        this.LJLIL.getClass();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/sticker_store_resources/pop_sticker/");
        LIZ2.append(curUserId);
        LIZ.append(X1D.LIZIZ(LIZ2));
        List LIZJ = C64544PUu.LIZJ(new File(X1D.LIZIZ(LIZ)), PopularStickerStruct.class);
        if (LIZJ != null) {
            return ORZ.LLJI(LIZJ);
        }
        return null;
    }
}
