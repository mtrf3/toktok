package com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto;

import X.C69635RUp;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class InteractiveUserTask implements Parcelable, Serializable {
    public static final Parcelable.Creator<InteractiveUserTask> CREATOR = new C69635RUp();

    @InterfaceC65349Pkn("parent_task_id")
    public String parentTaskId;

    @InterfaceC65349Pkn("room_id")
    public String roomId;

    @InterfaceC65349Pkn("task_status")
    public Integer taskStatus;

    @InterfaceC65349Pkn("user_id")
    public String userId;

    @InterfaceC65349Pkn("user_task_id")
    public String userTaskId;

    /* JADX WARN: Multi-variable type inference failed */
    public InteractiveUserTask() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeString(this.userTaskId);
        out.writeString(this.parentTaskId);
        out.writeString(this.userId);
        out.writeString(this.roomId);
        Integer num = this.taskStatus;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public final String getParentTaskId() {
        return this.parentTaskId;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public final Integer getTaskStatus() {
        return this.taskStatus;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserTaskId() {
        return this.userTaskId;
    }

    public final void setParentTaskId(String str) {
        this.parentTaskId = str;
    }

    public final void setRoomId(String str) {
        this.roomId = str;
    }

    public final void setTaskStatus(Integer num) {
        this.taskStatus = num;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public final void setUserTaskId(String str) {
        this.userTaskId = str;
    }

    public InteractiveUserTask(String str, String str2, String str3, String str4, Integer num) {
        this.userTaskId = str;
        this.parentTaskId = str2;
        this.userId = str3;
        this.roomId = str4;
        this.taskStatus = num;
    }

    public /* synthetic */ InteractiveUserTask(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? num : null);
    }
}
