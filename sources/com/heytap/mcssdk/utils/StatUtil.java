package com.heytap.mcssdk.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.mode.MessageStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes28.dex */
public class StatUtil {
    public static final String TYPE = "type";

    public static void statisticMessage(Context context, MessageStat messageStat) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(messageStat);
        statisticMessage(context, linkedList);
    }

    public static boolean statisticMessage(Context context, List<MessageStat> list) {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(list);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isSupportStatisticByMcs:");
        LIZ.append(isSupportStatisticByMcs(context));
        LIZ.append(",list size:");
        LIZ.append(linkedList.size());
        d.b(X1D.LIZIZ(LIZ));
        if (linkedList.size() <= 0 || !isSupportStatisticByMcs(context)) {
            return false;
        }
        return statisticMessageByMcs(context, linkedList);
    }

    public static boolean isSupportStatisticByMcs(Context context) {
        String mcsPackageName = PushService.a.a.getMcsPackageName(context);
        if (Utils.isExistPackage(context, mcsPackageName) && Utils.getVersionCode(context, mcsPackageName) >= 1017) {
            return true;
        }
        return false;
    }

    public static boolean statisticMessageByMcs(Context context, List<MessageStat> list) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushService.a.a.getReceiveSdkAction(context));
            intent.setPackage(PushService.a.a.getMcsPackageName(context));
            intent.putExtra("appPackage", context.getPackageName());
            intent.putExtra("type", 12291);
            intent.putExtra("count", list.size());
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<MessageStat> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toJsonObject());
            }
            intent.putStringArrayListExtra("list", arrayList);
            C16880lQ.LLLL(context, intent);
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("statisticMessage--Exception");
            LIZ.append(e.getMessage());
            d.e(X1D.LIZIZ(LIZ));
            return false;
        }
    }
}
