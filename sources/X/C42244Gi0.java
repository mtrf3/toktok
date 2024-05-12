package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Gi0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42244Gi0 {
    public final C43598H9e LIZ;
    public final long LIZIZ;
    public final ShortVideoContext LIZJ;
    public final int LIZLLL;
    public final AVMusicWaveBean LJ;
    public final MultiEditVideoStatusRecordData LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42244Gi0)) {
            return false;
        }
        C42244Gi0 c42244Gi0 = (C42244Gi0) obj;
        return o.LJ(this.LIZ, c42244Gi0.LIZ) && this.LIZIZ == c42244Gi0.LIZIZ && o.LJ(this.LIZJ, c42244Gi0.LIZJ) && this.LIZLLL == c42244Gi0.LIZLLL && o.LJ(this.LJ, c42244Gi0.LJ) && o.LJ(this.LJFF, c42244Gi0.LJFF) && o.LJ(this.LJI, c42244Gi0.LJI) && o.LJ(this.LJII, c42244Gi0.LJII);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.LIZJ.hashCode() + JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31)) * 31) + this.LIZLLL) * 31;
        AVMusicWaveBean aVMusicWaveBean = this.LJ;
        int i = 0;
        if (aVMusicWaveBean == null) {
            hashCode = 0;
        } else {
            hashCode = aVMusicWaveBean.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LJFF;
        if (multiEditVideoStatusRecordData != null) {
            i = multiEditVideoStatusRecordData.hashCode();
        }
        return this.LJII.hashCode() + C79062V1e.LJ(this.LJI, (i2 + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditActionArgument(recordComponentModel=");
        LIZ.append(this.LIZ);
        LIZ.append(", videoConcatTime=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", shortVideoContext=");
        LIZ.append(this.LIZJ);
        LIZ.append(", cameraPosition=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", bean=");
        LIZ.append(this.LJ);
        LIZ.append(", recordData=");
        LIZ.append(this.LJFF);
        LIZ.append(", videoPath=");
        LIZ.append(this.LJI);
        LIZ.append(", audioPath=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    public C42244Gi0(C43598H9e recordComponentModel, long j, ShortVideoContext shortVideoContext, int i, AVMusicWaveBean aVMusicWaveBean, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String videoPath, String audioPath) {
        o.LJIIIZ(recordComponentModel, "recordComponentModel");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(audioPath, "audioPath");
        this.LIZ = recordComponentModel;
        this.LIZIZ = j;
        this.LIZJ = shortVideoContext;
        this.LIZLLL = i;
        this.LJ = aVMusicWaveBean;
        this.LJFF = multiEditVideoStatusRecordData;
        this.LJI = videoPath;
        this.LJII = audioPath;
    }
}
