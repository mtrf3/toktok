package com.bytedance.touchpoint.core.model;

import X.C08380Uo;
import X.C43588H8u;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ReferralWidgetResponse {

    @InterfaceC65349Pkn("widget_list")
    public WidgetList widgetList;

    @InterfaceC65349Pkn("widget_simple")
    public WidgetSimple widgetSimple;

    @InterfaceC65349Pkn("notification_id")
    public int notificationId = -1;

    @InterfaceC65349Pkn("widget_view_type")
    public String widgetViewType = "";

    /* loaded from: classes10.dex */
    public static final class TaskInfo {

        @InterfaceC65349Pkn("points_can_get")
        public String points;

        @InterfaceC65349Pkn("task_name")
        public String taskName;

        @InterfaceC65349Pkn("task_status")
        public int taskStatus;

        /* JADX WARN: Multi-variable type inference failed */
        public TaskInfo() {
            this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskInfo)) {
                return false;
            }
            TaskInfo taskInfo = (TaskInfo) obj;
            return o.LJ(this.taskName, taskInfo.taskName) && o.LJ(this.points, taskInfo.points) && this.taskStatus == taskInfo.taskStatus;
        }

        public final int hashCode() {
            String str = this.taskName;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.points;
            return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.taskStatus;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TaskInfo(taskName=");
            LIZ.append(this.taskName);
            LIZ.append(", points=");
            LIZ.append(this.points);
            LIZ.append(", taskStatus=");
            return C08380Uo.LIZ(LIZ, this.taskStatus, ")", LIZ);
        }

        public TaskInfo(String taskName, String points, int i) {
            o.LJIIIZ(taskName, "taskName");
            o.LJIIIZ(points, "points");
            this.taskName = taskName;
            this.points = points;
            this.taskStatus = i;
        }

        public /* synthetic */ TaskInfo(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i);
        }
    }

    /* loaded from: classes10.dex */
    public static final class WidgetSimple {

        @InterfaceC65349Pkn("display_can_get_reward")
        public String displayReward;

        @InterfaceC65349Pkn("jump_link")
        public String jumpLink;

        @InterfaceC65349Pkn("points_earned")
        public int pointsEarned;

        @InterfaceC65349Pkn("points_total")
        public int pointsTotal;

        @InterfaceC65349Pkn("points_progress_desc")
        public String progressDesc;

        @InterfaceC65349Pkn("title")
        public String title;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WidgetSimple() {
            /*
                r9 = this;
                r1 = 0
                r3 = 0
                r7 = 63
                r0 = r9
                r2 = r1
                r4 = r3
                r5 = r1
                r6 = r1
                r8 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.touchpoint.core.model.ReferralWidgetResponse.WidgetSimple.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WidgetSimple)) {
                return false;
            }
            WidgetSimple widgetSimple = (WidgetSimple) obj;
            return o.LJ(this.title, widgetSimple.title) && o.LJ(this.displayReward, widgetSimple.displayReward) && this.pointsEarned == widgetSimple.pointsEarned && this.pointsTotal == widgetSimple.pointsTotal && o.LJ(this.progressDesc, widgetSimple.progressDesc) && o.LJ(this.jumpLink, widgetSimple.jumpLink);
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.displayReward;
            int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.pointsEarned) * 31) + this.pointsTotal) * 31;
            String str3 = this.progressDesc;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.jumpLink;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WidgetSimple(title=");
            LIZ.append(this.title);
            LIZ.append(", displayReward=");
            LIZ.append(this.displayReward);
            LIZ.append(", pointsEarned=");
            LIZ.append(this.pointsEarned);
            LIZ.append(", pointsTotal=");
            LIZ.append(this.pointsTotal);
            LIZ.append(", progressDesc=");
            LIZ.append(this.progressDesc);
            LIZ.append(", jumpLink=");
            return JBR.LJFF(LIZ, this.jumpLink, ")", LIZ);
        }

        public WidgetSimple(String str, String str2, int i, int i2, String str3, String str4) {
            C43588H8u.LIZLLL(str, "title", str2, "displayReward", str3, "progressDesc", str4, "jumpLink");
            this.title = str;
            this.displayReward = str2;
            this.pointsEarned = i;
            this.pointsTotal = i2;
            this.progressDesc = str3;
            this.jumpLink = str4;
        }

        public /* synthetic */ WidgetSimple(String str, String str2, int i, int i2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) == 0 ? str4 : "");
        }
    }

    /* loaded from: classes10.dex */
    public static final class WidgetList {

        @InterfaceC65349Pkn("jump_link")
        public String jumpLink;

        @InterfaceC65349Pkn("points_earned")
        public String pointsEarned;

        @InterfaceC65349Pkn("points_total")
        public String pointsTotal;

        @InterfaceC65349Pkn("task_list")
        public List<TaskInfo> taskList;

        @InterfaceC65349Pkn("title")
        public String title;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WidgetList)) {
                return false;
            }
            WidgetList widgetList = (WidgetList) obj;
            return o.LJ(this.jumpLink, widgetList.jumpLink) && o.LJ(this.title, widgetList.title) && o.LJ(this.pointsEarned, widgetList.pointsEarned) && o.LJ(this.pointsTotal, widgetList.pointsTotal) && o.LJ(this.taskList, widgetList.taskList);
        }

        public final int hashCode() {
            String str = this.jumpLink;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.pointsEarned;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.pointsTotal;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            List<TaskInfo> list = this.taskList;
            return hashCode4 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WidgetList(jumpLink=");
            LIZ.append(this.jumpLink);
            LIZ.append(", title=");
            LIZ.append(this.title);
            LIZ.append(", pointsEarned=");
            LIZ.append(this.pointsEarned);
            LIZ.append(", pointsTotal=");
            LIZ.append(this.pointsTotal);
            LIZ.append(", taskList=");
            LIZ.append(this.taskList);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public WidgetList(String jumpLink, String str, String str2, String str3, List<TaskInfo> list) {
            o.LJIIIZ(jumpLink, "jumpLink");
            this.jumpLink = jumpLink;
            this.title = str;
            this.pointsEarned = str2;
            this.pointsTotal = str3;
            this.taskList = list;
        }

        public /* synthetic */ WidgetList(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", list);
        }
    }
}
