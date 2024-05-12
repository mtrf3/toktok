package X;

import android.graphics.Bitmap;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.GcR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41899GcR implements InterfaceC134015Nt {
    public final /* synthetic */ AtomicInteger LIZ;
    public final /* synthetic */ C41906GcY LIZIZ;
    public final /* synthetic */ List<String> LIZJ;
    public final /* synthetic */ int[] LIZLLL;
    public final /* synthetic */ C3CK<List<String>> LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C41899GcR(AtomicInteger atomicInteger, C41906GcY c41906GcY, List<String> list, int[] iArr, C3CK<? super List<String>> c3ck) {
        this.LIZ = atomicInteger;
        this.LIZIZ = c41906GcY;
        this.LIZJ = list;
        this.LIZLLL = iArr;
        this.LJ = c3ck;
    }

    @Override // X.InterfaceC134015Nt
    public final int LIZ(byte[] bArr, int i, int i2, int i3, float f) {
        if (i2 <= 0 || i3 <= 0) {
            this.LIZ.incrementAndGet();
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            File LJIIIZ = this.LIZIZ.LJIIIZ(this.LIZ.get(), createBitmap);
            List<String> list = this.LIZJ;
            String absolutePath = LJIIIZ.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "file.absolutePath");
            list.add(absolutePath);
        }
        if (this.LIZ.incrementAndGet() == this.LIZLLL.length) {
            C41906GcY c41906GcY = this.LIZIZ;
            C3CK<List<String>> c3ck = this.LJ;
            List<String> list2 = this.LIZJ;
            c41906GcY.getClass();
            if (c3ck.LJII()) {
                return 0;
            }
            if (!(!(c3ck.LJIILLIIL(list2) instanceof C3C0))) {
                XKX.LJ(MBB.INSTANCE, new C79893Bp(c3ck, list2, null));
            }
            c3ck.LJJIFFI(null);
            return 0;
        }
        return 0;
    }
}
