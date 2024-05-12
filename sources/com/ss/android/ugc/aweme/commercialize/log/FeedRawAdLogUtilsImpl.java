package com.ss.android.ugc.aweme.commercialize.log;

import X.C58096Mr6;
import X.C78983UzD;
import X.NN1;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class FeedRawAdLogUtilsImpl implements FeedRawAdLogUtilsApi {
    public static FeedRawAdLogUtilsApi LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(FeedRawAdLogUtilsApi.class, false);
        if (LIZ != null) {
            return (FeedRawAdLogUtilsApi) LIZ;
        }
        if (C58096Mr6.LLLLLLJ == null) {
            synchronized (FeedRawAdLogUtilsApi.class) {
                if (C58096Mr6.LLLLLLJ == null) {
                    C58096Mr6.LLLLLLJ = new FeedRawAdLogUtilsImpl();
                }
            }
        }
        return C58096Mr6.LLLLLLJ;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.FeedRawAdLogUtilsApi
    public final void LIZ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        if (aweme != null) {
            JSONObject LJIIIZ = NN1.LJIIIZ(context, aweme);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", NN1.LJI(aweme));
                hashMap.put("room_id", NN1.LJIIZILJ(aweme));
                LJIIIZ.put("ad_extra_data", GsonProtectorUtils.toJson(new Gson(), hashMap));
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
            NN1.LJJJJI(context, "share", aweme, LJIIIZ);
        }
    }
}
