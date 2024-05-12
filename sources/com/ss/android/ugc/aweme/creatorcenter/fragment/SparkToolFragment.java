package com.ss.android.ugc.aweme.creatorcenter.fragment;

import X.C03880Dg;
import X.C25954AGo;
import X.C65300Pk0;
import android.view.View;
import com.bytedance.hybrid.spark.page.SparkFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SparkToolFragment extends SparkFragment {
    public C25954AGo LLD;
    public final Map<Integer, View> LLF = new LinkedHashMap();

    @Override // com.bytedance.hybrid.spark.page.SparkFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        finish();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "-5975749650773170341");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/creatorcenter/fragment/SparkToolFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/creatorcenter/fragment/SparkToolFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        C25954AGo c25954AGo = this.LLD;
        if (c25954AGo != null && z) {
            c25954AGo.LIZ.LJLJLLL = false;
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/creatorcenter/fragment/SparkToolFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }
}
