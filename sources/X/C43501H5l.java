package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import kotlin.jvm.internal.AqS157S0100000_7;

/* renamed from: X.H5l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43501H5l extends AbstractC43498H5i {
    public String LJIILJJIL;
    public final C62822Ol8 LJIILL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 449));

    @Override // X.AbstractC43498H5i
    public final boolean LJIIL() {
        return false;
    }

    @Override // X.AbstractC43498H5i
    public final String LJIJI() {
        return "autocut";
    }

    @Override // X.AbstractC43498H5i
    public final InterfaceC43506H5q LJIILL() {
        return (InterfaceC43506H5q) this.LJIILL.getValue();
    }

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.AUTOCUT_TEMPLATE_UPLOAD;
    }

    @Override // X.AbstractC43498H5i
    public final String LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        if (!C45087Hml.LJJIJLIJ(videoPublishEditModel)) {
            return null;
        }
        return C136155Vz.LIZ(videoPublishEditModel);
    }

    @Override // X.AbstractC43498H5i
    public final String LJIJ(VideoPublishEditModel videoPublishEditModel) {
        return videoPublishEditModel.creativeModel.autoCutAnchorModel.templateZipPath;
    }

    @Override // X.AbstractC43498H5i
    public final String LJIILJJIL(CreateAwemeResponse createAwemeResponse, VideoPublishEditModel videoPublishEditModel) {
        String str;
        AutoCutModel autoCutModel = videoPublishEditModel.creativeModel.autoCutModel;
        AutoCutThemeData LJIJJLI = C45087Hml.LJIJJLI(autoCutModel.curIndexFromSource, AnonymousClass636.LJJ(autoCutModel.curSource), autoCutModel);
        if (LJIJJLI == null || (str = LJIJJLI.musicId) == null) {
            return "";
        }
        return str;
    }

    public final void LJIJJ(long j, Integer num, String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mobTemplateBinding: success: ");
        LIZ.append(z);
        LIZ.append(", duration: ");
        LIZ.append(j);
        LIZ.append(", errCode = ");
        LIZ.append(num);
        LIZ.append(", errMsg = ");
        LIZ.append(str);
        LIZ.append(", itemId = ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", vid = ");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", musicId = ");
        LIZ.append(this.LJIIJ);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZJ(num, "error_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("creation_id", this.LJFF);
        c145995oB.LJI("item_id", this.LJIIIIZZ);
        c145995oB.LJI("vid", this.LJIIIZ);
        c145995oB.LJI("track_id", this.LJIIJ);
        FMX.LJIIL("tool_performance_autocut_template_binding", c145995oB.LIZ);
    }

    public final void LJIJJLI(long j, Integer num, String str, boolean z) {
        Object obj;
        String str2 = this.LJIILJJIL;
        if (str2 != null) {
            obj = Float.valueOf(((float) C78496UrM.LIZ(str2)) / 1024.0f);
        } else {
            obj = -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mobTemplateUpload: success: ");
        LIZ.append(z);
        LIZ.append(", duration: ");
        LIZ.append(j);
        LIZ.append(", size = ");
        LIZ.append(obj);
        LIZ.append(", errCode = ");
        LIZ.append(num);
        C1DI.LIZIZ(LIZ, ", errMsg = ", str, ", itemId = ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", vid = ");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", musicId = ");
        LIZ.append(this.LJIIJ);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZJ(num, "error_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("creation_id", this.LJFF);
        c145995oB.LJI("item_id", this.LJIIIIZZ);
        c145995oB.LJI("vid", this.LJIIIZ);
        c145995oB.LIZJ(obj, "size");
        java.util.Map<String, String> map = c145995oB.LIZ;
        FMX.LJIIL("tool_performance_autocut_template_upload", map);
        C45049Hm9.LJJIFFI("tool_performance_autocut_template_upload", map, z);
    }

    public final void LJIL(long j, Integer num, String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mobUploadTos: success: ");
        LIZ.append(z);
        LIZ.append(", duration: ");
        LIZ.append(j);
        LIZ.append(", errCode = ");
        LIZ.append(num);
        LIZ.append(", errMsg = ");
        LIZ.append(str);
        LIZ.append(", zipUrl = ");
        LIZ.append(this.LJIILJJIL);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZJ(num, "error_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("zip_url", this.LJIILJJIL);
        c145995oB.LJI("creation_id", this.LJFF);
        FMX.LJIIL("tool_performance_autocut_template_tos", c145995oB.LIZ);
    }
}
