package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass629;
import X.C0NB;
import X.C15610jN;
import X.C19U;
import X.C28272B7s;
import X.C29556Biq;
import X.C29S;
import X.C31012CFc;
import X.C32264ClQ;
import X.C32437CoD;
import X.C32438CoE;
import X.C32444CoK;
import X.C32448CoO;
import X.C32449CoP;
import X.C32802Cu6;
import X.C32807CuB;
import X.C32816CuK;
import X.C38238Eza;
import X.C51029K0z;
import X.C60825Nu1;
import X.C61878OQg;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73444Ss4;
import X.C73470SsU;
import X.C73543Stf;
import X.C73653SvR;
import X.C73969T1h;
import X.C74983Tbn;
import X.C75516TkO;
import X.C75642TmQ;
import X.C75750ToA;
import X.C75752ToC;
import X.C75759ToJ;
import X.C75951TrP;
import X.C75952TrQ;
import X.C75981Trt;
import X.C76129TuH;
import X.C76588U4a;
import X.C76677U7l;
import X.C76683U7r;
import X.C76689U7x;
import X.C76690U7y;
import X.C76766UAw;
import X.C76800UCe;
import X.C76857UEj;
import X.C76906UGg;
import X.C76930UHe;
import X.C77380UYm;
import X.C77453UaX;
import X.C77544Uc0;
import X.C77545Uc1;
import X.C78159Ulv;
import X.C78160Ulw;
import X.C78161Ulx;
import X.C78163Ulz;
import X.C78181UmH;
import X.C78184UmK;
import X.C78185UmL;
import X.C78187UmN;
import X.C78192UmS;
import X.C78194UmU;
import X.C78197UmX;
import X.C78200Uma;
import X.C78215Ump;
import X.C78216Umq;
import X.C78217Umr;
import X.C78218Ums;
import X.C78219Umt;
import X.C78223Umx;
import X.C78239UnD;
import X.C78240UnE;
import X.C79259V8t;
import X.C88559YpH;
import X.C8E;
import X.EnumC75614Tly;
import X.EnumC78220Umu;
import X.InterfaceC65784Pro;
import X.InterfaceC75441TjB;
import X.InterfaceC75754ToE;
import X.InterfaceC75959TrX;
import X.InterfaceC75963Trb;
import X.InterfaceC75964Trc;
import X.InterfaceC76622U5i;
import X.InterfaceC76675U7j;
import X.InterfaceC76688U7w;
import X.InterfaceC76768UAy;
import X.InterfaceC76931UHf;
import X.InterfaceC77384UYq;
import X.InterfaceC78172Um8;
import X.InterfaceC78206Umg;
import X.InterfaceC78213Umn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.O93;
import X.O97;
import X.O98;
import X.O99;
import X.ORS;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.Q7L;
import X.R2P;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T16;
import X.U4R;
import X.U4U;
import X.U4V;
import X.U4Z;
import X.U52;
import X.U7A;
import X.U7B;
import X.U7T;
import X.U7V;
import X.U7Z;
import X.U87;
import X.UC0;
import X.X1D;
import Y.ARunnableS0S3100700_13;
import Y.ARunnableS0S3101300_13;
import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.AfS0S0210100_13;
import Y.AfS0S0210200_13;
import Y.AfS3S0200100_13;
import Y.AfS52S0300000_13;
import Y.AfS65S0100000_13;
import Y.IDaS161S0200000_13;
import Y.IDaS222S0100000_13;
import Y.IDaS8S1100000_13;
import Y.IDhS27S0300000_13;
import Y.IDhS5S0400000_13;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.platform.common.monitor.MultiGuestSeiAbnormalDetector;
import com.bytedance.android.live.wallet.viewmodel.exchange.ABLiveIncomeExchangeDialogVM;
import com.bytedance.android.live.wallet.viewmodel.exchange.UGExchangeDialogVM;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelResponse;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.impl.linkcore.api.LinkMicApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostPermitGroupWhenGroupChannelEmptyBugFixSetting;
import com.bytedance.android.livesdk.model.message.linkcore.JoinChannelResp;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.gift.render.model.Effect;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import ql1.IDbS499S0100000_13;
import tikcast.linkmic.common.GroupPlayer;
import tikcast.linkmic.controller.JoinGroupReq;
import tikcast.linkmic.controller.PermitJoinGroupReq;

