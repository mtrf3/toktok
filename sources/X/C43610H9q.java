package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.H9q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43610H9q implements HKO {
    public final String LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public long LJFF = -1;
    public long LJI = -1;
    public long LJII = -1;
    public List<? extends MediaModel> LJIIIIZZ = C61878OQg.INSTANCE;

    @Override // X.HKP
    public final void LIZIZ(C43645HAz c43645HAz, boolean z) {
    }

    @Override // X.HKO
    public final void onExit() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateDownloadMobCallback cancel reuse autocut template: templateId = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicId = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", duration = ");
        LIZ.append(C45049Hm9.LIZLLL(this.LJFF));
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C188727au c188727au = new C188727au();
        c188727au.LJ(C45049Hm9.LIZLLL(this.LJFF), "duration");
        c188727au.LJIIIZ("creation_id", this.LIZ);
        c188727au.LJIIIZ("template_id", this.LIZJ);
        c188727au.LJIIIZ("music_id", this.LIZLLL);
        c188727au.LIZLLL(this.LJ, "designated_material_count");
        List<? extends MediaModel> list = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.LJI()) {
                arrayList.add(mediaModel);
            }
        }
        c188727au.LIZLLL(arrayList.size(), "video_count");
        List<? extends MediaModel> list2 = this.LJIIIIZZ;
        ArrayList arrayList2 = new ArrayList();
        for (MediaModel mediaModel2 : list2) {
            if (!mediaModel2.LJI()) {
                arrayList2.add(mediaModel2);
            }
        }
        c188727au.LIZLLL(arrayList2.size(), "photo_count");
        FMX.LJIIL("tool_performance_autocut_anchor_cancel", c188727au.LIZ);
    }

    @Override // X.HKO
    public final void LIZJ(List<? extends MediaModel> mediaList) {
        o.LJIIIZ(mediaList, "mediaList");
        this.LJII = System.currentTimeMillis();
        this.LJIIIIZZ = mediaList;
    }

    @Override // X.HKO
    public final void LJ(List<HJU> mediaList) {
        o.LJIIIZ(mediaList, "mediaList");
        LJI(null, null, true);
        this.LJI = System.currentTimeMillis();
    }

    @Override // X.HKP
    public final void LIZLLL(C43611H9r c43611H9r, boolean z) {
        if (!z) {
            LJII(null, null, true);
        }
    }

    @Override // X.HKP
    public final void LIZ(String str, String str2, boolean z) {
        this.LJFF = System.currentTimeMillis();
    }

    @Override // X.HKP
    public final void LJFF(int i, String str, boolean z) {
        if (z) {
            return;
        }
        if (i == 1001) {
            LJI(Integer.valueOf(i), str, false);
        } else {
            LJII(Integer.valueOf(i), str, false);
        }
    }

    public final void LJI(Integer num, String str, boolean z) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateDownloadMobCallback compress media ");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        LIZ.append(str2);
        LIZ.append(": templateId = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicId = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", errCode = ");
        LIZ.append(num);
        LIZ.append(", errMsg = ");
        LIZ.append(str);
        LIZ.append(", duration = ");
        LIZ.append(C45049Hm9.LIZLLL(this.LJII));
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(!z ? 1 : 0, "status");
        c188727au.LJFF(num, "error_code");
        c188727au.LJIIIZ("error_msg", str);
        c188727au.LJ(C45049Hm9.LIZLLL(this.LJII), "duration");
        c188727au.LJIIIZ("creation_id", this.LIZ);
        List<? extends MediaModel> list = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList();
        for (MediaModel mediaModel : list) {
            if (mediaModel.LJI()) {
                arrayList.add(mediaModel);
            }
        }
        c188727au.LIZLLL(arrayList.size(), "video_count");
        List<? extends MediaModel> list2 = this.LJIIIIZZ;
        ArrayList arrayList2 = new ArrayList();
        for (MediaModel mediaModel2 : list2) {
            if (!mediaModel2.LJI()) {
                arrayList2.add(mediaModel2);
            }
        }
        c188727au.LIZLLL(arrayList2.size(), "photo_count");
        FMX.LJIIL("tool_performance_autocut_anchor_compress_media", c188727au.LIZ);
    }

    public final void LJII(Integer num, String str, boolean z) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutTemplateDownloadMobCallback fetch template ");
        if (z) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        LIZ.append(str2);
        LIZ.append(": templateId = ");
        LIZ.append(this.LIZJ);
        LIZ.append(", musicId = ");
        LIZ.append(this.LIZLLL);
        LIZ.append(", errCode = ");
        LIZ.append(num);
        LIZ.append(", errMsg = ");
        LIZ.append(str);
        LIZ.append(", isPreload = ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration = ");
        LIZ.append(C45049Hm9.LIZLLL(this.LJII));
        LIZ.append(", clip num = ");
        LIZ.append(this.LJ);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(!z ? 1 : 0, "status");
        c188727au.LJFF(num, "error_code");
        c188727au.LJIIIZ("error_msg", str);
        c188727au.LJ(C45049Hm9.LIZLLL(this.LJI), "duration");
        c188727au.LJIIIZ("creation_id", this.LIZ);
        c188727au.LJIIIZ("template_id", this.LIZJ);
        c188727au.LIZLLL(!this.LIZIZ ? 1 : 0, "is_preload");
        c188727au.LJIIIZ("music_id", this.LIZLLL);
        c188727au.LIZLLL(this.LJ, "designated_material_count");
        java.util.Map<String, String> map = c188727au.LIZ;
        FMX.LJIIL("tool_performance_autocut_fetch_template", map);
        C45049Hm9.LJJIFFI("tool_performance_autocut_fetch_template", map, z);
    }

    public C43610H9q(int i, String str, boolean z, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = i;
    }
}
