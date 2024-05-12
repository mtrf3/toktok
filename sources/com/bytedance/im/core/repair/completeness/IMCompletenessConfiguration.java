package com.bytedance.im.core.repair.completeness;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IMCompletenessConfiguration extends F9E {

    @InterfaceC65349Pkn("conversation_check_interval")
    public final int conversationCheckInterval;

    @InterfaceC65349Pkn("conversation_check_enabled")
    public final boolean isConversationCheckEnabled;

    @InterfaceC65349Pkn("message_check_enabled")
    public final boolean isMessageCheckEnabled;

    @InterfaceC65349Pkn("message_check_count")
    public final int messageCheckCount;

    @InterfaceC65349Pkn("message_check_interval")
    public final int messageCheckInterval;

    /* JADX WARN: Multi-variable type inference failed */
    public IMCompletenessConfiguration() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    public static /* synthetic */ IMCompletenessConfiguration copy$default(IMCompletenessConfiguration iMCompletenessConfiguration, boolean z, int i, int i2, boolean z2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = iMCompletenessConfiguration.isConversationCheckEnabled;
        }
        if ((i4 & 2) != 0) {
            i = iMCompletenessConfiguration.conversationCheckInterval;
        }
        if ((i4 & 4) != 0) {
            i2 = iMCompletenessConfiguration.messageCheckCount;
        }
        if ((i4 & 8) != 0) {
            z2 = iMCompletenessConfiguration.isMessageCheckEnabled;
        }
        if ((i4 & 16) != 0) {
            i3 = iMCompletenessConfiguration.messageCheckInterval;
        }
        return iMCompletenessConfiguration.copy(z, i, i2, z2, i3);
    }

    public final IMCompletenessConfiguration copy(boolean z, int i, int i2, boolean z2, int i3) {
        return new IMCompletenessConfiguration(z, i, i2, z2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isConversationCheckEnabled), Integer.valueOf(this.conversationCheckInterval), Integer.valueOf(this.messageCheckCount), Boolean.valueOf(this.isMessageCheckEnabled), Integer.valueOf(this.messageCheckInterval)};
    }

    public final int getConversationCheckInterval() {
        return this.conversationCheckInterval;
    }

    public final int getMessageCheckCount() {
        return this.messageCheckCount;
    }

    public final int getMessageCheckInterval() {
        return this.messageCheckInterval;
    }

    public final boolean isConversationCheckEnabled() {
        return this.isConversationCheckEnabled;
    }

    public final boolean isMessageCheckEnabled() {
        return this.isMessageCheckEnabled;
    }

    public IMCompletenessConfiguration(boolean z, int i, int i2, boolean z2, int i3) {
        this.isConversationCheckEnabled = z;
        this.conversationCheckInterval = i;
        this.messageCheckCount = i2;
        this.isMessageCheckEnabled = z2;
        this.messageCheckInterval = i3;
    }

    public /* synthetic */ IMCompletenessConfiguration(boolean z, int i, int i2, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 86400 : i, (i4 & 4) != 0 ? 20 : i2, (i4 & 8) == 0 ? z2 : false, (i4 & 16) != 0 ? 86400 : i3);
    }
}
