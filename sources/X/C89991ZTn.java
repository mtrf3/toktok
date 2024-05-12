package X;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* renamed from: X.ZTn, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class C89991ZTn {
    public MediaMuxer LIZ;
    public final String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public EnumC89990ZTm LJ = EnumC89990ZTm.UNSET;

    public final void LIZ() {
        EnumC89990ZTm enumC89990ZTm = this.LJ;
        EnumC89990ZTm enumC89990ZTm2 = EnumC89990ZTm.UNSET;
        if (enumC89990ZTm == enumC89990ZTm2 || enumC89990ZTm == EnumC89990ZTm.RELEASED) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop mediamuxer  with invalid status ,current status is ");
            LIZ.append(this.LJ);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXHwMuxer");
            return;
        }
        if (!this.LIZLLL && enumC89990ZTm != EnumC89990ZTm.STOPED) {
            LIZIZ();
        }
        MediaMuxer mediaMuxer = this.LIZ;
        if (mediaMuxer != null) {
            mediaMuxer.release();
            this.LIZ = null;
        }
        this.LJ = enumC89990ZTm2;
    }

    public final void LIZIZ() {
        if (this.LJ != EnumC89990ZTm.STARTED) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop mediamuxer  with invalid status ,current status is ");
            LIZ.append(this.LJ);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXHwMuxer");
            return;
        }
        this.LIZLLL = true;
        MediaMuxer mediaMuxer = this.LIZ;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
        }
        this.LJ = EnumC89990ZTm.STOPED;
    }

    public C89991ZTn(String str) {
        this.LIZIZ = str;
    }

    public final int LIZJ(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.LJ != EnumC89990ZTm.STARTED) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("meidamuxer is not started,current status is ");
            LIZ.append(this.LJ);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILL("BXHwMuxer");
            return -607;
        }
        this.LIZ.writeSampleData(this.LIZJ, byteBuffer, bufferInfo);
        return 0;
    }
}
