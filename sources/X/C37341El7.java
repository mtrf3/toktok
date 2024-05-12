package X;

import android.graphics.Bitmap;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$cacheMediaBlurThumbnail$2", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.El7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37341El7 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37341El7(int i, long j, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37341El7(this.LJLILLLLZI, this.LJLJI, this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC70869Rrd LIZJ = W5U.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("_editor");
        Bitmap LJ = LIZJ.LJ(C44694HgQ.LJIIIIZZ(X1D.LIZIZ(LIZ)));
        if (LJ == null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.LJLIL);
            LIZ2.append(" not getCachedBitmapAsync ");
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ2));
            W5F LJFF = W5U.LJFF(C44694HgQ.LJIIIIZZ(this.LJLIL));
            int i = this.LJLILLLLZI;
            LJFF.LJII = i;
            LJFF.LJIIIIZZ = i;
            LJFF.LJIJI = Bitmap.Config.RGB_565;
            LJFF.LJJII = ExecutorC37340El6.LJLIL;
            LJFF.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LJFF.LJJIJIL = true;
            LJFF.LJIIIZ(new C37339El5(this.LJLIL, this.LJLJI));
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this.LJLIL);
            LIZ3.append(" getCachedBitmapAsync (");
            LIZ3.append(System.currentTimeMillis() - this.LJLJI);
            LIZ3.append("ms)");
            H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ3));
            C37335El1.LIZJ(this.LJLJI, LJ, this.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
