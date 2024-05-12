package com.bytedance.android.livesdk.sei;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatSeiRegion {

    @InterfaceC65349Pkn("audio_occupied")
    public final int isAudioOccupied;

    @InterfaceC65349Pkn("mute_a")
    public final int isMuteAudio;

    @InterfaceC65349Pkn("uid_str")
    public final String linkMicId;

    @InterfaceC65349Pkn("online_user_state")
    public final int onLineUserState;

    @InterfaceC65349Pkn("p")
    public final int position;

    @InterfaceC65349Pkn("talk_volume")
    public final int talkVolume;

    public final int hashCode() {
        int i;
        String str = this.linkMicId;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return (((((((((i * 31) + this.talkVolume) * 31) + this.isMuteAudio) * 31) + this.isAudioOccupied) * 31) + this.position) * 31) + this.onLineUserState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceChatSeiRegion)) {
            return false;
        }
        VoiceChatSeiRegion voiceChatSeiRegion = (VoiceChatSeiRegion) obj;
        if (o.LJ(voiceChatSeiRegion.linkMicId, this.linkMicId) && voiceChatSeiRegion.position == this.position) {
            return true;
        }
        return false;
    }

    public VoiceChatSeiRegion(String str, int i, int i2, int i3, int i4, int i5) {
        this.linkMicId = str;
        this.talkVolume = i;
        this.isMuteAudio = i2;
        this.isAudioOccupied = i3;
        this.position = i4;
        this.onLineUserState = i5;
    }

    public /* synthetic */ VoiceChatSeiRegion(String str, int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, i4, i5);
    }
}
