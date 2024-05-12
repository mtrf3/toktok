package com.bytedance.android.livesdk.model.utils.adapter;

import X.C09650Zl;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import java.lang.reflect.Type;

/* loaded from: classes12.dex */
public class RoomTypeAdapter implements i<Room> {
    @Override // com.google.gson.i
    public final Room deserialize(j jVar, Type type, h hVar) {
        Room room = (Room) GsonProtectorUtils.fromJson(C09650Zl.LIZJ, jVar, type);
        room.init();
        return room;
    }
}
