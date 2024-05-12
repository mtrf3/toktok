package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* renamed from: X.GcD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41885GcD implements P5A {
    public final /* synthetic */ RecordScene LIZ;
    public final /* synthetic */ InterfaceC65052gv<C41881Gc9> LIZIZ;

    public C41885GcD(RecordScene recordScene, C73578SuE c73578SuE) {
        this.LIZ = recordScene;
        this.LIZIZ = c73578SuE;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(byteBuffer.array()));
        CreativeInfo creativeInfo = this.LIZ.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "recordScene.creativeInfo");
        String LJJJLIIL = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJJLIIL(creativeInfo);
        if (!C39579Fg7.LIZIZ(LJJJLIIL)) {
            C1I0.LIZJ(LJJJLIIL);
        }
        StringBuilder LIZ = X1D.LIZ();
        GWZ.LIZ = C72545SdZ.LIZLLL(LIZ, LJJJLIIL, "_cover_img.jpg", LIZ);
        C42300Giu.LIZ(createBitmap, new File(GWZ.LIZ), 70, Bitmap.CompressFormat.JPEG);
        C41884GcC.LIZIZ(GWZ.LIZ);
        ((C73578SuE) this.LIZIZ).onSuccess(C41884GcC.LIZIZ(GWZ.LIZ));
        return false;
    }
}
