package com.benchmark.collection.service;

import X.C09590Zf;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C66163Pxv;
import X.C84763XOl;
import X.ZTW;
import X.ZU2;
import X.ZU3;
import X.ZUT;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.keva.KevaImpl;
import java.io.File;

/* loaded from: classes19.dex */
public class ByteBenchService extends Service {
    public ByteBenchProcessInterface mByteBenchProcess;
    public ZU3 mCallback;
    public String mRuntimeLibLoadingPath;
    public volatile ZTW mStatus = ZTW.INVALID;
    public String mInternalFile = "";
    public String mExternalFile = "";
    public final ZU2 ibtcManager = new ZUT(this);

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_benchmark_collection_service_ByteBenchService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_benchmark_collection_service_ByteBenchService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mStatus = ZTW.DESTROY;
        ByteBenchProcessInterface byteBenchProcessInterface = this.mByteBenchProcess;
        if (byteBenchProcessInterface != null) {
            byteBenchProcessInterface.destroy();
            this.mByteBenchProcess = null;
        }
        C09590Zf.LJIILLIIL.LIZ = null;
        this.mStatus = ZTW.INVALID;
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onCreate() {
        KevaBuilder kevaBuilder = KevaBuilder.getInstance();
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        kevaBuilder.setContext(applicationContext);
        KevaImpl.forceInitImpl();
        C09590Zf c09590Zf = C09590Zf.LJIILLIIL;
        Context applicationContext2 = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext2 == null) {
            applicationContext2 = C38891fp.LJLILLLLZI;
        }
        c09590Zf.LIZ = applicationContext2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.mStatus = ZTW.INVALID;
        this.mInternalFile = getCacheDir().getPath();
        File externalCacheDir = getExternalCacheDir();
        if (externalCacheDir != null) {
            this.mExternalFile = externalCacheDir.getPath();
        }
        this.mRuntimeLibLoadingPath = getApplicationInfo().nativeLibraryDir;
        C09590Zf.LJIILLIIL.LJIILIIL = intent.getByteExtra("Loglevel", (byte) 3);
        return this.ibtcManager.asBinder();
    }

    public static void com_benchmark_collection_service_ByteBenchService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(ByteBenchService byteBenchService, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        byteBenchService.com_benchmark_collection_service_ByteBenchService__attachBaseContext$___twin___(context);
    }
}
