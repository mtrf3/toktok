package com.amazon.device.iap.internal.c;

import X.C06540Nm;
import X.C16880lQ;
import X.C25620zW;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.amazon.device.iap.model.Receipt;
import defpackage.i0;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static final String a = C16880lQ.LJLLJ(a.class);
    public static final String b;
    public static final String c;
    public static int d;
    public static final a e;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(a.class.getName());
        LIZ.append("_PREFS");
        b = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(a.class.getName());
        LIZ2.append("_CLEANER_PREFS");
        c = X1D.LIZIZ(LIZ2);
        d = 604800000;
        e = new a();
    }

    private void e() {
        com.amazon.device.iap.internal.util.e.a(a, "enter old receipts cleanup! ");
        final Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        a(System.currentTimeMillis());
        new Handler().post(new Runnable() { // from class: com.amazon.device.iap.internal.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                com_amazon_device_iap_internal_c_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_amazon_device_iap_internal_c_a$1__run$___twin___() {
                try {
                    com.amazon.device.iap.internal.util.e.a(a.a, "perform house keeping! ");
                    SharedPreferences LIZIZ = F9J.LIZIZ(b2, 0, a.b);
                    for (String str : LIZIZ.getAll().keySet()) {
                        try {
                            if (System.currentTimeMillis() - d.a(LIZIZ.getString(str, null)).c() > a.d) {
                                String str2 = a.a;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("house keeping - try remove Receipt:");
                                LIZ.append(str);
                                LIZ.append(" since it's too old");
                                com.amazon.device.iap.internal.util.e.a(str2, X1D.LIZIZ(LIZ));
                                a.this.a(str);
                            }
                        } catch (e unused) {
                            String str3 = a.a;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("house keeping - try remove Receipt:");
                            LIZ2.append(str);
                            LIZ2.append(" since it's invalid ");
                            com.amazon.device.iap.internal.util.e.a(str3, X1D.LIZIZ(LIZ2));
                            a.this.a(str);
                        }
                    }
                } catch (Throwable th) {
                    String str4 = a.a;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Error in running cleaning job:");
                    LIZ3.append(th);
                    com.amazon.device.iap.internal.util.e.a(str4, X1D.LIZIZ(LIZ3));
                }
            }

            public static void com_amazon_device_iap_internal_c_a$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_amazon_device_iap_internal_c_a$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private long f() {
        Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        long currentTimeMillis = System.currentTimeMillis();
        long j = F9J.LIZIZ(b2, 0, c).getLong("LAST_CLEANING_TIME", 0L);
        if (j == 0) {
            a(currentTimeMillis);
            return currentTimeMillis;
        }
        return j;
    }

    public static a a() {
        return e;
    }

    public void a(String str) {
        String str2 = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter removeReceipt for receipt[");
        LIZ.append(str);
        LIZ.append("]");
        com.amazon.device.iap.internal.util.e.a(str2, X1D.LIZIZ(LIZ));
        Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        SharedPreferences.Editor edit = F9J.LIZIZ(b2, 0, b).edit();
        edit.remove(str);
        edit.commit();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("leave removeReceipt for receipt[");
        LIZ2.append(str);
        LIZ2.append("]");
        com.amazon.device.iap.internal.util.e.a(str2, X1D.LIZIZ(LIZ2));
    }

    public Set<Receipt> b(String str) {
        Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        String str2 = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter getLocalReceipts for user[");
        LIZ.append(str);
        LIZ.append("]");
        com.amazon.device.iap.internal.util.e.a(str2, X1D.LIZIZ(LIZ));
        HashSet hashSet = new HashSet();
        if (!com.amazon.device.iap.internal.util.d.a(str)) {
            Map<String, ?> all = F9J.LIZIZ(b2, 0, b).getAll();
            for (String str3 : all.keySet()) {
                String str4 = (String) all.get(str3);
                try {
                    d a2 = d.a(str4);
                    hashSet.add(com.amazon.device.iap.internal.util.a.a(new JSONObject(a2.b()), str, a2.a()));
                } catch (com.amazon.device.iap.internal.b.d unused) {
                    a(str3);
                    String str5 = a;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("failed to verify signature:[");
                    LIZ2.append(str4);
                    LIZ2.append("]");
                    com.amazon.device.iap.internal.util.e.b(str5, X1D.LIZIZ(LIZ2));
                } catch (JSONException unused2) {
                    a(str3);
                    String str6 = a;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("failed to convert string to JSON object:[");
                    LIZ3.append(str4);
                    LIZ3.append("]");
                    com.amazon.device.iap.internal.util.e.b(str6, X1D.LIZIZ(LIZ3));
                } catch (Throwable unused3) {
                    String str7 = a;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("failed to load the receipt from SharedPreference:[");
                    LIZ4.append(str4);
                    LIZ4.append("]");
                    com.amazon.device.iap.internal.util.e.b(str7, X1D.LIZIZ(LIZ4));
                }
            }
            String str8 = a;
            StringBuilder LIZIZ = C25620zW.LIZIZ("leaving getLocalReceipts for user[", str, "], ");
            LIZIZ.append(hashSet.size());
            LIZIZ.append(" local receipts found.");
            com.amazon.device.iap.internal.util.e.a(str8, X1D.LIZIZ(LIZIZ));
            if (System.currentTimeMillis() - f() > d) {
                e();
            }
            return hashSet;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("empty UserId: ");
        LIZ5.append(str);
        com.amazon.device.iap.internal.util.e.b(str2, X1D.LIZIZ(LIZ5));
        throw new RuntimeException(i0.LJFF("Invalid UserId:", str));
    }

    public String c(String str) {
        Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        if (!com.amazon.device.iap.internal.util.d.a(str)) {
            String string = F9J.LIZIZ(b2, 0, b).getString(str, null);
            if (string != null) {
                try {
                    return d.a(string).a();
                } catch (e unused) {
                }
            }
            return null;
        }
        String str2 = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("empty receiptId: ");
        LIZ.append(str);
        com.amazon.device.iap.internal.util.e.b(str2, X1D.LIZIZ(LIZ));
        throw new RuntimeException(i0.LJFF("Invalid ReceiptId:", str));
    }

    private void a(long j) {
        Context b2 = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b2, "context");
        SharedPreferences.Editor edit = F9J.LIZIZ(b2, 0, c).edit();
        edit.putLong("LAST_CLEANING_TIME", j);
        edit.commit();
    }

    public void a(String str, String str2, String str3, String str4) {
        String str5 = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enter saveReceipt for receipt [");
        LIZ.append(str4);
        LIZ.append("]");
        com.amazon.device.iap.internal.util.e.a(str5, X1D.LIZIZ(LIZ));
        try {
            com.amazon.device.iap.internal.util.d.a(str2, "userId");
            com.amazon.device.iap.internal.util.d.a(str3, "receiptId");
            com.amazon.device.iap.internal.util.d.a(str4, "receiptString");
            Context b2 = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(b2, "context");
            d dVar = new d(str2, str4, str, System.currentTimeMillis());
            SharedPreferences.Editor edit = F9J.LIZIZ(b2, 0, b).edit();
            edit.putString(str3, dVar.d());
            edit.commit();
        } catch (Throwable th) {
            String str6 = a;
            StringBuilder LIZLLL = C06540Nm.LIZLLL("error in saving pending receipt:", str, "/", str4, ":");
            LIZLLL.append(th.getMessage());
            com.amazon.device.iap.internal.util.e.a(str6, X1D.LIZIZ(LIZLLL));
        }
        String str7 = a;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("leaving saveReceipt for receipt id [");
        LIZ2.append(str3);
        LIZ2.append("]");
        com.amazon.device.iap.internal.util.e.a(str7, X1D.LIZIZ(LIZ2));
    }
}
