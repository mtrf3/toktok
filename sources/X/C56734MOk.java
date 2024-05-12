package X;

import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MOk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56734MOk {
    public static List LIZ() {
        C56732MOi c56732MOi;
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C56732MOi(C56702MNe.LIZ, R.string.iwp, R.raw.icon_bubble_line_fill, R.string.iw5, R.string.iwg, Integer.valueOf(R.raw.icon_large_inbox)));
        boolean LJ = FavoriteServiceImpl.LJIJJLI().LJ();
        Integer valueOf = Integer.valueOf(R.raw.icon_large_heart);
        if (LJ) {
            arrayList.add(new C56732MOi(3, R.string.iyg, R.raw.icon_heart_fill, R.string.iyg, R.string.iyj, valueOf));
        } else {
            arrayList.add(new C56732MOi(3, R.string.iwv, R.raw.icon_heart_fill, R.string.ix4, R.string.ix3, valueOf));
        }
        arrayList.add(new C56732MOi(44, R.string.iws, R.raw.icon_bubble_ellipsis_right_fill, R.string.iwc, R.string.iwb, Integer.valueOf(R.raw.icon_large_comment)));
        if (QnaService.LIZ().enablePublicQna() || C234869Jq.LIZ()) {
            if (C234869Jq.LIZ()) {
                C5H3 c5h3 = C26306AUc.LIZ;
                if (((Number) c5h3.getValue()).intValue() == 1) {
                    i = R.string.be5;
                } else {
                    i = R.string.bct;
                }
                int LIZ = C226388uY.LIZ(R.raw.icon_camera_share_fill, R.raw.icon_camera_plus_fill);
                if (((Number) c5h3.getValue()).intValue() == 1) {
                    i2 = R.string.bes;
                } else {
                    i2 = R.string.bep;
                }
                c56732MOi = new C56732MOi(84, i, LIZ, R.string.beh, i2, null);
            } else {
                c56732MOi = new C56732MOi(84, R.string.ra, R.raw.icon_qa_fill_ltr, R.string.r_, R.string.r9, Integer.valueOf(R.raw.icon_large_error_qa_ltr));
            }
            arrayList.add(c56732MOi);
        }
        int LIZIZ = C7F0.LIZIZ();
        if (1 <= LIZIZ && LIZIZ < 5) {
            i3 = R.string.i2n;
        } else {
            i3 = R.string.iwr;
        }
        arrayList.add(new C56732MOi(26, i3, R.raw.icon_at_fill, R.string.ix_, R.string.ix9, Integer.valueOf(R.raw.icon_large_at_mention)));
        if (!C46604IQu.LIZIZ()) {
            arrayList.add(new C56732MOi(7, R.string.iwt, R.raw.icon_person_fill, R.string.iwn, R.string.iwm, Integer.valueOf(R.raw.icon_large_person)));
        }
        if (Q7K.LIZIZ("shop_im_permission", 0) == 1 && !C54316LTk.LIZ) {
            arrayList.add(new C56732MOi(599, R.string.hbs, R.raw.icon_store_fill, R.string.hff, R.string.hfe, Integer.valueOf(R.raw.icon_store)));
        }
        arrayList.add(new C56732MOi(37, R.string.iwx, R.raw.icon_tiktok_logo, R.string.ixg, R.string.ixf, Integer.valueOf(R.raw.icon_large_tiktok_logo)));
        return arrayList;
    }
}
