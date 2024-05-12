package com.ss.android.ugc.aweme.share.improve.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShareH5Channel implements Serializable {

    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;

    @InterfaceC65349Pkn("mode")
    public Integer mode;

    @InterfaceC65349Pkn("platform_id")
    public String platformId;

    /* JADX WARN: Multi-variable type inference failed */
    public ShareH5Channel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShareH5Channel copy$default(ShareH5Channel shareH5Channel, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareH5Channel.awemeId;
        }
        if ((i & 2) != 0) {
            str2 = shareH5Channel.platformId;
        }
        if ((i & 4) != 0) {
            num = shareH5Channel.mode;
        }
        return shareH5Channel.copy(str, str2, num);
    }

    public final ShareH5Channel copy(String str, String str2, Integer num) {
        return new ShareH5Channel(str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareH5Channel)) {
            return false;
        }
        ShareH5Channel shareH5Channel = (ShareH5Channel) obj;
        return o.LJ(this.awemeId, shareH5Channel.awemeId) && o.LJ(this.platformId, shareH5Channel.platformId) && o.LJ(this.mode, shareH5Channel.mode);
    }

    public int hashCode() {
        String str = this.awemeId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platformId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.mode;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShareH5Channel(awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", platformId=");
        LIZ.append(this.platformId);
        LIZ.append(", mode=");
        return s0.LIZJ(LIZ, this.mode, ')', LIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getMode() {
        return this.mode;
    }

    public final String getPlatformId() {
        return this.platformId;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setMode(Integer num) {
        this.mode = num;
    }

    public final void setPlatformId(String str) {
        this.platformId = str;
    }

    public ShareH5Channel(String str, String str2, Integer num) {
        this.awemeId = str;
        this.platformId = str2;
        this.mode = num;
    }

    public /* synthetic */ ShareH5Channel(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }
}
