package com.bytedance.android.live.liveinteract.multihost.biz.quickpairing;

import X.AbstractC75563Tl9;
import X.AbstractC75865Tq1;
import X.B5G;
import X.B83;
import X.BZI;
import X.C05040Hs;
import X.C05630Jz;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C1EW;
import X.C279017q;
import X.C28787BRn;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29927Bop;
import X.C30868C9o;
import X.C31073CHl;
import X.C32208CkW;
import X.C44878HjO;
import X.C58416MwG;
import X.C65816PsK;
import X.C73318Sq2;
import X.C73411SrX;
import X.C75547Tkt;
import X.C75607Tlr;
import X.C75639TmN;
import X.C75642TmQ;
import X.C75676Tmy;
import X.C75677Tmz;
import X.C75678Tn0;
import X.C75680Tn2;
import X.C75682Tn4;
import X.C75683Tn5;
import X.C75685Tn7;
import X.C75686Tn8;
import X.C75688TnA;
import X.C75693TnF;
import X.C75696TnI;
import X.C75708TnU;
import X.C75709TnV;
import X.C75710TnW;
import X.C75711TnX;
import X.C75716Tnc;
import X.C75759ToJ;
import X.C75877TqD;
import X.C75883TqJ;
import X.C75904Tqe;
import X.C76012TsO;
import X.C76117Tu5;
import X.C8E;
import X.EnumC75535Tkh;
import X.EnumC75546Tks;
import X.EnumC75614Tly;
import X.EnumC75636TmK;
import X.EnumC75692TnE;
import X.EnumC75697TnJ;
import X.InterfaceC29405BgP;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.Q7L;
import X.RunnableC75689TnB;
import X.UFE;
import X.X1D;
import Y.AfS19S0210000_13;
import Y.AfS24S0400000_13;
import Y.AfS62S0200000_13;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkRandomLinkMicCancelEvent;
import com.bytedance.android.live.liveinteract.api.LinkRandomLinkMicChangeTipTextEvent;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.persenter.QuickPairAbility;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog;
import com.bytedance.android.livesdk.chatroom.interact.model.RandomLinkMicExtra;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostHasAutoMatchSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.b;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class RandomLinkMicManager implements OnMessageListener, QuickPairAbility {
    public static DataChannel LJLILLLLZI;
    public static long LJLJI;
    public static long LJLJJI;
    public static C73411SrX LJLJJLL;
    public static C73411SrX LJLJL;
    public static RandomLinkMicPreviewDialog LJLL;
    public static long LJLLI;
    public static boolean LJLLILLLL;
    public static List<? extends ImageModel> LJLLJ;
    public static RandomLinkMicExtra LJLLL;
    public static int LJLZ;
    public static int LJZ;
    public static int LJZI;
    public static boolean LJZL;
    public static final RandomLinkMicManager LJLIL = new RandomLinkMicManager();
    public static final C73318Sq2 LJLJJL = new C73318Sq2();
    public static EnumC75692TnE LJLJLJ = EnumC75692TnE.IDLE;
    public static final List<AbstractC75563Tl9> LJLJLLL = new ArrayList();
    public static String LJLLLL = "";
    public static final boolean LJLLLLLL = MultiCohostHasAutoMatchSetting.INSTANCE.getValue();
    public static EnumC75546Tks LL = EnumC75546Tks.RANDOM_MATCH;
    public static final C75676Tmy LLD = C75676Tmy.LJLIL;
    public static final C75680Tn2 LLF = C75680Tn2.LJLIL;
    public static final C75639TmN LLFF = C75639TmN.LJLIL;
    public static final C75682Tn4 LLFFF = C75682Tn4.LJLIL;
    public static final C75686Tn8 LLFII = C75686Tn8.LJLIL;

    public static void LIZ() {
        Room room;
        User owner;
        Long valueOf;
        int i;
        Object obj;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("disconnect Match mState  = ");
            LIZ.append(LJLJLJ);
            C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
            if (LJLJLJ.compareTo(EnumC75692TnE.IDLE) > 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("disconnect Match mState = ");
                LIZ2.append(LJLJLJ);
                C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ2));
                int i2 = C75693TnF.LIZIZ[LJLJLJ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2 && i2 != 3) {
                        if (i2 == 4) {
                            if (C31073CHl.LIZLLL()) {
                                C65816PsK c65816PsK = new C65816PsK(Integer.valueOf(C31073CHl.LJLJI), InterfaceC30442Bx8.LLIIJLIL.LIZJ());
                                c65816PsK.LIZ(Double.valueOf(System.currentTimeMillis() / 1000));
                                while (!c65816PsK.LIZIZ.isEmpty()) {
                                    double currentTimeMillis = System.currentTimeMillis() / 1000;
                                    List<E> list = c65816PsK.LIZIZ;
                                    if (list == 0 || list.size() <= 0) {
                                        obj = null;
                                    } else {
                                        obj = ListProtector.get(c65816PsK.LIZIZ, 0);
                                    }
                                    o.LJIIIIZZ(obj, "queue.first()");
                                    if ((currentTimeMillis - ((Number) obj).doubleValue()) / 60 <= C31073CHl.LJLJJI) {
                                        break;
                                    }
                                    List<E> list2 = c65816PsK.LIZIZ;
                                    if (list2 != 0 && list2.size() > 0) {
                                        ListProtector.remove(c65816PsK.LIZIZ, 0);
                                    }
                                }
                                InterfaceC30442Bx8.LLIIJLIL.LIZ(c65816PsK.LIZIZ);
                                if (C31073CHl.LIZJ()) {
                                    BZI LIZ3 = C28787BRn.LIZ("livesdk_connection_banned");
                                    LIZ3.LJIIZILJ();
                                    LIZ3.LJIJJ(LL.getType(), "invitee_list");
                                    LIZ3.LJIJJ("anchor", "connection_type");
                                    RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
                                    if (value != null) {
                                        i = value.banTime;
                                    } else {
                                        i = 1800;
                                    }
                                    UFE.LIZIZ(i, LIZ3, "banned_time");
                                }
                            }
                            DataChannel dataChannel = LJLILLLLZI;
                            if (dataChannel != null) {
                                dataChannel.qv0(LinkRandomLinkMicCancelEvent.class, Boolean.FALSE);
                            }
                            DataChannel dataChannel2 = LJLILLLLZI;
                            if (dataChannel2 != null && (room = (Room) dataChannel2.kv0(RoomChannel.class)) != null && Long.valueOf(room.getId()) != null && (owner = room.getOwner()) != null && Long.valueOf(owner.getId()) != null) {
                                long id = room.getId();
                                User owner2 = room.getOwner();
                                if (owner2 != null && (valueOf = Long.valueOf(owner2.getId())) != null) {
                                    C75883TqJ c75883TqJ = new C75883TqJ(id, valueOf.longValue());
                                    C76012TsO c76012TsO = new C76012TsO("leave_with_user_click_disconnect", id, null, 0, 12);
                                    long LLIILZL = C8E.LIZLLL().LLIILZL();
                                    long LJJLI = C8E.LIZLLL().LJJLI();
                                    C0NB.LJ("QuickPairManager", "new arch leave link");
                                    C8E.LIZLLL().LLILLIZIL(c76012TsO, new C75716Tnc(c75883TqJ, LJJLI, LLIILZL));
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                            LIZJ(false);
                        }
                    } else {
                        C75642TmQ.LJIL = 0L;
                        C75642TmQ.LJJ = null;
                        C8E.LIZLLL().LJLJLJ(new C75904Tqe(0, B5G.LIZIZ().LJIIIIZZ, B5G.LIZIZ().LJI, 0L, "cancelInvite_quick_pair", C05040Hs.LIZIZ("cancelInvite_quick_pair")), new b());
                        LIZLLL(C75708TnU.LJLIL, C75709TnV.LJLIL, false);
                    }
                } else {
                    C75696TnI c75696TnI = C75696TnI.LJLIL;
                    LIZLLL(c75696TnI, c75696TnI, false);
                }
                C32208CkW c32208CkW = new C32208CkW(6);
                DataChannel dataChannel3 = LJLILLLLZI;
                if (dataChannel3 != null) {
                    dataChannel3.rv0(LinkCrossRoomStateChangeEvent.class, c32208CkW);
                    return;
                }
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException unused) {
        }
    }

    public static OSZ LJ() {
        if (LJLJI >= 0) {
            return new OSZ(EnumC75535Tkh.COUNTDOWN_WAITING, Long.valueOf(LJLJI));
        }
        return new OSZ(EnumC75535Tkh.TIMEOUT_WAITING, Long.valueOf(LJLJJI));
    }

    public static final boolean LJII() {
        if (LJLJLJ == EnumC75692TnE.INVITING) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ() {
        if (LJLJLJ == EnumC75692TnE.WAITING) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ() {
        if (LJLJLJ.compareTo(EnumC75692TnE.IDLE) > 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJJI() {
        if (LJLJLJ == EnumC75692TnE.WAITING || LJLJLJ == EnumC75692TnE.INVITING) {
            return true;
        }
        return false;
    }

    public static final void LJIILIIL() {
        LJLIL.getClass();
        LIZ();
    }

    public static final void LJIJ() {
        Iterator it = ((ArrayList) LJLJLLL).iterator();
        while (it.hasNext()) {
            AbstractC75563Tl9 abstractC75563Tl9 = (AbstractC75563Tl9) it.next();
            LJLIL.getClass();
            abstractC75563Tl9.LIZJ(LJ());
        }
        long j = LJLJI;
        if (j >= 0) {
            LJLJI = j - 1;
        }
        LJLJJI++;
    }

    public static void LJIIZILJ() {
        B5G.LIZIZ();
        C0NB.LJ("QuickPairManager", "on finish quick linkmic---need to retry match ");
        DataChannel dataChannel = LJLILLLLZI;
        if (dataChannel != null) {
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.k0o);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_QuickPairingNewPairingDesc)");
            dataChannel.qv0(LinkRandomLinkMicChangeTipTextEvent.class, LJIILJJIL);
        }
        LL = EnumC75546Tks.SYSTEM_REMATCH;
        if (!C29306Beo.LJIIJ(LJLILLLLZI)) {
            return;
        }
        if (LJIIIIZZ()) {
            B5G.LIZIZ().LJIILIIL(EnumC75636TmK.MATCH);
            return;
        }
        boolean z = false;
        LIZJ(false);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onreceive dataChannelisnull = ");
        if (LJLILLLLZI == null) {
            z = true;
        }
        LIZ.append(z);
        C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new RunnableC75689TnB(LJLZ, LJZ), 500L);
        new C75688TnA().LJIILLIIL("auto_match_quick_disconnect");
    }

    public static void LIZIZ(String str) {
        C279017q.LJ("doBeforeMatchLinkSucceed, source = ", str, "QuickPairManager");
        LIZLLL(C75710TnW.LJLIL, C75711TnX.LJLIL, true);
        LJIJI(EnumC75692TnE.LINKING);
        Iterator it = ((ArrayList) LJLJLLL).iterator();
        while (it.hasNext()) {
            ((AbstractC75563Tl9) it.next()).LIZIZ();
        }
    }

    public static final void LIZJ(boolean z) {
        IMessageManager iMessageManager;
        DataChannel dataChannel = LJLILLLLZI;
        if (dataChannel != null) {
            RandomLinkMicManager observerOwner = LJLIL;
            o.LJIIIZ(observerOwner, "observerOwner");
            dataChannel.jv0(observerOwner);
        }
        C0NB.LJ("QuickPairManager", "end Progress unsubscribe");
        C8E.LIZLLL().LJZI(C75607Tlr.class, LLD);
        C8E.LIZLLL().LJZI(C75683Tn5.class, LLFFF);
        C8E.LIZLLL().LJZI(C75678Tn0.class, LLF);
        C8E.LIZLLL().LJZI(C75677Tmz.class, LLFF);
        LJLJJL.LIZLLL();
        DataChannel dataChannel2 = LJLILLLLZI;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.kv0(C29927Bop.class)) != null) {
            iMessageManager.removeMessageListener(LJLIL);
        }
        RandomLinkMicPreviewDialog randomLinkMicPreviewDialog = LJLL;
        if (randomLinkMicPreviewDialog != null && randomLinkMicPreviewDialog.isShowing()) {
            randomLinkMicPreviewDialog.dismiss();
        }
        C75547Tkt.LIZ = 0L;
        LJLJLJ = EnumC75692TnE.IDLE;
        LJLJI = 0L;
        LJLJJI = 0L;
        LJLLI = 0L;
        LJLLJ = null;
        C73411SrX c73411SrX = LJLJJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        LJLJJLL = null;
        C73411SrX c73411SrX2 = LJLJL;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        LJLJL = null;
        if (z) {
            LJZL = false;
        }
        LJLL = null;
        LJLLL = null;
        LJLLILLLL = false;
    }

    public static final boolean LJIIL(int i) {
        if (i == EnumC75614Tly.RANDOM_LINK_MIC_INVITE.getType() || i == EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND.getType() || i == EnumC75614Tly.TOPIC_PAIR.getType() || i == EnumC75614Tly.TOPIC_RECOMMEND.getType()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[Catch: IllegalStateException -> 0x008a, TRY_ENTER, TryCatch #0 {IllegalStateException -> 0x008a, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0016, B:13:0x0024, B:15:0x0028, B:17:0x002e, B:18:0x0036, B:20:0x0037, B:21:0x003f, B:23:0x0040, B:25:0x0044, B:36:0x007f, B:37:0x0089), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037 A[Catch: IllegalStateException -> 0x008a, TryCatch #0 {IllegalStateException -> 0x008a, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0016, B:13:0x0024, B:15:0x0028, B:17:0x002e, B:18:0x0036, B:20:0x0037, B:21:0x003f, B:23:0x0040, B:25:0x0044, B:36:0x007f, B:37:0x0089), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILL(X.EnumC29835BnL r5) {
        /*
            java.lang.String r0 = "dialogType"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int[] r3 = X.C75693TnF.LIZ     // Catch: java.lang.IllegalStateException -> L8a
            int r0 = r5.ordinal()     // Catch: java.lang.IllegalStateException -> L8a
            r0 = r3[r0]     // Catch: java.lang.IllegalStateException -> L8a
            r2 = 1
            if (r0 != r2) goto L40
            boolean r0 = LJIIJJI()     // Catch: java.lang.IllegalStateException -> L8a
            if (r0 != 0) goto L1f
            X.TnE r1 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJLJLJ     // Catch: java.lang.IllegalStateException -> L8a
            X.TnE r0 = X.EnumC75692TnE.LINKING     // Catch: java.lang.IllegalStateException -> L8a
            if (r1 != r0) goto L1d
            goto L1f
        L1d:
            r0 = 0
            goto L20
        L1f:
            r0 = 1
        L20:
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L37
            com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog r0 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJLL     // Catch: java.lang.IllegalStateException -> L8a
            if (r0 == 0) goto L40
            boolean r0 = r0.isShowing()     // Catch: java.lang.IllegalStateException -> L8a
            if (r0 != r2) goto L40
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L8a
            r1.toString()     // Catch: java.lang.IllegalStateException -> L8a
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L8a
            throw r0     // Catch: java.lang.IllegalStateException -> L8a
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L8a
            r1.toString()     // Catch: java.lang.IllegalStateException -> L8a
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L8a
            throw r0     // Catch: java.lang.IllegalStateException -> L8a
        L40:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJLILLLLZI     // Catch: java.lang.IllegalStateException -> L8a
            if (r1 == 0) goto L7f
            java.lang.Class<X.Bhq> r0 = X.C29494Bhq.class
            java.lang.Object r4 = r1.kv0(r0)     // Catch: java.lang.IllegalStateException -> L8a
            androidx.fragment.app.FragmentManager r4 = (androidx.fragment.app.FragmentManager) r4     // Catch: java.lang.IllegalStateException -> L8a
            if (r4 == 0) goto L7f
            int r0 = r5.ordinal()
            r0 = r3[r0]
            if (r0 != r2) goto L7b
            java.util.List<? extends com.bytedance.android.live.base.model.ImageModel> r3 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJLLJ
            com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager r0 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJLIL
            r0.getClass()
            X.OSZ r2 = LJ()
            com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog r1 = new com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog
            r1.<init>()
            if (r3 == 0) goto L7c
            java.util.List r0 = X.C47261Igj.LJJJIL(r3)
        L6c:
            r1.LJLILLLLZI = r0
            r1.LJLJJL = r2
            com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJLL = r1
            java.lang.Class<com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog> r0 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.ui.dialog.RandomLinkMicPreviewDialog.class
            java.lang.String r0 = r0.getName()
            r1.show(r4, r0)
        L7b:
            return
        L7c:
            X.OQg r0 = X.C61878OQg.INSTANCE
            goto L6c
        L7f:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalStateException -> L8a
            r1.toString()     // Catch: java.lang.IllegalStateException -> L8a
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L8a
            throw r0     // Catch: java.lang.IllegalStateException -> L8a
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJIILL(X.BnL):void");
    }

    public static void LJIJI(EnumC75692TnE enumC75692TnE) {
        LJLJLJ = enumC75692TnE;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update State = ");
        LIZ.append(enumC75692TnE);
        C0NB.LJ("QuickPairManager", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        if (iMessage != null && (iMessage instanceof LinkMessage) && ((LinkMessage) iMessage).messageType == 16) {
            try {
                C75688TnA c75688TnA = new C75688TnA();
                AbstractC75865Tq1.LJIIL(c75688TnA, "cost", Long.valueOf(SystemClock.uptimeMillis() - C75547Tkt.LIZ));
                c75688TnA.LJIILLIIL("auto_match_msg");
                LinkerRandomMatchContent linkerRandomMatchContent = ((LinkMessage) iMessage).randomMatchContent;
                if (linkerRandomMatchContent == null || linkerRandomMatchContent.roomId == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    User user = linkerRandomMatchContent.user;
                    if (user != null) {
                        user.getId();
                    }
                    if (LJLJLJ == EnumC75692TnE.WAITING) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (C76117Tu5.LIZIZ()) {
                            C30868C9o.LJI("receive topic match msg");
                        }
                        String str = linkerRandomMatchContent.matchId;
                        o.LJIIIIZZ(str, "randomMatchContent.matchId");
                        LJLLLL = str;
                        LinkCrossRoomDataHolder LIZIZ = B5G.LIZIZ();
                        long j3 = linkerRandomMatchContent.roomId;
                        User user2 = linkerRandomMatchContent.user;
                        if (user2 != null) {
                            j = user2.getId();
                        } else {
                            j = 0;
                        }
                        long j4 = linkerRandomMatchContent.innerChannelId;
                        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                        if (room != null) {
                            j2 = room.getId();
                        } else {
                            j2 = 0;
                        }
                        try {
                            if (LIZIZ.LJFF == 0) {
                                if (!LIZIZ.LJJJJJ) {
                                    if (LJLILLLLZI != null) {
                                        if (j3 != 0) {
                                            if (j != 0) {
                                                if (j2 != 0) {
                                                    StringBuilder LIZ = X1D.LIZ();
                                                    LIZ.append("receive Message =");
                                                    LIZ.append(linkerRandomMatchContent);
                                                    C0NB.LIZIZ("QuickPairManager", X1D.LIZIZ(LIZ));
                                                    new C75688TnA().LJIILLIIL("auto_match_msg_succeed");
                                                    LinkCrossRoomDataHolder LIZIZ2 = B5G.LIZIZ();
                                                    LIZIZ2.LJJJJJ = true;
                                                    LIZIZ2.LJIIL = true;
                                                    LIZIZ2.LIZLLL = true;
                                                    LIZIZ2.LJI = j;
                                                    LIZIZ2.LJIIIIZZ = j3;
                                                    LIZIZ2.LJII = j2;
                                                    C75877TqD.LJIILLIIL = "quick_pair";
                                                    if (j4 != 0) {
                                                        C44878HjO.LIZJ("use cross Arch begin quickpair invite, innerChannelId = ", j4, "QuickPairManager");
                                                    } else {
                                                        C0NB.LJIIIZ("QuickPairManager", "use multi Arch begin quick pair invite");
                                                    }
                                                    HashMap hashMap = new HashMap();
                                                    hashMap.put("vendor", 12);
                                                    hashMap.put("sec_to_user_id", "");
                                                    hashMap.put("invite_type", Integer.valueOf(LIZIZ2.LJIIJ.getType()));
                                                    hashMap.put("match_type", 1);
                                                    hashMap.put("request_id", LIZIZ2.LJJJIL);
                                                    C75642TmQ.LJIL = j;
                                                    C75642TmQ.LJJ = null;
                                                    C8E.LIZLLL().LLJI(new C75759ToJ(0, j3, j, j4, 0L, MtCoHostInviteTimeOutSetting.INSTANCE.getValue(), null, hashMap, "invite_quick_pair", C05040Hs.LIZIZ("invite_quick_pair"), 64), new C75685Tn7(LIZIZ2));
                                                    JSONObject jSONObject = new JSONObject();
                                                    C05630Jz.LJI(jSONObject, "match_id", LJLLLL);
                                                    C58416MwG.LIZLLL.LJIIJJI("auto_match_message", jSONObject);
                                                    return;
                                                }
                                                "Failed requirement.".toString();
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                            "Failed requirement.".toString();
                                            throw new IllegalArgumentException("Failed requirement.");
                                        }
                                        "Failed requirement.".toString();
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                "Check failed.".toString();
                                throw new IllegalStateException("Check failed.");
                            }
                            "Check failed.".toString();
                            throw new IllegalStateException("Check failed.");
                        } catch (Exception unused) {
                            C0NB.LIZIZ("QuickPairManager", "onMessage, Exception --- 3");
                            return;
                        }
                    }
                    "Check failed.".toString();
                    throw new IllegalStateException("Check failed.");
                }
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            } catch (IllegalArgumentException unused2) {
                C0NB.LIZIZ("QuickPairManager", "onMessage, IllegalArgumentException --- 1");
            } catch (IllegalStateException unused3) {
                C0NB.LIZIZ("QuickPairManager", "onMessage, IllegalStateException --- 2");
            }
        }
    }

    public static void LJIILLIIL(DataChannel dataChannel, EnumC75697TnJ entranceType) {
        long j;
        long j2;
        o.LJIIIZ(entranceType, "entranceType");
        LJLILLLLZI = dataChannel;
        RandomLinkMicManager randomLinkMicManager = LJLIL;
        randomLinkMicManager.getClass();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j2 = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j2 = 0;
        }
        if (j == 0 || j2 == 0) {
            LIZJ(false);
            return;
        }
        if (LJLLILLLL) {
            return;
        }
        LJLLILLLL = true;
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "room_id", j);
        C05630Jz.LJFF(jSONObject, "record_id", j);
        C05630Jz.LJFF(jSONObject, "user_id", j2);
        C58416MwG c58416MwG = C58416MwG.LIZLLL;
        c58416MwG.LJIIJ(jSONObject);
        c58416MwG.LJIIIZ("auto_match", null);
        LJIJI(EnumC75692TnE.WAITING);
        new C75688TnA().LJIILLIIL("auto_match_request");
        C75547Tkt.LIZ = SystemClock.uptimeMillis();
        LJLJJL.LIZ(C1EW.LIZ(((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).randomLinkMicAutoMatch(j, j2, "", Calendar.getInstance().getTimeZone().getID(), Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000)).LJJJLIIL(new AfS24S0400000_13(null, entranceType, new C75688TnA(), randomLinkMicManager, 1), new AfS62S0200000_13(entranceType, (Object) null, 14)));
    }

    public static void LIZLLL(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z) {
        long j;
        String str;
        User user;
        User user2;
        Room room;
        DataChannel dataChannel = LJLILLLLZI;
        long j2 = 0;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        DataChannel dataChannel2 = LJLILLLLZI;
        if (dataChannel2 != null && (user2 = (User) dataChannel2.kv0(RoomUserChannel.class)) != null) {
            j2 = user2.getId();
        }
        DataChannel dataChannel3 = LJLILLLLZI;
        if (dataChannel3 == null || (user = (User) dataChannel3.kv0(RoomUserChannel.class)) == null || (str = user.getSecUid()) == null) {
            str = "";
        }
        C58416MwG.LIZLLL.LJIIIZ("cancel_match", null);
        C75688TnA c75688TnA = new C75688TnA();
        AbstractC75865Tq1.LJIIIZ(c75688TnA.LIZIZ, "is_match_success", Integer.valueOf(z ? 1 : 0), true);
        AbstractC75865Tq1.LJIIL(c75688TnA, "cost", Long.valueOf(SystemClock.uptimeMillis() - C75547Tkt.LIZ));
        c75688TnA.LJIILLIIL("auto_match_cancel");
        C75688TnA c75688TnA2 = new C75688TnA();
        LJLJJL.LIZ(C1EW.LIZ(((CoHostApi) Q7L.LIZIZ(CoHostApi.class)).randomLinkMicCancelMatch(j, C8E.LIZLLL().LLIILZL(), j2, str)).LJJJLIIL(new AfS19S0210000_13(c75688TnA2, z, interfaceC65784Pro, 0), new AfS62S0200000_13(c75688TnA2, interfaceC65784Pro2, 13)));
    }
}
