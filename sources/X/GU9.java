package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GU9 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final VideoPublishEditModel LJ;
    public final NLENode LJFF;
    public final boolean LJI;
    public final SynthetiseResult LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final long LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GU9() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r6 = 2047(0x7ff, float:2.868E-42)
            r0 = r7
            r2 = r1
            r3 = r1
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GU9.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GU9)) {
            return false;
        }
        GU9 gu9 = (GU9) obj;
        return o.LJ(this.LIZ, gu9.LIZ) && o.LJ(this.LIZIZ, gu9.LIZIZ) && o.LJ(this.LIZJ, gu9.LIZJ) && this.LIZLLL == gu9.LIZLLL && o.LJ(this.LJ, gu9.LJ) && o.LJ(this.LJFF, gu9.LJFF) && this.LJI == gu9.LJI && o.LJ(this.LJII, gu9.LJII) && this.LJIIIIZZ == gu9.LJIIIIZZ && this.LJIIIZ == gu9.LJIIIZ && this.LJIIJ == gu9.LJIIJ;
    }

    public final String toString() {
        return "SaveLocalInfo(creationId=" + this.LIZ + ", publishId=" + this.LIZIZ + ", flowId=" + this.LIZJ + ", isEdited=" + this.LIZLLL + ", realModel=" + this.LJ + ", originalNode=" + this.LJFF + ", needRestart=" + this.LJI + ", compileResult=" + this.LJII + ", isImageMode=" + this.LJIIIIZZ + ", hasStickers=" + this.LJIIIZ + ", startTime=" + this.LJIIJ + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZJ, (hashCode4 + hashCode) * 31, 31);
        boolean z = this.LIZLLL;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LJ + i3) * 31;
        VideoPublishEditModel videoPublishEditModel = this.LJ;
        if (videoPublishEditModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = videoPublishEditModel.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        NLENode nLENode = this.LJFF;
        if (nLENode == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = nLENode.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        boolean z2 = this.LJI;
        int i7 = z2;
        if (z2 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        SynthetiseResult synthetiseResult = this.LJII;
        if (synthetiseResult != null) {
            i = synthetiseResult.hashCode();
        }
        int i9 = (i8 + i) * 31;
        boolean z3 = this.LJIIIIZZ;
        int i10 = z3;
        if (z3 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        if (!this.LJIIIZ) {
            i2 = 0;
        }
        return C16880lQ.LLJIJIL(this.LJIIJ) + ((i11 + i2) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ GU9(java.lang.String r15, java.lang.String r16, com.bytedance.ies.nle.editor_jni.NLENode r17, boolean r18, boolean r19, int r20) {
        /*
            r14 = this;
            r1 = r20
            r11 = r19
            r2 = r15
            r10 = r18
            r0 = r1 & 1
            java.lang.String r4 = ""
            if (r0 == 0) goto Le
            r2 = r4
        Le:
            r0 = r1 & 2
            r7 = 0
            if (r0 == 0) goto L46
            r3 = r4
        L14:
            r0 = r1 & 4
            if (r0 == 0) goto L43
        L18:
            r0 = r1 & 8
            if (r0 == 0) goto L41
            r5 = 1
        L1d:
            r6 = 0
            r0 = r1 & 32
            if (r0 == 0) goto L3e
        L22:
            r8 = 0
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L28
            r10 = 0
        L28:
            r0 = r1 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L2d
            r11 = 0
        L2d:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L3b
            long r12 = java.lang.System.currentTimeMillis()
        L35:
            r1 = r14
            r9 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L3b:
            r12 = 0
            goto L35
        L3e:
            r7 = r17
            goto L22
        L41:
            r5 = 0
            goto L1d
        L43:
            r4 = r16
            goto L18
        L46:
            r3 = r7
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GU9.<init>(java.lang.String, java.lang.String, com.bytedance.ies.nle.editor_jni.NLENode, boolean, boolean, int):void");
    }

    public static GU9 LIZ(GU9 gu9, String str, boolean z, VideoPublishEditModel videoPublishEditModel, boolean z2, SynthetiseResult synthetiseResult, int i) {
        String creationId;
        String flowId;
        boolean z3;
        boolean z4;
        long j;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        boolean z5 = z2;
        String str2 = str;
        boolean z6 = z;
        NLENode nLENode = null;
        if ((i & 1) != 0) {
            creationId = gu9.LIZ;
        } else {
            creationId = null;
        }
        if ((i & 2) != 0) {
            str2 = gu9.LIZIZ;
        }
        if ((i & 4) != 0) {
            flowId = gu9.LIZJ;
        } else {
            flowId = null;
        }
        if ((i & 8) != 0) {
            z6 = gu9.LIZLLL;
        }
        if ((i & 16) != 0) {
            videoPublishEditModel2 = gu9.LJ;
        }
        if ((i & 32) != 0) {
            nLENode = gu9.LJFF;
        }
        if ((i & 64) != 0) {
            z5 = gu9.LJI;
        }
        if ((i & 128) != 0) {
            synthetiseResult2 = gu9.LJII;
        }
        if ((i & 256) != 0) {
            z3 = gu9.LJIIIIZZ;
        } else {
            z3 = false;
        }
        if ((i & 512) != 0) {
            z4 = gu9.LJIIIZ;
        } else {
            z4 = false;
        }
        if ((i & 1024) != 0) {
            j = gu9.LJIIJ;
        } else {
            j = 0;
        }
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(flowId, "flowId");
        return new GU9(creationId, str2, flowId, z6, videoPublishEditModel2, nLENode, z5, synthetiseResult2, z3, z4, j);
    }

    public GU9(String creationId, String str, String flowId, boolean z, VideoPublishEditModel videoPublishEditModel, NLENode nLENode, boolean z2, SynthetiseResult synthetiseResult, boolean z3, boolean z4, long j) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(flowId, "flowId");
        this.LIZ = creationId;
        this.LIZIZ = str;
        this.LIZJ = flowId;
        this.LIZLLL = z;
        this.LJ = videoPublishEditModel;
        this.LJFF = nLENode;
        this.LJI = z2;
        this.LJII = synthetiseResult;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
        this.LJIIJ = j;
    }
}
