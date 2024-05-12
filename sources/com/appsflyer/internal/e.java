package com.appsflyer.internal;

import X.C16880lQ;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class e {
    public IntentFilter AFInAppEventType = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0007e {
        public static final e AFInAppEventParameterName = new e();
    }

    public final b AFInAppEventType(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, context, this.AFInAppEventType);
            if (LJJLIIIJILLIZJL != null) {
                if (2 == LJJLIIIJILLIZJL.getIntExtra("status", -1)) {
                    int intExtra = LJJLIIIJILLIZJL.getIntExtra("plugged", -1);
                    if (intExtra != 1) {
                        if (intExtra != 2) {
                            if (intExtra != 4) {
                                str = "other";
                            } else {
                                str = "wireless";
                            }
                        } else {
                            str = "usb";
                        }
                    } else {
                        str = "ac";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = LJJLIIIJILLIZJL.getIntExtra("level", -1);
                int intExtra3 = LJJLIIIJILLIZJL.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable unused) {
        }
        return new b(f, str);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final float AFInAppEventParameterName;
        public final String AFKeystoreWrapper;

        public b(float f, String str) {
            this.AFInAppEventParameterName = f;
            this.AFKeystoreWrapper = str;
        }
    }
}
