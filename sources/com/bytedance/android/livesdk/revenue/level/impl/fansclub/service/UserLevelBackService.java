package com.bytedance.android.livesdk.revenue.level.impl.fansclub.service;

import X.C30554Byw;
import X.InterfaceC30442Bx8;
import X.ORZ;
import com.bytedance.android.livesdk.livesetting.level.LiveUserLevelBackEnableSetting;
import com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class UserLevelBackService implements IUserLevelBackService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService
    public final boolean Kc(int i, String str) {
        Map<String, List<String>> LIZ;
        List<String> list;
        if (!LiveUserLevelBackEnableSetting.INSTANCE.getValue() || (LIZ = InterfaceC30442Bx8.c3.LIZ()) == null || (list = LIZ.get(str)) == null) {
            return true;
        }
        return !list.contains(String.valueOf(i));
    }

    @Override // com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService
    public final void aS(int i, String str) {
        if (!LiveUserLevelBackEnableSetting.INSTANCE.getValue()) {
            return;
        }
        C30554Byw<Map<String, List<String>>> c30554Byw = InterfaceC30442Bx8.c3;
        Map<String, List<String>> LIZ = c30554Byw.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List arrayList = new ArrayList();
        if (LIZ != null) {
            linkedHashMap.putAll(LIZ);
            List<String> list = LIZ.get(str);
            if (list != null) {
                arrayList = ORZ.LLJILJILJ(list);
            }
        }
        arrayList.add(String.valueOf(i));
        linkedHashMap.put(str, arrayList);
        c30554Byw.LIZJ(linkedHashMap);
    }
}
