package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePlayerResourceReleaseSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: X.EdQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36864EdQ {
    public static final int LIZ = Runtime.getRuntime().availableProcessors();

    public static int LIZ(Bundle bundle, String str) {
        if (bundle == null) {
            return 6;
        }
        Object LLJJIII = C16880lQ.LLJJIII(bundle, "RESPONSE_CODE");
        if (LLJJIII == null) {
            LJFF(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (LLJJIII instanceof Integer) {
            return ((Integer) LLJJIII).intValue();
        }
        "Unexpected type for bundle response code: ".concat(LLJJIII.getClass().getName());
        return 6;
    }

    public static Bundle LIZJ(String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C0HZ c0hz = (C0HZ) ListProtector.get(arrayList, i);
            c0hz.getClass();
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            if (c0hz.LIZIZ.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        return bundle;
    }

    public static C0HE LIZLLL(Intent intent, String str) {
        if (intent == null) {
            C0HC c0hc = new C0HC();
            c0hc.LIZ = 6;
            c0hc.LIZIZ = "An internal error occurred.";
            return c0hc.LIZ();
        }
        C0HC c0hc2 = new C0HC();
        c0hc2.LIZ = LIZ(C16880lQ.LLJJIJI(intent), str);
        c0hc2.LIZIZ = LJ(C16880lQ.LLJJIJI(intent), str);
        return c0hc2.LIZ();
    }

    public static String LJ(Bundle bundle, String str) {
        if (bundle == null) {
            return "";
        }
        Object LLJJIII = C16880lQ.LLJJIII(bundle, "DEBUG_MESSAGE");
        if (LLJJIII == null) {
            LJFF(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (LLJJIII instanceof String) {
            return (String) LLJJIII;
        }
        "Unexpected type for debug message: ".concat(LLJJIII.getClass().getName());
        return "";
    }

    public static void LJFF(String str, String str2) {
        if (android.util.Log.isLoggable(str, 2) && !str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(LivePlayerResourceReleaseSetting.ENABLE, i));
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static Purchase LJI(String str, String str2) {
        Purchase purchase = null;
        if (str == null || str2 == null) {
            LJFF("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            purchase = new Purchase(str, str2);
            return purchase;
        } catch (JSONException e) {
            "Got JSONException while parsing purchase data: ".concat(e.toString());
            return purchase;
        }
    }

    public static Bundle LIZIZ(int i, boolean z, String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (i >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
            if (i >= 9) {
                if (z) {
                    bundle.putBoolean("enablePendingPurchases", true);
                }
                if (i >= 14) {
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    ArrayList<String> arrayList3 = new ArrayList<>();
                    ArrayList arrayList4 = new ArrayList();
                    int size = arrayList.size();
                    boolean z2 = false;
                    boolean z3 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList2.add(((C04950Hj) ListProtector.get(arrayList, i2)).LIZIZ);
                        z2 |= !TextUtils.isEmpty(r1.LIZIZ);
                        arrayList3.add(null);
                        z3 |= !TextUtils.isEmpty(null);
                        arrayList4.add(0);
                    }
                    if (z2) {
                        bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
                    }
                    if (z3) {
                        bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
                    }
                }
            }
        }
        return bundle;
    }
}
