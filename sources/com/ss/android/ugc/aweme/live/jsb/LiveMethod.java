package com.ss.android.ugc.aweme.live.jsb;

import X.C16880lQ;
import X.C38049EwX;
import X.InterfaceC36488ETs;
import X.ORZ;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class LiveMethod extends BaseCommonJavaMethod {
    public final WeakReference<Context> LJLJI;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public LiveMethod(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        super(c38049EwX);
        this.LJLJI = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "room_id_list");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Long.valueOf(CastLongProtector.parseLong(jSONArray.get(i).toString())));
            }
            String string = JSONObjectProtectorUtils.getString(jSONObject, "current_room_id");
            o.LJIIIIZZ(string, "jsonObj.getString(\"current_room_id\")");
            long parseLong = CastLongProtector.parseLong(string);
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "enter_from");
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.roomId = parseLong;
            roomsData.enterFromMerge = string2;
            roomsData.roomIds = ORZ.LLJIJIL(arrayList);
            LiveOuterService.LJJJLL().LJIILL().LJIILJJIL(this.LJLJI.get(), enterRoomConfig);
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.onSuccess(null);
            }
        } catch (Exception e) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, e.getMessage());
            }
            C16880lQ.LLLLIIL(e);
        }
    }
}
