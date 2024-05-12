package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCandidate;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCandidatesResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviCustom;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeature;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviListResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviStaticImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RTT<T1, T2, R> implements RTU {
    public final /* synthetic */ C36394EQc LJLIL;

    public RTT(C36394EQc c36394EQc) {
        this.LJLIL = c36394EQc;
    }

    @Override // X.RTU
    public final Object apply(Object obj, Object obj2) {
        ProfileNaviStaticImage profileNaviStaticImage;
        ProfileNaviListResponse naviList = (ProfileNaviListResponse) obj;
        ProfileNaviCandidatesResponse candidateList = (ProfileNaviCandidatesResponse) obj2;
        o.LJIIIZ(naviList, "naviList");
        o.LJIIIZ(candidateList, "candidateList");
        List<ProfileNaviCustom> list = naviList.naviList;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        C36394EQc c36394EQc = this.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (ProfileNaviCustom profileNaviCustom : list) {
            c36394EQc.getClass();
            String naviId = profileNaviCustom.getNaviId();
            List<ProfileNaviFeature> features = profileNaviCustom.getFeatures();
            List<ProfileNaviStaticImage> staticImage = profileNaviCustom.getStaticImage();
            if (staticImage != null) {
                profileNaviStaticImage = (ProfileNaviStaticImage) ListProtector.get(staticImage, 0);
            } else {
                profileNaviStaticImage = null;
            }
            arrayList.add(new RTP(naviId, null, features, profileNaviStaticImage, 2));
        }
        List<ProfileNaviCandidate> list2 = candidateList.initialNavis;
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        C36394EQc c36394EQc2 = this.LJLIL;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        for (ProfileNaviCandidate profileNaviCandidate : list2) {
            c36394EQc2.getClass();
            arrayList2.add(new RTP(null, profileNaviCandidate.getStarterNaviId(), profileNaviCandidate.getFeatures(), profileNaviCandidate.getStaticImage(), 1));
        }
        return ORZ.LLIIIZ(arrayList2, arrayList);
    }
}
