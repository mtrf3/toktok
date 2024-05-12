package com.bytedance.android.livesdk.sei;

import X.C15890jp;
import X.C75796Tou;
import X.InterfaceC65349Pkn;
import X.InterfaceC75804Tp2;
import X.Q89;
import X.X1D;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes14.dex */
public class SeiAppData implements InterfaceC75804Tp2 {

    @InterfaceC65349Pkn("anchor_link_mic_id")
    public String anchorLinkMicId;

    @InterfaceC65349Pkn("business_extra_info")
    public Map<String, Map<String, String>> businessExtraInfo;

    @InterfaceC65349Pkn("canvas")
    public SeiCanvas canvas;

    @InterfaceC65349Pkn("channel_id")
    public String channelId;

    @InterfaceC65349Pkn("custom_sei_string")
    public String custom;

    @InterfaceC65349Pkn("DSLData")
    public SeiDsl dsl;

    @InterfaceC65349Pkn("grids")
    public List<SeiRegion> grids;

    @InterfaceC65349Pkn("link_condition")
    public int linkCondition;

    @InterfaceC65349Pkn("linker_arch_type")
    public int linkerArchType;

    @InterfaceC65349Pkn("local_change_linkmic_ids")
    public List<String> localChangeLinkMicIds;

    @InterfaceC65349Pkn("timestamp")
    public long timestamp;

    @InterfaceC65349Pkn("vendor")
    public String vendor;

    @InterfaceC65349Pkn("zoomed_linkmic_id")
    public String zoomedLinkmicId;

    @InterfaceC65349Pkn("ver")
    public int version = -1;

    @InterfaceC65349Pkn("battle_id")
    public long battleId = -1;

    @InterfaceC65349Pkn("container_offset_y")
    public float containerOffsetY = -1.0f;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.version), this.channelId, this.grids, this.canvas, this.dsl, this.custom, this.anchorLinkMicId, this.zoomedLinkmicId);
    }

    @Override // X.InterfaceC75804Tp2
    public final Map<String, Integer> LIZIZ() {
        return Collections.emptyMap();
    }

    @Override // X.InterfaceC75804Tp2
    public final List<String> LIZJ() {
        return Collections.emptyList();
    }

    @Override // X.InterfaceC75804Tp2
    public final Map<String, C75796Tou> LJFF() {
        return Collections.emptyMap();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeiAppData{vendor='");
        Q89.LIZIZ(LIZ, this.vendor, '\'', ", version=");
        LIZ.append(this.version);
        LIZ.append(", timestamp=");
        LIZ.append(this.timestamp);
        LIZ.append(", channelId='");
        Q89.LIZIZ(LIZ, this.channelId, '\'', ", grids=");
        LIZ.append(this.grids);
        LIZ.append(", canvas=");
        LIZ.append(this.canvas);
        LIZ.append(", linkCondition=");
        LIZ.append(this.linkCondition);
        LIZ.append(", battleId=");
        LIZ.append(this.battleId);
        LIZ.append(", dsl=");
        LIZ.append(this.dsl);
        LIZ.append(", custom='");
        Q89.LIZIZ(LIZ, this.custom, '\'', ", anchorLinkMicId='");
        Q89.LIZIZ(LIZ, this.anchorLinkMicId, '\'', ", zoomedLinkmicId='");
        Q89.LIZIZ(LIZ, this.zoomedLinkmicId, '\'', ", linkerArchType=");
        LIZ.append(this.linkerArchType);
        LIZ.append(", localChangeLinkMicIds=");
        LIZ.append(this.localChangeLinkMicIds);
        LIZ.append(", containerOffsetY=");
        LIZ.append(this.containerOffsetY);
        LIZ.append(", businessExtraInfo=");
        return C15890jp.LIZ(LIZ, this.businessExtraInfo, '}', LIZ);
    }

    @Override // X.InterfaceC75804Tp2
    public final int LIZ() {
        return this.version;
    }

    @Override // X.InterfaceC75804Tp2
    public final Map<String, Map<String, String>> LIZLLL() {
        return this.businessExtraInfo;
    }

    @Override // X.InterfaceC75804Tp2
    public final long LJ() {
        return this.timestamp;
    }

    @Override // X.InterfaceC75804Tp2
    public final SeiDsl LJI() {
        return this.dsl;
    }

    @Override // X.InterfaceC75804Tp2
    public final String LJII() {
        return this.anchorLinkMicId;
    }

    @Override // X.InterfaceC75804Tp2
    public final String LLLLLLIL() {
        return this.channelId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiAppData)) {
            return false;
        }
        SeiAppData seiAppData = (SeiAppData) obj;
        if (this.linkCondition == seiAppData.linkCondition && this.version == seiAppData.version && Objects.equals(this.channelId, seiAppData.channelId) && Objects.equals(this.grids, seiAppData.grids) && Objects.equals(this.canvas, seiAppData.canvas) && Objects.equals(this.dsl, seiAppData.dsl) && Objects.equals(this.custom, seiAppData.custom) && Objects.equals(this.anchorLinkMicId, seiAppData.anchorLinkMicId) && Objects.equals(this.zoomedLinkmicId, seiAppData.zoomedLinkmicId) && this.battleId == seiAppData.battleId && this.containerOffsetY == seiAppData.containerOffsetY && this.linkerArchType == seiAppData.linkerArchType) {
            return true;
        }
        return false;
    }
}
