package com.bytedance.android.livesdk.sei;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSeiTalkEqualSetting;
import java.util.Objects;

/* loaded from: classes14.dex */
public class SeiRegion {

    @InterfaceC65349Pkn("account")
    public long account;

    @InterfaceC65349Pkn("alpha")
    public int alpha;

    @InterfaceC65349Pkn("audio_occupied")
    public int audioOccupied;

    @InterfaceC65349Pkn("extra")
    public SeiExtraInfo extraInfo;

    @InterfaceC65349Pkn("h")
    public double height;

    @InterfaceC65349Pkn("link_mic_id")
    public String linkMicId;

    @InterfaceC65349Pkn("mute_audio")
    public int muteAudio;

    @InterfaceC65349Pkn("mute_a")
    public boolean muteAudioBool;

    @InterfaceC65349Pkn("mute_v")
    public boolean muteVideoBool;

    @InterfaceC65349Pkn("online_user_state")
    public int onlineUserState;

    @InterfaceC65349Pkn("p")
    public int position;

    @InterfaceC65349Pkn("stat")
    public int status;

    @InterfaceC65349Pkn("talk_volume")
    public int talk;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("uid")
    public String uid;

    @InterfaceC65349Pkn("uid_str")
    public String uidStr;

    @InterfaceC65349Pkn("w")
    public double width;

    @InterfaceC65349Pkn("x")
    public double x;

    @InterfaceC65349Pkn("y")
    public double y;

    @InterfaceC65349Pkn("zorder")
    public int zOrder;

    public final String LIZ() {
        if (!TextUtils.isEmpty(this.uidStr)) {
            return this.uidStr;
        }
        return this.linkMicId;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Long.valueOf(this.account), Integer.valueOf(this.alpha), Double.valueOf(this.width), Double.valueOf(this.height), Double.valueOf(this.x), Double.valueOf(this.y), Integer.valueOf(this.zOrder), Integer.valueOf(this.status), this.uid, this.uidStr, Integer.valueOf(this.talk), Integer.valueOf(this.muteAudio), Integer.valueOf(this.position), Boolean.valueOf(this.muteAudioBool), Boolean.valueOf(this.muteVideoBool), this.linkMicId, this.extraInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeiRegion)) {
            return false;
        }
        SeiRegion seiRegion = (SeiRegion) obj;
        if (this.type == seiRegion.type && this.account == seiRegion.account && this.alpha == seiRegion.alpha && Double.compare(seiRegion.width, this.width) == 0 && Double.compare(seiRegion.height, this.height) == 0 && Double.compare(seiRegion.x, this.x) == 0 && Double.compare(seiRegion.y, this.y) == 0 && this.zOrder == seiRegion.zOrder && this.status == seiRegion.status && this.position == seiRegion.position && this.muteVideoBool == seiRegion.muteVideoBool && this.muteAudioBool == seiRegion.muteAudioBool && Objects.equals(this.uid, seiRegion.uid) && Objects.equals(this.uidStr, seiRegion.uidStr) && Objects.equals(this.linkMicId, seiRegion.linkMicId) && this.onlineUserState == seiRegion.onlineUserState && this.audioOccupied == seiRegion.audioOccupied && Objects.equals(this.extraInfo, seiRegion.extraInfo) && (!MultiGuestSeiTalkEqualSetting.INSTANCE.isDefault() || this.talk == seiRegion.talk)) {
            return true;
        }
        return false;
    }
}
