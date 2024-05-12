package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UserInfo extends F9E {

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel anchorAvatar;

    @InterfaceC65349Pkn("nick_name")
    public String nick_name;

    @InterfaceC65349Pkn("user_id")
    public long user_id;

    /* JADX WARN: Multi-variable type inference failed */
    public UserInfo() {
        this(0L, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.user_id), this.nick_name, this.anchorAvatar};
    }

    public UserInfo(long j, String nick_name, ImageModel imageModel) {
        o.LJIIIZ(nick_name, "nick_name");
        this.user_id = j;
        this.nick_name = nick_name;
        this.anchorAvatar = imageModel;
    }

    public /* synthetic */ UserInfo(long j, String str, ImageModel imageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : imageModel);
    }
}
