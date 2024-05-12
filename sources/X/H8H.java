package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8H {
    public static final /* synthetic */ int LIZ = 0;

    public static /* synthetic */ void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, boolean z, int i) {
        Boolean bool;
        String str2;
        boolean z2 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if ((i & 32) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        LIZ(videoPublishEditModel, str, null, z2, bool, str2);
    }

    public static void LIZJ(int i, VideoPublishEditModel model, String str, boolean z, boolean z2) {
        o.LJIIIZ(model, "model");
        C145995oB LIZIZ = HHD.LIZIZ(model, str);
        LIZIZ.LIZ(z ? 1 : 0, "is_from_draft_popup");
        LIZIZ.LJI("enter_method_popup", HHD.LIZJ(model));
        LIZIZ.LIZ(HHD.LJI(model), "is_from_external");
        LIZIZ.LJI("enter_method", model.shootEnterMethod);
        LIZIZ.LIZ(i, "status");
        LIZIZ.LJI(WM7.SCENE_SERVICE, model.creativeModel.draftInfoModel.saveDraftScene);
        LIZIZ.LJI("is_posted_draft", C79004UzY.LJJJJLL(model.creativeModel.draftInfoModel.isPublishedDraft));
        LIZIZ.LJI("is_auto_save_after_post", C79004UzY.LJJJJLL(z2));
        FMX.LJIIL("save_draft_result", LIZIZ.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03bb  */
    /* JADX WARN: Type inference failed for: r1v103 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.5oB] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r9, java.lang.String r10, java.lang.Integer r11, boolean r12, java.lang.Boolean r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H8H.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.lang.String, java.lang.Integer, boolean, java.lang.Boolean, java.lang.String):void");
    }

    public static /* synthetic */ void LIZLLL(VideoPublishEditModel videoPublishEditModel, String str, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        LIZJ(i, videoPublishEditModel, str, z, z2);
    }
}
