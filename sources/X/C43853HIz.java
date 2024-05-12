package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.vesdk.VEInfo;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HIz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43853HIz implements HJ0 {
    public File LJLIL;
    public final /* synthetic */ ShortVideoContext LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;

    public C43853HIz(ShortVideoContext shortVideoContext, List<String> list) {
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = list;
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String msg) {
        o.LJIIIZ(msg, "msg");
        if (i == VEInfo.TE_RECORD_INFO_MIC_AUDIO_LOUDNESS) {
            Workspace workspace = this.LJLILLLLZI.cameraComponentModel.mWorkspace;
            if (workspace == null) {
                return;
            }
            File[] LJJJLL = workspace.LJLIL.LJJJLL();
            o.LJIIIIZZ(LJJJLL, "shortVideoContext.workspace.audioSegmentFiles");
            List<String> list = this.LJLJI;
            for (File file : LJJJLL) {
                if (!list.contains(file.getAbsolutePath())) {
                    this.LJLIL = file;
                    String absolutePath = file.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath, "it.absolutePath");
                    list.add(absolutePath);
                }
            }
            File file2 = this.LJLIL;
            if (file2 != null) {
                ShortVideoContext shortVideoContext = this.LJLILLLLZI;
                if (shortVideoContext.creativeModel.loudnessBalanceModel.loudnessMap.get(file2.getAbsolutePath()) == null) {
                    java.util.Map<String, LoudnessDetectResult> map = shortVideoContext.creativeModel.loudnessBalanceModel.loudnessMap;
                    String absolutePath2 = file2.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath2, "absolutePath");
                    LoudnessDetectResult loudnessDetectResult = new LoudnessDetectResult(0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, 15, null);
                    loudnessDetectResult.result = 0;
                    loudnessDetectResult.avgLoudness = f;
                    String absolutePath3 = file2.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath3, "absolutePath");
                    loudnessDetectResult.audioPath = absolutePath3;
                    map.put(absolutePath2, loudnessDetectResult);
                } else {
                    LoudnessDetectResult loudnessDetectResult2 = shortVideoContext.creativeModel.loudnessBalanceModel.loudnessMap.get(file2.getAbsolutePath());
                    if (loudnessDetectResult2 != null) {
                        loudnessDetectResult2.avgLoudness = f;
                    }
                }
            }
            H78.LIZIZ("LoudnessNormalization", "VECommonCallback AUDIO_LOUDNESS type:" + i + " ext:" + i2 + " f:" + f + " msg:" + msg);
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_MIC_AUDIO_LOUDNESS_PEAK) {
            Workspace workspace2 = this.LJLILLLLZI.cameraComponentModel.mWorkspace;
            if (workspace2 == null) {
                return;
            }
            File[] LJJJLL2 = workspace2.LJLIL.LJJJLL();
            o.LJIIIIZZ(LJJJLL2, "shortVideoContext.workspace.audioSegmentFiles");
            List<String> list2 = this.LJLJI;
            for (File file3 : LJJJLL2) {
                if (!list2.contains(file3.getAbsolutePath())) {
                    this.LJLIL = file3;
                    String absolutePath4 = file3.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath4, "it.absolutePath");
                    list2.add(absolutePath4);
                }
            }
            File file4 = this.LJLIL;
            if (file4 != null) {
                ShortVideoContext shortVideoContext2 = this.LJLILLLLZI;
                if (shortVideoContext2.creativeModel.loudnessBalanceModel.loudnessMap.get(file4.getAbsolutePath()) == null) {
                    java.util.Map<String, LoudnessDetectResult> map2 = shortVideoContext2.creativeModel.loudnessBalanceModel.loudnessMap;
                    String absolutePath5 = file4.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath5, "absolutePath");
                    LoudnessDetectResult loudnessDetectResult3 = new LoudnessDetectResult(0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, 15, null);
                    loudnessDetectResult3.result = 0;
                    loudnessDetectResult3.peakLoudness = f;
                    String absolutePath6 = file4.getAbsolutePath();
                    o.LJIIIIZZ(absolutePath6, "absolutePath");
                    loudnessDetectResult3.audioPath = absolutePath6;
                    map2.put(absolutePath5, loudnessDetectResult3);
                } else {
                    LoudnessDetectResult loudnessDetectResult4 = shortVideoContext2.creativeModel.loudnessBalanceModel.loudnessMap.get(file4.getAbsolutePath());
                    if (loudnessDetectResult4 != null) {
                        loudnessDetectResult4.peakLoudness = f;
                    }
                }
            }
            H78.LIZIZ("LoudnessNormalization", "VECommonCallback AUDIO_LOUDNESS_PEAK type:" + i + " ext:" + i2 + " f:" + f + " msg:" + msg);
            return;
        }
        if (i == VEInfo.TE_RECORD_INFO_RECORD_STOPPED) {
            this.LJLIL = null;
            return;
        }
        if (i == VEInfo.TE_INFO_DELETE_LAST_FRAG_DONE_NOTIFY) {
            this.LJLJI.clear();
            File[] LJJJLL3 = this.LJLILLLLZI.cameraComponentModel.mWorkspace.LJLIL.LJJJLL();
            o.LJIIIIZZ(LJJJLL3, "shortVideoContext.workspace.audioSegmentFiles");
            List<String> list3 = this.LJLJI;
            for (File file5 : LJJJLL3) {
                String absolutePath7 = file5.getAbsolutePath();
                o.LJIIIIZZ(absolutePath7, "it.absolutePath");
                list3.add(absolutePath7);
            }
        }
    }
}
