package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviAnimatedGifDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviStaticImageDataModel;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SeA, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72582SeA {
    public static final /* synthetic */ int LJI = 0;
    public String LIZ;
    public String LIZIZ = "#A5E6FF";
    public final HashMap<String, InterfaceC72696Sg0> LIZJ = new HashMap<>();
    public final HashMap<String, C72587SeF> LIZLLL = new HashMap<>();
    public UrlModel LJ;
    public UrlModel LJFF;

    public final ProfileNaviDataModel LIZJ() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = this.LIZ;
        String LIZLLL = UserStore.LIZLLL();
        String str2 = this.LIZIZ;
        UrlModel urlModel = this.LJFF;
        if (urlModel != null) {
            arrayList = new ArrayList();
            arrayList.add(new ProfileNaviAnimatedGifDataModel("anim_1", urlModel));
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC72696Sg0 interfaceC72696Sg0 : this.LIZJ.values()) {
            arrayList3.add(new ProfileNaviFeatureDataModel(interfaceC72696Sg0.LIZ().getKey(), C72581Se9.LIZIZ(interfaceC72696Sg0)));
        }
        for (C72587SeF c72587SeF : this.LIZLLL.values()) {
            arrayList3.add(new ProfileNaviFeatureDataModel(c72587SeF.LIZJ.getKey(), C72581Se9.LIZIZ(c72587SeF)));
        }
        if (this.LJ != null) {
            arrayList2 = new ArrayList();
            arrayList2.add(new ProfileNaviStaticImageDataModel("webp", null, this.LJ));
        } else {
            arrayList2 = null;
        }
        return new ProfileNaviDataModel(str, LIZLLL, str2, arrayList, arrayList3, arrayList2);
    }

    public final InterfaceC72696Sg0 LIZ(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
        if (this.LIZJ.containsKey(categoryKey)) {
            return this.LIZJ.get(categoryKey);
        }
        return null;
    }

    public final C72587SeF LIZIZ(String categoryKey) {
        o.LJIIIZ(categoryKey, "categoryKey");
        if (this.LIZLLL.containsKey(categoryKey)) {
            return this.LIZLLL.get(categoryKey);
        }
        return null;
    }
}
