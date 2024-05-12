package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HI5 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(HI6.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C44738Hh8.LJLIL);

    public static List LIZ() {
        String[] stringArray = ((Keva) LIZ.getValue()).getStringArray("key_last_published_vid", new String[0]);
        o.LJIIIIZZ(stringArray, "keva.getStringArray(KEY_…LISHED_VID, emptyArray())");
        return ORY.LJJZZIII(stringArray);
    }

    public static void LIZIZ(String str) {
        List LLJILJILJ = ORZ.LLJILJILJ(LIZ());
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        arrayList.add(str);
        if (arrayList.size() > 5) {
            ORS.LJJLJ(LLJILJILJ);
        }
        ((Keva) LIZ.getValue()).storeStringArray("key_last_published_vid", (String[]) arrayList.toArray(new String[0]));
    }

    public static void LIZJ(VideoPublishEditModel editModel, VEVideoEncodeSettings vEVideoEncodeSettings, boolean z, int i, boolean z2) {
        o.LJIIIZ(editModel, "editModel");
        HI4 hi4 = editModel.creativeModel.commonMobModel.vqCompileDataModel;
        VESize videoRes = vEVideoEncodeSettings.getVideoRes();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(videoRes.width);
        LIZ2.append('x');
        LIZ2.append(videoRes.height);
        hi4.LIZ = X1D.LIZIZ(LIZ2);
        hi4.LIZIZ = vEVideoEncodeSettings.getExternalSettingsJsonStr();
        hi4.LIZJ = z;
        hi4.LIZLLL = i;
        VESize watermarkVideoRes = vEVideoEncodeSettings.getWatermarkVideoRes();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(watermarkVideoRes.width);
        LIZ3.append('x');
        LIZ3.append(watermarkVideoRes.height);
        hi4.LJ = X1D.LIZIZ(LIZ3);
        hi4.LJFF = vEVideoEncodeSettings.getExternalSettingsJsonStr();
        hi4.LJI = vEVideoEncodeSettings.getEncodeStandard();
        hi4.LJII = z2;
    }
}
