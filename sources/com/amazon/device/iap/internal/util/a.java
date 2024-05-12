package com.amazon.device.iap.internal.util;

import X.C16880lQ;
import X.X1D;
import com.amazon.android.Kiwi;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import defpackage.b1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static final String a = C16880lQ.LJLLJ(a.class);

    /* renamed from: com.amazon.device.iap.internal.util.a$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.V1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static Receipt a(JSONObject jSONObject) {
        Date b;
        String optString = jSONObject.optString("token");
        String string = JSONObjectProtectorUtils.getString(jSONObject, "sku");
        ProductType valueOf = ProductType.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "itemType").toUpperCase());
        String optString2 = jSONObject.optString("startDate");
        Date date = null;
        if (a(optString2)) {
            b = null;
        } else {
            b = b(optString2);
        }
        String optString3 = jSONObject.optString("endDate");
        if (!a(optString3)) {
            date = b(optString3);
        }
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        receiptBuilder.setReceiptId(optString);
        receiptBuilder.setSku(string);
        receiptBuilder.setProductType(valueOf);
        receiptBuilder.setPurchaseDate(b);
        receiptBuilder.setCancelDate(date);
        return receiptBuilder.build();
    }

    public static Date b(String str) {
        try {
            Date parse = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(str);
            if (0 == parse.getTime()) {
                return null;
            }
            return parse;
        } catch (ParseException e) {
            throw new JSONException(e.getMessage());
        }
    }

    public static boolean a(String str) {
        if (str == null || str.trim().length() == 0) {
            return true;
        }
        return false;
    }

    public static c b(JSONObject jSONObject) {
        String optString = jSONObject.optString("DeviceId");
        if (!d.a(jSONObject.optString("receiptId"))) {
            return c.V2;
        }
        if (d.a(optString)) {
            return c.LEGACY;
        }
        return c.V1;
    }

    public static Receipt a(JSONObject jSONObject, String str, String str2) {
        int i = AnonymousClass1.a[b(jSONObject).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return d(jSONObject, str, str2);
            }
            return b(jSONObject, str, str2);
        }
        return c(jSONObject, str, str2);
    }

    public static Receipt b(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString("signature");
        if (!d.a(optString)) {
            try {
                Receipt a2 = a(jSONObject);
                StringBuilder LIZJ = b1.LIZJ(str, "-");
                LIZJ.append(a2.getReceiptId());
                String LIZIZ = X1D.LIZIZ(LIZJ);
                boolean isSignedByKiwi = Kiwi.isSignedByKiwi(LIZIZ, optString);
                String str3 = a;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stringToVerify/legacy:\n");
                LIZ.append(LIZIZ);
                LIZ.append("\nsignature:\n");
                LIZ.append(optString);
                e.a(str3, X1D.LIZIZ(LIZ));
                if (isSignedByKiwi) {
                    return a2;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, LIZIZ, optString);
                throw new com.amazon.device.iap.internal.b.d(str2, LIZIZ, optString);
            } catch (JSONException e) {
                throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
            }
        }
        String str4 = a;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("a signature was not found in the receipt for request ID ");
        LIZ2.append(str2);
        e.b(str4, X1D.LIZIZ(LIZ2));
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString);
        throw new com.amazon.device.iap.internal.b.d(str2, null, optString);
    }

    public static Receipt c(JSONObject jSONObject, String str, String str2) {
        Date date;
        String optString = jSONObject.optString("DeviceId");
        String optString2 = jSONObject.optString("signature");
        Date date2 = null;
        if (!d.a(optString2)) {
            try {
                Receipt a2 = a(jSONObject);
                Object[] objArr = new Object[9];
                objArr[0] = "2.0.76.4";
                objArr[1] = str;
                objArr[2] = optString;
                objArr[3] = a2.getProductType();
                objArr[4] = a2.getSku();
                objArr[5] = a2.getReceiptId();
                objArr[6] = str2;
                ProductType productType = ProductType.SUBSCRIPTION;
                if (productType == a2.getProductType()) {
                    date = a2.getPurchaseDate();
                } else {
                    date = null;
                }
                objArr[7] = date;
                if (productType == a2.getProductType()) {
                    date2 = a2.getCancelDate();
                }
                objArr[8] = date2;
                String LLLZ = C16880lQ.LLLZ("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", objArr);
                String str3 = a;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stringToVerify/v1:\n");
                LIZ.append(LLLZ);
                LIZ.append("\nsignature:\n");
                LIZ.append(optString2);
                e.a(str3, X1D.LIZIZ(LIZ));
                if (Kiwi.isSignedByKiwi(LLLZ, optString2)) {
                    return a2;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, LLLZ, optString2);
                throw new com.amazon.device.iap.internal.b.d(str2, LLLZ, optString2);
            } catch (JSONException e) {
                throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
            }
        }
        String str4 = a;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("a signature was not found in the receipt for request ID ");
        LIZ2.append(str2);
        e.b(str4, X1D.LIZIZ(LIZ2));
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
        throw new com.amazon.device.iap.internal.b.d(str2, null, optString2);
    }

    public static Receipt d(JSONObject jSONObject, String str, String str2) {
        Date b;
        String optString = jSONObject.optString("DeviceId");
        String optString2 = jSONObject.optString("signature");
        Date date = null;
        if (!d.a(optString2)) {
            try {
                String string = JSONObjectProtectorUtils.getString(jSONObject, "receiptId");
                String string2 = JSONObjectProtectorUtils.getString(jSONObject, "sku");
                ProductType valueOf = ProductType.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "itemType").toUpperCase());
                String optString3 = jSONObject.optString("purchaseDate");
                if (a(optString3)) {
                    b = null;
                } else {
                    b = b(optString3);
                }
                String optString4 = jSONObject.optString("cancelDate");
                if (!a(optString4)) {
                    date = b(optString4);
                }
                ReceiptBuilder receiptBuilder = new ReceiptBuilder();
                receiptBuilder.setReceiptId(string);
                receiptBuilder.setSku(string2);
                receiptBuilder.setProductType(valueOf);
                receiptBuilder.setPurchaseDate(b);
                receiptBuilder.setCancelDate(date);
                Receipt build = receiptBuilder.build();
                String LLLZ = C16880lQ.LLLZ("%s|%s|%s|%s|%s|%tQ|%tQ", new Object[]{str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getPurchaseDate(), build.getCancelDate()});
                String str3 = a;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stringToVerify/v2:\n");
                LIZ.append(LLLZ);
                LIZ.append("\nsignature:\n");
                LIZ.append(optString2);
                e.a(str3, X1D.LIZIZ(LIZ));
                if (Kiwi.isSignedByKiwi(LLLZ, optString2)) {
                    return build;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, LLLZ, optString2);
                throw new com.amazon.device.iap.internal.b.d(str2, LLLZ, optString2);
            } catch (JSONException e) {
                throw new com.amazon.device.iap.internal.b.a(str2, jSONObject.toString(), e);
            }
        }
        String str4 = a;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("a signature was not found in the receipt for request ID ");
        LIZ2.append(str2);
        e.b(str4, X1D.LIZIZ(LIZ2));
        MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
        throw new com.amazon.device.iap.internal.b.d(str2, null, optString2);
    }
}
