package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PermitApplyContent extends F9E {

    @InterfaceC65349Pkn("applier")
    public Player applier;

    @InterfaceC65349Pkn("applier_link_mic_id")
    public String applierLinkMicId;

    @InterfaceC65349Pkn("permiter")
    public Player approver;

    @InterfaceC65349Pkn("permiter_link_mic_id")
    public String approverLinkMicId;

    @InterfaceC65349Pkn("dsl")
    public DSLConfig dsl;

    @InterfaceC65349Pkn("operator")
    public Player operator;

    @InterfaceC65349Pkn("applier_pos")
    public MicPositionData positionData;

    @InterfaceC65349Pkn("reply_status")
    public int replyStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public PermitApplyContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.approver, this.positionData, this.approverLinkMicId, Integer.valueOf(this.replyStatus), this.dsl, this.applier, this.operator, this.applierLinkMicId};
    }

    public PermitApplyContent(Player player, MicPositionData micPositionData, String str, int i, DSLConfig dSLConfig, Player player2, Player player3, String applierLinkMicId) {
        o.LJIIIZ(applierLinkMicId, "applierLinkMicId");
        this.approver = player;
        this.positionData = micPositionData;
        this.approverLinkMicId = str;
        this.replyStatus = i;
        this.dsl = dSLConfig;
        this.applier = player2;
        this.operator = player3;
        this.applierLinkMicId = applierLinkMicId;
    }

    public /* synthetic */ PermitApplyContent(Player player, MicPositionData micPositionData, String str, int i, DSLConfig dSLConfig, Player player2, Player player3, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : player, (i2 & 2) != 0 ? null : micPositionData, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : dSLConfig, (i2 & 32) != 0 ? null : player2, (i2 & 64) == 0 ? player3 : null, (i2 & 128) != 0 ? "" : str2);
    }
}
