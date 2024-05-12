package com.ss.android.ugc.aweme.publish.privacy;

import X.G9K;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PermissionConfigure implements Parcelable, Serializable {
    public static final Parcelable.Creator<PermissionConfigure> CREATOR = new G9K();
    public final int currentPermission;
    public final String enterMethod;
    public PostBtnConfigure postBtnConfigure;
    public final boolean preventSelfSee;
    public final int type;
    public final VideoPublishEditModel videoPublishEditModel;

    /* JADX WARN: Multi-variable type inference failed */
    public PermissionConfigure() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PermissionConfigure copy$default(PermissionConfigure permissionConfigure, int i, int i2, boolean z, VideoPublishEditModel videoPublishEditModel, PostBtnConfigure postBtnConfigure, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = permissionConfigure.type;
        }
        if ((i3 & 2) != 0) {
            i2 = permissionConfigure.currentPermission;
        }
        if ((i3 & 4) != 0) {
            z = permissionConfigure.preventSelfSee;
        }
        if ((i3 & 8) != 0) {
            videoPublishEditModel = permissionConfigure.videoPublishEditModel;
        }
        if ((i3 & 16) != 0) {
            postBtnConfigure = permissionConfigure.postBtnConfigure;
        }
        if ((i3 & 32) != 0) {
            str = permissionConfigure.enterMethod;
        }
        return permissionConfigure.copy(i, i2, z, videoPublishEditModel, postBtnConfigure, str);
    }

    public final PermissionConfigure copy(int i, int i2, boolean z, VideoPublishEditModel videoPublishEditModel, PostBtnConfigure postBtnConfigure, String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        return new PermissionConfigure(i, i2, z, videoPublishEditModel, postBtnConfigure, enterMethod);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionConfigure)) {
            return false;
        }
        PermissionConfigure permissionConfigure = (PermissionConfigure) obj;
        return this.type == permissionConfigure.type && this.currentPermission == permissionConfigure.currentPermission && this.preventSelfSee == permissionConfigure.preventSelfSee && o.LJ(this.videoPublishEditModel, permissionConfigure.videoPublishEditModel) && o.LJ(this.postBtnConfigure, permissionConfigure.postBtnConfigure) && o.LJ(this.enterMethod, permissionConfigure.enterMethod);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((this.type * 31) + this.currentPermission) * 31;
        boolean z = this.preventSelfSee;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        VideoPublishEditModel videoPublishEditModel = this.videoPublishEditModel;
        int hashCode = (i3 + (videoPublishEditModel == null ? 0 : videoPublishEditModel.hashCode())) * 31;
        PostBtnConfigure postBtnConfigure = this.postBtnConfigure;
        return this.enterMethod.hashCode() + ((hashCode + (postBtnConfigure != null ? postBtnConfigure.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.type);
        out.writeInt(this.currentPermission);
        out.writeInt(this.preventSelfSee ? 1 : 0);
        out.writeParcelable(this.videoPublishEditModel, i);
        PostBtnConfigure postBtnConfigure = this.postBtnConfigure;
        if (postBtnConfigure == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            postBtnConfigure.writeToParcel(out, i);
        }
        out.writeString(this.enterMethod);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PermissionConfigure(type=");
        LIZ.append(this.type);
        LIZ.append(", currentPermission=");
        LIZ.append(this.currentPermission);
        LIZ.append(", preventSelfSee=");
        LIZ.append(this.preventSelfSee);
        LIZ.append(", videoPublishEditModel=");
        LIZ.append(this.videoPublishEditModel);
        LIZ.append(", postBtnConfigure=");
        LIZ.append(this.postBtnConfigure);
        LIZ.append(", enterMethod=");
        return q.LIZIZ(LIZ, this.enterMethod, ')', LIZ);
    }

    public final int getCurrentPermission() {
        return this.currentPermission;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final PostBtnConfigure getPostBtnConfigure() {
        return this.postBtnConfigure;
    }

    public final boolean getPreventSelfSee() {
        return this.preventSelfSee;
    }

    public final int getType() {
        return this.type;
    }

    public final VideoPublishEditModel getVideoPublishEditModel() {
        return this.videoPublishEditModel;
    }

    public final void setPostBtnConfigure(PostBtnConfigure postBtnConfigure) {
        this.postBtnConfigure = postBtnConfigure;
    }

    public PermissionConfigure(int i, int i2, boolean z, VideoPublishEditModel videoPublishEditModel, PostBtnConfigure postBtnConfigure, String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        this.type = i;
        this.currentPermission = i2;
        this.preventSelfSee = z;
        this.videoPublishEditModel = videoPublishEditModel;
        this.postBtnConfigure = postBtnConfigure;
        this.enterMethod = enterMethod;
    }

    public /* synthetic */ PermissionConfigure(int i, int i2, boolean z, VideoPublishEditModel videoPublishEditModel, PostBtnConfigure postBtnConfigure, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) == 0 ? z : false, (i3 & 8) != 0 ? null : videoPublishEditModel, (i3 & 16) == 0 ? postBtnConfigure : null, (i3 & 32) != 0 ? "" : str);
    }
}
