package com.ss.android.ugc.aweme.im.message.template.component;

import X.C79095V2l;
import X.F9E;
import X.K1I;
import X.V3M;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UserInfoComponent extends F9E implements BaseComponent {
    public final ImageComponent avatarThumb;
    public final String nickName;
    public final long userId;
    public static final K1I Companion = new K1I();
    public static final Parcelable.Creator<UserInfoComponent> CREATOR = new V3M();
    public static final UserInfoComponent EMPTY_USER_INFO = new UserInfoComponent(0);

    public UserInfoComponent() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.userId), this.nickName, this.avatarThumb};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeLong(this.userId);
        out.writeString(this.nickName);
        this.avatarThumb.writeToParcel(out, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserInfoComponent(int i) {
        this(-1L, "", C79095V2l.LIZ());
        ImageComponent.Companion.getClass();
    }

    public UserInfoComponent(long j, String nickName, ImageComponent avatarThumb) {
        o.LJIIIZ(nickName, "nickName");
        o.LJIIIZ(avatarThumb, "avatarThumb");
        this.userId = j;
        this.nickName = nickName;
        this.avatarThumb = avatarThumb;
    }
}
