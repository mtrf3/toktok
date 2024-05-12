package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.5o0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145885o0 {
    public static Boolean LIZIZ;
    public static Boolean LIZJ;
    public static final C145885o0 LIZ = new C145885o0();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C145895o1.LJLIL);

    public static int LIZ() {
        return ((Number) LIZLLL.getValue()).intValue();
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        String str;
        if (LIZJ(videoPublishEditModel, true)) {
            return true;
        }
        if (videoPublishEditModel != null && LIZLLL(videoPublishEditModel)) {
            Boolean bool = LIZJ;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return true;
                }
            } else {
                if (LIZ() == 3) {
                    LIZJ = Boolean.TRUE;
                    return true;
                }
                C44423Hc3 LJ = C73098SmU.LJ();
                if (LJ != null) {
                    str = LJ.getUid();
                } else {
                    str = null;
                }
                if (LIZ() == 4) {
                    C78934UyQ.LJLIL.getCommerceService();
                    if (HH2.LIZ() >= 10000 || C135125Sa.LIZIZ(str)) {
                        if (str != null) {
                            C65429Pm5.LJ("large_followings", str, C135125Sa.LIZ(), true);
                        }
                        LIZJ = Boolean.TRUE;
                        return true;
                    }
                }
                LIZJ = Boolean.FALSE;
            }
        }
        return false;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (!C44384HbQ.LLILII(videoPublishEditModel) || !C151965xo.LIZJ(videoPublishEditModel) || (!C145805ns.LIZ() && !C132385Hm.LJII(videoPublishEditModel))) {
            return false;
        }
        if (videoPublishEditModel.isPhotoMvMode || H7R.LJJIL(videoPublishEditModel)) {
            Boolean bool = Boolean.FALSE;
            LIZIZ = bool;
            LIZJ = bool;
            videoPublishEditModel.getEditorProModel().setEditorProEntryForceNormalStyle(true);
            return false;
        }
        if (H7R.LJJJI(videoPublishEditModel) && videoPublishEditModel.getEditorProModel().getEditorProEntryForceNormalStyle()) {
            return false;
        }
        if (LIZIZ == null && LIZJ == null) {
            videoPublishEditModel.getEditorProModel().setEditorProEntryForceNormalStyle(false);
        }
        return true;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        String str;
        if (videoPublishEditModel == null) {
            return false;
        }
        if (z && !LIZLLL(videoPublishEditModel)) {
            return false;
        }
        Boolean bool = LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (LIZ() == 1) {
            LIZIZ = Boolean.TRUE;
            return true;
        }
        C44423Hc3 LJ = C73098SmU.LJ();
        if (LJ != null) {
            str = LJ.getUid();
        } else {
            str = null;
        }
        if (LIZ() == 2) {
            C78934UyQ.LJLIL.getCommerceService();
            if (HH2.LIZ() >= 10000 || C135125Sa.LIZIZ(str)) {
                if (str != null) {
                    C65429Pm5.LJ("large_followings", str, C135125Sa.LIZ(), true);
                }
                LIZIZ = Boolean.TRUE;
                return true;
            }
        }
        LIZIZ = Boolean.FALSE;
        return false;
    }
}
