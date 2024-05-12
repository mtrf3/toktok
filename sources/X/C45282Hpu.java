package X;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaCacheRepository$cacheImageColor$1", f = "MediaCacheRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Hpu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45282Hpu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45282Hpu(String str, int i, InterfaceC67352kd<? super C45282Hpu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45282Hpu(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        double d;
        W5B w5b;
        Bitmap underlyingBitmap;
        C141335gf.LIZJ(obj);
        GYB gyb = new GYB(0);
        OSZ osz = new OSZ(this.LJLIL, new Integer(this.LJLILLLLZI));
        C44947HkV c44947HkV = InterfaceC44948HkW.LJI;
        if (c44947HkV.getOpenAlbumOptiGroup() == 1) {
            d = 0.8d;
        } else if (c44947HkV.getOpenAlbumOptiGroup() == 2) {
            d = 0.6d;
        } else {
            d = 1.0d;
        }
        int intValue = ((Number) osz.getSecond()).intValue() * ((int) d);
        W5A w5a = null;
        if (intValue > 0) {
            W6K LIZJ = W8E.LJII().LIZJ();
            String uri = C44694HgQ.LJIIIIZZ((String) osz.getFirst()).toString();
            C79238V7y c79238V7y = new C79238V7y(intValue, intValue);
            V85 v85 = V85.LIZJ;
            ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
            imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
            imageDecodeOptionsBuilder.getClass();
            C81392Vwy LJFF = LIZJ.LJFF(new V91(uri, c79238V7y, v85, new C81810W8w(imageDecodeOptionsBuilder), null, null, null));
            if (LJFF != null) {
                w5a = (W5A) LJFF.LJI();
            }
            if ((w5a instanceof W5C) && (w5b = (W5B) w5a) != null && (underlyingBitmap = w5b.getUnderlyingBitmap()) != null) {
                OSZ<Integer, Integer> LIZIZ = gyb.LIZIZ(underlyingBitmap);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("cacheImageColor ");
                LIZ.append(this.LJLIL);
                LIZ.append("-->");
                LIZ.append(LIZIZ);
                H78.LIZIZ("MediaCacheRepository", X1D.LIZIZ(LIZ));
                C37335El1.LIZJ.put(this.LJLIL, LIZIZ);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
