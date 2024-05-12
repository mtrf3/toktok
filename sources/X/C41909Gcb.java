package X;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Gcb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41909Gcb implements P5A {
    public final /* synthetic */ C3CK<OSZ<Bitmap, Integer>> LIZ;
    public final /* synthetic */ CopyOnWriteArrayList<Integer> LIZIZ;
    public final /* synthetic */ int[] LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C41909Gcb(C3CK<? super OSZ<Bitmap, Integer>> c3ck, CopyOnWriteArrayList<Integer> copyOnWriteArrayList, int[] iArr) {
        this.LIZ = c3ck;
        this.LIZIZ = copyOnWriteArrayList;
        this.LIZJ = iArr;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        boolean z = false;
        if (!C48841JEv.LJIILLIIL(this.LIZ)) {
            return false;
        }
        C44422Hc2.LIZJ();
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        int size = this.LIZIZ.size();
        this.LIZIZ.add(Integer.valueOf(i3));
        this.LIZ.LJIILLIIL(new OSZ<>(createBitmap, Integer.valueOf(size)));
        if (this.LIZIZ.size() >= this.LIZJ.length) {
            z = true;
            this.LIZ.LJJIFFI(null);
        }
        return !z;
    }
}
