package com.heytap.mcssdk.d;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.heytap.msp.push.mode.BaseMode;

/* loaded from: classes28.dex */
public class a extends c {
    @Override // com.heytap.mcssdk.d.d
    public BaseMode a(Context context, int i, Intent intent) {
        if (4105 == i) {
            return a(intent, i);
        }
        return null;
    }

    @Override // com.heytap.mcssdk.d.c
    public BaseMode a(Intent intent, int i) {
        try {
            com.heytap.mcssdk.c.b bVar = new com.heytap.mcssdk.c.b();
            bVar.a(CastIntegerProtector.parseInt(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "command"))));
            bVar.b(CastIntegerProtector.parseInt(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "code"))));
            bVar.e(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "content")));
            bVar.a(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "appKey")));
            bVar.b(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "appSecret")));
            bVar.f(com.heytap.mcssdk.utils.b.d(C16880lQ.LLJJIJIIJIL(intent, "appPackage")));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OnHandleIntent-message:");
            LIZ.append(bVar.toString());
            com.heytap.mcssdk.utils.d.b(X1D.LIZIZ(LIZ));
            return bVar;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("OnHandleIntent--");
            LIZ2.append(e.getMessage());
            com.heytap.mcssdk.utils.d.b(X1D.LIZIZ(LIZ2));
            return null;
        }
    }
}
