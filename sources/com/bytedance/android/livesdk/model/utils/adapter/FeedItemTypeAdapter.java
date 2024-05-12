package com.bytedance.android.livesdk.model.utils.adapter;

import X.C09650Zl;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes12.dex */
public class FeedItemTypeAdapter implements i<FeedItem>, r<FeedItem> {
    @Override // com.google.gson.i
    public final FeedItem deserialize(j jVar, Type type, h hVar) {
        try {
            FeedItem feedItem = (FeedItem) C09650Zl.LIZJ.LIZJ(jVar, FeedItem.class);
            feedItem.init();
            return feedItem;
        } catch (Exception unused) {
            throw new n("error type");
        }
    }

    @Override // com.google.gson.r
    public final j serialize(FeedItem feedItem, Type type, q qVar) {
        FeedItem feedItem2 = feedItem;
        Gson gson = C09650Zl.LIZJ;
        m LJIIZILJ = GsonProtectorUtils.toJsonTree(gson, feedItem2).LJIIZILJ();
        LJIIZILJ.LJJII("data", GsonProtectorUtils.toJsonTree(gson, feedItem2.getRoom(), Room.class));
        return LJIIZILJ;
    }
}
