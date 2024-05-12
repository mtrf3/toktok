package X;

import android.util.ArrayMap;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.RankTextMessage;
import com.bytedance.android.livesdk.model.message.common.Text;

/* renamed from: X.Bji, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29610Bji extends CQO<RankTextMessage> {
    public BadgeStruct LJIL;

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return null;
    }

    @Override // X.CQL
    public final boolean LJZ() {
        return true;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    public final java.util.Map<String, String> LLFF() {
        long j;
        long j2;
        String str;
        ArrayMap arrayMap = new ArrayMap();
        MESSAGE message = this.LJIJJLI;
        if (((RankTextMessage) message).ownerIdxBeforeUpdate != null) {
            j = ((RankTextMessage) message).ownerIdxBeforeUpdate.longValue();
        } else {
            j = 0;
        }
        MESSAGE message2 = this.LJIJJLI;
        if (((RankTextMessage) message2).ownerIdxAfterUpdate != null) {
            j2 = ((RankTextMessage) message2).ownerIdxAfterUpdate.longValue();
        } else {
            j2 = 0;
        }
        String str2 = "";
        if (j >= 0 && j2 > 0) {
            if (j > 3 && j2 <= 3) {
                str = "above_top3_change";
            } else if (j2 >= 3 || j2 >= j) {
                str = "";
            } else {
                str = "top3_change";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(j2);
            LIZ.append("");
            arrayMap.put("to_user_rank", X1D.LIZIZ(LIZ));
            str2 = str;
        }
        arrayMap.put("top_active_user_rank_message_type", str2);
        return arrayMap;
    }

    @Override // X.CQL, X.InterfaceC31368CSu
    public final void onAttach() {
        String str;
        int i;
        LiveLogMonitorSampleSetting liveLogMonitorSampleSetting = LiveLogMonitorSampleSetting.INSTANCE;
        int i2 = 0;
        String str2 = "anchor";
        if (liveLogMonitorSampleSetting.isReport("livesdk_top_active_user_rank_message_show", LiveLogMonitorSampleSetting.getSAMPLE_10())) {
            BZI LIZ = C28787BRn.LIZ("livesdk_top_active_user_rank_message_show");
            LIZ.LJJIFFI(LLFF());
            LIZ.LJIIZILJ();
            if (LJLJJL()) {
                str = "anchor";
            } else {
                str = "user";
            }
            if (((C29374Bfu) TTL.LIZJ(LIZ, str, "user_type")).getCurrentUserId() == ((RankTextMessage) this.LJIJJLI).curUserId) {
                i = 1;
            } else {
                i = 0;
            }
            UFE.LIZIZ(i, LIZ, "is_self");
        }
        if (liveLogMonitorSampleSetting.isReport("livesdk_top_active_user_rank_message_send", LiveLogMonitorSampleSetting.getSAMPLE_100())) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_top_active_user_rank_message_send");
            LIZ2.LJJIFFI(LLFF());
            LIZ2.LJIIZILJ();
            if (!LJLJJL()) {
                str2 = "user";
            }
            if (((C29374Bfu) TTL.LIZJ(LIZ2, str2, "user_type")).getCurrentUserId() == ((RankTextMessage) this.LJIJJLI).curUserId) {
                i2 = 1;
            }
            UFE.LIZIZ(i2, LIZ2, "is_self");
        }
    }

    @Override // X.CQO, X.CQL
    public final Text LJLI() {
        long LIZ = C025908h.LIZ();
        MESSAGE message = this.LJIJJLI;
        if (LIZ == ((RankTextMessage) message).curUserId) {
            return ((RankTextMessage) message).selfGetBadgeMsg;
        }
        return ((RankTextMessage) message).otherGetBadgeMsg;
    }

    @Override // X.CQO, X.CQL
    public final boolean LL() {
        if (LJLI() != null) {
            return true;
        }
        return false;
    }

    public C29610Bji(RankTextMessage rankTextMessage) {
        super(rankTextMessage);
    }

    @Override // X.CQL
    public final void LJLLI(BadgeStruct badgeStruct) {
        String str;
        if (C29514BiA.LIZ(this.LJIL)) {
            long j = ((RankTextMessage) this.LJIJJLI).curUserId;
            if (LJLJJL()) {
                str = "anchor";
            } else {
                str = "user";
            }
            C29514BiA.LIZJ(j, "livesdk_top_active_user_rank_badge_click", "comment_area_rank_message", str);
        }
    }

    @Override // X.CQL
    public final void LJLLILLLL(BadgeStruct badgeStruct) {
        String str;
        if (C29514BiA.LIZ(badgeStruct)) {
            this.LJIL = badgeStruct;
            long j = ((RankTextMessage) this.LJIJJLI).curUserId;
            if (LJLJJL()) {
                str = "anchor";
            } else {
                str = "user";
            }
            C29514BiA.LIZJ(j, "livesdk_top_active_user_rank_badge_show", "comment_area_rank_message", str);
        }
    }
}
