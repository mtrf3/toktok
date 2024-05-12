package Y;

import X.C48459J0d;
import X.InterfaceC30442Bx8;
import X.InterfaceC64592gB;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.AnchorLinkmicUserSettings;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkGetSettingResult;

/* loaded from: classes14.dex */
public class AfS40S0000000_13 implements InterfaceC64592gB {
    public final int $t;

    public static final void accept$0(AfS40S0000000_13 afS40S0000000_13, Object obj) {
    }

    public static final void accept$1(AfS40S0000000_13 afS40S0000000_13, Object obj) {
    }

    public static final void accept$2(AfS40S0000000_13 afS40S0000000_13, Object obj) {
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS40S0000000_13(int i) {
        this.$t = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS40S0000000_13 afS40S0000000_13, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        BaseResponse baseResponse = (BaseResponse) obj;
        T t = baseResponse.data;
        if (t == 0) {
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLFII;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings = ((LinkGetSettingResult) t).settings;
        boolean z11 = false;
        if (anchorLinkmicUserSettings == null) {
            z = false;
        } else {
            z = anchorLinkmicUserSettings.isTurnOn;
        }
        c48459J0d.LIZ(Boolean.valueOf(z));
        C48459J0d<Boolean> c48459J0d2 = InterfaceC30442Bx8.LLFZ;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings2 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings2 == null) {
            z2 = false;
        } else {
            z2 = anchorLinkmicUserSettings2.acceptNotFollowerInvite;
        }
        c48459J0d2.LIZ(Boolean.valueOf(z2));
        C48459J0d<Boolean> c48459J0d3 = InterfaceC30442Bx8.LLJJIJI;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings3 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings3 == null) {
            z3 = false;
        } else {
            z3 = anchorLinkmicUserSettings3.blockInvitationOfThisLive;
        }
        c48459J0d3.LIZ(Boolean.valueOf(z3));
        C48459J0d<Boolean> c48459J0d4 = InterfaceC30442Bx8.LLIIIILZ;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings4 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings4 == null) {
            z4 = false;
        } else {
            z4 = anchorLinkmicUserSettings4.blockThisMultiHostInvites;
        }
        c48459J0d4.LIZ(Boolean.valueOf(z4));
        C48459J0d<Boolean> c48459J0d5 = InterfaceC30442Bx8.LLIIIJ;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings5 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings5 == null) {
            z5 = false;
        } else {
            z5 = anchorLinkmicUserSettings5.blockThisMultiHostApplication;
        }
        c48459J0d5.LIZ(Boolean.valueOf(z5));
        C48459J0d<Boolean> c48459J0d6 = InterfaceC30442Bx8.LLI;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings6 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings6 == null) {
            z6 = false;
        } else {
            z6 = anchorLinkmicUserSettings6.receiveFriendMultiHostInvites;
        }
        c48459J0d6.LIZ(Boolean.valueOf(z6));
        C48459J0d<Boolean> c48459J0d7 = InterfaceC30442Bx8.LLIFFJFJJ;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings7 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings7 == null) {
            z7 = false;
        } else {
            z7 = anchorLinkmicUserSettings7.receiveFriendMultiHostApplication;
        }
        c48459J0d7.LIZ(Boolean.valueOf(z7));
        C48459J0d<Boolean> c48459J0d8 = InterfaceC30442Bx8.LLII;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings8 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings8 == null) {
            z8 = false;
        } else {
            z8 = anchorLinkmicUserSettings8.receiveNotFriendMultiHostInvites;
        }
        c48459J0d8.LIZ(Boolean.valueOf(z8));
        C48459J0d<Boolean> c48459J0d9 = InterfaceC30442Bx8.LLIIII;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings9 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings9 == null) {
            z9 = false;
        } else {
            z9 = anchorLinkmicUserSettings9.receiveNotFriendMultiHostApplication;
        }
        c48459J0d9.LIZ(Boolean.valueOf(z9));
        C48459J0d<Boolean> c48459J0d10 = InterfaceC30442Bx8.LLFFF;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings10 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings10 == null) {
            z10 = false;
        } else {
            z10 = anchorLinkmicUserSettings10.allowLiveNoticeOfFriends;
        }
        c48459J0d10.LIZ(Boolean.valueOf(z10));
        C48459J0d<Boolean> c48459J0d11 = InterfaceC30442Bx8.LLIIIL;
        AnchorLinkmicUserSettings anchorLinkmicUserSettings11 = ((LinkGetSettingResult) baseResponse.data).settings;
        if (anchorLinkmicUserSettings11 != null) {
            z11 = anchorLinkmicUserSettings11.allowLiveNoticeOfFriends;
        }
        c48459J0d11.LIZ(Boolean.valueOf(z11));
    }
}
