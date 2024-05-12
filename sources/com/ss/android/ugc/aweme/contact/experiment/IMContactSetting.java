package com.ss.android.ugc.aweme.contact.experiment;

import X.C16880lQ;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerShowIntervalTimeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMContactSetting {
    public static final ContactUserListConfig LIZ;

    /* loaded from: classes2.dex */
    public static final class ContactUserListConfig {

        @InterfaceC65349Pkn("contact_bytesync_finish_sync_history_interval")
        public final long bytesyncHistoryFinishInterval;

        @InterfaceC65349Pkn("cancel_request_when_open_share_panel")
        public final boolean cancelRequestWhenOpenSharePanel;

        @InterfaceC65349Pkn("contact_debug_tool")
        public final boolean debugTool;

        @InterfaceC65349Pkn("contact_user_list_completeness_interval")
        public final long userListCompletenessInterval;

        @InterfaceC65349Pkn("contact_user_list_request_count")
        public final int userListRequestCount;

        @InterfaceC65349Pkn("contact_user_list_request_retry_count")
        public final int userListRequestRetryCount;

        @InterfaceC65349Pkn("contact_user_list_update_interval")
        public final long userListUpdateInterval;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ContactUserListConfig() {
            /*
                r13 = this;
                r1 = 0
                r3 = 0
                r11 = 127(0x7f, float:1.78E-43)
                r12 = 0
                r0 = r13
                r4 = r3
                r5 = r1
                r7 = r1
                r9 = r3
                r10 = r3
                r0.<init>(r1, r3, r4, r5, r7, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.contact.experiment.IMContactSetting.ContactUserListConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactUserListConfig)) {
                return false;
            }
            ContactUserListConfig contactUserListConfig = (ContactUserListConfig) obj;
            return this.userListUpdateInterval == contactUserListConfig.userListUpdateInterval && this.userListRequestCount == contactUserListConfig.userListRequestCount && this.userListRequestRetryCount == contactUserListConfig.userListRequestRetryCount && this.bytesyncHistoryFinishInterval == contactUserListConfig.bytesyncHistoryFinishInterval && this.userListCompletenessInterval == contactUserListConfig.userListCompletenessInterval && this.debugTool == contactUserListConfig.debugTool && this.cancelRequestWhenOpenSharePanel == contactUserListConfig.cancelRequestWhenOpenSharePanel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int LIZJ = JBR.LIZJ(this.userListCompletenessInterval, JBR.LIZJ(this.bytesyncHistoryFinishInterval, ((((C16880lQ.LLJIJIL(this.userListUpdateInterval) * 31) + this.userListRequestCount) * 31) + this.userListRequestRetryCount) * 31, 31), 31);
            boolean z = this.debugTool;
            int i = 1;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (LIZJ + i2) * 31;
            if (!this.cancelRequestWhenOpenSharePanel) {
                i = 0;
            }
            return i3 + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ContactUserListConfig(userListUpdateInterval=");
            LIZ.append(this.userListUpdateInterval);
            LIZ.append(", userListRequestCount=");
            LIZ.append(this.userListRequestCount);
            LIZ.append(", userListRequestRetryCount=");
            LIZ.append(this.userListRequestRetryCount);
            LIZ.append(", bytesyncHistoryFinishInterval=");
            LIZ.append(this.bytesyncHistoryFinishInterval);
            LIZ.append(", userListCompletenessInterval=");
            LIZ.append(this.userListCompletenessInterval);
            LIZ.append(", debugTool=");
            LIZ.append(this.debugTool);
            LIZ.append(", cancelRequestWhenOpenSharePanel=");
            return C48339Iy7.LIZJ(LIZ, this.cancelRequestWhenOpenSharePanel, ')', LIZ);
        }

        public ContactUserListConfig(long j, int i, int i2, long j2, long j3, boolean z, boolean z2) {
            this.userListUpdateInterval = j;
            this.userListRequestCount = i;
            this.userListRequestRetryCount = i2;
            this.bytesyncHistoryFinishInterval = j2;
            this.userListCompletenessInterval = j3;
            this.debugTool = z;
            this.cancelRequestWhenOpenSharePanel = z2;
        }

        public /* synthetic */ ContactUserListConfig(long j, int i, int i2, long j2, long j3, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? LiveInsertStickerShowIntervalTimeSetting.DEFAULT : j, (i3 & 2) != 0 ? 100 : i, (i3 & 4) != 0 ? 3 : i2, (i3 & 8) != 0 ? 5L : j2, (i3 & 16) != 0 ? 36000L : j3, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? true : z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long j = 0;
        LIZ = new ContactUserListConfig(j, 0, 0 == true ? 1 : 0, j, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
    }

    public static ContactUserListConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ContactUserListConfig contactUserListConfig = LIZ;
        ContactUserListConfig contactUserListConfig2 = (ContactUserListConfig) LIZLLL.LJIIIIZZ("ttk_contact_configuration", ContactUserListConfig.class, contactUserListConfig);
        if (contactUserListConfig2 != null) {
            contactUserListConfig = contactUserListConfig2;
        }
        o.LJIIIIZZ(contactUserListConfig, "SettingsManager.getInsta….java)\n        ?: DEFAULT");
        return contactUserListConfig;
    }
}
