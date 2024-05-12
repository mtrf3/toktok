package X;

import Y.ARunnableS41S0100000_5;
import android.content.Context;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tdl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75105Tdl extends C75103Tdj {
    public final C75120Te0 LLIIIJ;

    @Override // X.C75103Tdj, X.AbstractC32579CqV
    public final void LJIILL() {
        super.LJIILL();
        TZM tzm = (TZM) C79004UzY.LJIL(this.LJLJLJ, TZM.class);
        if (tzm != null) {
            tzm.LLIZ(this.LLIIIJ);
        }
    }

    @Override // X.C75103Tdj, X.AbstractC32579CqV
    public final void LJIJJ() {
        super.LJIJJ();
        TZM tzm = (TZM) C79004UzY.LJIL(this.LJLJLJ, TZM.class);
        if (tzm != null) {
            tzm.LLLFF(this.LLIIIJ);
        }
    }

    @Override // X.C75103Tdj
    public final int LJJI(LinkPlayerInfo linkPlayerInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceChatGiftLeaf_calcAudioStatusForAnchor linkPlayerInfo:");
        LIZ.append(linkPlayerInfo);
        C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
        int LJJJJ = LJJJJ(linkPlayerInfo);
        if (LJJJJ == 1) {
            return 1;
        }
        if (LJJJJ == 2) {
            return 2;
        }
        return 0;
    }

    @Override // X.C75103Tdj
    public final int LJJIFFI(LinkPlayerInfo linkPlayerInfo) {
        int LJJJJ = LJJJJ(linkPlayerInfo);
        if (LJJJJ == 1) {
            return 1;
        }
        if (LJJJJ == 2) {
            return 2;
        }
        return 0;
    }

    @Override // X.C75103Tdj
    public final boolean LJJIJ(String str) {
        Boolean bool;
        if (str == null) {
            return false;
        }
        TZM tzm = (TZM) C79004UzY.LJIL(this.LJLJLJ, TZM.class);
        if (tzm != null) {
            bool = Boolean.valueOf(tzm.u(str));
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceChatGiftLeaf_getOnlineUserIsPauseValue linkMicId:");
        LIZ.append(str);
        LIZ.append(" value:");
        LIZ.append(LJJIFFI);
        C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
        return LJJIFFI;
    }

    public final int LJJJJ(LinkPlayerInfo linkPlayerInfo) {
        String str;
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceChatGiftLeaf_getAudioStatus linkPlayerInfo:");
        LIZ.append(linkPlayerInfo);
        C0NB.LIZIZ("voice_chat", X1D.LIZIZ(LIZ));
        if (linkPlayerInfo == null || (str = linkPlayerInfo.mInteractIdStr) == null) {
            return 1;
        }
        TZM tzm = (TZM) C79004UzY.LJIL(this.LJLJLJ, TZM.class);
        if (tzm != null) {
            bool = Boolean.valueOf(tzm.k(str));
        } else {
            bool = null;
        }
        if (!C29306Beo.LJJIFFI(bool)) {
            return 1;
        }
        return 2;
    }

    @Override // X.C75103Tdj
    public final boolean LJJIJIIJI(Integer num, String str) {
        Boolean bool;
        if (str == null) {
            return false;
        }
        TZM tzm = (TZM) C79004UzY.LJIL(this.LJLJLJ, TZM.class);
        if (tzm != null) {
            bool = Boolean.valueOf(tzm.LJL(str));
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoiceChatGiftLeaf_getAudioIsOccupiedValue linkMicId:");
        LIZ.append(str);
        LIZ.append(" audioState:");
        LIZ.append(num);
        LIZ.append(" value:");
        C19U.LIZJ(LIZ, LJJIFFI, LIZ, "voice_chat");
        return LJJIFFI;
    }

    public C75105Tdl(Context context, C73893SzJ c73893SzJ, int i, DataChannel dataChannel, ARunnableS41S0100000_5 aRunnableS41S0100000_5) {
        super(context, c73893SzJ, i, dataChannel, aRunnableS41S0100000_5);
        this.LLIIIJ = new C75120Te0(this);
    }
}
