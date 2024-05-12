package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HHq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43818HHq {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        UploadSingleSelectData LIZ2 = HRV.LIZ();
        if (LIZ2 == null || !HRV.LIZJ() || !LIZ2.getUploadSingleSelect() || !LIZ2.getUpload3Columns() || !LIZ2.getUploadRememberLastChoice()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (X.C43820HHs.LIZ() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(int r1, java.lang.Integer r2) {
        /*
            X.HHr r0 = X.C43819HHr.LIZ
            r0.getClass()
            boolean r0 = X.C43819HHr.LIZ()
            if (r0 != 0) goto L16
            X.HHs r0 = X.C43820HHs.LIZ
            r0.getClass()
            boolean r0 = X.C43820HHs.LIZ()
            if (r0 == 0) goto L31
        L16:
            boolean r0 = X.C145805ns.LIZ()
            if (r0 == 0) goto L31
            if (r1 != 0) goto L31
            if (r2 != 0) goto L28
        L20:
            boolean r0 = LIZIZ()
            if (r0 == 0) goto L31
            r0 = 1
        L27:
            return r0
        L28:
            int r1 = r2.intValue()
            r0 = 25
            if (r1 == r0) goto L31
            goto L20
        L31:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43818HHq.LIZ(int, java.lang.Integer):boolean");
    }

    public static boolean LIZJ(List mediaList, MyMediaModel myMediaModel) {
        long j;
        o.LJIIIZ(mediaList, "mediaList");
        if (!C145805ns.LIZ() || !LIZIZ()) {
            return false;
        }
        C43819HHr.LIZ.getClass();
        if (!C43819HHr.LIZ()) {
            C43820HHs.LIZ.getClass();
            if (!C43820HHs.LIZ()) {
                return false;
            }
        }
        if (C00F.LIZ(31744, 0, "studio_editor_pro_change_autocut_to_ep_album_page", true) == 2) {
            if (mediaList.isEmpty() && myMediaModel == null) {
                return false;
            }
            C78934UyQ.LJLIL.getCommerceService();
            if (HH2.LIZ() <= 10000) {
                return false;
            }
            return true;
        }
        long j2 = 0;
        if (mediaList.isEmpty() && myMediaModel != null && myMediaModel.duration > 60000) {
            return true;
        }
        Iterator it = mediaList.iterator();
        while (it.hasNext()) {
            MediaModel mediaModel = (MediaModel) it.next();
            if (mediaModel.LJ()) {
                j = 3000;
            } else {
                j = mediaModel.duration;
            }
            j2 += j;
        }
        if (j2 <= 60000) {
            return false;
        }
        return true;
    }
}
