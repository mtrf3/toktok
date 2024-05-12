package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.0HP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HP extends BroadcastReceiver {
    public static final /* synthetic */ int LIZLLL = 0;
    public final C0HW LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C0D1 LIZJ;

    public /* synthetic */ C0HP(C0D1 c0d1) {
        this.LIZJ = c0d1;
    }

    public final void LIZ(Intent intent) {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        ArrayList arrayList = null;
        if (LLJJIJI == null) {
            C0HW c0hw = this.LIZ;
            if (c0hw != null) {
                c0hw.onPurchasesUpdated(C0HD.LJIIIZ, null);
                return;
            }
            return;
        }
        C0HE LIZLLL2 = C36864EdQ.LIZLLL(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            if (LLJJIJI.getBoolean("IS_FIRST_PARTY_PURCHASE", false) || this.LIZ == null) {
                return;
            }
            ArrayList<String> stringArrayList = LLJJIJI.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList2 = LLJJIJI.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            ArrayList arrayList2 = new ArrayList();
            if (stringArrayList == null || stringArrayList2 == null) {
                Purchase LJI = C36864EdQ.LJI(LLJJIJI.getString("INAPP_PURCHASE_DATA"), LLJJIJI.getString("INAPP_DATA_SIGNATURE"));
                if (LJI == null) {
                    C36864EdQ.LJFF("BillingHelper", "Couldn't find single purchase data as well.");
                    this.LIZ.onPurchasesUpdated(LIZLLL2, arrayList);
                    return;
                }
                arrayList2.add(LJI);
            } else {
                int size = stringArrayList.size();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Found purchase list of ");
                LIZ.append(size);
                LIZ.append(" items");
                C36864EdQ.LJFF("BillingHelper", X1D.LIZIZ(LIZ));
                for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                    Purchase LJI2 = C36864EdQ.LJI((String) ListProtector.get(stringArrayList, i), (String) ListProtector.get(stringArrayList2, i));
                    if (LJI2 != null) {
                        arrayList2.add(LJI2);
                    }
                }
            }
            arrayList = arrayList2;
            this.LIZ.onPurchasesUpdated(LIZLLL2, arrayList);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (LIZLLL2.LIZ != 0) {
                this.LIZ.onPurchasesUpdated(LIZLLL2, AbstractC65794Pry.zzl());
            } else {
                this.LIZ.onPurchasesUpdated(C0HD.LJIIIZ, AbstractC65794Pry.zzl());
            }
        }
    }

    public /* synthetic */ C0HP(C0D1 c0d1, C0HW c0hw) {
        this.LIZJ = c0d1;
        this.LIZ = c0hw;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C38523F9z.LIZ();
            LIZ(intent);
        }
    }
}
