package com.ss.android.ugc.aweme.tools.sticker.core.addyours;

import X.AnonymousClass391;
import X.C05040Hs;
import X.C1554468e;
import X.C1FJ;
import X.C279017q;
import X.C61878OQg;
import X.C78685UuP;
import X.EnumC157656Gr;
import X.InterfaceC65349Pkn;
import X.OSZ;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AddYoursStickerModel implements StickerModel, Parcelable, Serializable {
    public static final Parcelable.Creator<AddYoursStickerModel> CREATOR = new Parcelable.Creator<AddYoursStickerModel>() { // from class: X.6TR
        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerModel createFromParcel(Parcel parcel) {
            Long valueOf;
            Long valueOf2;
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList arrayList;
            o.LJIIIZ(parcel, "parcel");
            BaseStickerModel createFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C5YW.LIZ(AddYoursStickerModel.class, parcel, arrayList2, i, 1);
            }
            Integer num = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(parcel.readLong());
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(parcel.readLong());
            }
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
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AddYoursStickerModel(createFromParcel, arrayList2, valueOf, readString, readString2, valueOf2, z, z2, z3, arrayList, readString3, num);
        }

        @Override // android.os.Parcelable.Creator
        public final AddYoursStickerModel[] newArray(int i) {
            return new AddYoursStickerModel[i];
        }
    };

    @InterfaceC65349Pkn("add_yours_enter_method")
    public String addYoursEnterMethod;

    @InterfaceC65349Pkn("add_yours_invitees")
    public final List<Long> addYoursInvitees;

    @InterfaceC65349Pkn("avatars")
    public final List<AddYoursAvatar> avatars;

    @InterfaceC65349Pkn("base_sticker_model")
    public final BaseStickerModel baseStickerModel;

    @InterfaceC65349Pkn("clickable")
    public final boolean clickable;

    @InterfaceC65349Pkn("editable")
    public final boolean editable;

    @InterfaceC65349Pkn("follow_count")
    public final Long followCount;

    @InterfaceC65349Pkn("is_operation_set")
    public Integer isOperationSet;

    @InterfaceC65349Pkn("topic_id")
    public final Long topicID;

    @InterfaceC65349Pkn("topic_text")
    public final String topicText;

    @InterfaceC65349Pkn("topic_text_from_recommend_topic_list")
    public final String topicTextFromRecommendTopicList;

    @InterfaceC65349Pkn("visible")
    public final boolean visible;

    public AddYoursStickerModel() {
        this(null, null, null, null, null, null, false, false, false, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddYoursStickerModel copy$default(AddYoursStickerModel addYoursStickerModel, BaseStickerModel baseStickerModel, List list, Long l, String str, String str2, Long l2, boolean z, boolean z2, boolean z3, List list2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            baseStickerModel = addYoursStickerModel.baseStickerModel;
        }
        if ((i & 2) != 0) {
            list = addYoursStickerModel.avatars;
        }
        if ((i & 4) != 0) {
            l = addYoursStickerModel.topicID;
        }
        if ((i & 8) != 0) {
            str = addYoursStickerModel.topicText;
        }
        if ((i & 16) != 0) {
            str2 = addYoursStickerModel.topicTextFromRecommendTopicList;
        }
        if ((i & 32) != 0) {
            l2 = addYoursStickerModel.followCount;
        }
        if ((i & 64) != 0) {
            z = addYoursStickerModel.visible;
        }
        if ((i & 128) != 0) {
            z2 = addYoursStickerModel.editable;
        }
        if ((i & 256) != 0) {
            z3 = addYoursStickerModel.clickable;
        }
        if ((i & 512) != 0) {
            list2 = addYoursStickerModel.addYoursInvitees;
        }
        if ((i & 1024) != 0) {
            str3 = addYoursStickerModel.addYoursEnterMethod;
        }
        if ((i & 2048) != 0) {
            num = addYoursStickerModel.isOperationSet;
        }
        return addYoursStickerModel.copy(baseStickerModel, list, l, str, str2, l2, z, z2, z3, list2, str3, num);
    }

    public final AddYoursStickerModel copy(BaseStickerModel baseStickerModel, List<AddYoursAvatar> avatars, Long l, String str, String str2, Long l2, boolean z, boolean z2, boolean z3, List<Long> list, String str3, Integer num) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(avatars, "avatars");
        return new AddYoursStickerModel(baseStickerModel, avatars, l, str, str2, l2, z, z2, z3, list, str3, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursStickerModel)) {
            return false;
        }
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) obj;
        return o.LJ(this.baseStickerModel, addYoursStickerModel.baseStickerModel) && o.LJ(this.avatars, addYoursStickerModel.avatars) && o.LJ(this.topicID, addYoursStickerModel.topicID) && o.LJ(this.topicText, addYoursStickerModel.topicText) && o.LJ(this.topicTextFromRecommendTopicList, addYoursStickerModel.topicTextFromRecommendTopicList) && o.LJ(this.followCount, addYoursStickerModel.followCount) && this.visible == addYoursStickerModel.visible && this.editable == addYoursStickerModel.editable && this.clickable == addYoursStickerModel.clickable && o.LJ(this.addYoursInvitees, addYoursStickerModel.addYoursInvitees) && o.LJ(this.addYoursEnterMethod, addYoursStickerModel.addYoursEnterMethod) && o.LJ(this.isOperationSet, addYoursStickerModel.isOperationSet);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        int i = 1;
        InteractStickerStruct LIZIZ = C1554468e.LIZIZ(this, true);
        if (!o.LJ(getAddYoursEnterMethod(), "shoot_page_entrance") && !o.LJ(getAddYoursEnterMethod(), "edit_page_entrance") && !o.LJ(getAddYoursEnterMethod(), "edit_page_sticker")) {
            i = 2;
        }
        LIZIZ.setAddYoursStickerStruct(new AddYoursStickerStruct(getTopicID(), null, getTopicText(), Integer.valueOf(i), getAvatars(), getFollowCount(), null, getAddYoursInvitees(), null, 0L, 834, null));
        LIZIZ.setType(getStickerType().getType());
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return this.baseStickerModel.getId();
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC157656Gr getStickerType() {
        return this.baseStickerModel.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int LIZIZ = AnonymousClass391.LIZIZ(this.avatars, this.baseStickerModel.hashCode() * 31, 31);
        Long l = this.topicID;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        String str = this.topicText;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.topicTextFromRecommendTopicList;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l2 = this.followCount;
        if (l2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        boolean z = this.visible;
        int i6 = 1;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i5 + i7) * 31;
        boolean z2 = this.editable;
        int i9 = z2;
        if (z2 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        if (!this.clickable) {
            i6 = 0;
        }
        int i11 = (i10 + i6) * 31;
        List<Long> list = this.addYoursInvitees;
        if (list == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        String str3 = this.addYoursEnterMethod;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Integer num = this.isOperationSet;
        if (num != null) {
            i = num.hashCode();
        }
        return i13 + i;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        if (this.topicID != null) {
            return true;
        }
        if (C78685UuP.LJJJZ(this.topicText) && (!ujb.o.LJJJJJL(this.topicText))) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AddYoursStickerModel(baseStickerModel=");
        sb.append(this.baseStickerModel);
        sb.append(", avatars=");
        sb.append(this.avatars);
        sb.append(", topicID=");
        sb.append(this.topicID);
        sb.append(", topicText=");
        sb.append(this.topicText);
        sb.append(", topicTextFromRecommendTopicList=");
        sb.append(this.topicTextFromRecommendTopicList);
        sb.append(", followCount=");
        sb.append(this.followCount);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", editable=");
        sb.append(this.editable);
        sb.append(", clickable=");
        sb.append(this.clickable);
        sb.append(", addYoursInvitees=");
        sb.append(this.addYoursInvitees);
        sb.append(", addYoursEnterMethod=");
        sb.append(this.addYoursEnterMethod);
        sb.append(", isOperationSet=");
        return UC7.LIZ(sb, this.isOperationSet, ')');
    }

    public final String getAddYoursEnterMethod() {
        return this.addYoursEnterMethod;
    }

    public final List<Long> getAddYoursInvitees() {
        return this.addYoursInvitees;
    }

    public final List<AddYoursAvatar> getAvatars() {
        return this.avatars;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseSticker() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final Long getFollowCount() {
        return this.followCount;
    }

    public final Long getTopicID() {
        return this.topicID;
    }

    public final String getTopicText() {
        return this.topicText;
    }

    public final String getTopicTextFromRecommendTopicList() {
        return this.topicTextFromRecommendTopicList;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final Integer isOperationSet() {
        return this.isOperationSet;
    }

    public final void setAddYoursEnterMethod(String str) {
        this.addYoursEnterMethod = str;
    }

    public final void setOperationSet(Integer num) {
        this.isOperationSet = num;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(OSZ<Integer, Integer> newMediaSize) {
        o.LJIIIZ(newMediaSize, "newMediaSize");
        return copy$default(this, BaseStickerModel.copy$default(this.baseStickerModel, 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, newMediaSize.getFirst().intValue(), newMediaSize.getSecond().intValue(), false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -24577, null), null, null, null, null, null, false, false, false, null, null, null, 4094, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        this.baseStickerModel.writeToParcel(out, i);
        Iterator LIZJ = UC7.LIZJ(this.avatars, out);
        while (LIZJ.hasNext()) {
            out.writeParcelable((Parcelable) LIZJ.next(), i);
        }
        Long l = this.topicID;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.topicText);
        out.writeString(this.topicTextFromRecommendTopicList);
        Long l2 = this.followCount;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        out.writeInt(this.visible ? 1 : 0);
        out.writeInt(this.editable ? 1 : 0);
        out.writeInt(this.clickable ? 1 : 0);
        List<Long> list = this.addYoursInvitees;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                out.writeLong(((Number) LIZIZ.next()).longValue());
            }
        }
        out.writeString(this.addYoursEnterMethod);
        Integer num = this.isOperationSet;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
    }

    public AddYoursStickerModel(BaseStickerModel baseStickerModel, List<AddYoursAvatar> avatars, Long l, String str, String str2, Long l2, boolean z, boolean z2, boolean z3, List<Long> list, String str3, Integer num) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(avatars, "avatars");
        this.baseStickerModel = baseStickerModel;
        this.avatars = avatars;
        this.topicID = l;
        this.topicText = str;
        this.topicTextFromRecommendTopicList = str2;
        this.followCount = l2;
        this.visible = z;
        this.editable = z2;
        this.clickable = z3;
        this.addYoursInvitees = list;
        this.addYoursEnterMethod = str3;
        this.isOperationSet = num;
    }

    public AddYoursStickerModel(BaseStickerModel baseStickerModel, List list, Long l, String str, String str2, Long l2, boolean z, boolean z2, boolean z3, List list2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null) : baseStickerModel, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? true : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : list2, (i & 1024) == 0 ? str3 : null, (i & 2048) != 0 ? 0 : num);
    }
}
