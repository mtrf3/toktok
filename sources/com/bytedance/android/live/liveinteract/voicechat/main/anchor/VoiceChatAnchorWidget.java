package com.bytedance.android.live.liveinteract.voicechat.main.anchor;

import X.C03880Dg;
import X.C113554cx;
import X.C221108m2;
import X.C28268B7o;
import X.C29306Beo;
import X.C29494Bhq;
import X.C32185Ck9;
import X.C32I;
import X.C44729Hgz;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C74630TQs;
import X.C74650TRm;
import X.C74838TYs;
import X.C74843TYx;
import X.C75059Td1;
import X.C75072TdE;
import X.C75073TdF;
import X.C75395TiR;
import X.C75457TjR;
import X.C75559Tl5;
import X.C79234V7u;
import X.C8E;
import X.C8VV;
import X.InterfaceC55235Lm3;
import X.InterfaceC74695TTf;
import X.InterfaceC75138TeI;
import X.InterfaceC75441TjB;
import X.InterfaceC75973Trl;
import X.OSZ;
import X.TYN;
import X.TZC;
import X.U4L;
import X.UC0;
import Y.IDDListenerS152S0100000_13;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.model.AnchorOpenListDialogWithPositionEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AudioStateChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.FetchListByTypeErrorEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiLiveDialogBackEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.PlayerPauseLiveForAnchorDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.ShowUserListDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.MultiLiveAsAnchorListDialogV2;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestApplyNumChangedEvent;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAnchorPanelTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS57S0400000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VoiceChatAnchorWidget extends AbsVoiceChatWidget implements TZC {
    public C74843TYx LJLILLLLZI;
    public MultiLiveAsAnchorListDialogV2 LJLJI;
    public LinkDialog LJLJJI;
    public C75072TdE LJLJJL;
    public final TYN LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;

    @InterfaceC75138TeI(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    public static void LJZI(MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/userinfo/anchor/MultiLiveAsAnchorListDialogV2", "show", multiLiveAsAnchorListDialogV2, new Object[0], "void", new C65300Pk0(false, "()V", "-8552292654211148226")).LIZ) {
            return;
        }
        multiLiveAsAnchorListDialogV2.show();
    }

    @Override // X.TZC
    public final /* synthetic */ void AP() {
    }

    @Override // X.TZC
    public final void Cg() {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean LJLZ() {
        return true;
    }

    @Override // X.TZC
    public final void aP() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dl4;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final boolean interceptCloseRoom(Runnable runnable, boolean z, boolean z2, C28268B7o c28268B7o) {
        return false;
    }

    @Override // X.TZC
    public final /* synthetic */ void l1() {
    }

    @Override // X.TZC
    public final /* synthetic */ void l80() {
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.android.live.liveinteract.voicechat.api.AbsVoiceChatSubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.TZC
    public final /* synthetic */ void onTalkVoiceUpdated(int i) {
    }

    @Override // X.TZC
    public final /* synthetic */ void s30(C74630TQs c74630TQs) {
    }

    @Override // X.TZC
    public final void v9(String str) {
    }

    @Override // X.TZC
    public final boolean BG() {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
        if (multiLiveAsAnchorListDialogV2 == null || !multiLiveAsAnchorListDialogV2.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31336CRo
    public final String getLogTag() {
        return VoiceChatAnchorWidget.class.getName();
    }

    @Override // X.TZC
    public final void gg0() {
        FragmentManager fragmentManager;
        LinkDialog linkDialog;
        LinkDialog linkDialog2 = this.LJLJJI;
        if (linkDialog2 != null) {
            linkDialog2.dismiss();
        }
        this.LJLJJI = C51029K0z.LJJIIJZLJL(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) != null && (linkDialog = this.LJLJJI) != null) {
            linkDialog.show(fragmentManager, "LinkDialog");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        InterfaceC75973Trl LLIIJI;
        this.LJLJJLL.k8();
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null) {
            LLIIJI.LJJIL((U4L) this.LJLJLJ.getValue());
        }
        ((C75395TiR) this.LJLJL.getValue()).LIZ();
        C74843TYx c74843TYx = this.LJLILLLLZI;
        if (c74843TYx != null) {
            c74843TYx.detachView();
        }
        LinkDialog linkDialog = this.LJLJJI;
        if (linkDialog != null) {
            linkDialog.dismiss();
        }
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
        if (multiLiveAsAnchorListDialogV2 != null) {
            C29306Beo.LJJJJ(multiLiveAsAnchorListDialogV2);
        }
        super.onDestroy();
    }

    public VoiceChatAnchorWidget() {
        TYN tyn = new TYN(true);
        C74650TRm.LIZ = true;
        this.LJLJJLL = tyn;
        this.LJLJL = C221108m2.LIZIZ(C75073TdF.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 157));
        C75559Tl5.LIZIZ.LJ(this);
    }

    @Override // X.TZC
    public final InterfaceC55235Lm3 linkScope() {
        View view = getView();
        if (!(view instanceof FrameLayout) || view == null) {
            return null;
        }
        return UC0.LJJIL(view);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        InterfaceC75973Trl LLIIJI;
        Room room;
        ViewGroup viewGroup;
        Boolean bool;
        TZC tzc;
        InterfaceC55235Lm3 linkScope;
        ILinkStateAbility iLinkStateAbility;
        super.onCreate();
        MultiGuestAnchorPanelTypeSetting.INSTANCE.setDisable();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            DataChannel dataChannel2 = this.dataChannel;
            o.LJIIIIZZ(dataChannel2, "dataChannel");
            C74843TYx c74843TYx = new C74843TYx(room, dataChannel2, this);
            this.LJLILLLLZI = c74843TYx;
            c74843TYx.attachView(this);
            View view = getView();
            if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
                InterfaceC55235Lm3 LJIILL = C44729Hgz.LJIILL(this);
                if (LJIILL != null) {
                    C44729Hgz.LIZ(LJIILL, true);
                }
                TYN tyn = this.LJLJJLL;
                DataChannel dataChannel3 = this.dataChannel;
                o.LJIIIIZZ(dataChannel3, "dataChannel");
                tyn.getClass();
                Fragment LJIIIZ = C79234V7u.LJIIIZ(viewGroup);
                boolean z = false;
                if (LJIIIZ != null) {
                    tyn.LJLILLLLZI = LJIIIZ;
                    C8VV.LIZ(LJIIIZ, false, new AqS57S0400000_12(LJIIIZ, dataChannel3, tyn, viewGroup, 17));
                }
                this.LJLJJLL.D5();
                C74843TYx c74843TYx2 = this.LJLILLLLZI;
                if (c74843TYx2 != null && (tzc = (TZC) c74843TYx2.mView) != null && (linkScope = tzc.linkScope()) != null && (iLinkStateAbility = (ILinkStateAbility) UC0.LJIIL(linkScope, ILinkStateAbility.class, null)) != null) {
                    c74843TYx2.subscribeStateChange(iLinkStateAbility);
                }
                C74843TYx c74843TYx3 = this.LJLILLLLZI;
                if (c74843TYx3 != null) {
                    DataChannel dataChannel4 = c74843TYx3.dataChannel;
                    if (dataChannel4 != null && (bool = (Boolean) dataChannel4.kv0(MuteMicChannel.class)) != null) {
                        z = bool.booleanValue();
                    }
                    c74843TYx3.LJJLI(z);
                }
            }
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.lv0(this, MultiLiveDialogBackEvent.class, new AqS179S0100000_13(this, 236));
            dataChannel5.mv0(AnchorOpenListDialogWithPositionEvent.class, this, new AqS179S0100000_13(this, 237));
            dataChannel5.mv0(ShowUserListDialog.class, this, new AqS179S0100000_13(this, 238));
            dataChannel5.lv0(this, PlayerPauseLiveForAnchorDialogEvent.class, new AqS179S0100000_13(this, 239));
            dataChannel5.lv0(this, AudioStateChangeEvent.class, new AqS179S0100000_13(this, 240));
            dataChannel5.lv0(this, FetchListByTypeErrorEvent.class, new AqS179S0100000_13(this, 241));
        }
        InterfaceC75441TjB R6 = C8E.LJ().R6();
        if (R6 != null && (LLIIJI = R6.LLIIJI()) != null) {
            LLIIJI.LJJIJL((U4L) this.LJLJLJ.getValue());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        C74843TYx c74843TYx = this.LJLILLLLZI;
        if (c74843TYx != null) {
            c74843TYx.onEnterBackground();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        InterfaceC74695TTf LLIIJLIL;
        InterfaceC74695TTf LLIIJLIL2;
        super.onResume();
        C74843TYx c74843TYx = this.LJLILLLLZI;
        if (c74843TYx != null) {
            c74843TYx.LJLJJL = Boolean.FALSE;
            InterfaceC75441TjB R6 = C8E.LJ().R6();
            if (R6 != null && (LLIIJLIL2 = R6.LLIIJLIL()) != null) {
                LLIIJLIL2.resume();
            }
            InterfaceC75441TjB R62 = C8E.LJ().R6();
            if (R62 != null && (LLIIJLIL = R62.LLIIJLIL()) != null) {
                LLIIJLIL.LJJIIZ("onEnterForeground");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.AbsVoiceChatWidget
    public final void LJZ(boolean z) {
        int i;
        DataChannel dataChannel;
        if (!isViewValid()) {
            return;
        }
        String LJ = C75457TjR.LJ(C74838TYs.LJ().LJJ);
        C32185Ck9 c32185Ck9 = (C32185Ck9) this.dataChannel.kv0(MultiGuestApplyNumChangedEvent.class);
        if (c32185Ck9 != null) {
            i = c32185Ck9.LJLILLLLZI;
        } else {
            i = 0;
        }
        C75457TjR.LJIJJ(i, "golive_window", LJ, "button_icon");
        C74843TYx c74843TYx = this.LJLILLLLZI;
        if (c74843TYx != null) {
            if (this.LJLJI == null) {
                Context context = this.context;
                o.LJIIIIZZ(context, "context");
                C74843TYx c74843TYx2 = this.LJLILLLLZI;
                if (c74843TYx2 != null) {
                    dataChannel = c74843TYx2.dataChannel;
                } else {
                    dataChannel = null;
                }
                this.LJLJI = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c74843TYx, 0);
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
            if (multiLiveAsAnchorListDialogV2 != null) {
                multiLiveAsAnchorListDialogV2.setOnDismissListener(new IDDListenerS152S0100000_13(this, 9));
            }
            MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LJLJI;
            if (multiLiveAsAnchorListDialogV22 != null) {
                LJZI(multiLiveAsAnchorListDialogV22);
            }
        }
    }

    public final void LJZL(String str) {
        if (MultiGuestAnchorPanelTypeSetting.INSTANCE.isInLabGroup() && str.length() > 0) {
            C74843TYx c74843TYx = this.LJLILLLLZI;
            if (c74843TYx != null) {
                c74843TYx.LJJL(str, null);
                return;
            }
            return;
        }
        C74843TYx c74843TYx2 = this.LJLILLLLZI;
        if (c74843TYx2 == null) {
            return;
        }
        c74843TYx2.LJJJJZI();
    }

    @Override // X.TZC
    public final void onPlayerListChange(List<LinkPlayerInfo> list) {
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2;
        MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22;
        if (this.isViewValid && (multiLiveAsAnchorListDialogV2 = this.LJLJI) != null && multiLiveAsAnchorListDialogV2.isShowing() && (multiLiveAsAnchorListDialogV22 = this.LJLJI) != null) {
            multiLiveAsAnchorListDialogV22.onPlayerListChange(list);
        }
    }

    @Override // X.TZC
    public final void tx(C74630TQs c74630TQs, Map<String, Boolean> map) {
        List<UserState> list;
        if (c74630TQs != null && (list = c74630TQs.LJLILLLLZI) != null) {
            int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
            if (LJJIIZ < 16) {
                LJJIIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
            for (UserState userState : list) {
                ((C75395TiR) this.LJLJL.getValue()).LIZJ(userState.networkState, userState.linkMicId);
                OSZ osz = new OSZ(userState.linkMicId, Integer.valueOf(userState.networkState));
                linkedHashMap.put(osz.getFirst(), osz.getSecond());
            }
            Map<String, Integer> LJJLIL = C113554cx.LJJLIL(linkedHashMap);
            TYN tyn = this.LJLJJLL;
            tyn.getClass();
            VoiceChatMaskAbility LIZ = tyn.LIZ();
            if (LIZ != null) {
                LIZ.jF(LJJLIL);
            }
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV2 != null) {
                    multiLiveAsAnchorListDialogV2.onEvent(new C75059Td1((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
            }
        }
    }

    @Override // X.TZC
    public final void tv(String str, String str2, List list) {
        C74843TYx c74843TYx;
        int i;
        DataChannel dataChannel;
        if (isViewValid() && (c74843TYx = this.LJLILLLLZI) != null) {
            MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
            if (multiGuestDataHolder != null) {
                C75072TdE c75072TdE = this.LJLJJL;
                if (c75072TdE != null) {
                    i = c75072TdE.LJLIL;
                } else {
                    i = -1;
                }
                multiGuestDataHolder.LJJIIZI = i;
                if (this.LJLJI == null) {
                    Context context = this.context;
                    o.LJIIIIZZ(context, "context");
                    C74843TYx c74843TYx2 = this.LJLILLLLZI;
                    if (c74843TYx2 != null) {
                        dataChannel = c74843TYx2.dataChannel;
                    } else {
                        dataChannel = null;
                    }
                    this.LJLJI = new MultiLiveAsAnchorListDialogV2(context, dataChannel, c74843TYx, 0);
                }
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV2 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV2 != null) {
                    multiLiveAsAnchorListDialogV2.setOnDismissListener(new IDDListenerS152S0100000_13(this, 25));
                }
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV22 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV22 != null) {
                    multiLiveAsAnchorListDialogV22.LJLJI(str);
                }
                MultiLiveAsAnchorListDialogV2 multiLiveAsAnchorListDialogV23 = this.LJLJI;
                if (multiLiveAsAnchorListDialogV23 != null) {
                    multiLiveAsAnchorListDialogV23.LLILLIZIL = str2;
                    LJZI(multiLiveAsAnchorListDialogV23);
                }
                this.LJLJJL = null;
                return;
            }
            o.LJIJI("dataHolder");
            throw null;
        }
    }
}
