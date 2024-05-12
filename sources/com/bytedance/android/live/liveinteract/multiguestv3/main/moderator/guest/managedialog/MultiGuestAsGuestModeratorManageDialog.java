package com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog;

import X.AbstractC74727TUl;
import X.AbstractDialogC29234Bde;
import X.C03880Dg;
import X.C05170If;
import X.C0A3;
import X.C0NB;
import X.C0NE;
import X.C15380j0;
import X.C276516r;
import X.C28733BPl;
import X.C29079Bb9;
import X.C29306Beo;
import X.C29401Dk;
import X.C29553Bin;
import X.C29556Biq;
import X.C2A7;
import X.C31413CUn;
import X.C31811Ce7;
import X.C47071t1;
import X.C47261Igj;
import X.C58578Mys;
import X.C61878OQg;
import X.C65300Pk0;
import X.C73318Sq2;
import X.C74736TUu;
import X.C74740TUy;
import X.C74824TYe;
import X.C74825TYf;
import X.C74838TYs;
import X.C74849TZd;
import X.C74855TZj;
import X.C74896TaO;
import X.C74897TaP;
import X.C74900TaS;
import X.C74931Tax;
import X.C74947TbD;
import X.C74983Tbn;
import X.C75024TcS;
import X.C75033Tcb;
import X.C75040Tci;
import X.C75054Tcw;
import X.C75457TjR;
import X.C75559Tl5;
import X.C76800UCe;
import X.C76917UGr;
import X.C78886Uxe;
import X.C8E;
import X.CJ2;
import X.CL8;
import X.CVT;
import X.DialogC77438UaI;
import X.EnumC74778TWk;
import X.IPJ;
import X.InterfaceC29081BbB;
import X.InterfaceC74853TZh;
import X.InterfaceC75125Te5;
import X.InterfaceC75558Tl4;
import X.ORZ;
import X.OSZ;
import X.RunnableC31065CHd;
import X.TR2;
import X.V10;
import X.X1D;
import Y.IDcS94S0200000_13;
import Y.IDrS51S0100000_13;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplyFailEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAudienceCancelApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.LinkInRoomGuestApplySucceedEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestModeratorPermitGuestEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveHostAcceptGuestResultDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestDisconnectByWindowWithConfirmEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestAnchorPanelSettingChangeFromIMEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkAbnormalConnectionOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3TitleTypeSwitch;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class MultiGuestAsGuestModeratorManageDialog extends AbstractDialogC29234Bde implements GenericLifecycleObserver, InterfaceC75125Te5, InterfaceC29081BbB, C0A3 {
    public final DataChannel LJLJI;
    public final IPJ LJLJJI;
    public RunnableC31065CHd LJLJJL;
    public CVT LJLJJLL;
    public View LJLJL;
    public final C31413CUn LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final C29079Bb9 LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public C75024TcS LJLLLLLL;
    public final CopyOnWriteArrayList<String> LJLZ;
    public final Map<String, C75054Tcw> LJZ;
    public final Map<String, Integer> LJZI;
    public final IDrS51S0100000_13 LJZL;
    public final TR2 LL;

    @InterfaceC75558Tl4(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder multiGuestDataHolder;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.cz4;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC75125Te5
    public final void LJJII() {
        C31811Ce7.LIZLLL("MultiGuestModeratorsManageDialog", "onDisConnectClicked");
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            dataChannel.qv0(GuestDisconnectByWindowWithConfirmEvent.class, new OSZ("guest_icon", 10002));
        }
        dismiss();
    }

    public final InterfaceC74853TZh LJJIIZ() {
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        if (LIZ instanceof InterfaceC74853TZh) {
            return (InterfaceC74853TZh) LIZ;
        }
        return null;
    }

    public final void LJJIJIL() {
        C0NB.LIZIZ("MultiGuestModeratorsManageDialog", "showAnchorOnly");
        CJ2 cj2 = new CJ2();
        LinkPlayerInfo LJIIIZ = C74947TbD.LJIIIZ();
        if (LJIIIZ != null) {
            cj2.add(LJIIIZ);
        }
        cj2.add(new C75033Tcb());
        C31413CUn c31413CUn = this.LJLJLJ;
        c31413CUn.LJLIL = cj2;
        c31413CUn.notifyDataSetChanged();
    }

    @Override // android.app.Dialog, android.content.DialogInterface, X.InterfaceC29081BbB
    public final void dismiss() {
        C31811Ce7.LIZLLL("MultiGuestModeratorsManageDialog", "dismiss");
        super.dismiss();
        this.LJLLJ.getClass();
        if (this.multiGuestDataHolder != null) {
            return;
        }
        o.LJIJI("multiGuestDataHolder");
        throw null;
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        C31811Ce7.LIZLLL("MultiGuestModeratorsManageDialog", "onAttachedToWindow");
        super.onAttachedToWindow();
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            dataChannel.mv0(LinkInRoomGuestApplySucceedEvent.class, this, new AqS179S0100000_13(this, 469));
            dataChannel.mv0(LinkInRoomAudienceCancelApplySucceedEvent.class, this, new AqS179S0100000_13(this, 470));
            dataChannel.mv0(LinkInRoomAudienceCancelApplyFailEvent.class, this, new AqS179S0100000_13(this, 471));
        }
        C8E.LJ().e3(this.LL);
        IPJ ipj = this.LJLJJI;
        if (ipj != null) {
            C75024TcS c75024TcS = new C75024TcS();
            this.LJLLLLLL = c75024TcS;
            View findViewById = findViewById(R.id.fl8);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.layout_root)");
            DataChannel dataChannel2 = this.LJLJI;
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            C28733BPl.LJIILIIL().getClass();
            C0NE.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "init");
            c75024TcS.LJLJL = new C73318Sq2();
            c75024TcS.LJLJJL = ipj;
            c75024TcS.LJLJJLL = context;
            c75024TcS.LJLIL = findViewById.findViewById(R.id.ixm);
            C2A7 c2a7 = (C2A7) findViewById.findViewById(R.id.ixn);
            c75024TcS.LJLILLLLZI = c2a7;
            if (c2a7 != null) {
                C29306Beo.LJJL(c2a7, R.id.ixn, 1000L, new AqS179S0100000_13(c75024TcS, 468));
            }
            c75024TcS.LJLJJI = dataChannel2;
            if (dataChannel2 != null) {
                dataChannel2.mv0(MultiGuestAnchorPanelSettingChangeFromIMEvent.class, c75024TcS, new AqS179S0100000_13(c75024TcS, 467));
            }
            C74740TUy.LIZLLL().LIZ(c75024TcS);
            c75024TcS.LIZJ();
            C75024TcS c75024TcS2 = this.LJLLLLLL;
            if (c75024TcS2 != null) {
                AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this, 472);
                C31811Ce7.LIZLLL("ModeratorsMangeDialogGuestOperationViewSet", "setCancelReserveListener");
                c75024TcS2.LJLJLJ = aqS179S0100000_13;
            }
        }
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        DialogC77438UaI dialogC77438UaI;
        C31811Ce7.LIZLLL("MultiGuestModeratorsManageDialog", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C8E.LJ().X3(this.LL);
        C75024TcS c75024TcS = this.LJLLLLLL;
        if (c75024TcS != null) {
            C31811Ce7.LIZLLL("ModeratorsMangeDialogGuestOperationViewSet", "destroy");
            DataChannel dataChannel2 = c75024TcS.LJLJJI;
            if (dataChannel2 != null) {
                dataChannel2.jv0(c75024TcS);
            }
            C74740TUy.LIZLLL().LIZJ(c75024TcS);
            DialogC77438UaI dialogC77438UaI2 = c75024TcS.LJLJI;
            if (dialogC77438UaI2 != null && dialogC77438UaI2.isShowing() && (dialogC77438UaI = c75024TcS.LJLJI) != null) {
                dialogC77438UaI.dismiss();
            }
            C73318Sq2 c73318Sq2 = c75024TcS.LJLJL;
            if (c73318Sq2 != null) {
                c73318Sq2.LIZLLL();
            }
            c75024TcS.LJLJLJ = null;
        }
        this.LJLLLLLL = null;
        this.LJLJLJ.LJLIL = new CJ2();
        RunnableC31065CHd runnableC31065CHd = this.LJLJJL;
        if (runnableC31065CHd != null) {
            runnableC31065CHd.getRecycledViewPool().clear();
            ((LinkedHashMap) this.LJZ).clear();
            ((LinkedHashMap) this.LJZI).clear();
            this.LJLZ.clear();
            C75040Tci.LJII();
            return;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x014a, code lost:
    
        if (r10.isEmpty() == false) goto L114;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oo0() {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog.oo0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.DialogC38611fN, android.app.Dialog
    public final void show() {
        AbstractC74727TUl abstractC74727TUl;
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", "show");
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/widget/CommonBottomDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-3406006511768727123")).LIZ) {
            super.show();
        }
        this.LJLLLL = true;
        Integer num = (Integer) C74740TUy.LIZLLL().LIZIZ;
        if (num == null || num.intValue() != 2 || this.LJLLILLLL) {
            return;
        }
        this.LJLLILLLL = true;
        InterfaceC74853TZh LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            abstractC74727TUl = LJJIIZ.LIZ();
        } else {
            abstractC74727TUl = null;
        }
        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
        if (multiGuestDataHolder != null) {
            C74824TYe.LJIJ("guest_icon", "", abstractC74727TUl, multiGuestDataHolder.LJIIJ, null, 0, 0, null, 0, 0L, 0, null, 4080);
        } else {
            o.LJIJI("multiGuestDataHolder");
            throw null;
        }
    }

    @Override // X.InterfaceC29081BbB
    public final DataChannel LJIIL() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC75125Te5
    public final void LIZ(LinkPlayerInfo item) {
        AbstractC74727TUl LIZ;
        List LJIL;
        Object obj;
        o.LJIIIZ(item, "item");
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onInviteClicked, uid=");
        LIZ2.append(item.mUser.getId());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        C58578Mys.LIZIZ(item.mUser.getId());
        C74896TaO.LJI(item);
        InterfaceC74853TZh LJJIIZ = LJJIIZ();
        if (LJJIIZ != null && (LIZ = LJJIIZ.LIZ()) != null && (LJIL = LIZ.LJIL()) != null) {
            Iterator it = LJIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((LinkPlayerInfo) obj).mUser.getId() == item.mUser.getId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null) {
                linkPlayerInfo.mRoleType = 3;
            }
        }
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            User user = item.mUser;
            MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
            if (multiGuestDataHolder != null) {
                String LJII = multiGuestDataHolder.LJII();
                MultiGuestDataHolder multiGuestDataHolder2 = this.multiGuestDataHolder;
                if (multiGuestDataHolder2 != null) {
                    dataChannel.qv0(MultiGuestModeratorInviteGuestEvent.class, new C74849TZd(user, LJII, multiGuestDataHolder2.LJJIIZI));
                    return;
                } else {
                    o.LJIJI("multiGuestDataHolder");
                    throw null;
                }
            }
            o.LJIJI("multiGuestDataHolder");
            throw null;
        }
    }

    @Override // X.InterfaceC75125Te5
    public final void LIZJ(LinkPlayerInfo item) {
        AbstractC74727TUl LIZ;
        LinkPlayerInfo linkPlayerInfo;
        o.LJIIIZ(item, "item");
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onRejectClicked, uid=");
        LIZ2.append(item.mUser.getId());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            User user = item.mUser;
            o.LJIIIIZZ(user, "item.user");
            dataChannel.qv0(MultiGuestModeratorPermitGuestEvent.class, new C29553Bin(2, user));
        }
        ((HashSet) C74838TYs.LJ().LJIL).remove(Long.valueOf(item.mUser.getId()));
        InterfaceC74853TZh LJJIIZ = LJJIIZ();
        if (LJJIIZ != null && (LIZ = LJJIIZ.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) LIZ.LJIIL(item.mUser.getId())) != null) {
            linkPlayerInfo.LIZ = 0;
        }
        C75457TjR.LJIIJ("click", item.mUser.getFollowInfo().getFollowStatus(), item.mUser, null, null, null, null);
    }

    @Override // X.InterfaceC75125Te5
    public final void LIZLLL(User user) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("kickOut, uid=");
        LIZ.append(user.getId());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        if (!this.LJLILLLLZI) {
            return;
        }
        String LJIILL = C15380j0.LJIILL(R.string.kv7, C05170If.LIZ(user));
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LIZJ = LJIILL;
        c47071t1.LJFF(R.string.kv8);
        c47071t1.LJIIL(R.string.l0t, new IDcS94S0200000_13(this, user, 0));
        c47071t1.LJIIIZ(R.string.kg7, C74855TZj.LJLIL);
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-3406006511768727123")).LIZ) {
            LIZ2.show();
        }
        C74736TUu.LIZ.LJIL(0, "disconnect_popup_show", new JSONObject(), true);
    }

    @Override // X.InterfaceC75125Te5
    public final void LJFF(LinkPlayerInfo item) {
        String str;
        o.LJIIIZ(item, "item");
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("permit, uid=");
        User user = item.mUser;
        if (user != null) {
            str = user.getIdStr();
        } else {
            str = null;
        }
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        C58578Mys.LIZIZ(item.mUser.getId());
        C74896TaO.LJI(item);
        DataChannel dataChannel = this.LJLJI;
        if (dataChannel != null) {
            User user2 = item.mUser;
            o.LJIIIIZZ(user2, "item.user");
            dataChannel.qv0(MultiGuestModeratorPermitGuestEvent.class, new C29553Bin(1, user2));
        }
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
            C0NB.LJIIIZ("MultiGuestModeratorsManageDialog", X1D.LIZIZ(LIZ));
            if (this.LJZI.containsKey(str)) {
                Integer num = (Integer) ((LinkedHashMap) this.LJZI).get(str);
                int hashCode = view.hashCode();
                if (num == null || num.intValue() != hashCode) {
                    return;
                }
                C0NB.LJIIIZ("MultiGuestModeratorsManageDialog", "RealDetached");
                this.LJZ.remove(str);
                this.LJZI.remove(str);
            }
        }
    }

    public final void LJIILL(long j) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserKickOutSuccess, uid=");
        LIZ.append(j);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
    }

    public final void LJJI(Throwable th) {
        String str;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserKickOutFailed, throwable=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
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
        FollowInfo followInfo;
        FollowInfo followInfo2;
        AbstractC74727TUl LIZ3;
        o.LJIIIZ(view, "view");
        Object tag = view.getTag(R.id.ln3);
        Long l = null;
        if ((tag instanceof String) && (str = (String) tag) != null) {
            this.LJZI.put(str, Integer.valueOf(view.hashCode()));
            Object tag2 = view.getTag(R.id.ln4);
            if ((tag2 instanceof C75054Tcw) && tag2 != null) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onViewAttached ");
                LIZ4.append(str);
                LIZ4.append(' ');
                LIZ4.append(view.hashCode());
                C0NB.LJIIIZ("MultiGuestModeratorsManageDialog", X1D.LIZIZ(LIZ4));
                if (!this.LJZ.containsKey(str)) {
                    C0NB.LJIIIZ("MultiGuestModeratorsManageDialog", "not contains");
                    this.LJZ.put(str, tag2);
                } else if (o.LJ(((LinkedHashMap) this.LJZ).get(str), tag2) && this.LJLLLL) {
                    C0NB.LJIIIZ("MultiGuestModeratorsManageDialog", "contains but not changed");
                } else {
                    C0NB.LJIIIZ("MultiGuestModeratorsManageDialog", "contains but not check");
                    this.LJZ.put(str, tag2);
                }
            }
            C75040Tci.LIZIZ(str);
            if (this.LJLZ.contains(str)) {
                this.LJLZ.remove(str);
            } else {
                InterfaceC74853TZh LJJIIZ = LJJIIZ();
                if (LJJIIZ == null || (LIZ = LJJIIZ.LIZ()) == null || (LJJIJLIJ = C76917UGr.LJJIJLIJ(LIZ, str)) == null) {
                    C75040Tci.LIZLLL(str);
                } else {
                    C75040Tci.LIZJ(LJJIJLIJ.LIZ, str);
                    int i2 = -1;
                    if (LJJIJLIJ.LIZ == 1) {
                        long id = LJJIJLIJ.mUser.getId();
                        EnumC74778TWk LIZLLL = CL8.LIZLLL();
                        InterfaceC74853TZh LJJIIZ2 = LJJIIZ();
                        if (LJJIIZ2 != null && (LIZ3 = LJJIIZ2.LIZ()) != null) {
                            i = LIZ3.LJIIIIZZ().indexOf(LJJIJLIJ);
                        } else {
                            i = -1;
                        }
                        int i3 = i + 1;
                        List LIZ5 = C74896TaO.LIZ(0, LJJIJLIJ);
                        List<String> list = LJJIJLIJ.tagKeyList;
                        String LJ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
                        User user = LJJIJLIJ.mUser;
                        long j2 = 0;
                        if (user != null && (followInfo2 = user.getFollowInfo()) != null) {
                            j = followInfo2.getFollowStatus();
                        } else {
                            j = 0;
                        }
                        C74825TYf.LIZIZ(id, LIZLLL, i3, LIZ5, list, LJ, j, null, null, null);
                        C75040Tci.LJ(str);
                        if (!LJJIJLIJ.LIZJ) {
                            User user2 = LJJIJLIJ.mUser;
                            if (user2 != null && (followInfo = user2.getFollowInfo()) != null) {
                                j2 = followInfo.getFollowStatus();
                            }
                            C75457TjR.LJIIJ("show", j2, LJJIJLIJ.mUser, null, null, null, null);
                        }
                    }
                    if (LJJIJLIJ.LIZ == 0 && LJJIJLIJ.LIZIZ == 3) {
                        if (LJJIJLIJ.mRoleType != 3) {
                            str3 = "normal";
                        } else {
                            str3 = "abnormal";
                        }
                        InterfaceC74853TZh LJJIIZ3 = LJJIIZ();
                        if (LJJIIZ3 != null && (LIZ2 = LJJIIZ3.LIZ()) != null) {
                            i2 = LIZ2.LJ().indexOf(LJJIJLIJ);
                        }
                        C74824TYe.LJLJLJ(LJJIJLIJ, str3, i2 + 1, C74896TaO.LIZ(0, LJJIJLIJ), LJJIJLIJ.tagKeyList, C75457TjR.LJ(C74838TYs.LJ().LJJ), null);
                        C75040Tci.LJ(str);
                    }
                    if (LJJIJLIJ.LIZ == 2 && !LJJIJLIJ.LIZLLL && LJJIJLIJ.mRoleType != 1) {
                        C74824TYe c74824TYe = C74824TYe.LIZ;
                        C74824TYe.LJIILL = "go_live_panel";
                        InterfaceC74853TZh LJJIIZ4 = LJJIIZ();
                        if (LJJIIZ4 != null) {
                            str2 = LJJIIZ4.LIZIZ(LJJIJLIJ.mUser.getId());
                        } else {
                            str2 = null;
                        }
                        MultiGuestDataHolder multiGuestDataHolder = this.multiGuestDataHolder;
                        if (multiGuestDataHolder != null) {
                            int LIZJ = C74947TbD.LIZJ(LJJIJLIJ, multiGuestDataHolder);
                            MultiGuestDataHolder multiGuestDataHolder2 = this.multiGuestDataHolder;
                            if (multiGuestDataHolder2 != null) {
                                int LIZ6 = C74947TbD.LIZ(LJJIJLIJ, multiGuestDataHolder2);
                                if (C74931Tax.LIZ(LJJIJLIJ.mUser)) {
                                    collection = C47261Igj.LJJIJ("pm_mt_guest_tag_subscriber");
                                } else {
                                    collection = C61878OQg.INSTANCE;
                                }
                                List<String> LLJILJILJ = ORZ.LLJILJILJ(collection);
                                User user3 = LJJIJLIJ.mUser;
                                if (user3 != null) {
                                    l = Long.valueOf(user3.getId());
                                }
                                c74824TYe.LJIL(str2, LIZJ, LIZ6, LLJILJILJ, l, null);
                            } else {
                                o.LJIJI("multiGuestDataHolder");
                                throw null;
                            }
                        } else {
                            o.LJIJI("multiGuestDataHolder");
                            throw null;
                        }
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

    public final OSZ<Integer, LinkPlayerInfo> LJJIIJZLJL(long j) {
        List<?> list = this.LJLJLJ.LJLIL;
        o.LJIIIIZZ(list, "multiTypeAdapter.items");
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

    public final void LJJIIZI(long j) {
        OSZ osz;
        AbstractC74727TUl LIZ;
        List LJIL;
        Object obj;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onInviteSuccess, uid=");
        LIZ2.append(j);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        InterfaceC74853TZh LJJIIZ = LJJIIZ();
        int i = 0;
        if (LJJIIZ != null && (LIZ = LJJIIZ.LIZ()) != null && (LJIL = LIZ.LJIL()) != null) {
            Iterator it = LJIL.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((LinkPlayerInfo) obj).mUser.getId() == j) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null) {
                linkPlayerInfo.mRoleType = 3;
            }
        }
        C31413CUn c31413CUn = this.LJLJLJ;
        List<?> list = c31413CUn.LJLIL;
        o.LJIIIIZZ(list, "multiTypeAdapter.items");
        Iterator<?> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    if ((next instanceof LinkPlayerInfo) && ((LinkPlayerInfo) next).mUser.getId() == j) {
                        osz = new OSZ(Integer.valueOf(i), next);
                        break;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                osz = new OSZ(-1, new LinkPlayerInfo());
                break;
            }
        }
        c31413CUn.notifyItemChanged(((Number) osz.getFirst()).intValue());
    }

    public final void LJJIJ(long j) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserPermitSuccess, uid=");
        LIZ.append(j);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        if (!this.LJLILLLLZI) {
            return;
        }
        if (isShowing()) {
            dismiss();
        }
        int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
        C29556Biq.LIZ().getClass();
        C75457TjR.LJIIIIZZ(LJJJJZI, j, C74983Tbn.LIZJ(), true);
    }

    public final void LJJIJIIJIL(long j) {
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserRejectApplySuccess, uid=");
        LIZ.append(j);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        int intValue = LJJIIJZLJL(j).getFirst().intValue();
        if (intValue == -1) {
            return;
        }
        List<?> list = this.LJLJLJ.LJLIL;
        o.LJIIIIZZ(list, "multiTypeAdapter.items");
        int size = list.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (ListProtector.get(list, i) instanceof C74900TaS) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = 0;
                break;
            }
        }
        List<?> list2 = this.LJLJLJ.LJLIL;
        o.LJII(list2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
        C74897TaP.LJIIL((CJ2) list2, intValue, this.LJLJLJ);
        int i2 = this.LJLLL - 1;
        this.LJLLL = i2;
        if (i2 <= 0) {
            List<?> list3 = this.LJLJLJ.LJLIL;
            o.LJII(list3, "null cannot be cast to non-null type me.drakeet.multitype.Items");
            C74897TaP.LJIIL((CJ2) list3, i, this.LJLJLJ);
            if (list.size() == 1) {
                LJJIJIL();
                return;
            }
            return;
        }
        Object obj = ListProtector.get(list, i);
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.TitleItem");
        C74900TaS c74900TaS = (C74900TaS) obj;
        int i3 = this.LJLLL;
        if (i3 == 1) {
            String LJIILL = C15380j0.LJIILL(R.string.lsx, Integer.valueOf(i3));
            o.LJIIIIZZ(LJIILL, "getString(R.string.pm_guest1, requestListSize)");
            c74900TaS.LJLIL = LJIILL;
            c74900TaS.LJLILLLLZI = 0;
        } else {
            String LJIILL2 = C15380j0.LJIILL(R.string.lsy, Integer.valueOf(i3));
            o.LJIIIIZZ(LJIILL2, "getString(R.string.pm_guest2, requestListSize)");
            c74900TaS.LJLIL = LJIILL2;
            c74900TaS.LJLILLLLZI = 0;
        }
        this.LJLJLJ.notifyItemChanged(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ee, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L26;
     */
    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.managedialog.MultiGuestAsGuestModeratorManageDialog.onCreate(android.os.Bundle):void");
    }

    public final void LJIIZILJ(long j, Throwable th) {
        String str;
        int i;
        C276516r c276516r;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZJ = V10.LIZJ("onUserPermitFailed, uid=", j, ", throwable=");
        Integer num = null;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZJ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
        if (!this.LJLILLLLZI) {
            return;
        }
        if ((th instanceof C29401Dk) && (c276516r = (C276516r) th) != null) {
            num = Integer.valueOf(c276516r.getErrorCode());
        }
        if (num == null || ((num.intValue() != 10004 && num.intValue() != 31007) || !LinkmicSdkAbnormalConnectionOptSetting.INSTANCE.isOpt())) {
            C28733BPl LJIILIIL2 = C28733BPl.LJIILIIL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onUserPermitFailed, MultiLiveHostAcceptGuestResultDialogEvent, uid=");
            LIZ.append(j);
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            LJIILIIL2.getClass();
            C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ2);
            DataChannel dataChannel = this.LJLJI;
            if (dataChannel != null) {
                dataChannel.qv0(MultiLiveHostAcceptGuestResultDialogEvent.class, Long.valueOf(j));
            }
        } else {
            C28733BPl LJIILIIL3 = C28733BPl.LJIILIIL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserPermitFailed, removeApplierByUid, uid=");
            LIZ2.append(j);
            String LIZIZ3 = X1D.LIZIZ(LIZ2);
            LJIILIIL3.getClass();
            C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ3);
            int intValue = LJJIIJZLJL(j).getFirst().intValue();
            if (intValue != -1) {
                List<?> list = this.LJLJLJ.LJLIL;
                o.LJIIIIZZ(list, "multiTypeAdapter.items");
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
                List<?> list2 = this.LJLJLJ.LJLIL;
                o.LJII(list2, "null cannot be cast to non-null type me.drakeet.multitype.Items");
                C74897TaP.LJIIL((CJ2) list2, intValue, this.LJLJLJ);
                if (i2 <= 1 && i != -1) {
                    List<?> list3 = this.LJLJLJ.LJLIL;
                    o.LJII(list3, "null cannot be cast to non-null type me.drakeet.multitype.Items");
                    C74897TaP.LJIIL((CJ2) list3, i, this.LJLJLJ);
                }
            }
        }
        int LJJJJZI = C78886Uxe.LJJJJZI(C8E.LJ());
        C29556Biq.LIZ().getClass();
        C75457TjR.LJIIIIZZ(LJJJJZI, j, C74983Tbn.LIZJ(), false);
    }

    public final void LJJIJIIJI(long j, Throwable th) {
        String str;
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZJ = V10.LIZJ("onUserRejectApplyFail, uid=", j, ", throwable=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        LIZJ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        LJIILIIL.getClass();
        C0NE.LIZ("MultiGuestModeratorsManageDialog", LIZIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiGuestAsGuestModeratorManageDialog(Context context, DataChannel dataChannel, IPJ openMultiGuestModeratorsManageDialogInfo) {
        super(context);
        o.LJIIIZ(openMultiGuestModeratorsManageDialogInfo, "openMultiGuestModeratorsManageDialogInfo");
        this.LJLJI = dataChannel;
        this.LJLJJI = openMultiGuestModeratorsManageDialogInfo;
        this.LJLJLJ = new C31413CUn();
        this.LJLLJ = new C29079Bb9(this);
        this.LJLLLL = true;
        this.LJLZ = new CopyOnWriteArrayList<>();
        this.LJZ = new LinkedHashMap();
        this.LJZI = new LinkedHashMap();
        this.LJZL = new IDrS51S0100000_13(this, 1);
        this.LL = new TR2(this);
        C75559Tl5.LIZIZ.LIZLLL(this);
    }
}
