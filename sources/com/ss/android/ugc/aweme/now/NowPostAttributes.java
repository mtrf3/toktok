package com.ss.android.ugc.aweme.now;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class NowPostAttributes extends F9E implements Serializable {

    @InterfaceC65349Pkn("now_creation_type")
    public int creationType;

    @InterfaceC65349Pkn("expired_at")
    public long expiredAt;

    @InterfaceC65349Pkn("now_post_camera_type")
    public int nowPostCameraType;

    public NowPostAttributes() {
    }

    public static /* synthetic */ NowPostAttributes copy$default(NowPostAttributes nowPostAttributes, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = nowPostAttributes.expiredAt;
        }
        if ((i3 & 2) != 0) {
            i = nowPostAttributes.nowPostCameraType;
        }
        if ((i3 & 4) != 0) {
            i2 = nowPostAttributes.creationType;
        }
        return nowPostAttributes.copy(j, i, i2);
    }

    public final NowPostAttributes copy(long j, int i, int i2) {
        return new NowPostAttributes(j, i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.expiredAt), Integer.valueOf(this.nowPostCameraType), Integer.valueOf(this.creationType)};
    }

    public final int getCreationType() {
        return this.creationType;
    }

    public final long getExpiredAt() {
        return this.expiredAt;
    }

    public final int getNowPostCameraType() {
        return this.nowPostCameraType;
    }

    public NowPostAttributes(long j, int i, int i2) {
        this.expiredAt = j;
        this.nowPostCameraType = i;
        this.creationType = i2;
    }

    public /* synthetic */ NowPostAttributes(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 1 : i2);
    }
}
