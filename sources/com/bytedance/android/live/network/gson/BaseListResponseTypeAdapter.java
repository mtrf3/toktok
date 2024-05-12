package com.bytedance.android.live.network.gson;

import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.j;
import java.lang.reflect.Type;

/* loaded from: classes12.dex */
public class BaseListResponseTypeAdapter extends AbsJsonDeserializer<BaseListResponse> {
    public BaseListResponseTypeAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.i
    public final Object deserialize(j jVar, Type type, h hVar) {
        BaseListResponse baseListResponse = (BaseListResponse) GsonProtectorUtils.fromJson(this.LIZ, jVar, type);
        if (baseListResponse.statusCode != 0) {
            baseListResponse.LIZLLL = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, jVar.LJIIZILJ().LJJIJ("data"), RequestError.class);
        }
        return baseListResponse;
    }
}
