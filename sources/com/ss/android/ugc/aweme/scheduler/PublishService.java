package com.ss.android.ugc.aweme.scheduler;

import X.C022406y;
import X.C10K;
import X.C145995oB;
import X.C16880lQ;
import X.C19N;
import X.C1I0;
import X.C35532Dx2;
import X.C35748E1g;
import X.C38413F5t;
import X.C40684Fxw;
import X.C41730GZi;
import X.C41732GZk;
import X.C41733GZl;
import X.C41859Gbn;
import X.C47918IrK;
import X.C5V5;
import X.C60903NvH;
import X.C66163Pxv;
import X.C84763XOl;
import X.FMX;
import X.GFJ;
import X.GTN;
import X.GUH;
import X.InterfaceC65784Pro;
import X.X1D;
import Y.ACallableS44S0201000_7;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcelable;
import com.bytedance.common.utility.reflect.Reflect;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishService extends Service {
    public static final List<Integer> LJLILLLLZI = new ArrayList();
    public int LJLIL = -1;

    @Override // android.app.Service
    public final void onCreate() {
        String str;
        super.onCreate();
        C41732GZk.LIZLLL("onCreate");
        C41732GZk.LIZJ(this);
        try {
            Notification LIZJ = LIZJ(this, null, 0.0f);
            if (C40684Fxw.LIZ()) {
                PrintStream printStream = System.err;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("service info---->:");
                LIZ.append(PublishService.class.getCanonicalName());
                printStream.println(X1D.LIZIZ(LIZ));
            }
            startForeground(1, LIZJ);
        } catch (Exception unused) {
        }
        C41732GZk.LIZLLL("onCreate startForeground done");
        C41730GZi.LIZ = this;
        C145995oB LIZIZ = GFJ.LIZIZ(81, "publish_step");
        if (C47918IrK.LIZ(C60903NvH.LJ)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ.LJI("network_available", str);
        LIZIZ.LIZ(0, "status");
        FMX.LJIIL("parallel_publish_result", LIZIZ.LIZ);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C41730GZi.LIZ = null;
        C41732GZk.LIZLLL("PublishService onDestroy");
    }

    public final void LIZ(String str) {
        PublishModel LJIILLIIL = GUH.LJIILLIIL(str);
        if (LJIILLIIL == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PublishForegroundService ");
            LIZ.append("PublishService onStartCommand findPublishModel null");
            GUH.LJJI(X1D.LIZIZ(LIZ));
            LIZLLL(str, null, 1);
            return;
        }
        if (str != null) {
            String str2 = LJIILLIIL.creationId;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onStartCommand findCreationId:");
            LIZ2.append(str2);
            C41732GZk.LIZLLL(X1D.LIZIZ(LIZ2));
            Bitmap LJIIJJI = GUH.LJIIJJI(LJIILLIIL);
            if (LJIIJJI == null) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("null cover creationId:");
                LIZ3.append(LJIILLIIL.creationId);
                String LIZIZ = X1D.LIZIZ(LIZ3);
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("PublishForegroundService ");
                LIZ4.append(LIZIZ);
                GUH.LJJI(X1D.LIZIZ(LIZ4));
            }
            if (C19N.LJ("studio_enable_publish_progress_counter", true)) {
                C35748E1g.LIZ.put(str, 0);
            }
            GUH.LIZ(str, new C41733GZl(str, this, LJIIJJI, str2));
            LIZLLL(str, LJIILLIIL, 2);
            return;
        }
        throw new IllegalArgumentException("publish id is null while starting publish service");
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
        o.LJIIIZ(intent, "intent");
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public final void LJ(int i, InterfaceC65784Pro interfaceC65784Pro) {
        C10K.LIZJ(new ACallableS44S0201000_7(i, interfaceC65784Pro, this, 1));
        C60903NvH.LJIIJJI().getPublishService().LJJ().LJFF("PublishForegroundService", new AqS157S0100000_7(this, 496));
    }

    public static void LIZLLL(String str, PublishModel publishModel, int i) {
        Parcelable parcelable;
        String str2;
        VideoPublishEditModel videoPublishEditModel = null;
        if (publishModel != null) {
            parcelable = publishModel.editModel;
        } else {
            parcelable = null;
        }
        if (parcelable instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) parcelable;
        }
        C145995oB LJI = C5V5.LJI(videoPublishEditModel);
        LJI.LIZ(80, "publish_step");
        if (C47918IrK.LIZ(C60903NvH.LJ)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJI.LJI("network_available", str2);
        LJI.LIZ(i, "status");
        if (videoPublishEditModel != null) {
            LJI.LJI("retry_publish", publishModel.LIZ());
            LJI.LIZLLL("creation_id", videoPublishEditModel.getCreationId());
        }
        LJI.LJI("publish_id", str);
        FMX.LJIIL("parallel_publish_result", LJI.LIZ);
    }

    public final Notification LIZJ(Context context, Bitmap bitmap, float f) {
        boolean z;
        int i = (int) (100 * f);
        String string = context.getString(R.string.thq);
        o.LJIIIIZZ(string, "context.getString(R.string.uploading_active)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i);
        LIZ.append('%');
        C022406y LIZIZ = LIZIZ(this, context, string, X1D.LIZIZ(LIZ), bitmap);
        int min = Math.min(100, i);
        LIZIZ.LJIILJJIL = 100;
        LIZIZ.LJIILL = min;
        boolean z2 = false;
        LIZIZ.LJIILLIIL = false;
        Notification LIZIZ2 = LIZIZ.LIZIZ();
        o.LJIIIIZZ(LIZIZ2, "getBuilder(context, cont…lse)\n            .build()");
        if (GTN.LIZ() || Build.VERSION.SDK_INT >= 31) {
            z = true;
        } else {
            z = false;
        }
        if (z && Build.VERSION.SDK_INT >= 31) {
            try {
                Reflect.on(LIZIZ2).set("mFgsDeferBehavior", 1);
                z2 = true;
            } catch (Exception unused) {
            }
        }
        C41859Gbn LIZIZ3 = C1I0.LIZIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("forceImmediate=");
        LIZ2.append(z2);
        LIZIZ3.LJ("PublishForegroundService", X1D.LIZIZ(LIZ2));
        return LIZIZ2;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        C66163Pxv.LIZ(this, intent, i, i2);
        super.onStartCommand(intent, i, i2);
        C41732GZk.LIZLLL("onStartCommand");
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "PUBLISH_ID");
        } else {
            str = null;
        }
        LIZ(str);
        this.LJLIL = i2;
        return 2;
    }

    public static C022406y LIZIZ(PublishService publishService, Context context, String str, String str2, Bitmap bitmap) {
        int i;
        publishService.getClass();
        C022406y c022406y = new C022406y(context, "com.ss.android.ugc.trill.publish");
        c022406y.LJFF(str);
        c022406y.LJ(str2);
        c022406y.LJJIIJ.when = System.currentTimeMillis();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(publishService.getPackageName());
        if (Build.VERSION.SDK_INT >= 23) {
            i = 67108864;
        } else {
            i = 0;
        }
        c022406y.LJI = PendingIntent.getActivity(publishService, 5, launchIntentForPackage, i);
        c022406y.LJJIIJ.icon = R.drawable.b1z;
        c022406y.LJIIIIZZ(bitmap);
        return c022406y;
    }
}
