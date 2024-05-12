package com.bytedance.android.live.network.gson;

import X.R2P;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.j;
import java.lang.reflect.Type;

/* loaded from: classes12.dex */
public class LinkMicResponseAdapter extends AbsJsonDeserializer<R2P> {
    public LinkMicResponseAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.i
    public final Object deserialize(j jVar, Type type, h hVar) {
        BaseResponse baseResponse = (BaseResponse) GsonProtectorUtils.fromJson(this.LIZ, jVar, type);
        if (baseResponse.statusCode != 0) {
            baseResponse.LJ = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, jVar.LJIIZILJ().LJJIJ("data"), RequestError.class);
        }
        return baseResponse;
    }
}
