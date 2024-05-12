package com.bytedance.android.livesdk.microom.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class MicRoomDialogOfficialInfo implements Serializable {

    @InterfaceC65349Pkn("anchor_card_info")
    public AnchorCardInfo anchorCardInfo;

    @InterfaceC65349Pkn("event_info")
    public MicRoomEventInfo eventInfo;

    @InterfaceC65349Pkn("official_card_bg_image")
    public ImageModel officialCardImage;

    @InterfaceC65349Pkn("official_user")
    public User officialUser;

    /* JADX WARN: Multi-variable type inference failed */
    public MicRoomDialogOfficialInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MicRoomDialogOfficialInfo copy$default(MicRoomDialogOfficialInfo micRoomDialogOfficialInfo, User user, MicRoomEventInfo micRoomEventInfo, AnchorCardInfo anchorCardInfo, ImageModel imageModel, int i, Object obj) {
        if ((i & 1) != 0) {
            user = micRoomDialogOfficialInfo.officialUser;
        }
        if ((i & 2) != 0) {
            micRoomEventInfo = micRoomDialogOfficialInfo.eventInfo;
        }
        if ((i & 4) != 0) {
            anchorCardInfo = micRoomDialogOfficialInfo.anchorCardInfo;
        }
        if ((i & 8) != 0) {
            imageModel = micRoomDialogOfficialInfo.officialCardImage;
        }
        return micRoomDialogOfficialInfo.copy(user, micRoomEventInfo, anchorCardInfo, imageModel);
    }

    public final MicRoomDialogOfficialInfo copy(User user, MicRoomEventInfo micRoomEventInfo, AnchorCardInfo anchorCardInfo, ImageModel imageModel) {
        return new MicRoomDialogOfficialInfo(user, micRoomEventInfo, anchorCardInfo, imageModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicRoomDialogOfficialInfo)) {
            return false;
        }
        MicRoomDialogOfficialInfo micRoomDialogOfficialInfo = (MicRoomDialogOfficialInfo) obj;
        return o.LJ(this.officialUser, micRoomDialogOfficialInfo.officialUser) && o.LJ(this.eventInfo, micRoomDialogOfficialInfo.eventInfo) && o.LJ(this.anchorCardInfo, micRoomDialogOfficialInfo.anchorCardInfo) && o.LJ(this.officialCardImage, micRoomDialogOfficialInfo.officialCardImage);
    }

    public int hashCode() {
        User user = this.officialUser;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        MicRoomEventInfo micRoomEventInfo = this.eventInfo;
        int hashCode2 = (hashCode + (micRoomEventInfo == null ? 0 : micRoomEventInfo.hashCode())) * 31;
        AnchorCardInfo anchorCardInfo = this.anchorCardInfo;
        int hashCode3 = (hashCode2 + (anchorCardInfo == null ? 0 : anchorCardInfo.hashCode())) * 31;
        ImageModel imageModel = this.officialCardImage;
        return hashCode3 + (imageModel != null ? imageModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MicRoomDialogOfficialInfo(officialUser=");
        LIZ.append(this.officialUser);
        LIZ.append(", eventInfo=");
        LIZ.append(this.eventInfo);
        LIZ.append(", anchorCardInfo=");
        LIZ.append(this.anchorCardInfo);
        LIZ.append(", officialCardImage=");
        LIZ.append(this.officialCardImage);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final AnchorCardInfo getAnchorCardInfo() {
        return this.anchorCardInfo;
    }

    public final MicRoomEventInfo getEventInfo() {
        return this.eventInfo;
    }

    public final ImageModel getOfficialCardImage() {
        return this.officialCardImage;
    }

    public final User getOfficialUser() {
        return this.officialUser;
    }

    public final void setAnchorCardInfo(AnchorCardInfo anchorCardInfo) {
        this.anchorCardInfo = anchorCardInfo;
    }

    public final void setEventInfo(MicRoomEventInfo micRoomEventInfo) {
        this.eventInfo = micRoomEventInfo;
    }

    public final void setOfficialCardImage(ImageModel imageModel) {
        this.officialCardImage = imageModel;
    }

    public final void setOfficialUser(User user) {
        this.officialUser = user;
    }

    public MicRoomDialogOfficialInfo(User user, MicRoomEventInfo micRoomEventInfo, AnchorCardInfo anchorCardInfo, ImageModel imageModel) {
        this.officialUser = user;
        this.eventInfo = micRoomEventInfo;
        this.anchorCardInfo = anchorCardInfo;
        this.officialCardImage = imageModel;
    }

    public /* synthetic */ MicRoomDialogOfficialInfo(User user, MicRoomEventInfo micRoomEventInfo, AnchorCardInfo anchorCardInfo, ImageModel imageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : micRoomEventInfo, (i & 4) != 0 ? null : anchorCardInfo, (i & 8) != 0 ? null : imageModel);
    }
}
