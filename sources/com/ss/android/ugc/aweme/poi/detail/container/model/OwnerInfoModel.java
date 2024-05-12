package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class OwnerInfoModel implements Serializable {

    @InterfaceC65349Pkn("avatar_thumb")
    public final AvatarThumbModel avatarThumb;

    @InterfaceC65349Pkn("blue_icon")
    public final boolean blueIcon;

    @InterfaceC65349Pkn("nickname")
    public final String nickName;

    @InterfaceC65349Pkn("uid")
    public final String uid;

    @InterfaceC65349Pkn("uniqueId")
    public final String uniqueId;

    public static /* synthetic */ OwnerInfoModel copy$default(OwnerInfoModel ownerInfoModel, String str, String str2, boolean z, String str3, AvatarThumbModel avatarThumbModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ownerInfoModel.uid;
        }
        if ((i & 2) != 0) {
            str2 = ownerInfoModel.nickName;
        }
        if ((i & 4) != 0) {
            z = ownerInfoModel.blueIcon;
        }
        if ((i & 8) != 0) {
            str3 = ownerInfoModel.uniqueId;
        }
        if ((i & 16) != 0) {
            avatarThumbModel = ownerInfoModel.avatarThumb;
        }
        return ownerInfoModel.copy(str, str2, z, str3, avatarThumbModel);
    }

    public final OwnerInfoModel copy(String str, String str2, boolean z, String str3, AvatarThumbModel avatarThumbModel) {
        return new OwnerInfoModel(str, str2, z, str3, avatarThumbModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnerInfoModel)) {
            return false;
        }
        OwnerInfoModel ownerInfoModel = (OwnerInfoModel) obj;
        return o.LJ(this.uid, ownerInfoModel.uid) && o.LJ(this.nickName, ownerInfoModel.nickName) && this.blueIcon == ownerInfoModel.blueIcon && o.LJ(this.uniqueId, ownerInfoModel.uniqueId) && o.LJ(this.avatarThumb, ownerInfoModel.avatarThumb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.uid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.blueIcon;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        String str3 = this.uniqueId;
        int hashCode3 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AvatarThumbModel avatarThumbModel = this.avatarThumb;
        return hashCode3 + (avatarThumbModel != null ? avatarThumbModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OwnerInfoModel(uid=");
        LIZ.append(this.uid);
        LIZ.append(", nickName=");
        LIZ.append(this.nickName);
        LIZ.append(", blueIcon=");
        LIZ.append(this.blueIcon);
        LIZ.append(", uniqueId=");
        LIZ.append(this.uniqueId);
        LIZ.append(", avatarThumb=");
        LIZ.append(this.avatarThumb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AvatarThumbModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final boolean getBlueIcon() {
        return this.blueIcon;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public OwnerInfoModel(String str, String str2, boolean z, String str3, AvatarThumbModel avatarThumbModel) {
        this.uid = str;
        this.nickName = str2;
        this.blueIcon = z;
        this.uniqueId = str3;
        this.avatarThumb = avatarThumbModel;
    }

    public /* synthetic */ OwnerInfoModel(String str, String str2, boolean z, String str3, AvatarThumbModel avatarThumbModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, str3, avatarThumbModel);
    }
}
