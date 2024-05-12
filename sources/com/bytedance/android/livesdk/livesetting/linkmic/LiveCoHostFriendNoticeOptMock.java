package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("live_cohost_friend_notice_mock")
/* loaded from: classes6.dex */
public final class LiveCoHostFriendNoticeOptMock {

    @Group(isDefault = true, value = "default group")
    public static final MockParams DEFAULT;
    public static final LiveCoHostFriendNoticeOptMock INSTANCE = new LiveCoHostFriendNoticeOptMock();

    static {
        int i = 0;
        DEFAULT = new MockParams(i, i, i, 7, null);
    }

    private final MockParams getValue() {
        MockParams mockParams = (MockParams) SettingsManager.INSTANCE.getValueSafely(LiveCoHostFriendNoticeOptMock.class);
        if (mockParams == null) {
            return DEFAULT;
        }
        return mockParams;
    }

    public final boolean enable() {
        if (getValue().enable > 0) {
            return true;
        }
        return false;
    }

    public final int nextExecutionDelay() {
        return getValue().nextExecutionDelay;
    }

    public final int shouldRequestForTheNotice() {
        return getValue().shouldRequestForTheNotice;
    }

    /* loaded from: classes6.dex */
    public static final class MockParams {

        @InterfaceC65349Pkn("enable")
        public int enable;

        @InterfaceC65349Pkn("next_execution_delay")
        public int nextExecutionDelay;

        @InterfaceC65349Pkn("should_request_for_the_notice")
        public int shouldRequestForTheNotice;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MockParams() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostFriendNoticeOptMock.MockParams.<init>():void");
        }

        public MockParams(int i, int i2, int i3) {
            this.enable = i;
            this.nextExecutionDelay = i2;
            this.shouldRequestForTheNotice = i3;
        }

        public /* synthetic */ MockParams(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 60 : i2, (i4 & 4) != 0 ? 1 : i3);
        }
    }
}
