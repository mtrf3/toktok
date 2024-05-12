package X;

import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HeD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44557HeD {
    public final List<VideoSegment> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final CompileConfigResolution LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final VEVideoEncodeSettings.ENCODE_STANDARD LJII;
    public final int LJIIIIZZ;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        if (r2 == r1.ordinal()) goto L23;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C44557HeD(java.util.List r11, java.lang.String r12, java.lang.String r13, com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution r14, int r15, int r16) {
        /*
            r10 = this;
            r3 = r16
            r5 = r15
            r0 = r3 & 16
            r4 = 1
            if (r0 == 0) goto L9
            r5 = 1
        L9:
            r0 = r3 & 32
            r2 = 0
            if (r0 == 0) goto L50
            r6 = 1
        Lf:
            r0 = r3 & 64
            if (r0 == 0) goto L4e
            r7 = 1
        L14:
            r0 = r3 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L4c
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "creative_compile_import_encode_standard"
            int r2 = X.C00F.LIZ(r1, r2, r0, r4)
            com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD r8 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264
            int r0 = r8.ordinal()
            if (r2 != r0) goto L39
        L28:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L37
            r9 = 19
        L2e:
            r4 = r14
            r1 = r11
            r0 = r10
            r2 = r12
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L37:
            r9 = 0
            goto L2e
        L39:
            com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD r1 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_ByteVC1
            int r0 = r1.ordinal()
            if (r2 != r0) goto L43
        L41:
            r8 = r1
            goto L28
        L43:
            com.ss.android.vesdk.VEVideoEncodeSettings$ENCODE_STANDARD r1 = com.ss.android.vesdk.VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_MPEG4
            int r0 = r1.ordinal()
            if (r2 != r0) goto L28
            goto L41
        L4c:
            r8 = 0
            goto L28
        L4e:
            r7 = 0
            goto L14
        L50:
            r6 = 0
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44557HeD.<init>(java.util.List, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44557HeD(List<? extends VideoSegment> list, String videoPath, String str, CompileConfigResolution compileConfigResolution, int i, boolean z, boolean z2, VEVideoEncodeSettings.ENCODE_STANDARD encodeStandard, int i2) {
        o.LJIIIZ(videoPath, "videoPath");
        o.LJIIIZ(encodeStandard, "encodeStandard");
        this.LIZ = list;
        this.LIZIZ = videoPath;
        this.LIZJ = str;
        this.LIZLLL = compileConfigResolution;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = encodeStandard;
        this.LJIIIIZZ = i2;
    }
}
