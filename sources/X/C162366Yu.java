package X;

import Y.ACallableS24S1300000_2;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.6Yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162366Yu {
    public static final void LIZIZ(int i, int i2, List list) {
        if (i == i2 || i < 0 || i2 < 0 || i > list.size() - 1 || i2 > list.size() - 1) {
            return;
        }
        ListProtector.add(list, i2, ListProtector.remove(list, i));
    }

    public static final void LIZ(final W5G w5g, final String path, Drawable drawable, final int i, final C162396Yx c162396Yx) {
        Bitmap LIZ;
        o.LJIIIZ(w5g, "<this>");
        o.LJIIIZ(path, "path");
        w5g.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean z = true;
        w5g.getHierarchy().LJIILL(drawable, 1);
        final android.net.Uri LJIIIIZZ = C44694HgQ.LJIIIIZZ(path);
        boolean LJ = o.LJ(LJIIIIZZ.getScheme(), "file");
        if (C44694HgQ.LJIL(path) || OR7.LLLIILIL(new File(path)).length() != 0) {
            z = false;
        }
        if (C44694HgQ.LJIJI(path, z) || !LJ) {
            C78764Uvg.LIZJ(w5g, LJIIIIZZ, i, i);
        } else if (c162396Yx != null && (LIZ = c162396Yx.LIZ(path)) != null && !LIZ.isRecycled()) {
            w5g.setImageBitmap(LIZ);
        } else {
            C10K.LIZIZ(new Callable() { // from class: X.6Yv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String uri = LJIIIIZZ.toString();
                    int[] iArr = {0};
                    int i2 = i;
                    final C162396Yx c162396Yx2 = c162396Yx;
                    final String str = path;
                    final W5G w5g2 = w5g;
                    return Integer.valueOf(VEUtils.getVideoFrames(uri, iArr, -1, i2, false, new P5A() { // from class: X.6Yw
                        @Override // X.P5A
                        public final boolean processFrame(ByteBuffer byteBuffer, int i3, int i4, int i5) {
                            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                            C10K.LIZIZ(new ACallableS24S1300000_2(C162396Yx.this, str, createBitmap, w5g2, 0), C10K.LJIIIIZZ, null);
                            return false;
                        }
                    }));
                }
            }, C38995FSd.LIZLLL(), null);
        }
    }
}
