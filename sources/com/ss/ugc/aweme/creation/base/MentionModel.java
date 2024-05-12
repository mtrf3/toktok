package com.ss.ugc.aweme.creation.base;

import X.C41266GHm;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class MentionModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<MentionModel> CREATOR = new C41266GHm();

    @InterfaceC65349Pkn("at_users")
    public List<UserModel> atUsers;

    /* JADX WARN: Multi-variable type inference failed */
    public MentionModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        List<UserModel> list = this.atUsers;
        parcel.writeInt(list.size());
        Iterator<UserModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public final List<UserModel> getAtUsers() {
        return this.atUsers;
    }

    public MentionModel(List<UserModel> atUsers) {
        o.LJIIIZ(atUsers, "atUsers");
        this.atUsers = atUsers;
    }

    public final void setAtUsers(List<UserModel> list) {
        o.LJIIIZ(list, "<set-?>");
        this.atUsers = list;
    }

    public /* synthetic */ MentionModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
