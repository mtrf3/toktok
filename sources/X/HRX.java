package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.UploadSingleSelectData;
import defpackage.e1;

/* loaded from: classes8.dex */
public final class HRX {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZJ() {
        boolean LIZ2;
        if (C45871HzP.LIZ()) {
            LIZ2 = ((Boolean) HRY.LIZ.getValue()).booleanValue();
        } else {
            LIZ2 = e1.LIZ(31744, "studio_enable_autocut_edit", true, false);
        }
        if (LIZ2 && LJ()) {
            return true;
        }
        return false;
    }

    public static final int LIZ() {
        return C00F.LIZ(31744, 0, "autocut_anchor_album_style", true);
    }

    public static final boolean LIZIZ() {
        C78934UyQ.LJLIL.LIZLLL().getClass();
        if (C00F.LIZ(31744, 0, "autocut_support_anchor", true) != 1 || C1DG.LJIIIIZZ()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL() {
        if (C00F.LIZ(31744, 0, "support_original_music_for_autocut", true) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJI() {
        if (C00F.LIZ(31744, 0, "autocut_album_entrance_no_icon", true) != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJII() {
        C78934UyQ.LJLIL.LIZLLL().getClass();
        if (C00F.LIZ(31744, 0, "show_autocut_anchor", true) != 1) {
            return false;
        }
        if ((CommerceMediaServiceImpl.LIZJ().LIZ() && !e1.LIZ(31744, "studio_autocut_enable_ttba_anchor", true, false)) || !LIZIZ()) {
            return false;
        }
        return true;
    }

    public static boolean LJ() {
        UploadSingleSelectData LIZ2 = HRV.LIZ();
        if (LIZ2 == null || !HRV.LIZJ() || !LIZ2.getUploadSingleSelect() || !LIZ2.getUpload3Columns() || !LIZ2.getUploadRememberLastChoice()) {
            return false;
        }
        return true;
    }

    public static final boolean LJFF() {
        if (C44084HRw.LIZ() && LJ()) {
            return true;
        }
        return false;
    }
}
