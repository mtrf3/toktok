package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenEffectiveItemsLogSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.ReportHeightRatioSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import webcast.data.UserIdentity;

/* renamed from: X.CTj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31383CTj extends AbstractC31386CTm {
    public final java.util.Map<Long, C31389CTp> LJJJIL = new LinkedHashMap();
    public final boolean LJJJJ;
    public final HashMap<String, Integer> LJJJJI;
    public boolean LJJJJIZL;
    public int LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public final CTW LJJJJZ;
    public List<String> LJJJJZI;

    @Override // X.AbstractC31385CTl
    public final void LJJIJLIJ() {
        this.LJJJJLI = 0;
        this.LJJJJLL = 0;
        this.LJJJJL = 0;
    }

    @Override // X.AbstractC31385CTl
    public final void LJJIL() {
        String str;
        int i;
        int i2;
        BZI LIZ = C28787BRn.LIZ("livesdk_message_show_monitor");
        LIZ.LJIILLIIL(LJJIJIIJIL().LJIIIIZZ);
        LIZ.LJIJJ(Integer.valueOf(this.LIZJ), "msg_comment_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJ), "msg_quick_comment_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIIZILJ), "msg_comment_chathead_loaded");
        LIZ.LJIJJ(LJJIJIL(), "admin_type");
        LIZ.LJIJJ(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.LJJIJLIJ)), "hot_duration");
        LIZ.LJIJJ(Integer.valueOf(this.LJIJI), "folded_show_msg_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIJJ), "unfolded_show_msg_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIJI + this.LJIJJ), "show_msg_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJFF), "msg_like_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJI), "msg_gift_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJII), "msg_share_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIIIIZZ), "msg_follow_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIIIZ), "show_history_msg_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIIJ), "drop_like_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIIJJI), "drop_gift_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIIL), "drop_share_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIILIIL), "drop_follow_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIILJJIL), "drop_comment_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIILLIIL), "drop_quick_comment_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIJJLI), "msg_member_enter_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIL), "drop_member_enter_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJ), "msg_comment_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIJIIJI), "msg_member_enter_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIIJZLJL), "msg_follow_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIIJ), "msg_share_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIII), "msg_gift_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJII), "msg_like_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIIZ + this.LJJIIZI), "show_msg_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIJ), "show_history_msg_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIIZ), "folded_show_msg_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIIZI), "unfolded_show_msg_effective_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJJIFFI), "msg_quick_comment_effective_cnt");
        if (LJJIJIIJIL().LJIIZILJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.LJIJJ(str, "is_extended_comment_filed");
        LIZ.LJIJJ(Long.valueOf(this.LJJIJIIJIL), "model_convert_total_cnt");
        LIZ.LJIJJ(Integer.valueOf(this.LJIJ), "msg_comment_avatar_preload_cnt");
        LIZ.LJIJJ(((IInteractService) CN1.LIZ(IInteractService.class)).gB(), "layout_id");
        if (LJJIJIIJIL().LJFF) {
            LIZ.LJIJJ(Integer.valueOf(this.LJJJJL), "first_follow_feedback_cnt");
            LIZ.LJIJJ(Integer.valueOf(this.LJJJJLI), "first_like_feedback_cnt");
            LIZ.LJIJJ(Integer.valueOf(this.LJJJJLL), "first_comment_feedback_cnt");
        }
        java.util.Set<Map.Entry<String, Integer>> entrySet = this.LJJJJI.entrySet();
        o.LJIIIIZZ(entrySet, "logParamsWithSenderID.entries");
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            o.LJIIIIZZ(key, "it.key");
            LIZ.LJIJJ(String.valueOf(entry.getValue().intValue()), key);
        }
        if (this.LJJJJ && (!this.LJJJIL.isEmpty())) {
            StringBuilder sb = new StringBuilder();
            int i3 = 0;
            for (Object obj : ((LinkedHashMap) this.LJJJIL).values()) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C31389CTp c31389CTp = (C31389CTp) obj;
                    if (i3 > 0) {
                        sb.append(";");
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("0:");
                    LIZ2.append(c31389CTp.LIZ);
                    LIZ2.append(",12:");
                    LIZ2.append(c31389CTp.LIZIZ);
                    LIZ2.append(",14:");
                    LIZ2.append(c31389CTp.LIZJ);
                    LIZ2.append(",15:");
                    LIZ2.append(c31389CTp.LIZLLL);
                    LIZ2.append(",16:");
                    LIZ2.append(c31389CTp.LJ);
                    sb.append(X1D.LIZIZ(LIZ2));
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            LIZ.LJIJJ(sb.toString(), "message_items");
            ((LinkedHashMap) this.LJJJIL).clear();
        }
        if (ReportHeightRatioSetting.enable() && (i = this.LJJJJJ) >= 0 && (i2 = this.LJJJJJL) > 0) {
            LIZ.LJIJJ(Integer.valueOf(O6R.LJJIIZ((i / i2) * 100)), "public_screen_height");
        }
        String str2 = "";
        int i5 = 0;
        for (String str3 : this.LJJJJZI) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                String str4 = str3;
                if (i5 < r8.size() - 1) {
                    str2 = str2 + str4 + ',';
                } else {
                    str2 = str2 + str4;
                }
                i5 = i6;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LIZ.LJIJJ(str2, "rank_comment_groups");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
        }
        java.util.Set<Map.Entry<String, Integer>> entrySet2 = this.LJJJJI.entrySet();
        o.LJIIIIZZ(entrySet2, "logParamsWithSenderID.entries");
        Iterator<Map.Entry<String, Integer>> it = entrySet2.iterator();
        while (it.hasNext()) {
            it.next().setValue(0);
        }
    }

    public C31383CTj() {
        this.LJJJJ = LivePublicScreenEffectiveItemsLogSetting.getValue() == 1;
        HashMap<String, Integer> hashMap = new HashMap<>();
        this.LJJJJI = hashMap;
        this.LJJJJIZL = true;
        this.LJJJJJ = -1;
        this.LJJJJJL = -1;
        this.LJJJJZ = new CTW(this);
        hashMap.put("msg_anchor_comment_effective_cnt", 0);
        hashMap.put("msg_gifter_comment_effective_cnt", 0);
        hashMap.put("msg_moderator_comment_effective_cnt", 0);
        hashMap.put("msg_friends_comment_effective_cnt", 0);
        hashMap.put("msg_fans_comment_effective_cnt", 0);
        hashMap.put("msg_subscriber_comment_effective_cnt", 0);
        hashMap.put("drop_anchor_comment_cnt", 0);
        hashMap.put("drop_gifter_comment_cnt", 0);
        hashMap.put("drop_moderator_comment_cnt", 0);
        hashMap.put("drop_friends_comment_cnt", 0);
        hashMap.put("drop_fans_comment_cnt", 0);
        hashMap.put("drop_subscriber_comment_cnt", 0);
        hashMap.put("msg_anchor_comment_cnt", 0);
        hashMap.put("msg_gifter_comment_cnt", 0);
        hashMap.put("msg_moderator_comment_cnt", 0);
        hashMap.put("msg_friends_comment_cnt", 0);
        hashMap.put("msg_subscriber_comment_cnt", 0);
        hashMap.put("msg_fans_comment_cnt", 0);
        this.LJJJJZI = C61878OQg.INSTANCE;
    }

    @Override // X.AbstractC31386CTm, X.AbstractC31385CTl, X.InterfaceC31335CRn
    public final void LIZ() {
        List<String> list;
        Room room;
        super.LIZ();
        DataChannel dataChannel = LJJIJIIJIL().LJIIIIZZ;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || (list = room.rankCommentGroups) == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LJJJJZI = list;
        this.LJJJJJ = -1;
        this.LJJJJJL = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if ((r1 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIZ(X.CR6 r1) {
        /*
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            if (r0 != 0) goto L15
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto Lf
        L8:
            boolean r0 = r1 instanceof com.bytedance.android.livesdk.model.message.EmoteChatMessage
            if (r0 == 0) goto Lf
            r0 = r1
            com.bytedance.android.livesdk.model.message.EmoteChatMessage r0 = (com.bytedance.android.livesdk.model.message.EmoteChatMessage) r0
        Lf:
            java.lang.String r0 = "hotRoom"
            X.C29827BnD.LIZ(r1, r0)
            return
        L15:
            r0 = r1
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31383CTj.LJJIZ(X.CR6):void");
    }

    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public final void LJIIIIZZ(CRD model) {
        UserIdentity LIZ;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(model, "model");
        super.LJIIIIZZ(model);
        if (model instanceof CQO) {
            MESSAGE message = ((CQO) model).LJIJJLI;
            if (((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) && (LIZ = model.LIZ()) != null) {
                int i6 = 0;
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isAnchor))) {
                    HashMap<String, Integer> hashMap = this.LJJJJI;
                    Integer num = hashMap.get("msg_anchor_comment_cnt");
                    if (num != null) {
                        i5 = num.intValue() + 1;
                    } else {
                        i5 = 0;
                    }
                    hashMap.put("msg_anchor_comment_cnt", Integer.valueOf(i5));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isGiftGiverOfAnchor))) {
                    HashMap<String, Integer> hashMap2 = this.LJJJJI;
                    Integer num2 = hashMap2.get("msg_gifter_comment_cnt");
                    if (num2 != null) {
                        i4 = num2.intValue() + 1;
                    } else {
                        i4 = 0;
                    }
                    hashMap2.put("msg_gifter_comment_cnt", Integer.valueOf(i4));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isModeratorOfAnchor))) {
                    HashMap<String, Integer> hashMap3 = this.LJJJJI;
                    Integer num3 = hashMap3.get("msg_moderator_comment_cnt");
                    if (num3 != null) {
                        i3 = num3.intValue() + 1;
                    } else {
                        i3 = 0;
                    }
                    hashMap3.put("msg_moderator_comment_cnt", Integer.valueOf(i3));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isMutualFollowingWithAnchor))) {
                    HashMap<String, Integer> hashMap4 = this.LJJJJI;
                    Integer num4 = hashMap4.get("msg_friends_comment_cnt");
                    if (num4 != null) {
                        i2 = num4.intValue() + 1;
                    } else {
                        i2 = 0;
                    }
                    hashMap4.put("msg_friends_comment_cnt", Integer.valueOf(i2));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isFollowerOfAnchor))) {
                    HashMap<String, Integer> hashMap5 = this.LJJJJI;
                    Integer num5 = hashMap5.get("msg_fans_comment_cnt");
                    if (num5 != null) {
                        i = num5.intValue() + 1;
                    } else {
                        i = 0;
                    }
                    hashMap5.put("msg_fans_comment_cnt", Integer.valueOf(i));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isSubscriberOfAnchor))) {
                    HashMap<String, Integer> hashMap6 = this.LJJJJI;
                    Integer num6 = hashMap6.get("msg_subscriber_comment_cnt");
                    if (num6 != null) {
                        i6 = num6.intValue() + 1;
                    }
                    hashMap6.put("msg_subscriber_comment_cnt", Integer.valueOf(i6));
                }
            }
            if ((model instanceof CS1) && ((CS1) model).LJIILIIL() && LJJIJIIJIL().LJFF) {
                if (model instanceof CQ7) {
                    this.LJJJJL++;
                } else if (model instanceof CQJ) {
                    this.LJJJJLL++;
                } else {
                    if (!(model instanceof CQ6)) {
                        return;
                    }
                    this.LJJJJLI++;
                }
            }
        }
    }

    @Override // X.AbstractC31385CTl, X.CRC, X.CR8
    public final void LJIILIIL(CRD model) {
        UserIdentity LIZ;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(model, "model");
        super.LJIILIIL(model);
        if (model instanceof CQO) {
            CQO cqo = (CQO) model;
            MESSAGE message = cqo.LJIJJLI;
            if (((message instanceof ChatMessage) || (message instanceof EmoteChatMessage)) && (LIZ = model.LIZ()) != null) {
                int i6 = 0;
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isAnchor))) {
                    HashMap<String, Integer> hashMap = this.LJJJJI;
                    Integer num = hashMap.get("msg_anchor_comment_effective_cnt");
                    if (num != null) {
                        i5 = num.intValue() + 1;
                    } else {
                        i5 = 0;
                    }
                    hashMap.put("msg_anchor_comment_effective_cnt", Integer.valueOf(i5));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isGiftGiverOfAnchor))) {
                    HashMap<String, Integer> hashMap2 = this.LJJJJI;
                    Integer num2 = hashMap2.get("msg_gifter_comment_effective_cnt");
                    if (num2 != null) {
                        i4 = num2.intValue() + 1;
                    } else {
                        i4 = 0;
                    }
                    hashMap2.put("msg_gifter_comment_effective_cnt", Integer.valueOf(i4));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isModeratorOfAnchor))) {
                    HashMap<String, Integer> hashMap3 = this.LJJJJI;
                    Integer num3 = hashMap3.get("msg_moderator_comment_effective_cnt");
                    if (num3 != null) {
                        i3 = num3.intValue() + 1;
                    } else {
                        i3 = 0;
                    }
                    hashMap3.put("msg_moderator_comment_effective_cnt", Integer.valueOf(i3));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isMutualFollowingWithAnchor))) {
                    HashMap<String, Integer> hashMap4 = this.LJJJJI;
                    Integer num4 = hashMap4.get("msg_friends_comment_effective_cnt");
                    if (num4 != null) {
                        i2 = num4.intValue() + 1;
                    } else {
                        i2 = 0;
                    }
                    hashMap4.put("msg_friends_comment_effective_cnt", Integer.valueOf(i2));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isFollowerOfAnchor))) {
                    HashMap<String, Integer> hashMap5 = this.LJJJJI;
                    Integer num5 = hashMap5.get("msg_fans_comment_effective_cnt");
                    if (num5 != null) {
                        i = num5.intValue() + 1;
                    } else {
                        i = 0;
                    }
                    hashMap5.put("msg_fans_comment_effective_cnt", Integer.valueOf(i));
                }
                if (C29306Beo.LJJIFFI(Boolean.valueOf(LIZ.isSubscriberOfAnchor))) {
                    HashMap<String, Integer> hashMap6 = this.LJJJJI;
                    Integer num6 = hashMap6.get("msg_subscriber_comment_effective_cnt");
                    if (num6 != null) {
                        i6 = num6.intValue() + 1;
                    }
                    hashMap6.put("msg_subscriber_comment_effective_cnt", Integer.valueOf(i6));
                }
            }
            if (this.LJJJJ && !model.LJJJLL().LIZ) {
                MESSAGE message2 = cqo.LJIJJLI;
                if ((message2 instanceof ChatMessage) || (message2 instanceof EmoteChatMessage) || (message2 instanceof GiftMessage)) {
                    C31389CTp c31389CTp = (C31389CTp) ((LinkedHashMap) this.LJJJIL).get(Long.valueOf(message2.getMessageId()));
                    if (c31389CTp == null) {
                        c31389CTp = new C31389CTp();
                        c31389CTp.LIZ = cqo.LJIJJLI.getMessageId();
                        c31389CTp.LIZIZ = model.LJJLIIJ().LIZ;
                        this.LJJJIL.put(Long.valueOf(cqo.LJIJJLI.getMessageId()), c31389CTp);
                    }
                    if (c31389CTp.LIZJ == 0) {
                        c31389CTp.LIZJ = model.LJJIFFI().LJ;
                    }
                    c31389CTp.LIZLLL++;
                    c31389CTp.LJ += model.LJJIFFI().LJI;
                }
            }
            if (model instanceof C29846BnW) {
                BZI LIZ2 = C28787BRn.LIZ("livesdk_live_capsule_effective_show");
                LIZ2.LJIIZILJ();
                LIZ2.LJIJJ(LJJIJIL(), "admin_type");
                CQO cqo2 = (CQO) model;
                LIZ2.LJIJJ(Long.valueOf(cqo2.LJIJJLI.getMessageId()), "msg_id");
                LIZ2.LJIJJ(((CapsuleMessage) cqo2.LJIJJLI).scene, "msg_name");
                UFE.LIZIZ(((CapsuleMessage) cqo2.LJIJJLI).capsuleType, LIZ2, "msg_type");
            }
        }
    }

    @Override // X.CRC, X.CR8
    public final void LJIJ(List<? extends CRD> list) {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.TimeStamp timeStamp;
        if (this.LJJJJIZL) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (((CRD) it.next()).LJJLIIIJILLIZJL()) {
                        i++;
                    }
                }
                BZI LIZ = C28787BRn.LIZ("livesdk_public_screen_show");
                LIZ.LJIJJ(Integer.valueOf(arrayList.size()), "show_msg_cnt");
                LIZ.LJIJJ(Integer.valueOf(i), "show_history_msg_cnt");
                EnterRoomLinkSession LIZ2 = B57.LIZ.LIZ();
                if (LIZ2 != null && (enterRoomConfig = LIZ2.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null && (timeStamp = roomsData.timeStamps) != null) {
                    LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - timeStamp.enterRoomStarTime), "show_duration");
                }
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
                    LIZ.LJIILLIIL(LJJIJIIJIL().LJIIIIZZ);
                    LIZ.LJJIIJZLJL();
                } else {
                    LIZ.LJJIJ();
                    LIZ.LJI();
                    LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
                    LIZ.LJJIIZI();
                }
                this.LJJJJIZL = false;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00da. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC31386CTm, X.AbstractC31385CTl, X.CRC, X.CR8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(long r13, X.CRD r15) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31383CTj.LJIJJ(long, X.CRD):void");
    }

    @Override // X.AbstractC31385CTl, X.CR8
    public final void LJJIJ(CRD model, boolean z) {
        o.LJIIIZ(model, "model");
        super.LJJIJ(model, z);
        if (model instanceof CQO) {
            LJJIZ(((CQO) model).LJIJJLI);
        }
    }

    @Override // X.AbstractC31385CTl, X.CR8
    public final void LJJ(CR6 message, AbstractC31313CQr<CR6> abstractC31313CQr, boolean z, User user, boolean z2) {
        o.LJIIIZ(message, "message");
        super.LJJ(message, abstractC31313CQr, z, user, z2);
        LJJIZ(message);
    }
}
