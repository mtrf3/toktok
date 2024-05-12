package com.ss.android.ugc.aweme.question;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.question.ForumInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ForumInfo extends F9E implements Parcelable {
    public static final Parcelable.Creator<ForumInfo> CREATOR = new Parcelable.Creator<ForumInfo>() { // from class: X.6SB
        @Override // android.os.Parcelable.Creator
        public final ForumInfo createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i != readInt3; i++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            return new ForumInfo(readInt, readInt2, arrayList, parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ForumInfo[] newArray(int i) {
            return new ForumInfo[i];
        }
    };

    @InterfaceC65349Pkn("forum_status")
    public final int forumStatus;

    @InterfaceC65349Pkn("forum_type")
    public final int forumType;

    @InterfaceC65349Pkn("invited_users")
    public final List<Long> inviteUserList;

    @InterfaceC65349Pkn("question_from")
    public final int questionFrom;

    @InterfaceC65349Pkn("user_selected_categories")
    public final List<String> userSelectedCategories;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.forumType), Integer.valueOf(this.forumStatus), this.inviteUserList, Integer.valueOf(this.questionFrom), this.userSelectedCategories};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.forumType);
        out.writeInt(this.forumStatus);
        Iterator LIZJ = UC7.LIZJ(this.inviteUserList, out);
        while (LIZJ.hasNext()) {
            out.writeLong(((Number) LIZJ.next()).longValue());
        }
        out.writeInt(this.questionFrom);
        out.writeStringList(this.userSelectedCategories);
    }

    public ForumInfo(int i, int i2, List<Long> inviteUserList, int i3, List<String> userSelectedCategories) {
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(userSelectedCategories, "userSelectedCategories");
        this.forumType = i;
        this.forumStatus = i2;
        this.inviteUserList = inviteUserList;
        this.questionFrom = i3;
        this.userSelectedCategories = userSelectedCategories;
    }

    public ForumInfo(int i, int i2, List list, int i3, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? C61878OQg.INSTANCE : list, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
