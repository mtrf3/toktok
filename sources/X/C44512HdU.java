package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileSettings;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.gamora.editorpro.dynamic.PipLimit;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.HdU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44512HdU implements C5W8 {
    public static int LJ;
    public static final java.util.Map<String, String> LJFF = new LinkedHashMap();
    public final CreativeInfo LIZ;
    public boolean LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;

    public final String LIZLLL() {
        File file = new File((String) this.LIZJ.getValue());
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((String) this.LIZJ.getValue());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append('-');
        int i = LJ;
        LJ = i + 1;
        LIZ2.append(i);
        LIZ2.append("-concat-v.mp4");
        LIZ.append(C43075GvP.LIZ(X1D.LIZIZ(LIZ2)));
        String path = new File(X1D.LIZIZ(LIZ)).getPath();
        o.LJIIIIZZ(path, "File(cacheDir + ShortVid…x++}-concat-v.mp4\")).path");
        return path;
    }

    public final InterfaceC153045zY LJ() {
        return (InterfaceC153045zY) this.LIZLLL.getValue();
    }

    @Override // X.C5W8
    public final void destroy() {
        if (this.LIZIZ) {
            LJ().destroy();
        }
    }

    public C44512HdU(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.LIZ = creativeInfo;
        this.LIZJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 249));
        this.LIZLLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, LiveCoverMinSizeSetting.DEFAULT));
    }

    @Override // X.C5W8
    public final OSZ<Integer, Integer> LIZ(boolean z) {
        int i;
        int i2;
        int videoWidth = C60903NvH.LJIIJJI().LJJIJLIJ().getVideoWidth();
        int videoHeight = C60903NvH.LJIIJJI().LJJIJLIJ().getVideoHeight();
        PipLimit LIZIZ = C44514HdW.LIZIZ();
        if (!z || (i = LIZIZ.widthLimit) == -1 || (i2 = LIZIZ.heightLimit) == -1) {
            return new OSZ<>(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
        }
        if (i2 * i <= videoWidth * videoHeight) {
            return new OSZ<>(Integer.valueOf(i), Integer.valueOf(LIZIZ.heightLimit));
        }
        return new OSZ<>(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    public final void LIZJ(CutVideoCompileSettings cutVideoCompileSettings, C141555h1 c141555h1) {
        LJ().LLILLJJLI(1);
        List<VideoSegment> list = cutVideoCompileSettings.segments;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<VideoSegment> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C78926UyI.LJJJJJL(it.next()));
        }
        C44513HdV.LIZ(LJ(), arrayList);
        try {
            LJ().LLF(cutVideoCompileSettings.videoOutputPath, cutVideoCompileSettings.audioOutputPath, C44513HdV.LIZIZ(cutVideoCompileSettings), c141555h1);
        } catch (VEException e) {
            c141555h1.onCompileError(4118, 0, 0.0f, e.getMessage());
        }
    }

    @Override // X.C5W8
    public final void LIZIZ(VideoSegment videoSegment, boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr interfaceC88471Ynr) {
        NLEModel LJJ;
        NLETrack mainTrack;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        int min;
        int i;
        int i2;
        o.LJIIIZ(videoSegment, "videoSegment");
        String LJII = videoSegment.LJII(false);
        LJII.toString();
        String str = (String) ((LinkedHashMap) LJFF).get(LJII);
        if (str != null && C44687HgJ.LIZIZ(str)) {
            if (!s.LJJJLZIJ(str, this.LIZ.getCreationId(), false)) {
                String LIZLLL = LIZLLL();
                C44687HgJ.LIZLLL(str, LIZLLL);
                str = LIZLLL;
            }
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Float.valueOf(1.0f));
            }
            interfaceC88471Ynr.invoke(Boolean.TRUE, str);
            return;
        }
        String LIZLLL2 = LIZLLL();
        CutVideoCompileSettings LIZ = new C44555HeB(new C44557HeD(C47261Igj.LJJIJ(videoSegment), LIZLLL2, null, new CompileConfigResolution(-1, -1, null, null, 12, null), 0, 496)).LIZ();
        if (z2) {
            int min2 = Math.min(videoSegment.width, videoSegment.height);
            Math.max(videoSegment.width, videoSegment.height);
            OSZ LJIIIZ = C44660Hfs.LJIIIZ();
            ArrayList arrayList = new ArrayList();
            if (C44982Hl4.LIZ() && ((Boolean) C44675Hg7.LIZ.getValue()).booleanValue()) {
                arrayList.add(new C44680HgC());
                arrayList.add(new C44678HgA());
                arrayList.add(new C44679HgB(Math.max(1081, ((Number) LJIIIZ.getFirst()).intValue())));
            } else {
                arrayList.add(new C44522Hde());
                arrayList.add(new C44521Hdd());
                arrayList.add(new C44661Hft(Math.max(1081, ((Number) LJIIIZ.getFirst()).intValue())));
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer LIZIZ2 = ((InterfaceC44516HdY) it.next()).LIZIZ(min2);
                    if (LIZIZ2 != null) {
                        Integer valueOf = Integer.valueOf(LIZIZ2.intValue());
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            int LIZ2 = C44517HdZ.LIZ();
                            i2 = Math.min(videoSegment.LJI(), Math.min(intValue, LIZ2));
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("EditorPro SourceImportFps -> videoFPS = ");
                            LIZ3.append(videoSegment.LJI());
                            LIZ3.append(", maxVESupportFps = ");
                            LIZ3.append(LIZ2);
                            C1EU.LIZJ(LIZ3, ", fastImportFpsLimit = ", intValue, ", compileFps = ", i2);
                            C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
                        }
                    }
                }
            }
            i2 = 30;
            LIZ.LIZJ = i2;
        }
        C60903NvH.LJIIJJI().LJJIIJ();
        OSZ<Integer, Integer> LIZ4 = LIZ(z);
        H78.LIZIZ("CutOptimizedCompressVideoHelper", LIZ4 + "; setting " + LIZ);
        long currentTimeMillis = System.currentTimeMillis();
        List LJJIJ = C47261Igj.LJJIJ(LJII);
        C141555h1 c141555h1 = new C141555h1(interfaceC88471Ynr, LIZLLL2, this, currentTimeMillis, LJII, interfaceC88472Yns);
        C5KD c5kd = new C5KD((String[]) LJJIJ.toArray(new String[0]));
        C122034qd LJJI = C17N.LJJI(LJ());
        if (LJJI != null) {
            C5KA.LIZ(c5kd, LJJI.LJIIJ);
            LJ().LLLIIIIL(C1XY.LJIILL());
            LJ().LLILLJJLI(1);
            LJ().LLJ(LIZ4.getFirst().intValue(), LIZ4.getSecond().intValue());
            LJ().LLJLLL(true);
            if (LJ().prepare() != 0) {
                c141555h1.onCompileError(4118, 0, 0.0f, "prepare error, suspend by user");
                return;
            }
            if ((LIZ.LIZ == -1 || LIZ.LIZIZ == -1) && (LJJ = C17N.LJJ(LJ())) != null && (mainTrack = LJJ.getMainTrack()) != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(0, mainTrack.LJIILL())) != null && (LJI = nLETrackSlot.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                OSZ osz = new OSZ(Integer.valueOf((int) LIZIZ.LJI()), Integer.valueOf((int) LIZIZ.LIZIZ()));
                int min3 = Math.min(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue());
                int min4 = Math.min(LIZ4.getFirst().intValue(), LIZ4.getSecond().intValue());
                if (min3 > min4) {
                    float intValue2 = ((Number) osz.getSecond()).intValue() / ((Number) osz.getFirst()).floatValue();
                    if (intValue2 >= 1.0f) {
                        i = Math.min(((Number) osz.getFirst()).intValue(), min4);
                        min = (int) (i * intValue2);
                    } else {
                        min = Math.min(((Number) osz.getSecond()).intValue(), min4);
                        i = (int) (min / intValue2);
                    }
                    osz = new OSZ(Integer.valueOf(i), Integer.valueOf(min));
                }
                int intValue3 = ((Number) osz.getFirst()).intValue();
                int intValue4 = ((Number) osz.getSecond()).intValue();
                List<VideoSegment> segments = LIZ.segments;
                String videoOutputPath = LIZ.videoOutputPath;
                String str2 = LIZ.audioOutputPath;
                int i3 = LIZ.LIZJ;
                boolean z3 = LIZ.LIZLLL;
                VEVideoEncodeSettings.ENCODE_STANDARD encodeStandard = LIZ.LJ;
                VEVideoEncodeSettings.ENCODE_PROFILE encodeProfile = LIZ.LJFF;
                VEVideoEncodeSettings.ENCODE_BITRATE_MODE videoEncodeBitrateMode = LIZ.LJI;
                int i4 = LIZ.LJII;
                int i5 = LIZ.LJIIIIZZ;
                int i6 = LIZ.LJIIIZ;
                String externalSettings = LIZ.LJIIJ;
                boolean z4 = LIZ.LJIIJJI;
                Float f = LIZ.LJIIL;
                Float f2 = LIZ.LJIILIIL;
                o.LJIIIZ(segments, "segments");
                o.LJIIIZ(videoOutputPath, "videoOutputPath");
                o.LJIIIZ(encodeStandard, "encodeStandard");
                o.LJIIIZ(encodeProfile, "encodeProfile");
                o.LJIIIZ(videoEncodeBitrateMode, "videoEncodeBitrateMode");
                o.LJIIIZ(externalSettings, "externalSettings");
                LIZJ(new CutVideoCompileSettings(segments, videoOutputPath, str2, intValue3, intValue4, i3, z3, encodeStandard, encodeProfile, videoEncodeBitrateMode, i4, i5, i6, externalSettings, z4, f, f2), c141555h1);
                return;
            }
            LIZJ(LIZ, c141555h1);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