/* loaded from: classes14.dex */
public class AqS102S0300000_13 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS102S0300000_13 aqS102S0300000_13) {
        InterfaceC88471Ynr<? super DownloadInfo, ? super BaseException, C76800UCe> interfaceC88471Ynr = ((C79259V8t) aqS102S0300000_13.l0).LJLJJI;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke((DownloadInfo) aqS102S0300000_13.l1, (BaseException) aqS102S0300000_13.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS102S0300000_13 aqS102S0300000_13) {
        CopyOnWriteArrayList<U87> copyOnWriteArrayList = ((U7Z) aqS102S0300000_13.l0).LJIIZILJ;
        List<LinkUser> list = (List) aqS102S0300000_13.l1;
        List<LinkUser> list2 = (List) aqS102S0300000_13.l2;
        Iterator<U87> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJIIIIZZ(list, list2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS102S0300000_13 aqS102S0300000_13) {
        Context context = (Context) aqS102S0300000_13.l0;
        C77544Uc0 c77544Uc0 = (C77544Uc0) aqS102S0300000_13.l1;
        return new UGExchangeDialogVM(context, c77544Uc0, (C77453UaX) aqS102S0300000_13.l2, c77544Uc0.LJII);
    }

    public static final Object invoke$11(AqS102S0300000_13 aqS102S0300000_13) {
        long j;
        boolean z;
        StringBuilder LIZJ = b1.LIZJ("permit apply group", " dealing data=");
        LIZJ.append((C75951TrP) aqS102S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        Long LIZLLL = ((U7T) aqS102S0300000_13.l1).LJIIJJI.LIZLLL(((C75951TrP) aqS102S0300000_13.l0).LJLILLLLZI);
        if (MtCoHostPermitGroupWhenGroupChannelEmptyBugFixSetting.isEnable() && LIZLLL == null) {
            C15610jN.LIZ().post(new ARunnableS49S0100000_13((InterfaceC76768UAy) aqS102S0300000_13.l2, 169));
        } else {
            long LIZIZ = C31012CFc.LIZIZ();
            String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
            ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ.add(LIZ);
            U7T u7t = (U7T) aqS102S0300000_13.l1;
            Room room = u7t.LJ;
            if (room != null) {
                room.getId();
            }
            String str = ((U7T) aqS102S0300000_13.l1).LJJI;
            long j2 = ((C75951TrP) aqS102S0300000_13.l0).LJLILLLLZI;
            long currentTimeMillis = System.currentTimeMillis();
            C75951TrP c75951TrP = (C75951TrP) aqS102S0300000_13.l0;
            String source = c75951TrP.LJLJJLL;
            int i = c75951TrP.LJLJJI;
            o.LJIIIZ(source, "source");
            UC0.LJJLIIIIJ(new ARunnableS0S3101300_13(u7t, j2, i, LIZIZ, currentTimeMillis, str, source, 0));
            long LIZIZ2 = C31012CFc.LIZIZ();
            Player player = new Player(0L, 0L, 3, null);
            C75951TrP c75951TrP2 = (C75951TrP) aqS102S0300000_13.l0;
            player.roomId = c75951TrP2.LJLIL;
            player.uid = c75951TrP2.LJLILLLLZI;
            GroupPlayer groupPlayer = new GroupPlayer();
            groupPlayer.channelId = ((C75951TrP) aqS102S0300000_13.l0).LJLJI;
            groupPlayer.user = player;
            PermitJoinGroupReq permitJoinGroupReq = new PermitJoinGroupReq();
            U7T u7t2 = (U7T) aqS102S0300000_13.l1;
            C75951TrP c75951TrP3 = (C75951TrP) aqS102S0300000_13.l0;
            permitJoinGroupReq.common = U7T.LJJIJIL(u7t2, c75951TrP3.LJLJJLL, 2);
            permitJoinGroupReq.myself = u7t2.LJJIL();
            permitJoinGroupReq.joinUser = groupPlayer;
            if (LIZLLL != null) {
                j = LIZLLL.longValue();
            } else {
                j = 0;
            }
            permitJoinGroupReq.groupChannelId = j;
            permitJoinGroupReq.type = 100;
            permitJoinGroupReq.status = c75951TrP3.LJLJJI;
            permitJoinGroupReq.cohostReqExtra = c75951TrP3.LJLJJL;
            C75951TrP c75951TrP4 = (C75951TrP) aqS102S0300000_13.l0;
            if (c75951TrP4.LJLJJI == 1) {
                z = true;
            } else {
                z = false;
            }
            U7T u7t3 = (U7T) aqS102S0300000_13.l1;
            Iterator<InterfaceC76622U5i> it = u7t3.LJII.iterator();
            while (it.hasNext()) {
                List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t3);
                if (LLIIZ != null) {
                    for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                        if (z) {
                            if (interfaceC76688U7w != null) {
                                interfaceC76688U7w.LIZJ(c75951TrP4);
                            }
                        } else if (interfaceC76688U7w != null) {
                            interfaceC76688U7w.LJFF(c75951TrP4);
                        }
                    }
                }
            }
            U7T u7t4 = (U7T) aqS102S0300000_13.l1;
            C73470SsU LJIJJ = C76857UEj.LJI(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).permitJoinGroup(permitJoinGroupReq), "permit apply group").LJIILIIL(new AfS0S0210200_13((U7T) aqS102S0300000_13.l1, (C75951TrP) aqS102S0300000_13.l0, LIZIZ, LIZIZ2, z, 1)).LJIIJ(new AfS0S0210100_13((U7T) aqS102S0300000_13.l1, (C75951TrP) aqS102S0300000_13.l0, LIZIZ, z, 1)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ()));
            ConcurrentHashSet<String> concurrentHashSet = ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ;
            u7t4.getClass();
            C73444Ss4 LIZLLL2 = new C73653SvR(U7T.LJJIFFI(LJIJJ, concurrentHashSet, LIZ).LJIIJJI(new IDhS5S0400000_13((C75951TrP) aqS102S0300000_13.l0, (U7T) aqS102S0300000_13.l1, permitJoinGroupReq, (InterfaceC76768UAy) aqS102S0300000_13.l2, 1)).LJIIIIZZ(new AfS65S0100000_13((InterfaceC76768UAy) aqS102S0300000_13.l2, 167)).LJII(new IDaS222S0100000_13((C75951TrP) aqS102S0300000_13.l0, 2))).LJIIIIZZ().LIZLLL(new IDaS8S1100000_13((U7T) aqS102S0300000_13.l1, LIZ, 1));
            U7T u7t5 = (U7T) aqS102S0300000_13.l1;
            C73543Stf LJIIJ = LIZLLL2.LJIIJ(new AfS65S0100000_13(u7t5, 161), new IDaS222S0100000_13(u7t5, 3));
            U7T u7t6 = (U7T) aqS102S0300000_13.l1;
            if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                C73318Sq2 compositeDisposable = u7t6.LJIILL;
                o.LJIIIZ(compositeDisposable, "compositeDisposable");
                compositeDisposable.LIZ(LJIIJ);
            }
            u7t4.LJJJLL = LJIIJ;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS102S0300000_13 aqS102S0300000_13) {
        long j;
        long j2;
        StringBuilder LIZJ = b1.LIZJ("invite group", " dealing data=");
        LIZJ.append((C76690U7y) aqS102S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        C76677U7l c76677U7l = ((U7T) aqS102S0300000_13.l1).LJJLIIIJ;
        if (c76677U7l != null) {
            C76690U7y data = (C76690U7y) aqS102S0300000_13.l0;
            o.LJIIIZ(data, "data");
            if (data.LJ > 0) {
                c76677U7l.LIZLLL.put(Long.valueOf(data.LIZIZ), data);
                c76677U7l.LIZLLL(102, data.LIZIZ, data.LJ);
            }
        }
        U7Z u7z = ((U7T) aqS102S0300000_13.l1).LJIIJJI;
        C76690U7y c76690U7y = (C76690U7y) aqS102S0300000_13.l0;
        long j3 = c76690U7y.LIZIZ;
        long j4 = c76690U7y.LIZ;
        long j5 = c76690U7y.LIZJ;
        String source = c76690U7y.LJII;
        u7z.getClass();
        o.LJIIIZ(source, "source");
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(u7z.LJIIL);
        ORS.LJJLIL(new AqS20S0000100_13(j3, 3), LLJILJILJ);
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setUserId(Long.valueOf(j3));
        builder.setRoomId(Long.valueOf(j4));
        builder.setChannelId(Long.valueOf(j5));
        ((ArrayList) LLJILJILJ).add(builder.build());
        u7z.LJIILL(LLJILJILJ);
        C76683U7r c76683U7r = ((U7T) aqS102S0300000_13.l1).LJIILJJIL;
        int i = c76683U7r.LIZ;
        if (i == 0 || i == 1) {
            c76683U7r.LIZIZ(2);
        }
        C76690U7y c76690U7y2 = (C76690U7y) aqS102S0300000_13.l0;
        Long l = c76690U7y2.LIZLLL;
        if (l != null) {
            j = l.longValue();
        } else {
            Long LIZLLL = ((U7T) aqS102S0300000_13.l1).LJIIJJI.LIZLLL(c76690U7y2.LIZIZ);
            if (LIZLLL != null) {
                j = LIZLLL.longValue();
            } else {
                j = 0;
            }
        }
        JoinGroupReq joinGroupReq = new JoinGroupReq();
        U7T u7t = (U7T) aqS102S0300000_13.l1;
        C76690U7y c76690U7y3 = (C76690U7y) aqS102S0300000_13.l0;
        joinGroupReq.common = U7T.LJJIJIL(u7t, c76690U7y3.LJII, 2);
        joinGroupReq.myself = u7t.LJJIL();
        joinGroupReq.target = U7T.LJJJ(c76690U7y3.LIZ, c76690U7y3.LIZIZ, c76690U7y3.LIZJ);
        joinGroupReq.type = 102;
        joinGroupReq.groupChannelId = j;
        joinGroupReq.cohostReqExtra = c76690U7y3.LJFF;
        long LIZIZ = C31012CFc.LIZIZ();
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ.add(LIZ);
        U7T u7t2 = (U7T) aqS102S0300000_13.l1;
        Room room = u7t2.LJ;
        if (room != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        U7T u7t3 = (U7T) aqS102S0300000_13.l1;
        long j6 = u7t3.LJI;
        String str = u7t3.LJJI;
        C76690U7y c76690U7y4 = (C76690U7y) aqS102S0300000_13.l0;
        long j7 = c76690U7y4.LIZIZ;
        long j8 = c76690U7y4.LIZ;
        long j9 = c76690U7y4.LIZJ;
        long currentTimeMillis = System.currentTimeMillis();
        String source2 = ((C76690U7y) aqS102S0300000_13.l0).LJII;
        o.LJIIIZ(source2, "source");
        UC0.LJJLIIIIJ(new ARunnableS0S3100700_13(j7, j8, j2, j6, j9, LIZIZ, currentTimeMillis, u7t2, str, source2, 0));
        U7T u7t4 = (U7T) aqS102S0300000_13.l1;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t4.LJII;
        C76690U7y c76690U7y5 = (C76690U7y) aqS102S0300000_13.l0;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t4);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJJIFFI(c76690U7y5);
                    }
                }
            }
        }
        U7T u7t5 = (U7T) aqS102S0300000_13.l1;
        C73470SsU LJIJJ = C76857UEj.LJI(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).joinGroup(joinGroupReq), "invite group").LJIILIIL(new AfS3S0200100_13(LIZIZ, (U7T) aqS102S0300000_13.l1, (C76690U7y) aqS102S0300000_13.l0, 13)).LJIIJ(new AfS3S0200100_13(LIZIZ, (U7T) aqS102S0300000_13.l1, (C76690U7y) aqS102S0300000_13.l0, 14)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ()));
        ConcurrentHashSet<String> concurrentHashSet = ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ;
        u7t5.getClass();
        C73444Ss4 LIZLLL2 = new C73653SvR(U7T.LJJIFFI(LJIJJ, concurrentHashSet, LIZ).LJIIJJI(new IDhS27S0300000_13((InterfaceC76768UAy) aqS102S0300000_13.l2, (C76690U7y) aqS102S0300000_13.l0, (U7T) aqS102S0300000_13.l1, 1)).LJIIIIZZ(new AfS52S0300000_13((U7T) aqS102S0300000_13.l1, (C76690U7y) aqS102S0300000_13.l0, (InterfaceC76768UAy) aqS102S0300000_13.l2, 4)).LJII(new IDaS161S0200000_13((C76690U7y) aqS102S0300000_13.l0, (U7T) aqS102S0300000_13.l1, 0))).LJIIIIZZ().LIZLLL(new IDaS8S1100000_13((U7T) aqS102S0300000_13.l1, LIZ, 3));
        U7T u7t6 = (U7T) aqS102S0300000_13.l1;
        C73543Stf LJIIJ = LIZLLL2.LJIIJ(new AfS65S0100000_13(u7t6, 158), new IDaS222S0100000_13(u7t6, 6));
        U7T u7t7 = (U7T) aqS102S0300000_13.l1;
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = u7t7.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJIIJ);
        }
        u7t5.LJJJJLL = LJIIJ;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS102S0300000_13 aqS102S0300000_13) {
        JoinChannelResult joinChannelResult;
        BizJoinChannelResponse bizJoinChannelResponse;
        JoinChannelResp joinChannelResp;
        LinkLayerListUser linkLayerListUser;
        LinkLayerListUser linkLayerListUser2;
        R2P r2p = (R2P) aqS102S0300000_13.l0;
        if (r2p != null && (joinChannelResp = (JoinChannelResp) r2p.data) != null && (linkLayerListUser = joinChannelResp.linkLayerListUser) != null) {
            U7T u7t = (U7T) aqS102S0300000_13.l2;
            OnLineMicInfo LIZLLL = U7V.LIZLLL(linkLayerListUser.positionData);
            if (LIZLLL == null) {
                LIZLLL = new OnLineMicInfo.Builder().build();
            }
            U7B u7b = new U7B();
            u7b.LIZ = u7t.LLZL();
            u7b.LIZIZ = u7t.LJIIJ;
            u7b.LIZJ = C51029K0z.LJJIIZI(new OSZ(Long.valueOf(u7t.LJIILIIL), LIZLLL));
            U7A u7a = new U7A(u7b);
            Iterator<InterfaceC76675U7j> it = u7t.LJIIIIZZ.iterator();
            while (it.hasNext()) {
                InterfaceC76675U7j next = it.next();
                JoinChannelResp joinChannelResp2 = (JoinChannelResp) r2p.data;
                if (joinChannelResp2 != null) {
                    linkLayerListUser2 = joinChannelResp2.linkLayerListUser;
                } else {
                    linkLayerListUser2 = null;
                }
                next.LJJL(u7t, linkLayerListUser2, u7a);
            }
        }
        R2P r2p2 = (R2P) aqS102S0300000_13.l0;
        if (r2p2 != null) {
            JoinChannelResp joinChannelResp3 = (JoinChannelResp) r2p2.data;
            if (joinChannelResp3 != null) {
                bizJoinChannelResponse = joinChannelResp3.multiGuestRespExtra;
            } else {
                bizJoinChannelResponse = null;
            }
            joinChannelResult = new JoinChannelResult(bizJoinChannelResponse);
        } else {
            joinChannelResult = null;
        }
        U7V.LJIILIIL(joinChannelResult, (InterfaceC76768UAy) aqS102S0300000_13.l1);
        U7T u7t2 = (U7T) aqS102S0300000_13.l2;
        R2P r2p3 = (R2P) aqS102S0300000_13.l0;
        u7t2.getClass();
        if (r2p3 != null && r2p3.data != 0) {
            Iterator<InterfaceC76622U5i> it2 = u7t2.LJII.iterator();
            while (it2.hasNext()) {
                it2.next().LJJ(u7t2, new JoinChannelMessage(u7t2, true, (JoinChannelResp) r2p3.data, null));
            }
        }
        C76129TuH.LJII = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS102S0300000_13 aqS102S0300000_13) {
        Throwable it = (Throwable) aqS102S0300000_13.l0;
        o.LJIIIIZZ(it, "it");
        U7V.LJIIJJI(it, (InterfaceC76768UAy) aqS102S0300000_13.l1);
        U7T u7t = (U7T) aqS102S0300000_13.l2;
        Throwable it2 = (Throwable) aqS102S0300000_13.l0;
        o.LJIIIIZZ(it2, "it");
        Iterator<InterfaceC76622U5i> it3 = u7t.LJII.iterator();
        while (it3.hasNext()) {
            it3.next().LJJ(u7t, new JoinChannelMessage(u7t, false, null, it2));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS102S0300000_13 aqS102S0300000_13) {
        long j;
        boolean z;
        StringBuilder LIZJ = b1.LIZJ("reply invite group", " dealing data=");
        LIZJ.append((C75952TrQ) aqS102S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        Long LIZLLL = ((U7T) aqS102S0300000_13.l1).LJIIJJI.LIZLLL(((C75952TrQ) aqS102S0300000_13.l0).LJLILLLLZI);
        if (MtCoHostPermitGroupWhenGroupChannelEmptyBugFixSetting.isEnable() && LIZLLL == null) {
            C15610jN.LIZ().post(new ARunnableS49S0100000_13((InterfaceC76768UAy) aqS102S0300000_13.l2, 164));
        } else {
            long LIZIZ = C31012CFc.LIZIZ();
            String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
            ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ.add(LIZ);
            U7T u7t = (U7T) aqS102S0300000_13.l1;
            Room room = u7t.LJ;
            if (room != null) {
                room.getId();
            }
            String str = ((U7T) aqS102S0300000_13.l1).LJJI;
            long j2 = ((C75952TrQ) aqS102S0300000_13.l0).LJLILLLLZI;
            long currentTimeMillis = System.currentTimeMillis();
            C75952TrQ c75952TrQ = (C75952TrQ) aqS102S0300000_13.l0;
            String source = c75952TrQ.LJLJJLL;
            int i = c75952TrQ.LJLJJI;
            o.LJIIIZ(source, "source");
            UC0.LJJLIIIIJ(new ARunnableS0S3101300_13(u7t, j2, i, LIZIZ, currentTimeMillis, str, source, 1));
            long LIZIZ2 = C31012CFc.LIZIZ();
            Player player = new Player(0L, 0L, 3, null);
            C75952TrQ c75952TrQ2 = (C75952TrQ) aqS102S0300000_13.l0;
            player.roomId = c75952TrQ2.LJLIL;
            player.uid = c75952TrQ2.LJLILLLLZI;
            GroupPlayer groupPlayer = new GroupPlayer();
            groupPlayer.channelId = ((C75952TrQ) aqS102S0300000_13.l0).LJLJI;
            groupPlayer.user = player;
            PermitJoinGroupReq permitJoinGroupReq = new PermitJoinGroupReq();
            U7T u7t2 = (U7T) aqS102S0300000_13.l1;
            C75952TrQ c75952TrQ3 = (C75952TrQ) aqS102S0300000_13.l0;
            permitJoinGroupReq.common = U7T.LJJIJIL(u7t2, c75952TrQ3.LJLJJLL, 2);
            permitJoinGroupReq.myself = u7t2.LJJIL();
            permitJoinGroupReq.joinUser = groupPlayer;
            permitJoinGroupReq.type = 102;
            if (LIZLLL != null) {
                j = LIZLLL.longValue();
            } else {
                j = 0;
            }
            permitJoinGroupReq.groupChannelId = j;
            permitJoinGroupReq.status = c75952TrQ3.LJLJJI;
            permitJoinGroupReq.cohostReqExtra = c75952TrQ3.LJLJJL;
            C75952TrQ c75952TrQ4 = (C75952TrQ) aqS102S0300000_13.l0;
            if (c75952TrQ4.LJLJJI == 1) {
                z = true;
            } else {
                z = false;
            }
            U7T u7t3 = (U7T) aqS102S0300000_13.l1;
            Iterator<InterfaceC76622U5i> it = u7t3.LJII.iterator();
            while (it.hasNext()) {
                List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t3);
                if (LLIIZ != null) {
                    for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                        if (z) {
                            if (interfaceC76688U7w != null) {
                                interfaceC76688U7w.LJIIJJI(c75952TrQ4);
                            }
                        } else if (interfaceC76688U7w != null) {
                            interfaceC76688U7w.LJIILIIL(c75952TrQ4);
                        }
                    }
                }
            }
            U7T u7t4 = (U7T) aqS102S0300000_13.l1;
            C73470SsU LJIJJ = C76857UEj.LJI(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).permitJoinGroup(permitJoinGroupReq), "reply invite group").LJIILIIL(new AfS0S0210200_13((U7T) aqS102S0300000_13.l1, (C75952TrQ) aqS102S0300000_13.l0, LIZIZ, LIZIZ2, z, 0)).LJIIJ(new AfS0S0210100_13((U7T) aqS102S0300000_13.l1, (C75952TrQ) aqS102S0300000_13.l0, LIZIZ, z, 0)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ()));
            ConcurrentHashSet<String> concurrentHashSet = ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ;
            u7t4.getClass();
            C73444Ss4 LIZLLL2 = new C73653SvR(U7T.LJJIFFI(LJIJJ, concurrentHashSet, LIZ).LJIIJJI(new IDhS5S0400000_13((C75952TrQ) aqS102S0300000_13.l0, (U7T) aqS102S0300000_13.l1, permitJoinGroupReq, (InterfaceC76768UAy) aqS102S0300000_13.l2, 0)).LJIIIIZZ(new AfS65S0100000_13((InterfaceC76768UAy) aqS102S0300000_13.l2, 164)).LJII(new IDaS222S0100000_13((C75952TrQ) aqS102S0300000_13.l0, 12))).LJIIIIZZ().LIZLLL(new IDaS8S1100000_13((U7T) aqS102S0300000_13.l1, LIZ, 6));
            U7T u7t5 = (U7T) aqS102S0300000_13.l1;
            C73543Stf LJIIJ = LIZLLL2.LJIIJ(new AfS65S0100000_13(u7t5, 154), new IDaS222S0100000_13(u7t5, 13));
            U7T u7t6 = (U7T) aqS102S0300000_13.l1;
            if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
                C73318Sq2 compositeDisposable = u7t6.LJIILL;
                o.LJIIIZ(compositeDisposable, "compositeDisposable");
                compositeDisposable.LIZ(LJIIJ);
            }
            u7t4.LJJJJZ = LJIIJ;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS102S0300000_13 aqS102S0300000_13) {
        long j;
        StringBuilder LIZJ = b1.LIZJ("apply group", " dealing data=");
        LIZJ.append((C76689U7x) aqS102S0300000_13.l0);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZJ));
        C76677U7l c76677U7l = ((U7T) aqS102S0300000_13.l1).LJJLIIIJ;
        long j2 = 0;
        if (c76677U7l != null) {
            C76689U7x data = (C76689U7x) aqS102S0300000_13.l0;
            o.LJIIIZ(data, "data");
            if (data.LJ > 0) {
                c76677U7l.LJ.put(Long.valueOf(data.LIZIZ), data);
                c76677U7l.LIZLLL(100, data.LIZIZ, data.LJ);
            }
        }
        U7Z u7z = ((U7T) aqS102S0300000_13.l1).LJIIJJI;
        C76689U7x c76689U7x = (C76689U7x) aqS102S0300000_13.l0;
        long j3 = c76689U7x.LIZIZ;
        long j4 = c76689U7x.LIZ;
        long j5 = c76689U7x.LIZJ;
        String source = c76689U7x.LJII;
        u7z.getClass();
        o.LJIIIZ(source, "source");
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(u7z.LJIILIIL);
        ORS.LJJLIL(new AqS20S0000100_13(j3, 2), LLJILJILJ);
        LinkUser.Builder builder = new LinkUser.Builder();
        builder.setUserId(Long.valueOf(j3));
        builder.setRoomId(Long.valueOf(j4));
        builder.setChannelId(Long.valueOf(j5));
        ((ArrayList) LLJILJILJ).add(builder.build());
        u7z.LJIILIIL(LLJILJILJ);
        C76683U7r c76683U7r = ((U7T) aqS102S0300000_13.l1).LJIILJJIL;
        int i = c76683U7r.LIZ;
        if (i == 0 || i == 1) {
            c76683U7r.LIZIZ(2);
        }
        long LIZIZ = C31012CFc.LIZIZ();
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ.add(LIZ);
        C76689U7x c76689U7x2 = (C76689U7x) aqS102S0300000_13.l0;
        Long l = c76689U7x2.LIZLLL;
        if (l != null) {
            j2 = l.longValue();
        } else {
            Long LIZLLL = ((U7T) aqS102S0300000_13.l1).LJIIJJI.LIZLLL(c76689U7x2.LIZIZ);
            if (LIZLLL != null) {
                j2 = LIZLLL.longValue();
            }
        }
        JoinGroupReq joinGroupReq = new JoinGroupReq();
        U7T u7t = (U7T) aqS102S0300000_13.l1;
        C76689U7x c76689U7x3 = (C76689U7x) aqS102S0300000_13.l0;
        joinGroupReq.common = U7T.LJJIJIL(u7t, c76689U7x3.LJII, 2);
        joinGroupReq.myself = u7t.LJJIL();
        joinGroupReq.target = U7T.LJJJ(c76689U7x3.LIZ, c76689U7x3.LIZIZ, c76689U7x3.LIZJ);
        joinGroupReq.type = 100;
        joinGroupReq.groupChannelId = j2;
        joinGroupReq.cohostReqExtra = c76689U7x3.LJFF;
        U7T u7t2 = (U7T) aqS102S0300000_13.l1;
        Room room = u7t2.LJ;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        U7T u7t3 = (U7T) aqS102S0300000_13.l1;
        long j6 = u7t3.LJI;
        String str = u7t3.LJJI;
        C76689U7x c76689U7x4 = (C76689U7x) aqS102S0300000_13.l0;
        long j7 = c76689U7x4.LIZIZ;
        long j8 = c76689U7x4.LIZ;
        long j9 = c76689U7x4.LIZJ;
        long currentTimeMillis = System.currentTimeMillis();
        String source2 = ((C76689U7x) aqS102S0300000_13.l0).LJII;
        o.LJIIIZ(source2, "source");
        UC0.LJJLIIIIJ(new ARunnableS0S3100700_13(j7, j8, j, j6, j9, LIZIZ, currentTimeMillis, u7t2, str, source2, 1));
        U7T u7t4 = (U7T) aqS102S0300000_13.l1;
        CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = u7t4.LJII;
        C76689U7x c76689U7x5 = (C76689U7x) aqS102S0300000_13.l0;
        Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            List<InterfaceC76688U7w> LLIIZ = it.next().LLIIZ(u7t4);
            if (LLIIZ != null) {
                for (InterfaceC76688U7w interfaceC76688U7w : LLIIZ) {
                    if (interfaceC76688U7w != null) {
                        interfaceC76688U7w.LJIIIZ(c76689U7x5);
                    }
                }
            }
        }
        U7T u7t5 = (U7T) aqS102S0300000_13.l1;
        C73470SsU LJIJJ = C76857UEj.LJI(((LinkMicApi) Q7L.LIZIZ(LinkMicApi.class)).joinGroup(joinGroupReq), "apply group").LJIILIIL(new AfS3S0200100_13(LIZIZ, (U7T) aqS102S0300000_13.l1, (C76689U7x) aqS102S0300000_13.l0, 27)).LJIIJ(new AfS3S0200100_13(LIZIZ, (U7T) aqS102S0300000_13.l1, (C76689U7x) aqS102S0300000_13.l0, 28)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZ(C76766UAw.LIZJ.LIZIZ()));
        ConcurrentHashSet<String> concurrentHashSet = ((U7T) aqS102S0300000_13.l1).LJJLIIIJJIZ;
        u7t5.getClass();
        C73444Ss4 LIZLLL2 = new C73653SvR(U7T.LJJIFFI(LJIJJ, concurrentHashSet, LIZ).LJIIJJI(new IDhS27S0300000_13((InterfaceC76768UAy) aqS102S0300000_13.l2, (C76689U7x) aqS102S0300000_13.l0, (U7T) aqS102S0300000_13.l1, 3)).LJIIIIZZ(new AfS52S0300000_13((U7T) aqS102S0300000_13.l1, (C76689U7x) aqS102S0300000_13.l0, (InterfaceC76768UAy) aqS102S0300000_13.l2, 6)).LJII(new IDaS161S0200000_13((C76689U7x) aqS102S0300000_13.l0, (U7T) aqS102S0300000_13.l1, 1))).LJIIIIZZ().LIZLLL(new IDaS8S1100000_13((U7T) aqS102S0300000_13.l1, LIZ, 7));
        U7T u7t6 = (U7T) aqS102S0300000_13.l1;
        C73543Stf LJIIJ = LIZLLL2.LJIIJ(new AfS65S0100000_13(u7t6, 166), new IDaS222S0100000_13(u7t6, 14));
        U7T u7t7 = (U7T) aqS102S0300000_13.l1;
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            C73318Sq2 compositeDisposable = u7t7.LJIILL;
            o.LJIIIZ(compositeDisposable, "compositeDisposable");
            compositeDisposable.LIZ(LJIIJ);
        }
        u7t5.LJJJJZI = LJIIJ;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS102S0300000_13 aqS102S0300000_13) {
        C29S c29s;
        C32802Cu6 c32802Cu6 = (C32802Cu6) aqS102S0300000_13.l0;
        C32816CuK c32816CuK = (C32816CuK) aqS102S0300000_13.l1;
        boolean z = ((C88559YpH) aqS102S0300000_13.l2).LIZ;
        ActivityC45651qj LJFF = c32802Cu6.LJFF();
        if ((LJFF instanceof C29S) && (c29s = (C29S) LJFF) != null) {
            C76906UGg.LIZJ(c29s, z, new C32807CuB(c32802Cu6, c32816CuK, z), c32802Cu6.LJI());
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS102S0300000_13 aqS102S0300000_13) {
        ((InterfaceC75441TjB) aqS102S0300000_13.l0).LJJIJLIJ((C28272B7s) aqS102S0300000_13.l1, (VoiceChatSeiAppData) aqS102S0300000_13.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS102S0300000_13 aqS102S0300000_13) {
        ((InterfaceC75441TjB) aqS102S0300000_13.l0).LJJIJLIJ((C28272B7s) aqS102S0300000_13.l1, (SeiAppData) aqS102S0300000_13.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS102S0300000_13 aqS102S0300000_13) {
        long j = ((BattleComboInfo) aqS102S0300000_13.l0).comboCount;
        BattleComboInfo battleComboInfo = (BattleComboInfo) aqS102S0300000_13.l1;
        if (j != battleComboInfo.comboCount) {
            ((U52) aqS102S0300000_13.l2).LIZJ(battleComboInfo);
        } else {
            C0NB.LIZIZ("MatchWinningStreaksIcon", "counts haven't change");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS102S0300000_13 aqS102S0300000_13) {
        ((InterfaceC75441TjB) aqS102S0300000_13.l0).LJJIJLIJ((C28272B7s) aqS102S0300000_13.l1, (SeiAppData) aqS102S0300000_13.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS102S0300000_13 aqS102S0300000_13) {
        ((InterfaceC75441TjB) aqS102S0300000_13.l0).LJJIJLIJ((C28272B7s) aqS102S0300000_13.l1, (SeiAppData) aqS102S0300000_13.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS102S0300000_13 aqS102S0300000_13) {
        ((InterfaceC75441TjB) aqS102S0300000_13.l0).LJJIJLIJ((C28272B7s) aqS102S0300000_13.l1, (SeiAppData) aqS102S0300000_13.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS102S0300000_13 aqS102S0300000_13) {
        C75642TmQ.LJJJJLL((Room) aqS102S0300000_13.l0, "invite", null, null, null, null, 124);
        C8E.LIZLLL().LJJZZIII(true);
        C8E.LIZLLL().LLJI((C75759ToJ) aqS102S0300000_13.l1, new C75750ToA((Room) aqS102S0300000_13.l0, (InterfaceC75754ToE) aqS102S0300000_13.l2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS102S0300000_13 aqS102S0300000_13) {
        C75642TmQ.LJJJJLL((Room) aqS102S0300000_13.l0, "apply", null, null, null, null, 124);
        C8E.LIZLLL().LJJZZIII(false);
        C8E.LIZLLL().LLILL((C75759ToJ) aqS102S0300000_13.l1, new C75752ToC((Room) aqS102S0300000_13.l0, (InterfaceC75754ToE) aqS102S0300000_13.l2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS102S0300000_13 aqS102S0300000_13) {
        C76930UHe c76930UHe = (C76930UHe) aqS102S0300000_13.l0;
        InterfaceC76931UHf interfaceC76931UHf = (InterfaceC76931UHf) aqS102S0300000_13.l1;
        c76930UHe.getClass();
        c76930UHe.postDelayed(new ARunnableS32S0200000_13(c76930UHe, interfaceC76931UHf, 128), 30L);
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS102S0300000_13.l2;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r4.LIZ(r4.LIZJ, r1.LIZIZ, r1.LIZJ, false) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$26(kotlin.jvm.internal.AqS102S0300000_13 r5) {
        /*
            java.lang.Object r2 = r5.l0
            X.Ums r2 = (X.C78218Ums) r2
            java.lang.Object r0 = r5.l1
            X.Umn r0 = (X.InterfaceC78213Umn) r0
            r2.LJI = r0
            java.lang.Object r0 = r5.l2
            X.CoO r0 = (X.C32448CoO) r0
            r2.LJFF = r0
            if (r0 == 0) goto L4a
            X.UmO r0 = r0.LIZJ
        L14:
            r2.LJIIIIZZ = r0
            X.Ego r1 = r2.LIZLLL
            X.CoP r0 = r2.LIZ
            X.Egq r1 = r1.LIZ(r0)
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L36
            java.lang.Object r4 = r5.l0
            X.Ums r4 = (X.C78218Ums) r4
            X.Umu r3 = r4.LIZJ
            int r2 = r1.LIZIZ
            java.lang.String r1 = r1.LIZJ
            r0 = 0
            boolean r0 = r4.LIZ(r3, r2, r1, r0)
            if (r0 == 0) goto L36
        L33:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L36:
            java.lang.Object r0 = r5.l0
            X.Ums r0 = (X.C78218Ums) r0
            X.CoG r2 = r0.LIZIZ
            if (r2 == 0) goto L33
            java.lang.Object r1 = r5.l1
            X.Umn r1 = (X.InterfaceC78213Umn) r1
            java.lang.Object r0 = r5.l2
            X.CoO r0 = (X.C32448CoO) r0
            r2.LIZIZ(r1, r0)
            goto L33
        L4a:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS102S0300000_13.invoke$26(kotlin.jvm.internal.AqS102S0300000_13):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static final Object invoke$27(AqS102S0300000_13 aqS102S0300000_13) {
        List list;
        Effect effect;
        InterfaceC78206Umg interfaceC78206Umg;
        InterfaceC78206Umg interfaceC78206Umg2;
        List<Effect> list2;
        InterfaceC78206Umg interfaceC78206Umg3;
        C78192UmS c78192UmS = (C78192UmS) aqS102S0300000_13.l0;
        InterfaceC78213Umn interfaceC78213Umn = (InterfaceC78213Umn) aqS102S0300000_13.l1;
        C32448CoO c32448CoO = (C32448CoO) aqS102S0300000_13.l2;
        c78192UmS.LIZLLL = false;
        if (c32448CoO != null && (interfaceC78206Umg3 = c32448CoO.LIZ) != null) {
            interfaceC78206Umg3.LJ(EnumC78220Umu.COMBINATION);
        }
        C32437CoD c32437CoD = c78192UmS.LIZJ.LJ;
        if (c32437CoD != null && (list2 = c32437CoD.LIZ) != null) {
            list = new ArrayList();
            for (Effect effect2 : list2) {
                C78160Ulw c78160Ulw = c78192UmS.LIZJ.LIZJ;
                String str = effect2.LIZ;
                if (str != null && str.length() > 0) {
                    C78160Ulw c78160Ulw2 = c78192UmS.LIZJ.LIZJ;
                    if (c78160Ulw2 != null) {
                        long j = c78160Ulw2.LIZ;
                        String str2 = c78160Ulw2.LIZIZ;
                        boolean z = c78160Ulw2.LIZJ;
                        String roomType = c78160Ulw2.LIZLLL;
                        Map<String, String> map = c78160Ulw2.LJ;
                        int i = c78160Ulw2.LJFF;
                        boolean z2 = c78160Ulw2.LJI;
                        long j2 = c78160Ulw2.LJII;
                        long j3 = c78160Ulw2.LJIIIIZZ;
                        long j4 = c78160Ulw2.LJIIIZ;
                        long j5 = c78160Ulw2.LJIIJ;
                        long j6 = c78160Ulw2.LJIIJJI;
                        HashMap<String, Long> tsMap = c78160Ulw2.LJIILIIL;
                        boolean z3 = c78160Ulw2.LJIILJJIL;
                        o.LJIIIZ(roomType, "roomType");
                        o.LJIIIZ(tsMap, "tsMap");
                        c78160Ulw = new C78160Ulw(j, str2, z, roomType, map, i, z2, j2, j3, j4, j5, j6, str, tsMap, z3);
                    } else {
                        c78160Ulw = null;
                    }
                }
                C32438CoE c32438CoE = new C32438CoE();
                c32438CoE.LIZJ = effect2;
                C32449CoP c32449CoP = c78192UmS.LIZJ;
                c32438CoE.LJ = c32449CoP.LIZIZ;
                c32438CoE.LJFF = c78160Ulw;
                Map<String, String> map2 = c32449CoP.LJFF;
                o.LJIIIZ(map2, "map");
                c32438CoE.LJII.putAll(map2);
                c32438CoE.LIZIZ = false;
                C32449CoP c32449CoP2 = c78192UmS.LIZJ;
                c32438CoE.LIZ = c32449CoP2.LJIIIZ;
                c32438CoE.LJIIIZ = c32449CoP2.LIZLLL;
                c32438CoE.LJIIJ = true;
                C32449CoP LIZ = c32438CoE.LIZ();
                if (LIZ != null) {
                    list.add(LIZ);
                }
            }
        } else {
            list = C61878OQg.INSTANCE;
        }
        C32438CoE c32438CoE2 = new C32438CoE();
        C32449CoP c32449CoP3 = c78192UmS.LIZJ;
        C32437CoD c32437CoD2 = c32449CoP3.LJ;
        if (c32437CoD2 != null) {
            effect = c32437CoD2.LIZIZ;
        } else {
            effect = null;
        }
        c32438CoE2.LIZJ = effect;
        c32438CoE2.LJFF = c32449CoP3.LIZJ;
        Map<String, String> map3 = c32449CoP3.LJFF;
        o.LJIIIZ(map3, "map");
        c32438CoE2.LJII.putAll(map3);
        C32449CoP c32449CoP4 = c78192UmS.LIZJ;
        c32438CoE2.LIZ = c32449CoP4.LJIIIZ;
        c32438CoE2.LJ = c32449CoP4.LIZIZ;
        c32438CoE2.LJIIIZ = c32449CoP4.LIZLLL;
        c32438CoE2.LJI = c32449CoP4.LJII;
        c32438CoE2.LJIIIIZZ.put(InterfaceC78172Um8.class, new C78187UmN(list));
        if (c32448CoO != null && (interfaceC78206Umg2 = c32448CoO.LIZLLL) != null) {
            c32438CoE2.LJIIIIZZ.put(InterfaceC78206Umg.class, interfaceC78206Umg2);
        }
        C32449CoP LIZ2 = c32438CoE2.LIZ();
        if (LIZ2 == null) {
            if (c32448CoO != null && (interfaceC78206Umg = c32448CoO.LIZ) != null) {
                interfaceC78206Umg.LJFF(EnumC78220Umu.COMBINATION, new C78163Ulz(-10, "box request build failed", 4));
            }
        } else {
            List LLJILJILJ = ORZ.LLJILJILJ(list);
            ListProtector.add(LLJILJILJ, 0, LIZ2);
            c78192UmS.LJFF = new C78184UmK(LLJILJILJ);
            AqS17S0500000_13 aqS17S0500000_13 = new AqS17S0500000_13(c32448CoO, (C32448CoO) c78192UmS, (C78192UmS) LIZ2, (C32449CoP) interfaceC78213Umn, (InterfaceC78213Umn) list, (List<C32449CoP>) 3);
            C78184UmK c78184UmK = c78192UmS.LJFF;
            if (c78184UmK != null) {
                c78184UmK.LIZ(aqS17S0500000_13, new AqS179S0100000_13(c32448CoO, 586));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS102S0300000_13 aqS102S0300000_13) {
        SparkSchemaParam sparkSchemaParam;
        InterfaceC78206Umg interfaceC78206Umg;
        C78216Umq c78216Umq = (C78216Umq) aqS102S0300000_13.l0;
        InterfaceC78213Umn interfaceC78213Umn = (InterfaceC78213Umn) aqS102S0300000_13.l1;
        C32448CoO c32448CoO = (C32448CoO) aqS102S0300000_13.l2;
        c78216Umq.getClass();
        ArrayList arrayList = new ArrayList();
        if (c32448CoO != null && (interfaceC78206Umg = c32448CoO.LIZ) != null) {
            arrayList.add(interfaceC78206Umg);
        }
        arrayList.add(c78216Umq.LJ);
        C78200Uma c78200Uma = new C78200Uma(arrayList);
        C78217Umr c78217Umr = c78216Umq.LJI;
        c78217Umr.LJIIJJI = c78200Uma;
        c78217Umr.LJIIIIZZ = new AqS175S0200000_13(c78216Umq, c78200Uma, 14);
        c78217Umr.LJIIJ = new AqS175S0200000_13(c78216Umq, c78200Uma, 15);
        c78217Umr.LJIIIZ = new AqS160S0200000_13(c78216Umq, c78200Uma, 99);
        View LIZ = interfaceC78213Umn.LIZ(R.id.lpg, -1, new C78223Umx(c78216Umq));
        o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.gift.render.engine.lynx.LynxGiftView");
        C78215Ump c78215Ump = (C78215Ump) LIZ;
        c78216Umq.LJII = c78215Ump;
        c78215Ump.LIZ(false);
        C78215Ump c78215Ump2 = c78216Umq.LJII;
        if (c78215Ump2 != null) {
            c78215Ump2.setBridgeRegistry$livegift_lynx_release(new C78219Umt(interfaceC78213Umn, c78216Umq));
        }
        C78215Ump c78215Ump3 = c78216Umq.LJII;
        if (c78215Ump3 != null) {
            C78217Umr lynxInfo = c78216Umq.LJI;
            O98 performanceService = c78216Umq.LJFF;
            o.LJIIIZ(lynxInfo, "lynxInfo");
            o.LJIIIZ(performanceService, "performanceService");
            C78181UmH c78181UmH = new C78181UmH();
            c78215Ump3.LJLILLLLZI = c78181UmH;
            c78181UmH.LIZ = C78181UmH.LIZ();
            c78181UmH.LJI = 1;
            Uri uri = lynxInfo.LIZJ;
            if (uri != null) {
                Uri build = uri.buildUpon().appendQueryParameter("asset_id", String.valueOf(lynxInfo.LIZ)).appendQueryParameter("gift_id", String.valueOf(lynxInfo.LIZIZ)).appendQueryParameter("ts", String.valueOf(System.currentTimeMillis())).build();
                o.LJIIIIZZ(build, "uri.buildUpon()\n        …g())\n            .build()");
                String uri2 = build.toString();
                o.LJIIIIZZ(uri2, "rebuildUri(lynxInfo).toString()");
                c78215Ump3.LJLLJ = c78216Umq;
                c78215Ump3.LJLJJI = performanceService;
                if (c78215Ump3.LJLLL == null) {
                    c78215Ump3.removeAllViews();
                    C32444CoK.LIZ(null, "LynxCall#createSparkView");
                    C60825Nu1 c60825Nu1 = new C60825Nu1(0);
                    c78215Ump3.LJLL = c60825Nu1;
                    O93 o93 = new O93(0);
                    c78215Ump3.LJLJJL = o93;
                    Context context = c78215Ump3.getContext();
                    o.LJIIIIZZ(context, "context");
                    O97 LIZIZ = performanceService.LIZIZ(context, uri2, c60825Nu1, o93);
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = LIZIZ.LIZ;
                    c78215Ump3.LJLLL = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
                    c78215Ump3.LJLJI = LIZIZ.LIZIZ;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                        c78215Ump3.addView(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, new FrameLayout.LayoutParams(-1, -1));
                    }
                }
                long j = lynxInfo.LIZLLL;
                if (j > 0) {
                    c78215Ump3.LJLLLL.sendEmptyMessageDelayed(1001, j);
                }
                Handler handler = c78215Ump3.LJLLLL;
                long j2 = lynxInfo.LJ;
                if (j2 <= 0) {
                    j2 = TimeUnit.MINUTES.toMillis(5L);
                }
                handler.sendEmptyMessageDelayed(1002, j2);
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 = c78215Ump3.LJLLL;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2 != null) {
                    c78215Ump3.LJLLILLLL = lynxInfo.LJFF;
                    c78215Ump3.LJLLI = new C78240UnE(c78215Ump3);
                    C78239UnD c78239UnD = new C78239UnD(c78215Ump3);
                    C72818Shy.LIZLLL("lynx_gift_on_ready", c78239UnD);
                    C72818Shy.LIZLLL("lynx_gift_on_completion", c78239UnD);
                    C72818Shy.LIZLLL("lynx_gift_on_error", c78239UnD);
                    c78215Ump3.LJLJLLL = c78239UnD;
                    C60825Nu1 c60825Nu12 = c78215Ump3.LJLL;
                    if (c60825Nu12 != null) {
                        c60825Nu12.LJLILLLLZI = new IDbS499S0100000_13(c78215Ump3, 1);
                    }
                    SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getSparkContext();
                    if (sparkContext != null) {
                        c78215Ump3.LJLJLJ = sparkContext.containerId;
                        c78215Ump3.LJLJL = sparkContext;
                    } else {
                        sparkContext = null;
                    }
                    O93 o932 = c78215Ump3.LJLJJL;
                    if (o932 != null) {
                        o932.LIZ = new C38238Eza(c78215Ump3, sparkContext);
                    }
                    SparkContext sparkContext2 = c78215Ump3.LJLJL;
                    if (sparkContext2 != null) {
                        sparkContext2.LJJIIZ(lynxInfo.LJIIL, "initialData");
                    }
                    SparkContext originalSparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getOriginalSparkContext();
                    if (originalSparkContext != null) {
                        originalSparkContext.LJJIJLIJ(uri2);
                    }
                    c78200Uma.LIZIZ(EnumC78220Umu.LYNX);
                    C78181UmH c78181UmH2 = c78215Ump3.LJLILLLLZI;
                    if (c78181UmH2 != null) {
                        c78181UmH2.LIZIZ = C78181UmH.LIZ();
                        c78181UmH2.LJI = 2;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("LynxCall# load url, uri = ");
                    LIZ2.append(uri2);
                    C32444CoK.LIZ(null, X1D.LIZIZ(LIZ2));
                    if (c78215Ump3.LJLJI) {
                        SparkContext sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getSparkContext();
                        if (sparkContext3 != null) {
                            sparkSchemaParam = sparkContext3.LJIIZILJ(-1);
                        } else {
                            sparkSchemaParam = null;
                        }
                        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIILIIL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.getSparkContext(), sparkSchemaParam);
                        O99 o99 = c78215Ump3.LJLIL;
                        Context context2 = c78215Ump3.getContext();
                        o.LJIIIIZZ(context2, "context");
                        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIILL(o99.LIZIZ(context2, uri2), null);
                    } else {
                        SparkContext sparkContext4 = c78215Ump3.LJLJL;
                        if (sparkContext4 != null) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LJIIJJI(sparkContext4);
                        }
                        SparkContext sparkContext5 = c78215Ump3.LJLJL;
                        if (sparkContext5 != null) {
                            sparkContext5.LJJIJLIJ(uri2);
                        }
                        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS2.LIZIZ();
                    }
                    c78215Ump3.setVisibility(0);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS102S0300000_13 aqS102S0300000_13) {
        InterfaceC75963Trb LLJLLL;
        ((C75981Trt) aqS102S0300000_13.l0).LJLLI = false;
        InterfaceC75959TrX interfaceC75959TrX = (InterfaceC75959TrX) aqS102S0300000_13.l1;
        if (interfaceC75959TrX != null && (LLJLLL = interfaceC75959TrX.LLJLLL()) != null) {
            LLJLLL.F3((C75981Trt) aqS102S0300000_13.l0, (EnumC75614Tly) aqS102S0300000_13.l2, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS102S0300000_13 aqS102S0300000_13) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) aqS102S0300000_13.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AqS117S0300000_13(multiGuestSharedBgAnchorViewModel, (Context) aqS102S0300000_13.l1, (DataChannel) aqS102S0300000_13.l2, 3));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS102S0300000_13 aqS102S0300000_13) {
        InterfaceC75963Trb LLJLLL = ((InterfaceC75959TrX) aqS102S0300000_13.l0).LLJLLL();
        if (LLJLLL != null) {
            LLJLLL.F3((C75981Trt) aqS102S0300000_13.l1, (EnumC75614Tly) aqS102S0300000_13.l2, false);
        }
        ((C75981Trt) aqS102S0300000_13.l1).LJLLI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS102S0300000_13 aqS102S0300000_13) {
        InterfaceC75964Trc o = ((InterfaceC75959TrX) aqS102S0300000_13.l0).o();
        if (o != null) {
            o.c5((C75981Trt) aqS102S0300000_13.l1, (EnumC75614Tly) aqS102S0300000_13.l2, true);
        }
        ((C75981Trt) aqS102S0300000_13.l1).LJLLI = false;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS102S0300000_13 aqS102S0300000_13) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) aqS102S0300000_13.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AqS117S0300000_13(multiGuestSharedBgAnchorViewModel, (Context) aqS102S0300000_13.l1, (DataChannel) aqS102S0300000_13.l2, 4));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS102S0300000_13 aqS102S0300000_13) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) aqS102S0300000_13.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AqS117S0300000_13(multiGuestSharedBgAnchorViewModel, (Context) aqS102S0300000_13.l1, (DataChannel) aqS102S0300000_13.l2, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS102S0300000_13 aqS102S0300000_13) {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel = (MultiGuestSharedBgAnchorViewModel) aqS102S0300000_13.l0;
        multiGuestSharedBgAnchorViewModel.runOnUIThread(new AqS117S0300000_13(multiGuestSharedBgAnchorViewModel, (Context) aqS102S0300000_13.l1, (DataChannel) aqS102S0300000_13.l2, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS102S0300000_13 aqS102S0300000_13) {
        if (((SeiAppData) aqS102S0300000_13.l0) == null) {
            if (((C28272B7s) aqS102S0300000_13.l1) != null) {
                ((MultiGuestSeiAbnormalDetector) aqS102S0300000_13.l2).getClass();
                MultiGuestSeiAbnormalDetector multiGuestSeiAbnormalDetector = (MultiGuestSeiAbnormalDetector) aqS102S0300000_13.l2;
                int i = multiGuestSeiAbnormalDetector.LJ + 1;
                multiGuestSeiAbnormalDetector.LJ = i;
                if (i > multiGuestSeiAbnormalDetector.LJFF) {
                    int i2 = multiGuestSeiAbnormalDetector.LJI;
                    if (i2 < multiGuestSeiAbnormalDetector.LJII) {
                        multiGuestSeiAbnormalDetector.LJI = i2 + 1;
                        C75516TkO c75516TkO = C75516TkO.LIZ;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("reportAbnormalSeiHappen: sei has no app data when guest online. ");
                        LIZ.append(multiGuestSeiAbnormalDetector.LIZJ);
                        c75516TkO.LIZ(501, X1D.LIZIZ(LIZ), null);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("reportAbnormalSeiHappen ");
                    LIZ2.append(multiGuestSeiAbnormalDetector.LIZJ);
                    LIZ2.append(' ');
                    LIZ2.append((Object) null);
                    LIZ2.append(' ');
                    LIZ2.append(multiGuestSeiAbnormalDetector.LIZLLL);
                    LIZ2.append(' ');
                    C29556Biq.LIZ().getClass();
                    LIZ2.append(C74983Tbn.LJIILIIL());
                    LIZ2.append(' ');
                    LIZ2.append(MultiGuestSeiAbnormalDetector.LIZ());
                    LIZ2.append(' ');
                    C19U.LIZJ(LIZ2, multiGuestSeiAbnormalDetector.LIZIZ, LIZ2, "MultiGuestSeiAbnormalDetector");
                    ((MultiGuestSeiAbnormalDetector) aqS102S0300000_13.l2).LJ = 0;
                }
            }
        } else {
            ((MultiGuestSeiAbnormalDetector) aqS102S0300000_13.l2).LJ = 0;
        }
        MultiGuestSeiAbnormalDetector multiGuestSeiAbnormalDetector2 = (MultiGuestSeiAbnormalDetector) aqS102S0300000_13.l2;
        multiGuestSeiAbnormalDetector2.LIZJ = (C28272B7s) aqS102S0300000_13.l1;
        multiGuestSeiAbnormalDetector2.LIZLLL = (SeiAppData) aqS102S0300000_13.l0;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS102S0300000_13 aqS102S0300000_13) {
        InterfaceC78206Umg interfaceC78206Umg;
        long j;
        boolean z;
        C78197UmX c78197UmX = (C78197UmX) aqS102S0300000_13.l0;
        InterfaceC78213Umn interfaceC78213Umn = (InterfaceC78213Umn) aqS102S0300000_13.l1;
        C32448CoO c32448CoO = (C32448CoO) aqS102S0300000_13.l2;
        c78197UmX.getClass();
        InterfaceC78206Umg[] interfaceC78206UmgArr = new InterfaceC78206Umg[3];
        C32449CoP c32449CoP = c78197UmX.LIZ;
        interfaceC78206UmgArr[0] = new C32264ClQ(c32449CoP.LIZJ, c32449CoP);
        C32449CoP c32449CoP2 = c78197UmX.LIZ;
        if (c32449CoP2.LJIIJ) {
            if (c32448CoO != null) {
                interfaceC78206Umg = c32448CoO.LIZIZ;
            }
            interfaceC78206Umg = null;
        } else {
            if (c32448CoO != null) {
                interfaceC78206Umg = c32448CoO.LIZ;
            }
            interfaceC78206Umg = null;
        }
        interfaceC78206UmgArr[1] = interfaceC78206Umg;
        C78160Ulw c78160Ulw = c32449CoP2.LIZJ;
        Effect effect = c32449CoP2.LIZ;
        if (effect != null) {
            interfaceC78206UmgArr[2] = new C78159Ulv(c78160Ulw, effect, c32449CoP2.LJIIL);
            C78200Uma c78200Uma = new C78200Uma(ORZ.LLJILJILJ(ORY.LJJIJLIJ(interfaceC78206UmgArr)));
            Effect effect2 = c78197UmX.LIZ.LIZ;
            if (effect2 != null) {
                j = effect2.LIZ().id;
            } else {
                j = 0;
            }
            C32449CoP c32449CoP3 = c78197UmX.LIZ;
            InterfaceC65784Pro<List<ImageModel>> interfaceC65784Pro = c32449CoP3.LIZLLL;
            Effect effect3 = c32449CoP3.LIZ;
            if (effect3 != null) {
                z = effect3.LIZJ;
            } else {
                z = false;
            }
            C78160Ulw c78160Ulw2 = c32449CoP3.LIZJ;
            if (effect3 != null) {
                C78161Ulx c78161Ulx = new C78161Ulx(c78160Ulw2, effect3);
                C78194UmU c78194UmU = new C78194UmU(j, interfaceC65784Pro, z, c78200Uma, c78161Ulx);
                c78200Uma.LJ(EnumC78220Umu.ALPHA_PLAYER);
                C78185UmL c78185UmL = c78197UmX.LIZJ;
                AqS144S0200000_13 aqS144S0200000_13 = new AqS144S0200000_13(c78197UmX, interfaceC78213Umn, 34);
                AqS195S0100000_13 aqS195S0100000_13 = new AqS195S0100000_13(c78194UmU, 52);
                c78185UmL.getClass();
                if (((InterfaceC77384UYq) c78185UmL.LIZIZ.getValue()).LIZIZ()) {
                    c78161Ulx.LIZLLL = true;
                    c78161Ulx.LJ();
                    c78194UmU.LJFF = (String) ((InterfaceC77384UYq) c78185UmL.LIZIZ.getValue()).getResult();
                    c78161Ulx.LIZLLL(true, null);
                    C77380UYm c77380UYm = c78185UmL.LIZJ;
                    if (c77380UYm == null) {
                        aqS144S0200000_13.invoke(c78194UmU);
                    } else {
                        c77380UYm.LIZ(new AqS144S0200000_13(c78194UmU, (C78194UmU) aqS144S0200000_13, (InterfaceC88472Yns<? super C78194UmU, C76800UCe>) 35), new AqS144S0200000_13(c78194UmU, (C78194UmU) aqS144S0200000_13, (InterfaceC88472Yns<? super C78194UmU, C76800UCe>) 36));
                    }
                } else {
                    c78161Ulx.LIZLLL = false;
                    c78161Ulx.LJ();
                    if (c78185UmL.LIZ.LJIIIIZZ) {
                        ((InterfaceC77384UYq) c78185UmL.LIZIZ.getValue()).LIZ(new AqS58S0400000_13(c78194UmU, c78161Ulx, c78185UmL, aqS144S0200000_13, 6), new AqS117S0300000_13(c78161Ulx, aqS195S0100000_13, c78194UmU, 9));
                    } else {
                        C78163Ulz c78163Ulz = new C78163Ulz(-30, "resource not found, and download is forbid", 4);
                        c78161Ulx.LIZLLL(false, c78163Ulz);
                        aqS195S0100000_13.invoke(c78194UmU, c78163Ulz);
                    }
                }
                return C76800UCe.LIZ;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$9(AqS102S0300000_13 aqS102S0300000_13) {
        C77545Uc1 c77545Uc1 = (C77545Uc1) aqS102S0300000_13.l0;
        return new ABLiveIncomeExchangeDialogVM(c77545Uc1, (Context) aqS102S0300000_13.l1, (C77453UaX) aqS102S0300000_13.l2, c77545Uc1.LJII);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS102S0300000_13(X.EnumC75614Tly r3, X.InterfaceC75959TrX r4, X.C75981Trt r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 29: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS102S0300000_13.<init>(X.Tly, X.TrX, X.Trt, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C32802Cu6 c32802Cu6, C32816CuK c32816CuK, Object obj, int i) {
        super(0);
        this.$t = i;
        this.l0 = c32802Cu6;
        this.l1 = c32816CuK;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0300000_13(R2P r2p, R2P<JoinChannelResp> r2p2, InterfaceC76768UAy<JoinChannelResult> interfaceC76768UAy, U7T u7t) {
        super(0);
        this.$t = u7t;
        this.l0 = r2p;
        this.l1 = r2p2;
        this.l2 = interfaceC76768UAy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(InterfaceC75441TjB interfaceC75441TjB, C28272B7s c28272B7s, SeiAppData seiAppData, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC75441TjB;
        this.l1 = c28272B7s;
        this.l2 = seiAppData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(InterfaceC75441TjB interfaceC75441TjB, C28272B7s c28272B7s, VoiceChatSeiAppData voiceChatSeiAppData, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC75441TjB;
        this.l1 = c28272B7s;
        this.l2 = voiceChatSeiAppData;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C75951TrP c75951TrP, U7T u7t, U4U u4u, int i) {
        super(0);
        this.$t = i;
        this.l0 = c75951TrP;
        this.l1 = u7t;
        this.l2 = u4u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C75952TrQ c75952TrQ, U7T u7t, U4V u4v, int i) {
        super(0);
        this.$t = i;
        this.l0 = c75952TrQ;
        this.l1 = u7t;
        this.l2 = u4v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0300000_13(U7Z u7z, U7Z u7z2, List<LinkUser> list, List<LinkUser> list2) {
        super(0);
        this.$t = list2;
        this.l0 = u7z;
        this.l1 = u7z2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C76689U7x c76689U7x, U7T u7t, U4Z u4z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76689U7x;
        this.l1 = u7t;
        this.l2 = u4z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C76690U7y c76690U7y, U7T u7t, C76588U4a c76588U4a, int i) {
        super(0);
        this.$t = i;
        this.l0 = c76690U7y;
        this.l1 = u7t;
        this.l2 = c76588U4a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0300000_13(C76930UHe c76930UHe, C76930UHe c76930UHe2, InterfaceC76931UHf interfaceC76931UHf, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = c76930UHe;
        this.l1 = c76930UHe2;
        this.l2 = interfaceC76931UHf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C77545Uc1 c77545Uc1, Context context, C77453UaX c77453UaX, int i) {
        super(0);
        this.$t = i;
        this.l0 = c77545Uc1;
        this.l1 = context;
        this.l2 = c77453UaX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C78192UmS c78192UmS, InterfaceC78213Umn interfaceC78213Umn, C32448CoO c32448CoO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c78192UmS;
        this.l1 = interfaceC78213Umn;
        this.l2 = c32448CoO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C78197UmX c78197UmX, InterfaceC78213Umn interfaceC78213Umn, C32448CoO c32448CoO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c78197UmX;
        this.l1 = interfaceC78213Umn;
        this.l2 = c32448CoO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C78216Umq c78216Umq, InterfaceC78213Umn interfaceC78213Umn, C32448CoO c32448CoO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c78216Umq;
        this.l1 = interfaceC78213Umn;
        this.l2 = c32448CoO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C78218Ums c78218Ums, InterfaceC78213Umn interfaceC78213Umn, C32448CoO c32448CoO, int i) {
        super(0);
        this.$t = i;
        this.l0 = c78218Ums;
        this.l1 = interfaceC78213Umn;
        this.l2 = c32448CoO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(C79259V8t c79259V8t, DownloadInfo downloadInfo, BaseException baseException, int i) {
        super(0);
        this.$t = i;
        this.l0 = c79259V8t;
        this.l1 = downloadInfo;
        this.l2 = baseException;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(Context context, C77544Uc0 c77544Uc0, C77453UaX c77453UaX, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c77544Uc0;
        this.l2 = c77453UaX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, Context context, DataChannel dataChannel, int i) {
        super(0);
        this.$t = i;
        this.l0 = multiGuestSharedBgAnchorViewModel;
        this.l1 = context;
        this.l2 = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(SeiAppData seiAppData, C28272B7s c28272B7s, MultiGuestSeiAbnormalDetector multiGuestSeiAbnormalDetector, int i) {
        super(0);
        this.$t = i;
        this.l0 = seiAppData;
        this.l1 = c28272B7s;
        this.l2 = multiGuestSeiAbnormalDetector;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(Room room, C75759ToJ c75759ToJ, InterfaceC75754ToE interfaceC75754ToE, int i) {
        super(0);
        this.$t = i;
        this.l0 = room;
        this.l1 = c75759ToJ;
        this.l2 = interfaceC75754ToE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS102S0300000_13(BattleComboInfo battleComboInfo, BattleComboInfo battleComboInfo2, U52 u52, int i) {
        super(0);
        this.$t = i;
        this.l0 = battleComboInfo;
        this.l1 = battleComboInfo2;
        this.l2 = u52;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS102S0300000_13(Throwable th, Throwable th2, InterfaceC76768UAy<JoinChannelResult> interfaceC76768UAy, U7T u7t) {
        super(0);
        this.$t = u7t;
        this.l0 = th;
        this.l1 = th2;
        this.l2 = interfaceC76768UAy;
    }
}
