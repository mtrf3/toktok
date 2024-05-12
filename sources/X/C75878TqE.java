package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multihost.abtest.MultiHostTimeoutAbTestHelper;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostOldQuickPairJoinRtcOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TqE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75878TqE extends AbstractC75865Tq1 {
    public static final /* synthetic */ int LJFF = 0;
    public final String LJ = "ttlive_client_anchor_cohost_monitor";

    @Override // X.AbstractC75865Tq1
    public final boolean LJIILL() {
        return true;
    }

    @Override // X.AbstractC75865Tq1
    public final void LJIILIIL() {
        long j;
        String str;
        String label;
        String str2;
        int i;
        Long l;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j = 0;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "user_id", Long.valueOf(j), true);
        C75883TqJ LJI = C8E.LIZLLL().LJI(j);
        if (LJI == null || (str = LJI.LJII) == null) {
            str = "";
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "link_mic_id", str, true);
        List<C75883TqJ> LJIL = C8E.LIZLLL().LJIL();
        ArrayList arrayList = new ArrayList();
        for (C75883TqJ c75883TqJ : LJIL) {
            C75883TqJ c75883TqJ2 = c75883TqJ;
            if (c75883TqJ2 != null && c75883TqJ2.LJFF() && c75883TqJ2.LJJI == EnumC75909Tqj.INVITED) {
                arrayList.add(c75883TqJ);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((C75883TqJ) it.next()).LIZ));
        }
        if (!arrayList2.isEmpty()) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "invited_uid_list", arrayList2.toString(), true);
        }
        ArrayList arrayList3 = new ArrayList();
        for (C75883TqJ c75883TqJ3 : LJIL) {
            C75883TqJ c75883TqJ4 = c75883TqJ3;
            if (c75883TqJ4 != null && c75883TqJ4.LJFF() && c75883TqJ4.LJJI == EnumC75909Tqj.APPLIED) {
                arrayList3.add(c75883TqJ3);
            }
        }
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Long.valueOf(((C75883TqJ) it2.next()).LIZ));
        }
        if (!arrayList4.isEmpty()) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "applied_uid", arrayList4.toString(), true);
        }
        ArrayList arrayList5 = new ArrayList();
        for (C75883TqJ c75883TqJ5 : LJIL) {
            C75883TqJ c75883TqJ6 = c75883TqJ5;
            if (c75883TqJ6 != null && (c75883TqJ6.LIZJ() || c75883TqJ6.LJJI == EnumC75909Tqj.LINKED)) {
                arrayList5.add(c75883TqJ5);
            }
        }
        ArrayList arrayList6 = new ArrayList(C32I.LJJL(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(Long.valueOf(((C75883TqJ) it3.next()).LIZ));
        }
        if (!arrayList6.isEmpty()) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "linked_uid_list", arrayList6.toString(), true);
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "linked_count", Integer.valueOf(arrayList6.size()), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "status", Integer.valueOf(C8E.LIZLLL().LLII().getValue()), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "cohost_state", Integer.valueOf(C8E.LIZLLL().LLII().getValue()), true);
        EnumC75672Tmu enumC75672Tmu = B5G.LIZIZ().LJJJLIIL;
        int[] iArr = C75671Tmt.LIZ;
        int i2 = iArr[enumC75672Tmu.ordinal()];
        String str3 = LiveGiftNewGifterBadgeSetting.DEFAULT;
        if (i2 == 1) {
            label = LiveGiftNewGifterBadgeSetting.DEFAULT;
        } else {
            label = B5G.LIZIZ().LJJJLIIL.getLabel();
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "anchor_type", label, true);
        if (iArr[B5G.LIZIZ().LJJJLL.ordinal()] != 1) {
            str3 = B5G.LIZIZ().LJJJLL.getLabel();
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "real_anchor_type", str3, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "apply_type", C75877TqD.LJIILJJIL, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "network_quality", Integer.valueOf(C75877TqD.LJIIJ), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "rx_quality", Integer.valueOf(C75877TqD.LJIIJJI), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "is_background", Boolean.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppBackground()), true);
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService.Qe0()) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "battle_id", Long.valueOf(iInteractService.eq()), true);
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "old_quickpair_join_rtc_opt", Integer.valueOf(MtCoHostOldQuickPairJoinRtcOptSetting.INSTANCE.getValue()), true);
        EnumC75614Tly enumC75614Tly = B5G.LIZIZ().LJIIJ;
        EnumC75614Tly enumC75614Tly2 = EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND;
        if (enumC75614Tly == enumC75614Tly2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "is_quick_recommend", str2, true);
        if (((RandomLinkMicManager.LJIIIZ() || B5G.LIZIZ().LJIIJ == enumC75614Tly2) && !C8E.LIZLLL().LLII().isLinked()) || ((C75650TmY.LJI.compareTo(EnumC75673Tmv.IDLE) > 0 || B5G.LIZIZ().LJIIJ == EnumC75614Tly.TOPIC_RECOMMEND) && !C8E.LIZLLL().LLII().isLinked())) {
            i = 1;
        } else {
            i = 0;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "is_quick_pair", Integer.valueOf(i), false);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "quick_pair_type", C75877TqD.LJIILL, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "channel_create_type", C75877TqD.LJIILLIIL, true);
        if (MultiHostTimeoutAbTestHelper.LIZJ) {
            AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "link_time_out_strategy", 0, true);
            return;
        }
        if (!this.LIZLLL.has("rival_user_id")) {
            return;
        }
        Object opt = this.LIZLLL.opt("rival_user_id");
        if ((opt instanceof Long) && (l = (Long) opt) != null && l.longValue() > 0 && C75877TqD.LJIIZILJ.contains(l)) {
            AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "link_time_out_strategy", Integer.valueOf(MultiHostTimeoutAbTestHelper.LIZLLL), true);
        } else {
            AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "link_time_out_strategy", 0, true);
        }
    }

    @Override // X.AbstractC75865Tq1
    public final String LJIILJJIL() {
        return this.LJ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0007 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJJJJJ(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1535331978: goto L40;
                case -1505150892: goto L35;
                case -700436896: goto L2a;
                case -379374338: goto L1f;
                case 507470202: goto L14;
                case 954170335: goto L9;
                default: goto L7;
            }
        L7:
            r0 = -1
        L8:
            return r0
        L9:
            java.lang.String r0 = "leave_with_mode_switch"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            goto L7
        L12:
            r0 = 5
            goto L8
        L14:
            java.lang.String r0 = "leave_with_sdk_reason"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1d
            goto L7
        L1d:
            r0 = 1
            goto L8
        L1f:
            java.lang.String r0 = "leave_with_perception_message"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            goto L7
        L28:
            r0 = 4
            goto L8
        L2a:
            java.lang.String r0 = "leave_with_detach_view"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L33
            goto L7
        L33:
            r0 = 2
            goto L8
        L35:
            java.lang.String r0 = "leave_with_microom_start"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3e
            goto L7
        L3e:
            r0 = 3
            goto L8
        L40:
            java.lang.String r0 = "leave_with_user_click_disconnect"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
            goto L7
        L49:
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75878TqE.LJJJJJ(java.lang.String):int");
    }

    public final void LJJJLL(String str) {
        AbstractC75865Tq1.LJIIL(this, "duration", Long.valueOf(SystemClock.uptimeMillis() - C75877TqD.LIZLLL));
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reason", Integer.valueOf(LJJJJJ(str)), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "not_suggest_uid", "", true);
        LJIILLIIL("leave_request");
    }

    public final void LJJL(CR6 cr6) {
        Long l;
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("list_change_message");
    }

    public final void LJIIZILJ(long j, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("accept_apply_message");
    }

    public final void LJIJ(long j, long j2) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - j2), true);
        LJIILLIIL("accept_apply_request");
    }

    public final void LJIJI(long j, String logId) {
        o.LJIIIZ(logId, "logId");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        LJIIJJI();
        LJIILLIIL("accept_apply_succeed");
    }

    public final void LJIJJ(long j, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("accept_invite_message");
    }

    public final void LJIJJLI(long j, long j2) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - j2), true);
        LJIILLIIL("accept_invite_request");
    }

    public final void LJIL(long j, String logId) {
        o.LJIIIZ(logId, "logId");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        LJIIJJI();
        LJIILLIIL("accept_invite_succeed");
    }

    public final void LJJII(long j, String source) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "client_log_id", C75877TqD.LJIIIZ, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "source", source, true);
        LJIILLIIL("apply_request");
    }

    public final void LJJIIJZLJL(long j, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("cancel_apply_message");
    }

    public final void LJJIIZ(long j, String source) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "request_source", source, true);
        LJIILLIIL("cancel_apply_request");
    }

    public final void LJJIJIIJI(long j, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("cancel_invite_message");
    }

    public final void LJJIJIIJIL(long j, String source) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "request_source", source, true);
        LJIILLIIL("cancel_invite_request");
    }

    public final void LJJJJLL(long j, String source) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "is_new_arch", 1, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "client_log_id", C75877TqD.LJIIIZ, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "source", source, true);
        LJIILLIIL("invite_request");
    }

    public final void LJJJLZIJ(String str, String logId) {
        o.LJIIIZ(logId, "logId");
        AbstractC75865Tq1.LJIIL(this, "duration", Long.valueOf(SystemClock.uptimeMillis() - C75877TqD.LIZLLL));
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reason", Integer.valueOf(LJJJJJ(str)), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        LJIILLIIL("leave_succeed");
    }

    public final void LJJJZ(int i, LinkCoreError linkCoreError) {
        long j = C75877TqD.LIZLLL;
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reason", Integer.valueOf(i), true);
        if (linkCoreError != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "rtc_error_code", Integer.valueOf(linkCoreError.getErrorCode()), true);
        }
        AbstractC75865Tq1.LJIIL(this, "duration", Long.valueOf(SystemClock.uptimeMillis() - j));
        LJIILLIIL("link_finish_by_sdk");
    }

    public final void LJJLI(long j, boolean z) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "is_mute", Boolean.valueOf(z), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "mute_anchor_id", Long.valueOf(j), true);
        LJIILLIIL("mute_audio");
    }

    public final void LJJLIIIJILLIZJL(int i, String str) {
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "action", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", str, true);
        LJIILLIIL("topic_pair_success");
    }

    public final void LJJ(long j, String source, Throwable th) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIJJI();
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "source", source, true);
        LJIIJ(th);
        LJIILLIIL("apply_failed");
    }

    public final void LJJI(long j, long j2, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "channel_id", Long.valueOf(j2), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("apply_message");
    }

    public final void LJJIFFI(long j, long j2, CR6 cr6) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            long j3 = 0;
            if (cr6 instanceof LinkMessage) {
                LinkMessage linkMessage = (LinkMessage) cr6;
                if (linkMessage.LIZ() > 0) {
                    AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "available_time", Long.valueOf(linkMessage.LIZ()), true);
                }
            }
            long j4 = cr6.timestamp;
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                j3 = commonMessageData.createTime;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "available_time", Long.valueOf(((1000 * j2) + j3) - j4), true);
        }
        LJIILLIIL("apply_popup_show");
    }

    public final void LJJIII(long j, String source, String logId) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(logId, "logId");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "client_log_id", C75877TqD.LJIIIZ, true);
        LJIIJJI();
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "source", source, true);
        LJIILLIIL("apply_succeed");
    }

    public final void LJJIIJ(long j, String source, Throwable th) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIJ(th);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "request_source", source, true);
        LJIIJJI();
        LJIILLIIL("cancel_apply_failed");
    }

    public final void LJJIIZI(long j, String logId, String source) {
        o.LJIIIZ(logId, "logId");
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "request_source", source, true);
        LJIIJJI();
        LJIILLIIL("cancel_apply_succeed");
    }

    public final void LJJIJ(long j, String source, Throwable th) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIJ(th);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "request_source", source, true);
        LJIIJJI();
        LJIILLIIL("cancel_invite_failed");
    }

    public final void LJJIJIL(long j, String logId, String source) {
        o.LJIIIZ(logId, "logId");
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "request_source", source, true);
        LJIIJJI();
        LJIILLIIL("cancel_invite_succeed");
    }

    public final void LJJIJL(EnumC75674Tmw coHostPermission, Throwable th, int i) {
        String str;
        o.LJIIIZ(coHostPermission, "coHostPermission");
        int i2 = C75671Tmt.LIZIZ[coHostPermission.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = "multi-host";
            } else {
                throw new C162476Zf();
            }
        } else {
            str = LiveGiftNewGifterBadgeSetting.DEFAULT;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "permission_request_count", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, OHQ.LIZ, str, true);
        LJIIJJI();
        LJIIJ(th);
        LJIILLIIL("check_permission_complete");
    }

    public final void LJJIJLIJ(int i, long j, Throwable th) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        LJIIJ(th);
        LJIIJJI();
        LJIILLIIL("decline_apply_failed");
    }

    public final void LJJIL(long j, int i, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("decline_apply_message");
    }

    public final void LJJJ(int i, long j, String logId) {
        o.LJIIIZ(logId, "logId");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        LJIIJJI();
        LJIILLIIL("decline_apply_succeed");
    }

    public final void LJJJIL(long j, int i, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        LJIILLIIL("decline_invite_message");
    }

    public final void LJJJJJL(long j, String source, Throwable th) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        LJIIJJI();
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "source", source, true);
        LJIIJ(th);
        LJIILLIIL("invite_failed");
    }

    public final void LJJJJL(long j, long j2, CR6 cr6) {
        Long l;
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "channel_id", Long.valueOf(j2), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                l = Long.valueOf(commonMessageData.createTime);
            } else {
                l = null;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_create_time", l, true);
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_fetch_time", Long.valueOf(cr6.timestamp), true);
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "is_new_arch", 1, true);
        LJIILLIIL("invite_message");
    }

    public final void LJJJJLI(long j, long j2, CR6 cr6) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
            long j3 = 0;
            if (cr6 instanceof LinkMessage) {
                LinkMessage linkMessage = (LinkMessage) cr6;
                if (linkMessage.LIZ() > 0) {
                    AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "available_time", Long.valueOf(linkMessage.LIZ()), true);
                }
            }
            long j4 = cr6.timestamp;
            CommonMessageData commonMessageData = cr6.baseMessage;
            if (commonMessageData != null) {
                j3 = commonMessageData.createTime;
            }
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "available_time", Long.valueOf(((1000 * j2) + j3) - j4), true);
        }
        LJIILLIIL("invite_popup_show");
    }

    public final void LJJJJZI(long j, String source, String logId) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(logId, "logId");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "client_log_id", C75877TqD.LJIIIZ, true);
        LJIIJJI();
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "source", source, true);
        LJIILLIIL("invite_succeed");
    }

    public final void LJJJLIIL(int i, int i2, long j) {
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "join_type", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIL(this, "post_count", Integer.valueOf(i2));
        AbstractC75865Tq1.LJIIL(this, "sum_delayed_time", Long.valueOf(j));
        LJIILLIIL("join_channel");
    }

    public final void LJJLIIIIJ(long j, int i, CR6 cr6) {
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        LJIILLIIL("accept_apply_click");
    }

    public final void LJJLIIIJ(long j, int i, CR6 cr6) {
        if (cr6 != null) {
            AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "message_id", Long.valueOf(cr6.getMessageId()), true);
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "is_new_arch", 1, true);
        LJIILLIIL("reply_click");
    }

    public final void LJJLIIIJJI(InterfaceC75179Tex window, int i, C75883TqJ c75883TqJ) {
        int i2;
        boolean z;
        o.LJIIIZ(window, "window");
        int i3 = C75671Tmt.LIZJ[window.LJJIL().ordinal()];
        if (i3 != 1) {
            i2 = 2;
            if (i3 != 2 && i3 != 3) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "window_position", Integer.valueOf(window.LJZ()), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "window_uid", Long.valueOf(window.LJJIIJZLJL()), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "window_link_mic_id", window.LJJ(), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "window_state", Integer.valueOf(i2), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "window_count", Integer.valueOf(i), true);
        if (c75883TqJ != null && c75883TqJ.LJFF()) {
            z = true;
        } else {
            z = false;
        }
        if (z && c75883TqJ != null && c75883TqJ.LJJIFFI) {
            AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "is_invited_by_self", 1, true);
        } else {
            AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "is_invited_by_self", 0, true);
        }
        LJIILLIIL("window_changed");
    }

    public final void LJJIZ(long j, long j2, int i, boolean z) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - j2), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "turn_off_this_live", Boolean.valueOf(z), true);
        LJIILLIIL("decline_apply_request");
    }

    public final void LJJJI(int i, long j, long j2, Throwable th) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        LJIIJ(th);
        if (j2 > 0) {
            AbstractC75865Tq1.LJIIL(this, "cost", Long.valueOf(j2 - this.LIZ));
        } else {
            LJIIJJI();
        }
        LJIILLIIL("decline_invite_failed");
    }

    public final void LJJJJ(long j, long j2, int i, boolean z) {
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "decide_duration", Long.valueOf(SystemClock.uptimeMillis() - j2), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "turn_off_this_live", Boolean.valueOf(z), true);
        LJIILLIIL("decline_invite_request");
    }

    public final void LJJJJI(int i, long j, long j2, String logId) {
        o.LJIIIZ(logId, "logId");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "reply_status", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", logId, true);
        if (j2 > 0) {
            AbstractC75865Tq1.LJIIL(this, "cost", Long.valueOf(j2 - this.LIZ));
        } else {
            LJIIJJI();
        }
        LJIILLIIL("decline_invite_succeed");
    }

    public final void LJJJJIZL(int i, int i2, String str, String clientLogId) {
        o.LJIIIZ(clientLogId, "clientLogId");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "log_id", str, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "followed_item_count", Integer.valueOf(i), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "recommend_Item_count", Integer.valueOf(i2), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "client_log_id", clientLogId, true);
        LJIIJJI();
        LJIILLIIL("fetch_rivals_succeed");
    }

    public final void LJJJJZ(long j, String source, String str, boolean z) {
        o.LJIIIZ(source, "source");
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "block_type", str, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "source", source, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "is_cross_arc_active", Integer.valueOf(z ? 1 : 0), true);
        LJIILLIIL("invite_request_block");
    }
}
