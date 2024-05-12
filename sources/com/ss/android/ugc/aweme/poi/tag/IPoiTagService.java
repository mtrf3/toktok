package com.ss.android.ugc.aweme.poi.tag;

import X.InterfaceC211228Qs;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.HashMap;

/* loaded from: classes4.dex */
public interface IPoiTagService {
    void appendPoiTagParamsIfHave(String str, HashMap<String, String> hashMap, Aweme aweme);

    VideoTagCategoryProtocol getPoiTagTrigger();

    InterfaceC211228Qs getPoiTagView(Context context);

    boolean isPoiTagShow(String str, Aweme aweme);
}
