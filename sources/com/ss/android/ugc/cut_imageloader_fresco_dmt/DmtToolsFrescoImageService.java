package com.ss.android.ugc.cut_imageloader_fresco_dmt;

import X.BinderC81160VtE;
import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C81159VtD;
import X.C81392Vwy;
import X.C84763XOl;
import X.W5A;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public final class DmtToolsFrescoImageService extends Service {
    public BinderC81160VtE LJLIL;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        BinderC81160VtE binderC81160VtE = this.LJLIL;
        if (binderC81160VtE == null) {
            return;
        }
        Iterator it = ((LinkedHashMap) binderC81160VtE.LJLILLLLZI).entrySet().iterator();
        while (it.hasNext()) {
            C81159VtD c81159VtD = (C81159VtD) ((Map.Entry) it.next()).getValue();
            C81392Vwy<W5A> c81392Vwy = c81159VtD.LJ;
            if (c81392Vwy != null) {
                C81392Vwy.LJ(c81392Vwy);
            }
            c81159VtD.LJ = null;
            c81159VtD.LIZIZ.clear();
            c81159VtD.LIZJ.close();
        }
        ((LinkedHashMap) binderC81160VtE.LJLILLLLZI).clear();
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
        if (this.LJLIL == null) {
            this.LJLIL = new BinderC81160VtE(this);
        }
        return this.LJLIL;
    }
}
