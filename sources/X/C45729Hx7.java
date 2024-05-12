package X;

import Y.ARunnableS26S0200000_7;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.util.VideoCoverCacheImpl;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Hx7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45729Hx7 implements P5A {
    public final /* synthetic */ VideoCoverCacheImpl LIZ;

    public C45729Hx7(VideoCoverCacheImpl videoCoverCacheImpl) {
        this.LIZ = videoCoverCacheImpl;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (byteBuffer != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
            this.LIZ.getClass();
            C81392Vwy LJIIL = C81392Vwy.LJIIL(new W5C(createBitmap, C1E5.LJFF(), W8A.LIZLLL, 0));
            o.LJIIIIZZ(LJIIL, "of(\n                Clos…ityInfo.FULL_QUALITY, 0))");
            C81392Vwy clone = LJIIL.clone();
            InterfaceC42534Gmg interfaceC42534Gmg = (InterfaceC42534Gmg) ((ConcurrentHashMap) this.LIZ.LJLJJI).get(Integer.valueOf(i3));
            if (interfaceC42534Gmg != null) {
                ((ConcurrentHashMap) this.LIZ.LJLJJI).remove(Integer.valueOf(i3));
                C38816FLg.LIZJ(new ARunnableS26S0200000_7(clone, interfaceC42534Gmg, 7));
            }
            VideoCoverCacheImpl videoCoverCacheImpl = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ.LJLIL);
            LIZ.append(i3);
            String LIZIZ = X1D.LIZIZ(LIZ);
            videoCoverCacheImpl.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("file://");
            LIZ2.append(LIZIZ);
            W8E.LJII().LIZJ().LIZJ(W5N.LJI().LIZIZ(W5O.LIZIZ(X1D.LIZIZ(LIZ2)), null), LJIIL);
        }
        return this.LIZ.LJLILLLLZI;
    }
}
