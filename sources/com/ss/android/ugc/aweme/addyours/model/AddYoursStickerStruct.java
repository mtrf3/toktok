package com.ss.android.ugc.aweme.addyours.model;

import X.C05040Hs;
import X.C16880lQ;
import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursStickerStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursStickerStruct> CREATOR = new Parcelable.Creator<AddYoursStickerStruct>() { // from class: X.8lM
        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerStruct createFromParcel(Parcel parcel) {
            Long valueOf;
            Long valueOf2;
            Integer valueOf3;
            ArrayList arrayList;
            Long valueOf4;
            boolean z;
            Boolean valueOf5;
            ArrayList arrayList2;
            o.LJIIIZ(parcel, "parcel");
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(parcel.readLong());
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            boolean z2 = false;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = C279117r.LIZIZ(AddYoursAvatar.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                valueOf5 = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            }
            return new AddYoursStickerStruct(valueOf, valueOf2, readString, valueOf3, arrayList, valueOf4, valueOf5, arrayList2, bool, parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerStruct[] newArray(int i) {
            return new AddYoursStickerStruct[i];
        }
    };

    @InterfaceC65349Pkn("add_yours_invitees")
    public List<Long> addYoursInvitees;

    @InterfaceC65349Pkn("from_item_id")
    public Long fromItemId;

    @InterfaceC65349Pkn("from_question")
    public Boolean fromQuestion;

    @InterfaceC65349Pkn("shoot_from")
    public Integer shootFrom;

    @InterfaceC65349Pkn("text")
    public String text;
    public long timeStamp;

    @InterfaceC65349Pkn("topic_id")
    public Long topicId;

    @InterfaceC65349Pkn("user_avatars")
    public List<AddYoursAvatar> userAvatars;

    @InterfaceC65349Pkn("videos_count")
    public Long videoCount;

    @InterfaceC65349Pkn("viewer_is_invited")
    public Boolean viewerInvited;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursStickerStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddYoursStickerStruct copy$default(AddYoursStickerStruct addYoursStickerStruct, Long l, Long l2, String str, Integer num, List list, Long l3, Boolean bool, List list2, Boolean bool2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            l = addYoursStickerStruct.topicId;
        }
        if ((i & 2) != 0) {
            l2 = addYoursStickerStruct.fromItemId;
        }
        if ((i & 4) != 0) {
            str = addYoursStickerStruct.text;
        }
        if ((i & 8) != 0) {
            num = addYoursStickerStruct.shootFrom;
        }
        if ((i & 16) != 0) {
            list = addYoursStickerStruct.userAvatars;
        }
        if ((i & 32) != 0) {
            l3 = addYoursStickerStruct.videoCount;
        }
        if ((i & 64) != 0) {
            bool = addYoursStickerStruct.fromQuestion;
        }
        if ((i & 128) != 0) {
            list2 = addYoursStickerStruct.addYoursInvitees;
        }
        if ((i & 256) != 0) {
            bool2 = addYoursStickerStruct.viewerInvited;
        }
        if ((i & 512) != 0) {
            j = addYoursStickerStruct.timeStamp;
        }
        return addYoursStickerStruct.copy(l, l2, str, num, list, l3, bool, list2, bool2, j);
    }

    public final AddYoursStickerStruct copy(Long l, Long l2, String str, Integer num, List<AddYoursAvatar> list, Long l3, Boolean bool, List<Long> list2, Boolean bool2, long j) {
        return new AddYoursStickerStruct(l, l2, str, num, list, l3, bool, list2, bool2, j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursStickerStruct)) {
            return false;
        }
        AddYoursStickerStruct addYoursStickerStruct = (AddYoursStickerStruct) obj;
        return o.LJ(this.topicId, addYoursStickerStruct.topicId) && o.LJ(this.fromItemId, addYoursStickerStruct.fromItemId) && o.LJ(this.text, addYoursStickerStruct.text) && o.LJ(this.shootFrom, addYoursStickerStruct.shootFrom) && o.LJ(this.userAvatars, addYoursStickerStruct.userAvatars) && o.LJ(this.videoCount, addYoursStickerStruct.videoCount) && o.LJ(this.fromQuestion, addYoursStickerStruct.fromQuestion) && o.LJ(this.addYoursInvitees, addYoursStickerStruct.addYoursInvitees) && o.LJ(this.viewerInvited, addYoursStickerStruct.viewerInvited) && this.timeStamp == addYoursStickerStruct.timeStamp;
    }

    public int hashCode() {
        Long l = this.topicId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.fromItemId;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.text;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.shootFrom;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<AddYoursAvatar> list = this.userAvatars;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l3 = this.videoCount;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.fromQuestion;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Long> list2 = this.addYoursInvitees;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool2 = this.viewerInvited;
        return C16880lQ.LLJIJIL(this.timeStamp) + ((hashCode8 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursStickerStruct(topicId=");
        LIZ.append(this.topicId);
        LIZ.append(", fromItemId=");
        LIZ.append(this.fromItemId);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", shootFrom=");
        LIZ.append(this.shootFrom);
        LIZ.append(", userAvatars=");
        LIZ.append(this.userAvatars);
        LIZ.append(", videoCount=");
        LIZ.append(this.videoCount);
        LIZ.append(", fromQuestion=");
        LIZ.append(this.fromQuestion);
        LIZ.append(", addYoursInvitees=");
        LIZ.append(this.addYoursInvitees);
        LIZ.append(", viewerInvited=");
        LIZ.append(this.viewerInvited);
        LIZ.append(", timeStamp=");
        return C47135Ieh.LIZIZ(LIZ, this.timeStamp, ')', LIZ);
    }

    public final List<Long> getAddYoursInvitees() {
        return this.addYoursInvitees;
    }

    public final Long getFromItemId() {
        return this.fromItemId;
    }

    public final Boolean getFromQuestion() {
        return this.fromQuestion;
    }

    public final Integer getShootFrom() {
        return this.shootFrom;
    }

    public final String getText() {
        return this.text;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final Long getTopicId() {
        return this.topicId;
    }

    public final List<AddYoursAvatar> getUserAvatars() {
        return this.userAvatars;
    }

    public final Long getVideoCount() {
        return this.videoCount;
    }

    public final Boolean getViewerInvited() {
        return this.viewerInvited;
    }

    public final void setFromItemId(Long l) {
        this.fromItemId = l;
    }

    public final void setFromQuestion(Boolean bool) {
        this.fromQuestion = bool;
    }

    public final void setShootFrom(Integer num) {
        this.shootFrom = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setUserAvatars(List<AddYoursAvatar> list) {
        this.userAvatars = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.topicId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.fromItemId;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        out.writeString(this.text);
        Integer num = this.shootFrom;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        List<AddYoursAvatar> list = this.userAvatars;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((AddYoursAvatar) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Long l3 = this.videoCount;
        if (l3 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l3);
        }
        Boolean bool = this.fromQuestion;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        List<Long> list2 = this.addYoursInvitees;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
            while (LIZIZ2.hasNext()) {
                out.writeLong(((Number) LIZIZ2.next()).longValue());
            }
        }
        Boolean bool2 = this.viewerInvited;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
        out.writeLong(this.timeStamp);
    }

    public AddYoursStickerStruct(Long l, Long l2, String str, Integer num, List<AddYoursAvatar> list, Long l3, Boolean bool, List<Long> list2, Boolean bool2, long j) {
        this.topicId = l;
        this.fromItemId = l2;
        this.text = str;
        this.shootFrom = num;
        this.userAvatars = list;
        this.videoCount = l3;
        this.fromQuestion = bool;
        this.addYoursInvitees = list2;
        this.viewerInvited = bool2;
        this.timeStamp = j;
    }

    public /* synthetic */ AddYoursStickerStruct(Long l, Long l2, String str, Integer num, List list, Long l3, Boolean bool, List list2, Boolean bool2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : list2, (i & 256) == 0 ? bool2 : null, (i & 512) != 0 ? System.currentTimeMillis() : j);
    }
}
