package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor;

import X.AbstractC029409q;
import X.AbstractC74727TUl;
import X.AbstractDialogC29234Bde;
import X.B9K;
import X.BCW;
import X.BCX;
import X.BPP;
import X.BY3;
import X.C03880Dg;
import X.C05170If;
import X.C05590Jv;
import X.C0A2;
import X.C0A3;
import X.C0NB;
import X.C15380j0;
import X.C221108m2;
import X.C276516r;
import X.C279017q;
import X.C28870BUs;
import X.C29044Baa;
import X.C29137Bc5;
import X.C29232Bdc;
import X.C29306Beo;
import X.C29401Dk;
import X.C29556Biq;
import X.C29682Bks;
import X.C29683Bkt;
import X.C30868C9o;
import X.C30882CAc;
import X.C31009CEz;
import X.C31413CUn;
import X.C31598Cag;
import X.C32014ChO;
import X.C32I;
import X.C35373DuT;
import X.C47071t1;
import X.C47261Igj;
import X.C57012Lp;
import X.C58578Mys;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C73098SmU;
import X.C73411SrX;
import X.C74614TQc;
import X.C74630TQs;
import X.C74736TUu;
import X.C74824TYe;
import X.C74825TYf;
import X.C74838TYs;
import X.C74856TZk;
import X.C74858TZm;
import X.C74860TZo;
import X.C74896TaO;
import X.C74897TaP;
import X.C74899TaR;
import X.C74900TaS;
import X.C74931Tax;
import X.C74945TbB;
import X.C74947TbD;
import X.C74983Tbn;
import X.C75037Tcf;
import X.C75038Tcg;
import X.C75039Tch;
import X.C75040Tci;
import X.C75041Tcj;
import X.C75044Tcm;
import X.C75046Tco;
import X.C75047Tcp;
import X.C75048Tcq;
import X.C75049Tcr;
import X.C75050Tcs;
import X.C75051Tct;
import X.C75052Tcu;
import X.C75054Tcw;
import X.C75055Tcx;
import X.C75056Tcy;
import X.C75057Tcz;
import X.C75059Td1;
import X.C75060Td2;
import X.C75065Td7;
import X.C75066Td8;
import X.C75069TdB;
import X.C75077TdJ;
import X.C75090TdW;
import X.C75091TdX;
import X.C75100Tdg;
import X.C75102Tdi;
import X.C75109Tdp;
import X.C75112Tds;
import X.C75140TeK;
import X.C75415Til;
import X.C75457TjR;
import X.C75559Tl5;
import X.C76800UCe;
import X.C76917UGr;
import X.C77800Ug8;
import X.C78886Uxe;
import X.C79004UzY;
import X.C80716Vm4;
import X.C87277YNd;
import X.C88207Yjb;
import X.C8E;
import X.CCJ;
import X.CJ2;
import X.CL8;
import X.CN1;
import X.CVT;
import X.DialogC31813Ce9;
import X.EnumC74778TWk;
import X.FP1;
import X.InterfaceC06390Mx;
import X.InterfaceC28471BFj;
import X.InterfaceC30442Bx8;
import X.InterfaceC31036CGa;
import X.InterfaceC31600Cai;
import X.InterfaceC31601Caj;
import X.InterfaceC31805Ce1;
import X.InterfaceC55235Lm3;
import X.InterfaceC64592gB;
import X.InterfaceC75119Tdz;
import X.InterfaceC75126Te6;
import X.InterfaceC75134TeE;
import X.InterfaceC75135TeF;
import X.InterfaceC75137TeH;
import X.InterfaceC75558Tl4;
import X.ORZ;
import X.OSZ;
import X.RunnableC31065CHd;
import X.TMC;
import X.TRT;
import X.TUT;
import X.TUZ;
import X.TV3;
import X.TZ8;
import X.TZK;
import X.TZQ;
import X.TZX;
import X.U44;
import X.UC0;
import X.X1D;
import Y.AfS65S0100000_13;
import Y.IDDListenerS152S0100000_13;
import Y.IDcS94S0200000_13;
import Y.IDrS51S0100000_13;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveHostAcceptGuestResultDialogEvent;
import com.bytedance.android.live.liveinteract.api.RemoveReservationCardEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.link.invite.share.anchor.MultiLiveInviterShareHelper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multilive.model.InRoomMultiGuestBanner;
import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFetchAnchorCommonInfoSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOutViewerFriendSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.PanelStyle;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3DialogLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3HostAcceptApplyOptimization;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3RemindStyle;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3RemindTime;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3TitleTypeSwitch;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS160S0200000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MultiLiveAsAnchorListDialogV2 extends AbstractDialogC29234Bde implements GenericLifecycleObserver, InterfaceC75119Tdz, InterfaceC31600Cai, C0A3, TZK, InterfaceC31601Caj, InterfaceC28471BFj, InterfaceC75137TeH, InterfaceC75126Te6, InterfaceC75135TeF, InterfaceC75134TeE {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final DataChannel LJLJI;
    public TZ8 LJLJJI;
    public final int LJLJJL;
    public View LJLJJLL;
    public RunnableC31065CHd LJLJL;
    public RunnableC31065CHd LJLJLJ;
    public RunnableC31065CHd LJLJLLL;
    public View LJLL;
    public View LJLLI;
    public LiveIconView LJLLILLLL;
    public View LJLLJ;
    public CVT LJLLL;
    public C80716Vm4 LJLLLL;
    public ViewPager LJLLLLLL;
    public CVT LJLZ;
    public CVT LJZ;
    public FrameLayout LJZI;
    public final C31413CUn LJZL;
    public final C31413CUn LL;
    public final C31598Cag LLD;
    public int LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public final CJ2 LLFII;
    public final CJ2 LLFZ;
    public final CJ2 LLI;
    public final CJ2 LLIFFJFJJ;
    public final CJ2 LLII;
    public final CJ2 LLIIII;
    public final CJ2 LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public final C62822Ol8 LLIIIZ;
    public final C62822Ol8 LLIIJI;
    public boolean LLIIJLIL;
    public boolean LLIIL;
    public boolean LLIILII;
    public C75077TdJ LLIILZL;
    public final PanelStyle LLIIZ;
    public final int LLIL;
    public C31009CEz LLILII;
    public String LLILIL;
    public String LLILL;
    public String LLILLIZIL;
    public final Set<LinkPlayerInfo> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final Set<DialogInterface.OnDismissListener> LLJ;
    public C73411SrX LLJI;
    public C75060Td2 LLJIJIL;
    public boolean LLJILJIL;
    public final C62822Ol8 LLJILJILJ;
    public volatile C73411SrX LLJILLL;
    public final long[] LLJJ;
    public final C62822Ol8 LLJJI;
    public final C62822Ol8 LLJJIII;
    public final CopyOnWriteArrayList<String> LLJJIJI;
    public final Map<String, C75054Tcw> LLJJIJIIJIL;
    public final Map<String, Integer> LLJJIJIL;
    public final IDrS51S0100000_13 LLJJJ;
    public boolean LLJJJIL;
    public final C62822Ol8 LLJJJJ;
    public final C75041Tcj LLJJJJJIL;

    @InterfaceC75558Tl4(name = "LINK_CONTROL_DATA_HOLDER")
    public LinkControlDataHolder linkControlDataHolder;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder mMultiGuestDataHolder;

    public /* synthetic */ MultiLiveAsAnchorListDialogV2() {
        throw null;
    }

    public static void LJJIIZ(LiveDialog liveDialog) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", liveDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-7513378268399745173")).LIZ) {
            return;
        }
        liveDialog.show();
    }

    @Override // X.TZK
    public final void LJIILL(long j) {
    }

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cza;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC75134TeE
    public final void LIZIZ() {
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "onItemInviteGuideClicked");
        C74824TYe.LIZ.LJIIZILJ(LJJJJ(), "guest");
        this.LLD.LIZIZ();
    }

    @Override // X.InterfaceC75126Te6
    public final void LJIIIZ() {
        List<LinkPlayerInfo> list;
        AbstractC74727TUl LIZ;
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "viewMoreClick");
        if (this.LLIIZ.showViewMore) {
            C31009CEz c31009CEz = this.LLILII;
            c31009CEz.getClass();
            this.LLILII = new C31009CEz(c31009CEz.LIZ, c31009CEz.LIZIZ + MultiGuestOutViewerFriendSetting.INSTANCE.getValue().step);
        }
        InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
        if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null) {
            list = LIZ.LJIJI();
        } else {
            list = null;
        }
        onPlayerListChange(list);
        C74824TYe.LJJIIJZLJL("viewer_list", true);
    }

    @Override // X.InterfaceC75137TeH
    public final void LJIIJ() {
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "onSwitch2ViewGuestClick");
        LJJLIIIJL(0);
        C74824TYe.LIZ.LJIIZILJ(LJJJJ(), "friends");
    }

    @Override // X.InterfaceC75126Te6
    public final void LJIILJJIL() {
        List<LinkPlayerInfo> list;
        AbstractC74727TUl LIZ;
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "waitingViewMoreClick");
        if (this.LLIIZ.showViewMore) {
            C31009CEz c31009CEz = this.LLILII;
            c31009CEz.getClass();
            this.LLILII = new C31009CEz(c31009CEz.LIZ + MultiGuestOutViewerFriendSetting.INSTANCE.getValue().step, c31009CEz.LIZIZ);
        }
        InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
        if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null) {
            list = LIZ.LJIJI();
        } else {
            list = null;
        }
        onPlayerListChange(list);
        C74824TYe.LJJIIJZLJL("application_list", true);
    }

    @Override // X.InterfaceC75135TeF
    public final void LJIJJLI() {
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "onSwitchToFriendBtnClicked");
        C74824TYe.LIZ.LJIIZILJ(LJJJJ(), "guest");
        LJJLIIIJL(1);
    }

    @Override // X.TZK
    public final void LJJ() {
        if (this.LJLILLLLZI && isShowing()) {
            dismiss();
        }
    }

    public final C75038Tcg LJJIJ() {
        return (C75038Tcg) this.LLJJJJ.getValue();
    }

    public final C75066Td8 LJJIJIIJI() {
        return (C75066Td8) this.LLJJI.getValue();
    }

    public final LinkControlDataHolder LJJIJL() {
        LinkControlDataHolder linkControlDataHolder = this.linkControlDataHolder;
        if (linkControlDataHolder != null) {
            return linkControlDataHolder;
        }
        o.LJIJI("linkControlDataHolder");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        r0 = r10.LLJJ;
        r3 = r0[1];
        r1 = r0[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 <= r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return r3 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJIL() {
        /*
            r10 = this;
            long[] r9 = r10.LLJJ
            int r8 = r9.length
            r7 = 0
            r4 = 0
        L5:
            r5 = 0
            r3 = 1
            if (r4 >= r8) goto L16
            r1 = r9[r4]
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L23
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 != 0) goto L22
        L16:
            long[] r0 = r10.LLJJ
            r3 = r0[r3]
            r1 = r0[r7]
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L22
            long r5 = r3 - r1
        L22:
            return r5
        L23:
            int r4 = r4 + 1
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2.LJJIL():long");
    }

    public final MultiGuestDataHolder LJJIZ() {
        MultiGuestDataHolder multiGuestDataHolder = this.mMultiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        o.LJIJI("mMultiGuestDataHolder");
        throw null;
    }

    public final DialogC31813Ce9 LJJJI() {
        Object value = this.LLJJIII.getValue();
        o.LJIIIIZZ(value, "<get-mProgressDialog>(...)");
        return (DialogC31813Ce9) value;
    }

    public final String LJJJJ() {
        String str = this.LLILL;
        if (str == null) {
            return "guest_icon";
        }
        return str;
    }

    public final HashMap<Long, Long> LJJJJIZL() {
        return (HashMap) this.LLIIIZ.getValue();
    }

    public final HashMap<Long, Integer> LJJJJJ() {
        return (HashMap) this.LLIIJI.getValue();
    }

    public final InterfaceC31805Ce1 LJJJJJL() {
        InterfaceC31805Ce1 interfaceC31805Ce1;
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (!(LIZ instanceof InterfaceC31805Ce1) || (interfaceC31805Ce1 = (InterfaceC31805Ce1) LIZ) == null) {
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel == null) {
                return null;
            }
            return (InterfaceC31805Ce1) C79004UzY.LJIL(dataChannel, InterfaceC31805Ce1.class);
        }
        return interfaceC31805Ce1;
    }

    public final boolean LJJJJLI() {
        if (this.LJLJJL != 0 || this.LLIL != 2 || C29232Bdc.LJIIL() || ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
            return false;
        }
        return true;
    }

    public final boolean LJJJJLL() {
        if (this.LJLJJL != 0 || this.LLIL == 0 || C29232Bdc.LJIIL() || ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
            return false;
        }
        return true;
    }

    public final boolean LJJJJZ() {
        if (this.LJLJJL == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJJJLIIL() {
        DataChannel dataChannel;
        LiveMode liveMode;
        if (!MultiGuestV3RemindStyle.INSTANCE.enable() || (dataChannel = this.LJLJI) == null || (liveMode = (LiveMode) dataChannel.kv0(BCX.class)) == null || C29137Bc5.LIZ(liveMode)) {
            return false;
        }
        return true;
    }

    public final boolean LJJJLL() {
        if (this.LJLJJL != 0 || this.LLIL != 1 || C29232Bdc.LJIIL() || ((IMicRoomService) CN1.LIZ(IMicRoomService.class)).qt()) {
            return false;
        }
        return true;
    }

    public final void LJJLIIIJLJLI() {
        C75100Tdg c75100Tdg;
        TZ8 tz8 = this.LJLJJI;
        if (tz8 == null || (c75100Tdg = tz8.LJJJJIZL(this.LJLJI, this, LJJIZ(), LJJIJL(), this.LJLJJL, new C75048Tcq(this), new C75046Tco(this), this.LLILLIZIL, LJJIJIIJI())) == null) {
            c75100Tdg = new C75100Tdg(this.LJLJI, this, LJJIZ(), LJJIJL(), this.LJLJJL, new C75049Tcr(this), new C75047Tcp(this), this.LLILLIZIL, LJJIJIIJI());
        }
        this.LJZL.LJLZ(C75069TdB.class, new C75109Tdp(this, this.LJLJI, LJJJLL(), this));
        this.LJZL.LJLZ(C74900TaS.class, new C75140TeK(new C75039Tch(this)));
        this.LJZL.LJLZ(LinkPlayerInfo.class, c75100Tdg);
        C31413CUn c31413CUn = this.LJZL;
        c31413CUn.LJLZ(C35373DuT.class, new C75050Tcs(this.LJLJI, this.LLIILZL, this.LJLJJL, c31413CUn));
        this.LJZL.LJLZ(C75057Tcz.class, new C75052Tcu(new C75051Tct(this), new C75037Tcf(this)));
        if (LJJJJLI()) {
            this.LJZL.LJLZ(C74899TaR.class, new C75112Tds(this));
        }
        C75038Tcg LJJIJ = LJJIJ();
        AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this, 187);
        LJJIJ.getClass();
        if (!C75038Tcg.LIZ() && !MultiGuestFetchAnchorCommonInfoSetting.INSTANCE.isEnable()) {
            C32014ChO.LIZ("MultiLiveBannerHelper", "onItemTypeRegister, null");
            aqS179S0100000_13.invoke(null);
        } else {
            ArrayList arrayList = new ArrayList();
            if (C75038Tcg.LIZ()) {
                C32014ChO.LIZ("MultiLiveBannerHelper", "onItemTypeRegister, type_activity");
                arrayList.add(1);
            }
            if (MultiGuestFetchAnchorCommonInfoSetting.INSTANCE.isEnable()) {
                C32014ChO.LIZ("MultiLiveBannerHelper", "onItemTypeRegister, type_common");
                arrayList.add(2);
            }
            aqS179S0100000_13.invoke(arrayList);
        }
        if (!TV3.LJIIJ() && C74945TbB.LIZ(Boolean.TRUE) == 2) {
            this.LJZL.LJLZ(C75090TdW.class, new C75102Tdi(new AqS163S0100000_13(this, 106)));
        }
    }

    public final void LJLI() {
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "showAnchorOnly");
        CJ2 cj2 = new CJ2();
        LJJLL(cj2);
        LJJZZIII(cj2);
        LinkPlayerInfo LJIIIZ = C74947TbD.LJIIIZ();
        if (LJIIIZ != null) {
            cj2.add(LJIIIZ);
        }
        cj2.add(new C75069TdB(1));
        this.LJZL.LJLIL = cj2;
        LJJJJL();
        this.LJZL.notifyDataSetChanged();
        this.LLIIL = true;
    }

    @Override // X.DialogC38611fN, android.app.Dialog
    public final void show() {
        String str;
        ISharedBgAbility iSharedBgAbility;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-7513378268399745173")).LIZ) {
            super.show();
        }
        if (!TV3.LJIIJ() && C74945TbB.LIZIZ(Boolean.TRUE)) {
            C31598Cag c31598Cag = this.LLD;
            c31598Cag.LJLIL = this;
            DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            DataChannel dataChannel = c31598Cag.LJLJI;
            if (dataChannel != null && (interfaceC55235Lm3 = (InterfaceC55235Lm3) dataChannel.kv0(C75415Til.class)) != null) {
                iSharedBgAbility = (ISharedBgAbility) UC0.LJIIL(interfaceC55235Lm3, ISharedBgAbility.class, null);
            } else {
                iSharedBgAbility = null;
            }
            c31598Cag.LJLJJI = iSharedBgAbility;
        }
        if (!LJJJJZ()) {
            C74856TZk.LIZIZ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        }
        this.LLJJJIL = true;
        this.LLJJ[0] = System.currentTimeMillis();
        InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
        if (LJJJJJL == null) {
            onPlayerListChange(new ArrayList());
        } else {
            C74614TQc.LIZ().LJFF();
            LJL();
            if (LJJJJLL()) {
                str = "FETCH_ON_ADD_FRIENDS_LIST";
            } else {
                str = "";
            }
            LJJJJJL.LJFF(str, 3, new AqS179S0100000_13(this, 188), new AqS179S0100000_13(this, 189));
        }
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "dialog onShow");
        C73411SrX c73411SrX = this.LLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LLJI = null;
        MultiGuestV3RemindTime multiGuestV3RemindTime = MultiGuestV3RemindTime.INSTANCE;
        if (multiGuestV3RemindTime.enable()) {
            long interval = multiGuestV3RemindTime.interval();
            if (interval > 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onReminderCall: ");
                LIZ.append(interval);
                C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", X1D.LIZIZ(LIZ));
                this.LLJI = (C73411SrX) TMC.LJIL(interval, interval, TimeUnit.SECONDS).LJJJLIIL(new AfS65S0100000_13(this, 118), new InterfaceC64592gB() { // from class: X.2vO
                    @Override // X.InterfaceC64592gB
                    public final void accept(Object obj) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("error: ");
                        LIZ2.append(((Throwable) obj).getMessage());
                        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", X1D.LIZIZ(LIZ2));
                    }
                });
            }
        }
        setOnDismissListener(new IDDListenerS152S0100000_13(this, 8));
    }

    @Override // X.InterfaceC75119Tdz
    public final void LJII() {
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // X.TZK
    public final void LJIJJ() {
        LJJJJL();
        if (isShowing()) {
            dismiss();
        }
    }

    public final int LJJIIZI() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = LJJIZ().LJIIJ;
        if (multiLiveAnchorPanelSettings != null) {
            return multiLiveAnchorPanelSettings.applierSortSetting;
        }
        return 0;
    }

    public final CVT LJJJIL() {
        CVT cvt;
        if (LJJJLL()) {
            ViewPager viewPager = this.LJLLLLLL;
            if (viewPager != null) {
                if (viewPager.getCurrentItem() == 0) {
                    cvt = this.LJZ;
                    if (cvt == null) {
                        o.LJIJI("guestListRefreshLoading");
                        throw null;
                    }
                    return cvt;
                }
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        if (LJJJLL()) {
            ViewPager viewPager2 = this.LJLLLLLL;
            if (viewPager2 != null) {
                if (viewPager2.getCurrentItem() == 1) {
                    cvt = this.LJLZ;
                    if (cvt == null) {
                        o.LJIJI("invitationRefreshLoading");
                        throw null;
                    }
                    return cvt;
                }
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        cvt = this.LJLLL;
        if (cvt == null) {
            o.LJIJI("mLoadView");
            throw null;
        }
        return cvt;
    }

    public final String LJJJJI() {
        if (LJJJJZ()) {
            return "cohost";
        }
        return C75457TjR.LJ(C74838TYs.LJ().LJJ);
    }

    public final void LJJJJL() {
        if (LJJJI().isShowing()) {
            LJJJI().dismiss();
        }
    }

    public final boolean LJJJJZI() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        if ((!TUT.LIZ() && !TUT.LIZIZ()) || (multiLiveAnchorPanelSettings = LJJIZ().LJIIJ) == null || multiLiveAnchorPanelSettings.applierSortSetting != 1 || TV3.LJIIJ() || LJJJJZ()) {
            return false;
        }
        return true;
    }

    public final void LJL() {
        C87277YNd.LJJIJ(LJJJIL());
        if (LJJJLL()) {
            ViewPager viewPager = this.LJLLLLLL;
            if (viewPager != null) {
                viewPager.setVisibility(0);
                return;
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        RunnableC31065CHd runnableC31065CHd = this.LJLJL;
        if (runnableC31065CHd == null) {
            return;
        }
        runnableC31065CHd.setVisibility(8);
    }

    @Override // android.app.Dialog, android.content.DialogInterface, X.InterfaceC31600Cai
    public final void dismiss() {
        InterfaceC31805Ce1 LJJJJJL;
        super.dismiss();
        C74838TYs.LJ().LIZJ(this);
        if (!TV3.LJIIJ() && C74945TbB.LIZIZ(Boolean.TRUE) && (LJJJJJL = LJJJJJL()) != null) {
            LJJJJJL.LIZLLL(this.LLJJJJJIL);
        }
        this.LLD.LIZJ();
        LJJIZ();
        this.LLIILZL = null;
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILLJJLI.clear();
        TZ8 tz8 = this.LJLJJI;
        if (tz8 != null) {
            tz8.LJJIFFI(this);
        }
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        RecyclerView.RecycledViewPool recycledViewPool;
        RecyclerView.RecycledViewPool recycledViewPool2;
        super.onDetachedFromWindow();
        this.LLFII.clear();
        this.LLFZ.clear();
        this.LLI.clear();
        this.LLII.clear();
        this.LLIIII.clear();
        int i = 0;
        this.LLIIJLIL = false;
        this.LJZL.LJLIL = new CJ2();
        if (LJJJLL()) {
            this.LL.LJLIL = new CJ2();
        } else if (LJJJJLI() && this.LLIIZ.showViewMore) {
            this.LLILII = new C31009CEz(i);
            RunnableC31065CHd runnableC31065CHd = this.LJLJL;
            if (runnableC31065CHd != null && (recycledViewPool2 = runnableC31065CHd.getRecycledViewPool()) != null) {
                recycledViewPool2.clear();
            }
        } else {
            RunnableC31065CHd runnableC31065CHd2 = this.LJLJL;
            if (runnableC31065CHd2 != null && (recycledViewPool = runnableC31065CHd2.getRecycledViewPool()) != null) {
                recycledViewPool.clear();
            }
        }
        ((LinkedHashMap) this.LLJJIJIIJIL).clear();
        ((LinkedHashMap) this.LLJJIJIL).clear();
        this.LLJJIJI.clear();
        C75040Tci.LJII();
        this.LJLJJI = null;
        InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
        if (LJJJJJL != null) {
            LJJJJJL.LIZJ(null);
        }
        C74824TYe.LJIIJJI = "";
    }

    @Override // X.DialogC38611fN, android.app.Dialog
    public final void onStop() {
        super.onStop();
        C88207Yjb.LJIJI("multi_guest_anchor_manage_page");
    }

    @Override // X.InterfaceC31600Cai
    public final DataChannel LJIIL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC75119Tdz
    public final void LIZ(LinkPlayerInfo item) {
        AbstractC74727TUl LIZ;
        List LJIL;
        o.LJIIIZ(item, "item");
        C58578Mys.LIZIZ(item.mUser.getId());
        C74896TaO.LJI(item);
        InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
        Object obj = null;
        if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null && (LJIL = LIZ.LJIL()) != null) {
            Iterator it = LJIL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((LinkPlayerInfo) next).mUser.getId() == item.mUser.getId()) {
                    obj = next;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null) {
                linkPlayerInfo.mRoleType = 3;
            }
        }
        User user = item.mUser;
        String str = this.LLILLIZIL;
        if (str == null) {
            str = LJJIZ().LJII();
        }
        TZQ tzq = new TZQ(user, str, 1, "panel_Golive_invite");
        tzq.LJ = LJJIZ().LJJIIZI;
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            dataChannel.qv0(LinkInRoomAnchorInviteGuestEvent.class, tzq);
        }
    }

    @Override // X.InterfaceC75119Tdz
    public final void LIZJ(LinkPlayerInfo item) {
        Long l;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo LJJIJL;
        o.LJIIIZ(item, "item");
        if (this.LLFF) {
            return;
        }
        this.LLFF = true;
        TZ8 tz8 = this.LJLJJI;
        if (tz8 != null) {
            long id = item.mUser.getId();
            String secUid = item.mUser.getSecUid();
            o.LJIIIIZZ(secUid, "item.user.secUid");
            String str = item.mInteractIdStr;
            o.LJIIIIZZ(str, "item.interactId");
            tz8.LJJJI(2, secUid, id, str, this.LLILLIZIL, true);
        }
        ((HashSet) C74838TYs.LJ().LJIL).remove(Long.valueOf(item.mUser.getId()));
        InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
        Integer num = null;
        if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null && (LJJIJL = C76917UGr.LJJIJL(LIZ, item.mUser.getId())) != null) {
            LJJIJL.LIZ = 0;
        }
        long followStatus = item.mUser.getFollowInfo().getFollowStatus();
        User user = item.mUser;
        if (LJJJJZI()) {
            l = LJJJJIZL().get(Long.valueOf(item.mUser.getId()));
        } else {
            l = null;
        }
        if (LJJJJZI()) {
            num = LJJJJJ().get(Long.valueOf(item.mUser.getId()));
        }
        C75457TjR.LJIIJ("click", followStatus, user, l, num, Integer.valueOf(LJJIIZI()), this.LLILLIZIL);
    }

    @Override // X.InterfaceC75119Tdz
    public final void LIZLLL(User user) {
        if (!this.LJLILLLLZI) {
            return;
        }
        String LJIILL = C15380j0.LJIILL(R.string.kv7, C05170If.LIZ(user));
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LIZJ = LJIILL;
        c47071t1.LJFF(R.string.kv8);
        c47071t1.LJIIL(R.string.l0t, new IDcS94S0200000_13(user, this, 1));
        c47071t1.LJIIIZ(R.string.kg7, C74858TZm.LJLIL);
        LJJIIZ(c47071t1.LIZ());
        C74736TUu.LIZ.LJIL(0, "disconnect_popup_show", new JSONObject(), true);
    }

    @Override // X.InterfaceC75119Tdz
    public final void LJFF(LinkPlayerInfo item) {
        o.LJIIIZ(item, "item");
        C58578Mys.LIZIZ(item.mUser.getId());
        C74896TaO.LJI(item);
        int i = LJJIZ().LJIILIIL;
        C29556Biq.LIZ().getClass();
        if (i >= C74983Tbn.LJ()) {
            TZ8 tz8 = this.LJLJJI;
            if (tz8 != null && tz8.LJIJJLI("go_live_panel_accept", new AqS160S0200000_13(this, item, 14))) {
                return;
            }
            C30868C9o.LIZJ(R.string.sub);
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveHostAcceptGuestResultDialogEvent.class, Long.valueOf(item.mUser.getId()));
                return;
            }
            return;
        }
        TZ8 tz82 = this.LJLJJI;
        if (tz82 != null) {
            long id = item.mUser.getId();
            String secUid = item.mUser.getSecUid();
            o.LJIIIIZZ(secUid, "item.user.secUid");
            String str = item.mInteractIdStr;
            o.LJIIIIZZ(str, "item.interactId");
            tz82.LJJJI(1, secUid, id, str, this.LLILLIZIL, true);
        }
    }

    @Override // X.TZK
    public final void LJI(long j) {
        C74900TaS c74900TaS;
        this.LLFF = false;
        int intValue = LJJIJIIJIL(j).getFirst().intValue();
        if (intValue == -1) {
            return;
        }
        List<?> list = this.LJZL.LJLIL;
        o.LJIIIIZZ(list, "getGuestListAdapter().items");
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (ListProtector.get(list, i) instanceof C74900TaS) {
                    Object obj = ListProtector.get(list, i);
                    if ((obj instanceof C74900TaS) && (c74900TaS = (C74900TaS) obj) != null && c74900TaS.LJLILLLLZI == 0) {
                        break;
                    }
                }
                i++;
            } else {
                i = 0;
                break;
            }
        }
        List<?> list2 = this.LJZL.LJLIL;
        o.LJII(list2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
        C74897TaP.LJIIL((CJ2) list2, intValue, this.LJZL);
        int i2 = this.LLF - 1;
        this.LLF = i2;
        if (i2 <= 0) {
            List<?> list3 = this.LJZL.LJLIL;
            o.LJII(list3, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            C74897TaP.LJIIL((CJ2) list3, i, this.LJZL);
            if (list.size() == 1) {
                LJLI();
                return;
            }
            return;
        }
        Object obj2 = ListProtector.get(list, i);
        o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.TitleItem");
        C74900TaS c74900TaS2 = (C74900TaS) obj2;
        int i3 = this.LLF;
        if (i3 == 1) {
            String LJIILL = C15380j0.LJIILL(R.string.lsx, Integer.valueOf(i3));
            o.LJIIIIZZ(LJIILL, "getString(R.string.pm_guest1, mRequestListSize)");
            c74900TaS2.LJLIL = LJIILL;
            c74900TaS2.LJLILLLLZI = 0;
        } else {
            String LJIILL2 = C15380j0.LJIILL(R.string.lsy, Integer.valueOf(i3));
            o.LJIIIIZZ(LJIILL2, "getString(R.string.pm_guest2, mRequestListSize)");
            c74900TaS2.LJLIL = LJIILL2;
            c74900TaS2.LJLILLLLZI = 0;
        }
        this.LJZL.notifyItemChanged(i);
    }

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        String str;
        o.LJIIIZ(view, "view");
        Object tag = view.getTag(R.id.ln3);
        if ((tag instanceof String) && (str = (String) tag) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onViewDetached ");
            LIZ.append(str);
            LIZ.append(' ');
            LIZ.append(view.hashCode());
            C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", X1D.LIZIZ(LIZ));
            if (this.LLJJIJIL.containsKey(str)) {
                Integer num = (Integer) ((LinkedHashMap) this.LLJJIJIL).get(str);
                int hashCode = view.hashCode();
                if (num == null || num.intValue() != hashCode) {
                    return;
                }
                C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", "RealDetached");
                this.LLJJIJIIJIL.remove(str);
                this.LLJJIJIL.remove(str);
            }
        }
    }

    @Override // X.TZK
    public final void LJIJ(Throwable th) {
        LJJJJL();
        BPP.LIZLLL(getContext(), th, R.string.suk);
    }

    @Override // X.TZK
    public final void LJIL(long j) {
        C31413CUn c31413CUn;
        OSZ<Integer, LinkPlayerInfo> LJJIJIL = LJJIJIL(j);
        int intValue = LJJIJIL.getFirst().intValue();
        LinkPlayerInfo second = LJJIJIL.getSecond();
        if (intValue != -1) {
            second.mRoleType = 2;
            if (LJJJLL()) {
                c31413CUn = this.LL;
            } else {
                c31413CUn = this.LJZL;
            }
            c31413CUn.notifyItemChanged(intValue);
        }
    }

    @Override // X.TZK
    public final void LJJI(Throwable th) {
        if (this.LJLILLLLZI && !LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            BPP.LIZLLL(getContext(), th, R.string.su8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        String str;
        AbstractC74727TUl LIZ;
        LinkPlayerInfo LJJIJLIJ;
        String str2;
        Collection collection;
        String str3;
        AbstractC74727TUl LIZ2;
        int i;
        long j;
        Long l;
        Integer num;
        Long l2;
        Integer num2;
        FollowInfo followInfo;
        FollowInfo followInfo2;
        AbstractC74727TUl LIZ3;
        o.LJIIIZ(view, "view");
        Object tag = view.getTag(R.id.ln3);
        Long l3 = null;
        if ((tag instanceof String) && (str = (String) tag) != null) {
            this.LLJJIJIL.put(str, Integer.valueOf(view.hashCode()));
            Object tag2 = view.getTag(R.id.ln4);
            if ((tag2 instanceof C75054Tcw) && tag2 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onViewAttached ");
                LIZ4.append(str);
                LIZ4.append(' ');
                LIZ4.append(view.hashCode());
                C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", X1D.LIZIZ(LIZ4));
                if (!this.LLJJIJIIJIL.containsKey(str)) {
                    C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", "not contains");
                    this.LLJJIJIIJIL.put(str, tag2);
                } else if (o.LJ(((LinkedHashMap) this.LLJJIJIIJIL).get(str), tag2) && this.LLJJJIL) {
                    C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", "contains but not changed");
                } else {
                    C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", "contains but not check");
                    this.LLJJIJIIJIL.put(str, tag2);
                }
            }
            C75040Tci.LIZIZ(str);
            if (this.LLJJIJI.contains(str)) {
                this.LLJJIJI.remove(str);
            } else {
                InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
                if (LJJJJJL == null || (LIZ = LJJJJJL.LIZ()) == null || (LJJIJLIJ = C76917UGr.LJJIJLIJ(LIZ, str)) == null) {
                    C75040Tci.LIZLLL(str);
                } else {
                    C75040Tci.LIZJ(LJJIJLIJ.LIZ, str);
                    int i2 = -1;
                    if (LJJIJLIJ.LIZ == 1) {
                        long id = LJJIJLIJ.mUser.getId();
                        EnumC74778TWk LIZLLL = CL8.LIZLLL();
                        InterfaceC31805Ce1 LJJJJJL2 = LJJJJJL();
                        if (LJJJJJL2 != null && (LIZ3 = LJJJJJL2.LIZ()) != null) {
                            i = LIZ3.LJIIIIZZ().indexOf(LJJIJLIJ);
                        } else {
                            i = -1;
                        }
                        int i3 = i + 1;
                        List LIZ5 = C74896TaO.LIZ(0, LJJIJLIJ);
                        List<String> list = LJJIJLIJ.tagKeyList;
                        String LJJJJI = LJJJJI();
                        User user = LJJIJLIJ.mUser;
                        long j2 = 0;
                        if (user != null && (followInfo2 = user.getFollowInfo()) != null) {
                            j = followInfo2.getFollowStatus();
                        } else {
                            j = 0;
                        }
                        if (LJJJJZI()) {
                            l = LJJJJIZL().get(Long.valueOf(LJJIJLIJ.mUser.getId()));
                        } else {
                            l = null;
                        }
                        if (LJJJJZI()) {
                            num = LJJJJJ().get(Long.valueOf(LJJIJLIJ.mUser.getId()));
                        } else {
                            num = null;
                        }
                        Integer num3 = LJJIJIIJI().LIZ.get(Long.valueOf(LJJIJLIJ.mUser.getId()));
                        if (num3 == null) {
                            num3 = 0;
                        }
                        C74825TYf.LIZIZ(id, LIZLLL, i3, LIZ5, list, LJJJJI, j, l, num, num3);
                        C75040Tci.LJ(str);
                        if (!LJJIJLIJ.LIZJ) {
                            User user2 = LJJIJLIJ.mUser;
                            if (user2 != null && (followInfo = user2.getFollowInfo()) != null) {
                                j2 = followInfo.getFollowStatus();
                            }
                            User user3 = LJJIJLIJ.mUser;
                            if (LJJJJZI()) {
                                l2 = LJJJJIZL().get(Long.valueOf(LJJIJLIJ.mUser.getId()));
                            } else {
                                l2 = null;
                            }
                            if (LJJJJZI()) {
                                num2 = LJJJJJ().get(Long.valueOf(LJJIJLIJ.mUser.getId()));
                            } else {
                                num2 = null;
                            }
                            C75457TjR.LJIIJ("show", j2, user3, l2, num2, Integer.valueOf(LJJIIZI()), this.LLILLIZIL);
                        }
                    }
                    if (LJJIJLIJ.LIZ == 0 && LJJIJLIJ.LIZIZ == 3) {
                        if (LJJIJLIJ.mRoleType != 3) {
                            str3 = "normal";
                        } else {
                            str3 = "abnormal";
                        }
                        InterfaceC31805Ce1 LJJJJJL3 = LJJJJJL();
                        if (LJJJJJL3 != null && (LIZ2 = LJJJJJL3.LIZ()) != null) {
                            i2 = LIZ2.LJ().indexOf(LJJIJLIJ);
                        }
                        C74824TYe.LJLJLJ(LJJIJLIJ, str3, i2 + 1, C74896TaO.LIZ(0, LJJIJLIJ), LJJIJLIJ.tagKeyList, LJJJJI(), this.LLILLIZIL);
                        C75040Tci.LJ(str);
                    }
                    if (LJJIJLIJ.LIZ == 2 && !LJJIJLIJ.LIZLLL && LJJIJLIJ.mRoleType != 1) {
                        C74824TYe c74824TYe = C74824TYe.LIZ;
                        C74824TYe.LJIILL = "go_live_panel";
                        InterfaceC31805Ce1 LJJJJJL4 = LJJJJJL();
                        if (LJJJJJL4 != null) {
                            str2 = LJJJJJL4.LIZIZ(LJJIJLIJ.mUser.getId());
                        } else {
                            str2 = null;
                        }
                        int LIZJ = C74947TbD.LIZJ(LJJIJLIJ, LJJIZ());
                        int LIZ6 = C74947TbD.LIZ(LJJIJLIJ, LJJIZ());
                        if (C74931Tax.LIZ(LJJIJLIJ.mUser)) {
                            collection = C47261Igj.LJJIJ("pm_mt_guest_tag_subscriber");
                        } else {
                            collection = C61878OQg.INSTANCE;
                        }
                        List<String> LLJILJILJ = ORZ.LLJILJILJ(collection);
                        User user4 = LJJIJLIJ.mUser;
                        if (user4 != null) {
                            l3 = Long.valueOf(user4.getId());
                        }
                        c74824TYe.LJIL(str2, LIZJ, LIZ6, LLJILJILJ, l3, this.LLILLIZIL);
                    }
                }
            }
            C75040Tci.LJI(view.hashCode());
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C75040Tci.LJFF(view.hashCode());
    }

    public final void LJJIIJZLJL(Object obj) {
        if (obj != null) {
            if (!this.LLIZ) {
                this.LLIZ = true;
                C74824TYe c74824TYe = C74824TYe.LIZ;
                String LJJJJ = LJJJJ();
                String tabName = this.LLILIL;
                o.LJIIIZ(tabName, "tabName");
                HashMap hashMap = new HashMap();
                C74824TYe.LIZ(hashMap);
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null) {
                    String idStr = room.getIdStr();
                    o.LJIIIIZZ(idStr, "room.idStr");
                    hashMap.put("room_id", idStr);
                    hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                }
                hashMap.put("request_page", LJJJJ);
                hashMap.put("guest_connected_cnt", String.valueOf(C74838TYs.LJ().LJJ));
                hashMap.put("tab_name", tabName);
                C74824TYe.LIZJ(c74824TYe, hashMap);
                C74824TYe.LJLL("livesdk_anchor_guest_blank_panel_icon_show", hashMap);
                return;
            }
            return;
        }
        this.LLIZ = false;
    }

    public final OSZ<Integer, LinkPlayerInfo> LJJIJIIJIL(long j) {
        List<?> list = this.LJZL.LJLIL;
        o.LJIIIIZZ(list, "getGuestListAdapter().items");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if ((obj instanceof LinkPlayerInfo) && ((LinkPlayerInfo) obj).mUser.getId() == j) {
                    return new OSZ<>(Integer.valueOf(i), obj);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return new OSZ<>(-1, new LinkPlayerInfo());
    }

    public final OSZ<Integer, LinkPlayerInfo> LJJIJIL(long j) {
        C31413CUn c31413CUn;
        if (LJJJLL()) {
            c31413CUn = this.LL;
        } else {
            c31413CUn = this.LJZL;
        }
        List<?> list = c31413CUn.LJLIL;
        o.LJIIIIZZ(list, "getInvitationAdapter().items");
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                if ((obj instanceof LinkPlayerInfo) && ((LinkPlayerInfo) obj).mUser.getId() == j) {
                    return new OSZ<>(Integer.valueOf(i), obj);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return new OSZ<>(-1, new LinkPlayerInfo());
    }

    public final void LJJLIIIIJ(int i) {
        AbstractC74727TUl LIZ;
        List LJJIFFI;
        int size;
        this.LLFFF = true;
        if (i == 1) {
            InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
            if (LJJJJJL != null && (LIZ = LJJJJJL.LIZ()) != null && (LJJIFFI = LIZ.LJJIFFI()) != null && (size = LJJIFFI.size()) > 0) {
                C74824TYe c74824TYe = C74824TYe.LIZ;
                HashMap LIZLLL = C73098SmU.LIZLLL();
                LIZLLL.put("friends_cnt", String.valueOf(size));
                C74824TYe.LIZJ(c74824TYe, LIZLLL);
                C74824TYe.LJLL("livesdk_anchor_guest_connection_friend_list_show", LIZLLL);
            }
            this.LLFFF = false;
        }
    }

    public final void LJJLIIIJ(List<ListByTypeResponse.ReservedUser> list) {
        String LJ;
        String str;
        if (LJJJJZ()) {
            LJ = "cohost";
        } else {
            LJ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        }
        for (ListByTypeResponse.ReservedUser reservedUser : list) {
            long j = reservedUser.reserveId;
            if (LJJJJZ()) {
                if (reservedUser.reserveType == 2) {
                    str = "responsed";
                } else {
                    str = "not_response";
                }
            } else if (reservedUser.reserveType == 2) {
                str = "response_accept";
            } else {
                str = "not_response_accept";
            }
            C74824TYe.LJJIIJ(j, LJ, str);
        }
        this.LLIILII = true;
    }

    public final void LJJLIIIJILLIZJL(String str) {
        C31413CUn c31413CUn;
        List<?> list = this.LJZL.LJLIL;
        o.LJIIIIZZ(list, "mNormalAdapter.items");
        int i = 0;
        for (Object obj : list) {
            if ((obj instanceof LinkPlayerInfo) && o.LJ(((LinkPlayerInfo) obj).mInteractIdStr, str)) {
                if (i != -1 && (c31413CUn = this.LJZL) != null) {
                    c31413CUn.notifyItemChanged(i);
                    return;
                }
                return;
            }
            i++;
        }
    }

    public final void LJJLIIIJJIZ(int i) {
        int i2 = 0;
        int i3 = -1;
        if (i != 1) {
            if (i == 2) {
                List<?> items = this.LJZL.LJLIL;
                o.LJIIIIZZ(items, "items");
                Iterator<?> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() instanceof InRoomMultiGuestBanner) {
                        i3 = i2;
                        if (i2 >= 0) {
                            LJJIJ().LIZIZ(i, ListProtector.get(items, i3), new AqS179S0100000_13(this, 186));
                        }
                    } else {
                        i2++;
                    }
                }
            }
        } else {
            InterfaceC30442Bx8.R2.LIZ(Boolean.FALSE);
            List<?> items2 = this.LJZL.LJLIL;
            o.LJIIIIZZ(items2, "items");
            Iterator<?> it2 = items2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next() instanceof C74860TZo) {
                    i3 = i2;
                    if (i2 >= 0) {
                        LJJIJ().LIZIZ(i, ListProtector.get(items2, i3), null);
                    }
                } else {
                    i2++;
                }
            }
        }
        C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", "onBannerClosed, position: " + i3);
        if (i3 >= 0) {
            List<?> list = this.LJZL.LJLIL;
            o.LJII(list, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            C74897TaP.LJIIL((CJ2) list, i3, this.LJZL);
        }
        CJ2 cj2 = this.LLIIII;
        ArrayList arrayList = new ArrayList(C32I.LJJL(cj2, 10));
        Iterator<Object> it3 = cj2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            o.LJII(next, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse.ReservedUser");
            arrayList.add(next);
        }
        CJ2 cj22 = this.LLFII;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(cj22, 10));
        Iterator<Object> it4 = cj22.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            o.LJII(next2, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList2.add(next2);
        }
        CJ2 cj23 = this.LLI;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(cj23, 10));
        Iterator<Object> it5 = cj23.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            o.LJII(next3, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList3.add(next3);
        }
        CJ2 cj24 = this.LLII;
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(cj24, 10));
        Iterator<Object> it6 = cj24.iterator();
        while (it6.hasNext()) {
            Object next4 = it6.next();
            o.LJII(next4, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList4.add(next4);
        }
        CJ2 cj25 = this.LLIIIILZ;
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(cj25, 10));
        Iterator<Object> it7 = cj25.iterator();
        while (it7.hasNext()) {
            Object next5 = it7.next();
            o.LJII(next5, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList5.add(next5);
        }
        CJ2 cj26 = this.LLFZ;
        ArrayList arrayList6 = new ArrayList(C32I.LJJL(cj26, 10));
        Iterator<Object> it8 = cj26.iterator();
        while (it8.hasNext()) {
            Object next6 = it8.next();
            o.LJII(next6, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList6.add(next6);
        }
        CJ2 cj27 = this.LLIFFJFJJ;
        ArrayList arrayList7 = new ArrayList(C32I.LJJL(cj27, 10));
        Iterator<Object> it9 = cj27.iterator();
        while (it9.hasNext()) {
            Object next7 = it9.next();
            o.LJII(next7, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse.GiftScoreAppliedUser");
            arrayList7.add(next7);
        }
        LJLJJL(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
    }

    public final void LJJLIIIJL(int i) {
        ViewPager viewPager = this.LJLLLLLL;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, true);
        } else {
            o.LJIJI("viewPager");
            throw null;
        }
    }

    public final void LJJLIIIJLLLLLLLZ(long j) {
        int i;
        int intValue = LJJIJIIJIL(j).getFirst().intValue();
        if (intValue == -1) {
            return;
        }
        List<?> list = this.LJZL.LJLIL;
        o.LJIIIIZZ(list, "getGuestListAdapter().items");
        if (1 == MultiGuestV3TitleTypeSwitch.getValue()) {
            i = -1;
        } else {
            i = 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = ListProtector.get(list, i3);
            if (1 != MultiGuestV3TitleTypeSwitch.getValue() ? (obj instanceof C74900TaS) : !(!(obj instanceof C74900TaS) || ((C74900TaS) obj).LJLILLLLZI != 0)) {
                i = i3;
            }
            if ((obj instanceof LinkPlayerInfo) && ((LinkPlayerInfo) obj).mRoleType == 4) {
                i2++;
            }
        }
        List<?> list2 = this.LJZL.LJLIL;
        o.LJII(list2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
        C74897TaP.LJIIL((CJ2) list2, intValue, this.LJZL);
        if (i2 <= 1 && i != -1) {
            List<?> list3 = this.LJZL.LJLIL;
            o.LJII(list3, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            C74897TaP.LJIIL((CJ2) list3, i, this.LJZL);
        }
    }

    public final void LJJLL(CJ2 cj2) {
        if (LJJJLIIL()) {
            int value = MultiGuestV3RemindStyle.INSTANCE.getValue();
            Boolean LIZJ = InterfaceC30442Bx8.LLZL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_MULTI_LIVE_GUEST_REVENUE_INFO_SHOWN.value");
            cj2.add(new C75057Tcz(value, LIZJ.booleanValue(), new C75044Tcm(this)));
        }
    }

    public final void LJJZZIII(CJ2 cj2) {
        C75038Tcg LJJIJ = LJJIJ();
        AqS144S0200000_13 aqS144S0200000_13 = new AqS144S0200000_13(this, cj2, 4);
        LJJIJ.getClass();
        if (LJJIJ.LIZJ()) {
            C32014ChO.LIZ("MultiLiveBannerHelper", "onItemSetup, type_activity");
            aqS144S0200000_13.invoke(1);
        } else if (LJJIJ.LIZLLL()) {
            C32014ChO.LIZ("MultiLiveBannerHelper", "onItemSetup, type_common");
            aqS144S0200000_13.invoke(2);
        } else {
            aqS144S0200000_13.invoke(0);
            C32014ChO.LIZ("MultiLiveBannerHelper", "onItemSetup, type_none");
        }
    }

    public final void LJLIIIL(List<? extends LinkPlayerInfo> list) {
        CJ2 cj2 = new CJ2();
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lup);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_guest_tab_friends_desc)");
        cj2.add(new C74900TaS(LJIILJJIL, 3));
        if (list == null || list.isEmpty()) {
            cj2.add(new C75091TdX());
        } else {
            for (LinkPlayerInfo linkPlayerInfo : list) {
                linkPlayerInfo.LIZIZ = 4;
                cj2.add(linkPlayerInfo);
            }
        }
        C31413CUn c31413CUn = this.LL;
        c31413CUn.LJLIL = cj2;
        c31413CUn.notifyDataSetChanged();
        RunnableC31065CHd runnableC31065CHd = this.LJLJLLL;
        if (runnableC31065CHd != null) {
            C0A2 layoutManager = runnableC31065CHd.getLayoutManager();
            o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            RunnableC31065CHd runnableC31065CHd2 = this.LJLJLLL;
            if (runnableC31065CHd2 != null) {
                LJJLJ(linearLayoutManager, runnableC31065CHd2);
                return;
            } else {
                o.LJIJI("invitationRecyclerView");
                throw null;
            }
        }
        o.LJIJI("invitationRecyclerView");
        throw null;
    }

    public final void LJLIL(Long l) {
        int intValue;
        if (!this.LJLILLLLZI || l == null || (intValue = LJJIJIIJIL(l.longValue()).getFirst().intValue()) == -1) {
            return;
        }
        this.LJZL.notifyItemChanged(intValue);
    }

    public final void LJLJI(String str) {
        C279017q.LJ("updateRequestPage requestPage:", str, "MultiLiveAsAnchorListDialogV2");
        this.LLILL = str;
    }

    @Override // X.InterfaceC31601Caj
    public final void U2(Throwable th) {
        BPP.LIZLLL(getContext(), th, R.string.sp2);
    }

    @Override // X.InterfaceC31601Caj
    public final void V7(MultiLiveAnchorPanelSettings settings) {
        o.LJIIIZ(settings, "settings");
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.n7g));
        LJJIZ().LJIIJ = settings;
        C74838TYs.LJ().LJJI = MultiLiveAnchorPanelSettings.L(settings);
        InterfaceC30442Bx8.d0.LIZ(MultiLiveAnchorPanelSettings.L(settings));
        this.LLIIJLIL = false;
        CJ2 cj2 = this.LLIIII;
        ArrayList arrayList = new ArrayList(C32I.LJJL(cj2, 10));
        Iterator<Object> it = cj2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            o.LJII(next, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse.ReservedUser");
            arrayList.add(next);
        }
        CJ2 cj22 = this.LLFII;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(cj22, 10));
        Iterator<Object> it2 = cj22.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            o.LJII(next2, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList2.add(next2);
        }
        CJ2 cj23 = this.LLI;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(cj23, 10));
        Iterator<Object> it3 = cj23.iterator();
        while (it3.hasNext()) {
            Object next3 = it3.next();
            o.LJII(next3, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList3.add(next3);
        }
        CJ2 cj24 = this.LLII;
        ArrayList arrayList4 = new ArrayList(C32I.LJJL(cj24, 10));
        Iterator<Object> it4 = cj24.iterator();
        while (it4.hasNext()) {
            Object next4 = it4.next();
            o.LJII(next4, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList4.add(next4);
        }
        CJ2 cj25 = this.LLIIIILZ;
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(cj25, 10));
        Iterator<Object> it5 = cj25.iterator();
        while (it5.hasNext()) {
            Object next5 = it5.next();
            o.LJII(next5, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList5.add(next5);
        }
        CJ2 cj26 = this.LLFZ;
        ArrayList arrayList6 = new ArrayList(C32I.LJJL(cj26, 10));
        Iterator<Object> it6 = cj26.iterator();
        while (it6.hasNext()) {
            Object next6 = it6.next();
            o.LJII(next6, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo");
            arrayList6.add(next6);
        }
        CJ2 cj27 = this.LLIFFJFJJ;
        ArrayList arrayList7 = new ArrayList(C32I.LJJL(cj27, 10));
        Iterator<Object> it7 = cj27.iterator();
        while (it7.hasNext()) {
            Object next7 = it7.next();
            o.LJII(next7, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse.GiftScoreAppliedUser");
            arrayList7.add(next7);
        }
        LJLJJL(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
    }

    @Override // X.InterfaceC28471BFj
    public final void onChanged(Object obj) {
        boolean value = MultiGuestV3DialogLogSetting.INSTANCE.getValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onChanged openMultiGuest = ");
        LIZ.append(obj);
        LIZ.append(", ");
        LIZ.append(value);
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", X1D.LIZIZ(LIZ));
        if (!value) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (o.LJ(obj, bool)) {
            this.LLILLJJLI.clear();
            TZ8 tz8 = this.LJLJJI;
            if (tz8 != null) {
                tz8.LJJIFFI(this);
            }
        }
        if (o.LJ(obj, bool)) {
            this.LLILLJJLI.clear();
            TZ8 tz82 = this.LJLJJI;
            if (tz82 != null) {
                tz82.LJJIFFI(this);
            }
            InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
            if (LJJJJJL == null) {
                onPlayerListChange(new ArrayList());
                return;
            } else {
                LJL();
                TRT.LIZ(LJJJJJL, "multi_guest_turn_on'", 3, null, new AqS179S0100000_13(this, 387), 4);
                return;
            }
        }
        onPlayerListChange(new ArrayList());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0390  */
    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2.onCreate(android.os.Bundle):void");
    }

    public final void onEvent(Object event) {
        C31413CUn c31413CUn;
        o.LJIIIZ(event, "event");
        if (event instanceof C76800UCe) {
            LJLI();
            return;
        }
        if (event instanceof C75059Td1) {
            LJJLIIIJILLIZJL(((C75059Td1) event).LJLIL);
            return;
        }
        if (event instanceof C57012Lp) {
            LJJLIIIJILLIZJL(null);
        } else {
            if (!(event instanceof C74630TQs) || (c31413CUn = this.LJZL) == null) {
                return;
            }
            c31413CUn.notifyDataSetChanged();
        }
    }

    public final void onPlayerListChange(List<LinkPlayerInfo> list) {
        List<ListByTypeResponse.ReservedUser> list2;
        List<? extends LinkPlayerInfo> list3;
        List<? extends LinkPlayerInfo> list4;
        List<? extends LinkPlayerInfo> list5;
        List<? extends LinkPlayerInfo> list6;
        List<? extends LinkPlayerInfo> list7;
        AbstractC74727TUl LIZ;
        AbstractC74727TUl LIZ2;
        AbstractC74727TUl LIZ3;
        AbstractC74727TUl LIZ4;
        AbstractC74727TUl LIZ5;
        AbstractC74727TUl LIZ6;
        AbstractC74727TUl LIZ7;
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "onPlayerListChange");
        if (this.LLJILJIL) {
            C74614TQc.LIZ().LIZIZ();
        }
        InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
        List<ListByTypeResponse.GiftScoreAppliedUser> list8 = null;
        if (LJJJJJL != null && (LIZ7 = LJJJJJL.LIZ()) != null) {
            list2 = LIZ7.LJI();
        } else {
            list2 = null;
        }
        InterfaceC31805Ce1 LJJJJJL2 = LJJJJJL();
        if (LJJJJJL2 != null && (LIZ6 = LJJJJJL2.LIZ()) != null) {
            list3 = LIZ6.LJJI();
        } else {
            list3 = null;
        }
        InterfaceC31805Ce1 LJJJJJL3 = LJJJJJL();
        if (LJJJJJL3 != null && (LIZ5 = LJJJJJL3.LIZ()) != null) {
            list4 = LIZ5.LJIJJLI();
        } else {
            list4 = null;
        }
        InterfaceC31805Ce1 LJJJJJL4 = LJJJJJL();
        if (LJJJJJL4 != null && (LIZ4 = LJJJJJL4.LIZ()) != null) {
            list5 = LIZ4.LJIL();
        } else {
            list5 = null;
        }
        InterfaceC31805Ce1 LJJJJJL5 = LJJJJJL();
        if (LJJJJJL5 != null && (LIZ3 = LJJJJJL5.LIZ()) != null) {
            list6 = LIZ3.LJJIFFI();
        } else {
            list6 = null;
        }
        InterfaceC31805Ce1 LJJJJJL6 = LJJJJJL();
        if (LJJJJJL6 != null && (LIZ2 = LJJJJJL6.LIZ()) != null) {
            list7 = LIZ2.LJJ();
        } else {
            list7 = null;
        }
        InterfaceC31805Ce1 LJJJJJL7 = LJJJJJL();
        if (LJJJJJL7 != null && (LIZ = LJJJJJL7.LIZ()) != null) {
            list8 = LIZ.LJIJJ();
        }
        LJLJJL(list2, list3, list4, list5, list6, list7, list8);
        if (this.LLJILJIL) {
            RunnableC31065CHd runnableC31065CHd = this.LJLJL;
            if (runnableC31065CHd != null) {
                C74614TQc.LIZ().LIZJ(runnableC31065CHd);
            }
            this.LLJILJIL = false;
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.LLJ.add(onDismissListener);
        }
        super.setOnDismissListener(new IDDListenerS152S0100000_13(this, 7));
    }

    public static void LJJJLZIJ(String bannerId, String str) {
        o.LJIIIZ(bannerId, "bannerId");
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        HashMap hashMap = new HashMap();
        if (room != null) {
            String idStr = room.getIdStr();
            o.LJIIIIZZ(idStr, "room.idStr");
            hashMap.put("room_id", idStr);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        }
        hashMap.put("banner_id", bannerId);
        hashMap.put("banner_action_type", str);
        C74824TYe.LJLL("livesdk_anchor_guest_panel_banner", hashMap);
    }

    @Override // X.InterfaceC75119Tdz
    public final void LJIIIIZZ(int i, LinkPlayerInfo item) {
        TZ8 tz8;
        o.LJIIIZ(item, "item");
        if (this.LJLILLLLZI && (tz8 = this.LJLJJI) != null) {
            tz8.LJJJJ(item, i, false);
        }
    }

    @Override // X.InterfaceC75119Tdz
    public final void LJIIJJI(int i, LinkPlayerInfo item) {
        TZ8 tz8;
        o.LJIIIZ(item, "item");
        if (this.LJLILLLLZI && (tz8 = this.LJLJJI) != null) {
            tz8.LJJJJ(item, i, true);
        }
    }

    @Override // X.TZK
    public final void LJIILLIIL(long j, Throwable th) {
        if (!this.LJLILLLLZI) {
            return;
        }
        BPP.LIZLLL(getContext(), th, R.string.su9);
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            dataChannel.qv0(RemoveReservationCardEvent.class, Long.valueOf(j));
        }
    }

    @Override // X.TZK
    public final void LJIIZILJ(long j, Throwable th) {
        C276516r c276516r;
        Integer valueOf;
        LJJJJL();
        if (!this.LJLILLLLZI) {
            return;
        }
        C0NB.LJIIIZ("MultiLiveAsAnchorListDialogV2", "onUserPermit Failed ~~~~");
        if (!LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            BPP.LIZLLL(getContext(), th, R.string.su9);
        }
        if (!(th instanceof C29401Dk) || (c276516r = (C276516r) th) == null || (valueOf = Integer.valueOf(c276516r.getErrorCode())) == null || ((valueOf.intValue() != 10004 && valueOf.intValue() != 31007) || !LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt())) {
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveHostAcceptGuestResultDialogEvent.class, Long.valueOf(j));
            }
        } else {
            LJJLIIIJLLLLLLLZ(j);
        }
        int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
        C29556Biq.LIZ().getClass();
        C75457TjR.LJIIIIZZ(LJJJJZI, j, C74983Tbn.LIZJ(), false);
    }

    @Override // X.InterfaceC75119Tdz
    public final void LJIJI(LinkPlayerInfo item, AqS163S0100000_13 aqS163S0100000_13) {
        int i;
        boolean z;
        InterfaceC31805Ce1 LJJJJJ;
        AbstractC74727TUl LIZ;
        List LJJIFFI;
        o.LJIIIZ(item, "item");
        TZ8 tz8 = this.LJLJJI;
        if (tz8 != null && (LJJJJJ = tz8.LJJJJJ()) != null && (LIZ = LJJJJJ.LIZ()) != null && (LJJIFFI = LIZ.LJJIFFI()) != null) {
            i = LJJIFFI.indexOf(item) + 1;
        } else {
            i = -1;
        }
        LJJIJL().LIZ.add(Long.valueOf(item.mUser.getId()));
        MultiLiveInviterShareHelper.LJIIJ.getClass();
        InterfaceC31036CGa interfaceC31036CGa = (InterfaceC31036CGa) C75559Tl5.LIZIZ.LIZIZ("DATA_MULTI_LIVE_INVITER_SHARE_HELPER");
        if (interfaceC31036CGa != null) {
            if (item.sharedInvitationType == 2) {
                z = true;
            } else {
                z = false;
            }
            interfaceC31036CGa.LIZ(item, i, z, aqS163S0100000_13, new AqS144S0200000_13(this, item, 25));
        }
    }

    @Override // X.TZK
    public final void LJJIII(long j, boolean z) {
        if (!this.LJLILLLLZI) {
            return;
        }
        LJJJJL();
        if (isShowing() && 1 != MultiGuestV3HostAcceptApplyOptimization.getValue() && !z) {
            dismiss();
        }
        if (1 == MultiGuestV3HostAcceptApplyOptimization.getValue()) {
            LJJLIIIJLLLLLLLZ(j);
        }
        int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
        C29556Biq.LIZ().getClass();
        C75457TjR.LJIIIIZZ(LJJJJZI, j, C74983Tbn.LIZJ(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ LJJIJLIJ(long r10, java.util.List r12) {
        /*
            r9 = this;
            boolean r0 = r9.LJJJJLI()
            if (r0 == 0) goto L17
            com.bytedance.android.livesdk.livesetting.linkmic.PanelStyle r0 = r9.LLIIZ
            boolean r0 = r0.showViewMore
            if (r0 == 0) goto L17
            if (r12 == 0) goto L41
            int r0 = r12.size()
        L12:
            long r1 = (long) r0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 > 0) goto L3f
        L17:
            r8 = 1
        L18:
            r7 = 0
            if (r12 == 0) goto L48
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r12.iterator()
            r1 = 0
        L25:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r4 = r5.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L43
            if (r8 != 0) goto L3a
            long r1 = (long) r1
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 >= 0) goto L3d
        L3a:
            r6.add(r4)
        L3d:
            r1 = r3
            goto L25
        L3f:
            r8 = 0
            goto L18
        L41:
            r0 = 0
            goto L12
        L43:
            X.C47261Igj.LJJJJJ()
            throw r7
        L47:
            r7 = r6
        L48:
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2.LJJIJLIJ(long, java.util.List):X.OSZ");
    }

    public final void LJJL(TZX<LinkPlayerInfo, MultiLiveGuestInfoList> tzx, long j) {
        String LJ;
        String str;
        List<ListByTypeResponse.ReservedUser> LJI = tzx.LJI();
        int size = LJI.size();
        Iterator<ListByTypeResponse.ReservedUser> it = LJI.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().reserveType == 2) {
                i++;
            }
        }
        String LJJJJ = LJJJJ();
        String str2 = this.LLILIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = LJJIZ().LJIIJ;
        if (LJJJJZ()) {
            LJ = "cohost";
        } else {
            LJ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        }
        Long LJIILIIL = tzx.LJIILIIL();
        if (LJIILIIL != null) {
            str = LJIILIIL.toString();
        } else {
            str = null;
        }
        C74824TYe.LJIJ(LJJJJ, str2, tzx, multiLiveAnchorPanelSettings, LJ, size, i, str, 0, j, LJJIIZI(), this.LLILLIZIL, 256);
        int size2 = tzx.LJFF().size();
        HashMap LIZLLL = C73098SmU.LIZLLL();
        LIZLLL.put("friends_cnt", String.valueOf(size2));
        C74824TYe.LJLL("livesdk_anchor_guest_connection_friend_list_result", LIZLLL);
        C74856TZk.LIZJ = i;
    }

    public final void LJJLIIIJJI(String str, String str2) {
        boolean z;
        int ceil;
        int i;
        int i2;
        String str3;
        Boolean bool;
        FP1.LJFF("onBannerClick, ", str, "MultiLiveAsAnchorListDialogV2");
        if (str2 != null) {
            LJJJLZIJ(str2, "click");
        }
        C75038Tcg LJJIJ = LJJIJ();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        LJJIJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("openPageWithUri, ");
        LIZ.append(str);
        C32014ChO.LIZ("MultiLiveBannerHelper", X1D.LIZIZ(LIZ));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
            if (queryParameter == null) {
                queryParameter = "";
            }
            boolean z2 = true;
            if (!TextUtils.isEmpty(queryParameter)) {
                IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
                int i3 = 0;
                if (iHostAction != null) {
                    z = iHostAction.hostInterceptSpark(str);
                } else {
                    z = false;
                }
                DataChannel dataChannel = LJJIJ.LIZ;
                if (dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || (z2 = bool.booleanValue())) {
                    ceil = (int) Math.ceil(C15380j0.LJIJ(B9K.LIZIZ(context)) * 0.7d);
                } else {
                    ceil = (int) C15380j0.LJIJ(B9K.LIZJ(context));
                }
                int ceil2 = (int) Math.ceil(C15380j0.LJIJ(B9K.LIZJ(context)));
                if (z) {
                    C29682Bks LIZJ = C29683Bkt.LIZJ(queryParameter);
                    BY3 by3 = BY3.DP;
                    LIZJ.LJIIJ(ceil, by3);
                    if (!z2) {
                        ceil2 = 375;
                    }
                    LIZJ.LJIL(ceil2, by3);
                    C29682Bks.LJIJI(LIZJ, 8);
                    if (z2) {
                        str3 = "bottom";
                    } else if (!CCJ.LIZ(context)) {
                        str3 = "right";
                    } else {
                        str3 = "left";
                    }
                    LIZJ.LJIIIZ(str3);
                    String uri = LIZJ.LIZ().toString();
                    o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder\n…      .build().toString()");
                    InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
                    o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
                    C05590Jv.LJ((IHybridContainerService) LIZ2, context, uri);
                    return;
                }
                C30882CAc Lu = ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
                C28870BUs c28870BUs = new C28870BUs(queryParameter);
                c28870BUs.LIZIZ = ceil2;
                c28870BUs.LIZJ = ceil;
                if (z2) {
                    i = 8;
                } else {
                    i = 0;
                    i3 = 8;
                }
                c28870BUs.LIZ(8, i, i3);
                c28870BUs.LJIIL = !z2;
                if (z2) {
                    i2 = 80;
                } else {
                    i2 = 8388613;
                }
                c28870BUs.LJIIIZ = i2;
                BaseDialogFragment.wl(C29306Beo.LIZ(context), Lu.LIZ(c28870BUs));
                return;
            }
            "Check failed.".toString();
            throw new IllegalStateException("Check failed.");
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLJ(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView) {
        AbstractC74727TUl LIZ;
        List LJJIFFI;
        int size;
        int i;
        int i2;
        String str;
        AbstractC74727TUl LIZ2;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        if (LLILL != -1 && LLILLJJLI != -1) {
            AbstractC029409q adapter = recyclerView.getAdapter();
            o.LJII(adapter, "null cannot be cast to non-null type me.drakeet.multitype.MultiTypeAdapter");
            C31413CUn c31413CUn = (C31413CUn) adapter;
            List<?> list = c31413CUn.LJLIL;
            ArrayList LIZIZ = s1.LIZIZ(list, "adapter.items");
            Iterator<?> it = list.iterator();
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i5 = i3 + 1;
                    if (i3 >= 0) {
                        if (LLILL <= i3 && i3 <= LLILLJJLI && (next instanceof LinkPlayerInfo) && ((LinkPlayerInfo) next).LIZIZ == 4) {
                            LIZIZ.add(next);
                        }
                        i3 = i5;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                } else {
                    Iterator it2 = LIZIZ.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        if ((next2 instanceof LinkPlayerInfo) && !this.LLILLJJLI.contains(next2)) {
                            this.LLILLJJLI.add(next2);
                            C74824TYe c74824TYe = C74824TYe.LIZ;
                            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) next2;
                            long id = linkPlayerInfo.mUser.getId();
                            InterfaceC31805Ce1 LJJJJJL = LJJJJJL();
                            if (LJJJJJL != null && (LIZ2 = LJJJJJL.LIZ()) != null) {
                                i = LIZ2.LJJIFFI().indexOf(linkPlayerInfo);
                            } else {
                                i = 0;
                            }
                            int i6 = i + 1;
                            if (linkPlayerInfo.onlineStatus == i4) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            if (i6 <= 0) {
                                if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                                    StackTraceElement LJ = C32014ChO.LJ();
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    str = C77800Ug8.LIZLLL(U44.BIZ, LIZ3, "_MultiLiveLogHelper_", LJ, LIZ3);
                                } else {
                                    str = "MultiLiveLogHelper";
                                }
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("logAMGConnectionFriendInviteShow rank:");
                                LIZ4.append(i6);
                                LIZ4.append(" return this item is not in list!");
                                C32014ChO.LJIIJ(str, X1D.LIZIZ(LIZ4));
                            } else {
                                HashMap LIZLLL = C73098SmU.LIZLLL();
                                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                                if (room != null) {
                                    String idStr = room.getIdStr();
                                    o.LJIIIIZZ(idStr, "room.idStr");
                                    LIZLLL.put("room_id", idStr);
                                    LIZLLL.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                                }
                                LIZLLL.put("invitee_id", String.valueOf(id));
                                LIZLLL.put("rank", String.valueOf(i6));
                                LIZLLL.put("online_status", String.valueOf(i2));
                                C74824TYe.LIZJ(c74824TYe, LIZLLL);
                                C74824TYe.LJLL("livesdk_anchor_guest_connection_friend_invite_show", LIZLLL);
                            }
                        }
                        i4 = 1;
                    }
                    if (this.LLFFF) {
                        this.LLFFF = false;
                        List<?> list2 = c31413CUn.LJLIL;
                        ArrayList LIZIZ2 = s1.LIZIZ(list2, "adapter.items");
                        int i7 = 0;
                        for (Object obj : list2) {
                            int i8 = i7 + 1;
                            if (i7 >= 0) {
                                if (LLILL <= i7 && i7 <= LLILLJJLI && (obj instanceof LinkPlayerInfo) && ((LinkPlayerInfo) obj).LIZIZ == 4) {
                                    LIZIZ2.add(obj);
                                }
                                i7 = i8;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        Iterator it3 = LIZIZ2.iterator();
                        if (it3.hasNext()) {
                            it3.next();
                            InterfaceC31805Ce1 LJJJJJL2 = LJJJJJL();
                            if (LJJJJJL2 != null && (LIZ = LJJJJJL2.LIZ()) != null && (LJJIFFI = LIZ.LJJIFFI()) != null && (size = LJJIFFI.size()) > 0) {
                                C74824TYe c74824TYe2 = C74824TYe.LIZ;
                                HashMap LIZLLL2 = C73098SmU.LIZLLL();
                                LIZLLL2.put("friends_cnt", String.valueOf(size));
                                C74824TYe.LIZJ(c74824TYe2, LIZLLL2);
                                C74824TYe.LJLL("livesdk_anchor_guest_connection_friend_list_show", LIZLLL2);
                                return;
                            }
                            C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", "onScrolled report error as friendListSize is zero!!!");
                            C30868C9o.LJI("friendListSize is zero please check !");
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public MultiLiveAsAnchorListDialogV2(Context context, DataChannel dataChannel, TZ8 tz8, int i) {
        super(context);
        this.LJLJI = dataChannel;
        this.LJLJJI = tz8;
        this.LJLJJL = i;
        this.LJZL = new C31413CUn();
        this.LL = new C31413CUn();
        this.LLD = new C31598Cag(this);
        this.LLFFF = true;
        this.LLFII = new CJ2();
        this.LLFZ = new CJ2();
        this.LLI = new CJ2();
        this.LLIFFJFJJ = new CJ2();
        this.LLII = new CJ2();
        this.LLIIII = new CJ2();
        this.LLIIIILZ = new CJ2();
        this.LLIIIJ = true;
        this.LLIIIL = true;
        this.LLIIIZ = C221108m2.LIZIZ(C75056Tcy.LJLIL);
        this.LLIIJI = C221108m2.LIZIZ(C75055Tcx.LJLIL);
        this.LLIILZL = new C75077TdJ(dataChannel);
        PanelStyle value = MultiGuestAnchorPanelTypeSetting.INSTANCE.getValue();
        this.LLIIZ = value;
        this.LLIL = value.panelType;
        this.LLILII = new C31009CEz(0);
        this.LLILIL = "guest";
        this.LLILLJJLI = new LinkedHashSet();
        this.LLILLL = true;
        this.LLILZLL = true;
        this.LLIZLLLIL = true;
        this.LLJ = new LinkedHashSet();
        this.LLJILJILJ = C221108m2.LIZIZ(new AqS163S0100000_13(context, 102));
        this.LLJJ = new long[2];
        this.LLJJI = C221108m2.LIZIZ(C75065Td7.LJLIL);
        this.LLJJIII = C221108m2.LIZIZ(new AqS163S0100000_13(context, 104));
        this.LLJJIJI = new CopyOnWriteArrayList<>();
        this.LLJJIJIIJIL = new LinkedHashMap();
        this.LLJJIJIL = new LinkedHashMap();
        this.LLJJJ = new IDrS51S0100000_13(this, 2);
        this.LLJJJIL = true;
        this.LLJJJJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 103));
        this.LLJJJJJIL = new C75041Tcj(this);
        C75559Tl5.LIZIZ.LIZLLL(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x054d, code lost:
    
        if (r1 != r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x02da, code lost:
    
        if (r38.isEmpty() == false) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLILLLLZI(java.util.List<com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse.ReservedUser> r34, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r35, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r36, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r37, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r38, java.util.List<? extends com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo> r39, java.util.List<com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse.GiftScoreAppliedUser> r40) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2.LJLILLLLZI(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2, android.app.Dialog] */
    public final void LJLJJL(List<ListByTypeResponse.ReservedUser> list, List<? extends LinkPlayerInfo> list2, List<? extends LinkPlayerInfo> list3, List<? extends LinkPlayerInfo> list4, List<? extends LinkPlayerInfo> list5, List<? extends LinkPlayerInfo> list6, List<ListByTypeResponse.GiftScoreAppliedUser> list7) {
        Integer num;
        List list8;
        Object obj;
        C31413CUn c31413CUn;
        Object obj2;
        Object obj3;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        Integer num2;
        User user;
        Long valueOf;
        int i;
        Long valueOf2;
        ArrayList arrayList = new ArrayList();
        if (!LJJJJZI() || list7 == null || list7.isEmpty()) {
            if (list3 != null) {
                Iterator<? extends LinkPlayerInfo> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        } else {
            int i2 = 0;
            for (ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser : list7) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ListByTypeResponse.GiftScoreAppliedUser giftScoreAppliedUser2 = giftScoreAppliedUser;
                    LinkPlayerInfo linkPlayerInfo = giftScoreAppliedUser2.listUser;
                    if (linkPlayerInfo != null) {
                        arrayList.add(linkPlayerInfo);
                        User user2 = linkPlayerInfo.mUser;
                        if (user2 != null && (valueOf2 = Long.valueOf(user2.getId())) != null) {
                            LJJJJIZL().put(valueOf2, Long.valueOf(giftScoreAppliedUser2.giftScore));
                            LJJJJJ().put(valueOf2, Integer.valueOf(i3));
                        }
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (TUZ.LIZ() && (multiLiveAnchorPanelSettings = LJJIZ().LJIIJ) != null && multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold > 0) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            concurrentHashMap.putAll(LJJIJIIJI().LIZ);
            LJJIJIIJI().LIZ.clear();
            Iterator it2 = arrayList.iterator();
            int i4 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((LinkPlayerInfo) it2.next()).isLastMeetGiftScoreThresholdApplier) {
                    if (i4 > -1) {
                        LJJIJIIJI().LIZIZ = true;
                        LJJIJIIJI().LIZJ = i4 + 1;
                        Iterator it3 = arrayList.iterator();
                        int i5 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i6 = i5 + 1;
                            if (i5 >= 0) {
                                LinkPlayerInfo linkPlayerInfo2 = (LinkPlayerInfo) next;
                                if (linkPlayerInfo2 != null && (user = linkPlayerInfo2.mUser) != null && (valueOf = Long.valueOf(user.getId())) != null) {
                                    ConcurrentHashMap<Long, Integer> concurrentHashMap2 = LJJIJIIJI().LIZ;
                                    if (i5 == 0) {
                                        if (i5 == i4) {
                                            i = 4;
                                        } else {
                                            i = 1;
                                        }
                                    } else if (i5 < i4) {
                                        i = 2;
                                    } else if (i5 == i4) {
                                        i = 3;
                                    } else {
                                        i = 0;
                                    }
                                    concurrentHashMap2.put(valueOf, Integer.valueOf(i));
                                }
                                i5 = i6;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        ConcurrentHashMap<Long, Integer> concurrentHashMap3 = LJJIJIIJI().LIZ;
                        int i7 = LJJIJIIJI().LIZJ;
                        if (concurrentHashMap.size() != concurrentHashMap3.size()) {
                            C74825TYf.LIZLLL(i7);
                        } else {
                            for (Map.Entry<Long, Integer> entry : concurrentHashMap3.entrySet()) {
                                long longValue = entry.getKey().longValue();
                                int intValue = entry.getValue().intValue();
                                if (concurrentHashMap.get(Long.valueOf(longValue)) == null || (num2 = (Integer) concurrentHashMap.get(Long.valueOf(longValue))) == null || num2.intValue() != intValue) {
                                    C74825TYf.LIZLLL(i7);
                                }
                            }
                        }
                    }
                } else {
                    i4++;
                }
            }
            LJJIJIIJI().LIZIZ = false;
            LJJIJIIJI().LIZJ = 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateUserInfo currentType:");
        LIZ.append(this.LLIIZ);
        LIZ.append(" notViewerFriendList:");
        if (list5 != null) {
            num = Integer.valueOf(list5.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(" onceShowAllTab:");
        LIZ.append(this.LLILLL);
        C0NB.LIZIZ("MultiLiveAsAnchorListDialogV2", X1D.LIZIZ(LIZ));
        if (LJJJLL()) {
            ViewPager viewPager = this.LJLLLLLL;
            if (viewPager != null) {
                if (viewPager.getCurrentItem() == 0) {
                    if (list2 != null && !list2.isEmpty()) {
                        LJLILLLLZI(list, list2, arrayList, list4, list6, C61878OQg.INSTANCE, list7);
                    }
                    if (this.LLILLL) {
                        this.LLILLL = false;
                        LJLIIIL(list5);
                    }
                    List<?> list9 = this.LJZL.LJLIL;
                    o.LJIIIIZZ(list9, "getGuestListAdapter().items");
                    Iterator<?> it4 = list9.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            if (obj3 instanceof C75069TdB) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    LJJIIJZLJL(obj3);
                } else {
                    LJLIIIL(list5);
                    if (LJJJLL()) {
                        c31413CUn = this.LL;
                    } else {
                        c31413CUn = this.LJZL;
                    }
                    List<?> list10 = c31413CUn.LJLIL;
                    o.LJIIIIZZ(list10, "getInvitationAdapter().items");
                    Iterator<?> it5 = list10.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            obj2 = it5.next();
                            if (obj2 instanceof C75091TdX) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    LJJIIJZLJL(obj2);
                }
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        } else {
            if (LJJJJLI()) {
                list8 = new ArrayList();
                if (list5 != null) {
                    list8.addAll(list5);
                }
                if (list4 != null) {
                    list8.removeAll(list4);
                }
            } else {
                list8 = C61878OQg.INSTANCE;
            }
            LJLILLLLZI(list, list2, arrayList, list4, list6, list8, list7);
            List<?> list11 = this.LJZL.LJLIL;
            o.LJIIIIZZ(list11, "getGuestListAdapter().items");
            Iterator<?> it6 = list11.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj = it6.next();
                    if (obj instanceof C75069TdB) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LJJIIJZLJL(obj);
        }
        LJJJIL().setVisibility(8);
        if (LJJJLL()) {
            ViewPager viewPager2 = this.LJLLLLLL;
            if (viewPager2 != null) {
                viewPager2.setVisibility(0);
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        } else {
            RunnableC31065CHd runnableC31065CHd = this.LJLJL;
            if (runnableC31065CHd != null) {
                runnableC31065CHd.setVisibility(0);
            }
        }
        if (LJJJJZ()) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.fty);
            this.LJZI = frameLayout;
            if (frameLayout != null) {
                C87277YNd.LJJIJ(frameLayout);
            }
        }
    }

    public final void LJJLJLI(List list, List list2, List list3, List list4, List list5, List list6, List list7, boolean z, boolean z2) {
        this.LLFII.clear();
        if (list != null) {
            this.LLFII.addAll(list);
        }
        this.LLFZ.clear();
        if (list2 != null) {
            this.LLFZ.addAll(list2);
        }
        this.LLI.clear();
        if (list3 != null) {
            this.LLI.addAll(list3);
        }
        this.LLII.clear();
        if (list4 != null) {
            this.LLII.addAll(list4);
        }
        this.LLIIII.clear();
        if (list5 != null) {
            this.LLIIII.addAll(list5);
        }
        this.LLIIIILZ.clear();
        if (list6 != null) {
            this.LLIIIILZ.addAll(list6);
        }
        this.LLIIIL = z;
        this.LLIIIJ = z2;
        this.LLIFFJFJJ.clear();
        if (list7 != null) {
            this.LLIFFJFJJ.addAll(list7);
        }
    }
}
