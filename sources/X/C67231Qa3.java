package X;

import Y.ARunnableS14S0201000_11;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Qa3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67231Qa3 {
    public static void LIZ(InterfaceC173286r6 interfaceC173286r6, Context context, C67230Qa2 c67230Qa2, List list, ARunnableS14S0201000_11 aRunnableS14S0201000_11) {
        NotificationManager notificationManager;
        int shortMsgID;
        boolean z;
        o.LJIIIZ(context, "context");
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C67233Qa5 c67233Qa5 = (C67233Qa5) it.next();
            if (c67233Qa5 != null && c67233Qa5.LIZIZ == c67230Qa2.revokeId) {
                it.remove();
            }
        }
        C67233Qa5 c67233Qa52 = new C67233Qa5();
        c67233Qa52.LIZ = c67230Qa2.id;
        c67233Qa52.LIZIZ = c67230Qa2.revokeId;
        c67233Qa52.LIZJ = c67230Qa2.revokeType;
        c67233Qa52.LIZLLL = C47704Ins.LIZIZ();
        android.net.Uri parse = UriProtector.parse(c67230Qa2.openUrl);
        if (parse != null) {
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "gd_label"))) {
                c67233Qa52.LJ = UriProtector.getQueryParameter(parse, "gd_label");
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "aggregate_num"))) {
                c67233Qa52.LJFF = UriProtector.getQueryParameter(parse, "aggregate_num");
            }
            if (!TextUtils.isEmpty(UriProtector.getQueryParameter(parse, "itemid"))) {
                c67233Qa52.LJI = UriProtector.getQueryParameter(parse, "itemid");
            }
        }
        arrayList.add(c67233Qa52);
        if (C67234Qa6.LIZJ == null) {
            synchronized (C67234Qa6.class) {
                if (C67234Qa6.LIZJ == null) {
                    C67234Qa6.LIZJ = new C67234Qa6();
                }
            }
        }
        C67234Qa6 c67234Qa6 = C67234Qa6.LIZJ;
        Keva keva = c67234Qa6.LIZIZ;
        if (keva != null) {
            c67234Qa6.LIZ.getClass();
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C67233Qa5 c67233Qa53 = (C67233Qa5) it2.next();
                if (c67233Qa53 != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("rid", c67233Qa53.LIZ);
                        jSONObject.put("revoke_id", c67233Qa53.LIZIZ);
                        jSONObject.put("revoke_type", c67233Qa53.LIZJ);
                        jSONObject.put("ts", c67233Qa53.LIZLLL);
                        jSONObject.put("push_label", c67233Qa53.LJ);
                        jSONObject.put("aggregate_num", c67233Qa53.LJFF);
                        jSONObject.put("itemid", c67233Qa53.LJI);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    jSONArray.put(jSONObject);
                }
            }
            keva.storeString("revoke_rid_list", jSONArray.toString());
        }
        FMX.LJIIL("push_withdraw", C67233Qa5.LIZ(c67233Qa52));
        boolean z2 = false;
        try {
            notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification");
            shortMsgID = C67230Qa2.getShortMsgID(c67230Qa2.revokeId);
        } catch (Throwable unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications != null) {
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (statusBarNotification != null && statusBarNotification.getId() == shortMsgID) {
                    }
                }
            }
            z = false;
            notificationManager.cancel("app_notify_ame", shortMsgID);
            z2 = z;
            interfaceC173286r6.LJIILLIIL(z2, c67233Qa52, aRunnableS14S0201000_11);
        }
        z = true;
        notificationManager.cancel("app_notify_ame", shortMsgID);
        z2 = z;
        interfaceC173286r6.LJIILLIIL(z2, c67233Qa52, aRunnableS14S0201000_11);
    }
}
