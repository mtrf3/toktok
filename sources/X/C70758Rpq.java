package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.opt.HeaderImageLogger$onFirstHeaderImageStart$1", f = "HeaderImageLogger.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Rpq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70758Rpq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Image LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C70765Rpx LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70758Rpq(Image image, boolean z, C70765Rpx c70765Rpx, long j, InterfaceC67352kd<? super C70758Rpq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = image;
        this.LJLILLLLZI = z;
        this.LJLJI = c70765Rpx;
        this.LJLJJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C70758Rpq(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        List<String> urls = this.LJLIL.getUrls();
        String str2 = null;
        if (urls != null) {
            str = (String) ORZ.LJLLLL(urls);
        } else {
            str = null;
        }
        boolean LIZIZ = C72440Sbs.LIZIZ(str);
        boolean z = true;
        if (this.LJLILLLLZI) {
            C70765Rpx c70765Rpx = this.LJLJI;
            c70765Rpx.LIZIZ = true;
            c70765Rpx.LJFF = !LIZIZ;
            List<String> urls2 = this.LJLIL.getUrls();
            if (urls2 != null) {
                str2 = (String) ORZ.LJLLLL(urls2);
            }
            OSZ LJIIL = C1E4.LJIIL(str2);
            if (LJIIL != null && ((Number) LJIIL.getSecond()).intValue() != 0) {
                this.LJLJI.LIZJ = ((Number) LJIIL.getFirst()).floatValue() / ((Number) LJIIL.getSecond()).intValue();
            }
        } else {
            String uri = this.LJLIL.getUri();
            C70765Rpx c70765Rpx2 = this.LJLJI;
            if (C78857UxB.LJJJIL(uri) && (C70660RoG.LJ(this.LJLJI.LIZ.jw0(), uri) != null || LIZIZ)) {
                z = false;
            }
            c70765Rpx2.LJI = z;
            Integer width = this.LJLIL.getWidth();
            Integer height = this.LJLIL.getHeight();
            if (width != null && height != null && height.intValue() != 0 && width.intValue() != 0) {
                this.LJLJI.LIZLLL = width.intValue() / height.intValue();
            }
            C70765Rpx c70765Rpx3 = this.LJLJI;
            c70765Rpx3.LJII = this.LJLJJI;
            RunnableC70762Rpu runnableC70762Rpu = c70765Rpx3.LJIIIIZZ;
            if (runnableC70762Rpu != null) {
                runnableC70762Rpu.run();
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
