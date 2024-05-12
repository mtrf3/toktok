package com.bytedance.android.livesdk.microom.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class AnchorCardInfo implements Serializable {

    @InterfaceC65349Pkn("bg_image")
    public ImageModel bgImage;

    @InterfaceC65349Pkn("current_user")
    public User currentUser;

    @InterfaceC65349Pkn("show_end_timestamp")
    public String showEndTimestamp;

    @InterfaceC65349Pkn("show_start_timestamp")
    public String showStartTimestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public AnchorCardInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AnchorCardInfo copy$default(AnchorCardInfo anchorCardInfo, String str, String str2, ImageModel imageModel, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anchorCardInfo.showStartTimestamp;
        }
        if ((i & 2) != 0) {
            str2 = anchorCardInfo.showEndTimestamp;
        }
        if ((i & 4) != 0) {
            imageModel = anchorCardInfo.bgImage;
        }
        if ((i & 8) != 0) {
            user = anchorCardInfo.currentUser;
        }
        return anchorCardInfo.copy(str, str2, imageModel, user);
    }

    public final AnchorCardInfo copy(String str, String str2, ImageModel imageModel, User user) {
        return new AnchorCardInfo(str, str2, imageModel, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorCardInfo)) {
            return false;
        }
        AnchorCardInfo anchorCardInfo = (AnchorCardInfo) obj;
        return o.LJ(this.showStartTimestamp, anchorCardInfo.showStartTimestamp) && o.LJ(this.showEndTimestamp, anchorCardInfo.showEndTimestamp) && o.LJ(this.bgImage, anchorCardInfo.bgImage) && o.LJ(this.currentUser, anchorCardInfo.currentUser);
    }

    public int hashCode() {
        String str = this.showStartTimestamp;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.showEndTimestamp;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageModel imageModel = this.bgImage;
        int hashCode3 = (hashCode2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        User user = this.currentUser;
        return hashCode3 + (user != null ? user.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorCardInfo(showStartTimestamp=");
        LIZ.append(this.showStartTimestamp);
        LIZ.append(", showEndTimestamp=");
        LIZ.append(this.showEndTimestamp);
        LIZ.append(", bgImage=");
        LIZ.append(this.bgImage);
        LIZ.append(", currentUser=");
        LIZ.append(this.currentUser);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ImageModel getBgImage() {
        return this.bgImage;
    }

    public final User getCurrentUser() {
        return this.currentUser;
    }

    public final String getShowEndTimestamp() {
        return this.showEndTimestamp;
    }

    public final String getShowStartTimestamp() {
        return this.showStartTimestamp;
    }

    public final void setBgImage(ImageModel imageModel) {
        this.bgImage = imageModel;
    }

    public final void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public final void setShowEndTimestamp(String str) {
        this.showEndTimestamp = str;
    }

    public final void setShowStartTimestamp(String str) {
        this.showStartTimestamp = str;
    }

    public AnchorCardInfo(String str, String str2, ImageModel imageModel, User user) {
        this.showStartTimestamp = str;
        this.showEndTimestamp = str2;
        this.bgImage = imageModel;
        this.currentUser = user;
    }

    public /* synthetic */ AnchorCardInfo(String str, String str2, ImageModel imageModel, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : imageModel, (i & 8) != 0 ? null : user);
    }
}
