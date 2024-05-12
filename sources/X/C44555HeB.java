package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.cut.CutVideoCompileSettings;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;

/* renamed from: X.HeB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44555HeB {
    public final C44557HeD LIZ;

    public final CutVideoCompileSettings LIZ() {
        boolean z;
        String externalSettingsJsonStr;
        C44650Hfi LJIIZILJ = C78685UuP.LJIIZILJ();
        LJIIZILJ.LIZIZ(C44583Hed.LIZ, new AqS173S0100000_7(this, 439));
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams = (VEVideoEncodeConfigParams) LJIIZILJ.execute();
        C44557HeD c44557HeD = this.LIZ;
        List<VideoSegment> list = c44557HeD.LIZ;
        String str = c44557HeD.LIZIZ;
        String str2 = c44557HeD.LIZJ;
        int width = c44557HeD.LIZLLL.getWidth();
        int height = this.LIZ.LIZLLL.getHeight();
        int fps = vEVideoEncodeConfigParams.getFps();
        if (this.LIZ.LJFF) {
            z = vEVideoEncodeConfigParams.isSupportHWEncoder();
        } else {
            z = false;
        }
        C44557HeD c44557HeD2 = this.LIZ;
        VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = c44557HeD2.LJII;
        int i = c44557HeD2.LJ;
        String str3 = "";
        if (c44557HeD2.LJI && (externalSettingsJsonStr = vEVideoEncodeConfigParams.getExternalSettingsJsonStr()) != null) {
            str3 = externalSettingsJsonStr;
        }
        return new CutVideoCompileSettings(list, str, str2, width, height, fps, z, encode_standard, null, null, this.LIZ.LJIIIIZZ, i, 0, str3, false, this.LIZ.LIZLLL.getResizeX(), this.LIZ.LIZLLL.getResizeY(), 21248, null);
    }

    public C44555HeB(C44557HeD c44557HeD) {
        this.LIZ = c44557HeD;
    }
}
