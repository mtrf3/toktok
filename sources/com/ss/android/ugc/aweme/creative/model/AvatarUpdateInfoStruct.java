package com.ss.android.ugc.aweme.creative.model;

import X.F9E;
import X.GL0;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AvatarUpdateInfoStruct extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<AvatarUpdateInfoStruct> CREATOR = new GL0();

    @InterfaceC65349Pkn("new_avatar_uri")
    public String newAvatarUri;

    @InterfaceC65349Pkn("origin_avatar_uri")
    public String originAvatarUri;

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarUpdateInfoStruct() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AvatarUpdateInfoStruct copy$default(AvatarUpdateInfoStruct avatarUpdateInfoStruct, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarUpdateInfoStruct.originAvatarUri;
        }
        if ((i & 2) != 0) {
            str2 = avatarUpdateInfoStruct.newAvatarUri;
        }
        return avatarUpdateInfoStruct.copy(str, str2);
    }

    public final AvatarUpdateInfoStruct copy(String originAvatarUri, String newAvatarUri) {
        o.LJIIIZ(originAvatarUri, "originAvatarUri");
        o.LJIIIZ(newAvatarUri, "newAvatarUri");
        return new AvatarUpdateInfoStruct(originAvatarUri, newAvatarUri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.originAvatarUri, this.newAvatarUri};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.originAvatarUri);
        out.writeString(this.newAvatarUri);
    }

    public final String getNewAvatarUri() {
        return this.newAvatarUri;
    }

    public final String getOriginAvatarUri() {
        return this.originAvatarUri;
    }

    public final void setNewAvatarUri(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.newAvatarUri = str;
    }

    public final void setOriginAvatarUri(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.originAvatarUri = str;
    }

    public AvatarUpdateInfoStruct(String originAvatarUri, String newAvatarUri) {
        o.LJIIIZ(originAvatarUri, "originAvatarUri");
        o.LJIIIZ(newAvatarUri, "newAvatarUri");
        this.originAvatarUri = originAvatarUri;
        this.newAvatarUri = newAvatarUri;
    }

    public /* synthetic */ AvatarUpdateInfoStruct(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
