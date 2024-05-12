package com.ss.android.ugc.aweme.creatorcenter.fragment;

import android.view.View;
import com.bytedance.hybrid.spark.page.SparkFragment;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SparkLiveFragment extends SparkFragment {
    public final Map<Integer, View> LLD = new LinkedHashMap();

    @Override // com.bytedance.hybrid.spark.page.SparkFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLD).clear();
    }

    @Override // com.bytedance.hybrid.spark.page.SparkFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        finish();
        super.onDestroy();
    }
}
