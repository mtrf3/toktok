package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkLayerRTCMessageUser extends F9E {

    @InterfaceC65349Pkn("audio_mute")
    public final int audioMute;

    @InterfaceC65349Pkn("interact_id")
    public final String linkMicId;

    @InterfaceC65349Pkn("position")
    public final int position;

    @InterfaceC65349Pkn("video_mute")
    public final int videoMute;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LinkLayerRTCMessageUser() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r2
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessageUser.<init>():void");
    }

    public static /* synthetic */ LinkLayerRTCMessageUser copy$default(LinkLayerRTCMessageUser linkLayerRTCMessageUser, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = linkLayerRTCMessageUser.linkMicId;
        }
        if ((i4 & 2) != 0) {
            i = linkLayerRTCMessageUser.position;
        }
        if ((i4 & 4) != 0) {
            i2 = linkLayerRTCMessageUser.audioMute;
        }
        if ((i4 & 8) != 0) {
            i3 = linkLayerRTCMessageUser.videoMute;
        }
        return linkLayerRTCMessageUser.copy(str, i, i2, i3);
    }

    public final LinkLayerRTCMessageUser copy(String linkMicId, int i, int i2, int i3) {
        o.LJIIIZ(linkMicId, "linkMicId");
        return new LinkLayerRTCMessageUser(linkMicId, i, i2, i3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.linkMicId, Integer.valueOf(this.position), Integer.valueOf(this.audioMute), Integer.valueOf(this.videoMute)};
    }

    public final int getAudioMute() {
        return this.audioMute;
    }

    public final String getLinkMicId() {
        return this.linkMicId;
    }

    public final int getPosition() {
        return this.position;
    }

    public final int getVideoMute() {
        return this.videoMute;
    }

    public LinkLayerRTCMessageUser(String linkMicId, int i, int i2, int i3) {
        o.LJIIIZ(linkMicId, "linkMicId");
        this.linkMicId = linkMicId;
        this.position = i;
        this.audioMute = i2;
        this.videoMute = i3;
    }

    public /* synthetic */ LinkLayerRTCMessageUser(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
