package Y;

import X.AbstractC73672Svk;
import X.AbstractC74705TTp;
import X.C05630Jz;
import X.C0NB;
import X.C188727au;
import X.C26227ARb;
import X.C28467BFf;
import X.C60903NvH;
import X.C67630QgU;
import X.C73411SrX;
import X.C73969T1h;
import X.C74710TTu;
import X.C74715TTz;
import X.C74746TVe;
import X.C74824TYe;
import X.C74837TYr;
import X.C74838TYs;
import X.C74947TbD;
import X.C74996Tc0;
import X.C75505TkD;
import X.C75525TkX;
import X.C75536Tki;
import X.C76800UCe;
import X.C77334UWs;
import X.C77335UWt;
import X.EnumC75004Tc8;
import X.EnumC75445TjF;
import X.EnumC76739U9v;
import X.FMX;
import X.FT5;
import X.InterfaceC60987Nwd;
import X.InterfaceC64592gB;
import X.InterfaceC75014TcI;
import X.InterfaceC88472Yns;
import X.T16;
import X.TS8;
import X.TTV;
import X.TV2;
import X.TYR;
import X.U4R;
import X.U6Y;
import X.U7F;
import X.U9X;
import X.UC0;
import X.X1D;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveChannelData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkFinishReason;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkerListChangeContent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS54S1200000_13;
import kotlin.jvm.internal.AqS80S1100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class AfS22S1200000_13 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 4:
                accept$4(this, obj);
                return;
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        MultiLiveGuestInfoList multiLiveGuestInfoList;
        boolean z;
        long j;
        Long l;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null && (multiLiveGuestInfoList = (MultiLiveGuestInfoList) baseResponse.data) != null) {
            AbstractC74705TTp abstractC74705TTp = (AbstractC74705TTp) afS22S1200000_13.l1;
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) afS22S1200000_13.l2;
            String source = afS22S1200000_13.s0;
            C74710TTu c74710TTu = (C74710TTu) abstractC74705TTp;
            c74710TTu.LJII().LJI(multiLiveGuestInfoList);
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(c74710TTu.LJII());
            }
            o.LJIIIZ(source, "source");
            c74710TTu.LJIIIZ().LJII(true);
            LinkMessage linkMessage = new LinkMessage();
            LinkerListChangeContent linkerListChangeContent = new LinkerListChangeContent();
            linkMessage.mListChangeContent = linkerListChangeContent;
            ArrayList<LinkPlayerInfo> arrayList = multiLiveGuestInfoList.onLineUsers;
            o.LJIIIIZZ(arrayList, "result.onLineUsers");
            Iterator<LinkPlayerInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                LinkPlayerInfo it2 = it.next();
                List<LinkListUser> list = linkerListChangeContent.onLineUsers;
                o.LJIIIIZZ(it2, "it");
                list.add(TV2.LIZIZ(it2));
            }
            ArrayList<LinkPlayerInfo> arrayList2 = multiLiveGuestInfoList.waitingUsers;
            o.LJIIIIZZ(arrayList2, "result.waitingUsers");
            Iterator<LinkPlayerInfo> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                LinkPlayerInfo it4 = it3.next();
                List<LinkListUser> list2 = linkerListChangeContent.waitingUsers;
                o.LJIIIIZZ(it4, "it");
                list2.add(TV2.LIZIZ(it4));
            }
            c74710TTu.LJIIIZ().LJI(linkMessage);
            ArrayList arrayList3 = new ArrayList();
            for (LinkPlayerInfo linkPlayerInfo : c74710TTu.LJII().LIZLLL()) {
                long id = linkPlayerInfo.mUser.getId();
                String str = linkPlayerInfo.mInteractIdStr;
                o.LJIIIIZZ(str, "it.interactId");
                arrayList3.add(new C74715TTz(id, str, linkPlayerInfo.LIZ));
            }
            if (!TextUtils.isEmpty(source)) {
                JSONObject LIZLLL = FT5.LIZLLL("source", source);
                C05630Jz.LJI(LIZLLL, "user_list", arrayList3.toString());
                C74837TYr.LJIIIZ(true, "refresh_user_list", LIZLLL);
                List<LinkPlayerInfo> response = c74710TTu.LJII().LIZLLL();
                o.LJIIIZ(response, "response");
                JSONObject jSONObject = new JSONObject();
                C05630Jz.LJI(jSONObject, "response", response.toString());
                C05630Jz.LJFF(jSONObject, "cost", System.currentTimeMillis() - C74837TYr.LIZ);
                C74837TYr.LJIIIZ(true, "list_succeed", jSONObject);
                ((HashSet) C74838TYs.LJ().LJIL).clear();
                C74838TYs LJ = C74838TYs.LJ();
                if (C60903NvH.LJIILLIIL(c74710TTu.LJII()) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                LJ.LJIIIIZZ(z);
                C74838TYs.LJ().LJJ = C60903NvH.LJIILLIIL(c74710TTu.LJII());
                TTV.LIZ().LJIIJJI = C60903NvH.LJIILLIIL(c74710TTu.LJII());
                for (LinkPlayerInfo linkPlayerInfo2 : c74710TTu.LJII().LIZLLL()) {
                    TYR tyr = TS8.LIZ;
                    User user = linkPlayerInfo2.mUser;
                    if (user != null) {
                        j = user.getId();
                    } else {
                        j = 0;
                    }
                    tyr.LJ(j, linkPlayerInfo2.mInteractIdStr);
                    int i = linkPlayerInfo2.LIZ;
                    if (i == 2 || (i == 1 && linkPlayerInfo2.mRoleType == 4)) {
                        Set<Long> set = C74838TYs.LJ().LJIL;
                        User user2 = linkPlayerInfo2.mUser;
                        if (user2 != null) {
                            l = Long.valueOf(user2.getId());
                        } else {
                            l = null;
                        }
                        ((HashSet) set).add(l);
                    }
                    if (linkPlayerInfo2.mRoleType == 1) {
                        C74838TYs.LJ().LJIILIIL = linkPlayerInfo2.mInteractIdStr;
                    }
                }
                if (TextUtils.equals(source, "message_linked_list_change")) {
                    c74710TTu.LJI(4);
                } else {
                    c74710TTu.LJI(1);
                }
                boolean equals = TextUtils.equals(source, "enter_room");
                if (equals && C74838TYs.LJ().LJJ > 0) {
                    C74746TVe.LIZLLL("live_play");
                }
                c74710TTu.LJIIJ(equals);
            } else {
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        ((AbstractC74705TTp) afS22S1200000_13.l1).LJLJL = null;
    }

    public static final void accept$1(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            C77334UWs c77334UWs = (C77334UWs) afS22S1200000_13.l1;
            Activity activity = (Activity) afS22S1200000_13.l2;
            String str = afS22S1200000_13.s0;
            c77334UWs.getClass();
            if (C67630QgU.LIZ().getInt("show_storage_manager_count", 0) >= 3 || activity.isFinishing()) {
                return;
            }
            C67630QgU.LIZ().storeInt("show_storage_manager_count", C67630QgU.LIZ().getInt("show_storage_manager_count", 0) + 1);
            C26227ARb c26227ARb = new C26227ARb(activity);
            c26227ARb.LJ(R.string.hzz);
            c26227ARb.LIZ(R.string.gmc);
            UC0.LIZJ(c26227ARb, new AqS54S1200000_13(activity, c77334UWs, str, 6));
            c26227ARb.LJII = false;
            c26227ARb.LJI().LIZLLL();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("toast_type", "clean_app");
            FMX.LJIIL("storage_toast_show", c188727au.LIZ);
            C77334UWs.LIZ(c77334UWs, null, str, "app_storage", 1);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", str);
            c188727au2.LJIIIZ("type", "app_storage");
            FMX.LJIIL("clean_storage_toast", c188727au2.LIZ);
            return;
        }
        if (num.intValue() != 2) {
            return;
        }
        C77334UWs c77334UWs2 = (C77334UWs) afS22S1200000_13.l1;
        Activity activity2 = (Activity) afS22S1200000_13.l2;
        String str2 = afS22S1200000_13.s0;
        c77334UWs2.getClass();
        if (C67630QgU.LIZ().getInt("show_system_clean_count", 0) >= 3 || activity2.isFinishing()) {
            return;
        }
        C67630QgU.LIZ().storeInt("show_system_clean_count", C67630QgU.LIZ().getInt("show_system_clean_count", 0) + 1);
        C26227ARb c26227ARb2 = new C26227ARb(activity2);
        c26227ARb2.LJFF(activity2.getString(R.string.hzz));
        c26227ARb2.LIZ(R.string.gmd);
        UC0.LIZJ(c26227ARb2, C77335UWt.LJLIL);
        c26227ARb2.LJII = false;
        c26227ARb2.LJI().LIZLLL();
        C188727au c188727au3 = new C188727au();
        c188727au3.LJIIIZ("toast_type", "clean_system");
        FMX.LJIIL("storage_toast_show", c188727au3.LIZ);
        C77334UWs.LIZ(c77334UWs2, null, str2, "phone_storage", 1);
        C188727au c188727au4 = new C188727au();
        c188727au4.LJIIIZ("enter_from", str2);
        c188727au4.LJIIIZ("type", "phone_storage");
        FMX.LJIIL("clean_storage_toast", c188727au4.LIZ);
    }

    public static final void accept$2(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        ((C74996Tc0) afS22S1200000_13.l1).LJIIIIZZ((Throwable) obj, (InterfaceC75014TcI) afS22S1200000_13.l2, afS22S1200000_13.s0, EnumC75004Tc8.E_C_DEFAULT.ordinal(), null);
    }

    public static final void accept$3(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        C28467BFf it = (C28467BFf) obj;
        o.LJIIIIZZ(it, "it");
        if (C74947TbD.LJIJI(it)) {
            InterfaceC75014TcI interfaceC75014TcI = (InterfaceC75014TcI) afS22S1200000_13.l1;
            if (interfaceC75014TcI != null) {
                interfaceC75014TcI.LIZIZ(afS22S1200000_13.s0);
            }
            C74824TYe.LIZ.LJJI(2, "cancel_enlarge");
            return;
        }
        ((C74996Tc0) afS22S1200000_13.l2).LJIIIIZZ(null, (InterfaceC75014TcI) afS22S1200000_13.l1, afS22S1200000_13.s0, it.statusCode, it.LJ.message);
    }

    public static final void accept$4(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        ((C74996Tc0) afS22S1200000_13.l1).LJIIIIZZ((Throwable) obj, (InterfaceC75014TcI) afS22S1200000_13.l2, afS22S1200000_13.s0, EnumC75004Tc8.E_C_DEFAULT.ordinal(), null);
    }

    public static final void accept$5(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        ((C74996Tc0) afS22S1200000_13.l1).LJIIIIZZ((Throwable) obj, (InterfaceC75014TcI) afS22S1200000_13.l2, afS22S1200000_13.s0, EnumC75004Tc8.E_C_DEFAULT.ordinal(), null);
    }

    public static final void accept$6(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        ((C74996Tc0) afS22S1200000_13.l1).LJIIIIZZ((Throwable) obj, (InterfaceC75014TcI) afS22S1200000_13.l2, afS22S1200000_13.s0, EnumC75004Tc8.E_C_DEFAULT.ordinal(), null);
    }

    public static final void accept$7(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("noFirstFrameRenderTimeoutCountdown finish linkMicId:");
        LIZ.append(afS22S1200000_13.s0);
        LIZ.append(", currentState:");
        LIZ.append(((U7F) afS22S1200000_13.l1).LJIILLIIL.LIZ);
        U4R.LIZLLL("CoLinker", X1D.LIZIZ(LIZ));
        ((U7F) afS22S1200000_13.l1).LJJJ(afS22S1200000_13.s0);
        if (o.LJ(((LinkedHashMap) ((U7F) afS22S1200000_13.l1).LJJ).get(afS22S1200000_13.s0), Boolean.TRUE)) {
            ((U7F) afS22S1200000_13.l1).LJJ.put(afS22S1200000_13.s0, Boolean.FALSE);
            return;
        }
        U9X u9x = (U9X) afS22S1200000_13.l2;
        if (u9x == U9X.KICKOUT) {
            U7F u7f = (U7F) afS22S1200000_13.l1;
            u7f.LJIJ.LJIIJ(afS22S1200000_13.s0, u7f, true, -1L, -1L, "");
            ((U7F) afS22S1200000_13.l1).i(afS22S1200000_13.s0, 1L, EnumC76739U9v.KICKOUT_RTC_STREAM_TIMEOUT);
        } else if (u9x == U9X.LEAVE) {
            U7F u7f2 = (U7F) afS22S1200000_13.l1;
            u7f2.LJIJ.LJIIJ(afS22S1200000_13.s0, u7f2, true, -1L, -1L, "");
            U7F u7f3 = (U7F) afS22S1200000_13.l1;
            String str = afS22S1200000_13.s0;
            LeaveChannelData.Builder builder = new LeaveChannelData.Builder();
            builder.setNotSuggestToUid(0L);
            builder.setLeaveSource(LinkFinishReason.Companion.stateToString(6));
            builder.setLeaveReason(6);
            builder.setLeavedLinkMicId(str);
            u7f3.LLLZZ(builder.build(), null);
        }
        CopyOnWriteArrayList<U6Y> copyOnWriteArrayList = ((U7F) afS22S1200000_13.l1).LJIIZILJ;
        String str2 = afS22S1200000_13.s0;
        Iterator<U6Y> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJJJJJL(str2);
        }
    }

    public static final void accept$8(AfS22S1200000_13 afS22S1200000_13, Object obj) {
        C75536Tki c75536Tki;
        C73411SrX c73411SrX = ((C75525TkX) afS22S1200000_13.l1).LLF;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        if (((EnumC75445TjF) afS22S1200000_13.l2) == EnumC75445TjF.FRIEND_LIVING) {
            DataChannel dataChannel = ((C75525TkX) afS22S1200000_13.l1).LLD;
            if (dataChannel != null && (c75536Tki = (C75536Tki) dataChannel.kv0(C75505TkD.class)) != null) {
                c75536Tki.LJLJI = false;
            }
            C73411SrX c73411SrX2 = ((C75525TkX) afS22S1200000_13.l1).LLFF;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            ((C75525TkX) afS22S1200000_13.l1).LLFF = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(20L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS26S1100000_13((C75525TkX) afS22S1200000_13.l1, afS22S1200000_13.s0, 14));
            CoHostFriendNoticeService coHostFriendNoticeService = ((C75525TkX) afS22S1200000_13.l1).LLIFFJFJJ;
            String logId = afS22S1200000_13.s0;
            coHostFriendNoticeService.getClass();
            o.LJIIIZ(logId, "logId");
            C0NB.LIZIZ("CoHostFriendNoticeService", "onCoHostFriendNoticeDismiss");
            CoHostFriendNoticeService.LIZ(coHostFriendNoticeService, new AqS80S1100000_13(coHostFriendNoticeService, logId, 4), null, 5);
        }
    }

    public AfS22S1200000_13(Activity activity, C77334UWs c77334UWs, int i) {
        this.$t = i;
        this.l1 = c77334UWs;
        this.l2 = activity;
        this.s0 = "cold_start";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS22S1200000_13(X.C74996Tc0 r2, X.InterfaceC75014TcI r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 2: goto L10;
                case 3: goto L5;
                case 4: goto L10;
                case 5: goto L10;
                case 6: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r4
            r0.l2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r2
            r0.l2 = r3
            r0.s0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS22S1200000_13.<init>(X.Tc0, X.TcI, java.lang.String, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS22S1200000_13(Object obj, AbstractC74705TTp abstractC74705TTp, InterfaceC88472Yns<? super InterfaceC60987Nwd<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe> interfaceC88472Yns, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = abstractC74705TTp;
        this.s0 = interfaceC88472Yns;
    }
}
