package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* renamed from: X.6qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173056qj {
    public static C188727au LIZ() {
        String str;
        String str2;
        C188727au c188727au = new C188727au();
        ShortVideoContext LIZ = C173046qi.LIZ();
        String str3 = null;
        if (LIZ != null) {
            str = LIZ.shootWay;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("shoot_way", str);
        ShortVideoContext LIZ2 = C173046qi.LIZ();
        if (LIZ2 != null) {
            str2 = LIZ2.LJI();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("creation_id", str2);
        c188727au.LJIIIZ("enter_from", "mv_preview");
        c188727au.LJIIIZ("content_type", C173046qi.LIZJ);
        c188727au.LJIIIZ("content_source", "upload");
        CutsameDataItem LIZIZ = C173046qi.LIZIZ();
        if (LIZIZ != null) {
            str3 = LIZIZ.templateId;
        }
        c188727au.LJIIIZ("mv_id", str3);
        return c188727au;
    }
}
