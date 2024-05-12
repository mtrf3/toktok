package com.byted.cast.sdk.service;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C84763XOl;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.byted.cast.sdk.utils.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes29.dex */
public final class OnKillApp extends Service {
    public static final Companion Companion = new Companion();
    public IKilledListener killedListener;

    /* loaded from: classes29.dex */
    public interface IKilledListener {
        void onKilled();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_byted_cast_sdk_service_OnKillApp_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(this, context);
    }

    public void com_byted_cast_sdk_service_OnKillApp__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        o.LJIIJ(intent, "intent");
        return 2;
    }

    /* loaded from: classes29.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes29.dex */
    public final class MyBinder extends Binder {
        public final OnKillApp getService() {
            return OnKillApp.this;
        }

        public MyBinder() {
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public MyBinder onBind(Intent intent) {
        o.LJIIJ(intent, "intent");
        return new MyBinder();
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent rootIntent) {
        o.LJIIJ(rootIntent, "rootIntent");
        Logger.i("OnKillApp", "onTaskRemoved");
        IKilledListener iKilledListener = this.killedListener;
        if (iKilledListener != null) {
            iKilledListener.onKilled();
        }
        stopSelf();
    }

    public final void setKilledListener(IKilledListener listener) {
        o.LJIIJ(listener, "listener");
        this.killedListener = listener;
    }

    public static void com_byted_cast_sdk_service_OnKillApp_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(OnKillApp onKillApp, Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        onKillApp.com_byted_cast_sdk_service_OnKillApp__attachBaseContext$___twin___(context);
    }
}
