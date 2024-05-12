package com.appsflyer.internal;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class cm {
    public final FutureTask<List<String>> valueOf;

    public final List<String> AFInAppEventParameterName() {
        try {
            if (AFKeystoreWrapper()) {
                return this.valueOf.get();
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    public final boolean AFKeystoreWrapper() {
        return this.valueOf.isDone();
    }

    public cm(final Context context) {
        this.valueOf = new FutureTask<>(new Callable<List<String>>() { // from class: com.appsflyer.internal.cm.2
            public static Cursor com_appsflyer_internal_cm$2_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-2188558172191876211"));
                return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public List<String> call() {
                List<ResolveInfo> queryIntentContentProviders;
                ArrayList arrayList = new ArrayList();
                try {
                    queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.oem.PRELOAD_PROVIDER"), 0);
                } catch (Exception e) {
                    AFLogger.valueOf(e.getMessage(), e);
                }
                if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
                    Iterator<ResolveInfo> it = queryIntentContentProviders.iterator();
                    while (it.hasNext()) {
                        Cursor com_appsflyer_internal_cm$2_android_content_ContentResolver_query = com_appsflyer_internal_cm$2_android_content_ContentResolver_query(context.getContentResolver(), UriProtector.parse("content://" + it.next().providerInfo.authority + "/preload_id"), null, null, null, null);
                        if (com_appsflyer_internal_cm$2_android_content_ContentResolver_query != null) {
                            com_appsflyer_internal_cm$2_android_content_ContentResolver_query.moveToFirst();
                            arrayList.add(com_appsflyer_internal_cm$2_android_content_ContentResolver_query.getString(com_appsflyer_internal_cm$2_android_content_ContentResolver_query.getColumnIndex("preload_id")));
                            com_appsflyer_internal_cm$2_android_content_ContentResolver_query.close();
                        }
                    }
                    return arrayList;
                }
                return null;
            }
        });
    }
}
