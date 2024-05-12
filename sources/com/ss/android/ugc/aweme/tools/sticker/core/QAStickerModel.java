package com.ss.android.ugc.aweme.tools.sticker.core;

import X.AnonymousClass391;
import X.C47959Irz;
import X.C61878OQg;
import X.C79062V1e;
import X.EnumC157656Gr;
import X.EnumC81462Vy6;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.OSZ;
import X.UC7;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.question.InviteInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class QAStickerModel implements StickerModel, Parcelable, Serializable {
    public static final Parcelable.Creator<QAStickerModel> CREATOR = new Parcelable.Creator<QAStickerModel>() { // from class: X.6Ip
        @Override // android.os.Parcelable.Creator
        public final QAStickerModel createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Integer valueOf;
            o.LJIIIZ(parcel, "parcel");
            BaseStickerModel createFromParcel = BaseStickerModel.CREATOR.createFromParcel(parcel);
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            UrlModel urlModel = (UrlModel) parcel.readSerializable();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Long.valueOf(parcel.readLong()));
            }
            EnumC81462Vy6 valueOf2 = EnumC81462Vy6.valueOf(parcel.readString());
            ShareInfo shareInfo = (ShareInfo) parcel.readSerializable();
            String readString4 = parcel.readString();
            int readInt2 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                String readString5 = parcel.readString();
                int readInt3 = parcel.readInt();
                HashMap hashMap2 = new HashMap(readInt3);
                for (int i3 = 0; i3 != readInt3; i3++) {
                    hashMap2.put(parcel.readString(), parcel.readString());
                }
                hashMap.put(readString5, hashMap2);
            }
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
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
            float readFloat = parcel.readFloat();
            long readLong4 = parcel.readLong();
            InviteInfo inviteInfo = (InviteInfo) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new QAStickerModel(createFromParcel, readLong, readLong2, readLong3, urlModel, readString, readString2, readString3, arrayList, valueOf2, shareInfo, readString4, hashMap, readString6, readString7, z, z2, z3, readFloat, readLong4, inviteInfo, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final QAStickerModel[] newArray(int i) {
            return new QAStickerModel[i];
        }
    };

    @InterfaceC65349Pkn("alpha")
    public final float alpha;

    @InterfaceC65349Pkn("user_avatar")
    public final UrlModel avatarUrl;
    public final BaseStickerModel baseStickerModel;

    @InterfaceC65349Pkn("category_meta")
    public final String category_meta;

    @InterfaceC65349Pkn("clickable")
    public final boolean clickable;

    @InterfaceC65349Pkn("collection_category")
    public final Integer collectionCategory;

    @InterfaceC65349Pkn("editable")
    public final boolean editable;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("extra_event_params")
    public final HashMap<String, HashMap<String, String>> extraEventParams;

    @InterfaceC65349Pkn("invite_info")
    public final InviteInfo inviteInfo;

    @InterfaceC65349Pkn("invite_share_info")
    public final ShareInfo inviteShareInfo;

    @InterfaceC65349Pkn("invited_users")
    public final List<Long> inviteUserList;

    @InterfaceC65349Pkn("item_id")
    public final long itemId;

    @InterfaceC65349Pkn("content")
    public final String questionContent;

    @InterfaceC65349Pkn("question_id")
    public final long questionId;

    @InterfaceC65349Pkn("sec_uid")
    public final String secId;

    @InterfaceC65349Pkn("source")
    public final EnumC81462Vy6 source;

    @InterfaceC65349Pkn("user_id")
    public final long userId;

    @InterfaceC65349Pkn("username")
    public final String userName;

    @InterfaceC65349Pkn("user_selected_categories")
    public final String userSelectedCategory;

    @InterfaceC65349Pkn("videos_count")
    public final long videosCount;

    @InterfaceC65349Pkn("visible")
    public final boolean visible;

    public QAStickerModel() {
        this(null, 0L, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 0.0f, 0L, null, null, 4194303, null);
    }

    public static /* synthetic */ QAStickerModel copy$default(QAStickerModel qAStickerModel, BaseStickerModel baseStickerModel, long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List list, EnumC81462Vy6 enumC81462Vy6, ShareInfo shareInfo, String str4, HashMap hashMap, String str5, String str6, boolean z, boolean z2, boolean z3, float f, long j4, InviteInfo inviteInfo, Integer num, int i, Object obj) {
        BaseStickerModel baseStickerModel2 = baseStickerModel;
        EnumC81462Vy6 enumC81462Vy62 = enumC81462Vy6;
        List list2 = list;
        String str7 = str3;
        long j5 = j2;
        ShareInfo shareInfo2 = shareInfo;
        long j6 = j;
        String str8 = str;
        long j7 = j3;
        UrlModel urlModel2 = urlModel;
        String str9 = str2;
        float f2 = f;
        Integer num2 = num;
        boolean z4 = z3;
        InviteInfo inviteInfo2 = inviteInfo;
        HashMap hashMap2 = hashMap;
        boolean z5 = z2;
        String str10 = str4;
        String str11 = str5;
        long j8 = j4;
        boolean z6 = z;
        String str12 = str6;
        if ((i & 1) != 0) {
            baseStickerModel2 = qAStickerModel.baseStickerModel;
        }
        if ((i & 2) != 0) {
            j6 = qAStickerModel.questionId;
        }
        if ((i & 4) != 0) {
            j5 = qAStickerModel.userId;
        }
        if ((i & 8) != 0) {
            j7 = qAStickerModel.itemId;
        }
        if ((i & 16) != 0) {
            urlModel2 = qAStickerModel.avatarUrl;
        }
        if ((i & 32) != 0) {
            str8 = qAStickerModel.userName;
        }
        if ((i & 64) != 0) {
            str9 = qAStickerModel.questionContent;
        }
        if ((i & 128) != 0) {
            str7 = qAStickerModel.secId;
        }
        if ((i & 256) != 0) {
            list2 = qAStickerModel.inviteUserList;
        }
        if ((i & 512) != 0) {
            enumC81462Vy62 = qAStickerModel.source;
        }
        if ((i & 1024) != 0) {
            shareInfo2 = qAStickerModel.inviteShareInfo;
        }
        if ((i & 2048) != 0) {
            str10 = qAStickerModel.extra;
        }
        if ((i & 4096) != 0) {
            hashMap2 = qAStickerModel.extraEventParams;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str11 = qAStickerModel.category_meta;
        }
        if ((i & 16384) != 0) {
            str12 = qAStickerModel.userSelectedCategory;
        }
        if ((32768 & i) != 0) {
            z6 = qAStickerModel.editable;
        }
        if ((65536 & i) != 0) {
            z5 = qAStickerModel.clickable;
        }
        if ((131072 & i) != 0) {
            z4 = qAStickerModel.visible;
        }
        if ((262144 & i) != 0) {
            f2 = qAStickerModel.alpha;
        }
        if ((524288 & i) != 0) {
            j8 = qAStickerModel.videosCount;
        }
        if ((1048576 & i) != 0) {
            inviteInfo2 = qAStickerModel.inviteInfo;
        }
        if ((i & 2097152) != 0) {
            num2 = qAStickerModel.collectionCategory;
        }
        return qAStickerModel.copy(baseStickerModel2, j6, j5, j7, urlModel2, str8, str9, str7, list2, enumC81462Vy62, shareInfo2, str10, hashMap2, str11, str12, z6, z5, z4, f2, j8, inviteInfo2, num2);
    }

    public final QAStickerModel copy(BaseStickerModel baseStickerModel, long j, long j2, long j3, UrlModel urlModel, String str, String questionContent, String str2, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str3, HashMap<String, HashMap<String, String>> extraEventParams, String str4, String str5, boolean z, boolean z2, boolean z3, float f, long j4, InviteInfo inviteInfo, Integer num) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(questionContent, "questionContent");
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
        return new QAStickerModel(baseStickerModel, j, j2, j3, urlModel, str, questionContent, str2, inviteUserList, source, shareInfo, str3, extraEventParams, str4, str5, z, z2, z3, f, j4, inviteInfo, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QAStickerModel)) {
            return false;
        }
        QAStickerModel qAStickerModel = (QAStickerModel) obj;
        return o.LJ(this.baseStickerModel, qAStickerModel.baseStickerModel) && this.questionId == qAStickerModel.questionId && this.userId == qAStickerModel.userId && this.itemId == qAStickerModel.itemId && o.LJ(this.avatarUrl, qAStickerModel.avatarUrl) && o.LJ(this.userName, qAStickerModel.userName) && o.LJ(this.questionContent, qAStickerModel.questionContent) && o.LJ(this.secId, qAStickerModel.secId) && o.LJ(this.inviteUserList, qAStickerModel.inviteUserList) && this.source == qAStickerModel.source && o.LJ(this.inviteShareInfo, qAStickerModel.inviteShareInfo) && o.LJ(this.extra, qAStickerModel.extra) && o.LJ(this.extraEventParams, qAStickerModel.extraEventParams) && o.LJ(this.category_meta, qAStickerModel.category_meta) && o.LJ(this.userSelectedCategory, qAStickerModel.userSelectedCategory) && this.editable == qAStickerModel.editable && this.clickable == qAStickerModel.clickable && this.visible == qAStickerModel.visible && Float.compare(this.alpha, qAStickerModel.alpha) == 0 && this.videosCount == qAStickerModel.videosCount && o.LJ(this.inviteInfo, qAStickerModel.inviteInfo) && o.LJ(this.collectionCategory, qAStickerModel.collectionCategory);
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public int getId() {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public boolean isNotEmptyModel() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public InteractStickerStruct getInteractStickerStruct() {
        return new InteractStickerStruct();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int LIZJ = JBR.LIZJ(this.itemId, JBR.LIZJ(this.userId, JBR.LIZJ(this.questionId, this.baseStickerModel.hashCode() * 31, 31), 31), 31);
        UrlModel urlModel = this.avatarUrl;
        int i = 0;
        if (urlModel == null) {
            hashCode = 0;
        } else {
            hashCode = urlModel.hashCode();
        }
        int i2 = (LIZJ + hashCode) * 31;
        String str = this.userName;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int LJ = C79062V1e.LJ(this.questionContent, (i2 + hashCode2) * 31, 31);
        String str2 = this.secId;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode9 = (this.source.hashCode() + AnonymousClass391.LIZIZ(this.inviteUserList, (LJ + hashCode3) * 31, 31)) * 31;
        ShareInfo shareInfo = this.inviteShareInfo;
        if (shareInfo == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = shareInfo.hashCode();
        }
        int i3 = (hashCode9 + hashCode4) * 31;
        String str3 = this.extra;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int hashCode10 = (this.extraEventParams.hashCode() + ((i3 + hashCode5) * 31)) * 31;
        String str4 = this.category_meta;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i4 = (hashCode10 + hashCode6) * 31;
        String str5 = this.userSelectedCategory;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i5 = (i4 + hashCode7) * 31;
        boolean z = this.editable;
        int i6 = 1;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int i8 = (i5 + i7) * 31;
        boolean z2 = this.clickable;
        int i9 = z2;
        if (z2 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        if (!this.visible) {
            i6 = 0;
        }
        int LIZJ2 = JBR.LIZJ(this.videosCount, C47959Irz.LIZIZ(this.alpha, (i10 + i6) * 31, 31), 31);
        InviteInfo inviteInfo = this.inviteInfo;
        if (inviteInfo == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = inviteInfo.hashCode();
        }
        int i11 = (LIZJ2 + hashCode8) * 31;
        Integer num = this.collectionCategory;
        if (num != null) {
            i = num.hashCode();
        }
        return i11 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("QAStickerModel(baseStickerModel=");
        sb.append(this.baseStickerModel);
        sb.append(", questionId=");
        sb.append(this.questionId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", itemId=");
        sb.append(this.itemId);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", questionContent=");
        sb.append(this.questionContent);
        sb.append(", secId=");
        sb.append(this.secId);
        sb.append(", inviteUserList=");
        sb.append(this.inviteUserList);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", inviteShareInfo=");
        sb.append(this.inviteShareInfo);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.append(", extraEventParams=");
        sb.append(this.extraEventParams);
        sb.append(", category_meta=");
        sb.append(this.category_meta);
        sb.append(", userSelectedCategory=");
        sb.append(this.userSelectedCategory);
        sb.append(", editable=");
        sb.append(this.editable);
        sb.append(", clickable=");
        sb.append(this.clickable);
        sb.append(", visible=");
        sb.append(this.visible);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", videosCount=");
        sb.append(this.videosCount);
        sb.append(", inviteInfo=");
        sb.append(this.inviteInfo);
        sb.append(", collectionCategory=");
        return UC7.LIZ(sb, this.collectionCategory, ')');
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public BaseStickerModel getBaseSticker() {
        return this.baseStickerModel;
    }

    public final BaseStickerModel getBaseStickerModel() {
        return this.baseStickerModel;
    }

    public final String getCategory_meta() {
        return this.category_meta;
    }

    public final boolean getClickable() {
        return this.clickable;
    }

    public final Integer getCollectionCategory() {
        return this.collectionCategory;
    }

    public final boolean getEditable() {
        return this.editable;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final HashMap<String, HashMap<String, String>> getExtraEventParams() {
        return this.extraEventParams;
    }

    public final InviteInfo getInviteInfo() {
        return this.inviteInfo;
    }

    public final ShareInfo getInviteShareInfo() {
        return this.inviteShareInfo;
    }

    public final List<Long> getInviteUserList() {
        return this.inviteUserList;
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final String getQuestionContent() {
        return this.questionContent;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getSecId() {
        return this.secId;
    }

    public final EnumC81462Vy6 getSource() {
        return this.source;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public EnumC157656Gr getStickerType() {
        return EnumC157656Gr.QUESTION_AND_ANSWER;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserSelectedCategory() {
        return this.userSelectedCategory;
    }

    public final long getVideosCount() {
        return this.videosCount;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.core.StickerModel
    public StickerModel updateMediaSize(OSZ<Integer, Integer> newMediaSize) {
        o.LJIIIZ(newMediaSize, "newMediaSize");
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        this.baseStickerModel.writeToParcel(out, i);
        out.writeLong(this.questionId);
        out.writeLong(this.userId);
        out.writeLong(this.itemId);
        out.writeSerializable(this.avatarUrl);
        out.writeString(this.userName);
        out.writeString(this.questionContent);
        out.writeString(this.secId);
        Iterator LIZJ = UC7.LIZJ(this.inviteUserList, out);
        while (LIZJ.hasNext()) {
            out.writeLong(((Number) LIZJ.next()).longValue());
        }
        out.writeString(this.source.name());
        out.writeSerializable(this.inviteShareInfo);
        out.writeString(this.extra);
        HashMap<String, HashMap<String, String>> hashMap = this.extraEventParams;
        out.writeInt(hashMap.size());
        for (Map.Entry<String, HashMap<String, String>> entry : hashMap.entrySet()) {
            out.writeString(entry.getKey());
            HashMap<String, String> value = entry.getValue();
            out.writeInt(value.size());
            for (Map.Entry<String, String> entry2 : value.entrySet()) {
                out.writeString(entry2.getKey());
                out.writeString(entry2.getValue());
            }
        }
        out.writeString(this.category_meta);
        out.writeString(this.userSelectedCategory);
        out.writeInt(this.editable ? 1 : 0);
        out.writeInt(this.clickable ? 1 : 0);
        out.writeInt(this.visible ? 1 : 0);
        out.writeFloat(this.alpha);
        out.writeLong(this.videosCount);
        out.writeSerializable(this.inviteInfo);
        Integer num = this.collectionCategory;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public QAStickerModel(BaseStickerModel baseStickerModel, long j, long j2, long j3, UrlModel urlModel, String str, String questionContent, String str2, List<Long> inviteUserList, EnumC81462Vy6 source, ShareInfo shareInfo, String str3, HashMap<String, HashMap<String, String>> extraEventParams, String str4, String str5, boolean z, boolean z2, boolean z3, float f, long j4, InviteInfo inviteInfo, Integer num) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        o.LJIIIZ(questionContent, "questionContent");
        o.LJIIIZ(inviteUserList, "inviteUserList");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(extraEventParams, "extraEventParams");
        this.baseStickerModel = baseStickerModel;
        this.questionId = j;
        this.userId = j2;
        this.itemId = j3;
        this.avatarUrl = urlModel;
        this.userName = str;
        this.questionContent = questionContent;
        this.secId = str2;
        this.inviteUserList = inviteUserList;
        this.source = source;
        this.inviteShareInfo = shareInfo;
        this.extra = str3;
        this.extraEventParams = extraEventParams;
        this.category_meta = str4;
        this.userSelectedCategory = str5;
        this.editable = z;
        this.clickable = z2;
        this.visible = z3;
        this.alpha = f;
        this.videosCount = j4;
        this.inviteInfo = inviteInfo;
        this.collectionCategory = num;
    }

    public QAStickerModel(BaseStickerModel baseStickerModel, long j, long j2, long j3, UrlModel urlModel, String str, String str2, String str3, List list, EnumC81462Vy6 enumC81462Vy6, ShareInfo shareInfo, String str4, HashMap hashMap, String str5, String str6, boolean z, boolean z2, boolean z3, float f, long j4, InviteInfo inviteInfo, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new BaseStickerModel(0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, -1, null) : baseStickerModel, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) != 0 ? null : urlModel, (i & 32) != 0 ? null : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? C61878OQg.INSTANCE : list, (i & 512) != 0 ? EnumC81462Vy6.Default : enumC81462Vy6, (i & 1024) != 0 ? null : shareInfo, (i & 2048) != 0 ? null : str4, (i & 4096) != 0 ? new HashMap() : hashMap, (i & FileUtils.BUFFER_SIZE) != 0 ? "" : str5, (i & 16384) == 0 ? str6 : "", (32768 & i) != 0 ? false : z, (65536 & i) == 0 ? z2 : false, (131072 & i) != 0 ? true : z3, (262144 & i) != 0 ? 0.75f : f, (524288 & i) != 0 ? 0L : j4, (1048576 & i) != 0 ? null : inviteInfo, (i & 2097152) != 0 ? null : num);
    }
}
