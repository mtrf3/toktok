package X;

import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileSettings;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HdV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44513HdV {
    public static VEVideoEncodeSettings LIZIZ(CutVideoCompileSettings cutVideoCompileSettings) {
        C87278YNe c87278YNe = new C87278YNe(2);
        boolean z = cutVideoCompileSettings.LIZLLL;
        VEVideoEncodeSettings vEVideoEncodeSettings = c87278YNe.LIZIZ;
        vEVideoEncodeSettings.isSupportHWEncoder = z;
        vEVideoEncodeSettings.encodeStandard = cutVideoCompileSettings.LJ.ordinal();
        c87278YNe.LJI(cutVideoCompileSettings.LJFF);
        c87278YNe.LJIIJ(cutVideoCompileSettings.LIZ, cutVideoCompileSettings.LIZIZ);
        c87278YNe.LJIIIIZZ(cutVideoCompileSettings.LJII);
        int i = cutVideoCompileSettings.LJIIIIZZ;
        VEVideoEncodeSettings vEVideoEncodeSettings2 = c87278YNe.LIZIZ;
        vEVideoEncodeSettings2.resizeMode = i;
        vEVideoEncodeSettings2.bitrateMode = cutVideoCompileSettings.LJI;
        vEVideoEncodeSettings2.compileType = VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4;
        c87278YNe.LJII(cutVideoCompileSettings.LIZJ);
        c87278YNe.LIZIZ.rotate = cutVideoCompileSettings.LJIIIZ;
        if (cutVideoCompileSettings.LJIIJ.length() > 0) {
            c87278YNe.LIZIZ.externalSettingsJsonStr = cutVideoCompileSettings.LJIIJ;
        }
        c87278YNe.LIZIZ.enableAvInterLeave = cutVideoCompileSettings.LJIIJJI;
        Float f = cutVideoCompileSettings.LJIIL;
        if (f != null) {
            c87278YNe.LIZIZ.resizeX = f.floatValue();
        }
        Float f2 = cutVideoCompileSettings.LJIILIIL;
        if (f2 != null) {
            c87278YNe.LIZIZ.resizeY = f2.floatValue();
        }
        VEVideoEncodeSettings LIZ = c87278YNe.LIZ();
        o.LJIIIIZZ(LIZ, "veVideoEncodeSettingsBuilder.build()");
        return LIZ;
    }

    public static ROTATE_DEGREE LIZJ(int i) {
        if (i != 90) {
            if (i != 180) {
                if (i != 270) {
                    return ROTATE_DEGREE.ROTATE_NONE;
                }
                return ROTATE_DEGREE.ROTATE_270;
            }
            return ROTATE_DEGREE.ROTATE_180;
        }
        return ROTATE_DEGREE.ROTATE_90;
    }

    public static void LIZ(InterfaceC153045zY veEditor, List videoList) {
        o.LJIIIZ(videoList, "videoList");
        o.LJIIIZ(veEditor, "veEditor");
        if (!videoList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            Iterator it = videoList.iterator();
            while (it.hasNext()) {
                EditVideoSegment editVideoSegment = (EditVideoSegment) it.next();
                String LIZ = C44414Hbu.LIZ(editVideoSegment.getVideoPath());
                arrayList2.add(Integer.valueOf((int) editVideoSegment.getVideoFileInfo().getDuration()));
                arrayList.add(editVideoSegment.getVideoPath());
                arrayList3.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getWidth()));
                arrayList4.add(Integer.valueOf(editVideoSegment.getVideoFileInfo().getHeight()));
                arrayList5.add(LIZ);
            }
            String metaInfo = HMI.LIZJ(false, true, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, null);
            o.LJIIIIZZ(metaInfo, "metaInfo");
            veEditor.LLILLL("description", metaInfo);
        }
    }
}
