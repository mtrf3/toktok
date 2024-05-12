package com.bytedance.android.live.liveinteract.voicechat.main.guest;

import X.BPP;
import X.BYM;
import X.BYO;
import X.BYP;
import X.C03880Dg;
import X.C05170If;
import X.C09650Zl;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C1VE;
import X.C221108m2;
import X.C28272B7s;
import X.C29235Bdf;
import X.C29237Bdh;
import X.C29241Bdl;
import X.C29306Beo;
import X.C29401Dk;
import X.C29494Bhq;
import X.C2A6;
import X.C30101Gc;
import X.C30111Gd;
import X.C30868C9o;
import X.C31657Cbd;
import X.C32014ChO;
import X.C41021jG;
import X.C41031jH;
import X.C47071t1;
import X.C47261Igj;
import X.C5H3;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C73040SlY;
import X.C74650TRm;
import X.C74740TUy;
import X.C74751TVj;
import X.C74752TVk;
import X.C74765TVx;
import X.C74770TWc;
import X.C74801TXh;
import X.C74804TXk;
import X.C74815TXv;
import X.C74824TYe;
import X.C74838TYs;
import X.C74969TbZ;
import X.C74971Tbb;
import X.C75017TcL;
import X.C75023TcR;
import X.C75559Tl5;
import X.C77800Ug8;
import X.C78866UxK;
import X.C78886Uxe;
import X.C78996UzQ;
import X.C79234V7u;
import X.C8E;
import X.C8VV;
import X.CN1;
import X.DialogC77438UaI;
import X.InterfaceC74236TBo;
import X.InterfaceC74605TPt;
import X.InterfaceC74617TQf;
import X.InterfaceC74695TTf;
import X.InterfaceC74834TYo;
import X.InterfaceC75011TcF;
import X.InterfaceC75441TjB;
import X.TBT;
import X.TQV;
import X.TQW;
import X.TSQ;
import X.TW7;
import X.TWR;
import X.TX5;
import X.TX7;
import X.TX8;
import X.TX9;
import X.TXC;
import X.TXE;
import X.TXF;
import X.TYN;
import X.U44;
import X.X1D;
import Y.IDDListenerS152S0100000_13;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithConfirmEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestLinkPlayerListChange;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment;
import com.bytedance.android.live.liveinteract.platform.common.monitor.DeepLinkEnterMultiLiveRoomDataHandler;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.common.VoiceChatUserInfoFragment;
import com.bytedance.android.live.liveinteract.voicechat.main.userinfo.guest.VoiceChatGuestUserInfoDialog;
import com.bytedance.android.livesdk.chatroom.model.interact.CheckPermissionExtra;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3BackgroundFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkGeckoDslDownloadSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.AqS68S0110000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatWatchWidget extends AbsVoiceChatWidget implements InterfaceC74617TQf {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public TQV LJLILLLLZI;
    public Room LJLJI;
    public LiveDialog LJLJJLL;
    public C74815TXv LJLJLJ;
    public VoiceChatGuestUserInfoDialog LJLJLLL;
    public TWR LJLL;
    public final TYN LJLLILLLL;
    public VoiceChatGuestWidget LJLLJ;
    public LiveDialog LJLLL;
    public Runnable LJLLLL;
    public VoiceChatGoLiveFragment LJLLLLLL;
    public final C31657Cbd LJLJJI = new C31657Cbd("MULTI_GUEST_DATA_HOLDER");
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 162));
    public final C5H3 LJLJL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 37));
    public TXF LJLLI = TXF.SEND_REQUEST;

    static {
        TBT tbt = new TBT(VoiceChatWatchWidget.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt};
    }

    public static void LJZI(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "6685910654171599669")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    public static void LJZL(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "6685910654171599669")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean LJLZ() {
        return false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dl3;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String LLF() {
        if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
            StackTraceElement LJ = C32014ChO.LJ();
            StringBuilder LIZ = X1D.LIZ();
            return C77800Ug8.LIZLLL(U44.BIZ, LIZ, "_VoiceChatWatchWidget_", LJ, LIZ);
        }
        return "VoiceChatWatchWidget";
    }

    public final void buildDialog() {
        if (this.LJLL == null) {
            this.LJLL = new TWR(-1, 1, 0, 0, 60);
        }
        DataChannel dataChannel = this.dataChannel;
        o.LJIIIIZZ(dataChannel, "dataChannel");
        C74815TXv c74815TXv = this.LJLJLJ;
        WeakReference<TQV> weakReference = new WeakReference<>(this.LJLILLLLZI);
        TXF txf = this.LJLLI;
        TWR twr = this.LJLL;
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog = new VoiceChatGuestUserInfoDialog();
        voiceChatGuestUserInfoDialog.dataChannel = dataChannel;
        voiceChatGuestUserInfoDialog.LJLIL = c74815TXv;
        voiceChatGuestUserInfoDialog.LJLILLLLZI = weakReference;
        voiceChatGuestUserInfoDialog.LJLJI = txf;
        voiceChatGuestUserInfoDialog.LJLJJI = twr;
        this.LJLJLLL = voiceChatGuestUserInfoDialog;
        C0NB.LIZIZ("VoiceChatWatchWidget", "buildDialog");
    }

    @Override // X.InterfaceC74617TQf
    public final void dismissApplyDialogIfNeed() {
        LiveBaseFragment liveBaseFragment;
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog2 = this.LJLJLLL;
        if (voiceChatGuestUserInfoDialog2 != null && voiceChatGuestUserInfoDialog2.isShowing()) {
            VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog3 = this.LJLJLLL;
            if (voiceChatGuestUserInfoDialog3 != null) {
                liveBaseFragment = voiceChatGuestUserInfoDialog3.LJLJJL;
            } else {
                liveBaseFragment = null;
            }
            if ((liveBaseFragment instanceof VoiceChatUserInfoFragment) && this.LJLLI == TXF.GO_LIVE && (voiceChatGuestUserInfoDialog = this.LJLJLLL) != null) {
                voiceChatGuestUserInfoDialog.dismiss();
            }
        }
    }

    @Override // X.InterfaceC74617TQf
    public final void forceDismissApplyDialog() {
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog2 = this.LJLJLLL;
        if (voiceChatGuestUserInfoDialog2 != null && voiceChatGuestUserInfoDialog2.isShowing() && (voiceChatGuestUserInfoDialog = this.LJLJLLL) != null) {
            voiceChatGuestUserInfoDialog.dismiss();
        }
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return VoiceChatWatchWidget.class.getName();
    }

    @Override // X.InterfaceC74617TQf
    public final void showKickOutDialog() {
        LiveDialog liveDialog;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && o.LJ(dataChannel.kv0(PIPStatusData.class), Boolean.TRUE)) {
            return;
        }
        if (this.LJLJJLL == null) {
            C47071t1 c47071t1 = new C47071t1(this.context);
            c47071t1.LJFF(R.string.n_d);
            c47071t1.LJIIL(R.string.njj, TX7.LJLIL);
            LiveDialog LIZ = c47071t1.LIZ();
            this.LJLJJLL = LIZ;
            LIZ.setCanceledOnTouchOutside(false);
        }
        LiveDialog liveDialog2 = this.LJLJJLL;
        if (liveDialog2 != null && (liveDialog = (LiveDialog) C78866UxK.LJIJI(liveDialog2, 6, false, false, false, 122)) != null) {
            LJZI(liveDialog);
        }
        forceDismissApplyDialog();
    }

    public VoiceChatWatchWidget() {
        TYN tyn = new TYN(false);
        C74650TRm.LIZ = false;
        this.LJLLILLLL = tyn;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Room room;
        TQW tqw;
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        ViewGroup viewGroup = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LJLJI = room;
        if (room != null) {
            TQV tqv = new TQV(room);
            this.LJLILLLLZI = tqv;
            tqv.attachView(this);
        }
        ((TSQ) this.LJLJJL.getValue()).LIZLLL();
        View view = getView();
        if (view instanceof FrameLayout) {
            viewGroup = (ViewGroup) view;
        }
        if (viewGroup != null) {
            TYN tyn = this.LJLLILLLL;
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            tyn.getClass();
            Fragment LJIIIZ = C79234V7u.LJIIIZ(viewGroup);
            if (LJIIIZ != null) {
                tyn.LJLILLLLZI = LJIIIZ;
                C8VV.LIZ(LJIIIZ, false, new AqS57S0400000_12(LJIIIZ, dataChannel2, tyn, viewGroup, 17));
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null && (tqw = (TQW) dataChannel3.kv0(C74971Tbb.class)) != null) {
                tqw.LIZIZ(this.LJLLILLLL);
            }
        }
        C74740TUy.LIZLLL().LJI(0);
        DataChannel dataChannel4 = this.dataChannel;
        dataChannel4.mv0(GuestDisconnectByWindowWithConfirmEvent.class, this, new AqS179S0100000_13(this, 243));
        dataChannel4.mv0(GuestApplyEvent.class, this, new AqS179S0100000_13(this, 244));
        dataChannel4.mv0(InteractStateChangeEvent.class, this, new AqS179S0100000_13(this, 245));
        dataChannel4.mv0(GuestDisconnectByWindowEvent.class, this, new AqS179S0100000_13(this, 246));
        C74838TYs.LJ().LJJIJIIJI = false;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        TQV tqv = this.LJLILLLLZI;
        if (tqv != null) {
            tqv.detachView();
        }
        ((TSQ) this.LJLJJL.getValue()).LJ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        Room room;
        InterfaceC74695TTf LLIIJLIL;
        super.onPause();
        TQV tqv = this.LJLILLLLZI;
        if (tqv != null) {
            tqv.LJLJJI = true;
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
                LLIIJLIL.LIZJ(true);
            }
            if (C29306Beo.LJIL(tqv.LL)) {
                tqv.LL = Boolean.TRUE;
                if (LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
                    DataChannel dataChannel = tqv.dataChannel;
                    if (dataChannel != null) {
                        room = C29306Beo.LJJIJLIJ(dataChannel);
                    } else {
                        room = null;
                    }
                    C74751TVj.LJIIIIZZ(false, room);
                }
                if (C78886Uxe.LJJJJZ(C8E.LJ()) != 5) {
                    C78886Uxe.LJJJJZ(C8E.LJ());
                }
                C1VE c1ve = (C1VE) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_REVIEW_MANAGER");
                if (c1ve != null) {
                    c1ve.LJ();
                }
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        InterfaceC74695TTf LLIIJLIL;
        super.onResume();
        TQV tqv = this.LJLILLLLZI;
        if (tqv != null) {
            tqv.LJLJJI = false;
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LLIIJLIL = R6.LLIIJLIL()) != null) {
                LLIIJLIL.LIZJ(false);
            }
            if (C29306Beo.LJJIFFI(tqv.LL) && LinkMicMultiGuestV3BackgroundFixSetting.INSTANCE.getValue()) {
                C74751TVj.LJIIIZ(false);
            }
            if (C29306Beo.LJJ(tqv.LL)) {
                tqv.LL = Boolean.FALSE;
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void LJZ(boolean z) {
        C74801TXh.LIZJ(this.LJLJI, new AqS68S0110000_13(z, this, 0));
    }

    @Override // X.InterfaceC74617TQf
    public final void Tp(C74765TVx c74765TVx) {
        Integer num;
        Long l = c74765TVx.LIZ;
        InterfaceC74834TYo interfaceC74834TYo = null;
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        } else {
            num = null;
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == 20048) {
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            BYM.LIZLLL(context, this.dataChannel);
            return;
        }
        if (num.intValue() == 31002) {
            return;
        }
        if (num.intValue() == 31011) {
            BYM.LIZ(this, this.dataChannel);
            return;
        }
        if (num.intValue() == 4003037) {
            Context context2 = this.context;
            BYP byp = BYP.BAN_FOR_BROADCASTING;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                interfaceC74834TYo = (InterfaceC74834TYo) dataChannel.kv0(C74969TbZ.class);
            }
            BYO.LIZIZ(context2, this, byp, interfaceC74834TYo);
            return;
        }
        if (num.intValue() == 4003036) {
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.moi));
            return;
        }
        if (num.intValue() == 4003088) {
            int i = c74765TVx.LIZJ;
            Context context3 = this.context;
            o.LJIIIIZZ(context3, "context");
            BYM.LIZJ(context3, this.dataChannel, i);
            return;
        }
        if (num.intValue() != 4003089) {
            return;
        }
        int i2 = c74765TVx.LIZJ;
        Context context4 = this.context;
        o.LJIIIIZZ(context4, "context");
        BYM.LIZIZ(context4, this.dataChannel, i2);
    }

    @Override // X.InterfaceC74617TQf
    public final void X9(boolean z) {
        InterfaceC74605TPt interfaceC74605TPt = null;
        if (z) {
            TQV tqv = this.LJLILLLLZI;
            if (tqv != null) {
                interfaceC74605TPt = tqv.LJLJI;
            }
            VoiceChatGuestWidget voiceChatGuestWidget = new VoiceChatGuestWidget(interfaceC74605TPt);
            TX9 tx9 = this.LJLIL;
            if (tx9 != null) {
                tx9.LIZIZ(voiceChatGuestWidget);
            }
            this.LJLLJ = voiceChatGuestWidget;
            return;
        }
        VoiceChatGuestWidget voiceChatGuestWidget2 = this.LJLLJ;
        if (voiceChatGuestWidget2 != null) {
            voiceChatGuestWidget2.LJLJI = true;
            TX9 tx92 = this.LJLIL;
            if (tx92 != null) {
                tx92.LIZ(voiceChatGuestWidget2);
            }
            voiceChatGuestWidget2.LJLJI = false;
        }
        this.LJLLJ = null;
        Runnable runnable = this.LJLLLL;
        if (runnable != null) {
            runnable.run();
        }
        this.LJLLLL = null;
    }

    @Override // X.InterfaceC74617TQf
    public final void iA(TXC txc) {
        Room room;
        long j;
        Throwable th = txc.LIZ;
        if (!(th instanceof C29401Dk)) {
            BPP.LIZJ(this.context, th);
            return;
        }
        C29401Dk c29401Dk = (C29401Dk) th;
        User user = null;
        LifecycleOwner lifecycleOwner = null;
        switch (c29401Dk.getErrorCode()) {
            case 20048:
                Context context = getContext();
                o.LJIIIIZZ(context, "getContext()");
                BYM.LIZLLL(context, this.dataChannel);
                return;
            case 31002:
                CheckPermissionExtra checkPermissionExtra = (CheckPermissionExtra) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, c29401Dk.getExtra(), CheckPermissionExtra.class);
                if (checkPermissionExtra == null) {
                    return;
                }
                List<LinkPayPlan> list = checkPermissionExtra.payPlans;
                String str = checkPermissionExtra.payHint;
                if (list == null || list.isEmpty()) {
                    C30868C9o.LIZJ(R.string.srk);
                    return;
                }
                MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) this.LJLJJI.LIZ(this, LJLZ[0]);
                if (multiGuestDataHolder != null) {
                    j = multiGuestDataHolder.LJJIZ;
                } else {
                    j = 0;
                }
                showApplyDialog(true, list, str, j);
                return;
            case 31011:
                BYM.LIZ(this, this.dataChannel);
                return;
            case 4003036:
                C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.moi));
                return;
            case 4003037:
                TQV tqv = this.LJLILLLLZI;
                if (tqv == null) {
                    return;
                }
                Context context2 = this.context;
                BYP byp = BYP.BAN_FOR_BROADCASTING;
                T t = tqv.mView;
                if (t instanceof LifecycleOwner) {
                    lifecycleOwner = (LifecycleOwner) t;
                }
                BYO.LIZIZ(context2, lifecycleOwner, byp, (InterfaceC74834TYo) tqv.LJLZ.getValue());
                return;
            case 4003088:
                Activity LJIILJJIL = g0.LJIILJJIL(this.context);
                if (LJIILJJIL == null) {
                    return;
                }
                ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).showGuideBirthdayEditDialog(LJIILJJIL, "live_co_host", C75017TcL.LIZJ(0), new C29237Bdh(0, this));
                C75017TcL.LJJ(0);
                return;
            case 4003089:
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    room = (Room) dataChannel.kv0(RoomChannel.class);
                } else {
                    room = null;
                }
                C47071t1 c47071t1 = new C47071t1(this.context);
                c47071t1.LJIILL = false;
                c47071t1.LJIILJJIL = false;
                c47071t1.LIZJ = C15380j0.LJIILL(R.string.k98, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.k97);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_agegate_popup16_desc)");
                String LJJJJZ = ujb.o.LJJJJZ(LJIILJJIL2, "{username}", "%s", false);
                Object[] objArr = new Object[1];
                if (room != null) {
                    user = room.getOwner();
                }
                objArr[0] = C05170If.LIZ(user);
                String LLLZ = C16880lQ.LLLZ(LJJJJZ, Arrays.copyOf(objArr, 1));
                o.LJIIIIZZ(LLLZ, "format(format, *args)");
                c47071t1.LJII(LLLZ);
                c47071t1.LJIIIZ(R.string.nol, new C29241Bdl(0));
                c47071t1.LJIIL(R.string.spm, new C29235Bdf(0, this));
                LJZI(c47071t1.LIZ());
                C75017TcL.LJIJI(0);
                return;
            default:
                BPP.LIZJ(this.context, th);
                return;
        }
    }

    public final void onInteractIconClick(boolean z) {
        TQV tqv;
        InterfaceC75011TcF JR;
        String str;
        C0NB.LIZIZ("VoiceChatWatchWidget", "onInteractIconClick");
        if (C78886Uxe.LJJJJZ(C8E.LJ()) == 5) {
            C2A6 c2a6 = new C2A6(C8E.LIZ().getTopActivity());
            C41021jG c41021jG = new C41021jG();
            c41021jG.LIZ = C15380j0.LJIILJJIL(R.string.now);
            c41021jG.LIZJ = new TX5(this);
            c2a6.LIZIZ(C47261Igj.LJJIJ(new C41031jH(c41021jG)));
            C30101Gc c30101Gc = new C30101Gc();
            c30101Gc.LIZ = C15380j0.LJIILJJIL(R.string.snx);
            c30101Gc.LIZJ = C73040SlY.LJLIL;
            c2a6.LIZLLL = new C30111Gd(c30101Gc);
            LiveActionSheetDialog LIZ = c2a6.LIZ();
            if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/view/sheet/action/LiveActionSheetDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "6685910654171599669")).LIZ) {
                return;
            }
            LIZ.show();
            return;
        }
        DeepLinkEnterMultiLiveRoomDataHandler LIZ2 = C74752TVk.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZJ();
        }
        for (TXE txe : (TXE[]) this.LJLJL.getValue()) {
            if (txe.LJIIIZ()) {
                C0NB.LJ("VoiceChatWatchWidget", "intercept interact icon click");
                return;
            }
        }
        if (z) {
            this.LJLL = null;
        }
        if (LinkMicSdkGeckoDslDownloadSetting.getValue() && (tqv = this.LJLILLLLZI) != null && (JR = ((ILinkMicService) CN1.LIZ(ILinkMicService.class)).JR()) != null && (str = tqv.LJLLJ) != null && !JR.LJIILL(str)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("do not have layoutId:");
            LIZ3.append(str);
            C0NB.LJ("VoiceChatWatchPresenter", X1D.LIZIZ(LIZ3));
            C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.kgb));
            C74824TYe.LJJIIZ("currentDslLayoutExistsIfLink");
            C0NB.LJ("VoiceChatWatchWidget", "layoutId not exists");
            return;
        }
        C75023TcR.LIZLLL.LIZJ("key_checkLinkMicJoinPermission");
        TQV tqv2 = this.LJLILLLLZI;
        if (tqv2 == null) {
            return;
        }
        AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(tqv2, 348);
        Long l = tqv2.getMultiGuestDataHolder().LJJJ;
        if ((l == null || l.longValue() != 0) && (tqv2.getMultiGuestDataHolder().LJJIJLIJ == -1 || tqv2.getMultiGuestDataHolder().LJJIJLIJ == 0)) {
            MultiLiveUserSettings multiLiveUserSettings = tqv2.LJLIL.multiLiveUserSettings;
            if (multiLiveUserSettings != null && multiLiveUserSettings.P()) {
                C74765TVx c74765TVx = new C74765TVx(0, tqv2.getMultiGuestDataHolder().LJJJI, tqv2.getMultiGuestDataHolder().LJJJ);
                InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) tqv2.mView;
                if (interfaceC74617TQf == null) {
                    return;
                }
                interfaceC74617TQf.Tp(c74765TVx);
                return;
            }
            C74770TWc.LIZIZ(tqv2.LJLIL, tqv2.dataChannel, (InterfaceC74617TQf) tqv2.mView, 0, false, null, null, new AqS175S0200000_13(tqv2, aqS179S0100000_13, 8), null);
            return;
        }
        aqS179S0100000_13.invoke(Integer.valueOf(tqv2.getMultiGuestDataHolder().LJJIJLIJ));
    }

    @Override // X.InterfaceC74617TQf
    public final void onPlayerListChange(List<? extends LinkPlayerInfo> players) {
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        DataChannel dataChannel;
        o.LJIIIZ(players, "players");
        if (isViewValid() && (voiceChatGuestUserInfoDialog = this.LJLJLLL) != null && voiceChatGuestUserInfoDialog.isShowing() && (dataChannel = this.dataChannel) != null) {
            dataChannel.qv0(GuestLinkPlayerListChange.class, new C74804TXk(players, false));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void onSei(C28272B7s c28272B7s) {
        TQV tqv = this.LJLILLLLZI;
        if (tqv != null) {
            ((TW7) tqv.LJZI.getValue()).onSei(c28272B7s);
        }
    }

    public final void showPermissionOffDialog(String str) {
        C47071t1 c47071t1 = new C47071t1(this.context);
        c47071t1.LJIILL = true;
        c47071t1.LJIILJJIL = false;
        c47071t1.LJII(str);
        c47071t1.LJIIL(R.string.njj, TX8.LJLIL);
        LJZI(c47071t1.LIZ());
    }

    @Override // X.InterfaceC74617TQf
    public final void yq0(int i) {
        FragmentManager fragmentManager;
        TQV tqv;
        forceDismissApplyDialog();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (tqv = this.LJLILLLLZI) != null) {
            VoiceChatGoLiveFragment voiceChatGoLiveFragment = new VoiceChatGoLiveFragment();
            voiceChatGoLiveFragment.LJLJI = Integer.valueOf(i);
            voiceChatGoLiveFragment.LJLJJI = tqv;
            this.LJLLLLLL = voiceChatGoLiveFragment;
            C78866UxK.LJIJJ(voiceChatGoLiveFragment, 3, true, true, null, 0, 240);
            VoiceChatGoLiveFragment voiceChatGoLiveFragment2 = this.LJLLLLLL;
            if (voiceChatGoLiveFragment2 != null) {
                voiceChatGoLiveFragment2.setOnDismissListener(new IDDListenerS152S0100000_13(this, 10));
            }
            VoiceChatGoLiveFragment voiceChatGoLiveFragment3 = this.LJLLLLLL;
            if (voiceChatGoLiveFragment3 != null) {
                voiceChatGoLiveFragment3.show(fragmentManager, C16880lQ.LJLLJ(VoiceChatGoLiveFragment.class));
            }
        }
    }

    public final void onMultiLivePermissionOff(boolean z, boolean z2) {
        VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog;
        if (!z && (voiceChatGuestUserInfoDialog = this.LJLJLLL) != null && voiceChatGuestUserInfoDialog.isShowing()) {
            VoiceChatGuestUserInfoDialog voiceChatGuestUserInfoDialog2 = this.LJLJLLL;
            if (voiceChatGuestUserInfoDialog2 != null) {
                voiceChatGuestUserInfoDialog2.dismiss();
            }
            if (z2) {
                String LJIILJJIL = C15380j0.LJIILJJIL(R.string.oky);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_takingfollowers)");
                showPermissionOffDialog(LJIILJJIL);
            } else {
                String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.kgx);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_closingrequests)");
                showPermissionOffDialog(LJIILJJIL2);
            }
        }
    }

    public final void LL(Runnable runnable, boolean z, String str, boolean z2) {
        int i;
        this.LJLLLL = runnable;
        TQV tqv = this.LJLILLLLZI;
        if (tqv != null) {
            if (z) {
                i = 10005;
            } else {
                i = 10003;
            }
            tqv.exitInteractInNormalWay(str, false, i);
        }
        if (z2) {
            C74751TVj.LJIIL("live_over");
            C74751TVj.LJIIJJI("live_over");
        } else {
            C74751TVj.LJIIL("connection_over");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean interceptCloseRoom(java.lang.Runnable r8, boolean r9, boolean r10, X.C28268B7o r11) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "linkPlayerState:"
            r1.append(r0)
            X.TUy r0 = X.C74740TUy.LIZLLL()
            T r0 = r0.LIZIZ
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "VoiceChatWatchWidget"
            X.C0NB.LIZIZ(r0, r1)
            X.TUy r0 = X.C74740TUy.LIZLLL()
            T r0 = r0.LIZIZ
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r5 = "live_end"
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L34
        L29:
            X.TUy r0 = X.C74740TUy.LIZLLL()
            T r0 = r0.LIZIZ
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto Lbd
        L33:
            return r3
        L34:
            int r0 = r0.intValue()
            if (r4 != r0) goto L29
            r2 = 0
            if (r11 == 0) goto L45
            int r0 = r11.LIZIZ
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            if (r6 != 0) goto La2
        L45:
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingLeaveAlertSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingLeaveAlertSetting.INSTANCE
            boolean r0 = r0.needSecondConfirm()
        L4b:
            if (r0 == 0) goto Laa
            com.bytedance.android.live.design.app.LiveDialog r0 = r7.LJLLL
            if (r0 == 0) goto L57
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto Lf6
        L57:
            X.1t1 r4 = new X.1t1
            android.content.Context r0 = r7.getContext()
            r4.<init>(r0)
            r0 = 2131837872(0x7f1143b0, float:1.9308951E38)
            r4.LJIILLIIL(r0)
            r0 = 2131837871(0x7f1143af, float:1.930895E38)
            r4.LJFF(r0)
            r4.LIZIZ = r7
            Y.IDcS17S0300000_13 r1 = new Y.IDcS17S0300000_13
            r0 = 1
            r1.<init>(r11, r7, r8, r0)
            r0 = 2131837869(0x7f1143ad, float:1.9308945E38)
            r4.LJIIL(r0, r1)
            Y.IDcS172S0100000_13 r1 = new Y.IDcS172S0100000_13
            r0 = 6
            r1.<init>(r11, r0)
            r0 = 2131837870(0x7f1143ae, float:1.9308947E38)
            r4.LJIIIZ(r0, r1)
            com.bytedance.android.live.design.app.LiveDialog r0 = r4.LIZ()
            r7.LJLLL = r0
            r0.setCanceledOnTouchOutside(r3)
            com.bytedance.android.live.design.app.LiveDialog r0 = r7.LJLLL
            if (r0 == 0) goto L96
            LJZI(r0)
        L96:
            if (r11 == 0) goto L9e
            int r0 = r11.LIZ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L9e:
            X.C74824TYe.LJJJI(r3, r3, r2)
            goto Lf6
        La2:
            int r1 = r6.intValue()
            r0 = 49
            if (r1 != r0) goto Lae
        Laa:
            r7.LL(r8, r3, r5, r4)
            goto Lf6
        Lae:
            int r1 = r6.intValue()
            r0 = 50
            if (r1 != r0) goto L45
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingSlideAndBarIconSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestApplyingSlideAndBarIconSetting.INSTANCE
            boolean r0 = r0.needSecondConfirmWhenSlide()
            goto L4b
        Lbd:
            int r1 = r0.intValue()
            r0 = 2
            if (r0 != r1) goto L33
            if (r10 == 0) goto Lf9
            X.UaH r2 = new X.UaH
            android.content.Context r0 = r7.getContext()
            r2.<init>(r0)
            r0 = 2131839831(0x7f114b57, float:1.9312925E38)
            r2.LJI(r0)
            r0 = 2131839830(0x7f114b56, float:1.9312923E38)
            r2.LIZIZ(r0)
            Y.IDCListenerS53S0200000_13 r1 = new Y.IDCListenerS53S0200000_13
            r0 = 3
            r1.<init>(r7, r8, r0)
            r0 = 2131847677(0x7f1169fd, float:1.9328838E38)
            r2.LJ(r0, r1, r3)
            X.TXB r1 = X.TXB.LJLIL
            r0 = 2131847250(0x7f116852, float:1.9327972E38)
            r2.LIZJ(r0, r1, r3)
            X.UaI r0 = r2.LIZ()
            LJZL(r0)
        Lf6:
            r3 = 1
            goto L33
        Lf9:
            r7.LL(r8, r4, r5, r4)
            goto Lf6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget.interceptCloseRoom(java.lang.Runnable, boolean, boolean, X.B7o):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC74617TQf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showApplyDialog(boolean r20, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPayPlan> r21, java.lang.String r22, long r23) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget.showApplyDialog(boolean, java.util.List, java.lang.String, long):void");
    }
}
