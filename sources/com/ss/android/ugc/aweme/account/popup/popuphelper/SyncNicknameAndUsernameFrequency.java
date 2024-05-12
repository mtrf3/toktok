package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SyncNicknameAndUsernameFrequency extends F9E {

    @InterfaceC65349Pkn("isUpdated")
    public final boolean isUpdated;

    @InterfaceC65349Pkn("lastApiTime")
    public final long lastApiTime;

    @InterfaceC65349Pkn("showTime")
    public final List<Long> showTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.lastApiTime), this.showTime, Boolean.valueOf(this.isUpdated)};
    }

    public SyncNicknameAndUsernameFrequency(long j, List<Long> showTime, boolean z) {
        o.LJIIIZ(showTime, "showTime");
        this.lastApiTime = j;
        this.showTime = showTime;
        this.isUpdated = z;
    }

    public static SyncNicknameAndUsernameFrequency L(SyncNicknameAndUsernameFrequency syncNicknameAndUsernameFrequency, long j, List showTime, boolean z, int i) {
        if ((i & 1) != 0) {
            j = syncNicknameAndUsernameFrequency.lastApiTime;
        }
        if ((i & 2) != 0) {
            showTime = syncNicknameAndUsernameFrequency.showTime;
        }
        if ((i & 4) != 0) {
            z = syncNicknameAndUsernameFrequency.isUpdated;
        }
        o.LJIIIZ(showTime, "showTime");
        return new SyncNicknameAndUsernameFrequency(j, showTime, z);
    }
}
