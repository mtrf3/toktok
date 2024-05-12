package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.X1D;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelResponse;
import com.bytedance.android.livesdk.model.message.linkcore.CreateChannelResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import tikcast.linkmic.controller.ResumeResp;

/* loaded from: classes14.dex */
public final class CreateChannelResult {
    public final boolean isResume;
    public final BizCreateChannelResponse multiGuestRespExtra;
    public CreateChannelResponse originData;
    public ResumeResp resumeResp;

    public static /* synthetic */ CreateChannelResult copy$default(CreateChannelResult createChannelResult, BizCreateChannelResponse bizCreateChannelResponse, boolean z, ResumeResp resumeResp, CreateChannelResponse createChannelResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            bizCreateChannelResponse = createChannelResult.multiGuestRespExtra;
        }
        if ((i & 2) != 0) {
            z = createChannelResult.isResume;
        }
        if ((i & 4) != 0) {
            resumeResp = createChannelResult.resumeResp;
        }
        if ((i & 8) != 0) {
            createChannelResponse = createChannelResult.originData;
        }
        return createChannelResult.copy(bizCreateChannelResponse, z, resumeResp, createChannelResponse);
    }

    public final BizCreateChannelResponse component1() {
        return this.multiGuestRespExtra;
    }

    public final boolean component2() {
        return this.isResume;
    }

    public final ResumeResp component3() {
        return this.resumeResp;
    }

    public final CreateChannelResponse component4() {
        return this.originData;
    }

    public final CreateChannelResult copy(BizCreateChannelResponse bizCreateChannelResponse, boolean z, ResumeResp resumeResp, CreateChannelResponse createChannelResponse) {
        return new CreateChannelResult(bizCreateChannelResponse, z, resumeResp, createChannelResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChannelResult)) {
            return false;
        }
        CreateChannelResult createChannelResult = (CreateChannelResult) obj;
        return o.LJ(this.multiGuestRespExtra, createChannelResult.multiGuestRespExtra) && this.isResume == createChannelResult.isResume && o.LJ(this.resumeResp, createChannelResult.resumeResp) && o.LJ(this.originData, createChannelResult.originData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        BizCreateChannelResponse bizCreateChannelResponse = this.multiGuestRespExtra;
        int hashCode = (bizCreateChannelResponse == null ? 0 : bizCreateChannelResponse.hashCode()) * 31;
        boolean z = this.isResume;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ResumeResp resumeResp = this.resumeResp;
        int hashCode2 = (i2 + (resumeResp == null ? 0 : resumeResp.hashCode())) * 31;
        CreateChannelResponse createChannelResponse = this.originData;
        return hashCode2 + (createChannelResponse != null ? createChannelResponse.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateChannelResult(multiGuestRespExtra=");
        LIZ.append(this.multiGuestRespExtra);
        LIZ.append(", isResume=");
        LIZ.append(this.isResume);
        LIZ.append(", resumeResp=");
        LIZ.append(this.resumeResp);
        LIZ.append(", originData=");
        LIZ.append(this.originData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CreateChannelResult(BizCreateChannelResponse bizCreateChannelResponse, boolean z, ResumeResp resumeResp, CreateChannelResponse createChannelResponse) {
        this.multiGuestRespExtra = bizCreateChannelResponse;
        this.isResume = z;
        this.resumeResp = resumeResp;
        this.originData = createChannelResponse;
    }

    public /* synthetic */ CreateChannelResult(BizCreateChannelResponse bizCreateChannelResponse, boolean z, ResumeResp resumeResp, CreateChannelResponse createChannelResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bizCreateChannelResponse, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : resumeResp, (i & 8) != 0 ? null : createChannelResponse);
    }
}
