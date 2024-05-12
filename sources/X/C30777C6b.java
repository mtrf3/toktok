package X;

import android.util.ArrayMap;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.FirstScreenDebounceClickEnabledSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdk.model.message.RankTextMessage;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* renamed from: X.C6b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30777C6b extends C30776C6a {
    public final String LJLJL;

    @Override // X.C30776C6a
    public final void LIZJ(View view, UserProfileEvent userProfileEvent) {
        long j;
        long j2;
        String str;
        long j3;
        String str2;
        long j4;
        long j5;
        Object tag = view.getTag(R.id.lro);
        if (tag instanceof String) {
            userProfileEvent.mEventPage = tag.toString();
        }
        Object tag2 = view.getTag(R.id.lrn);
        if (tag2 instanceof CQO) {
            CQO cqo = (CQO) tag2;
            User user = this.LJLJJLL;
            if (user != null) {
                cqo.LJLLI(cqo.LJJJJJ(user));
            }
            MESSAGE message = cqo.LJIJJLI;
            C31301CQf c31301CQf = cqo.LJIILL;
            if (c31301CQf.LIZIZ) {
                userProfileEvent.clickMethod = "pin";
                CS6 cs6 = c31301CQf.LIZJ;
                if (cs6 != null) {
                    PinMessage pinMessage = cs6.LJI;
                    if (pinMessage != null) {
                        j4 = pinMessage.pinId;
                    } else {
                        j4 = 0;
                    }
                    userProfileEvent.pinId = j4;
                    if (pinMessage != null) {
                        j5 = pinMessage.getMessageId();
                    } else {
                        j5 = 0;
                    }
                    userProfileEvent.pinMsgId = j5;
                }
            } else {
                userProfileEvent.clickMethod = "normal";
            }
            if (message != 0) {
                userProfileEvent.msgId = message.getMessageId();
                userProfileEvent.setClickUserPosition(this.LJLJL);
                if (message instanceof ChatMessage) {
                    userProfileEvent.content = ((ChatMessage) message).content;
                    return;
                }
                if (message instanceof MemberMessage) {
                    Text text = ((MemberMessage) message).anchorDisplayText;
                    if (text == null || !"pm_mt_guidance_interaction".equals(text.key)) {
                        return;
                    }
                    HashMap LIZ = C45243HpH.LIZ("event_type", "click", "click_module", "username");
                    BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_interact_notice");
                    LIZ2.LJJIFFI(LIZ);
                    LIZ2.LJIIZILJ();
                    LIZ2.LJJIIJZLJL();
                    return;
                }
                String str3 = "";
                if (message instanceof SubNotifyMessage) {
                    userProfileEvent.setClickUserPosition("subscribe_message");
                    SubNotifyMessage subNotifyMessage = (SubNotifyMessage) message;
                    ArrayMap arrayMap = new ArrayMap();
                    int i = subNotifyMessage.subscribeType;
                    if (i == 0) {
                        str2 = "one_month";
                    } else if (i != 1) {
                        str2 = "";
                    } else {
                        str2 = "auto_sub";
                    }
                    int i2 = subNotifyMessage.oldSubscribeStatus;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 3) {
                                    str3 = "resubscribe_beyond_grace_period";
                                }
                            } else {
                                str3 = "resubscribe_within_grace_period";
                            }
                        } else {
                            str3 = "resubscribe";
                        }
                    } else {
                        str3 = "first_subscribe";
                    }
                    arrayMap.put("subscribe_type", str2);
                    arrayMap.put("sub_message_type", str3);
                    userProfileEvent.setExtraParams(arrayMap);
                    return;
                }
                if (!(message instanceof RankTextMessage)) {
                    return;
                }
                userProfileEvent.setClickUserPosition("top_active_user_rank_message");
                RankTextMessage rankTextMessage = (RankTextMessage) message;
                ArrayMap arrayMap2 = new ArrayMap();
                Long l = rankTextMessage.ownerIdxBeforeUpdate;
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                Long l2 = rankTextMessage.ownerIdxAfterUpdate;
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                if (j < 0 || j2 <= 0) {
                    str = "";
                } else {
                    if (j > 3 && j2 <= 3) {
                        str = "above_top3_change";
                    } else if (j2 >= 3 || j2 >= j) {
                        str = "";
                    } else {
                        str = "top3_change";
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(j2);
                    LIZ3.append("");
                    arrayMap2.put("to_user_rank", X1D.LIZIZ(LIZ3));
                }
                arrayMap2.put("top_active_user_rank_message_type", str);
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
                if (dataChannelGlobal.mv0(C29044Baa.class) != null) {
                    j3 = ((Room) dataChannelGlobal.mv0(C29044Baa.class)).getOwnerUserId();
                } else {
                    j3 = 0;
                }
                if (currentUserId != 0 && dataChannelGlobal.mv0(C29044Baa.class) != null) {
                    if (currentUserId == j3) {
                        arrayMap2.put("from_user_rank", "null");
                    } else if (((C28246B6s) dataChannelGlobal.mv0(C29049Baf.class)).LJFF != null) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(((C28246B6s) dataChannelGlobal.mv0(C29049Baf.class)).LJFF.LJJIIJZLJL);
                        LIZ4.append("");
                        arrayMap2.put("from_user_rank", X1D.LIZIZ(LIZ4));
                    }
                }
                userProfileEvent.setExtraParams(arrayMap2);
            }
        }
    }

    public C30777C6b(int i, User user, String str) {
        super(i, user);
        this.LJLJL = str;
        this.LJLJI = FirstScreenDebounceClickEnabledSetting.INSTANCE.getValue();
    }
}
