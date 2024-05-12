package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BattleBaseUserInfo extends F9E {

    @InterfaceC65349Pkn("avatar_thumb")
    public ImageModel avatarThumb;

    @InterfaceC65349Pkn("display_id")
    public String displayId;

    @InterfaceC65349Pkn("nick_name")
    public String nickName;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    /* JADX WARN: Multi-variable type inference failed */
    public BattleBaseUserInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.userId, this.nickName, this.displayId, this.avatarThumb};
    }

    public BattleBaseUserInfo(Long l, String str, String str2, ImageModel imageModel) {
        this.userId = l;
        this.nickName = str;
        this.displayId = str2;
        this.avatarThumb = imageModel;
    }

    public /* synthetic */ BattleBaseUserInfo(Long l, String str, String str2, ImageModel imageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : imageModel);
    }
}
