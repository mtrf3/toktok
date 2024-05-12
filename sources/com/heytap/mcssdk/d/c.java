package com.heytap.mcssdk.d;

import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes28.dex */
public abstract class c implements d {
    public abstract BaseMode a(Intent intent, int i);

    public static List<BaseMode> a(Context context, Intent intent) {
        int i;
        BaseMode a;
        if (intent == null) {
            return null;
        }
        try {
            i = CastIntegerProtector.parseInt(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "type")));
        } catch (Exception e) {
            com.heytap.mcssdk.utils.d.e("MessageParser--getMessageByIntent--Exception:" + e.getMessage());
            i = 4096;
        }
        com.heytap.mcssdk.utils.d.b("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        for (d dVar : PushService.a.a.getParsers()) {
            if (dVar != null && (a = dVar.a(context, i, intent)) != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
