package com.ss.android.ugc.aweme.mvtemplate.view;

import X.MGX;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MovieDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLILZLL = 0;
    public MvModel LLILLL;
    public Integer LLILZ;
    public final Map<Integer, View> LLILZIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX mgx, Aweme aweme) {
        SmartRoute route = super.wl(mgx, aweme);
        MvModel mvModel = this.LLILLL;
        if (mvModel != null) {
            route.withParam("feed_data_movie_model", mvModel);
        }
        Integer num = this.LLILZ;
        if (num != null) {
            route.withParam("mv_type", num.intValue());
        }
        AVUploadMiscInfoStruct uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct();
        if (uploadMiscInfoStruct != null) {
            route.withParam("source_id", uploadMiscInfoStruct.sourceId);
        }
        String str = this.LLIIIILZ;
        if (str != null) {
            route.withParam("feed_data_movie_group_id", str);
        }
        o.LJIIIIZZ(route, "route");
        return route;
    }
}
