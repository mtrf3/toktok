package com.bytedance.android.livesdk.sei;

import X.AnonymousClass391;
import X.C15890jp;
import X.C32I;
import X.C75796Tou;
import X.InterfaceC65349Pkn;
import X.InterfaceC75804Tp2;
import X.JBR;
import X.X1D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatSeiAppData implements InterfaceC75804Tp2 {

    @InterfaceC65349Pkn("anchor_link_mic_id")
    public final String anchorLinkMicId;

    @InterfaceC65349Pkn("business_extra_info")
    public final Map<String, Map<String, String>> businessExtraInfo;

    @InterfaceC65349Pkn("channel_id")
    public final String channelId;

    @InterfaceC65349Pkn("DSLData")
    public final SeiDsl dsl;

    @InterfaceC65349Pkn("grids")
    public final List<VoiceChatSeiRegion> grids;

    @InterfaceC65349Pkn("timestamp")
    public final long timestamp;

    @InterfaceC65349Pkn("ver")
    public final int ver;

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceChatSeiAppData() {
        this(0, 0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC75804Tp2
    public final Map<String, Integer> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (VoiceChatSeiRegion voiceChatSeiRegion : this.grids) {
            String str = voiceChatSeiRegion.linkMicId;
            if (str != null) {
                linkedHashMap.put(str, Integer.valueOf(voiceChatSeiRegion.position));
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC75804Tp2
    public final List<String> LIZJ() {
        List<VoiceChatSeiRegion> list = this.grids;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<VoiceChatSeiRegion> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().linkMicId);
        }
        return arrayList;
    }

    @Override // X.InterfaceC75804Tp2
    public final Map<String, C75796Tou> LJFF() {
        HashMap hashMap = new HashMap();
        for (VoiceChatSeiRegion voiceChatSeiRegion : this.grids) {
            String str = voiceChatSeiRegion.linkMicId;
            if (str != null) {
                hashMap.put(str, new C75796Tou(voiceChatSeiRegion.isMuteAudio, voiceChatSeiRegion.isAudioOccupied, voiceChatSeiRegion.onLineUserState, voiceChatSeiRegion.talkVolume));
            }
        }
        return hashMap;
    }

    public final int hashCode() {
        int i;
        int i2;
        int LIZJ = JBR.LIZJ(this.timestamp, this.ver * 31, 31);
        String str = this.channelId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.grids, (LIZJ + i) * 31, 31);
        SeiDsl seiDsl = this.dsl;
        if (seiDsl != null) {
            i2 = seiDsl.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (LIZIZ + i2) * 31;
        String str2 = this.anchorLinkMicId;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceChatSeiAppData(ver=");
        LIZ.append(this.ver);
        LIZ.append(", timestamp=");
        LIZ.append(this.timestamp);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", grids=");
        LIZ.append(this.grids);
        LIZ.append(", dsl=");
        LIZ.append(this.dsl);
        LIZ.append(", anchorLinkMicId=");
        LIZ.append(this.anchorLinkMicId);
        LIZ.append(", businessExtraInfo=");
        return C15890jp.LIZ(LIZ, this.businessExtraInfo, ')', LIZ);
    }

    @Override // X.InterfaceC75804Tp2
    public final int LIZ() {
        return this.ver;
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
        if (!(obj instanceof VoiceChatSeiAppData)) {
            return false;
        }
        VoiceChatSeiAppData voiceChatSeiAppData = (VoiceChatSeiAppData) obj;
        if (voiceChatSeiAppData.ver == this.ver && o.LJ(voiceChatSeiAppData.channelId, this.channelId) && o.LJ(voiceChatSeiAppData.anchorLinkMicId, this.anchorLinkMicId) && Objects.equals(voiceChatSeiAppData.dsl, this.dsl) && Objects.equals(voiceChatSeiAppData.grids, this.grids)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceChatSeiAppData(int i, long j, String str, List<VoiceChatSeiRegion> grids, SeiDsl seiDsl, String str2, Map<String, ? extends Map<String, String>> map) {
        o.LJIIIZ(grids, "grids");
        this.ver = i;
        this.timestamp = j;
        this.channelId = str;
        this.grids = grids;
        this.dsl = seiDsl;
        this.anchorLinkMicId = str2;
        this.businessExtraInfo = map;
    }

    public /* synthetic */ VoiceChatSeiAppData(int i, long j, String str, List list, SeiDsl seiDsl, String str2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? -1L : j, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? new ArrayList() : list, (i2 & 16) != 0 ? null : seiDsl, (i2 & 32) != 0 ? null : str2, (i2 & 64) == 0 ? map : null);
    }
}
