package com.ss.android.ugc.aweme.ttsvoice.ui;

import X.MGX;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TTSVoiceDetailAwemeListFragment extends DetailAwemeListFragment {
    public static final /* synthetic */ int LLILZIL = 0;
    public String LLILLL;
    public final Map<Integer, View> LLILZ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLILZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment, com.ss.android.ugc.aweme.challenge.ui.AbsDetailAwemeListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment
    public final SmartRoute wl(MGX mgx, Aweme aweme) {
        SmartRoute route = super.wl(mgx, aweme);
        String str = this.LLILLL;
        if (str != null) {
            route.withParam("feed_data_tts_voice_name", str);
        }
        o.LJIIIIZZ(route, "route");
        return route;
    }
}
