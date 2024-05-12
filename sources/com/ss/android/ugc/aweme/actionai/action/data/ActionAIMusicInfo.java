package com.ss.android.ugc.aweme.actionai.action.data;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ActionAIMusicInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<ActionAIMusicInfo> CREATOR = new Creator();

    @InterfaceC65349Pkn("id")
    public final long id;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ActionAIMusicInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionAIMusicInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new ActionAIMusicInfo(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ActionAIMusicInfo[] newArray(int i) {
            return new ActionAIMusicInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActionAIMusicInfo() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ActionAIMusicInfo copy$default(ActionAIMusicInfo actionAIMusicInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = actionAIMusicInfo.id;
        }
        if ((i & 2) != 0) {
            str = actionAIMusicInfo.title;
        }
        return actionAIMusicInfo.copy(j, str);
    }

    public final ActionAIMusicInfo copy(long j, String title) {
        o.LJIIIZ(title, "title");
        return new ActionAIMusicInfo(j, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.id), this.title};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.id);
        out.writeString(this.title);
    }

    public final long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public ActionAIMusicInfo(long j, String title) {
        o.LJIIIZ(title, "title");
        this.id = j;
        this.title = title;
    }

    public /* synthetic */ ActionAIMusicInfo(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
