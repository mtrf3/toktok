package X;

import Y.AfS52S0300000_13;
import Y.AfS62S0200000_13;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.Pair;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.link.contract.MultiCoHostInviteListContract$AbsView;
import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.BaseMultiHostInviteListFragment;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact.TopicExtraInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFriendListFoldNum;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostFriendListFoldSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTopicEntranceSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import kotlin.jvm.internal.o;

/* renamed from: X.Trp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75977Trp extends AbstractC76019TsV {
    public final DataChannel LJZI;
    public String LJZL;
    public boolean LL;
    public java.util.Map<Long, ? extends RivalExtraInfo> LLD;
    public final C76007TsJ LLF;
    public final C75976Tro LLFF;

    @Override // X.AbstractC76019TsV
    public final void LJIIJ() {
        this.LL = false;
    }

    @Override // X.AbstractC76019TsV
    public final void LJIIJJI() {
        this.LL = true;
    }

    public abstract boolean LJIJJ();

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public void LIZIZ() {
        C76007TsJ c76007TsJ = this.LLF;
        c76007TsJ.LIZLLL();
        c76007TsJ.LJFF = new C75985Trx();
        C75877TqD.LJIIIIZZ = "";
    }

    @Override // X.AbstractC76019TsV
    public final void LJIIL() {
        this.LLF.LIZIZ();
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.business.contract.InteractDialogFragmentBaseContract$AbsPresenter
    public final void onCreate() {
        C76007TsJ c76007TsJ = this.LLF;
        C75976Tro loopCallback = this.LLFF;
        c76007TsJ.getClass();
        o.LJIIIZ(loopCallback, "loopCallback");
        c76007TsJ.LJFF = loopCallback;
    }

    public static String LJIJ() {
        String format = new SimpleDateFormat("yyyyMMddHHmmSSS", Locale.getDefault()).format(Long.valueOf(C30725C4b.LIZ()));
        int nextInt = new Random().nextInt(4095);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(format);
        String LLLZ = C16880lQ.LLLZ("%03X", Arrays.copyOf(new Object[]{Integer.valueOf(nextInt)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        LIZ.append(LLLZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append("CLIENT");
        String logId = X1D.LIZIZ(LIZ2);
        o.LJIIIIZZ(logId, "logId");
        return logId;
    }

    @Override // X.AbstractC76019TsV
    public final void LIZLLL(Room room) {
        o.LJIIIZ(room, "room");
        C75642TmQ.LJIL = 0L;
        C75642TmQ.LJJ = null;
        C75642TmQ.LJJJJJL("active_apply_withdraw", String.valueOf(room.getOwnerUserId()));
        C8E.LIZLLL().LJLIIL(new C75904Tqe(1, room.getId(), room.getOwnerUserId(), C44432HcC.LJIIL(room), "cancelApply", C05040Hs.LIZIZ("cancelApply")), new C75982Tru());
    }

    @Override // X.AbstractC76019TsV
    public final void LJ(Room room) {
        o.LJIIIZ(room, "room");
        C75642TmQ.LJIL = 0L;
        C75642TmQ.LJJ = null;
        C75642TmQ.LJJJJJL("active_invite_withdraw", String.valueOf(room.getOwnerUserId()));
        C8E.LIZLLL().LJLJLJ(new C75904Tqe(0, room.getId(), room.getOwnerUserId(), C44432HcC.LJIIL(room), "cancelInvite", C05040Hs.LIZIZ("cancelInvite")), new C75980Trs());
    }

    @Override // X.AbstractC76019TsV
    public final void LJIILIIL(C75981Trt item) {
        Long l;
        long j;
        o.LJIIIZ(item, "item");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        Long l2 = null;
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        String toAnchorId = String.valueOf(item.LJLIL.getOwnerUserId());
        if (room != null) {
            l2 = Long.valueOf(room.getId());
        }
        String valueOf2 = String.valueOf(l2);
        o.LJIIIZ(toAnchorId, "toAnchorId");
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", valueOf);
        hashMap.put("to_anchor_id", toAnchorId);
        hashMap.put("room_id", valueOf2);
        BZI LIZ = C28787BRn.LIZ("livesdk_connection_reservation_click");
        LIZ.LJJIFFI(hashMap);
        LIZ.LJJIIJZLJL();
        C65814PsI.LIZ().getClass();
        CoHostApi coHostApi = (CoHostApi) C65814PsI.LIZJ(CoHostApi.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        ((InterfaceC29856Bng) C1EW.LIZ(coHostApi.reserve(j, item.LJLIL.getId(), item.LJLIL.getOwnerUserId())).LIZJ(LIZ())).LIZJ(new AfS52S0300000_13(room, item, this, 11), new AfS62S0200000_13(this, item, 68));
    }

    public final Pair<Boolean, Integer> LJIJI(List<? extends Room> inviteList) {
        o.LJIIIZ(inviteList, "inviteList");
        if (!LiveCohostFriendListFoldSetting.INSTANCE.getValue()) {
            int size = inviteList.size();
            Iterator<? extends Room> it = inviteList.iterator();
            int i = 0;
            while (it.hasNext()) {
                RivalExtraInfo rivalExtraInfo = (RivalExtraInfo) C279417u.LIZ(it.next(), this.LLD);
                if (rivalExtraInfo == null || C78596Usy.LJIIIZ(rivalExtraInfo)) {
                    i++;
                }
            }
            if (i <= 3) {
                if (size <= 3) {
                    return new Pair<>(Boolean.FALSE, Integer.valueOf(size));
                }
                return new Pair<>(Boolean.TRUE, 3);
            }
            if (i < size) {
                return new Pair<>(Boolean.TRUE, Integer.valueOf(i));
            }
            return new Pair<>(Boolean.FALSE, Integer.valueOf(i));
        }
        int size2 = inviteList.size();
        LiveCohostFriendListFoldNum liveCohostFriendListFoldNum = LiveCohostFriendListFoldNum.INSTANCE;
        int value = liveCohostFriendListFoldNum.getValue();
        if (size2 <= liveCohostFriendListFoldNum.getValue()) {
            return new Pair<>(Boolean.FALSE, Integer.valueOf(value));
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(value));
    }

    public AbstractC75977Trp(BaseMultiHostInviteListFragment baseMultiHostInviteListFragment, DataChannel dataChannel) {
        super(baseMultiHostInviteListFragment);
        this.LJZI = dataChannel;
        this.LJZL = "";
        this.LLD = C113554cx.LJJJLIIL();
        this.LLF = new C76007TsJ();
        this.LLFF = new C75976Tro(this);
    }

    public final void LJIJJLI(CohostTopic cohostTopic, TopicExtraInfo topicExtraInfo) {
        Long l;
        Drawable LIZ;
        long j;
        String str;
        long j2;
        long j3;
        List arrayList;
        long j4;
        boolean z;
        long j5;
        List arrayList2;
        long j6;
        Long l2;
        int i;
        Long l3;
        Long l4;
        Long l5;
        if (cohostTopic == null || !C29306Beo.LJIJJLI(C86881Y7x.LIZIZ().LIZ(cohostTopic.titleKey))) {
            return;
        }
        HashMap hashMap = new HashMap();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        hashMap.put("anchor_id", String.valueOf(l));
        AnonymousClass172.LIZ("livesdk_connection_list_topic_banner_show", hashMap);
        C75633TmH.LJI = true;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int LIZ2 = C15380j0.LIZ(12.0f);
        spannableStringBuilder.append((CharSequence) C15380j0.LJIILJJIL(R.string.ona)).append((CharSequence) "  ");
        if (!C15380j0.LJIIZILJ()) {
            LIZ = C15400j2.LIZ(R.drawable.d45);
        } else {
            LIZ = C15400j2.LIZ(R.drawable.d49);
        }
        if (LIZ != null) {
            LIZ.setBounds(0, 0, LIZ2, LIZ2);
            spannableStringBuilder.setSpan(new ImageSpan(LIZ, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        CJ2 cj2 = this.LJLLILLLL;
        if (cohostTopic != null) {
            j = cohostTopic.id;
        } else {
            j = 0;
        }
        C86881Y7x LIZIZ = C86881Y7x.LIZIZ();
        if (cohostTopic != null) {
            str = cohostTopic.titleKey;
        } else {
            str = null;
        }
        String LIZ3 = LIZIZ.LIZ(str);
        if (LIZ3 == null) {
            LIZ3 = "";
        }
        if (topicExtraInfo != null) {
            j2 = topicExtraInfo.startTimeSec;
            j3 = topicExtraInfo.endTimeSec;
        } else {
            j2 = 0;
            j3 = 0;
        }
        if (cohostTopic == null || (arrayList = cohostTopic.rivalsAvatar) == null) {
            arrayList = new ArrayList();
        }
        if (cohostTopic != null) {
            j4 = cohostTopic.totalRivals;
        } else {
            j4 = 0;
        }
        if (cohostTopic != null) {
            z = cohostTopic.liked;
            j5 = cohostTopic.totalHeat;
        } else {
            z = false;
            j5 = 0;
        }
        if (topicExtraInfo == null || (arrayList2 = topicExtraInfo.allRivalsAvatar) == null) {
            arrayList2 = new ArrayList();
        }
        if (topicExtraInfo != null) {
            j6 = topicExtraInfo.allRivals;
        } else {
            j6 = 0;
        }
        cj2.add(new C76149Tub(j, LIZ3, spannableStringBuilder, j2, j3, arrayList, j4, z, j5, arrayList2, j6));
        Integer value = LiveCoHostTopicEntranceSetting.INSTANCE.getValue();
        if (value == null || value.intValue() != 2) {
            return;
        }
        HashMap hashMap2 = new HashMap();
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        hashMap2.put("anchor_id", String.valueOf(l2));
        if (cohostTopic != null && cohostTopic.liked) {
            i = 1;
        } else {
            i = 0;
        }
        BZI LIZ4 = C28787BRn.LIZ("livesdk_connection_topic_pairing_icon_show");
        LIZ4.LJIJJ(Integer.valueOf(i), "like_status");
        LIZ4.LJIJJ(1, "topic_page_level");
        LIZ4.LJIJJ(Boolean.TRUE, "is_default_topic");
        if (cohostTopic != null) {
            l3 = Long.valueOf(cohostTopic.totalRivals);
        } else {
            l3 = null;
        }
        LIZ4.LJIJJ(l3, "topic_achor_cnt");
        if (cohostTopic != null) {
            l4 = Long.valueOf(cohostTopic.id);
        } else {
            l4 = null;
        }
        LIZ4.LJIJJ(l4, "topic_id");
        if (cohostTopic != null) {
            l5 = Long.valueOf(cohostTopic.totalHeat);
        } else {
            l5 = null;
        }
        LIZ4.LJIJJ(l5, "topic_hot");
        LIZ4.LJJIFFI(hashMap2);
        LIZ4.LJJIIJZLJL();
    }

    @Override // X.AbstractC76019TsV
    public final void LIZJ(C75981Trt item, EnumC75614Tly inviteType, boolean z) {
        String str;
        LinkerInfo linkerInfo;
        CohostTopic cohostTopic;
        RivalExtraInfo.Tag tag;
        RivalExtraInfo.Tag tag2;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(inviteType, "inviteType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("apply, cancelInvite = ");
        LIZ.append(z);
        C0NB.LJIIIZ("BaseMultiCoHostInviteListPresenter", X1D.LIZIZ(LIZ));
        int i = 0;
        if (z) {
            C8E.LIZLLL().LJJZZIII(false);
        }
        Room room = item.LJLIL;
        HashMap hashMap = new HashMap();
        User owner = room.getOwner();
        o.LJIIIIZZ(owner, "targetRoom.owner");
        hashMap.put("user_info", C44432HcC.LJIILL(owner));
        hashMap.put("request_id", this.LJZL);
        hashMap.put("source_type", Integer.valueOf(inviteType.getType()));
        hashMap.put("need_withdraw", Boolean.valueOf(z));
        RivalExtraInfo rivalExtraInfo = item.LJLJJI;
        if (rivalExtraInfo != null && (tag2 = rivalExtraInfo.tag) != null) {
            i = tag2.tagType;
        }
        hashMap.put("tag_type", Integer.valueOf(i));
        RivalExtraInfo rivalExtraInfo2 = item.LJLJJI;
        if (rivalExtraInfo2 == null || (tag = rivalExtraInfo2.tag) == null || (str = tag.tagValue) == null) {
            str = "";
        }
        hashMap.put("tag_value", str);
        hashMap.put("check_perception_center", Boolean.TRUE);
        hashMap.put("click_source", C75545Tkr.LIZIZ(item.LJLJI));
        hashMap.put("webcast_sdk_version", Long.valueOf(room.getHostWebcastSdkVersion()));
        long ownerUserId = room.getOwnerUserId();
        RivalExtraInfo rivalExtraInfo3 = item.LJLJJI;
        if (rivalExtraInfo3 != null) {
            linkerInfo = rivalExtraInfo3.linkerInfo;
        } else {
            linkerInfo = null;
        }
        C75642TmQ.LJIL = ownerUserId;
        C75642TmQ.LJJ = linkerInfo;
        RoomLinkInfo linkMicInfo = item.LJLIL.getLinkMicInfo();
        if (linkMicInfo != null) {
            cohostTopic = linkMicInfo.topicInfo;
        } else {
            cohostTopic = null;
        }
        C75642TmQ.LJJJJLL(room, "apply", rivalExtraInfo3, null, null, cohostTopic, 80);
        C8E.LIZLLL().LLILL(new C75759ToJ(1, room.getId(), room.getOwnerUserId(), C44432HcC.LJIIL(room), C44432HcC.LJIIJJI(room), MtCoHostInviteTimeOutSetting.INSTANCE.getValue(), room, hashMap, null, C05040Hs.LIZIZ("apply"), 256), new C75979Trr(room, item, this));
    }

    @Override // X.AbstractC76019TsV
    public final void LJIIIIZZ(C75981Trt item, EnumC75614Tly inviteType, boolean z) {
        String str;
        LinkerInfo linkerInfo;
        RivalExtraInfo.Tag tag;
        RivalExtraInfo.Tag tag2;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(inviteType, "inviteType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("invite, cancelApply = ");
        LIZ.append(z);
        C0NB.LJIIIZ("BaseMultiCoHostInviteListPresenter", X1D.LIZIZ(LIZ));
        if (z) {
            C8E.LIZLLL().LJJZZIII(true);
        }
        Room room = item.LJLIL;
        HashMap hashMap = new HashMap();
        hashMap.put("vendor", 12);
        String secUid = room.getOwner().getSecUid();
        o.LJIIIIZZ(secUid, "targetRoom.owner.secUid");
        hashMap.put("sec_to_user_id", secUid);
        hashMap.put("invite_type", Integer.valueOf(this.LJLJI.LJIIJ.getType()));
        int i = 0;
        hashMap.put("match_type", 0);
        User owner = room.getOwner();
        o.LJIIIIZZ(owner, "targetRoom.owner");
        hashMap.put("user_info", C44432HcC.LJIILL(owner));
        hashMap.put("request_id", this.LJZL);
        hashMap.put("need_withdraw", Boolean.valueOf(z));
        RivalExtraInfo rivalExtraInfo = item.LJLJJI;
        if (rivalExtraInfo != null && (tag2 = rivalExtraInfo.tag) != null) {
            i = tag2.tagType;
        }
        hashMap.put("tag_type", Integer.valueOf(i));
        RivalExtraInfo rivalExtraInfo2 = item.LJLJJI;
        CohostTopic cohostTopic = null;
        if (rivalExtraInfo2 == null || (tag = rivalExtraInfo2.tag) == null || (str = tag.tagValue) == null) {
            str = "";
        }
        hashMap.put("tag_value", str);
        hashMap.put("check_perception_center", Boolean.TRUE);
        hashMap.put("click_source", C75545Tkr.LIZIZ(item.LJLJI));
        hashMap.put("webcast_sdk_version", Long.valueOf(room.getHostWebcastSdkVersion()));
        long ownerUserId = room.getOwnerUserId();
        RivalExtraInfo rivalExtraInfo3 = item.LJLJJI;
        if (rivalExtraInfo3 != null) {
            linkerInfo = rivalExtraInfo3.linkerInfo;
        } else {
            linkerInfo = null;
        }
        C75642TmQ.LJIL = ownerUserId;
        C75642TmQ.LJJ = linkerInfo;
        CohostTopic cohostTopic2 = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
        if (cohostTopic2 == null) {
            RoomLinkInfo linkMicInfo = item.LJLIL.getLinkMicInfo();
            if (linkMicInfo != null) {
                cohostTopic = linkMicInfo.topicInfo;
            }
        } else {
            cohostTopic = cohostTopic2;
        }
        C75642TmQ.LJJJJLL(room, "invite", rivalExtraInfo3, null, null, cohostTopic, 80);
        C8E.LIZLLL().LLJI(new C75759ToJ(room.getId(), room.getOwnerUserId(), C44432HcC.LJIIL(room), C44432HcC.LJIIJJI(room), MtCoHostInviteTimeOutSetting.INSTANCE.getValue(), room, hashMap, "invite", C05040Hs.LIZIZ("invite")), new C75978Trq(room, item, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0044, code lost:
    
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(com.bytedance.android.livesdkapi.depend.model.live.Room r18, int r19, java.lang.Throwable r20) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC75977Trp.LJIIZILJ(com.bytedance.android.livesdkapi.depend.model.live.Room, int, java.lang.Throwable):void");
    }

    public final void LJIL(int i, int i2, int i3, long j) {
        Iterator<Object> it = this.LJLLILLLL.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof C75981Trt) && ((C75981Trt) next).LJLIL.getId() == j) {
                if (next == null || !(next instanceof C75981Trt)) {
                    return;
                }
                int indexOf = this.LJLLILLLL.indexOf(next);
                StringBuilder LJ = C7MY.LJ("onInviteFailed update item pos = ", indexOf, " nickname = ");
                C75981Trt c75981Trt = (C75981Trt) next;
                LJ.append(C05170If.LJ(c75981Trt.LJLIL.getOwner()));
                C0NB.LJIIIZ("BaseMultiCoHostInviteListPresenter", X1D.LIZIZ(LJ));
                RivalExtraInfo rivalExtraInfo = c75981Trt.LJLJJI;
                if (rivalExtraInfo != null) {
                    rivalExtraInfo.showPlayType = i;
                    C78596Usy.LJJJLZIJ(rivalExtraInfo, i2, i3);
                }
                MultiCoHostInviteListContract$AbsView multiCoHostInviteListContract$AbsView = (MultiCoHostInviteListContract$AbsView) this.LJLILLLLZI;
                if (multiCoHostInviteListContract$AbsView == null) {
                    return;
                }
                multiCoHostInviteListContract$AbsView.Jl(indexOf);
                return;
            }
        }
    }
}
