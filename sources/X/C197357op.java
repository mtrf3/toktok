package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import java.io.File;

/* renamed from: X.7op */
/* loaded from: classes4.dex */
public final class C197357op {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C197917pj.LJLIL);

    public static UrlModel LIZ(Aweme aweme) {
        UrlModel frontImage;
        UrlModel backImage;
        if (C00F.LIZ(31744, 0, "tt_now_widget_content", true) == 0) {
            if (aweme != null) {
                NowPostInfo nowPostInfo = aweme.nowPostInfo;
                if (nowPostInfo == null || (backImage = nowPostInfo.getBackImage()) == null) {
                    NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                    if (nowPostInfo2 != null) {
                        return nowPostInfo2.getFrontImage();
                    }
                } else {
                    return backImage;
                }
            }
        } else if (aweme != null) {
            NowPostInfo nowPostInfo3 = aweme.nowPostInfo;
            if (nowPostInfo3 != null && (frontImage = nowPostInfo3.getFrontImage()) != null) {
                return frontImage;
            }
            NowPostInfo nowPostInfo4 = aweme.nowPostInfo;
            if (nowPostInfo4 != null) {
                return nowPostInfo4.getBackImage();
            }
        }
        return null;
    }

    public static File LIZIZ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("now_widget");
        LIZ2.append(File.separator);
        LIZ2.append(str);
        LIZ2.append(".png");
        return C198227qE.LIZ(X1D.LIZIZ(LIZ2));
    }

    public static void LIZJ(ActivityC45651qj activityC45651qj, Aweme aweme) {
        if (C197887pg.LIZIZ || (C00F.LIZ(31744, 0, "tt_now_widget_guide_trigger", true) & 2) <= 0 || !C195347la.LIZ()) {
            return;
        }
        LIZLLL(activityC45651qj, "publish_popup", LIZ(aweme), false, C195937mX.LJFF(aweme));
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj, String str, UrlModel urlModel, boolean z, boolean z2) {
        if (urlModel != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
            LJII.LIZJ = activityC45651qj;
            LJII.LJIIIIZZ();
        }
        C197957pn c197957pn = new C197957pn(urlModel, str, z2);
        if (z) {
            PopupManager.LJIIL(c197957pn);
        } else {
            PopupManager.LIZ(c197957pn);
        }
    }

    public static /* synthetic */ void LJ(ActivityC45651qj activityC45651qj, String str, UrlModel urlModel, boolean z, int i) {
        boolean z2;
        if ((i & 4) != 0) {
            urlModel = null;
        }
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        LIZLLL(activityC45651qj, str, urlModel, z2, z);
    }
}
