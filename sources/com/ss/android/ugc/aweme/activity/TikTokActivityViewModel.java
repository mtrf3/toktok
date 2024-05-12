package com.ss.android.ugc.aweme.activity;

import X.C40094FoQ;
import X.C40103FoZ;
import X.C40107Fod;
import X.C40166Fpa;
import X.C40401FtN;
import X.C40892G3c;
import X.C40900G3k;
import X.C40902G3m;
import X.C47261Igj;
import X.C85977Xoj;
import X.FFL;
import X.G2B;
import X.G2C;
import X.G46;
import X.G4I;
import X.G4L;
import X.G56;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import defpackage.e1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class TikTokActivityViewModel extends BaseActivityViewModel {
    @Override // com.bytedance.ies.foundation.activity.BaseActivityViewModel, com.bytedance.ies.foundation.base.BaseViewModel
    public List<G46> initProcessors() {
        ArrayList arrayList = new ArrayList(super.initProcessors());
        arrayList.addAll(C47261Igj.LJJIJIIJI(new G56(), new C40103FoZ(), new C40107Fod(), new C85977Xoj(), new C40401FtN(), new G2C(), new C40166Fpa(), new G2B(), new G4L(), new C40892G3c(), new C40094FoQ()));
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "gray_mode", true, false)) {
            arrayList.add(new C40902G3m());
        } else if (e1.LIZ(31744, "test_gray_mode", true, false)) {
            arrayList.add(new C40900G3k());
        }
        if (e1.LIZ(31744, "dynamic_font_size_setting_enabled", true, false)) {
            arrayList.add(new G4I());
        }
        return arrayList;
    }
}
