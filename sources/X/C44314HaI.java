package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordBottomTabConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.TabType;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HaI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44314HaI implements InterfaceC44316HaK {
    @Override // X.InterfaceC44316HaK
    public final List<WSH> LJ(C82622Wbi diContainer) {
        boolean z;
        String LIZIZ;
        RecordBottomTabConfig recordBottomTabConfig;
        TabType tabType;
        o.LJIIIZ(diContainer, "diContainer");
        ArrayList arrayList = new ArrayList();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) diContainer.LJ(ActivityC45651qj.class, null);
        ShortVideoContext shortVideoContext = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        RecordPageOptionalConfig recordPageOptionalConfig = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig != null && recordPageOptionalConfig.exteriorRecordPageType == HR3.PHOTO_SEARCH.getType()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZIZ = activityC45651qj.getString(R.string.eij);
            o.LJIIIIZZ(LIZIZ, "activity.getString(this)");
        } else {
            LIZIZ = C0MT.LIZIZ(I38.RECORD_LIGHTENING_PHOTO, activityC45651qj, "activity.getString(this)");
        }
        RecordPageOptionalConfig recordPageOptionalConfig2 = shortVideoContext.creativeModel.initialModel.recordPageOptionalConfig;
        if (recordPageOptionalConfig2 != null && (recordBottomTabConfig = recordPageOptionalConfig2.recordBottomTabConfig) != null && (tabType = recordBottomTabConfig.tabType) != null) {
            int i = HCX.LIZ[tabType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    I38 i38 = I38.RECORD_LIGHTENING_VIDEO;
                    arrayList.add(new I3R(C0MT.LIZIZ(i38, activityC45651qj, "activity.getString(this)"), i38.getTag(), "quick_video", true, diContainer));
                }
            } else {
                arrayList.add(new C46001I3p(LIZIZ, I38.PHOTO_SHORT.getTag(), "quick_photo", true, diContainer));
            }
            return arrayList;
        }
        arrayList.add(new C46001I3p(C0MT.LIZIZ(I38.RECORD_LIGHTENING_PHOTO, activityC45651qj, "activity.getString(this)"), I38.PHOTO_SHORT.getTag(), "quick_photo", true, diContainer));
        I38 i382 = I38.RECORD_LIGHTENING_VIDEO;
        arrayList.add(new I3R(C0MT.LIZIZ(i382, activityC45651qj, "activity.getString(this)"), i382.getTag(), "quick_video", false, diContainer));
        return arrayList;
    }
}
