package com.bytedance.android.live.network.gson;

import X.BOH;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.m;
import java.lang.reflect.Type;

/* loaded from: classes12.dex */
public class ListResponseTypeAdapter extends AbsJsonDeserializer<BOH> {
    public ListResponseTypeAdapter(Gson gson) {
        super(gson);
    }

    @Override // com.google.gson.i
    public final Object deserialize(j jVar, Type type, h hVar) {
        m LJIIZILJ = jVar.LJIIZILJ();
        int LJIILJJIL = LJIIZILJ.LJJIJ("status_code").LJIILJJIL();
        if (LJIILJJIL == 0) {
            return GsonProtectorUtils.fromJson(this.LIZ, jVar, type);
        }
        BOH boh = new BOH();
        boh.statusCode = LJIILJJIL;
        boh.extra = (R) GsonProtectorUtils.fromJson(this.LIZ, LJIIZILJ.LJJIJ("extra"), Extra.class);
        boh.LIZLLL = (RequestError) GsonProtectorUtils.fromJson(this.LIZ, LJIIZILJ.LJJIJ("data"), RequestError.class);
        return boh;
    }
}
