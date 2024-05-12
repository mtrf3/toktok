package com.bytedance.ugc.glue.app;

import android.net.Uri;
import android.os.Bundle;
import com.bytedance.ugc.ugcwidget.UGCServiceManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes16.dex */
public abstract class UGCRouter {

    /* loaded from: classes16.dex */
    public static class Manager {
        public boolean openUrl(String str, Bundle bundle) {
            return false;
        }
    }

    public abstract boolean openUri(Uri uri, Bundle bundle);

    /* loaded from: classes16.dex */
    public static class UGCRoutersHolder {
        public final CopyOnWriteArrayList<UGCRouter> routers = new CopyOnWriteArrayList<>();

        public CopyOnWriteArrayList<UGCRouter> getRouters() {
            return this.routers;
        }
    }

    public static void register(UGCRouter uGCRouter) {
        ((UGCRoutersHolder) UGCServiceManager.getService(UGCRoutersHolder.class)).routers.add(uGCRouter);
    }

    public static boolean handleUri(Uri uri, Bundle bundle) {
        return ((Manager) UGCServiceManager.getService(Manager.class)).openUrl(uri.toString(), bundle);
    }

    public static boolean handleUrl(String str, Bundle bundle) {
        return ((Manager) UGCServiceManager.getService(Manager.class)).openUrl(str, bundle);
    }
}
