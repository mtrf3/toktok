package com.bytedance.android.live.liveinteract.platform.statemanager.iablility;

import X.C33Q;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletRechargeExchangeStrengthen;
import com.bytedance.android.livesdk.model.message.linkcore.MicPositionData;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UserState implements C33Q {
    public static final /* synthetic */ int LJLJI = 0;
    public final MicPositionData LJLIL;
    public final int LJLILLLLZI;

    @InterfaceC65349Pkn("audio_mute")
    public final int audioMuted;

    @InterfaceC65349Pkn("link_mic_id")
    public final String linkMicId;

    @InterfaceC65349Pkn("link_time")
    public final long linkedTimeNano;

    @InterfaceC65349Pkn("network")
    public final int networkState;

    @InterfaceC65349Pkn(LiveWalletRechargeExchangeStrengthen.DEFAULT)
    public final int onlineUserState;

    @InterfaceC65349Pkn("rtc_conn")
    public final int rtcConnection;

    @InterfaceC65349Pkn("user")
    public final Player user;

    @InterfaceC65349Pkn("video_mute")
    public final int videoMuted;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UserState() {
        /*
            r14 = this;
            r1 = 0
            r4 = 0
            r6 = 0
            r12 = 1023(0x3ff, float:1.434E-42)
            r0 = r14
            r2 = r1
            r3 = r1
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r13 = r1
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) obj;
        return o.LJ(this.user, userState.user) && o.LJ(this.linkMicId, userState.linkMicId) && o.LJ(this.LJLIL, userState.LJLIL) && this.linkedTimeNano == userState.linkedTimeNano && this.onlineUserState == userState.onlineUserState && this.audioMuted == userState.audioMuted && this.videoMuted == userState.videoMuted && this.rtcConnection == userState.rtcConnection && this.networkState == userState.networkState && this.LJLILLLLZI == userState.LJLILLLLZI;
    }

    public final int hashCode() {
        int hashCode;
        Player player = this.user;
        int i = 0;
        if (player == null) {
            hashCode = 0;
        } else {
            hashCode = player.hashCode();
        }
        int LJ = C79062V1e.LJ(this.linkMicId, hashCode * 31, 31);
        MicPositionData micPositionData = this.LJLIL;
        if (micPositionData != null) {
            i = micPositionData.hashCode();
        }
        return ((((((((((JBR.LIZJ(this.linkedTimeNano, (LJ + i) * 31, 31) + this.onlineUserState) * 31) + this.audioMuted) * 31) + this.videoMuted) * 31) + this.rtcConnection) * 31) + this.networkState) * 31) + this.LJLILLLLZI;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserState(user=");
        LIZ.append(this.user);
        LIZ.append(", linkMicId=");
        LIZ.append(this.linkMicId);
        LIZ.append(", pos=");
        LIZ.append(this.LJLIL);
        LIZ.append(", linkedTimeNano=");
        LIZ.append(this.linkedTimeNano);
        LIZ.append(", onlineUserState=");
        LIZ.append(this.onlineUserState);
        LIZ.append(", audioMuted=");
        LIZ.append(this.audioMuted);
        LIZ.append(", videoMuted=");
        LIZ.append(this.videoMuted);
        LIZ.append(", rtcConnection=");
        LIZ.append(this.rtcConnection);
        LIZ.append(", networkState=");
        LIZ.append(this.networkState);
        LIZ.append(", audioSource=");
        return b0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public static UserState LIZ(UserState userState, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Player player;
        String linkMicId;
        long j;
        int i8 = i2;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        MicPositionData micPositionData = null;
        if ((i7 & 1) != 0) {
            player = userState.user;
        } else {
            player = null;
        }
        if ((i7 & 2) != 0) {
            linkMicId = userState.linkMicId;
        } else {
            linkMicId = null;
        }
        if ((i7 & 4) != 0) {
            micPositionData = userState.LJLIL;
        }
        if ((i7 & 8) != 0) {
            j = userState.linkedTimeNano;
        } else {
            j = 0;
        }
        if ((i7 & 16) != 0) {
            i9 = userState.onlineUserState;
        }
        if ((i7 & 32) != 0) {
            i8 = userState.audioMuted;
        }
        if ((i7 & 64) != 0) {
            i10 = userState.videoMuted;
        }
        if ((i7 & 128) != 0) {
            i11 = userState.rtcConnection;
        }
        if ((i7 & 256) != 0) {
            i12 = userState.networkState;
        }
        if ((i7 & 512) != 0) {
            i13 = userState.LJLILLLLZI;
        }
        userState.getClass();
        o.LJIIIZ(linkMicId, "linkMicId");
        return new UserState(player, linkMicId, micPositionData, j, i9, i8, i10, i11, i12, i13);
    }

    public UserState(Player player, String linkMicId, MicPositionData micPositionData, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.user = player;
        this.linkMicId = linkMicId;
        this.LJLIL = micPositionData;
        this.linkedTimeNano = j;
        this.onlineUserState = i;
        this.audioMuted = i2;
        this.videoMuted = i3;
        this.rtcConnection = i4;
        this.networkState = i5;
        this.LJLILLLLZI = i6;
    }

    public /* synthetic */ UserState(Player player, String str, MicPositionData micPositionData, long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : player, (i7 & 2) != 0 ? "" : str, (i7 & 4) == 0 ? micPositionData : null, (i7 & 8) != 0 ? 0L : j, (i7 & 16) != 0 ? 0 : i, (i7 & 32) != 0 ? 0 : i2, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) == 0 ? i6 : 0);
    }
}
