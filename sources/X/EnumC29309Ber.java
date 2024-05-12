package X;

import com.bytedance.android.livesdk.dataChannel.BroadcastPageChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* renamed from: X.Ber, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC29309Ber {
    PREVIEW,
    VIDEO,
    OBS,
    GAME,
    END,
    AUDIENCE,
    LIVE_VOICE;

    public static EnumC29309Ber valueOf(String str) {
        return (EnumC29309Ber) V0N.LJJJ(EnumC29309Ber.class, str);
    }

    public final void config() {
        DataChannelGlobal.LJLJJI.tv0(BroadcastPageChannel.class, this);
    }

    public final boolean isAudience() {
        if (this == AUDIENCE) {
            return true;
        }
        return false;
    }

    public final boolean isEndPage() {
        if (this == END) {
            return true;
        }
        return false;
    }

    public final boolean isGamePage() {
        if (this == GAME) {
            return true;
        }
        return false;
    }

    public final boolean isOBSPage() {
        if (this == OBS) {
            return true;
        }
        return false;
    }

    public final boolean isPreviewPage() {
        if (this == PREVIEW) {
            return true;
        }
        return false;
    }

    public final boolean isVideoPage() {
        if (this == VIDEO) {
            return true;
        }
        return false;
    }

    public final boolean isVoiceChatPage() {
        if (this == LIVE_VOICE) {
            return true;
        }
        return false;
    }

    public final boolean isBroadCastPage() {
        if (isVideoPage() || isGamePage() || isOBSPage() || isVoiceChatPage()) {
            return true;
        }
        return false;
    }
}
