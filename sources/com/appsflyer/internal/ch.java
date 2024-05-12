package com.appsflyer.internal;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ch extends cf {
    public ch(Runnable runnable) {
        super("huawei", runnable);
    }

    @Override // com.appsflyer.internal.cl
    public final void AFKeystoreWrapper(Context context) {
        valueOf(context, new ax<Map<String, Object>>(context, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.ch.5
            public static Cursor com_appsflyer_internal_ch$5_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-2188558172191876216"));
                return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.ax
            /* renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> values() {
                String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128)).packageName;
                ch.this.values.put("api_ver", Long.valueOf(ac.valueOf(this.AFInAppEventType, str)));
                ch.this.values.put("api_ver_name", ac.values(this.AFInAppEventType, str));
                Cursor cursor = null;
                try {
                    try {
                        cursor = com_appsflyer_internal_ch$5_android_content_ContentResolver_query(this.AFInAppEventType.getContentResolver(), Uri.parse("content://" + this.values + "/item/5"), null, null, new String[]{this.AFInAppEventType.getPackageName()}, null);
                        if (cursor != null) {
                            if (cursor.moveToFirst()) {
                                ch.this.values.put("response", "OK");
                                ch.this.values.put("referrer", cursor.getString(0));
                                ch.this.values.put("click_ts", Long.valueOf(cursor.getLong(1)));
                                ch.this.values.put("install_end_ts", Long.valueOf(cursor.getLong(2)));
                                if (cursor.getColumnCount() > 3) {
                                    ch.this.values.put("install_begin_ts", Long.valueOf(cursor.getLong(3)));
                                    HashMap hashMap = new HashMap();
                                    String string = cursor.getString(4);
                                    if (string != null) {
                                        hashMap.put("track_id", string);
                                    }
                                    hashMap.put("referrer_ex", cursor.getString(5));
                                    ch.this.values.put("huawei_custom", hashMap);
                                }
                            } else {
                                ch.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            ch.this.values.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        ch.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.valueOf(e.getMessage(), e);
                        if (0 != 0) {
                        }
                        ch.this.AFKeystoreWrapper();
                        return ch.this.values;
                    }
                } finally {
                    if (0 != 0) {
                        cursor.close();
                    }
                }
            }
        });
    }
}
