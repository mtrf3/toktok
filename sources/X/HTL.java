package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.vesdk.VESize;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HTL implements P5A {
    public final /* synthetic */ HTN LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ InterfaceC67352kd<ReturnEcommerceCommentModel> LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
        String str;
        if (byteBuffer == null) {
            HTN htn = this.LIZ;
            C44108HSu.LIZJ(htn.LIZIZ, this.LIZIZ, "video", HTE.VIDEO_EXTRACT_FRAME_NULL, this.LIZJ, System.currentTimeMillis() - htn.LJIIL, new VESize(i, i2).toString());
            InterfaceC67352kd<ReturnEcommerceCommentModel> interfaceC67352kd = this.LIZLLL;
            C3C5.m7constructorimpl(null);
            interfaceC67352kd.resumeWith(null);
            return false;
        }
        int remaining = byteBuffer.remaining();
        byteBuffer.get(new byte[remaining], 0, remaining);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        String LIZ = this.LIZ.LJII.LIZ();
        o.LJIIIIZZ(LIZ, "photoPathGenerator.generatePhotoPath()");
        C42307Gj1.LJ(createBitmap, new File(LIZ), 100, Bitmap.CompressFormat.JPEG);
        if (LIZ.length() > 0 && C44687HgJ.LIZIZ(LIZ)) {
            str = C44694HgQ.LJIILIIL(LIZ);
            if (str == null) {
                str = "image/jpeg";
            }
        } else {
            str = "";
        }
        if (LIZ.length() == 0 || !C44687HgJ.LIZIZ(LIZ)) {
            HTN htn2 = this.LIZ;
            C44108HSu.LIZJ(htn2.LIZIZ, this.LIZIZ, "video", HTE.VIDEO_COVER_BIMAP_NULL, this.LIZJ, System.currentTimeMillis() - htn2.LJIIL, new VESize(i, i2).toString());
        } else {
            HTN htn3 = this.LIZ;
            C44108HSu.LJFF(htn3.LIZIZ, this.LJ, this.LIZIZ, "video", this.LIZJ, "video_extract_frame", System.currentTimeMillis() - htn3.LJIIL, new VESize(i, i2).toString());
        }
        createBitmap.recycle();
        long LJFF = C44694HgQ.LJFF(this.LJ);
        ReturnEcommerceCommentModel returnEcommerceCommentModel = new ReturnEcommerceCommentModel(this.LJFF, this.LJ, this.LIZIZ, Long.valueOf(LJFF), C44694HgQ.LJFF(this.LIZIZ), "video", LIZ, str);
        InterfaceC67352kd<ReturnEcommerceCommentModel> interfaceC67352kd2 = this.LIZLLL;
        C3C5.m7constructorimpl(returnEcommerceCommentModel);
        interfaceC67352kd2.resumeWith(returnEcommerceCommentModel);
        return false;
    }

    public HTL(HTN htn, String str, String str2, C84654XKg c84654XKg, String str3, int i) {
        this.LIZ = htn;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c84654XKg;
        this.LJ = str3;
        this.LJFF = i;
    }
}
