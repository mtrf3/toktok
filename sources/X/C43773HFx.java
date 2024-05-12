package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.i0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HFx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43773HFx extends AbstractC43762HFm {
    public final VideoPublishEditModel LIZLLL;
    public final String LJ;

    @Override // X.HGP
    public final String LIZ() {
        return "extract_custom_sticker";
    }

    @Override // X.AbstractC43762HFm
    public final List<HFD> LIZIZ() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        if (r1 != null) goto L12;
     */
    @Override // X.AbstractC43762HFm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.HGQ r6) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43773HFx.LJFF(X.HGQ):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43773HFx(HG7 frameContext, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel.creativeInfo);
        o.LJIIIZ(frameContext, "frameContext");
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        this.LIZLLL = videoPublishEditModel;
        String frameDir = this.LIZIZ.LIZIZ;
        this.LJ = frameDir;
        o.LJIIIIZZ(frameDir, "frameDir");
        String separator = File.separator;
        o.LJIIIIZZ(separator, "separator");
        if (!ujb.o.LJJJJ(frameDir, separator, false)) {
            this.LJ = i0.LJFF(frameDir, separator);
        }
        StringBuilder LIZ = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ, this.LJ, "custom_sticker", LIZ);
        this.LJ = LJFF;
        String LJFF2 = i0.LJFF(LJFF, separator);
        this.LJ = LJFF2;
        C1I0.LIZJ(LJFF2);
    }
}
