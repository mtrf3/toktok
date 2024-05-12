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
public final class ck extends cf {
    public ck(Runnable runnable) {
        super("samsung", runnable);
    }

    @Override // com.appsflyer.internal.cl
    public final void AFKeystoreWrapper(Context context) {
        valueOf(context, new ax<Map<String, Object>>(context, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.ck.3
            public static Cursor com_appsflyer_internal_ck$3_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
                C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "-2188558172191876213"));
                return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, strArr, str, strArr2, str2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.ax
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> values() {
                String string;
                Cursor cursor = null;
                try {
                    try {
                        cursor = com_appsflyer_internal_ck$3_android_content_ContentResolver_query(this.AFInAppEventType.getContentResolver(), Uri.parse("content://" + this.values), null, null, null, null);
                        if (cursor != null) {
                            if (cursor.moveToFirst()) {
                                ck.this.values.put("response", "OK");
                                valueOf("referrer", ck.this.values, cursor);
                                AFInAppEventParameterName("click_ts", ck.this.values, cursor);
                                AFInAppEventParameterName("install_begin_ts", ck.this.values, cursor);
                                AFInAppEventParameterName("install_end_ts", ck.this.values, cursor);
                                valueOf("organic_keywords", ck.this.values, cursor);
                                valueOf("attr_type", ck.this.values, cursor);
                                HashMap hashMap = new HashMap();
                                int columnIndex = cursor.getColumnIndex("instant");
                                if (columnIndex != -1 && (string = cursor.getString(columnIndex)) != null) {
                                    hashMap.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                                }
                                AFInAppEventParameterName("click_server_ts", hashMap, cursor);
                                AFInAppEventParameterName("install_begin_server_ts", hashMap, cursor);
                                valueOf("install_version", hashMap, cursor);
                                if (!hashMap.isEmpty()) {
                                    ck.this.values.put("custom", hashMap);
                                }
                            } else {
                                ck.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                            }
                        } else {
                            ck.this.values.put("response", "SERVICE_UNAVAILABLE");
                        }
                    } catch (Exception e) {
                        ck.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.valueOf(e.getMessage(), e);
                        if (0 != 0) {
                        }
                        String str = ((PackageItemInfo) this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128)).packageName;
                        ck.this.values.put("api_ver", Long.valueOf(ac.valueOf(this.AFInAppEventType, str)));
                        ck.this.values.put("api_ver_name", ac.values(this.AFInAppEventType, str));
                        ck.this.AFKeystoreWrapper();
                        return ck.this.values;
                    }
                } finally {
                    if (0 != 0) {
                        cursor.close();
                    }
                }
            }

            public static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j = cursor.getLong(columnIndex);
                if (j == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j));
            }

            public static void valueOf(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
