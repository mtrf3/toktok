package com.ss.android.ugc.aweme.creative.model.stickers;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.C279017q;
import X.GPV;
import X.InterfaceC65349Pkn;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AddYoursStickerExtras implements Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursStickerExtras> CREATOR = new Parcelable.Creator<AddYoursStickerExtras>() { // from class: X.6Uj
        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerExtras createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Boolean valueOf;
            Long valueOf2;
            ArrayList arrayList;
            o.LJIIIZ(parcel, "parcel");
            int i = 0;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                valueOf = Boolean.valueOf(z5);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(parcel.readLong());
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    i = C5YW.LIZ(AddYoursStickerExtras.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AddYoursStickerExtras(z, z2, readString, readString2, readString3, z3, z4, valueOf, valueOf2, arrayList, num);
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerExtras[] newArray(int i) {
            return new AddYoursStickerExtras[i];
        }
    };

    @InterfaceC65349Pkn("addYoursEnterMethod")
    public final String addYoursEnterMethod;

    @InterfaceC65349Pkn("add_yours_invitees")
    public List<UserInvitee> addYoursInvitees;

    @GPV
    public boolean autoEnterAlbum;

    @GPV
    public boolean autoEnterStickerEdit;

    @InterfaceC65349Pkn("enterFrom")
    public final String enterFrom;

    @InterfaceC65349Pkn("followStatus")
    public final String followStatus;

    @InterfaceC65349Pkn("from_item_id")
    public final Long fromItemId;

    @InterfaceC65349Pkn("isFollowAY")
    public final boolean isFollowAY;

    @InterfaceC65349Pkn("isFromQA")
    public final boolean isFromQA;

    @InterfaceC65349Pkn("is_operation_set")
    public final Integer isOperationSet;

    @InterfaceC65349Pkn("viewer_is_invited")
    public final Boolean viewerInvited;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddYoursStickerExtras() {
        /*
            r14 = this;
            r1 = 0
            r3 = 0
            r12 = 2047(0x7ff, float:2.868E-42)
            r0 = r14
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r1
            r7 = r1
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r13 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddYoursStickerExtras copy$default(AddYoursStickerExtras addYoursStickerExtras, boolean z, boolean z2, String str, String str2, String str3, boolean z3, boolean z4, Boolean bool, Long l, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = addYoursStickerExtras.autoEnterStickerEdit;
        }
        if ((i & 2) != 0) {
            z2 = addYoursStickerExtras.autoEnterAlbum;
        }
        if ((i & 4) != 0) {
            str = addYoursStickerExtras.enterFrom;
        }
        if ((i & 8) != 0) {
            str2 = addYoursStickerExtras.addYoursEnterMethod;
        }
        if ((i & 16) != 0) {
            str3 = addYoursStickerExtras.followStatus;
        }
        if ((i & 32) != 0) {
            z3 = addYoursStickerExtras.isFollowAY;
        }
        if ((i & 64) != 0) {
            z4 = addYoursStickerExtras.isFromQA;
        }
        if ((i & 128) != 0) {
            bool = addYoursStickerExtras.viewerInvited;
        }
        if ((i & 256) != 0) {
            l = addYoursStickerExtras.fromItemId;
        }
        if ((i & 512) != 0) {
            list = addYoursStickerExtras.addYoursInvitees;
        }
        if ((i & 1024) != 0) {
            num = addYoursStickerExtras.isOperationSet;
        }
        return addYoursStickerExtras.copy(z, z2, str, str2, str3, z3, z4, bool, l, list, num);
    }

    public final AddYoursStickerExtras copy(boolean z, boolean z2, String str, String str2, String str3, boolean z3, boolean z4, Boolean bool, Long l, List<UserInvitee> list, Integer num) {
        return new AddYoursStickerExtras(z, z2, str, str2, str3, z3, z4, bool, l, list, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursStickerExtras)) {
            return false;
        }
        AddYoursStickerExtras addYoursStickerExtras = (AddYoursStickerExtras) obj;
        return this.autoEnterStickerEdit == addYoursStickerExtras.autoEnterStickerEdit && this.autoEnterAlbum == addYoursStickerExtras.autoEnterAlbum && o.LJ(this.enterFrom, addYoursStickerExtras.enterFrom) && o.LJ(this.addYoursEnterMethod, addYoursStickerExtras.addYoursEnterMethod) && o.LJ(this.followStatus, addYoursStickerExtras.followStatus) && this.isFollowAY == addYoursStickerExtras.isFollowAY && this.isFromQA == addYoursStickerExtras.isFromQA && o.LJ(this.viewerInvited, addYoursStickerExtras.viewerInvited) && o.LJ(this.fromItemId, addYoursStickerExtras.fromItemId) && o.LJ(this.addYoursInvitees, addYoursStickerExtras.addYoursInvitees) && o.LJ(this.isOperationSet, addYoursStickerExtras.isOperationSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    public int hashCode() {
        boolean z = this.autoEnterStickerEdit;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.autoEnterAlbum;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        String str = this.enterFrom;
        int hashCode = (i3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addYoursEnterMethod;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.followStatus;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ?? r03 = this.isFollowAY;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (((hashCode3 + i4) * 31) + (this.isFromQA ? 1 : 0)) * 31;
        Boolean bool = this.viewerInvited;
        int hashCode4 = (i5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.fromItemId;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        List<UserInvitee> list = this.addYoursInvitees;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.isOperationSet;
        return hashCode6 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddYoursStickerExtras(autoEnterStickerEdit=");
        sb.append(this.autoEnterStickerEdit);
        sb.append(", autoEnterAlbum=");
        sb.append(this.autoEnterAlbum);
        sb.append(", enterFrom=");
        sb.append(this.enterFrom);
        sb.append(", addYoursEnterMethod=");
        sb.append(this.addYoursEnterMethod);
        sb.append(", followStatus=");
        sb.append(this.followStatus);
        sb.append(", isFollowAY=");
        sb.append(this.isFollowAY);
        sb.append(", isFromQA=");
        sb.append(this.isFromQA);
        sb.append(", viewerInvited=");
        sb.append(this.viewerInvited);
        sb.append(", fromItemId=");
        sb.append(this.fromItemId);
        sb.append(", addYoursInvitees=");
        sb.append(this.addYoursInvitees);
        sb.append(", isOperationSet=");
        return UC7.LIZ(sb, this.isOperationSet, ')');
    }

    public final String getAddYoursEnterMethod() {
        return this.addYoursEnterMethod;
    }

    public final List<UserInvitee> getAddYoursInvitees() {
        return this.addYoursInvitees;
    }

    public final boolean getAutoEnterAlbum() {
        return this.autoEnterAlbum;
    }

    public final boolean getAutoEnterStickerEdit() {
        return this.autoEnterStickerEdit;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFollowStatus() {
        return this.followStatus;
    }

    public final Long getFromItemId() {
        return this.fromItemId;
    }

    public final Boolean getViewerInvited() {
        return this.viewerInvited;
    }

    public final boolean isFollowAY() {
        return this.isFollowAY;
    }

    public final boolean isFromQA() {
        return this.isFromQA;
    }

    public final Integer isOperationSet() {
        return this.isOperationSet;
    }

    public final void setAddYoursInvitees(List<UserInvitee> list) {
        this.addYoursInvitees = list;
    }

    public final void setAutoEnterAlbum(boolean z) {
        this.autoEnterAlbum = z;
    }

    public final void setAutoEnterStickerEdit(boolean z) {
        this.autoEnterStickerEdit = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.autoEnterStickerEdit ? 1 : 0);
        out.writeInt(this.autoEnterAlbum ? 1 : 0);
        out.writeString(this.enterFrom);
        out.writeString(this.addYoursEnterMethod);
        out.writeString(this.followStatus);
        out.writeInt(this.isFollowAY ? 1 : 0);
        out.writeInt(this.isFromQA ? 1 : 0);
        Boolean bool = this.viewerInvited;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Long l = this.fromItemId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        List<UserInvitee> list = this.addYoursInvitees;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeParcelable((Parcelable) LIZIZ.next(), i);
            }
        }
        Integer num = this.isOperationSet;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
    }

    public AddYoursStickerExtras(boolean z, boolean z2, String str, String str2, String str3, boolean z3, boolean z4, Boolean bool, Long l, List<UserInvitee> list, Integer num) {
        this.autoEnterStickerEdit = z;
        this.autoEnterAlbum = z2;
        this.enterFrom = str;
        this.addYoursEnterMethod = str2;
        this.followStatus = str3;
        this.isFollowAY = z3;
        this.isFromQA = z4;
        this.viewerInvited = bool;
        this.fromItemId = l;
        this.addYoursInvitees = list;
        this.isOperationSet = num;
    }

    public /* synthetic */ AddYoursStickerExtras(boolean z, boolean z2, String str, String str2, String str3, boolean z3, boolean z4, Boolean bool, Long l, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : l, (i & 512) == 0 ? list : null, (i & 1024) != 0 ? 0 : num);
    }
}
