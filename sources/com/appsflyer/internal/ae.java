package com.appsflyer.internal;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;

/* loaded from: classes.dex */
public final class ae extends ax<String> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.ax
    /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public String values() {
        Cursor cursor;
        try {
            cursor = com_appsflyer_internal_ae_android_content_ContentResolver_query(this.AFInAppEventType.getContentResolver(), Uri.parse("content://" + this.values), new String[]{"aid"}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("aid"));
                        cursor.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }

    public static Cursor com_appsflyer_internal_ae_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-2188558172191876281"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
    }

    public final String AFInAppEventType() {
        new PthreadThread(this.valueOf, "r/internal/ae").start();
        return (String) super.valueOf();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
    @Override // com.appsflyer.internal.ax
    public final /* synthetic */ String valueOf() {
        new PthreadThread(this.valueOf, "r/internal/ae").start();
        return super.valueOf();
    }

    public ae(Context context) {
        super(context, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }
}
