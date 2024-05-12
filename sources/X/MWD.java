package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;

/* loaded from: classes10.dex */
public final class MWD {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(MusNotice musNotice) {
        GeneralTemplateNotice generalTemplateNotice;
        Integer num;
        if (musNotice == null || (generalTemplateNotice = musNotice.templateNotice) == null || (num = generalTemplateNotice.type) == null) {
            return false;
        }
        if (num.intValue() == 41) {
            return ORY.LJJIJIIJIL(generalTemplateNotice.legacySubType, new Integer[]{9, 10});
        }
        if (num.intValue() == 31) {
            return ORY.LJJIJIIJIL(generalTemplateNotice.legacySubType, new Integer[]{23, 25, 27, 26});
        }
        if (num.intValue() != 45) {
            return false;
        }
        return ORY.LJJIJIIJIL(generalTemplateNotice.legacySubType, new Integer[]{55, 54});
    }
}
