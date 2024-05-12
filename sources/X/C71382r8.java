package X;

import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet;
import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.stickersetdetail.StickerSetDetailManager$updateFileCache$1", f = "StickerSetDetailManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2r8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71382r8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ StickerSet LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71382r8(long j, StickerSet stickerSet, InterfaceC67352kd<? super C71382r8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = j;
        this.LJLILLLLZI = stickerSet;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71382r8(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
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
        C71442rE c71442rE = C71442rE.LJII;
        long j = this.LJLIL;
        c71442rE.getClass();
        LIZ.append(C71442rE.LJJ(j));
        String LIZIZ = X1D.LIZIZ(LIZ);
        c37246Eja.getClass();
        File LIZJ = C37246Eja.LIZJ(LIZIZ);
        if (LIZJ == null) {
            return C76800UCe.LIZ;
        }
        C64544PUu.LIZLLL(LIZJ, C47261Igj.LJJIJ(this.LJLILLLLZI));
        return C76800UCe.LIZ;
    }
}
