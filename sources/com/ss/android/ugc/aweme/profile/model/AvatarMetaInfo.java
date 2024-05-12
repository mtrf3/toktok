package com.ss.android.ugc.aweme.profile.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class AvatarMetaInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("avatar_source")
    public final int avatarSource;

    public static /* synthetic */ AvatarMetaInfo copy$default(AvatarMetaInfo avatarMetaInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = avatarMetaInfo.avatarSource;
        }
        return avatarMetaInfo.copy(i);
    }

    public final AvatarMetaInfo copy(int i) {
        return new AvatarMetaInfo(i);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.avatarSource)};
    }

    public final int getAvatarSource() {
        return this.avatarSource;
    }

    public AvatarMetaInfo(int i) {
        this.avatarSource = i;
    }
}
