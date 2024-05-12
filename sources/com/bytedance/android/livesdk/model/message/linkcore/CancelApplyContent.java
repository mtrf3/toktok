package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class CancelApplyContent extends F9E {

    @InterfaceC65349Pkn("applier")
    public Player applicant;

    @InterfaceC65349Pkn("applier_link_mic_id")
    public String applicantLinkMicId;

    /* JADX WARN: Multi-variable type inference failed */
    public CancelApplyContent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.applicant, this.applicantLinkMicId};
    }

    public CancelApplyContent(Player player, String str) {
        this.applicant = player;
        this.applicantLinkMicId = str;
    }

    public /* synthetic */ CancelApplyContent(Player player, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : player, (i & 2) != 0 ? null : str);
    }
}
