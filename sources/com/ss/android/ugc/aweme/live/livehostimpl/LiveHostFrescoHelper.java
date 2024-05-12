package com.ss.android.ugc.aweme.live.livehostimpl;

import X.AbstractC32209CkX;
import X.C38354F3m;
import X.C43331mz;
import X.C76796UCa;
import X.C76797UCb;
import X.C78738UvG;
import X.C78765Uvh;
import X.C81257Vun;
import X.C81687W4d;
import X.C81697W4n;
import X.FT1;
import X.UCZ;
import X.W50;
import X.W5I;
import X.W5O;
import X.W5P;
import X.W6J;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public class LiveHostFrescoHelper implements IHostFrescoHelper {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final void W00(String str) {
        C78765Uvh.LJIILLIIL(str);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final boolean mI(ImageModel imageModel) {
        List<String> urls;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
            int size = urls.size();
            for (int i = 0; i < size; i++) {
                if (C78765Uvh.LJIILIIL(UriProtector.parse((String) ListProtector.get(urls, i)))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final String rM(ImageModel imageModel) {
        List<String> urls;
        if (imageModel != null && (urls = imageModel.getUrls()) != null && !urls.isEmpty()) {
            int size = urls.size();
            for (int i = 0; i < size; i++) {
                if (C78765Uvh.LJIILIIL(UriProtector.parse((String) ListProtector.get(urls, i)))) {
                    return C78765Uvh.LJIIJJI((String) ListProtector.get(urls, i));
                }
            }
        }
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final void EM(ImageModel imageModel, UCZ ucz) {
        LIZ(imageModel, null, new C76796UCa(ucz));
    }

    public static void LIZ(ImageModel imageModel, C78738UvG c78738UvG, AbstractC32209CkX abstractC32209CkX) {
        W5O[] w5oArr;
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : imageModel.getUrls()) {
            if (!C38354F3m.LJ(str)) {
                W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
                if (c78738UvG != null) {
                    LIZLLL.LJIIJ = c78738UvG;
                }
                try {
                    C43331mz c43331mz = new C43331mz();
                    c43331mz.LIZIZ++;
                    LIZLLL.LJIILJJIL = c43331mz;
                } catch (Exception unused) {
                }
                arrayList.add(LIZLLL.LIZ());
            }
        }
        if (arrayList.size() == 0 || (w5oArr = (W5O[]) arrayList.toArray(new W5O[arrayList.size()])) == null || w5oArr.length == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (W5O w5o : w5oArr) {
            if (w5o != null) {
                W6J LIZ = W5I.LIZ();
                W50 w50 = W50.FULL_FETCH;
                LIZ.getClass();
                arrayList2.add(new C81257Vun(LIZ, w5o, w50));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        new C81697W4n(new C81687W4d(arrayList2)).LJ(abstractC32209CkX, FT1.LIZ());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostFrescoHelper
    public final void nn0(ImageModel imageModel, C78738UvG c78738UvG, UCZ ucz) {
        LIZ(imageModel, c78738UvG, new C76797UCb(ucz));
    }
}
