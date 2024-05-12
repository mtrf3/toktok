package X;

import android.text.TextUtils;
import com.android.billingclient.api.SkuDetails;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Upo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78400Upo {
    static {
        C16880lQ.LJLLILLLL(C78400Upo.class);
    }

    public static C0HB LIZ(C0H5 c0h5, OrderData orderData) {
        String str;
        String host;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        AbstractC65794Pry zzl;
        String orderId = orderData.getOrderId();
        String str2 = orderData.getIapPayRequest().LIZIZ;
        String userId = orderData.getUserId();
        String str3 = orderData.getIapPayRequest().LJIIJ;
        if (orderData.isNewSubscription()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZIZ = C25620zW.LIZIZ("BillingManager: buildDevelopPayLoad with orderId: ", orderId, "(length is ");
        LIZIZ.append(orderId.length());
        LIZIZ.append("), marchatId: ");
        LIZIZ.append(str2);
        LIZIZ.append("(length is ");
        LIZIZ.append(str2.length());
        LIZIZ.append("), userId: ");
        LIZIZ.append(userId);
        LIZIZ.append("(length is ");
        LIZIZ.append(userId.length());
        LIZIZ.append(")");
        X1D.LIZIZ(LIZIZ);
        LJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("newstr");
        String[] strArr = new String[3];
        strArr[0] = orderId;
        if (TextUtils.isEmpty(orderData.getHost())) {
            host = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.LIZ;
        } else {
            host = orderData.getHost();
        }
        strArr[1] = host;
        strArr[2] = str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i = C0EH.LIZIZ(sb, strArr[i], "\n", i, 1)) {
        }
        String sb2 = sb.toString();
        if (sb2.endsWith("\n")) {
            sb2 = C79061V1d.LJ(sb2, 1, 0);
        }
        StringBuilder sb3 = new StringBuilder();
        int i2 = 1;
        while (i2 < sb2.length()) {
            sb3.append((char) ((sb2.charAt(i2 - 1) << '\b') + sb2.charAt(i2)));
            i2 += 2;
        }
        if (i2 == sb2.length()) {
            sb3.append(sb2.charAt(i2 - 1));
        }
        LIZ.append(sb3.toString());
        c0h5.LIZ = X1D.LIZIZ(LIZ);
        if (orderData.getIapPayRequest() != null) {
            orderData.getIapPayRequest().getClass();
        }
        if (str2.length() > 64) {
            c0h5.LIZIZ = str2.substring(0, 64);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append("\n");
            LIZ2.append(userId);
            if (X1D.LIZIZ(LIZ2).length() > 64) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str2);
                LIZ3.append("\n");
                LIZ3.append(userId);
                c0h5.LIZIZ = X1D.LIZIZ(LIZ3).substring(0, 64);
            } else {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(str2);
                LIZ4.append("\n");
                LIZ4.append(userId);
                LIZ4.append("\n");
                LIZ4.append(str3);
                if (X1D.LIZIZ(LIZ4).length() > 64) {
                    c0h5.LIZIZ = UPJ.LIZIZ(str2, "\n", userId, "\n", str3).substring(0, 64);
                } else {
                    c0h5.LIZIZ = UPJ.LIZIZ(str2, "\n", userId, "\n", str3);
                }
            }
        }
        ArrayList arrayList2 = c0h5.LIZLLL;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        List list = c0h5.LIZJ;
        if (list != null && !((ArrayList) list).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (!z2) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
        } else if (z2) {
            throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
        }
        if (z) {
            if (!c0h5.LIZLLL.contains(null)) {
                if (c0h5.LIZLLL.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) ListProtector.get(c0h5.LIZLLL, 0);
                    String LIZIZ2 = skuDetails.LIZIZ();
                    ArrayList arrayList3 = c0h5.LIZLLL;
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        SkuDetails skuDetails2 = (SkuDetails) ListProtector.get(arrayList3, i3);
                        if (!LIZIZ2.equals("play_pass_subs") && !skuDetails2.LIZIZ().equals("play_pass_subs") && !LIZIZ2.equals(skuDetails2.LIZIZ())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String optString = skuDetails.LIZIZ.optString("packageName");
                    ArrayList arrayList4 = c0h5.LIZLLL;
                    int size2 = arrayList4.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        SkuDetails skuDetails3 = (SkuDetails) ListProtector.get(arrayList4, i4);
                        if (!LIZIZ2.equals("play_pass_subs") && !skuDetails3.LIZIZ().equals("play_pass_subs") && !optString.equals(skuDetails3.LIZIZ.optString("packageName"))) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
        } else {
            C0H7 c0h7 = (C0H7) ListProtector.get(c0h5.LIZJ, 0);
            for (int i5 = 0; i5 < ((ArrayList) c0h5.LIZJ).size(); i5++) {
                C0H7 c0h72 = (C0H7) ListProtector.get(c0h5.LIZJ, i5);
                if (c0h72 != null) {
                    if (i5 != 0 && !c0h72.LIZ.LIZLLL.equals(c0h7.LIZ.LIZLLL) && !c0h72.LIZ.LIZLLL.equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                } else {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
            String optString2 = c0h7.LIZ.LIZIZ.optString("packageName");
            Iterator it = ((ArrayList) c0h5.LIZJ).iterator();
            while (it.hasNext()) {
                C0H7 c0h73 = (C0H7) it.next();
                if (!c0h7.LIZ.LIZLLL.equals("play_pass_subs") && !c0h73.LIZ.LIZLLL.equals("play_pass_subs") && !optString2.equals(c0h73.LIZ.LIZIZ.optString("packageName"))) {
                    throw new IllegalArgumentException("All products must have the same package name.");
                }
            }
        }
        C0HB c0hb = new C0HB();
        if ((z && !((SkuDetails) ListProtector.get(c0h5.LIZLLL, 0)).LIZIZ.optString("packageName").isEmpty()) || (z2 && !((C0H7) ListProtector.get(c0h5.LIZJ, 0)).LIZ.LIZIZ.optString("packageName").isEmpty())) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0hb.LIZ = z3;
        c0hb.LIZIZ = c0h5.LIZ;
        c0hb.LIZJ = c0h5.LIZIZ;
        C0H8 c0h8 = c0h5.LJ;
        c0h8.getClass();
        if (!TextUtils.isEmpty(null) || !TextUtils.isEmpty(null)) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = !TextUtils.isEmpty(null);
        if (!z4 || !z5) {
            if (c0h8.LIZ || z4 || z5) {
                C0H9 c0h9 = new C0H9();
                c0h9.LIZ = null;
                c0h9.LIZIZ = 0;
                c0hb.LIZLLL = c0h9;
                ArrayList arrayList5 = c0h5.LIZLLL;
                if (arrayList5 != null) {
                    arrayList = new ArrayList(arrayList5);
                } else {
                    arrayList = new ArrayList();
                }
                c0hb.LJFF = arrayList;
                c0hb.LJI = false;
                List list2 = c0h5.LIZJ;
                if (list2 != null) {
                    zzl = AbstractC65794Pry.zzk(list2);
                } else {
                    zzl = AbstractC65794Pry.zzl();
                }
                c0hb.LJ = zzl;
                return c0hb;
            }
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
    }
}
