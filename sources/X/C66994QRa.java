package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QRa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66994QRa {
    public static List<String> LIZ;
    public static List<ServiceInfo> LIZIZ;
    public static List<ActivityInfo> LIZJ;
    public static List<ProviderInfo> LIZLLL;

    public static boolean LIZ(Context context, String str, List list) {
        ActivityInfo[] activityInfoArr;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (LIZJ == null) {
            synchronized (C66994QRa.class) {
                if (LIZJ == null && (activityInfoArr = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 514).receivers) != null) {
                    LIZJ = Arrays.asList(activityInfoArr);
                }
            }
        }
        List<ActivityInfo> list2 = LIZJ;
        if (list2 == null || list2.size() == 0) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(" error configuration:");
            LIZ2.append(list);
            X1D.LIZIZ(LIZ2);
            hg3.getClass();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C66995QRb c66995QRb = (C66995QRb) it.next();
            Iterator<ActivityInfo> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ActivityInfo next = it2.next();
                    if (TextUtils.equals(next.name, c66995QRb.LIZIZ)) {
                        if (!TextUtils.equals(c66995QRb.LIZJ, next.processName)) {
                            HG3 hg32 = QRM.LJIIIIZZ.LIZ;
                            StringBuilder LIZJ2 = b1.LIZJ(str, " receiver configure error: ");
                            LIZJ2.append(c66995QRb.LIZIZ);
                            LIZJ2.append(" should be in");
                            LIZJ2.append(c66995QRb.LIZJ);
                            LIZJ2.append(",but now in ");
                            LIZJ2.append(next.processName);
                            LIZJ2.append(" process");
                            X1D.LIZIZ(LIZJ2);
                            hg32.getClass();
                            z = false;
                        }
                        if (!TextUtils.isEmpty(c66995QRb.LIZLLL) && !TextUtils.equals(next.permission, c66995QRb.LIZLLL)) {
                            HG3 hg33 = QRM.LJIIIIZZ.LIZ;
                            StringBuilder LIZJ3 = b1.LIZJ(str, " receiver configure error: ");
                            LIZJ3.append(c66995QRb.LIZIZ);
                            LIZJ3.append(" need permission ");
                            LIZJ3.append(c66995QRb.LIZLLL);
                            LIZJ3.append(", but now the permission is:");
                            LIZJ3.append(next.permission);
                            X1D.LIZIZ(LIZJ3);
                            hg33.getClass();
                            z = false;
                        }
                        List<C66996QRc> list3 = c66995QRb.LIZ;
                        if (list3 != null) {
                            Iterator it3 = ((ArrayList) list3).iterator();
                            boolean z2 = true;
                            while (it3.hasNext()) {
                                C66996QRc c66996QRc = (C66996QRc) it3.next();
                                List<String> list4 = c66996QRc.LIZ;
                                if (list4 != null) {
                                    for (String str2 : list4) {
                                        String str3 = c66995QRb.LIZIZ;
                                        Intent intent = new Intent();
                                        intent.setPackage(context.getPackageName());
                                        List<String> list5 = c66996QRc.LIZIZ;
                                        if (list5 != null) {
                                            Iterator<String> it4 = list5.iterator();
                                            while (it4.hasNext()) {
                                                intent.addCategory(it4.next());
                                            }
                                        }
                                        intent.setAction(str2);
                                        if (!TextUtils.isEmpty(null)) {
                                            intent.setType(null);
                                        }
                                        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
                                        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                                            Iterator<ResolveInfo> it5 = queryBroadcastReceivers.iterator();
                                            while (it5.hasNext()) {
                                                ActivityInfo activityInfo = it5.next().activityInfo;
                                                if (activityInfo != null && TextUtils.equals(activityInfo.name, str3)) {
                                                    break;
                                                }
                                            }
                                        }
                                        HG3 hg34 = QRM.LJIIIIZZ.LIZ;
                                        StringBuilder LIZJ4 = b1.LIZJ(str, " ");
                                        LIZJ4.append(c66995QRb.LIZIZ);
                                        LIZJ4.append(" configure error，need action : ");
                                        LIZJ4.append(str2);
                                        X1D.LIZIZ(LIZJ4);
                                        hg34.getClass();
                                        z2 = false;
                                    }
                                }
                            }
                            if (!z2) {
                                z = false;
                            }
                        }
                    }
                } else {
                    arrayList.add(c66995QRb);
                    break;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            HG3 hg35 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(str);
            LIZ3.append(" receiver configure error: ");
            LIZ3.append(arrayList);
            X1D.LIZIZ(LIZ3);
            hg35.getClass();
        }
        if (z && arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Context context, String str, List list) {
        boolean z;
        ServiceInfo[] serviceInfoArr;
        if (list == null || list.isEmpty()) {
            return true;
        }
        if (LIZIZ == null) {
            synchronized (C66994QRa.class) {
                if (LIZIZ == null && (serviceInfoArr = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 516).services) != null) {
                    LIZIZ = Arrays.asList(serviceInfoArr);
                }
            }
        }
        List<ServiceInfo> list2 = LIZIZ;
        if (list2 == null || list2.size() == 0) {
            HG3 hg3 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(". You need to declare service(s) {");
            LIZ2.append(list);
            LIZ2.append("} in AndroidManifest.xml");
            X1D.LIZIZ(LIZ2);
            hg3.getClass();
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            C66995QRb c66995QRb = (C66995QRb) it.next();
            Iterator<ServiceInfo> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ServiceInfo next = it2.next();
                    if (TextUtils.equals(next.name, c66995QRb.LIZIZ)) {
                        boolean equals = TextUtils.equals(c66995QRb.LIZJ, next.processName);
                        if (!TextUtils.isEmpty(c66995QRb.LIZLLL)) {
                            z = TextUtils.equals(next.permission, c66995QRb.LIZLLL);
                        } else {
                            z = true;
                        }
                        if (!equals) {
                            HG3 hg32 = QRM.LJIIIIZZ.LIZ;
                            StringBuilder LIZJ2 = b1.LIZJ(str, " service configure error: ");
                            LIZJ2.append(c66995QRb.LIZIZ);
                            LIZJ2.append(" should be declared in process ");
                            LIZJ2.append(c66995QRb.LIZJ);
                            LIZJ2.append(", but now in ");
                            LIZJ2.append(next.processName);
                            X1D.LIZIZ(LIZJ2);
                            hg32.getClass();
                            z2 = false;
                        }
                        if (!z) {
                            HG3 hg33 = QRM.LJIIIIZZ.LIZ;
                            StringBuilder LIZJ3 = b1.LIZJ(str, " service configure error: ");
                            LIZJ3.append(c66995QRb.LIZIZ);
                            LIZJ3.append(" need permission(s) {");
                            LIZJ3.append(c66995QRb.LIZLLL);
                            LIZJ3.append("}, but now ");
                            LIZJ3.append(next.permission);
                            X1D.LIZIZ(LIZJ3);
                            hg33.getClass();
                            z2 = false;
                        }
                        List<C66996QRc> list3 = c66995QRb.LIZ;
                        if (list3 != null) {
                            Iterator it3 = ((ArrayList) list3).iterator();
                            boolean z3 = true;
                            while (it3.hasNext()) {
                                C66996QRc c66996QRc = (C66996QRc) it3.next();
                                List<String> list4 = c66996QRc.LIZ;
                                if (list4 != null) {
                                    for (String str2 : list4) {
                                        String str3 = c66995QRb.LIZIZ;
                                        Intent intent = new Intent();
                                        intent.setPackage(context.getPackageName());
                                        List<String> list5 = c66996QRc.LIZIZ;
                                        if (list5 != null) {
                                            Iterator<String> it4 = list5.iterator();
                                            while (it4.hasNext()) {
                                                intent.addCategory(it4.next());
                                            }
                                        }
                                        intent.setAction(str2);
                                        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
                                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                                            for (ResolveInfo resolveInfo : queryIntentServices) {
                                                if (resolveInfo.serviceInfo == null || (!TextUtils.isEmpty(str3) && !TextUtils.equals(resolveInfo.serviceInfo.name, str3))) {
                                                }
                                            }
                                        }
                                        HG3 hg34 = QRM.LJIIIIZZ.LIZ;
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append(str);
                                        YE1.LIZLLL(LIZ3, c66995QRb.LIZIZ, " need to declare {", str2, "} action(s) in AndroidManifest.xml");
                                        X1D.LIZIZ(LIZ3);
                                        hg34.getClass();
                                        z3 = false;
                                    }
                                }
                            }
                            if (!z3) {
                                z2 = false;
                            }
                        }
                    }
                } else {
                    arrayList.add(c66995QRb);
                    break;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            HG3 hg35 = QRM.LJIIIIZZ.LIZ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(str);
            LIZ4.append(" need to declare service(s) {");
            LIZ4.append(arrayList);
            LIZ4.append("} in AndroidManifest.xml");
            X1D.LIZIZ(LIZ4);
            hg35.getClass();
        }
        if (z2 && arrayList.isEmpty()) {
            return true;
        }
        return false;
    }
}
