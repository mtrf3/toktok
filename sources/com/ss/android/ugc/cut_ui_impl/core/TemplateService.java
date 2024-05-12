package com.ss.android.ugc.cut_ui_impl.core;

import X.BinderC42956GtU;
import X.BinderC42957GtV;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class TemplateService extends Service {
    public BinderC42956GtU LJLIL;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        BinderC42956GtU binderC42956GtU = this.LJLIL;
        if (binderC42956GtU == null) {
            return;
        }
        Iterator it = ((LinkedHashMap) binderC42956GtU.LJLIL).entrySet().iterator();
        while (it.hasNext()) {
            BinderC42957GtV binderC42957GtV = (BinderC42957GtV) ((Map.Entry) it.next()).getValue();
            binderC42957GtV.getClass();
            AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(binderC42957GtV, 339);
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                aqS157S0100000_7.invoke();
            } else {
                throw null;
            }
        }
        ((LinkedHashMap) binderC42956GtU.LJLIL).clear();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        BinderC42956GtU binderC42956GtU = this.LJLIL;
        if (binderC42956GtU == null) {
            BinderC42956GtU binderC42956GtU2 = new BinderC42956GtU(this);
            this.LJLIL = binderC42956GtU2;
            return binderC42956GtU2;
        }
        return binderC42956GtU;
    }
}
