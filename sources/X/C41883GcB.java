package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* renamed from: X.GcB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41883GcB implements P5A {
    public final /* synthetic */ VideoPublishEditModel LIZ;

    public C41883GcB(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    @Override // X.P5A
    public final boolean processFrame(ByteBuffer frame, int i, int i2, int i3) {
        o.LJIIIZ(frame, "frame");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(frame.position(0));
        Bitmap LIZJ = OUR.LIZJ(this.LIZ, createBitmap);
        if (TextUtils.isEmpty(this.LIZ.multiEditVideoRecordData.coverImagePath)) {
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
            CreativeInfo creativeInfo = videoPublishEditModel.creativeInfo;
            o.LJIIIIZZ(creativeInfo, "mModel.creativeInfo");
            multiEditVideoStatusRecordData.coverImagePath = C6BI.LIZJ(creativeInfo);
        }
        C42300Giu.LIZ(LIZJ, new File(this.LIZ.multiEditVideoRecordData.coverImagePath), 70, Bitmap.CompressFormat.JPEG);
        return false;
    }
}
