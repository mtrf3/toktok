package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.C93570aT0;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TT2DSPPlatformInfo implements Serializable {
    public static final C93570aT0 Companion = new C93570aT0();

    @InterfaceC65349Pkn("developer_token")
    public final String developerToken;

    @InterfaceC65349Pkn("platform")
    public final int dspPlatform;

    @InterfaceC65349Pkn("platform_selected_by_user")
    public final boolean platformSelectedByUser;

    public static /* synthetic */ TT2DSPPlatformInfo copy$default(TT2DSPPlatformInfo tT2DSPPlatformInfo, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tT2DSPPlatformInfo.dspPlatform;
        }
        if ((i2 & 2) != 0) {
            z = tT2DSPPlatformInfo.platformSelectedByUser;
        }
        if ((i2 & 4) != 0) {
            str = tT2DSPPlatformInfo.developerToken;
        }
        return tT2DSPPlatformInfo.copy(i, z, str);
    }

    public final TT2DSPPlatformInfo copy(int i, boolean z, String str) {
        return new TT2DSPPlatformInfo(i, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TT2DSPPlatformInfo)) {
            return false;
        }
        TT2DSPPlatformInfo tT2DSPPlatformInfo = (TT2DSPPlatformInfo) obj;
        return this.dspPlatform == tT2DSPPlatformInfo.dspPlatform && this.platformSelectedByUser == tT2DSPPlatformInfo.platformSelectedByUser && o.LJ(this.developerToken, tT2DSPPlatformInfo.developerToken);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.dspPlatform * 31;
        boolean z = this.platformSelectedByUser;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        String str = this.developerToken;
        return i3 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TT2DSPPlatformInfo(dspPlatform=");
        LIZ.append(this.dspPlatform);
        LIZ.append(", platformSelectedByUser=");
        LIZ.append(this.platformSelectedByUser);
        LIZ.append(", developerToken=");
        LIZ.append(this.developerToken);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getDeveloperToken() {
        return this.developerToken;
    }

    public final int getDspPlatform() {
        return this.dspPlatform;
    }

    public final boolean getPlatformSelectedByUser() {
        return this.platformSelectedByUser;
    }

    public TT2DSPPlatformInfo(int i, boolean z, String str) {
        this.dspPlatform = i;
        this.platformSelectedByUser = z;
        this.developerToken = str;
    }

    public /* synthetic */ TT2DSPPlatformInfo(int i, boolean z, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? DspPlatform.UNKNOWN.getValue() : i, (i2 & 2) != 0 ? false : z, str);
    }
}
