package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.awemepushlib.experiments.PushMsgGroupAndLimitExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.QaA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC67238QaA implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        String channelId;
        boolean z;
        int i;
        StatusBarNotification[] statusBarNotificationArr;
        String str;
        StatusBarNotification[] statusBarNotificationArr2;
        switch (this.LJLIL) {
            case 0:
                ((C78391Upf) this.LJLILLLLZI).LJII((C78368UpI) this.LJLJI, (List) this.LJLJJI);
                return;
            case 1:
                C73062Slu this$0 = (C73062Slu) this.LJLILLLLZI;
                C73043Slb it = (C73043Slb) this.LJLJI;
                C73043Slb viewSize = (C73043Slb) this.LJLJJI;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(it, "$it");
                o.LJIIIZ(viewSize, "$viewSize");
                C73042Sla.LIZ(this$0.LJ(R.id.n9f), it, viewSize);
                return;
            default:
                Context context = (Context) this.LJLILLLLZI;
                C67230Qa2 pushMsg = (C67230Qa2) this.LJLJI;
                Notification notification = (Notification) this.LJLJJI;
                C67241QaD.LIZ.getClass();
                o.LJIIIZ(context, "context");
                o.LJIIIZ(pushMsg, "pushMsg");
                o.LJIIIZ(notification, "notification");
                if (PushMsgGroupAndLimitExp.LIZ()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 26) {
                        channelId = notification.getChannelId();
                    } else {
                        channelId = QSH.LIZIZ(2, "other_channel");
                    }
                    String str2 = pushMsg.extra.pushGroupId;
                    o.LJIIIIZZ(str2, "pushMsg.extra.pushGroupId");
                    int i3 = 0;
                    if (str2.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && PushMsgGroupAndLimitExp.LIZIZ()) {
                        o.LJIIIIZZ(channelId, "channelId");
                        String str3 = pushMsg.extra.pushGroupId;
                        o.LJIIIIZZ(str3, "pushMsg.extra.pushGroupId");
                        if (i2 >= 23) {
                            statusBarNotificationArr2 = C67241QaD.LIZ(context).getActiveNotifications();
                            o.LJIIIIZZ(statusBarNotificationArr2, "{\n            getNotific…veNotifications\n        }");
                        } else {
                            statusBarNotificationArr2 = new StatusBarNotification[0];
                        }
                        boolean z2 = false;
                        for (StatusBarNotification statusBarNotification : statusBarNotificationArr2) {
                            String tag = statusBarNotification.getTag();
                            String group = statusBarNotification.getNotification().getGroup();
                            StringBuilder LIZLLL = C06540Nm.LIZLLL("PushMsgManager shouldSendSummaryNotification notification tag: ", tag, ", groupkey: ", group, ", incoming id: ");
                            LIZLLL.append(str3);
                            QSI.LIZIZ(X1D.LIZIZ(LIZLLL));
                            if (TextUtils.equals(tag, "app_notify_ame") && TextUtils.equals(group, str3)) {
                                i3++;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("PushMsgManager has same groupId: ");
                                LIZ.append(str3);
                                LIZ.append(" msg");
                                QSI.LIZIZ(X1D.LIZIZ(LIZ));
                            }
                            if (TextUtils.equals(tag, "app_summary_tag") && TextUtils.equals(group, str3)) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("PushMsgManager has summary groupId: ");
                                LIZ2.append(str3);
                                QSI.LIZIZ(X1D.LIZIZ(LIZ2));
                                z2 = true;
                            }
                        }
                        StringBuilder LJ = AnonymousClass028.LJ("PushMsgManager groupId: ", str3, ", notifyNumWithSameGroup: ", i3, ",  has summary: ");
                        LJ.append(z2);
                        QSI.LIZIZ(X1D.LIZIZ(LJ));
                        if (i3 >= 2 && !z2) {
                            String str4 = pushMsg.extra.pushGroupId;
                            o.LJIIIIZZ(str4, "pushMsg.extra.pushGroupId");
                            C022406y c022406y = new C022406y(context, channelId);
                            c022406y.LJFF("TikTok");
                            c022406y.LJJIIJ.icon = R.drawable.b9p;
                            c022406y.LJII(16, true);
                            c022406y.LJIIZILJ = str4;
                            c022406y.LJIJ = true;
                            NotificationManager LIZ3 = C67241QaD.LIZ(context);
                            int nextInt = V0Q.Default.nextInt(10, 30000) + 10000;
                            StringBuilder LIZLLL2 = C06540Nm.LIZLLL("PushMsgManager will send summary for ", str4, ", channelId: ", channelId, ", pushid: ");
                            LIZLLL2.append(nextInt);
                            QSI.LIZIZ(X1D.LIZIZ(LIZLLL2));
                            LIZ3.notify("app_summary_tag", nextInt, c022406y.LIZIZ());
                        }
                    }
                    if (PushMsgGroupAndLimitExp.LIZIZ() || PushMsgGroupAndLimitExp.LIZ()) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            statusBarNotificationArr = C67241QaD.LIZ(context).getActiveNotifications();
                            o.LJIIIIZZ(statusBarNotificationArr, "{\n            getNotific…veNotifications\n        }");
                            i = 0;
                        } else {
                            i = 0;
                            statusBarNotificationArr = new StatusBarNotification[0];
                        }
                        NotificationManager LIZ4 = C67241QaD.LIZ(context);
                        C67241QaD.LJFF = i;
                        C67241QaD.LJI = i;
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        int i4 = 0;
                        for (StatusBarNotification statusBarNotification2 : statusBarNotificationArr) {
                            String tag2 = statusBarNotification2.getTag();
                            if (TextUtils.equals(tag2, "app_summary_tag")) {
                                i4++;
                            } else if (TextUtils.equals(tag2, "app_notify_ame")) {
                                C67241QaD.LJI++;
                            } else {
                                StringBuilder LIZIZ = C25620zW.LIZIZ("PushMsgManager not our notify tag, tag: ", tag2, ", group key: ");
                                LIZIZ.append(statusBarNotification2.getNotification().getGroup());
                                QSI.LIZIZ(X1D.LIZIZ(LIZIZ));
                            }
                            String group2 = statusBarNotification2.getNotification().getGroup();
                            if (group2 == null || group2.length() <= 0) {
                                group2 = "msg_group_id_not_defined";
                            }
                            Bundle bundle = statusBarNotification2.getNotification().extras;
                            if (bundle == null || (str = bundle.getString("push_label")) == null) {
                                str = "undefined";
                            }
                            StringBuilder LIZLLL3 = C06540Nm.LIZLLL("PushMsgManager check2LimitMsgCntAndGroupCnt, tag: ", tag2, ", group key: ", group2, ", pushLabel: ");
                            LIZLLL3.append(str);
                            QSI.LIZIZ(X1D.LIZIZ(LIZLLL3));
                            int id = statusBarNotification2.getId();
                            long postTime = statusBarNotification2.getPostTime();
                            o.LJIIIIZZ(tag2, "tag");
                            C67240QaC c67240QaC = new C67240QaC(id, tag2, str, postTime);
                            if (ujb.o.LJJJLIIL(group2, "android_exclusive_group", false)) {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("PushMsgManager has exclusiveGroupId with id: ");
                                LIZ5.append(group2);
                                QSI.LIZIZ(X1D.LIZIZ(LIZ5));
                                arrayList.add(c67240QaC);
                            }
                            if (hashMap.containsKey(group2)) {
                                C67239QaB c67239QaB = (C67239QaB) hashMap.get(group2);
                                if (c67239QaB != null) {
                                    c67239QaB.LIZ(c67240QaC);
                                }
                            } else {
                                C67239QaB c67239QaB2 = new C67239QaB(group2);
                                c67239QaB2.LIZ(c67240QaC);
                                hashMap.put(group2, c67239QaB2);
                                C67241QaD.LJFF++;
                            }
                        }
                        C62822Ol8 c62822Ol8 = PushMsgGroupAndLimitExp.LIZIZ;
                        int i5 = ((PushMsgGroupAndLimitExp.MetaData) c62822Ol8.getValue()).pushMsgCntUpLimit;
                        int i6 = ((PushMsgGroupAndLimitExp.MetaData) c62822Ol8.getValue()).pushCustomGroupCntUpLimit;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("PushMsgManager notification num: ");
                        LIZ6.append(C67241QaD.LJI);
                        LIZ6.append(", groupNum: ");
                        C15890jp.LIZIZ(LIZ6, C67241QaD.LJFF, ", summaryNum: ", i4, ", msgUpLimit: ");
                        LIZ6.append(i5);
                        LIZ6.append(", maxGroupCount: ");
                        LIZ6.append(i6);
                        QSI.LIZIZ(X1D.LIZIZ(LIZ6));
                        if (C67241QaD.LJFF > i6 && PushMsgGroupAndLimitExp.LIZIZ()) {
                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                            if (arrayList.size() > 0) {
                                Collections.sort(arrayList, C67241QaD.LIZIZ);
                                Object obj = ListProtector.get(arrayList, 0);
                                o.LJIIIIZZ(obj, "exclusiveGroups[0]");
                                C67240QaC c67240QaC2 = (C67240QaC) obj;
                                if (c67240QaC2.LIZ != C67230Qa2.getShortMsgID(pushMsg.id)) {
                                    StringBuilder LIZ7 = X1D.LIZ();
                                    LIZ7.append("PushMsgManager reached max group count, we will cancel exclusive group: ");
                                    LIZ7.append(c67240QaC2);
                                    QSI.LIZIZ(X1D.LIZIZ(LIZ7));
                                    c67240QaC2.LIZ(LIZ4);
                                    QSN.LJ(C67241QaD.LJFF, C67241QaD.LJI, "android_exclusive_group");
                                    return;
                                }
                            }
                            Collections.sort(arrayList2, C67241QaD.LIZJ);
                            Object obj2 = ListProtector.get(arrayList2, 0);
                            o.LJIIIIZZ(obj2, "commonNotifyGroups[0]");
                            C67239QaB c67239QaB3 = (C67239QaB) obj2;
                            StringBuilder LIZ8 = X1D.LIZ();
                            LIZ8.append("PushMsgManager cancel group ");
                            LIZ8.append(c67239QaB3.LIZ);
                            QSI.LIZIZ(X1D.LIZIZ(LIZ8));
                            QSN.LJ(C67241QaD.LJFF, C67241QaD.LJI, c67239QaB3.LIZ);
                            Iterator<C67240QaC> it2 = c67239QaB3.LIZJ.iterator();
                            while (it2.hasNext()) {
                                C67240QaC notifyItems = it2.next();
                                o.LJIIIIZZ(notifyItems, "notifyItems");
                                notifyItems.LIZ(LIZ4);
                            }
                            return;
                        }
                        if (C67241QaD.LJI <= i5 || !PushMsgGroupAndLimitExp.LIZ()) {
                            return;
                        }
                        if (pushMsg.isExclusiveGroupMsg()) {
                            Collections.sort(arrayList, C67241QaD.LIZIZ);
                            Object obj3 = ListProtector.get(arrayList, 0);
                            o.LJIIIIZZ(obj3, "exclusiveGroups[0]");
                            C67240QaC c67240QaC3 = (C67240QaC) obj3;
                            if (c67240QaC3.LIZ != C67230Qa2.getShortMsgID(pushMsg.id)) {
                                c67240QaC3.LIZ(LIZ4);
                                return;
                            }
                        }
                        C67239QaB c67239QaB4 = (C67239QaB) hashMap.get(pushMsg.extra.pushGroupId);
                        if (c67239QaB4 != null && c67239QaB4.LIZIZ.LIZ != C67230Qa2.getShortMsgID(pushMsg.id)) {
                            StringBuilder LIZ9 = X1D.LIZ();
                            LIZ9.append("PushMsgManager reached max msg count, we will cancel one msg from group: ");
                            LIZ9.append(pushMsg.extra.pushGroupId);
                            QSI.LIZIZ(X1D.LIZIZ(LIZ9));
                            c67239QaB4.LIZIZ(LIZ4);
                            return;
                        }
                        ArrayList arrayList3 = new ArrayList(hashMap.values());
                        Collections.sort(arrayList3, C67241QaD.LIZLLL);
                        ((C67239QaB) ListProtector.get(arrayList3, 0)).LIZIZ(LIZ4);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC67238QaA(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
