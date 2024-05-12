package com.ss.android.ugc.aweme.services.external.ui;

import X.F9E;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LongPressOpenAlbumParams extends F9E {
    public final CreativeInfo creativeInfo;
    public final String enterFrom;
    public final long invokeTime;
    public final String shootWay;

    /* JADX WARN: Multi-variable type inference failed */
    public LongPressOpenAlbumParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0L, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LongPressOpenAlbumParams copy$default(LongPressOpenAlbumParams longPressOpenAlbumParams, CreativeInfo creativeInfo, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            creativeInfo = longPressOpenAlbumParams.creativeInfo;
        }
        if ((i & 2) != 0) {
            str = longPressOpenAlbumParams.enterFrom;
        }
        if ((i & 4) != 0) {
            str2 = longPressOpenAlbumParams.shootWay;
        }
        if ((i & 8) != 0) {
            j = longPressOpenAlbumParams.invokeTime;
        }
        return longPressOpenAlbumParams.copy(creativeInfo, str, str2, j);
    }

    public final LongPressOpenAlbumParams copy(CreativeInfo creativeInfo, String enterFrom, String shootWay, long j) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(shootWay, "shootWay");
        return new LongPressOpenAlbumParams(creativeInfo, enterFrom, shootWay, j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.creativeInfo, this.enterFrom, this.shootWay, Long.valueOf(this.invokeTime)};
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final long getInvokeTime() {
        return this.invokeTime;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public LongPressOpenAlbumParams(CreativeInfo creativeInfo, String enterFrom, String shootWay, long j) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(shootWay, "shootWay");
        this.creativeInfo = creativeInfo;
        this.enterFrom = enterFrom;
        this.shootWay = shootWay;
        this.invokeTime = j;
    }

    public /* synthetic */ LongPressOpenAlbumParams(CreativeInfo creativeInfo, String str, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "direct_shoot_long_press" : str2, (i & 8) != 0 ? 0L : j);
    }
}
