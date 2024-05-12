package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;
import v5.n;

/* renamed from: X.HLh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43913HLh implements VERecorder.IVEFrameShotScreenCallback {
    public final /* synthetic */ n<C76800UCe> LIZ;
    public final /* synthetic */ WY8 LIZIZ;

    public C43913HLh(n<C76800UCe> nVar, WY8 wy8) {
        this.LIZ = nVar;
        this.LIZIZ = wy8;
    }

    @Override // com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback
    public final void onShotScreen(VEFrame vEFrame, int i) {
        Bitmap bitmap;
        if (this.LIZ.LIZ.LJIILIIL() || vEFrame == null || (bitmap = vEFrame.toBitmap()) == null) {
            return;
        }
        this.LIZ.LIZJ(C76800UCe.LIZ);
        int i2 = C54846Lfm.LJLJJI[0];
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i2 < width) {
            height = (int) (((height * 1.0d) / width) * i2);
        } else {
            i2 = width;
        }
        Bitmap resultBitmap = BitmapUtils.resizeBitmap(bitmap, i2, height);
        WY8 wy8 = this.LIZIZ;
        CreativeInfo creativeInfo = ((ShortVideoContext) wy8.LJLLLLLL.LIZ(wy8, WY8.LJZ[3])).creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContext.creativeInfo");
        String LIZ = C43653HBh.LIZ(creativeInfo);
        o.LJIIIIZZ(resultBitmap, "resultBitmap");
        C44729Hgz.LJJJJLI(resultBitmap, LIZ, null, 6);
    }
}
